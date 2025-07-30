/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.http;

import br.com.seatecnologia.gdf.negocia.service.AdministradorJudicialServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>AdministradorJudicialServiceUtil</code> service
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
public class AdministradorJudicialServiceHttp {

	public static br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial
		addAdministradorJudicial(
			HttpPrincipal httpPrincipal,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long qualificacaoId, boolean regimeFalencia, String recuperacao,
			String numeroProcesso, long anexoRecuperacao) {

		try {
			MethodKey methodKey = new MethodKey(
				AdministradorJudicialServiceUtil.class,
				"addAdministradorJudicial",
				_addAdministradorJudicialParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, serviceContext, qualificacaoId, regimeFalencia,
				recuperacao, numeroProcesso, anexoRecuperacao);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.seatecnologia.gdf.negocia.model.
				AdministradorJudicial)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial
			updateAdministradorJudicial(
				HttpPrincipal httpPrincipal, long administradorJudicialId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext,
				long qualificacaoId, String tipoRegime, String numeroProcesso,
				String anexoAjuste)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				AdministradorJudicialServiceUtil.class,
				"updateAdministradorJudicial",
				_updateAdministradorJudicialParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, administradorJudicialId, serviceContext,
				qualificacaoId, tipoRegime, numeroProcesso, anexoAjuste);

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

			return (br.com.seatecnologia.gdf.negocia.model.
				AdministradorJudicial)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial>
			getAdministradorJudicials(
				HttpPrincipal httpPrincipal, int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				AdministradorJudicialServiceUtil.class,
				"getAdministradorJudicials",
				_getAdministradorJudicialsParameterTypes2);

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
				<br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		AdministradorJudicialServiceHttp.class);

	private static final Class<?>[] _addAdministradorJudicialParameterTypes0 =
		new Class[] {
			com.liferay.portal.kernel.service.ServiceContext.class, long.class,
			boolean.class, String.class, String.class, long.class
		};
	private static final Class<?>[]
		_updateAdministradorJudicialParameterTypes1 = new Class[] {
			long.class, com.liferay.portal.kernel.service.ServiceContext.class,
			long.class, String.class, String.class, String.class
		};
	private static final Class<?>[] _getAdministradorJudicialsParameterTypes2 =
		new Class[] {int.class, int.class};

}