/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.http;

import br.com.seatecnologia.gdf.negocia.service.DeclaracaoServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>DeclaracaoServiceUtil</code> service
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
public class DeclaracaoServiceHttp {

	public static br.com.seatecnologia.gdf.negocia.model.Declaracao
		addDeclaracao(
			HttpPrincipal httpPrincipal,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long propostaId, boolean cumpreCompromissos,
			boolean naoAlienacaoBensSemComunicacao,
			boolean reconheceGrupoOuSucessao,
			boolean compromissoConfidencialidade, boolean cienciaProcesso,
			boolean abusoTransacao, boolean impugnacaoRecursos,
			boolean renunciaRecursos, boolean peticionamentoProcessos,
			boolean prestacaoInformacoes, boolean omissaoInformacoes,
			boolean manutencaoGarantias) {

		try {
			MethodKey methodKey = new MethodKey(
				DeclaracaoServiceUtil.class, "addDeclaracao",
				_addDeclaracaoParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, serviceContext, propostaId, cumpreCompromissos,
				naoAlienacaoBensSemComunicacao, reconheceGrupoOuSucessao,
				compromissoConfidencialidade, cienciaProcesso, abusoTransacao,
				impugnacaoRecursos, renunciaRecursos, peticionamentoProcessos,
				prestacaoInformacoes, omissaoInformacoes, manutencaoGarantias);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.seatecnologia.gdf.negocia.model.Declaracao)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.seatecnologia.gdf.negocia.model.Declaracao
		findByPropostaId(HttpPrincipal httpPrincipal, long propostaId) {

		try {
			MethodKey methodKey = new MethodKey(
				DeclaracaoServiceUtil.class, "findByPropostaId",
				_findByPropostaIdParameterTypes1);

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

			return (br.com.seatecnologia.gdf.negocia.model.Declaracao)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		DeclaracaoServiceHttp.class);

	private static final Class<?>[] _addDeclaracaoParameterTypes0 =
		new Class[] {
			com.liferay.portal.kernel.service.ServiceContext.class, long.class,
			boolean.class, boolean.class, boolean.class, boolean.class,
			boolean.class, boolean.class, boolean.class, boolean.class,
			boolean.class, boolean.class, boolean.class, boolean.class
		};
	private static final Class<?>[] _findByPropostaIdParameterTypes1 =
		new Class[] {long.class};

}