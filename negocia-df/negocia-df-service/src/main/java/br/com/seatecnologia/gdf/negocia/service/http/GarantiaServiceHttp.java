/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.http;

import br.com.seatecnologia.gdf.negocia.service.GarantiaServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>GarantiaServiceUtil</code> service
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
public class GarantiaServiceHttp {

	public static br.com.seatecnologia.gdf.negocia.model.Garantia addGarantia(
		HttpPrincipal httpPrincipal,
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		String tipoGarantia, String tipoDevedor, String outras,
		long proprietarioQualificacaoId, double valorEstimado,
		long dadosRegistroId, String localizacao, boolean declaracaoAnuencia,
		long declaracao, String descricaoBem, long propostaId) {

		try {
			MethodKey methodKey = new MethodKey(
				GarantiaServiceUtil.class, "addGarantia",
				_addGarantiaParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, serviceContext, tipoGarantia, tipoDevedor, outras,
				proprietarioQualificacaoId, valorEstimado, dadosRegistroId,
				localizacao, declaracaoAnuencia, declaracao, descricaoBem,
				propostaId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.seatecnologia.gdf.negocia.model.Garantia)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.seatecnologia.gdf.negocia.model.Garantia
			updateGarantia(
				HttpPrincipal httpPrincipal, long garantiaId, long propostaId,
				String tipoGarantia, String descricaoBem, String proprietario,
				double valorEstimado, String dadosRegistro, String localizacao,
				boolean anuenciaTerceiro, long documentoAnuencia)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				GarantiaServiceUtil.class, "updateGarantia",
				_updateGarantiaParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, garantiaId, propostaId, tipoGarantia, descricaoBem,
				proprietario, valorEstimado, dadosRegistro, localizacao,
				anuenciaTerceiro, documentoAnuencia);

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

			return (br.com.seatecnologia.gdf.negocia.model.Garantia)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<br.com.seatecnologia.gdf.negocia.model.Garantia> getGarantias(
			HttpPrincipal httpPrincipal, int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				GarantiaServiceUtil.class, "getGarantias",
				_getGarantiasParameterTypes2);

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
				<br.com.seatecnologia.gdf.negocia.model.Garantia>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(GarantiaServiceHttp.class);

	private static final Class<?>[] _addGarantiaParameterTypes0 = new Class[] {
		com.liferay.portal.kernel.service.ServiceContext.class, String.class,
		String.class, String.class, long.class, double.class, long.class,
		String.class, boolean.class, long.class, String.class, long.class
	};
	private static final Class<?>[] _updateGarantiaParameterTypes1 =
		new Class[] {
			long.class, long.class, String.class, String.class, String.class,
			double.class, String.class, String.class, boolean.class, long.class
		};
	private static final Class<?>[] _getGarantiasParameterTypes2 = new Class[] {
		int.class, int.class
	};

}