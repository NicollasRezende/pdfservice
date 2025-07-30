/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for DemonstracaoContabil. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.DemonstracaoContabilLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DemonstracaoContabilLocalService
 * @generated
 */
public class DemonstracaoContabilLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.DemonstracaoContabilLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the demonstracao contabil to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemonstracaoContabilLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demonstracaoContabil the demonstracao contabil
	 * @return the demonstracao contabil that was added
	 */
	public static DemonstracaoContabil addDemonstracaoContabil(
		DemonstracaoContabil demonstracaoContabil) {

		return getService().addDemonstracaoContabil(demonstracaoContabil);
	}

	public static DemonstracaoContabil addDemonstracaoContabil(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long propostaId, long fileEntryId, int tipoDocumento) {

		return getService().addDemonstracaoContabil(
			serviceContext, propostaId, fileEntryId, tipoDocumento);
	}

	/**
	 * Creates a new demonstracao contabil with the primary key. Does not add the demonstracao contabil to the database.
	 *
	 * @param demonstracaoId the primary key for the new demonstracao contabil
	 * @return the new demonstracao contabil
	 */
	public static DemonstracaoContabil createDemonstracaoContabil(
		long demonstracaoId) {

		return getService().createDemonstracaoContabil(demonstracaoId);
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
	 * Deletes the demonstracao contabil from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemonstracaoContabilLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demonstracaoContabil the demonstracao contabil
	 * @return the demonstracao contabil that was removed
	 */
	public static DemonstracaoContabil deleteDemonstracaoContabil(
		DemonstracaoContabil demonstracaoContabil) {

		return getService().deleteDemonstracaoContabil(demonstracaoContabil);
	}

	/**
	 * Deletes the demonstracao contabil with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemonstracaoContabilLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demonstracaoId the primary key of the demonstracao contabil
	 * @return the demonstracao contabil that was removed
	 * @throws PortalException if a demonstracao contabil with the primary key could not be found
	 */
	public static DemonstracaoContabil deleteDemonstracaoContabil(
			long demonstracaoId)
		throws PortalException {

		return getService().deleteDemonstracaoContabil(demonstracaoId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DemonstracaoContabilModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DemonstracaoContabilModelImpl</code>.
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

	public static DemonstracaoContabil fetchDemonstracaoContabil(
		long demonstracaoId) {

		return getService().fetchDemonstracaoContabil(demonstracaoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the demonstracao contabil with the primary key.
	 *
	 * @param demonstracaoId the primary key of the demonstracao contabil
	 * @return the demonstracao contabil
	 * @throws PortalException if a demonstracao contabil with the primary key could not be found
	 */
	public static DemonstracaoContabil getDemonstracaoContabil(
			long demonstracaoId)
		throws PortalException {

		return getService().getDemonstracaoContabil(demonstracaoId);
	}

	/**
	 * Returns a range of all the demonstracao contabils.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @return the range of demonstracao contabils
	 */
	public static List<DemonstracaoContabil> getDemonstracaoContabils(
		int start, int end) {

		return getService().getDemonstracaoContabils(start, end);
	}

	/**
	 * Returns the number of demonstracao contabils.
	 *
	 * @return the number of demonstracao contabils
	 */
	public static int getDemonstracaoContabilsCount() {
		return getService().getDemonstracaoContabilsCount();
	}

	public static List<DemonstracaoContabil>
		getDemonstracoesContabilByPropostaId(long propostaId) {

		return getService().getDemonstracoesContabilByPropostaId(propostaId);
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
	 * Updates the demonstracao contabil in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemonstracaoContabilLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demonstracaoContabil the demonstracao contabil
	 * @return the demonstracao contabil that was updated
	 */
	public static DemonstracaoContabil updateDemonstracaoContabil(
		DemonstracaoContabil demonstracaoContabil) {

		return getService().updateDemonstracaoContabil(demonstracaoContabil);
	}

	public static DemonstracaoContabil updateDemonstracaoContabil(
			long demonstracaoId, long propostaId, String tipoDemonstracao,
			long fileEntryId)
		throws PortalException {

		return getService().updateDemonstracaoContabil(
			demonstracaoId, propostaId, tipoDemonstracao, fileEntryId);
	}

	public static DemonstracaoContabilLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<DemonstracaoContabilLocalService>
		_serviceSnapshot = new Snapshot<>(
			DemonstracaoContabilLocalServiceUtil.class,
			DemonstracaoContabilLocalService.class);

}