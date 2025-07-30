/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.Declaracao;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Declaracao. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.DeclaracaoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DeclaracaoLocalService
 * @generated
 */
public class DeclaracaoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.DeclaracaoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the declaracao to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DeclaracaoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param declaracao the declaracao
	 * @return the declaracao that was added
	 */
	public static Declaracao addDeclaracao(Declaracao declaracao) {
		return getService().addDeclaracao(declaracao);
	}

	public static Declaracao addDeclaracao(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long propostaId, boolean cumpreCompromissos,
		boolean naoAlienacaoBensSemComunicacao,
		boolean reconheceGrupoOuSucessao, boolean compromissoConfidencialidade,
		boolean cienciaProcesso, boolean abusoTransacao,
		boolean impugnacaoRecursos, boolean renunciaRecursos,
		boolean peticionamentoProcessos, boolean prestacaoInformacoes,
		boolean omissaoInformacoes, boolean manutencaoGarantias) {

		return getService().addDeclaracao(
			serviceContext, propostaId, cumpreCompromissos,
			naoAlienacaoBensSemComunicacao, reconheceGrupoOuSucessao,
			compromissoConfidencialidade, cienciaProcesso, abusoTransacao,
			impugnacaoRecursos, renunciaRecursos, peticionamentoProcessos,
			prestacaoInformacoes, omissaoInformacoes, manutencaoGarantias);
	}

	/**
	 * Creates a new declaracao with the primary key. Does not add the declaracao to the database.
	 *
	 * @param declaracaoId the primary key for the new declaracao
	 * @return the new declaracao
	 */
	public static Declaracao createDeclaracao(long declaracaoId) {
		return getService().createDeclaracao(declaracaoId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the declaracao from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DeclaracaoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param declaracao the declaracao
	 * @return the declaracao that was removed
	 */
	public static Declaracao deleteDeclaracao(Declaracao declaracao) {
		return getService().deleteDeclaracao(declaracao);
	}

	/**
	 * Deletes the declaracao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DeclaracaoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param declaracaoId the primary key of the declaracao
	 * @return the declaracao that was removed
	 * @throws PortalException if a declaracao with the primary key could not be found
	 */
	public static Declaracao deleteDeclaracao(long declaracaoId)
		throws PortalException {

		return getService().deleteDeclaracao(declaracaoId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Declaracao fetchDeclaracao(long declaracaoId) {
		return getService().fetchDeclaracao(declaracaoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the declaracao with the primary key.
	 *
	 * @param declaracaoId the primary key of the declaracao
	 * @return the declaracao
	 * @throws PortalException if a declaracao with the primary key could not be found
	 */
	public static Declaracao getDeclaracao(long declaracaoId)
		throws PortalException {

		return getService().getDeclaracao(declaracaoId);
	}

	public static Declaracao getDeclaracaoByPropostaId(long propostaId) {
		return getService().getDeclaracaoByPropostaId(propostaId);
	}

	/**
	 * Returns a range of all the declaracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @return the range of declaracaos
	 */
	public static List<Declaracao> getDeclaracaos(int start, int end) {
		return getService().getDeclaracaos(start, end);
	}

	/**
	 * Returns the number of declaracaos.
	 *
	 * @return the number of declaracaos
	 */
	public static int getDeclaracaosCount() {
		return getService().getDeclaracaosCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the declaracao in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DeclaracaoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param declaracao the declaracao
	 * @return the declaracao that was updated
	 */
	public static Declaracao updateDeclaracao(Declaracao declaracao) {
		return getService().updateDeclaracao(declaracao);
	}

	public static DeclaracaoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<DeclaracaoLocalService> _serviceSnapshot =
		new Snapshot<>(
			DeclaracaoLocalServiceUtil.class, DeclaracaoLocalService.class);

}