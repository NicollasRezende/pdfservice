/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link BensDireitosLaudoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BensDireitosLaudoLocalService
 * @generated
 */
public class BensDireitosLaudoLocalServiceWrapper
	implements BensDireitosLaudoLocalService,
			   ServiceWrapper<BensDireitosLaudoLocalService> {

	public BensDireitosLaudoLocalServiceWrapper() {
		this(null);
	}

	public BensDireitosLaudoLocalServiceWrapper(
		BensDireitosLaudoLocalService bensDireitosLaudoLocalService) {

		_bensDireitosLaudoLocalService = bensDireitosLaudoLocalService;
	}

	/**
	 * Adds the bens direitos laudo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BensDireitosLaudoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bensDireitosLaudo the bens direitos laudo
	 * @return the bens direitos laudo that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo
		addBensDireitosLaudo(
			br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo
				bensDireitosLaudo) {

		return _bensDireitosLaudoLocalService.addBensDireitosLaudo(
			bensDireitosLaudo);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo
		addBensDireitosLaudo(long bemId, long laudoAvaliacao) {

		return _bensDireitosLaudoLocalService.addBensDireitosLaudo(
			bemId, laudoAvaliacao);
	}

	/**
	 * Creates a new bens direitos laudo with the primary key. Does not add the bens direitos laudo to the database.
	 *
	 * @param bensDireitosLaudoId the primary key for the new bens direitos laudo
	 * @return the new bens direitos laudo
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo
		createBensDireitosLaudo(long bensDireitosLaudoId) {

		return _bensDireitosLaudoLocalService.createBensDireitosLaudo(
			bensDireitosLaudoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bensDireitosLaudoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the bens direitos laudo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BensDireitosLaudoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bensDireitosLaudo the bens direitos laudo
	 * @return the bens direitos laudo that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo
		deleteBensDireitosLaudo(
			br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo
				bensDireitosLaudo) {

		return _bensDireitosLaudoLocalService.deleteBensDireitosLaudo(
			bensDireitosLaudo);
	}

	/**
	 * Deletes the bens direitos laudo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BensDireitosLaudoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bensDireitosLaudoId the primary key of the bens direitos laudo
	 * @return the bens direitos laudo that was removed
	 * @throws PortalException if a bens direitos laudo with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo
			deleteBensDireitosLaudo(long bensDireitosLaudoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bensDireitosLaudoLocalService.deleteBensDireitosLaudo(
			bensDireitosLaudoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bensDireitosLaudoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _bensDireitosLaudoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _bensDireitosLaudoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bensDireitosLaudoLocalService.dynamicQuery();
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

		return _bensDireitosLaudoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BensDireitosLaudoModelImpl</code>.
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

		return _bensDireitosLaudoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BensDireitosLaudoModelImpl</code>.
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

		return _bensDireitosLaudoLocalService.dynamicQuery(
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

		return _bensDireitosLaudoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _bensDireitosLaudoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo
		fetchBensDireitosLaudo(long bensDireitosLaudoId) {

		return _bensDireitosLaudoLocalService.fetchBensDireitosLaudo(
			bensDireitosLaudoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _bensDireitosLaudoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the bens direitos laudo with the primary key.
	 *
	 * @param bensDireitosLaudoId the primary key of the bens direitos laudo
	 * @return the bens direitos laudo
	 * @throws PortalException if a bens direitos laudo with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo
			getBensDireitosLaudo(long bensDireitosLaudoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bensDireitosLaudoLocalService.getBensDireitosLaudo(
			bensDireitosLaudoId);
	}

	/**
	 * Returns a range of all the bens direitos laudos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @return the range of bens direitos laudos
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo>
			getBensDireitosLaudos(int start, int end) {

		return _bensDireitosLaudoLocalService.getBensDireitosLaudos(start, end);
	}

	/**
	 * Returns the number of bens direitos laudos.
	 *
	 * @return the number of bens direitos laudos
	 */
	@Override
	public int getBensDireitosLaudosCount() {
		return _bensDireitosLaudoLocalService.getBensDireitosLaudosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _bensDireitosLaudoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _bensDireitosLaudoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bensDireitosLaudoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the bens direitos laudo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BensDireitosLaudoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bensDireitosLaudo the bens direitos laudo
	 * @return the bens direitos laudo that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo
		updateBensDireitosLaudo(
			br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo
				bensDireitosLaudo) {

		return _bensDireitosLaudoLocalService.updateBensDireitosLaudo(
			bensDireitosLaudo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _bensDireitosLaudoLocalService.getBasePersistence();
	}

	@Override
	public BensDireitosLaudoLocalService getWrappedService() {
		return _bensDireitosLaudoLocalService;
	}

	@Override
	public void setWrappedService(
		BensDireitosLaudoLocalService bensDireitosLaudoLocalService) {

		_bensDireitosLaudoLocalService = bensDireitosLaudoLocalService;
	}

	private BensDireitosLaudoLocalService _bensDireitosLaudoLocalService;

}