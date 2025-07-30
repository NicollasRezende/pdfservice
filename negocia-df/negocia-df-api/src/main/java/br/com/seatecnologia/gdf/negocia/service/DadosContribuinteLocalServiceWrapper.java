/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link DadosContribuinteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DadosContribuinteLocalService
 * @generated
 */
public class DadosContribuinteLocalServiceWrapper
	implements DadosContribuinteLocalService,
			   ServiceWrapper<DadosContribuinteLocalService> {

	public DadosContribuinteLocalServiceWrapper() {
		this(null);
	}

	public DadosContribuinteLocalServiceWrapper(
		DadosContribuinteLocalService dadosContribuinteLocalService) {

		_dadosContribuinteLocalService = dadosContribuinteLocalService;
	}

	/**
	 * Adds the dados contribuinte to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DadosContribuinteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dadosContribuinte the dados contribuinte
	 * @return the dados contribuinte that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
		addDadosContribuinte(
			br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
				dadosContribuinte) {

		return _dadosContribuinteLocalService.addDadosContribuinte(
			dadosContribuinte);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
		addDadosContribuinte(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long qualificacaoId, long propostaId) {

		return _dadosContribuinteLocalService.addDadosContribuinte(
			serviceContext, qualificacaoId, propostaId);
	}

	/**
	 * Creates a new dados contribuinte with the primary key. Does not add the dados contribuinte to the database.
	 *
	 * @param dadosContribuinteId the primary key for the new dados contribuinte
	 * @return the new dados contribuinte
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
		createDadosContribuinte(long dadosContribuinteId) {

		return _dadosContribuinteLocalService.createDadosContribuinte(
			dadosContribuinteId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dadosContribuinteLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the dados contribuinte from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DadosContribuinteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dadosContribuinte the dados contribuinte
	 * @return the dados contribuinte that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
		deleteDadosContribuinte(
			br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
				dadosContribuinte) {

		return _dadosContribuinteLocalService.deleteDadosContribuinte(
			dadosContribuinte);
	}

	/**
	 * Deletes the dados contribuinte with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DadosContribuinteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dadosContribuinteId the primary key of the dados contribuinte
	 * @return the dados contribuinte that was removed
	 * @throws PortalException if a dados contribuinte with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
			deleteDadosContribuinte(long dadosContribuinteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dadosContribuinteLocalService.deleteDadosContribuinte(
			dadosContribuinteId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dadosContribuinteLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _dadosContribuinteLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _dadosContribuinteLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dadosContribuinteLocalService.dynamicQuery();
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

		return _dadosContribuinteLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DadosContribuinteModelImpl</code>.
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

		return _dadosContribuinteLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DadosContribuinteModelImpl</code>.
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

		return _dadosContribuinteLocalService.dynamicQuery(
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

		return _dadosContribuinteLocalService.dynamicQueryCount(dynamicQuery);
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

		return _dadosContribuinteLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
		fetchDadosContribuinte(long dadosContribuinteId) {

		return _dadosContribuinteLocalService.fetchDadosContribuinte(
			dadosContribuinteId);
	}

	/**
	 * Returns the dados contribuinte matching the UUID and group.
	 *
	 * @param uuid the dados contribuinte's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
		fetchDadosContribuinteByUuidAndGroupId(String uuid, long groupId) {

		return _dadosContribuinteLocalService.
			fetchDadosContribuinteByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _dadosContribuinteLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the dados contribuinte with the primary key.
	 *
	 * @param dadosContribuinteId the primary key of the dados contribuinte
	 * @return the dados contribuinte
	 * @throws PortalException if a dados contribuinte with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
			getDadosContribuinte(long dadosContribuinteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dadosContribuinteLocalService.getDadosContribuinte(
			dadosContribuinteId);
	}

	/**
	 * Returns the dados contribuinte matching the UUID and group.
	 *
	 * @param uuid the dados contribuinte's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dados contribuinte
	 * @throws PortalException if a matching dados contribuinte could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
			getDadosContribuinteByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dadosContribuinteLocalService.
			getDadosContribuinteByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the dados contribuintes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @return the range of dados contribuintes
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.DadosContribuinte>
			getDadosContribuintes(int start, int end) {

		return _dadosContribuinteLocalService.getDadosContribuintes(start, end);
	}

	/**
	 * Returns all the dados contribuintes matching the UUID and company.
	 *
	 * @param uuid the UUID of the dados contribuintes
	 * @param companyId the primary key of the company
	 * @return the matching dados contribuintes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.DadosContribuinte>
			getDadosContribuintesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _dadosContribuinteLocalService.
			getDadosContribuintesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of dados contribuintes matching the UUID and company.
	 *
	 * @param uuid the UUID of the dados contribuintes
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching dados contribuintes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.DadosContribuinte>
			getDadosContribuintesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<br.com.seatecnologia.gdf.negocia.model.DadosContribuinte>
						orderByComparator) {

		return _dadosContribuinteLocalService.
			getDadosContribuintesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of dados contribuintes.
	 *
	 * @return the number of dados contribuintes
	 */
	@Override
	public int getDadosContribuintesCount() {
		return _dadosContribuinteLocalService.getDadosContribuintesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _dadosContribuinteLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _dadosContribuinteLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _dadosContribuinteLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dadosContribuinteLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the dados contribuinte in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DadosContribuinteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dadosContribuinte the dados contribuinte
	 * @return the dados contribuinte that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
		updateDadosContribuinte(
			br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
				dadosContribuinte) {

		return _dadosContribuinteLocalService.updateDadosContribuinte(
			dadosContribuinte);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
			updateDadosContribuinte(
				long dadosContribuinteId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext,
				long qualificacaoId, long socios, long controladores,
				long administradores, long gestores, long empresasGrupo)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dadosContribuinteLocalService.updateDadosContribuinte(
			dadosContribuinteId, serviceContext, qualificacaoId, socios,
			controladores, administradores, gestores, empresasGrupo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _dadosContribuinteLocalService.getBasePersistence();
	}

	@Override
	public DadosContribuinteLocalService getWrappedService() {
		return _dadosContribuinteLocalService;
	}

	@Override
	public void setWrappedService(
		DadosContribuinteLocalService dadosContribuinteLocalService) {

		_dadosContribuinteLocalService = dadosContribuinteLocalService;
	}

	private DadosContribuinteLocalService _dadosContribuinteLocalService;

}