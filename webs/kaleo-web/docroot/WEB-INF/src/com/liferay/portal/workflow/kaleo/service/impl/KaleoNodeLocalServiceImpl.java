/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.workflow.kaleo.definition.Action;
import com.liferay.portal.workflow.kaleo.definition.Node;
import com.liferay.portal.workflow.kaleo.definition.NodeType;
import com.liferay.portal.workflow.kaleo.definition.Notification;
import com.liferay.portal.workflow.kaleo.definition.State;
import com.liferay.portal.workflow.kaleo.model.KaleoNode;
import com.liferay.portal.workflow.kaleo.service.base.KaleoNodeLocalServiceBaseImpl;

import java.util.Date;
import java.util.Set;

/**
 * <a href="KaleoNodeLocalServiceImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 */
public class KaleoNodeLocalServiceImpl extends KaleoNodeLocalServiceBaseImpl {

	public KaleoNode addKaleoNode(
			long kaleoDefinitionId, Node node, ServiceContext serviceContext)
		throws PortalException, SystemException {

		// Kaleo node

		User user = userPersistence.findByPrimaryKey(
			serviceContext.getUserId());
		Date now = new Date();

		long kaleoNodeId = counterLocalService.increment();

		KaleoNode kaleoNode = kaleoNodePersistence.create(kaleoNodeId);

		kaleoNode.setCompanyId(user.getCompanyId());
		kaleoNode.setUserId(user.getUserId());
		kaleoNode.setUserName(user.getFullName());
		kaleoNode.setCreateDate(now);
		kaleoNode.setModifiedDate(now);
		kaleoNode.setKaleoDefinitionId(kaleoDefinitionId);
		kaleoNode.setName(node.getName());
		kaleoNode.setDescription(node.getDescription());
		kaleoNode.setType(node.getNodeType().name());

		boolean initial = false;
		boolean terminal = false;

		NodeType nodeType = node.getNodeType();

		if (nodeType.equals(NodeType.STATE)) {
			State state = (State)node;

			initial = state.isInitial();
			terminal = state.isTerminal();
		}

		kaleoNode.setInitial(initial);
		kaleoNode.setTerminal(terminal);

		kaleoNodePersistence.update(kaleoNode, false);

		// Kaleo actions

		Set<Action> actions = node.getActions();

		for (Action action : actions) {
			kaleoActionLocalService.addKaleoAction(
				kaleoDefinitionId, kaleoNodeId, node.getName(), action,
				serviceContext);
		}

		Set<Notification> notifications = node.getNotifications();

		for (Notification notification : notifications) {
			kaleoNotificationLocalService.addKaleoNotification(
				kaleoDefinitionId, kaleoNodeId, node.getName(), notification,
				serviceContext);
		}

		return kaleoNode;
	}

}