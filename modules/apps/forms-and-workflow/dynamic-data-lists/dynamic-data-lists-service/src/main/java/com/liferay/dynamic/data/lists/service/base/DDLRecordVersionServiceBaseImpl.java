/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.dynamic.data.lists.service.base;

import com.liferay.dynamic.data.lists.model.DDLRecordVersion;
import com.liferay.dynamic.data.lists.service.DDLRecordVersionService;
import com.liferay.dynamic.data.lists.service.persistence.DDLRecordVersionPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the ddl record version remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.dynamic.data.lists.service.impl.DDLRecordVersionServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.dynamic.data.lists.service.impl.DDLRecordVersionServiceImpl
 * @see com.liferay.dynamic.data.lists.service.DDLRecordVersionServiceUtil
 * @generated
 */
public abstract class DDLRecordVersionServiceBaseImpl extends BaseServiceImpl
	implements DDLRecordVersionService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.dynamic.data.lists.service.DDLRecordVersionServiceUtil} to access the ddl record version remote service.
	 */

	/**
	 * Returns the ddl record version local service.
	 *
	 * @return the ddl record version local service
	 */
	public com.liferay.dynamic.data.lists.service.DDLRecordVersionLocalService getDDLRecordVersionLocalService() {
		return ddlRecordVersionLocalService;
	}

	/**
	 * Sets the ddl record version local service.
	 *
	 * @param ddlRecordVersionLocalService the ddl record version local service
	 */
	public void setDDLRecordVersionLocalService(
		com.liferay.dynamic.data.lists.service.DDLRecordVersionLocalService ddlRecordVersionLocalService) {
		this.ddlRecordVersionLocalService = ddlRecordVersionLocalService;
	}

	/**
	 * Returns the ddl record version remote service.
	 *
	 * @return the ddl record version remote service
	 */
	public DDLRecordVersionService getDDLRecordVersionService() {
		return ddlRecordVersionService;
	}

	/**
	 * Sets the ddl record version remote service.
	 *
	 * @param ddlRecordVersionService the ddl record version remote service
	 */
	public void setDDLRecordVersionService(
		DDLRecordVersionService ddlRecordVersionService) {
		this.ddlRecordVersionService = ddlRecordVersionService;
	}

	/**
	 * Returns the ddl record version persistence.
	 *
	 * @return the ddl record version persistence
	 */
	public DDLRecordVersionPersistence getDDLRecordVersionPersistence() {
		return ddlRecordVersionPersistence;
	}

	/**
	 * Sets the ddl record version persistence.
	 *
	 * @param ddlRecordVersionPersistence the ddl record version persistence
	 */
	public void setDDLRecordVersionPersistence(
		DDLRecordVersionPersistence ddlRecordVersionPersistence) {
		this.ddlRecordVersionPersistence = ddlRecordVersionPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return DDLRecordVersionService.class.getName();
	}

	protected Class<?> getModelClass() {
		return DDLRecordVersion.class;
	}

	protected String getModelClassName() {
		return DDLRecordVersion.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = ddlRecordVersionPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.dynamic.data.lists.service.DDLRecordVersionLocalService.class)
	protected com.liferay.dynamic.data.lists.service.DDLRecordVersionLocalService ddlRecordVersionLocalService;
	@BeanReference(type = DDLRecordVersionService.class)
	protected DDLRecordVersionService ddlRecordVersionService;
	@BeanReference(type = DDLRecordVersionPersistence.class)
	protected DDLRecordVersionPersistence ddlRecordVersionPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
}