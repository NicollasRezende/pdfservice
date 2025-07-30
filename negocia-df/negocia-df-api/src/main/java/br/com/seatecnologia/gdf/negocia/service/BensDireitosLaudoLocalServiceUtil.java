/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for BensDireitosLaudo. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.BensDireitosLaudoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see BensDireitosLaudoLocalService
 * @generated
 */
public class BensDireitosLaudoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.BensDireitosLaudoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the bens direitos laudo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BensDireitosLaudoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bensDireitosLaudo the bens direitos laudo
	 * @return the bens direitos laudo that was added
	 */
	public static BensDireitosLaudo addBensDireitosLaudo(
		BensDireitosLaudo bensDireitosLaudo) {

		return getService().addBensDireitosLaudo(bensDireitosLaudo);
	}

	public static BensDireitosLaudo addBensDireitosLaudo(
		long bemId, long laudoAvaliacao) {

		return getService().addBensDireitosLaudo(bemId, laudoAvaliacao);
	}

	/**
	 * Creates a new bens direitos laudo with the primary key. Does not add the bens direitos laudo to the database.
	 *
	 * @param bensDireitosLaudoId the primary key for the new bens direitos laudo
	 * @return the new bens direitos laudo
	 */
	public static BensDireitosLaudo createBensDireitosLaudo(
		long bensDireitosLaudoId) {

		return getService().createBensDireitosLaudo(bensDireitosLaudoId);
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
	 * Deletes the bens direitos laudo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BensDireitosLaudoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bensDireitosLaudo the bens direitos laudo
	 * @return the bens direitos laudo that was removed
	 */
	public static BensDireitosLaudo deleteBensDireitosLaudo(
		BensDireitosLaudo bensDireitosLaudo) {

		return getService().deleteBensDireitosLaudo(bensDireitosLaudo);
	}

	/**
	 * Deletes the bens direitos laudo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BensDireitosLaudoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bensDireitosLaudoId the primary key of the bens direitos laudo
	 * @return the bens direitos laudo that was removed
	 * @throws PortalException if a bens direitos laudo with the primary key could not be found
	 */
	public static BensDireitosLaudo deleteBensDireitosLaudo(
			long bensDireitosLaudoId)
		throws PortalException {

		return getService().deleteBensDireitosLaudo(bensDireitosLaudoId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BensDireitosLaudoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BensDireitosLaudoModelImpl</code>.
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

	public static BensDireitosLaudo fetchBensDireitosLaudo(
		long bensDireitosLaudoId) {

		return getService().fetchBensDireitosLaudo(bensDireitosLaudoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the bens direitos laudo with the primary key.
	 *
	 * @param bensDireitosLaudoId the primary key of the bens direitos laudo
	 * @return the bens direitos laudo
	 * @throws PortalException if a bens direitos laudo with the primary key could not be found
	 */
	public static BensDireitosLaudo getBensDireitosLaudo(
			long bensDireitosLaudoId)
		throws PortalException {

		return getService().getBensDireitosLaudo(bensDireitosLaudoId);
	}

	/**
	 * Returns a range of all the bens direitos laudos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @return the range of bens direitos laudos
	 */
	public static List<BensDireitosLaudo> getBensDireitosLaudos(
		int start, int end) {

		return getService().getBensDireitosLaudos(start, end);
	}

	/**
	 * Returns the number of bens direitos laudos.
	 *
	 * @return the number of bens direitos laudos
	 */
	public static int getBensDireitosLaudosCount() {
		return getService().getBensDireitosLaudosCount();
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
	 * Updates the bens direitos laudo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BensDireitosLaudoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bensDireitosLaudo the bens direitos laudo
	 * @return the bens direitos laudo that was updated
	 */
	public static BensDireitosLaudo updateBensDireitosLaudo(
		BensDireitosLaudo bensDireitosLaudo) {

		return getService().updateBensDireitosLaudo(bensDireitosLaudo);
	}

	public static BensDireitosLaudoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<BensDireitosLaudoLocalService>
		_serviceSnapshot = new Snapshot<>(
			BensDireitosLaudoLocalServiceUtil.class,
			BensDireitosLaudoLocalService.class);

}