/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AnexosOutrosLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AnexosOutrosLocalService
 * @generated
 */
public class AnexosOutrosLocalServiceWrapper
	implements AnexosOutrosLocalService,
			   ServiceWrapper<AnexosOutrosLocalService> {

	public AnexosOutrosLocalServiceWrapper() {
		this(null);
	}

	public AnexosOutrosLocalServiceWrapper(
		AnexosOutrosLocalService anexosOutrosLocalService) {

		_anexosOutrosLocalService = anexosOutrosLocalService;
	}

	/**
	 * Adds the anexos outros to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AnexosOutrosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param anexosOutros the anexos outros
	 * @return the anexos outros that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AnexosOutros addAnexosOutros(
		br.com.seatecnologia.gdf.negocia.model.AnexosOutros anexosOutros) {

		return _anexosOutrosLocalService.addAnexosOutros(anexosOutros);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.AnexosOutros addAnexosOutros(
		long dadosRegistroId, long outrosAnexo) {

		return _anexosOutrosLocalService.addAnexosOutros(
			dadosRegistroId, outrosAnexo);
	}

	/**
	 * Creates a new anexos outros with the primary key. Does not add the anexos outros to the database.
	 *
	 * @param anexosOutrosId the primary key for the new anexos outros
	 * @return the new anexos outros
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AnexosOutros
		createAnexosOutros(long anexosOutrosId) {

		return _anexosOutrosLocalService.createAnexosOutros(anexosOutrosId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _anexosOutrosLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the anexos outros from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AnexosOutrosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param anexosOutros the anexos outros
	 * @return the anexos outros that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AnexosOutros
		deleteAnexosOutros(
			br.com.seatecnologia.gdf.negocia.model.AnexosOutros anexosOutros) {

		return _anexosOutrosLocalService.deleteAnexosOutros(anexosOutros);
	}

	/**
	 * Deletes the anexos outros with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AnexosOutrosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param anexosOutrosId the primary key of the anexos outros
	 * @return the anexos outros that was removed
	 * @throws PortalException if a anexos outros with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AnexosOutros
			deleteAnexosOutros(long anexosOutrosId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _anexosOutrosLocalService.deleteAnexosOutros(anexosOutrosId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _anexosOutrosLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _anexosOutrosLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _anexosOutrosLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _anexosOutrosLocalService.dynamicQuery();
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

		return _anexosOutrosLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AnexosOutrosModelImpl</code>.
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

		return _anexosOutrosLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AnexosOutrosModelImpl</code>.
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

		return _anexosOutrosLocalService.dynamicQuery(
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

		return _anexosOutrosLocalService.dynamicQueryCount(dynamicQuery);
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

		return _anexosOutrosLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.AnexosOutros
		fetchAnexosOutros(long anexosOutrosId) {

		return _anexosOutrosLocalService.fetchAnexosOutros(anexosOutrosId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _anexosOutrosLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the anexos outros with the primary key.
	 *
	 * @param anexosOutrosId the primary key of the anexos outros
	 * @return the anexos outros
	 * @throws PortalException if a anexos outros with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AnexosOutros getAnexosOutros(
			long anexosOutrosId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _anexosOutrosLocalService.getAnexosOutros(anexosOutrosId);
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.AnexosOutros>
		getAnexosOutrosByDadosRegistroId(long dadosRegistroId) {

		return _anexosOutrosLocalService.getAnexosOutrosByDadosRegistroId(
			dadosRegistroId);
	}

	/**
	 * Returns a range of all the anexos outroses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @return the range of anexos outroses
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.AnexosOutros>
		getAnexosOutroses(int start, int end) {

		return _anexosOutrosLocalService.getAnexosOutroses(start, end);
	}

	/**
	 * Returns the number of anexos outroses.
	 *
	 * @return the number of anexos outroses
	 */
	@Override
	public int getAnexosOutrosesCount() {
		return _anexosOutrosLocalService.getAnexosOutrosesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _anexosOutrosLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _anexosOutrosLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _anexosOutrosLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the anexos outros in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AnexosOutrosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param anexosOutros the anexos outros
	 * @return the anexos outros that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AnexosOutros
		updateAnexosOutros(
			br.com.seatecnologia.gdf.negocia.model.AnexosOutros anexosOutros) {

		return _anexosOutrosLocalService.updateAnexosOutros(anexosOutros);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _anexosOutrosLocalService.getBasePersistence();
	}

	@Override
	public AnexosOutrosLocalService getWrappedService() {
		return _anexosOutrosLocalService;
	}

	@Override
	public void setWrappedService(
		AnexosOutrosLocalService anexosOutrosLocalService) {

		_anexosOutrosLocalService = anexosOutrosLocalService;
	}

	private AnexosOutrosLocalService _anexosOutrosLocalService;

}