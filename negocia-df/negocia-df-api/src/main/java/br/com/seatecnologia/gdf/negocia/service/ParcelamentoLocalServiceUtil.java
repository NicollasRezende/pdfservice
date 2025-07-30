/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.Parcelamento;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Parcelamento. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.ParcelamentoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ParcelamentoLocalService
 * @generated
 */
public class ParcelamentoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.ParcelamentoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Parcelamento addParcelamento(
		long parcelamentoId, long propostaId, int numeroParcelas,
		double valorEntrada, java.util.Date dataPrimeiraParcela,
		double valorPrimeiraParcela) {

		return getService().addParcelamento(
			parcelamentoId, propostaId, numeroParcelas, valorEntrada,
			dataPrimeiraParcela, valorPrimeiraParcela);
	}

	/**
	 * Adds the parcelamento to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParcelamentoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param parcelamento the parcelamento
	 * @return the parcelamento that was added
	 */
	public static Parcelamento addParcelamento(Parcelamento parcelamento) {
		return getService().addParcelamento(parcelamento);
	}

	/**
	 * Creates a new parcelamento with the primary key. Does not add the parcelamento to the database.
	 *
	 * @param parcelamentoId the primary key for the new parcelamento
	 * @return the new parcelamento
	 */
	public static Parcelamento createParcelamento(long parcelamentoId) {
		return getService().createParcelamento(parcelamentoId);
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
	 * Deletes the parcelamento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParcelamentoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param parcelamentoId the primary key of the parcelamento
	 * @return the parcelamento that was removed
	 * @throws PortalException if a parcelamento with the primary key could not be found
	 */
	public static Parcelamento deleteParcelamento(long parcelamentoId)
		throws PortalException {

		return getService().deleteParcelamento(parcelamentoId);
	}

	/**
	 * Deletes the parcelamento from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParcelamentoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param parcelamento the parcelamento
	 * @return the parcelamento that was removed
	 */
	public static Parcelamento deleteParcelamento(Parcelamento parcelamento) {
		return getService().deleteParcelamento(parcelamento);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ParcelamentoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ParcelamentoModelImpl</code>.
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

	public static Parcelamento fetchParcelamento(long parcelamentoId) {
		return getService().fetchParcelamento(parcelamentoId);
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
	 * Returns the parcelamento with the primary key.
	 *
	 * @param parcelamentoId the primary key of the parcelamento
	 * @return the parcelamento
	 * @throws PortalException if a parcelamento with the primary key could not be found
	 */
	public static Parcelamento getParcelamento(long parcelamentoId)
		throws PortalException {

		return getService().getParcelamento(parcelamentoId);
	}

	/**
	 * Returns a range of all the parcelamentos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @return the range of parcelamentos
	 */
	public static List<Parcelamento> getParcelamentos(int start, int end) {
		return getService().getParcelamentos(start, end);
	}

	/**
	 * Returns the number of parcelamentos.
	 *
	 * @return the number of parcelamentos
	 */
	public static int getParcelamentosCount() {
		return getService().getParcelamentosCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static Parcelamento updateParcelamento(
			long parcelamentoId, long propostaId, int numeroParcelas,
			double valorEntrada, java.util.Date dataPrimeiraParcela,
			double valorPrimeiraParcela)
		throws PortalException {

		return getService().updateParcelamento(
			parcelamentoId, propostaId, numeroParcelas, valorEntrada,
			dataPrimeiraParcela, valorPrimeiraParcela);
	}

	/**
	 * Updates the parcelamento in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParcelamentoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param parcelamento the parcelamento
	 * @return the parcelamento that was updated
	 */
	public static Parcelamento updateParcelamento(Parcelamento parcelamento) {
		return getService().updateParcelamento(parcelamento);
	}

	public static ParcelamentoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ParcelamentoLocalService> _serviceSnapshot =
		new Snapshot<>(
			ParcelamentoLocalServiceUtil.class, ParcelamentoLocalService.class);

}