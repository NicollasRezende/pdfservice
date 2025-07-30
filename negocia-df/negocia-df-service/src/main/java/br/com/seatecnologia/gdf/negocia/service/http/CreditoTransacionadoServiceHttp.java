/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.http;

import br.com.seatecnologia.gdf.negocia.service.CreditoTransacionadoServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>CreditoTransacionadoServiceUtil</code> service
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
public class CreditoTransacionadoServiceHttp {

	public static br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado
		addCreditoTransacionado(
			HttpPrincipal httpPrincipal, long creditoId, long propostaId,
			String numeroInscricao, String codigoReceita,
			java.util.Date dataInscricao, double valorAtualizado) {

		try {
			MethodKey methodKey = new MethodKey(
				CreditoTransacionadoServiceUtil.class,
				"addCreditoTransacionado",
				_addCreditoTransacionadoParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, creditoId, propostaId, numeroInscricao,
				codigoReceita, dataInscricao, valorAtualizado);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado
			updateCreditoTransacionado(
				HttpPrincipal httpPrincipal, long creditoId, long propostaId,
				String numeroInscricao, String codigoReceita,
				java.util.Date dataInscricao, double valorAtualizado)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CreditoTransacionadoServiceUtil.class,
				"updateCreditoTransacionado",
				_updateCreditoTransacionadoParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, creditoId, propostaId, numeroInscricao,
				codigoReceita, dataInscricao, valorAtualizado);

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

			return (br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado>
			getCreditoTransacionados(
				HttpPrincipal httpPrincipal, int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				CreditoTransacionadoServiceUtil.class,
				"getCreditoTransacionados",
				_getCreditoTransacionadosParameterTypes2);

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
				<br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		CreditoTransacionadoServiceHttp.class);

	private static final Class<?>[] _addCreditoTransacionadoParameterTypes0 =
		new Class[] {
			long.class, long.class, String.class, String.class,
			java.util.Date.class, double.class
		};
	private static final Class<?>[] _updateCreditoTransacionadoParameterTypes1 =
		new Class[] {
			long.class, long.class, String.class, String.class,
			java.util.Date.class, double.class
		};
	private static final Class<?>[] _getCreditoTransacionadosParameterTypes2 =
		new Class[] {int.class, int.class};

}