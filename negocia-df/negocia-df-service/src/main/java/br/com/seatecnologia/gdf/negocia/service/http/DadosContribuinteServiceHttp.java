/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.http;

import br.com.seatecnologia.gdf.negocia.service.DadosContribuinteServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>DadosContribuinteServiceUtil</code> service
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
public class DadosContribuinteServiceHttp {

	public static br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
		addDadosContribuinte(
			HttpPrincipal httpPrincipal,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long qualificacaoId, long propostaId) {

		try {
			MethodKey methodKey = new MethodKey(
				DadosContribuinteServiceUtil.class, "addDadosContribuinte",
				_addDadosContribuinteParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, serviceContext, qualificacaoId, propostaId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.seatecnologia.gdf.negocia.model.DadosContribuinte)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
			updateDadosContribuinte(
				HttpPrincipal httpPrincipal, long dadosContribuinteId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext,
				long qualificacaoId, long socios, long controladores,
				long administradores, long gestores, long empresasGrupo)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				DadosContribuinteServiceUtil.class, "updateDadosContribuinte",
				_updateDadosContribuinteParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, dadosContribuinteId, serviceContext, qualificacaoId,
				socios, controladores, administradores, gestores,
				empresasGrupo);

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

			return (br.com.seatecnologia.gdf.negocia.model.DadosContribuinte)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<br.com.seatecnologia.gdf.negocia.model.DadosContribuinte>
			getDadosContribuintes(
				HttpPrincipal httpPrincipal, int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				DadosContribuinteServiceUtil.class, "getDadosContribuintes",
				_getDadosContribuintesParameterTypes2);

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
				<br.com.seatecnologia.gdf.negocia.model.DadosContribuinte>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		DadosContribuinteServiceHttp.class);

	private static final Class<?>[] _addDadosContribuinteParameterTypes0 =
		new Class[] {
			com.liferay.portal.kernel.service.ServiceContext.class, long.class,
			long.class
		};
	private static final Class<?>[] _updateDadosContribuinteParameterTypes1 =
		new Class[] {
			long.class, com.liferay.portal.kernel.service.ServiceContext.class,
			long.class, long.class, long.class, long.class, long.class,
			long.class
		};
	private static final Class<?>[] _getDadosContribuintesParameterTypes2 =
		new Class[] {int.class, int.class};

}