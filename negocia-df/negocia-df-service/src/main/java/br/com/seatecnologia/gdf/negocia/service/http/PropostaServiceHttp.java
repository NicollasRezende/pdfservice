/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.http;

import br.com.seatecnologia.gdf.negocia.service.PropostaServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>PropostaServiceUtil</code> service
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
public class PropostaServiceHttp {

	public static br.com.seatecnologia.gdf.negocia.model.Proposta addProposta(
			HttpPrincipal httpPrincipal,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long editalId, String tipoProposta, String numeroProtocoloSei,
			long propostaPaiId, long procuracao, String cpfCnpj)
		throws br.com.seatecnologia.gdf.negocia.exception.
			BusinessLogicValidationException,
			   com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PropostaServiceUtil.class, "addProposta",
				_addPropostaParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, serviceContext, editalId, tipoProposta,
				numeroProtocoloSei, propostaPaiId, procuracao, cpfCnpj);

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

				if (exception instanceof
						br.com.seatecnologia.gdf.negocia.exception.
							BusinessLogicValidationException) {

					throw (br.com.seatecnologia.gdf.negocia.exception.
						BusinessLogicValidationException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.seatecnologia.gdf.negocia.model.Proposta)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.seatecnologia.gdf.negocia.model.Proposta
			updateProposta(
				HttpPrincipal httpPrincipal, long propostaId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext,
				long dadosContribuinteId, long administradorJudicialId,
				long advogadoId, String fundamentacaoPedido,
				boolean cumpreCompromissos,
				boolean naoAlienacaoBensSemComunicacao,
				boolean reconheceGrupoOuSucessao, String status,
				String numeroProtocoloSei, String documentosCompletosURL,
				long propostaPaiId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PropostaServiceUtil.class, "updateProposta",
				_updatePropostaParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, propostaId, serviceContext, dadosContribuinteId,
				administradorJudicialId, advogadoId, fundamentacaoPedido,
				cumpreCompromissos, naoAlienacaoBensSemComunicacao,
				reconheceGrupoOuSucessao, status, numeroProtocoloSei,
				documentosCompletosURL, propostaPaiId);

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

			return (br.com.seatecnologia.gdf.negocia.model.Proposta)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.seatecnologia.gdf.negocia.model.Proposta getProposta(
			HttpPrincipal httpPrincipal, long propostaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PropostaServiceUtil.class, "getProposta",
				_getPropostaParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, propostaId);

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

			return (br.com.seatecnologia.gdf.negocia.model.Proposta)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.seatecnologia.gdf.negocia.model.Proposta
			getPropostaZip(HttpPrincipal httpPrincipal, long propostaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PropostaServiceUtil.class, "getPropostaZip",
				_getPropostaZipParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, propostaId);

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

			return (br.com.seatecnologia.gdf.negocia.model.Proposta)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.seatecnologia.gdf.negocia.model.Proposta
		updateProposta(
			HttpPrincipal httpPrincipal,
			br.com.seatecnologia.gdf.negocia.model.Proposta proposta) {

		try {
			MethodKey methodKey = new MethodKey(
				PropostaServiceUtil.class, "updateProposta",
				_updatePropostaParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, proposta);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.seatecnologia.gdf.negocia.model.Proposta)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<br.com.seatecnologia.gdf.negocia.model.Proposta> getPropostas(
			HttpPrincipal httpPrincipal, int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				PropostaServiceUtil.class, "getPropostas",
				_getPropostasParameterTypes5);

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
				<br.com.seatecnologia.gdf.negocia.model.Proposta>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(PropostaServiceHttp.class);

	private static final Class<?>[] _addPropostaParameterTypes0 = new Class[] {
		com.liferay.portal.kernel.service.ServiceContext.class, long.class,
		String.class, String.class, long.class, long.class, String.class
	};
	private static final Class<?>[] _updatePropostaParameterTypes1 =
		new Class[] {
			long.class, com.liferay.portal.kernel.service.ServiceContext.class,
			long.class, long.class, long.class, String.class, boolean.class,
			boolean.class, boolean.class, String.class, String.class,
			String.class, long.class
		};
	private static final Class<?>[] _getPropostaParameterTypes2 = new Class[] {
		long.class
	};
	private static final Class<?>[] _getPropostaZipParameterTypes3 =
		new Class[] {long.class};
	private static final Class<?>[] _updatePropostaParameterTypes4 =
		new Class[] {br.com.seatecnologia.gdf.negocia.model.Proposta.class};
	private static final Class<?>[] _getPropostasParameterTypes5 = new Class[] {
		int.class, int.class
	};

}