/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link DemaisPartesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DemaisPartesLocalService
 * @generated
 */
public class DemaisPartesLocalServiceWrapper
	implements DemaisPartesLocalService,
			   ServiceWrapper<DemaisPartesLocalService> {

	public DemaisPartesLocalServiceWrapper() {
		this(null);
	}

	public DemaisPartesLocalServiceWrapper(
		DemaisPartesLocalService demaisPartesLocalService) {

		_demaisPartesLocalService = demaisPartesLocalService;
	}

	/**
	 * Adds the demais partes to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemaisPartesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demaisPartes the demais partes
	 * @return the demais partes that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemaisPartes addDemaisPartes(
		br.com.seatecnologia.gdf.negocia.model.DemaisPartes demaisPartes) {

		return _demaisPartesLocalService.addDemaisPartes(demaisPartes);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemaisPartes addDemaisPartes(
		long qualificacaoId, long propostaId, String tipoParte) {

		return _demaisPartesLocalService.addDemaisPartes(
			qualificacaoId, propostaId, tipoParte);
	}

	/**
	 * Creates a new demais partes with the primary key. Does not add the demais partes to the database.
	 *
	 * @param demaisPartesId the primary key for the new demais partes
	 * @return the new demais partes
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemaisPartes
		createDemaisPartes(long demaisPartesId) {

		return _demaisPartesLocalService.createDemaisPartes(demaisPartesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demaisPartesLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the demais partes from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemaisPartesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demaisPartes the demais partes
	 * @return the demais partes that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemaisPartes
		deleteDemaisPartes(
			br.com.seatecnologia.gdf.negocia.model.DemaisPartes demaisPartes) {

		return _demaisPartesLocalService.deleteDemaisPartes(demaisPartes);
	}

	/**
	 * Deletes the demais partes with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemaisPartesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demaisPartesId the primary key of the demais partes
	 * @return the demais partes that was removed
	 * @throws PortalException if a demais partes with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemaisPartes
			deleteDemaisPartes(long demaisPartesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demaisPartesLocalService.deleteDemaisPartes(demaisPartesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demaisPartesLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _demaisPartesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _demaisPartesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _demaisPartesLocalService.dynamicQuery();
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

		return _demaisPartesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DemaisPartesModelImpl</code>.
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

		return _demaisPartesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DemaisPartesModelImpl</code>.
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

		return _demaisPartesLocalService.dynamicQuery(
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

		return _demaisPartesLocalService.dynamicQueryCount(dynamicQuery);
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

		return _demaisPartesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemaisPartes
		fetchDemaisPartes(long demaisPartesId) {

		return _demaisPartesLocalService.fetchDemaisPartes(demaisPartesId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _demaisPartesLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the demais partes with the primary key.
	 *
	 * @param demaisPartesId the primary key of the demais partes
	 * @return the demais partes
	 * @throws PortalException if a demais partes with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemaisPartes getDemaisPartes(
			long demaisPartesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demaisPartesLocalService.getDemaisPartes(demaisPartesId);
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.DemaisPartes>
		getDemaisPartesByPropostaId(long propostaId) {

		return _demaisPartesLocalService.getDemaisPartesByPropostaId(
			propostaId);
	}

	/**
	 * Returns a range of all the demais parteses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @return the range of demais parteses
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.DemaisPartes>
		getDemaisParteses(int start, int end) {

		return _demaisPartesLocalService.getDemaisParteses(start, end);
	}

	/**
	 * Returns the number of demais parteses.
	 *
	 * @return the number of demais parteses
	 */
	@Override
	public int getDemaisPartesesCount() {
		return _demaisPartesLocalService.getDemaisPartesesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _demaisPartesLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _demaisPartesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demaisPartesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the demais partes in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemaisPartesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demaisPartes the demais partes
	 * @return the demais partes that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemaisPartes
		updateDemaisPartes(
			br.com.seatecnologia.gdf.negocia.model.DemaisPartes demaisPartes) {

		return _demaisPartesLocalService.updateDemaisPartes(demaisPartes);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _demaisPartesLocalService.getBasePersistence();
	}

	@Override
	public DemaisPartesLocalService getWrappedService() {
		return _demaisPartesLocalService;
	}

	@Override
	public void setWrappedService(
		DemaisPartesLocalService demaisPartesLocalService) {

		_demaisPartesLocalService = demaisPartesLocalService;
	}

	private DemaisPartesLocalService _demaisPartesLocalService;

}