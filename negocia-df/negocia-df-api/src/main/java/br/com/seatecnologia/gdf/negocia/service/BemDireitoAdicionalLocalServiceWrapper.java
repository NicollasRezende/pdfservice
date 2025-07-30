/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link BemDireitoAdicionalLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BemDireitoAdicionalLocalService
 * @generated
 */
public class BemDireitoAdicionalLocalServiceWrapper
	implements BemDireitoAdicionalLocalService,
			   ServiceWrapper<BemDireitoAdicionalLocalService> {

	public BemDireitoAdicionalLocalServiceWrapper() {
		this(null);
	}

	public BemDireitoAdicionalLocalServiceWrapper(
		BemDireitoAdicionalLocalService bemDireitoAdicionalLocalService) {

		_bemDireitoAdicionalLocalService = bemDireitoAdicionalLocalService;
	}

	/**
	 * Adds the bem direito adicional to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BemDireitoAdicionalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bemDireitoAdicional the bem direito adicional
	 * @return the bem direito adicional that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional
		addBemDireitoAdicional(
			br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional
				bemDireitoAdicional) {

		return _bemDireitoAdicionalLocalService.addBemDireitoAdicional(
			bemDireitoAdicional);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional
		addBemDireitoAdicional(
			long bemId, long propostaId, String descricao, String localizacao,
			String destinacao, String laudoAvaliacao) {

		return _bemDireitoAdicionalLocalService.addBemDireitoAdicional(
			bemId, propostaId, descricao, localizacao, destinacao,
			laudoAvaliacao);
	}

	/**
	 * Creates a new bem direito adicional with the primary key. Does not add the bem direito adicional to the database.
	 *
	 * @param bemId the primary key for the new bem direito adicional
	 * @return the new bem direito adicional
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional
		createBemDireitoAdicional(long bemId) {

		return _bemDireitoAdicionalLocalService.createBemDireitoAdicional(
			bemId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bemDireitoAdicionalLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the bem direito adicional from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BemDireitoAdicionalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bemDireitoAdicional the bem direito adicional
	 * @return the bem direito adicional that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional
		deleteBemDireitoAdicional(
			br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional
				bemDireitoAdicional) {

		return _bemDireitoAdicionalLocalService.deleteBemDireitoAdicional(
			bemDireitoAdicional);
	}

	/**
	 * Deletes the bem direito adicional with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BemDireitoAdicionalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bemId the primary key of the bem direito adicional
	 * @return the bem direito adicional that was removed
	 * @throws PortalException if a bem direito adicional with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional
			deleteBemDireitoAdicional(long bemId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bemDireitoAdicionalLocalService.deleteBemDireitoAdicional(
			bemId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bemDireitoAdicionalLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _bemDireitoAdicionalLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _bemDireitoAdicionalLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bemDireitoAdicionalLocalService.dynamicQuery();
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

		return _bemDireitoAdicionalLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BemDireitoAdicionalModelImpl</code>.
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

		return _bemDireitoAdicionalLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BemDireitoAdicionalModelImpl</code>.
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

		return _bemDireitoAdicionalLocalService.dynamicQuery(
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

		return _bemDireitoAdicionalLocalService.dynamicQueryCount(dynamicQuery);
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

		return _bemDireitoAdicionalLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional
		fetchBemDireitoAdicional(long bemId) {

		return _bemDireitoAdicionalLocalService.fetchBemDireitoAdicional(bemId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _bemDireitoAdicionalLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the bem direito adicional with the primary key.
	 *
	 * @param bemId the primary key of the bem direito adicional
	 * @return the bem direito adicional
	 * @throws PortalException if a bem direito adicional with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional
			getBemDireitoAdicional(long bemId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bemDireitoAdicionalLocalService.getBemDireitoAdicional(bemId);
	}

	/**
	 * Returns a range of all the bem direito adicionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @return the range of bem direito adicionals
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional>
			getBemDireitoAdicionals(int start, int end) {

		return _bemDireitoAdicionalLocalService.getBemDireitoAdicionals(
			start, end);
	}

	/**
	 * Returns the number of bem direito adicionals.
	 *
	 * @return the number of bem direito adicionals
	 */
	@Override
	public int getBemDireitoAdicionalsCount() {
		return _bemDireitoAdicionalLocalService.getBemDireitoAdicionalsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _bemDireitoAdicionalLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _bemDireitoAdicionalLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bemDireitoAdicionalLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the bem direito adicional in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BemDireitoAdicionalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bemDireitoAdicional the bem direito adicional
	 * @return the bem direito adicional that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional
		updateBemDireitoAdicional(
			br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional
				bemDireitoAdicional) {

		return _bemDireitoAdicionalLocalService.updateBemDireitoAdicional(
			bemDireitoAdicional);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional
			updateBemDireitoAdicional(
				long bemId, long propostaId, String descricao,
				String localizacao, String destinacao, String laudoAvaliacao)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bemDireitoAdicionalLocalService.updateBemDireitoAdicional(
			bemId, propostaId, descricao, localizacao, destinacao,
			laudoAvaliacao);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _bemDireitoAdicionalLocalService.getBasePersistence();
	}

	@Override
	public BemDireitoAdicionalLocalService getWrappedService() {
		return _bemDireitoAdicionalLocalService;
	}

	@Override
	public void setWrappedService(
		BemDireitoAdicionalLocalService bemDireitoAdicionalLocalService) {

		_bemDireitoAdicionalLocalService = bemDireitoAdicionalLocalService;
	}

	private BemDireitoAdicionalLocalService _bemDireitoAdicionalLocalService;

}