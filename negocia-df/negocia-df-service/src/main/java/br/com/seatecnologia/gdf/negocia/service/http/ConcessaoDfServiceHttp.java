/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.http;

import br.com.seatecnologia.gdf.negocia.service.ConcessaoDfServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>ConcessaoDfServiceUtil</code> service
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
public class ConcessaoDfServiceHttp {

	public static br.com.seatecnologia.gdf.negocia.model.ConcessaoDf
		addConcessaoDf(
			HttpPrincipal httpPrincipal, long concessaoId, long propostaId,
			double percentualDescontoJuros, double percentualDescontoPrincipal,
			String observacoes) {

		try {
			MethodKey methodKey = new MethodKey(
				ConcessaoDfServiceUtil.class, "addConcessaoDf",
				_addConcessaoDfParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, concessaoId, propostaId, percentualDescontoJuros,
				percentualDescontoPrincipal, observacoes);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.seatecnologia.gdf.negocia.model.ConcessaoDf)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.seatecnologia.gdf.negocia.model.ConcessaoDf
			updateConcessaoDf(
				HttpPrincipal httpPrincipal, long concessaoId, long propostaId,
				double percentualDescontoJuros,
				double percentualDescontoPrincipal, String observacoes)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				ConcessaoDfServiceUtil.class, "updateConcessaoDf",
				_updateConcessaoDfParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, concessaoId, propostaId, percentualDescontoJuros,
				percentualDescontoPrincipal, observacoes);

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

			return (br.com.seatecnologia.gdf.negocia.model.ConcessaoDf)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<br.com.seatecnologia.gdf.negocia.model.ConcessaoDf> getConcessaoDfs(
			HttpPrincipal httpPrincipal, int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				ConcessaoDfServiceUtil.class, "getConcessaoDfs",
				_getConcessaoDfsParameterTypes2);

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
				<br.com.seatecnologia.gdf.negocia.model.ConcessaoDf>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		ConcessaoDfServiceHttp.class);

	private static final Class<?>[] _addConcessaoDfParameterTypes0 =
		new Class[] {
			long.class, long.class, double.class, double.class, String.class
		};
	private static final Class<?>[] _updateConcessaoDfParameterTypes1 =
		new Class[] {
			long.class, long.class, double.class, double.class, String.class
		};
	private static final Class<?>[] _getConcessaoDfsParameterTypes2 =
		new Class[] {int.class, int.class};

}