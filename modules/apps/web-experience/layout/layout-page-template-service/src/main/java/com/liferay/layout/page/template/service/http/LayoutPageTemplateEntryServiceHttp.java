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

package com.liferay.layout.page.template.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.layout.page.template.service.LayoutPageTemplateEntryServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * {@link LayoutPageTemplateEntryServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * {@link HttpPrincipal} parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LayoutPageTemplateEntryServiceSoap
 * @see HttpPrincipal
 * @see LayoutPageTemplateEntryServiceUtil
 * @generated
 */
@ProviderType
public class LayoutPageTemplateEntryServiceHttp {
	public static com.liferay.layout.page.template.model.LayoutPageTemplateEntry addLayoutPageTemplateEntry(
		HttpPrincipal httpPrincipal, long groupId,
		long layoutPageTemplateFolderId, java.lang.String name,
		java.util.List<com.liferay.fragment.model.FragmentEntry> fragmentEntries,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(LayoutPageTemplateEntryServiceUtil.class,
					"addLayoutPageTemplateEntry",
					_addLayoutPageTemplateEntryParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					layoutPageTemplateFolderId, name, fragmentEntries,
					serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.layout.page.template.model.LayoutPageTemplateEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.layout.page.template.model.LayoutPageTemplateEntry> deleteLayoutPageTemplateEntries(
		HttpPrincipal httpPrincipal, long[] layoutPageTemplateEntryIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(LayoutPageTemplateEntryServiceUtil.class,
					"deleteLayoutPageTemplateEntries",
					_deleteLayoutPageTemplateEntriesParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					layoutPageTemplateEntryIds);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.layout.page.template.model.LayoutPageTemplateEntry deleteLayoutPageTemplateEntry(
		HttpPrincipal httpPrincipal, long layoutPageTemplateEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(LayoutPageTemplateEntryServiceUtil.class,
					"deleteLayoutPageTemplateEntry",
					_deleteLayoutPageTemplateEntryParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					layoutPageTemplateEntryId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.layout.page.template.model.LayoutPageTemplateEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.layout.page.template.model.LayoutPageTemplateEntry fetchLayoutPageTemplateEntry(
		HttpPrincipal httpPrincipal, long layoutPageTemplateEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(LayoutPageTemplateEntryServiceUtil.class,
					"fetchLayoutPageTemplateEntry",
					_fetchLayoutPageTemplateEntryParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					layoutPageTemplateEntryId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.layout.page.template.model.LayoutPageTemplateEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.layout.page.template.model.LayoutPageTemplateEntry> getLayoutPageTemplateEntries(
		HttpPrincipal httpPrincipal, long groupId,
		long layoutPageTemplateFolderId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(LayoutPageTemplateEntryServiceUtil.class,
					"getLayoutPageTemplateEntries",
					_getLayoutPageTemplateEntriesParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					layoutPageTemplateFolderId, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.layout.page.template.model.LayoutPageTemplateEntry> getLayoutPageTemplateEntries(
		HttpPrincipal httpPrincipal, long groupId,
		long layoutPageTemplateFolderId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry> orderByComparator)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(LayoutPageTemplateEntryServiceUtil.class,
					"getLayoutPageTemplateEntries",
					_getLayoutPageTemplateEntriesParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					layoutPageTemplateFolderId, start, end, orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.layout.page.template.model.LayoutPageTemplateEntry> getLayoutPageTemplateEntries(
		HttpPrincipal httpPrincipal, long groupId,
		long layoutPageTemplateFolderId, java.lang.String name, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry> orderByComparator) {
		try {
			MethodKey methodKey = new MethodKey(LayoutPageTemplateEntryServiceUtil.class,
					"getLayoutPageTemplateEntries",
					_getLayoutPageTemplateEntriesParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					layoutPageTemplateFolderId, name, start, end,
					orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int getLayoutPageTemplateFoldersCount(
		HttpPrincipal httpPrincipal, long groupId,
		long layoutPageTemplateFolderId) {
		try {
			MethodKey methodKey = new MethodKey(LayoutPageTemplateEntryServiceUtil.class,
					"getLayoutPageTemplateFoldersCount",
					_getLayoutPageTemplateFoldersCountParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					layoutPageTemplateFolderId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int getLayoutPageTemplateFoldersCount(
		HttpPrincipal httpPrincipal, long groupId,
		long layoutPageTemplateFolderId, java.lang.String name) {
		try {
			MethodKey methodKey = new MethodKey(LayoutPageTemplateEntryServiceUtil.class,
					"getLayoutPageTemplateFoldersCount",
					_getLayoutPageTemplateFoldersCountParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					layoutPageTemplateFolderId, name);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.layout.page.template.model.LayoutPageTemplateEntry updateLayoutPageTemplateEntry(
		HttpPrincipal httpPrincipal, long layoutPageTemplateEntryId,
		java.lang.String name,
		java.util.List<com.liferay.fragment.model.FragmentEntry> fragmentEntries,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(LayoutPageTemplateEntryServiceUtil.class,
					"updateLayoutPageTemplateEntry",
					_updateLayoutPageTemplateEntryParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					layoutPageTemplateEntryId, name, fragmentEntries,
					serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.layout.page.template.model.LayoutPageTemplateEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(LayoutPageTemplateEntryServiceHttp.class);
	private static final Class<?>[] _addLayoutPageTemplateEntryParameterTypes0 = new Class[] {
			long.class, long.class, java.lang.String.class, java.util.List.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteLayoutPageTemplateEntriesParameterTypes1 =
		new Class[] { long[].class };
	private static final Class<?>[] _deleteLayoutPageTemplateEntryParameterTypes2 =
		new Class[] { long.class };
	private static final Class<?>[] _fetchLayoutPageTemplateEntryParameterTypes3 =
		new Class[] { long.class };
	private static final Class<?>[] _getLayoutPageTemplateEntriesParameterTypes4 =
		new Class[] { long.class, long.class, int.class, int.class };
	private static final Class<?>[] _getLayoutPageTemplateEntriesParameterTypes5 =
		new Class[] {
			long.class, long.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getLayoutPageTemplateEntriesParameterTypes6 =
		new Class[] {
			long.class, long.class, java.lang.String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getLayoutPageTemplateFoldersCountParameterTypes7 =
		new Class[] { long.class, long.class };
	private static final Class<?>[] _getLayoutPageTemplateFoldersCountParameterTypes8 =
		new Class[] { long.class, long.class, java.lang.String.class };
	private static final Class<?>[] _updateLayoutPageTemplateEntryParameterTypes9 =
		new Class[] {
			long.class, java.lang.String.class, java.util.List.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
}