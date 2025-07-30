/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CreditoTransacionado. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.CreditoTransacionadoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CreditoTransacionadoLocalService
 * @generated
 */
public class CreditoTransacionadoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.CreditoTransacionadoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the credito transacionado to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreditoTransacionadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creditoTransacionado the credito transacionado
	 * @return the credito transacionado that was added
	 */
	public static CreditoTransacionado addCreditoTransacionado(
		CreditoTransacionado creditoTransacionado) {

		return getService().addCreditoTransacionado(creditoTransacionado);
	}

	public static CreditoTransacionado addCreditoTransacionado(
		long creditoId, long propostaId, String numeroInscricao,
		String codigoReceita, java.util.Date dataInscricao,
		double valorAtualizado) {

		return getService().addCreditoTransacionado(
			creditoId, propostaId, numeroInscricao, codigoReceita,
			dataInscricao, valorAtualizado);
	}

	/**
	 * Creates a new credito transacionado with the primary key. Does not add the credito transacionado to the database.
	 *
	 * @param creditoId the primary key for the new credito transacionado
	 * @return the new credito transacionado
	 */
	public static CreditoTransacionado createCreditoTransacionado(
		long creditoId) {

		return getService().createCreditoTransacionado(creditoId);
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
	 * Deletes the credito transacionado from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreditoTransacionadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creditoTransacionado the credito transacionado
	 * @return the credito transacionado that was removed
	 */
	public static CreditoTransacionado deleteCreditoTransacionado(
		CreditoTransacionado creditoTransacionado) {

		return getService().deleteCreditoTransacionado(creditoTransacionado);
	}

	/**
	 * Deletes the credito transacionado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreditoTransacionadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creditoId the primary key of the credito transacionado
	 * @return the credito transacionado that was removed
	 * @throws PortalException if a credito transacionado with the primary key could not be found
	 */
	public static CreditoTransacionado deleteCreditoTransacionado(
			long creditoId)
		throws PortalException {

		return getService().deleteCreditoTransacionado(creditoId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.CreditoTransacionadoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.CreditoTransacionadoModelImpl</code>.
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

	public static CreditoTransacionado fetchCreditoTransacionado(
		long creditoId) {

		return getService().fetchCreditoTransacionado(creditoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the credito transacionado with the primary key.
	 *
	 * @param creditoId the primary key of the credito transacionado
	 * @return the credito transacionado
	 * @throws PortalException if a credito transacionado with the primary key could not be found
	 */
	public static CreditoTransacionado getCreditoTransacionado(long creditoId)
		throws PortalException {

		return getService().getCreditoTransacionado(creditoId);
	}

	/**
	 * Returns a range of all the credito transacionados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @return the range of credito transacionados
	 */
	public static List<CreditoTransacionado> getCreditoTransacionados(
		int start, int end) {

		return getService().getCreditoTransacionados(start, end);
	}

	/**
	 * Returns the number of credito transacionados.
	 *
	 * @return the number of credito transacionados
	 */
	public static int getCreditoTransacionadosCount() {
		return getService().getCreditoTransacionadosCount();
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
	 * Updates the credito transacionado in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreditoTransacionadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creditoTransacionado the credito transacionado
	 * @return the credito transacionado that was updated
	 */
	public static CreditoTransacionado updateCreditoTransacionado(
		CreditoTransacionado creditoTransacionado) {

		return getService().updateCreditoTransacionado(creditoTransacionado);
	}

	public static CreditoTransacionado updateCreditoTransacionado(
			long creditoId, long propostaId, String numeroInscricao,
			String codigoReceita, java.util.Date dataInscricao,
			double valorAtualizado)
		throws PortalException {

		return getService().updateCreditoTransacionado(
			creditoId, propostaId, numeroInscricao, codigoReceita,
			dataInscricao, valorAtualizado);
	}

	public static CreditoTransacionadoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CreditoTransacionadoLocalService>
		_serviceSnapshot = new Snapshot<>(
			CreditoTransacionadoLocalServiceUtil.class,
			CreditoTransacionadoLocalService.class);

}