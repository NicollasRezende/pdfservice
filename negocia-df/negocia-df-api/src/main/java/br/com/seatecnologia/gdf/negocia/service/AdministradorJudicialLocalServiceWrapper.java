/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AdministradorJudicialLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AdministradorJudicialLocalService
 * @generated
 */
public class AdministradorJudicialLocalServiceWrapper
	implements AdministradorJudicialLocalService,
			   ServiceWrapper<AdministradorJudicialLocalService> {

	public AdministradorJudicialLocalServiceWrapper() {
		this(null);
	}

	public AdministradorJudicialLocalServiceWrapper(
		AdministradorJudicialLocalService administradorJudicialLocalService) {

		_administradorJudicialLocalService = administradorJudicialLocalService;
	}

	/**
	 * Adds the administrador judicial to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AdministradorJudicialLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param administradorJudicial the administrador judicial
	 * @return the administrador judicial that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial
		addAdministradorJudicial(
			br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial
				administradorJudicial) {

		return _administradorJudicialLocalService.addAdministradorJudicial(
			administradorJudicial);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial
		addAdministradorJudicial(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long qualificacaoId, boolean regimeFalencia, String recuperacao,
			String numeroProcesso, long anexoRecuperacao) {

		return _administradorJudicialLocalService.addAdministradorJudicial(
			serviceContext, qualificacaoId, regimeFalencia, recuperacao,
			numeroProcesso, anexoRecuperacao);
	}

	/**
	 * Creates a new administrador judicial with the primary key. Does not add the administrador judicial to the database.
	 *
	 * @param administradorJudicialId the primary key for the new administrador judicial
	 * @return the new administrador judicial
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial
		createAdministradorJudicial(long administradorJudicialId) {

		return _administradorJudicialLocalService.createAdministradorJudicial(
			administradorJudicialId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _administradorJudicialLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the administrador judicial from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AdministradorJudicialLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param administradorJudicial the administrador judicial
	 * @return the administrador judicial that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial
		deleteAdministradorJudicial(
			br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial
				administradorJudicial) {

		return _administradorJudicialLocalService.deleteAdministradorJudicial(
			administradorJudicial);
	}

	/**
	 * Deletes the administrador judicial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AdministradorJudicialLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param administradorJudicialId the primary key of the administrador judicial
	 * @return the administrador judicial that was removed
	 * @throws PortalException if a administrador judicial with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial
			deleteAdministradorJudicial(long administradorJudicialId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _administradorJudicialLocalService.deleteAdministradorJudicial(
			administradorJudicialId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _administradorJudicialLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _administradorJudicialLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _administradorJudicialLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _administradorJudicialLocalService.dynamicQuery();
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

		return _administradorJudicialLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AdministradorJudicialModelImpl</code>.
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

		return _administradorJudicialLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AdministradorJudicialModelImpl</code>.
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

		return _administradorJudicialLocalService.dynamicQuery(
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

		return _administradorJudicialLocalService.dynamicQueryCount(
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

		return _administradorJudicialLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial
		fetchAdministradorJudicial(long administradorJudicialId) {

		return _administradorJudicialLocalService.fetchAdministradorJudicial(
			administradorJudicialId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _administradorJudicialLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the administrador judicial with the primary key.
	 *
	 * @param administradorJudicialId the primary key of the administrador judicial
	 * @return the administrador judicial
	 * @throws PortalException if a administrador judicial with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial
			getAdministradorJudicial(long administradorJudicialId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _administradorJudicialLocalService.getAdministradorJudicial(
			administradorJudicialId);
	}

	/**
	 * Returns a range of all the administrador judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @return the range of administrador judicials
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial>
			getAdministradorJudicials(int start, int end) {

		return _administradorJudicialLocalService.getAdministradorJudicials(
			start, end);
	}

	/**
	 * Returns the number of administrador judicials.
	 *
	 * @return the number of administrador judicials
	 */
	@Override
	public int getAdministradorJudicialsCount() {
		return _administradorJudicialLocalService.
			getAdministradorJudicialsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _administradorJudicialLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _administradorJudicialLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _administradorJudicialLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the administrador judicial in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AdministradorJudicialLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param administradorJudicial the administrador judicial
	 * @return the administrador judicial that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial
		updateAdministradorJudicial(
			br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial
				administradorJudicial) {

		return _administradorJudicialLocalService.updateAdministradorJudicial(
			administradorJudicial);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial
			updateAdministradorJudicial(
				long administradorJudicialId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext,
				long qualificacaoId, String tipoRegime, String numeroProcesso,
				String anexoAjuste)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _administradorJudicialLocalService.updateAdministradorJudicial(
			administradorJudicialId, serviceContext, qualificacaoId, tipoRegime,
			numeroProcesso, anexoAjuste);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _administradorJudicialLocalService.getBasePersistence();
	}

	@Override
	public AdministradorJudicialLocalService getWrappedService() {
		return _administradorJudicialLocalService;
	}

	@Override
	public void setWrappedService(
		AdministradorJudicialLocalService administradorJudicialLocalService) {

		_administradorJudicialLocalService = administradorJudicialLocalService;
	}

	private AdministradorJudicialLocalService
		_administradorJudicialLocalService;

}