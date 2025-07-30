/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.DadosContribuinte;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for DadosContribuinte. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.DadosContribuinteLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DadosContribuinteLocalService
 * @generated
 */
public class DadosContribuinteLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.DadosContribuinteLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static DadosContribuinte addDadosContribuinte(
		DadosContribuinte dadosContribuinte) {

		return getService().addDadosContribuinte(dadosContribuinte);
	}

	public static DadosContribuinte addDadosContribuinte(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long qualificacaoId, long propostaId) {

		return getService().addDadosContribuinte(
			serviceContext, qualificacaoId, propostaId);
	}

	/**
	 * Creates a new dados contribuinte with the primary key. Does not add the dados contribuinte to the database.
	 *
	 * @param dadosContribuinteId the primary key for the new dados contribuinte
	 * @return the new dados contribuinte
	 */
	public static DadosContribuinte createDadosContribuinte(
		long dadosContribuinteId) {

		return getService().createDadosContribuinte(dadosContribuinteId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
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
	public static DadosContribuinte deleteDadosContribuinte(
		DadosContribuinte dadosContribuinte) {

		return getService().deleteDadosContribuinte(dadosContribuinte);
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
	public static DadosContribuinte deleteDadosContribuinte(
			long dadosContribuinteId)
		throws PortalException {

		return getService().deleteDadosContribuinte(dadosContribuinteId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static DadosContribuinte fetchDadosContribuinte(
		long dadosContribuinteId) {

		return getService().fetchDadosContribuinte(dadosContribuinteId);
	}

	/**
	 * Returns the dados contribuinte matching the UUID and group.
	 *
	 * @param uuid the dados contribuinte's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	public static DadosContribuinte fetchDadosContribuinteByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchDadosContribuinteByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the dados contribuinte with the primary key.
	 *
	 * @param dadosContribuinteId the primary key of the dados contribuinte
	 * @return the dados contribuinte
	 * @throws PortalException if a dados contribuinte with the primary key could not be found
	 */
	public static DadosContribuinte getDadosContribuinte(
			long dadosContribuinteId)
		throws PortalException {

		return getService().getDadosContribuinte(dadosContribuinteId);
	}

	/**
	 * Returns the dados contribuinte matching the UUID and group.
	 *
	 * @param uuid the dados contribuinte's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dados contribuinte
	 * @throws PortalException if a matching dados contribuinte could not be found
	 */
	public static DadosContribuinte getDadosContribuinteByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getDadosContribuinteByUuidAndGroupId(uuid, groupId);
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
	public static List<DadosContribuinte> getDadosContribuintes(
		int start, int end) {

		return getService().getDadosContribuintes(start, end);
	}

	/**
	 * Returns all the dados contribuintes matching the UUID and company.
	 *
	 * @param uuid the UUID of the dados contribuintes
	 * @param companyId the primary key of the company
	 * @return the matching dados contribuintes, or an empty list if no matches were found
	 */
	public static List<DadosContribuinte>
		getDadosContribuintesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getDadosContribuintesByUuidAndCompanyId(
			uuid, companyId);
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
	public static List<DadosContribuinte>
		getDadosContribuintesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<DadosContribuinte> orderByComparator) {

		return getService().getDadosContribuintesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of dados contribuintes.
	 *
	 * @return the number of dados contribuintes
	 */
	public static int getDadosContribuintesCount() {
		return getService().getDadosContribuintesCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static DadosContribuinte updateDadosContribuinte(
		DadosContribuinte dadosContribuinte) {

		return getService().updateDadosContribuinte(dadosContribuinte);
	}

	public static DadosContribuinte updateDadosContribuinte(
			long dadosContribuinteId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long qualificacaoId, long socios, long controladores,
			long administradores, long gestores, long empresasGrupo)
		throws PortalException {

		return getService().updateDadosContribuinte(
			dadosContribuinteId, serviceContext, qualificacaoId, socios,
			controladores, administradores, gestores, empresasGrupo);
	}

	public static DadosContribuinteLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<DadosContribuinteLocalService>
		_serviceSnapshot = new Snapshot<>(
			DadosContribuinteLocalServiceUtil.class,
			DadosContribuinteLocalService.class);

}