/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.TermoAssinado;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for TermoAssinado. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.TermoAssinadoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TermoAssinadoLocalService
 * @generated
 */
public class TermoAssinadoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.TermoAssinadoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static TermoAssinado addTermoAssinado(
		long termoId, long propostaId, String urlTermo, String arquivoPdf,
		String parte) {

		return getService().addTermoAssinado(
			termoId, propostaId, urlTermo, arquivoPdf, parte);
	}

	/**
	 * Adds the termo assinado to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TermoAssinadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param termoAssinado the termo assinado
	 * @return the termo assinado that was added
	 */
	public static TermoAssinado addTermoAssinado(TermoAssinado termoAssinado) {
		return getService().addTermoAssinado(termoAssinado);
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
	 * Creates a new termo assinado with the primary key. Does not add the termo assinado to the database.
	 *
	 * @param termoId the primary key for the new termo assinado
	 * @return the new termo assinado
	 */
	public static TermoAssinado createTermoAssinado(long termoId) {
		return getService().createTermoAssinado(termoId);
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
	 * Deletes the termo assinado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TermoAssinadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param termoId the primary key of the termo assinado
	 * @return the termo assinado that was removed
	 * @throws PortalException if a termo assinado with the primary key could not be found
	 */
	public static TermoAssinado deleteTermoAssinado(long termoId)
		throws PortalException {

		return getService().deleteTermoAssinado(termoId);
	}

	/**
	 * Deletes the termo assinado from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TermoAssinadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param termoAssinado the termo assinado
	 * @return the termo assinado that was removed
	 */
	public static TermoAssinado deleteTermoAssinado(
		TermoAssinado termoAssinado) {

		return getService().deleteTermoAssinado(termoAssinado);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.TermoAssinadoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.TermoAssinadoModelImpl</code>.
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

	public static TermoAssinado fetchTermoAssinado(long termoId) {
		return getService().fetchTermoAssinado(termoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
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
	 * Returns the termo assinado with the primary key.
	 *
	 * @param termoId the primary key of the termo assinado
	 * @return the termo assinado
	 * @throws PortalException if a termo assinado with the primary key could not be found
	 */
	public static TermoAssinado getTermoAssinado(long termoId)
		throws PortalException {

		return getService().getTermoAssinado(termoId);
	}

	/**
	 * Returns a range of all the termo assinados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @return the range of termo assinados
	 */
	public static List<TermoAssinado> getTermoAssinados(int start, int end) {
		return getService().getTermoAssinados(start, end);
	}

	/**
	 * Returns the number of termo assinados.
	 *
	 * @return the number of termo assinados
	 */
	public static int getTermoAssinadosCount() {
		return getService().getTermoAssinadosCount();
	}

	public static TermoAssinado updateTermoAssinado(
			long termoId, long propostaId, String urlTermo, String arquivoPdf,
			String parte)
		throws PortalException {

		return getService().updateTermoAssinado(
			termoId, propostaId, urlTermo, arquivoPdf, parte);
	}

	/**
	 * Updates the termo assinado in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TermoAssinadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param termoAssinado the termo assinado
	 * @return the termo assinado that was updated
	 */
	public static TermoAssinado updateTermoAssinado(
		TermoAssinado termoAssinado) {

		return getService().updateTermoAssinado(termoAssinado);
	}

	public static TermoAssinadoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<TermoAssinadoLocalService> _serviceSnapshot =
		new Snapshot<>(
			TermoAssinadoLocalServiceUtil.class,
			TermoAssinadoLocalService.class);

}