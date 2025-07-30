/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QualificacaoContribuinteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QualificacaoContribuinteLocalService
 * @generated
 */
public class QualificacaoContribuinteLocalServiceWrapper
	implements QualificacaoContribuinteLocalService,
			   ServiceWrapper<QualificacaoContribuinteLocalService> {

	public QualificacaoContribuinteLocalServiceWrapper() {
		this(null);
	}

	public QualificacaoContribuinteLocalServiceWrapper(
		QualificacaoContribuinteLocalService
			qualificacaoContribuinteLocalService) {

		_qualificacaoContribuinteLocalService =
			qualificacaoContribuinteLocalService;
	}

	/**
	 * Adds the qualificacao contribuinte to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualificacaoContribuinteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualificacaoContribuinte the qualificacao contribuinte
	 * @return the qualificacao contribuinte that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte
		addQualificacaoContribuinte(
			br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte
				qualificacaoContribuinte) {

		return _qualificacaoContribuinteLocalService.
			addQualificacaoContribuinte(qualificacaoContribuinte);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualificacaoContribuinteLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new qualificacao contribuinte with the primary key. Does not add the qualificacao contribuinte to the database.
	 *
	 * @param qualificacaoContribuinteId the primary key for the new qualificacao contribuinte
	 * @return the new qualificacao contribuinte
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte
		createQualificacaoContribuinte(long qualificacaoContribuinteId) {

		return _qualificacaoContribuinteLocalService.
			createQualificacaoContribuinte(qualificacaoContribuinteId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualificacaoContribuinteLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the qualificacao contribuinte with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualificacaoContribuinteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualificacaoContribuinteId the primary key of the qualificacao contribuinte
	 * @return the qualificacao contribuinte that was removed
	 * @throws PortalException if a qualificacao contribuinte with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte
			deleteQualificacaoContribuinte(long qualificacaoContribuinteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualificacaoContribuinteLocalService.
			deleteQualificacaoContribuinte(qualificacaoContribuinteId);
	}

	/**
	 * Deletes the qualificacao contribuinte from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualificacaoContribuinteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualificacaoContribuinte the qualificacao contribuinte
	 * @return the qualificacao contribuinte that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte
		deleteQualificacaoContribuinte(
			br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte
				qualificacaoContribuinte) {

		return _qualificacaoContribuinteLocalService.
			deleteQualificacaoContribuinte(qualificacaoContribuinte);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _qualificacaoContribuinteLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _qualificacaoContribuinteLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qualificacaoContribuinteLocalService.dynamicQuery();
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

		return _qualificacaoContribuinteLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.QualificacaoContribuinteModelImpl</code>.
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

		return _qualificacaoContribuinteLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.QualificacaoContribuinteModelImpl</code>.
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

		return _qualificacaoContribuinteLocalService.dynamicQuery(
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

		return _qualificacaoContribuinteLocalService.dynamicQueryCount(
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

		return _qualificacaoContribuinteLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte
		fetchQualificacaoContribuinte(long qualificacaoContribuinteId) {

		return _qualificacaoContribuinteLocalService.
			fetchQualificacaoContribuinte(qualificacaoContribuinteId);
	}

	/**
	 * Returns the qualificacao contribuinte matching the UUID and group.
	 *
	 * @param uuid the qualificacao contribuinte's UUID
	 * @param groupId the primary key of the group
	 * @return the matching qualificacao contribuinte, or <code>null</code> if a matching qualificacao contribuinte could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte
		fetchQualificacaoContribuinteByUuidAndGroupId(
			String uuid, long groupId) {

		return _qualificacaoContribuinteLocalService.
			fetchQualificacaoContribuinteByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _qualificacaoContribuinteLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _qualificacaoContribuinteLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _qualificacaoContribuinteLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _qualificacaoContribuinteLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualificacaoContribuinteLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the qualificacao contribuinte with the primary key.
	 *
	 * @param qualificacaoContribuinteId the primary key of the qualificacao contribuinte
	 * @return the qualificacao contribuinte
	 * @throws PortalException if a qualificacao contribuinte with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte
			getQualificacaoContribuinte(long qualificacaoContribuinteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualificacaoContribuinteLocalService.
			getQualificacaoContribuinte(qualificacaoContribuinteId);
	}

	/**
	 * Returns the qualificacao contribuinte matching the UUID and group.
	 *
	 * @param uuid the qualificacao contribuinte's UUID
	 * @param groupId the primary key of the group
	 * @return the matching qualificacao contribuinte
	 * @throws PortalException if a matching qualificacao contribuinte could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte
			getQualificacaoContribuinteByUuidAndGroupId(
				String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualificacaoContribuinteLocalService.
			getQualificacaoContribuinteByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the qualificacao contribuintes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.QualificacaoContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualificacao contribuintes
	 * @param end the upper bound of the range of qualificacao contribuintes (not inclusive)
	 * @return the range of qualificacao contribuintes
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte>
			getQualificacaoContribuintes(int start, int end) {

		return _qualificacaoContribuinteLocalService.
			getQualificacaoContribuintes(start, end);
	}

	/**
	 * Returns all the qualificacao contribuintes matching the UUID and company.
	 *
	 * @param uuid the UUID of the qualificacao contribuintes
	 * @param companyId the primary key of the company
	 * @return the matching qualificacao contribuintes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte>
			getQualificacaoContribuintesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _qualificacaoContribuinteLocalService.
			getQualificacaoContribuintesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of qualificacao contribuintes matching the UUID and company.
	 *
	 * @param uuid the UUID of the qualificacao contribuintes
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of qualificacao contribuintes
	 * @param end the upper bound of the range of qualificacao contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching qualificacao contribuintes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte>
			getQualificacaoContribuintesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<br.com.seatecnologia.gdf.negocia.model.
						QualificacaoContribuinte> orderByComparator) {

		return _qualificacaoContribuinteLocalService.
			getQualificacaoContribuintesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of qualificacao contribuintes.
	 *
	 * @return the number of qualificacao contribuintes
	 */
	@Override
	public int getQualificacaoContribuintesCount() {
		return _qualificacaoContribuinteLocalService.
			getQualificacaoContribuintesCount();
	}

	/**
	 * Updates the qualificacao contribuinte in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualificacaoContribuinteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualificacaoContribuinte the qualificacao contribuinte
	 * @return the qualificacao contribuinte that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte
		updateQualificacaoContribuinte(
			br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte
				qualificacaoContribuinte) {

		return _qualificacaoContribuinteLocalService.
			updateQualificacaoContribuinte(qualificacaoContribuinte);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _qualificacaoContribuinteLocalService.getBasePersistence();
	}

	@Override
	public QualificacaoContribuinteLocalService getWrappedService() {
		return _qualificacaoContribuinteLocalService;
	}

	@Override
	public void setWrappedService(
		QualificacaoContribuinteLocalService
			qualificacaoContribuinteLocalService) {

		_qualificacaoContribuinteLocalService =
			qualificacaoContribuinteLocalService;
	}

	private QualificacaoContribuinteLocalService
		_qualificacaoContribuinteLocalService;

}