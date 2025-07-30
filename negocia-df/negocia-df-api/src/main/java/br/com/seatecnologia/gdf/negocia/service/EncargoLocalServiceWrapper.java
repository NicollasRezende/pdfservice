/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link EncargoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EncargoLocalService
 * @generated
 */
public class EncargoLocalServiceWrapper
	implements EncargoLocalService, ServiceWrapper<EncargoLocalService> {

	public EncargoLocalServiceWrapper() {
		this(null);
	}

	public EncargoLocalServiceWrapper(EncargoLocalService encargoLocalService) {
		_encargoLocalService = encargoLocalService;
	}

	/**
	 * Adds the encargo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EncargoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param encargo the encargo
	 * @return the encargo that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Encargo addEncargo(
		br.com.seatecnologia.gdf.negocia.model.Encargo encargo) {

		return _encargoLocalService.addEncargo(encargo);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Encargo addEncargo(
		long encargoId, long propostaId, double valorEncargos,
		String descricaoEncargos) {

		return _encargoLocalService.addEncargo(
			encargoId, propostaId, valorEncargos, descricaoEncargos);
	}

	/**
	 * Creates a new encargo with the primary key. Does not add the encargo to the database.
	 *
	 * @param encargoId the primary key for the new encargo
	 * @return the new encargo
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Encargo createEncargo(
		long encargoId) {

		return _encargoLocalService.createEncargo(encargoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _encargoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the encargo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EncargoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param encargo the encargo
	 * @return the encargo that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Encargo deleteEncargo(
		br.com.seatecnologia.gdf.negocia.model.Encargo encargo) {

		return _encargoLocalService.deleteEncargo(encargo);
	}

	/**
	 * Deletes the encargo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EncargoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param encargoId the primary key of the encargo
	 * @return the encargo that was removed
	 * @throws PortalException if a encargo with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Encargo deleteEncargo(
			long encargoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _encargoLocalService.deleteEncargo(encargoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _encargoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _encargoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _encargoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _encargoLocalService.dynamicQuery();
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

		return _encargoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.EncargoModelImpl</code>.
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

		return _encargoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.EncargoModelImpl</code>.
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

		return _encargoLocalService.dynamicQuery(
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

		return _encargoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _encargoLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Encargo fetchEncargo(
		long encargoId) {

		return _encargoLocalService.fetchEncargo(encargoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _encargoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the encargo with the primary key.
	 *
	 * @param encargoId the primary key of the encargo
	 * @return the encargo
	 * @throws PortalException if a encargo with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Encargo getEncargo(
			long encargoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _encargoLocalService.getEncargo(encargoId);
	}

	/**
	 * Returns a range of all the encargos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @return the range of encargos
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Encargo>
		getEncargos(int start, int end) {

		return _encargoLocalService.getEncargos(start, end);
	}

	/**
	 * Returns the number of encargos.
	 *
	 * @return the number of encargos
	 */
	@Override
	public int getEncargosCount() {
		return _encargoLocalService.getEncargosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _encargoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _encargoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _encargoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the encargo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EncargoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param encargo the encargo
	 * @return the encargo that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Encargo updateEncargo(
		br.com.seatecnologia.gdf.negocia.model.Encargo encargo) {

		return _encargoLocalService.updateEncargo(encargo);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Encargo updateEncargo(
			long encargoId, long propostaId, double valorEncargos,
			String descricaoEncargos)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _encargoLocalService.updateEncargo(
			encargoId, propostaId, valorEncargos, descricaoEncargos);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _encargoLocalService.getBasePersistence();
	}

	@Override
	public EncargoLocalService getWrappedService() {
		return _encargoLocalService;
	}

	@Override
	public void setWrappedService(EncargoLocalService encargoLocalService) {
		_encargoLocalService = encargoLocalService;
	}

	private EncargoLocalService _encargoLocalService;

}