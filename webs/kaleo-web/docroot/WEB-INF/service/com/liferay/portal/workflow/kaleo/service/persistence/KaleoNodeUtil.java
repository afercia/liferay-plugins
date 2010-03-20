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

package com.liferay.portal.workflow.kaleo.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.workflow.kaleo.model.KaleoNode;

import java.util.List;

/**
 * <a href="KaleoNodeUtil.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       KaleoNodePersistence
 * @see       KaleoNodePersistenceImpl
 * @generated
 */
public class KaleoNodeUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Object> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Object> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static KaleoNode remove(KaleoNode kaleoNode)
		throws SystemException {
		return getPersistence().remove(kaleoNode);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static KaleoNode update(KaleoNode kaleoNode, boolean merge)
		throws SystemException {
		return getPersistence().update(kaleoNode, merge);
	}

	public static void cacheResult(
		com.liferay.portal.workflow.kaleo.model.KaleoNode kaleoNode) {
		getPersistence().cacheResult(kaleoNode);
	}

	public static void cacheResult(
		java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNode> kaleoNodes) {
		getPersistence().cacheResult(kaleoNodes);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoNode create(
		long kaleoNodeId) {
		return getPersistence().create(kaleoNodeId);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoNode remove(
		long kaleoNodeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchNodeException {
		return getPersistence().remove(kaleoNodeId);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoNode updateImpl(
		com.liferay.portal.workflow.kaleo.model.KaleoNode kaleoNode,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(kaleoNode, merge);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoNode findByPrimaryKey(
		long kaleoNodeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchNodeException {
		return getPersistence().findByPrimaryKey(kaleoNodeId);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoNode fetchByPrimaryKey(
		long kaleoNodeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(kaleoNodeId);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNode> findByC_KDI(
		long companyId, long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_KDI(companyId, kaleoDefinitionId);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNode> findByC_KDI(
		long companyId, long kaleoDefinitionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_KDI(companyId, kaleoDefinitionId, start, end);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNode> findByC_KDI(
		long companyId, long kaleoDefinitionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_KDI(companyId, kaleoDefinitionId, start, end,
			orderByComparator);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoNode findByC_KDI_First(
		long companyId, long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchNodeException {
		return getPersistence()
				   .findByC_KDI_First(companyId, kaleoDefinitionId,
			orderByComparator);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoNode findByC_KDI_Last(
		long companyId, long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchNodeException {
		return getPersistence()
				   .findByC_KDI_Last(companyId, kaleoDefinitionId,
			orderByComparator);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoNode[] findByC_KDI_PrevAndNext(
		long kaleoNodeId, long companyId, long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchNodeException {
		return getPersistence()
				   .findByC_KDI_PrevAndNext(kaleoNodeId, companyId,
			kaleoDefinitionId, orderByComparator);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNode> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNode> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNode> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	public static void removeByC_KDI(long companyId, long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_KDI(companyId, kaleoDefinitionId);
	}

	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	public static int countByC_KDI(long companyId, long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_KDI(companyId, kaleoDefinitionId);
	}

	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoAction> getKaleoActions(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getKaleoActions(pk);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoAction> getKaleoActions(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getKaleoActions(pk, start, end);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoAction> getKaleoActions(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getKaleoActions(pk, start, end, orderByComparator);
	}

	public static int getKaleoActionsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getKaleoActionsSize(pk);
	}

	public static boolean containsKaleoAction(long pk, long kaleoActionPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsKaleoAction(pk, kaleoActionPK);
	}

	public static boolean containsKaleoActions(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsKaleoActions(pk);
	}

	public static KaleoNodePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (KaleoNodePersistence)PortletBeanLocatorUtil.locate(com.liferay.portal.workflow.kaleo.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					KaleoNodePersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(KaleoNodePersistence persistence) {
		_persistence = persistence;
	}

	private static KaleoNodePersistence _persistence;
}