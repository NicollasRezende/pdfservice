/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link EditalLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EditalLocalService
 * @generated
 */
public class EditalLocalServiceWrapper
	implements EditalLocalService, ServiceWrapper<EditalLocalService> {

	public EditalLocalServiceWrapper() {
		this(null);
	}

	public EditalLocalServiceWrapper(EditalLocalService editalLocalService) {
		_editalLocalService = editalLocalService;
	}

	/**
	 * Adds the edital to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EditalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edital the edital
	 * @return the edital that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Edital addEdital(
		br.com.seatecnologia.gdf.negocia.model.Edital edital) {

		return _editalLocalService.addEdital(edital);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Edital addEdital(
		String titulo, String descricao, long arquivo,
		java.util.Date dataInicio, java.util.Date dataFim) {

		return _editalLocalService.addEdital(
			titulo, descricao, arquivo, dataInicio, dataFim);
	}

	/**
	 * Creates a new edital with the primary key. Does not add the edital to the database.
	 *
	 * @param editalId the primary key for the new edital
	 * @return the new edital
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Edital createEdital(
		long editalId) {

		return _editalLocalService.createEdital(editalId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _editalLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the edital from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EditalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edital the edital
	 * @return the edital that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Edital deleteEdital(
		br.com.seatecnologia.gdf.negocia.model.Edital edital) {

		return _editalLocalService.deleteEdital(edital);
	}

	/**
	 * Deletes the edital with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EditalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param editalId the primary key of the edital
	 * @return the edital that was removed
	 * @throws PortalException if a edital with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Edital deleteEdital(
			long editalId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _editalLocalService.deleteEdital(editalId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _editalLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _editalLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _editalLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _editalLocalService.dynamicQuery();
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

		return _editalLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.EditalModelImpl</code>.
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

		return _editalLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.EditalModelImpl</code>.
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

		return _editalLocalService.dynamicQuery(
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

		return _editalLocalService.dynamicQueryCount(dynamicQuery);
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

		return _editalLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Edital fetchEdital(
		long editalId) {

		return _editalLocalService.fetchEdital(editalId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _editalLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the edital with the primary key.
	 *
	 * @param editalId the primary key of the edital
	 * @return the edital
	 * @throws PortalException if a edital with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Edital getEdital(
			long editalId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _editalLocalService.getEdital(editalId);
	}

	/**
	 * Returns a range of all the editals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.EditalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of editals
	 * @param end the upper bound of the range of editals (not inclusive)
	 * @return the range of editals
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Edital>
		getEditals(int start, int end) {

		return _editalLocalService.getEditals(start, end);
	}

	/**
	 * Returns the number of editals.
	 *
	 * @return the number of editals
	 */
	@Override
	public int getEditalsCount() {
		return _editalLocalService.getEditalsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _editalLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _editalLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _editalLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the edital in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EditalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param edital the edital
	 * @return the edital that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Edital updateEdital(
		br.com.seatecnologia.gdf.negocia.model.Edital edital) {

		return _editalLocalService.updateEdital(edital);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Edital updateEdital(
			long editalId, String titulo, String descricao, long arquivo,
			java.util.Date dataInicio, java.util.Date dataFim)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _editalLocalService.updateEdital(
			editalId, titulo, descricao, arquivo, dataInicio, dataFim);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _editalLocalService.getBasePersistence();
	}

	@Override
	public EditalLocalService getWrappedService() {
		return _editalLocalService;
	}

	@Override
	public void setWrappedService(EditalLocalService editalLocalService) {
		_editalLocalService = editalLocalService;
	}

	private EditalLocalService _editalLocalService;

}