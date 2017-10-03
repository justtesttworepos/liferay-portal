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

package com.liferay.portal.kernel.util;

import com.liferay.portal.kernel.security.pacl.permission.PortalRuntimePermission;

/**
 * @author Brian Wing Shun Chan
 * @deprecated As of 7.0.0, with no direct replacement
 */
@Deprecated
public class HashCodeFactoryUtil {

	public static HashCode getHashCode() {
		return getHashCodeFactory().getHashCode();
	}

	public static HashCode getHashCode(
		int initialNonZeroOddNumber, int multiplierNonZeroOddNumber) {

		return getHashCodeFactory().getHashCode(
			initialNonZeroOddNumber, multiplierNonZeroOddNumber);
	}

	public static HashCodeFactory getHashCodeFactory() {
		PortalRuntimePermission.checkGetBeanProperty(HashCodeFactoryUtil.class);

		return _hashCodeFactory;
	}

	public void setHashCodeFactory(HashCodeFactory hashCodeFactory) {
		PortalRuntimePermission.checkSetBeanProperty(getClass());

		_hashCodeFactory = hashCodeFactory;
	}

	private static HashCodeFactory _hashCodeFactory;

}