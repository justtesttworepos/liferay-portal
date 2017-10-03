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

package com.liferay.invitation.invite.members.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MemberRequest service. Represents a row in the &quot;IM_MemberRequest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.invitation.invite.members.model.impl.MemberRequestModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.invitation.invite.members.model.impl.MemberRequestImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MemberRequest
 * @see com.liferay.invitation.invite.members.model.impl.MemberRequestImpl
 * @see com.liferay.invitation.invite.members.model.impl.MemberRequestModelImpl
 * @generated
 */
@ProviderType
public interface MemberRequestModel extends BaseModel<MemberRequest>,
	GroupedModel, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a member request model instance should use the {@link MemberRequest} interface instead.
	 */

	/**
	 * Returns the primary key of this member request.
	 *
	 * @return the primary key of this member request
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this member request.
	 *
	 * @param primaryKey the primary key of this member request
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the member request ID of this member request.
	 *
	 * @return the member request ID of this member request
	 */
	public long getMemberRequestId();

	/**
	 * Sets the member request ID of this member request.
	 *
	 * @param memberRequestId the member request ID of this member request
	 */
	public void setMemberRequestId(long memberRequestId);

	/**
	 * Returns the group ID of this member request.
	 *
	 * @return the group ID of this member request
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this member request.
	 *
	 * @param groupId the group ID of this member request
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this member request.
	 *
	 * @return the company ID of this member request
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this member request.
	 *
	 * @param companyId the company ID of this member request
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this member request.
	 *
	 * @return the user ID of this member request
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this member request.
	 *
	 * @param userId the user ID of this member request
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this member request.
	 *
	 * @return the user uuid of this member request
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this member request.
	 *
	 * @param userUuid the user uuid of this member request
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this member request.
	 *
	 * @return the user name of this member request
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this member request.
	 *
	 * @param userName the user name of this member request
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this member request.
	 *
	 * @return the create date of this member request
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this member request.
	 *
	 * @param createDate the create date of this member request
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this member request.
	 *
	 * @return the modified date of this member request
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this member request.
	 *
	 * @param modifiedDate the modified date of this member request
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the key of this member request.
	 *
	 * @return the key of this member request
	 */
	@AutoEscape
	public String getKey();

	/**
	 * Sets the key of this member request.
	 *
	 * @param key the key of this member request
	 */
	public void setKey(String key);

	/**
	 * Returns the receiver user ID of this member request.
	 *
	 * @return the receiver user ID of this member request
	 */
	public long getReceiverUserId();

	/**
	 * Sets the receiver user ID of this member request.
	 *
	 * @param receiverUserId the receiver user ID of this member request
	 */
	public void setReceiverUserId(long receiverUserId);

	/**
	 * Returns the receiver user uuid of this member request.
	 *
	 * @return the receiver user uuid of this member request
	 */
	public String getReceiverUserUuid();

	/**
	 * Sets the receiver user uuid of this member request.
	 *
	 * @param receiverUserUuid the receiver user uuid of this member request
	 */
	public void setReceiverUserUuid(String receiverUserUuid);

	/**
	 * Returns the invited role ID of this member request.
	 *
	 * @return the invited role ID of this member request
	 */
	public long getInvitedRoleId();

	/**
	 * Sets the invited role ID of this member request.
	 *
	 * @param invitedRoleId the invited role ID of this member request
	 */
	public void setInvitedRoleId(long invitedRoleId);

	/**
	 * Returns the invited team ID of this member request.
	 *
	 * @return the invited team ID of this member request
	 */
	public long getInvitedTeamId();

	/**
	 * Sets the invited team ID of this member request.
	 *
	 * @param invitedTeamId the invited team ID of this member request
	 */
	public void setInvitedTeamId(long invitedTeamId);

	/**
	 * Returns the status of this member request.
	 *
	 * @return the status of this member request
	 */
	public int getStatus();

	/**
	 * Sets the status of this member request.
	 *
	 * @param status the status of this member request
	 */
	public void setStatus(int status);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(MemberRequest memberRequest);

	@Override
	public int hashCode();

	@Override
	public CacheModel<MemberRequest> toCacheModel();

	@Override
	public MemberRequest toEscapedModel();

	@Override
	public MemberRequest toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}