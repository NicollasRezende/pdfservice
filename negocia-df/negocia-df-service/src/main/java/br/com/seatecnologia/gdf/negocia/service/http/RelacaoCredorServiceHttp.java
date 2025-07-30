/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.http;

import br.com.seatecnologia.gdf.negocia.service.RelacaoCredorServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>RelacaoCredorServiceUtil</code> service
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
public class RelacaoCredorServiceHttp {

	public static br.com.seatecnologia.gdf.negocia.model.RelacaoCredor
		addRelacaoCredor(
			HttpPrincipal httpPrincipal,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long propostaId, String nomeCredor, String naturezaCredito,
			String classificacaoCredito, double valorAtualizado,
			String referenciaContabil) {

		try {
			MethodKey methodKey = new MethodKey(
				RelacaoCredorServiceUtil.class, "addRelacaoCredor",
				_addRelacaoCredorParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, serviceContext, propostaId, nomeCredor,
				naturezaCredito, classificacaoCredito, valorAtualizado,
				referenciaContabil);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.seatecnologia.gdf.negocia.model.RelacaoCredor)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.seatecnologia.gdf.negocia.model.RelacaoCredor
		updateRelacaoCredor(
			HttpPrincipal httpPrincipal, long credorId, long propostaId,
			String nomeCredor, String naturezaCredito,
			String classificacaoCredito, double valorAtualizado,
			String referenciaRegistro) {

		try {
			MethodKey methodKey = new MethodKey(
				RelacaoCredorServiceUtil.class, "updateRelacaoCredor",
				_updateRelacaoCredorParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, credorId, propostaId, nomeCredor, naturezaCredito,
				classificacaoCredito, valorAtualizado, referenciaRegistro);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.seatecnologia.gdf.negocia.model.RelacaoCredor)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<br.com.seatecnologia.gdf.negocia.model.RelacaoCredor> getRelacaoCredor(
			HttpPrincipal httpPrincipal, int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				RelacaoCredorServiceUtil.class, "getRelacaoCredor",
				_getRelacaoCredorParameterTypes2);

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
				<br.com.seatecnologia.gdf.negocia.model.RelacaoCredor>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		RelacaoCredorServiceHttp.class);

	private static final Class<?>[] _addRelacaoCredorParameterTypes0 =
		new Class[] {
			com.liferay.portal.kernel.service.ServiceContext.class, long.class,
			String.class, String.class, String.class, double.class, String.class
		};
	private static final Class<?>[] _updateRelacaoCredorParameterTypes1 =
		new Class[] {
			long.class, long.class, String.class, String.class, String.class,
			double.class, String.class
		};
	private static final Class<?>[] _getRelacaoCredorParameterTypes2 =
		new Class[] {int.class, int.class};

}