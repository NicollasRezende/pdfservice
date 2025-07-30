/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.http;

import br.com.seatecnologia.gdf.negocia.service.DemonstracaoContabilServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>DemonstracaoContabilServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
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
 * @generated
 */
public class DemonstracaoContabilServiceHttp {

	public static br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil
		addDemonstracaoContabil(
			HttpPrincipal httpPrincipal,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long propostaId, long fileEntryId, int tipoDocumento) {

		try {
			MethodKey methodKey = new MethodKey(
				DemonstracaoContabilServiceUtil.class,
				"addDemonstracaoContabil",
				_addDemonstracaoContabilParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, serviceContext, propostaId, fileEntryId,
				tipoDocumento);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil
			updateDemonstracaoContabil(
				HttpPrincipal httpPrincipal, long demonstracaoId,
				long propostaId, String tipoDemonstracao, long fileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				DemonstracaoContabilServiceUtil.class,
				"updateDemonstracaoContabil",
				_updateDemonstracaoContabilParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, demonstracaoId, propostaId, tipoDemonstracao,
				fileEntryId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil>
			getDemonstracaoContabils(
				HttpPrincipal httpPrincipal, int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				DemonstracaoContabilServiceUtil.class,
				"getDemonstracaoContabils",
				_getDemonstracaoContabilsParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		DemonstracaoContabilServiceHttp.class);

	private static final Class<?>[] _addDemonstracaoContabilParameterTypes0 =
		new Class[] {
			com.liferay.portal.kernel.service.ServiceContext.class, long.class,
			long.class, int.class
		};
	private static final Class<?>[] _updateDemonstracaoContabilParameterTypes1 =
		new Class[] {long.class, long.class, String.class, long.class};
	private static final Class<?>[] _getDemonstracaoContabilsParameterTypes2 =
		new Class[] {int.class, int.class};

}