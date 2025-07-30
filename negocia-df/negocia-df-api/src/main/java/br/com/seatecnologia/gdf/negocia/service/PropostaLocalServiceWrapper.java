/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PropostaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PropostaLocalService
 * @generated
 */
public class PropostaLocalServiceWrapper
	implements PropostaLocalService, ServiceWrapper<PropostaLocalService> {

	public PropostaLocalServiceWrapper() {
		this(null);
	}

	public PropostaLocalServiceWrapper(
		PropostaLocalService propostaLocalService) {

		_propostaLocalService = propostaLocalService;
	}

	/**
	 * Adds the proposta to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param proposta the proposta
	 * @return the proposta that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Proposta addProposta(
		br.com.seatecnologia.gdf.negocia.model.Proposta proposta) {

		return _propostaLocalService.addProposta(proposta);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Proposta addProposta(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long editalId, String tipoProposta, String numeroProtocoloSei,
			long propostaPaiId, long procuracao, String cpfCnpj)
		throws br.com.seatecnologia.gdf.negocia.exception.
			BusinessLogicValidationException,
			   com.liferay.portal.kernel.exception.PortalException {

		return _propostaLocalService.addProposta(
			serviceContext, editalId, tipoProposta, numeroProtocoloSei,
			propostaPaiId, procuracao, cpfCnpj);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _propostaLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new proposta with the primary key. Does not add the proposta to the database.
	 *
	 * @param propostaId the primary key for the new proposta
	 * @return the new proposta
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Proposta createProposta(
		long propostaId) {

		return _propostaLocalService.createProposta(propostaId);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Proposta
			createPropostaCompleteZip(
				long propostaId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws Exception {

		return _propostaLocalService.createPropostaCompleteZip(
			propostaId, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _propostaLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param propostaId the primary key of the proposta
	 * @return the proposta that was removed
	 * @throws PortalException if a proposta with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Proposta deleteProposta(
			long propostaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _propostaLocalService.deleteProposta(propostaId);
	}

	/**
	 * Deletes the proposta from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param proposta the proposta
	 * @return the proposta that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Proposta deleteProposta(
		br.com.seatecnologia.gdf.negocia.model.Proposta proposta) {

		return _propostaLocalService.deleteProposta(proposta);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _propostaLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _propostaLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _propostaLocalService.dynamicQuery();
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

		return _propostaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.PropostaModelImpl</code>.
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

		return _propostaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.PropostaModelImpl</code>.
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

		return _propostaLocalService.dynamicQuery(
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

		return _propostaLocalService.dynamicQueryCount(dynamicQuery);
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

		return _propostaLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Proposta fetchProposta(
		long propostaId) {

		return _propostaLocalService.fetchProposta(propostaId);
	}

	/**
	 * Returns the proposta matching the UUID and group.
	 *
	 * @param uuid the proposta's UUID
	 * @param groupId the primary key of the group
	 * @return the matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Proposta
		fetchPropostaByUuidAndGroupId(String uuid, long groupId) {

		return _propostaLocalService.fetchPropostaByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Proposta>
		findByCpfCnpj(String cpfCnpj) {

		return _propostaLocalService.findByCpfCnpj(cpfCnpj);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _propostaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _propostaLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _propostaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _propostaLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _propostaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the proposta with the primary key.
	 *
	 * @param propostaId the primary key of the proposta
	 * @return the proposta
	 * @throws PortalException if a proposta with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Proposta getProposta(
			long propostaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _propostaLocalService.getProposta(propostaId);
	}

	/**
	 * Returns the proposta matching the UUID and group.
	 *
	 * @param uuid the proposta's UUID
	 * @param groupId the primary key of the group
	 * @return the matching proposta
	 * @throws PortalException if a matching proposta could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Proposta
			getPropostaByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _propostaLocalService.getPropostaByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @return the range of propostas
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Proposta>
		getPropostas(int start, int end) {

		return _propostaLocalService.getPropostas(start, end);
	}

	/**
	 * Returns all the propostas matching the UUID and company.
	 *
	 * @param uuid the UUID of the propostas
	 * @param companyId the primary key of the company
	 * @return the matching propostas, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Proposta>
		getPropostasByUuidAndCompanyId(String uuid, long companyId) {

		return _propostaLocalService.getPropostasByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of propostas matching the UUID and company.
	 *
	 * @param uuid the UUID of the propostas
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching propostas, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Proposta>
		getPropostasByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.seatecnologia.gdf.negocia.model.Proposta>
					orderByComparator) {

		return _propostaLocalService.getPropostasByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of propostas.
	 *
	 * @return the number of propostas
	 */
	@Override
	public int getPropostasCount() {
		return _propostaLocalService.getPropostasCount();
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Proposta updateProposta(
			long propostaId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long dadosContribuinteId, long administradorJudicialId,
			long advogadoId, String fundamentacaoPedido,
			boolean cumpreCompromissos, boolean naoAlienacaoBensSemComunicacao,
			boolean reconheceGrupoOuSucessao, String status,
			String numeroProtocoloSei, String documentosCompletosURL,
			long propostaPaiId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _propostaLocalService.updateProposta(
			propostaId, serviceContext, dadosContribuinteId,
			administradorJudicialId, advogadoId, fundamentacaoPedido,
			cumpreCompromissos, naoAlienacaoBensSemComunicacao,
			reconheceGrupoOuSucessao, status, numeroProtocoloSei,
			documentosCompletosURL, propostaPaiId);
	}

	/**
	 * Updates the proposta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param proposta the proposta
	 * @return the proposta that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Proposta updateProposta(
		br.com.seatecnologia.gdf.negocia.model.Proposta proposta) {

		return _propostaLocalService.updateProposta(proposta);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _propostaLocalService.getBasePersistence();
	}

	@Override
	public PropostaLocalService getWrappedService() {
		return _propostaLocalService;
	}

	@Override
	public void setWrappedService(PropostaLocalService propostaLocalService) {
		_propostaLocalService = propostaLocalService;
	}

	private PropostaLocalService _propostaLocalService;

}