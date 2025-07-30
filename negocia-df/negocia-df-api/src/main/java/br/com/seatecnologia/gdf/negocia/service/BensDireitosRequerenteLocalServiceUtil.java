/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for BensDireitosRequerente. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.BensDireitosRequerenteLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see BensDireitosRequerenteLocalService
 * @generated
 */
public class BensDireitosRequerenteLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.BensDireitosRequerenteLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the bens direitos requerente to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BensDireitosRequerenteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bensDireitosRequerente the bens direitos requerente
	 * @return the bens direitos requerente that was added
	 */
	public static BensDireitosRequerente addBensDireitosRequerente(
		BensDireitosRequerente bensDireitosRequerente) {

		return getService().addBensDireitosRequerente(bensDireitosRequerente);
	}

	public static BensDireitosRequerente addBensDireitosRequerente(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long propostaId, String descricao, String localizacaoDestinacao) {

		return getService().addBensDireitosRequerente(
			serviceContext, propostaId, descricao, localizacaoDestinacao);
	}

	/**
	 * Creates a new bens direitos requerente with the primary key. Does not add the bens direitos requerente to the database.
	 *
	 * @param bemId the primary key for the new bens direitos requerente
	 * @return the new bens direitos requerente
	 */
	public static BensDireitosRequerente createBensDireitosRequerente(
		long bemId) {

		return getService().createBensDireitosRequerente(bemId);
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
	 * Deletes the bens direitos requerente from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BensDireitosRequerenteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bensDireitosRequerente the bens direitos requerente
	 * @return the bens direitos requerente that was removed
	 */
	public static BensDireitosRequerente deleteBensDireitosRequerente(
		BensDireitosRequerente bensDireitosRequerente) {

		return getService().deleteBensDireitosRequerente(
			bensDireitosRequerente);
	}

	/**
	 * Deletes the bens direitos requerente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BensDireitosRequerenteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bemId the primary key of the bens direitos requerente
	 * @return the bens direitos requerente that was removed
	 * @throws PortalException if a bens direitos requerente with the primary key could not be found
	 */
	public static BensDireitosRequerente deleteBensDireitosRequerente(
			long bemId)
		throws PortalException {

		return getService().deleteBensDireitosRequerente(bemId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BensDireitosRequerenteModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BensDireitosRequerenteModelImpl</code>.
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

	public static BensDireitosRequerente fetchBensDireitosRequerente(
		long bemId) {

		return getService().fetchBensDireitosRequerente(bemId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the bens direitos requerente with the primary key.
	 *
	 * @param bemId the primary key of the bens direitos requerente
	 * @return the bens direitos requerente
	 * @throws PortalException if a bens direitos requerente with the primary key could not be found
	 */
	public static BensDireitosRequerente getBensDireitosRequerente(long bemId)
		throws PortalException {

		return getService().getBensDireitosRequerente(bemId);
	}

	/**
	 * Returns a range of all the bens direitos requerentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @return the range of bens direitos requerentes
	 */
	public static List<BensDireitosRequerente> getBensDireitosRequerentes(
		int start, int end) {

		return getService().getBensDireitosRequerentes(start, end);
	}

	public static List<BensDireitosRequerente>
		getBensDireitosRequerentesByPropostaId(long propostaId) {

		return getService().getBensDireitosRequerentesByPropostaId(propostaId);
	}

	/**
	 * Returns the number of bens direitos requerentes.
	 *
	 * @return the number of bens direitos requerentes
	 */
	public static int getBensDireitosRequerentesCount() {
		return getService().getBensDireitosRequerentesCount();
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
	 * Updates the bens direitos requerente in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BensDireitosRequerenteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bensDireitosRequerente the bens direitos requerente
	 * @return the bens direitos requerente that was updated
	 */
	public static BensDireitosRequerente updateBensDireitosRequerente(
		BensDireitosRequerente bensDireitosRequerente) {

		return getService().updateBensDireitosRequerente(
			bensDireitosRequerente);
	}

	public static BensDireitosRequerenteLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<BensDireitosRequerenteLocalService>
		_serviceSnapshot = new Snapshot<>(
			BensDireitosRequerenteLocalServiceUtil.class,
			BensDireitosRequerenteLocalService.class);

}