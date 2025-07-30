/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcaoJudicialPropostaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcaoJudicialPropostaLocalService
 * @generated
 */
public class AcaoJudicialPropostaLocalServiceWrapper
	implements AcaoJudicialPropostaLocalService,
			   ServiceWrapper<AcaoJudicialPropostaLocalService> {

	public AcaoJudicialPropostaLocalServiceWrapper() {
		this(null);
	}

	public AcaoJudicialPropostaLocalServiceWrapper(
		AcaoJudicialPropostaLocalService acaoJudicialPropostaLocalService) {

		_acaoJudicialPropostaLocalService = acaoJudicialPropostaLocalService;
	}

	/**
	 * Adds the acao judicial proposta to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcaoJudicialPropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acaoJudicialProposta the acao judicial proposta
	 * @return the acao judicial proposta that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicialProposta
		addAcaoJudicialProposta(
			br.com.seatecnologia.gdf.negocia.model.AcaoJudicialProposta
				acaoJudicialProposta) {

		return _acaoJudicialPropostaLocalService.addAcaoJudicialProposta(
			acaoJudicialProposta);
	}

	/**
	 * Creates a new acao judicial proposta with the primary key. Does not add the acao judicial proposta to the database.
	 *
	 * @param acaoPropostaId the primary key for the new acao judicial proposta
	 * @return the new acao judicial proposta
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicialProposta
		createAcaoJudicialProposta(long acaoPropostaId) {

		return _acaoJudicialPropostaLocalService.createAcaoJudicialProposta(
			acaoPropostaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acaoJudicialPropostaLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acao judicial proposta from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcaoJudicialPropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acaoJudicialProposta the acao judicial proposta
	 * @return the acao judicial proposta that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicialProposta
		deleteAcaoJudicialProposta(
			br.com.seatecnologia.gdf.negocia.model.AcaoJudicialProposta
				acaoJudicialProposta) {

		return _acaoJudicialPropostaLocalService.deleteAcaoJudicialProposta(
			acaoJudicialProposta);
	}

	/**
	 * Deletes the acao judicial proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcaoJudicialPropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acaoPropostaId the primary key of the acao judicial proposta
	 * @return the acao judicial proposta that was removed
	 * @throws PortalException if a acao judicial proposta with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicialProposta
			deleteAcaoJudicialProposta(long acaoPropostaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acaoJudicialPropostaLocalService.deleteAcaoJudicialProposta(
			acaoPropostaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acaoJudicialPropostaLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acaoJudicialPropostaLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acaoJudicialPropostaLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acaoJudicialPropostaLocalService.dynamicQuery();
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

		return _acaoJudicialPropostaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AcaoJudicialPropostaModelImpl</code>.
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

		return _acaoJudicialPropostaLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AcaoJudicialPropostaModelImpl</code>.
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

		return _acaoJudicialPropostaLocalService.dynamicQuery(
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

		return _acaoJudicialPropostaLocalService.dynamicQueryCount(
			dynamicQuery);
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

		return _acaoJudicialPropostaLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicialProposta
		fetchAcaoJudicialProposta(long acaoPropostaId) {

		return _acaoJudicialPropostaLocalService.fetchAcaoJudicialProposta(
			acaoPropostaId);
	}

	/**
	 * Returns the acao judicial proposta with the primary key.
	 *
	 * @param acaoPropostaId the primary key of the acao judicial proposta
	 * @return the acao judicial proposta
	 * @throws PortalException if a acao judicial proposta with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicialProposta
			getAcaoJudicialProposta(long acaoPropostaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acaoJudicialPropostaLocalService.getAcaoJudicialProposta(
			acaoPropostaId);
	}

	/**
	 * Returns a range of all the acao judicial propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @return the range of acao judicial propostas
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.AcaoJudicialProposta>
			getAcaoJudicialPropostas(int start, int end) {

		return _acaoJudicialPropostaLocalService.getAcaoJudicialPropostas(
			start, end);
	}

	/**
	 * Returns the number of acao judicial propostas.
	 *
	 * @return the number of acao judicial propostas
	 */
	@Override
	public int getAcaoJudicialPropostasCount() {
		return _acaoJudicialPropostaLocalService.
			getAcaoJudicialPropostasCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acaoJudicialPropostaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acaoJudicialPropostaLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acaoJudicialPropostaLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acaoJudicialPropostaLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acao judicial proposta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcaoJudicialPropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acaoJudicialProposta the acao judicial proposta
	 * @return the acao judicial proposta that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicialProposta
		updateAcaoJudicialProposta(
			br.com.seatecnologia.gdf.negocia.model.AcaoJudicialProposta
				acaoJudicialProposta) {

		return _acaoJudicialPropostaLocalService.updateAcaoJudicialProposta(
			acaoJudicialProposta);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acaoJudicialPropostaLocalService.getBasePersistence();
	}

	@Override
	public AcaoJudicialPropostaLocalService getWrappedService() {
		return _acaoJudicialPropostaLocalService;
	}

	@Override
	public void setWrappedService(
		AcaoJudicialPropostaLocalService acaoJudicialPropostaLocalService) {

		_acaoJudicialPropostaLocalService = acaoJudicialPropostaLocalService;
	}

	private AcaoJudicialPropostaLocalService _acaoJudicialPropostaLocalService;

}