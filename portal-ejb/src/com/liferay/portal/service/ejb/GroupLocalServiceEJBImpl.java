/**
 * Copyright (c) 2000-2006 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.service.ejb;

import com.liferay.portal.service.GroupLocalService;
import com.liferay.portal.service.GroupLocalServiceFactory;

import javax.ejb.CreateException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

/**
 * <a href="GroupLocalServiceEJBImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author  Brian Wing Shun Chan
 *
 */
public class GroupLocalServiceEJBImpl implements GroupLocalService, SessionBean {
	public com.liferay.portal.model.Group addGroup(java.lang.String userId,
		java.lang.String className, java.lang.String classPK,
		java.lang.String name, java.lang.String description,
		java.lang.String type, java.lang.String friendlyURL)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		return GroupLocalServiceFactory.getTxImpl().addGroup(userId, className,
			classPK, name, description, type, friendlyURL);
	}

	public void addRoleGroups(java.lang.String roleId, long[] groupIds)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		GroupLocalServiceFactory.getTxImpl().addRoleGroups(roleId, groupIds);
	}

	public void checkSystemGroups(java.lang.String companyId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		GroupLocalServiceFactory.getTxImpl().checkSystemGroups(companyId);
	}

	public void deleteGroup(long groupId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		GroupLocalServiceFactory.getTxImpl().deleteGroup(groupId);
	}

	public com.liferay.portal.model.Group getFriendlyURLGroup(
		java.lang.String companyId, java.lang.String friendlyURL)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		return GroupLocalServiceFactory.getTxImpl().getFriendlyURLGroup(companyId,
			friendlyURL);
	}

	public com.liferay.portal.model.Group getGroup(long groupId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		return GroupLocalServiceFactory.getTxImpl().getGroup(groupId);
	}

	public com.liferay.portal.model.Group getGroup(java.lang.String companyId,
		java.lang.String name)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		return GroupLocalServiceFactory.getTxImpl().getGroup(companyId, name);
	}

	public com.liferay.portal.model.Group getOrganizationGroup(
		java.lang.String companyId, java.lang.String organizationId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		return GroupLocalServiceFactory.getTxImpl().getOrganizationGroup(companyId,
			organizationId);
	}

	public java.util.List getOrganizationsGroups(java.util.List organizations)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		return GroupLocalServiceFactory.getTxImpl().getOrganizationsGroups(organizations);
	}

	public java.util.List getRoleGroups(java.lang.String roleId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		return GroupLocalServiceFactory.getTxImpl().getRoleGroups(roleId);
	}

	public com.liferay.portal.model.Group getUserGroup(
		java.lang.String companyId, java.lang.String userId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		return GroupLocalServiceFactory.getTxImpl().getUserGroup(companyId,
			userId);
	}

	public com.liferay.portal.model.Group getUserGroupGroup(
		java.lang.String companyId, java.lang.String userGroupId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		return GroupLocalServiceFactory.getTxImpl().getUserGroupGroup(companyId,
			userGroupId);
	}

	public java.util.List getUserGroupsGroups(java.util.List userGroups)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		return GroupLocalServiceFactory.getTxImpl().getUserGroupsGroups(userGroups);
	}

	public boolean hasRoleGroup(java.lang.String roleId, long groupId)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		return GroupLocalServiceFactory.getTxImpl().hasRoleGroup(roleId, groupId);
	}

	public boolean hasUserGroup(java.lang.String userId, long groupId)
		throws com.liferay.portal.SystemException {
		return GroupLocalServiceFactory.getTxImpl().hasUserGroup(userId, groupId);
	}

	public java.util.List search(java.lang.String companyId,
		java.lang.String name, java.lang.String description,
		java.util.LinkedHashMap params, int begin, int end)
		throws com.liferay.portal.SystemException {
		return GroupLocalServiceFactory.getTxImpl().search(companyId, name,
			description, params, begin, end);
	}

	public int searchCount(java.lang.String companyId, java.lang.String name,
		java.lang.String description, java.util.LinkedHashMap params)
		throws com.liferay.portal.SystemException {
		return GroupLocalServiceFactory.getTxImpl().searchCount(companyId,
			name, description, params);
	}

	public void setRoleGroups(java.lang.String roleId, long[] groupIds)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		GroupLocalServiceFactory.getTxImpl().setRoleGroups(roleId, groupIds);
	}

	public void unsetRoleGroups(java.lang.String roleId, long[] groupIds)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		GroupLocalServiceFactory.getTxImpl().unsetRoleGroups(roleId, groupIds);
	}

	public com.liferay.portal.model.Group updateGroup(long groupId,
		java.lang.String name, java.lang.String description,
		java.lang.String type, java.lang.String friendlyURL)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		return GroupLocalServiceFactory.getTxImpl().updateGroup(groupId, name,
			description, type, friendlyURL);
	}

	public void ejbCreate() throws CreateException {
	}

	public void ejbRemove() {
	}

	public void ejbActivate() {
	}

	public void ejbPassivate() {
	}

	public SessionContext getSessionContext() {
		return _sc;
	}

	public void setSessionContext(SessionContext sc) {
		_sc = sc;
	}

	private SessionContext _sc;
}