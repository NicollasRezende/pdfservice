/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link GarantiaPropostaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see GarantiaPropostaLocalService
 * @generated
 */
public class GarantiaPropostaLocalServiceWrapper
	implements GarantiaPropostaLocalService,
			   ServiceWrapper<GarantiaPropostaLocalService> {

	public GarantiaPropostaLocalServiceWrapper() {
		this(null);
	}

	public GarantiaPropostaLocalServiceWrapper(
		GarantiaPropostaLocalService garantiaPropostaLocalService) {

		_garantiaPropostaLocalService = garantiaPropostaLocalService;
	}

	/**
	 * Adds the garantia proposta to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GarantiaPropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param garantiaProposta the garantia proposta
	 * @return the garantia proposta that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.GarantiaProposta
		addGarantiaProposta(
			br.com.seatecnologia.gdf.negocia.model.GarantiaProposta
				garantiaProposta) {

		return _garantiaPropostaLocalService.addGarantiaProposta(
			garantiaProposta);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.GarantiaProposta
		addGarantiaProposta(long garantiaId, long propostaId) {

		return _garantiaPropostaLocalService.addGarantiaProposta(
			garantiaId, propostaId);
	}

	/**
	 * Creates a new garantia proposta with the primary key. Does not add the garantia proposta to the database.
	 *
	 * @param garantiaPropostaId the primary key for the new garantia proposta
	 * @return the new garantia proposta
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.GarantiaProposta
		createGarantiaProposta(long garantiaPropostaId) {

		return _garantiaPropostaLocalService.createGarantiaProposta(
			garantiaPropostaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _garantiaPropostaLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the garantia proposta from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GarantiaPropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param garantiaProposta the garantia proposta
	 * @return the garantia proposta that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.GarantiaProposta
		deleteGarantiaProposta(
			br.com.seatecnologia.gdf.negocia.model.GarantiaProposta
				garantiaProposta) {

		return _garantiaPropostaLocalService.deleteGarantiaProposta(
			garantiaProposta);
	}

	/**
	 * Deletes the garantia proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GarantiaPropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param garantiaPropostaId the primary key of the garantia proposta
	 * @return the garantia proposta that was removed
	 * @throws PortalException if a garantia proposta with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.GarantiaProposta
			deleteGarantiaProposta(long garantiaPropostaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _garantiaPropostaLocalService.deleteGarantiaProposta(
			garantiaPropostaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _garantiaPropostaLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _garantiaPropostaLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _garantiaPropostaLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _garantiaPropostaLocalService.dynamicQuery();
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

		return _garantiaPropostaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.GarantiaPropostaModelImpl</code>.
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

		return _garantiaPropostaLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.GarantiaPropostaModelImpl</code>.
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

		return _garantiaPropostaLocalService.dynamicQuery(
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

		return _garantiaPropostaLocalService.dynamicQueryCount(dynamicQuery);
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

		return _garantiaPropostaLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.GarantiaProposta
		fetchGarantiaProposta(long garantiaPropostaId) {

		return _garantiaPropostaLocalService.fetchGarantiaProposta(
			garantiaPropostaId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _garantiaPropostaLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the garantia proposta with the primary key.
	 *
	 * @param garantiaPropostaId the primary key of the garantia proposta
	 * @return the garantia proposta
	 * @throws PortalException if a garantia proposta with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.GarantiaProposta
			getGarantiaProposta(long garantiaPropostaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _garantiaPropostaLocalService.getGarantiaProposta(
			garantiaPropostaId);
	}

	/**
	 * Returns a range of all the garantia propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @return the range of garantia propostas
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.GarantiaProposta>
			getGarantiaPropostas(int start, int end) {

		return _garantiaPropostaLocalService.getGarantiaPropostas(start, end);
	}

	/**
	 * Returns the number of garantia propostas.
	 *
	 * @return the number of garantia propostas
	 */
	@Override
	public int getGarantiaPropostasCount() {
		return _garantiaPropostaLocalService.getGarantiaPropostasCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _garantiaPropostaLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _garantiaPropostaLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _garantiaPropostaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the garantia proposta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GarantiaPropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param garantiaProposta the garantia proposta
	 * @return the garantia proposta that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.GarantiaProposta
		updateGarantiaProposta(
			br.com.seatecnologia.gdf.negocia.model.GarantiaProposta
				garantiaProposta) {

		return _garantiaPropostaLocalService.updateGarantiaProposta(
			garantiaProposta);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _garantiaPropostaLocalService.getBasePersistence();
	}

	@Override
	public GarantiaPropostaLocalService getWrappedService() {
		return _garantiaPropostaLocalService;
	}

	@Override
	public void setWrappedService(
		GarantiaPropostaLocalService garantiaPropostaLocalService) {

		_garantiaPropostaLocalService = garantiaPropostaLocalService;
	}

	private GarantiaPropostaLocalService _garantiaPropostaLocalService;

}