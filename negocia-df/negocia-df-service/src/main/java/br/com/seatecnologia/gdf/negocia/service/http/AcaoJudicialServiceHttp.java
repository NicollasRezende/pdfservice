/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.http;

import br.com.seatecnologia.gdf.negocia.service.AcaoJudicialServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>AcaoJudicialServiceUtil</code> service
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
public class AcaoJudicialServiceHttp {

	public static br.com.seatecnologia.gdf.negocia.model.AcaoJudicial
		addAcaoJudicial(
			HttpPrincipal httpPrincipal,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String orgaoTribunal, String numeroProcesso, String unidadeVara,
			String parteAutora, String parteRe, String observacoes,
			long propostaId) {

		try {
			MethodKey methodKey = new MethodKey(
				AcaoJudicialServiceUtil.class, "addAcaoJudicial",
				_addAcaoJudicialParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, serviceContext, orgaoTribunal, numeroProcesso,
				unidadeVara, parteAutora, parteRe, observacoes, propostaId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.seatecnologia.gdf.negocia.model.AcaoJudicial)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.seatecnologia.gdf.negocia.model.AcaoJudicial
		updateAcaoJudicial(
			HttpPrincipal httpPrincipal, long acaoId, long propostaId,
			String numeroProcesso, String varaLocal) {

		try {
			MethodKey methodKey = new MethodKey(
				AcaoJudicialServiceUtil.class, "updateAcaoJudicial",
				_updateAcaoJudicialParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, acaoId, propostaId, numeroProcesso, varaLocal);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.seatecnologia.gdf.negocia.model.AcaoJudicial)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<br.com.seatecnologia.gdf.negocia.model.AcaoJudicial> getAcaoJudicials(
			HttpPrincipal httpPrincipal, int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				AcaoJudicialServiceUtil.class, "getAcaoJudicials",
				_getAcaoJudicialsParameterTypes2);

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
				<br.com.seatecnologia.gdf.negocia.model.AcaoJudicial>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<br.com.seatecnologia.gdf.negocia.model.AcaoJudicial> findByPropostaId(
			HttpPrincipal httpPrincipal, long propostaId) {

		try {
			MethodKey methodKey = new MethodKey(
				AcaoJudicialServiceUtil.class, "findByPropostaId",
				_findByPropostaIdParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, propostaId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<br.com.seatecnologia.gdf.negocia.model.AcaoJudicial>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		AcaoJudicialServiceHttp.class);

	private static final Class<?>[] _addAcaoJudicialParameterTypes0 =
		new Class[] {
			com.liferay.portal.kernel.service.ServiceContext.class,
			String.class, String.class, String.class, String.class,
			String.class, String.class, long.class
		};
	private static final Class<?>[] _updateAcaoJudicialParameterTypes1 =
		new Class[] {long.class, long.class, String.class, String.class};
	private static final Class<?>[] _getAcaoJudicialsParameterTypes2 =
		new Class[] {int.class, int.class};
	private static final Class<?>[] _findByPropostaIdParameterTypes3 =
		new Class[] {long.class};

}