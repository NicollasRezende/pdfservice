/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for BemDireitoAdicional. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.BemDireitoAdicionalLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see BemDireitoAdicionalLocalService
 * @generated
 */
public class BemDireitoAdicionalLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.BemDireitoAdicionalLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the bem direito adicional to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BemDireitoAdicionalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bemDireitoAdicional the bem direito adicional
	 * @return the bem direito adicional that was added
	 */
	public static BemDireitoAdicional addBemDireitoAdicional(
		BemDireitoAdicional bemDireitoAdicional) {

		return getService().addBemDireitoAdicional(bemDireitoAdicional);
	}

	public static BemDireitoAdicional addBemDireitoAdicional(
		long bemId, long propostaId, String descricao, String localizacao,
		String destinacao, String laudoAvaliacao) {

		return getService().addBemDireitoAdicional(
			bemId, propostaId, descricao, localizacao, destinacao,
			laudoAvaliacao);
	}

	/**
	 * Creates a new bem direito adicional with the primary key. Does not add the bem direito adicional to the database.
	 *
	 * @param bemId the primary key for the new bem direito adicional
	 * @return the new bem direito adicional
	 */
	public static BemDireitoAdicional createBemDireitoAdicional(long bemId) {
		return getService().createBemDireitoAdicional(bemId);
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
	 * Deletes the bem direito adicional from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BemDireitoAdicionalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bemDireitoAdicional the bem direito adicional
	 * @return the bem direito adicional that was removed
	 */
	public static BemDireitoAdicional deleteBemDireitoAdicional(
		BemDireitoAdicional bemDireitoAdicional) {

		return getService().deleteBemDireitoAdicional(bemDireitoAdicional);
	}

	/**
	 * Deletes the bem direito adicional with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BemDireitoAdicionalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bemId the primary key of the bem direito adicional
	 * @return the bem direito adicional that was removed
	 * @throws PortalException if a bem direito adicional with the primary key could not be found
	 */
	public static BemDireitoAdicional deleteBemDireitoAdicional(long bemId)
		throws PortalException {

		return getService().deleteBemDireitoAdicional(bemId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BemDireitoAdicionalModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BemDireitoAdicionalModelImpl</code>.
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

	public static BemDireitoAdicional fetchBemDireitoAdicional(long bemId) {
		return getService().fetchBemDireitoAdicional(bemId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the bem direito adicional with the primary key.
	 *
	 * @param bemId the primary key of the bem direito adicional
	 * @return the bem direito adicional
	 * @throws PortalException if a bem direito adicional with the primary key could not be found
	 */
	public static BemDireitoAdicional getBemDireitoAdicional(long bemId)
		throws PortalException {

		return getService().getBemDireitoAdicional(bemId);
	}

	/**
	 * Returns a range of all the bem direito adicionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @return the range of bem direito adicionals
	 */
	public static List<BemDireitoAdicional> getBemDireitoAdicionals(
		int start, int end) {

		return getService().getBemDireitoAdicionals(start, end);
	}

	/**
	 * Returns the number of bem direito adicionals.
	 *
	 * @return the number of bem direito adicionals
	 */
	public static int getBemDireitoAdicionalsCount() {
		return getService().getBemDireitoAdicionalsCount();
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
	 * Updates the bem direito adicional in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BemDireitoAdicionalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bemDireitoAdicional the bem direito adicional
	 * @return the bem direito adicional that was updated
	 */
	public static BemDireitoAdicional updateBemDireitoAdicional(
		BemDireitoAdicional bemDireitoAdicional) {

		return getService().updateBemDireitoAdicional(bemDireitoAdicional);
	}

	public static BemDireitoAdicional updateBemDireitoAdicional(
			long bemId, long propostaId, String descricao, String localizacao,
			String destinacao, String laudoAvaliacao)
		throws PortalException {

		return getService().updateBemDireitoAdicional(
			bemId, propostaId, descricao, localizacao, destinacao,
			laudoAvaliacao);
	}

	public static BemDireitoAdicionalLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<BemDireitoAdicionalLocalService>
		_serviceSnapshot = new Snapshot<>(
			BemDireitoAdicionalLocalServiceUtil.class,
			BemDireitoAdicionalLocalService.class);

}