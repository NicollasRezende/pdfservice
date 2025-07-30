/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ComprovanteHonorario. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.ComprovanteHonorarioLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ComprovanteHonorarioLocalService
 * @generated
 */
public class ComprovanteHonorarioLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.ComprovanteHonorarioLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the comprovante honorario to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ComprovanteHonorarioLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param comprovanteHonorario the comprovante honorario
	 * @return the comprovante honorario that was added
	 */
	public static ComprovanteHonorario addComprovanteHonorario(
		ComprovanteHonorario comprovanteHonorario) {

		return getService().addComprovanteHonorario(comprovanteHonorario);
	}

	public static ComprovanteHonorario addComprovanteHonorario(
		long comprovanteId, long propostaId, double valorPago,
		java.util.Date dataPagamento, long fileEntryId) {

		return getService().addComprovanteHonorario(
			comprovanteId, propostaId, valorPago, dataPagamento, fileEntryId);
	}

	/**
	 * Creates a new comprovante honorario with the primary key. Does not add the comprovante honorario to the database.
	 *
	 * @param comprovanteId the primary key for the new comprovante honorario
	 * @return the new comprovante honorario
	 */
	public static ComprovanteHonorario createComprovanteHonorario(
		long comprovanteId) {

		return getService().createComprovanteHonorario(comprovanteId);
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
	 * Deletes the comprovante honorario from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ComprovanteHonorarioLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param comprovanteHonorario the comprovante honorario
	 * @return the comprovante honorario that was removed
	 */
	public static ComprovanteHonorario deleteComprovanteHonorario(
		ComprovanteHonorario comprovanteHonorario) {

		return getService().deleteComprovanteHonorario(comprovanteHonorario);
	}

	/**
	 * Deletes the comprovante honorario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ComprovanteHonorarioLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param comprovanteId the primary key of the comprovante honorario
	 * @return the comprovante honorario that was removed
	 * @throws PortalException if a comprovante honorario with the primary key could not be found
	 */
	public static ComprovanteHonorario deleteComprovanteHonorario(
			long comprovanteId)
		throws PortalException {

		return getService().deleteComprovanteHonorario(comprovanteId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ComprovanteHonorarioModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ComprovanteHonorarioModelImpl</code>.
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

	public static ComprovanteHonorario fetchComprovanteHonorario(
		long comprovanteId) {

		return getService().fetchComprovanteHonorario(comprovanteId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the comprovante honorario with the primary key.
	 *
	 * @param comprovanteId the primary key of the comprovante honorario
	 * @return the comprovante honorario
	 * @throws PortalException if a comprovante honorario with the primary key could not be found
	 */
	public static ComprovanteHonorario getComprovanteHonorario(
			long comprovanteId)
		throws PortalException {

		return getService().getComprovanteHonorario(comprovanteId);
	}

	public static List<ComprovanteHonorario>
		getComprovanteHonorarioByPropostaId(long propostaId) {

		return getService().getComprovanteHonorarioByPropostaId(propostaId);
	}

	/**
	 * Returns a range of all the comprovante honorarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @return the range of comprovante honorarios
	 */
	public static List<ComprovanteHonorario> getComprovanteHonorarios(
		int start, int end) {

		return getService().getComprovanteHonorarios(start, end);
	}

	/**
	 * Returns the number of comprovante honorarios.
	 *
	 * @return the number of comprovante honorarios
	 */
	public static int getComprovanteHonorariosCount() {
		return getService().getComprovanteHonorariosCount();
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
	 * Updates the comprovante honorario in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ComprovanteHonorarioLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param comprovanteHonorario the comprovante honorario
	 * @return the comprovante honorario that was updated
	 */
	public static ComprovanteHonorario updateComprovanteHonorario(
		ComprovanteHonorario comprovanteHonorario) {

		return getService().updateComprovanteHonorario(comprovanteHonorario);
	}

	public static ComprovanteHonorario updateComprovanteHonorario(
			long comprovanteId, long propostaId, double valorPago,
			java.util.Date dataPagamento, long fileEntryId)
		throws PortalException {

		return getService().updateComprovanteHonorario(
			comprovanteId, propostaId, valorPago, dataPagamento, fileEntryId);
	}

	public static ComprovanteHonorarioLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ComprovanteHonorarioLocalService>
		_serviceSnapshot = new Snapshot<>(
			ComprovanteHonorarioLocalServiceUtil.class,
			ComprovanteHonorarioLocalService.class);

}