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

package com.liferay.portal.workflow.kaleo.model.impl;

import com.liferay.portal.kernel.bean.ReadOnlyBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.workflow.kaleo.model.KaleoNotification;
import com.liferay.portal.workflow.kaleo.model.KaleoNotificationSoap;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <a href="KaleoNotificationModelImpl.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This interface is a model that represents the Kaleo_KaleoNotification table in the
 * database.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       KaleoNotificationImpl
 * @see       com.liferay.portal.workflow.kaleo.model.KaleoNotification
 * @see       com.liferay.portal.workflow.kaleo.model.KaleoNotificationModel
 * @generated
 */
public class KaleoNotificationModelImpl extends BaseModelImpl<KaleoNotification> {
	public static final String TABLE_NAME = "Kaleo_KaleoNotification";
	public static final Object[][] TABLE_COLUMNS = {
			{ "kaleoNotificationId", new Integer(Types.BIGINT) },
			{ "companyId", new Integer(Types.BIGINT) },
			{ "userId", new Integer(Types.BIGINT) },
			{ "userName", new Integer(Types.VARCHAR) },
			{ "createDate", new Integer(Types.TIMESTAMP) },
			{ "modifiedDate", new Integer(Types.TIMESTAMP) },
			{ "kaleoDefinitionId", new Integer(Types.BIGINT) },
			{ "kaleoNodeId", new Integer(Types.BIGINT) },
			{ "kaleoNodeName", new Integer(Types.VARCHAR) },
			{ "name", new Integer(Types.VARCHAR) },
			{ "description", new Integer(Types.VARCHAR) },
			{ "language", new Integer(Types.VARCHAR) },
			{ "template", new Integer(Types.CLOB) },
			{ "notificationTypes", new Integer(Types.VARCHAR) }
		};
	public static final String TABLE_SQL_CREATE = "create table Kaleo_KaleoNotification (kaleoNotificationId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(200) null,createDate DATE null,modifiedDate DATE null,kaleoDefinitionId LONG,kaleoNodeId LONG,kaleoNodeName VARCHAR(200) null,name VARCHAR(200) null,description VARCHAR(2000) null,language VARCHAR(20) null,template TEXT null,notificationTypes VARCHAR(200) null)";
	public static final String TABLE_SQL_DROP = "drop table Kaleo_KaleoNotification";
	public static final String ORDER_BY_JPQL = " ORDER BY kaleoNotification.kaleoNotificationId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Kaleo_KaleoNotification.kaleoNotificationId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoNotification"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoNotification"),
			true);

	public static KaleoNotification toModel(KaleoNotificationSoap soapModel) {
		KaleoNotification model = new KaleoNotificationImpl();

		model.setKaleoNotificationId(soapModel.getKaleoNotificationId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setKaleoDefinitionId(soapModel.getKaleoDefinitionId());
		model.setKaleoNodeId(soapModel.getKaleoNodeId());
		model.setKaleoNodeName(soapModel.getKaleoNodeName());
		model.setName(soapModel.getName());
		model.setDescription(soapModel.getDescription());
		model.setLanguage(soapModel.getLanguage());
		model.setTemplate(soapModel.getTemplate());
		model.setNotificationTypes(soapModel.getNotificationTypes());

		return model;
	}

	public static List<KaleoNotification> toModels(
		KaleoNotificationSoap[] soapModels) {
		List<KaleoNotification> models = new ArrayList<KaleoNotification>(soapModels.length);

		for (KaleoNotificationSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.portal.workflow.kaleo.model.KaleoNotification"));

	public KaleoNotificationModelImpl() {
	}

	public long getPrimaryKey() {
		return _kaleoNotificationId;
	}

	public void setPrimaryKey(long pk) {
		setKaleoNotificationId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_kaleoNotificationId);
	}

	public long getKaleoNotificationId() {
		return _kaleoNotificationId;
	}

	public void setKaleoNotificationId(long kaleoNotificationId) {
		_kaleoNotificationId = kaleoNotificationId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getKaleoDefinitionId() {
		return _kaleoDefinitionId;
	}

	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_kaleoDefinitionId = kaleoDefinitionId;
	}

	public long getKaleoNodeId() {
		return _kaleoNodeId;
	}

	public void setKaleoNodeId(long kaleoNodeId) {
		_kaleoNodeId = kaleoNodeId;
	}

	public String getKaleoNodeName() {
		if (_kaleoNodeName == null) {
			return StringPool.BLANK;
		}
		else {
			return _kaleoNodeName;
		}
	}

	public void setKaleoNodeName(String kaleoNodeName) {
		_kaleoNodeName = kaleoNodeName;
	}

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getLanguage() {
		if (_language == null) {
			return StringPool.BLANK;
		}
		else {
			return _language;
		}
	}

	public void setLanguage(String language) {
		_language = language;
	}

	public String getTemplate() {
		if (_template == null) {
			return StringPool.BLANK;
		}
		else {
			return _template;
		}
	}

	public void setTemplate(String template) {
		_template = template;
	}

	public String getNotificationTypes() {
		if (_notificationTypes == null) {
			return StringPool.BLANK;
		}
		else {
			return _notificationTypes;
		}
	}

	public void setNotificationTypes(String notificationTypes) {
		_notificationTypes = notificationTypes;
	}

	public KaleoNotification toEscapedModel() {
		if (isEscapedModel()) {
			return (KaleoNotification)this;
		}
		else {
			KaleoNotification model = new KaleoNotificationImpl();

			model.setNew(isNew());
			model.setEscapedModel(true);

			model.setKaleoNotificationId(getKaleoNotificationId());
			model.setCompanyId(getCompanyId());
			model.setUserId(getUserId());
			model.setUserName(HtmlUtil.escape(getUserName()));
			model.setCreateDate(getCreateDate());
			model.setModifiedDate(getModifiedDate());
			model.setKaleoDefinitionId(getKaleoDefinitionId());
			model.setKaleoNodeId(getKaleoNodeId());
			model.setKaleoNodeName(HtmlUtil.escape(getKaleoNodeName()));
			model.setName(HtmlUtil.escape(getName()));
			model.setDescription(HtmlUtil.escape(getDescription()));
			model.setLanguage(HtmlUtil.escape(getLanguage()));
			model.setTemplate(HtmlUtil.escape(getTemplate()));
			model.setNotificationTypes(HtmlUtil.escape(getNotificationTypes()));

			model = (KaleoNotification)Proxy.newProxyInstance(KaleoNotification.class.getClassLoader(),
					new Class[] { KaleoNotification.class },
					new ReadOnlyBeanHandler(model));

			return model;
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					KaleoNotification.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		KaleoNotificationImpl clone = new KaleoNotificationImpl();

		clone.setKaleoNotificationId(getKaleoNotificationId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setKaleoDefinitionId(getKaleoDefinitionId());
		clone.setKaleoNodeId(getKaleoNodeId());
		clone.setKaleoNodeName(getKaleoNodeName());
		clone.setName(getName());
		clone.setDescription(getDescription());
		clone.setLanguage(getLanguage());
		clone.setTemplate(getTemplate());
		clone.setNotificationTypes(getNotificationTypes());

		return clone;
	}

	public int compareTo(KaleoNotification kaleoNotification) {
		int value = 0;

		if (getKaleoNotificationId() < kaleoNotification.getKaleoNotificationId()) {
			value = -1;
		}
		else if (getKaleoNotificationId() > kaleoNotification.getKaleoNotificationId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		KaleoNotification kaleoNotification = null;

		try {
			kaleoNotification = (KaleoNotification)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = kaleoNotification.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{kaleoNotificationId=");
		sb.append(getKaleoNotificationId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", kaleoDefinitionId=");
		sb.append(getKaleoDefinitionId());
		sb.append(", kaleoNodeId=");
		sb.append(getKaleoNodeId());
		sb.append(", kaleoNodeName=");
		sb.append(getKaleoNodeName());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", template=");
		sb.append(getTemplate());
		sb.append(", notificationTypes=");
		sb.append(getNotificationTypes());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.workflow.kaleo.model.KaleoNotification");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>kaleoNotificationId</column-name><column-value><![CDATA[");
		sb.append(getKaleoNotificationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoDefinitionId</column-name><column-value><![CDATA[");
		sb.append(getKaleoDefinitionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoNodeId</column-name><column-value><![CDATA[");
		sb.append(getKaleoNodeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoNodeName</column-name><column-value><![CDATA[");
		sb.append(getKaleoNodeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>template</column-name><column-value><![CDATA[");
		sb.append(getTemplate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>notificationTypes</column-name><column-value><![CDATA[");
		sb.append(getNotificationTypes());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _kaleoNotificationId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _kaleoDefinitionId;
	private long _kaleoNodeId;
	private String _kaleoNodeName;
	private String _name;
	private String _description;
	private String _language;
	private String _template;
	private String _notificationTypes;
	private transient ExpandoBridge _expandoBridge;
}