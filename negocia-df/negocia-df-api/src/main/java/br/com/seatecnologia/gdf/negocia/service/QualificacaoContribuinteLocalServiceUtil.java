/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for QualificacaoContribuinte. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.QualificacaoContribuinteLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see QualificacaoContribuinteLocalService
 * @generated
 */
public class QualificacaoContribuinteLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.QualificacaoContribuinteLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static QualificacaoContribuinte addQualificacaoContribuinte(
		QualificacaoContribuinte qualificacaoContribuinte) {

		return getService().addQualificacaoContribuinte(
			qualificacaoContribuinte);
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
	 * Creates a new qualificacao contribuinte with the primary key. Does not add the qualificacao contribuinte to the database.
	 *
	 * @param qualificacaoContribuinteId the primary key for the new qualificacao contribuinte
	 * @return the new qualificacao contribuinte
	 */
	public static QualificacaoContribuinte createQualificacaoContribuinte(
		long qualificacaoContribuinteId) {

		return getService().createQualificacaoContribuinte(
			qualificacaoContribuinteId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	public static QualificacaoContribuinte deleteQualificacaoContribuinte(
			long qualificacaoContribuinteId)
		throws PortalException {

		return getService().deleteQualificacaoContribuinte(
			qualificacaoContribuinteId);
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
	public static QualificacaoContribuinte deleteQualificacaoContribuinte(
		QualificacaoContribuinte qualificacaoContribuinte) {

		return getService().deleteQualificacaoContribuinte(
			qualificacaoContribuinte);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.QualificacaoContribuinteModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.QualificacaoContribuinteModelImpl</code>.
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

	public static QualificacaoContribuinte fetchQualificacaoContribuinte(
		long qualificacaoContribuinteId) {

		return getService().fetchQualificacaoContribuinte(
			qualificacaoContribuinteId);
	}

	/**
	 * Returns the qualificacao contribuinte matching the UUID and group.
	 *
	 * @param uuid the qualificacao contribuinte's UUID
	 * @param groupId the primary key of the group
	 * @return the matching qualificacao contribuinte, or <code>null</code> if a matching qualificacao contribuinte could not be found
	 */
	public static QualificacaoContribuinte
		fetchQualificacaoContribuinteByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchQualificacaoContribuinteByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
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
	 * Returns the qualificacao contribuinte with the primary key.
	 *
	 * @param qualificacaoContribuinteId the primary key of the qualificacao contribuinte
	 * @return the qualificacao contribuinte
	 * @throws PortalException if a qualificacao contribuinte with the primary key could not be found
	 */
	public static QualificacaoContribuinte getQualificacaoContribuinte(
			long qualificacaoContribuinteId)
		throws PortalException {

		return getService().getQualificacaoContribuinte(
			qualificacaoContribuinteId);
	}

	/**
	 * Returns the qualificacao contribuinte matching the UUID and group.
	 *
	 * @param uuid the qualificacao contribuinte's UUID
	 * @param groupId the primary key of the group
	 * @return the matching qualificacao contribuinte
	 * @throws PortalException if a matching qualificacao contribuinte could not be found
	 */
	public static QualificacaoContribuinte
			getQualificacaoContribuinteByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getQualificacaoContribuinteByUuidAndGroupId(
			uuid, groupId);
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
	public static List<QualificacaoContribuinte> getQualificacaoContribuintes(
		int start, int end) {

		return getService().getQualificacaoContribuintes(start, end);
	}

	/**
	 * Returns all the qualificacao contribuintes matching the UUID and company.
	 *
	 * @param uuid the UUID of the qualificacao contribuintes
	 * @param companyId the primary key of the company
	 * @return the matching qualificacao contribuintes, or an empty list if no matches were found
	 */
	public static List<QualificacaoContribuinte>
		getQualificacaoContribuintesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getQualificacaoContribuintesByUuidAndCompanyId(
			uuid, companyId);
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
	public static List<QualificacaoContribuinte>
		getQualificacaoContribuintesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<QualificacaoContribuinte> orderByComparator) {

		return getService().getQualificacaoContribuintesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of qualificacao contribuintes.
	 *
	 * @return the number of qualificacao contribuintes
	 */
	public static int getQualificacaoContribuintesCount() {
		return getService().getQualificacaoContribuintesCount();
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
	public static QualificacaoContribuinte updateQualificacaoContribuinte(
		QualificacaoContribuinte qualificacaoContribuinte) {

		return getService().updateQualificacaoContribuinte(
			qualificacaoContribuinte);
	}

	public static QualificacaoContribuinteLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<QualificacaoContribuinteLocalService>
		_serviceSnapshot = new Snapshot<>(
			QualificacaoContribuinteLocalServiceUtil.class,
			QualificacaoContribuinteLocalService.class);

}