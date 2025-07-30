/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link DeclaracaoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DeclaracaoLocalService
 * @generated
 */
public class DeclaracaoLocalServiceWrapper
	implements DeclaracaoLocalService, ServiceWrapper<DeclaracaoLocalService> {

	public DeclaracaoLocalServiceWrapper() {
		this(null);
	}

	public DeclaracaoLocalServiceWrapper(
		DeclaracaoLocalService declaracaoLocalService) {

		_declaracaoLocalService = declaracaoLocalService;
	}

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
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Declaracao addDeclaracao(
		br.com.seatecnologia.gdf.negocia.model.Declaracao declaracao) {

		return _declaracaoLocalService.addDeclaracao(declaracao);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Declaracao addDeclaracao(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long propostaId, boolean cumpreCompromissos,
		boolean naoAlienacaoBensSemComunicacao,
		boolean reconheceGrupoOuSucessao, boolean compromissoConfidencialidade,
		boolean cienciaProcesso, boolean abusoTransacao,
		boolean impugnacaoRecursos, boolean renunciaRecursos,
		boolean peticionamentoProcessos, boolean prestacaoInformacoes,
		boolean omissaoInformacoes, boolean manutencaoGarantias) {

		return _declaracaoLocalService.addDeclaracao(
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
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Declaracao createDeclaracao(
		long declaracaoId) {

		return _declaracaoLocalService.createDeclaracao(declaracaoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _declaracaoLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Declaracao deleteDeclaracao(
		br.com.seatecnologia.gdf.negocia.model.Declaracao declaracao) {

		return _declaracaoLocalService.deleteDeclaracao(declaracao);
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
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Declaracao deleteDeclaracao(
			long declaracaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _declaracaoLocalService.deleteDeclaracao(declaracaoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _declaracaoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _declaracaoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _declaracaoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _declaracaoLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _declaracaoLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _declaracaoLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _declaracaoLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _declaracaoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _declaracaoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Declaracao fetchDeclaracao(
		long declaracaoId) {

		return _declaracaoLocalService.fetchDeclaracao(declaracaoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _declaracaoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the declaracao with the primary key.
	 *
	 * @param declaracaoId the primary key of the declaracao
	 * @return the declaracao
	 * @throws PortalException if a declaracao with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Declaracao getDeclaracao(
			long declaracaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _declaracaoLocalService.getDeclaracao(declaracaoId);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Declaracao
		getDeclaracaoByPropostaId(long propostaId) {

		return _declaracaoLocalService.getDeclaracaoByPropostaId(propostaId);
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
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Declaracao>
		getDeclaracaos(int start, int end) {

		return _declaracaoLocalService.getDeclaracaos(start, end);
	}

	/**
	 * Returns the number of declaracaos.
	 *
	 * @return the number of declaracaos
	 */
	@Override
	public int getDeclaracaosCount() {
		return _declaracaoLocalService.getDeclaracaosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _declaracaoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _declaracaoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _declaracaoLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Declaracao updateDeclaracao(
		br.com.seatecnologia.gdf.negocia.model.Declaracao declaracao) {

		return _declaracaoLocalService.updateDeclaracao(declaracao);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _declaracaoLocalService.getBasePersistence();
	}

	@Override
	public DeclaracaoLocalService getWrappedService() {
		return _declaracaoLocalService;
	}

	@Override
	public void setWrappedService(
		DeclaracaoLocalService declaracaoLocalService) {

		_declaracaoLocalService = declaracaoLocalService;
	}

	private DeclaracaoLocalService _declaracaoLocalService;

}