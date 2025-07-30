/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.Garantia;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Garantia. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.GarantiaLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see GarantiaLocalService
 * @generated
 */
public class GarantiaLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.GarantiaLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the garantia to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GarantiaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param garantia the garantia
	 * @return the garantia that was added
	 */
	public static Garantia addGarantia(Garantia garantia) {
		return getService().addGarantia(garantia);
	}

	public static Garantia addGarantia(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		String tipoGarantia, String tipoDevedor, String outras,
		long proprietarioQualificacaoId, double valorEstimado,
		long dadosRegistroId, String localizacao, boolean declaracaoAnuencia,
		long declaracao, String descricaoBem, long propostaId) {

		return getService().addGarantia(
			serviceContext, tipoGarantia, tipoDevedor, outras,
			proprietarioQualificacaoId, valorEstimado, dadosRegistroId,
			localizacao, declaracaoAnuencia, declaracao, descricaoBem,
			propostaId);
	}

	/**
	 * Creates a new garantia with the primary key. Does not add the garantia to the database.
	 *
	 * @param garantiaId the primary key for the new garantia
	 * @return the new garantia
	 */
	public static Garantia createGarantia(long garantiaId) {
		return getService().createGarantia(garantiaId);
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
	 * Deletes the garantia from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GarantiaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param garantia the garantia
	 * @return the garantia that was removed
	 */
	public static Garantia deleteGarantia(Garantia garantia) {
		return getService().deleteGarantia(garantia);
	}

	/**
	 * Deletes the garantia with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GarantiaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param garantiaId the primary key of the garantia
	 * @return the garantia that was removed
	 * @throws PortalException if a garantia with the primary key could not be found
	 */
	public static Garantia deleteGarantia(long garantiaId)
		throws PortalException {

		return getService().deleteGarantia(garantiaId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.GarantiaModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.GarantiaModelImpl</code>.
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

	public static Garantia fetchGarantia(long garantiaId) {
		return getService().fetchGarantia(garantiaId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the garantia with the primary key.
	 *
	 * @param garantiaId the primary key of the garantia
	 * @return the garantia
	 * @throws PortalException if a garantia with the primary key could not be found
	 */
	public static Garantia getGarantia(long garantiaId) throws PortalException {
		return getService().getGarantia(garantiaId);
	}

	/**
	 * Returns a range of all the garantias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @return the range of garantias
	 */
	public static List<Garantia> getGarantias(int start, int end) {
		return getService().getGarantias(start, end);
	}

	public static List<Garantia> getGarantiasByPropostaId(long propostaId) {
		return getService().getGarantiasByPropostaId(propostaId);
	}

	/**
	 * Returns the number of garantias.
	 *
	 * @return the number of garantias
	 */
	public static int getGarantiasCount() {
		return getService().getGarantiasCount();
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
	 * Updates the garantia in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GarantiaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param garantia the garantia
	 * @return the garantia that was updated
	 */
	public static Garantia updateGarantia(Garantia garantia) {
		return getService().updateGarantia(garantia);
	}

	public static Garantia updateGarantia(
			long garantiaId, long propostaId, String tipoGarantia,
			String descricaoBem, String proprietario, double valorEstimado,
			String dadosRegistro, String localizacao, boolean anuenciaTerceiro,
			long documentoAnuencia)
		throws PortalException {

		return getService().updateGarantia(
			garantiaId, propostaId, tipoGarantia, descricaoBem, proprietario,
			valorEstimado, dadosRegistro, localizacao, anuenciaTerceiro,
			documentoAnuencia);
	}

	public static GarantiaLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<GarantiaLocalService> _serviceSnapshot =
		new Snapshot<>(
			GarantiaLocalServiceUtil.class, GarantiaLocalService.class);

}