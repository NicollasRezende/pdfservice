/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FundamentacaoPedido. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.FundamentacaoPedidoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FundamentacaoPedidoLocalService
 * @generated
 */
public class FundamentacaoPedidoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.FundamentacaoPedidoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the fundamentacao pedido to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FundamentacaoPedidoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fundamentacaoPedido the fundamentacao pedido
	 * @return the fundamentacao pedido that was added
	 */
	public static FundamentacaoPedido addFundamentacaoPedido(
		FundamentacaoPedido fundamentacaoPedido) {

		return getService().addFundamentacaoPedido(fundamentacaoPedido);
	}

	public static FundamentacaoPedido addFundamentacaoPedido(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		String fundamentacaoPedido, long propostaId) {

		return getService().addFundamentacaoPedido(
			serviceContext, fundamentacaoPedido, propostaId);
	}

	/**
	 * Creates a new fundamentacao pedido with the primary key. Does not add the fundamentacao pedido to the database.
	 *
	 * @param fundamentacaoId the primary key for the new fundamentacao pedido
	 * @return the new fundamentacao pedido
	 */
	public static FundamentacaoPedido createFundamentacaoPedido(
		long fundamentacaoId) {

		return getService().createFundamentacaoPedido(fundamentacaoId);
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
	 * Deletes the fundamentacao pedido from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FundamentacaoPedidoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fundamentacaoPedido the fundamentacao pedido
	 * @return the fundamentacao pedido that was removed
	 */
	public static FundamentacaoPedido deleteFundamentacaoPedido(
		FundamentacaoPedido fundamentacaoPedido) {

		return getService().deleteFundamentacaoPedido(fundamentacaoPedido);
	}

	/**
	 * Deletes the fundamentacao pedido with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FundamentacaoPedidoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fundamentacaoId the primary key of the fundamentacao pedido
	 * @return the fundamentacao pedido that was removed
	 * @throws PortalException if a fundamentacao pedido with the primary key could not be found
	 */
	public static FundamentacaoPedido deleteFundamentacaoPedido(
			long fundamentacaoId)
		throws PortalException {

		return getService().deleteFundamentacaoPedido(fundamentacaoId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.FundamentacaoPedidoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.FundamentacaoPedidoModelImpl</code>.
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

	public static FundamentacaoPedido fetchFundamentacaoPedido(
		long fundamentacaoId) {

		return getService().fetchFundamentacaoPedido(fundamentacaoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the fundamentacao pedido with the primary key.
	 *
	 * @param fundamentacaoId the primary key of the fundamentacao pedido
	 * @return the fundamentacao pedido
	 * @throws PortalException if a fundamentacao pedido with the primary key could not be found
	 */
	public static FundamentacaoPedido getFundamentacaoPedido(
			long fundamentacaoId)
		throws PortalException {

		return getService().getFundamentacaoPedido(fundamentacaoId);
	}

	/**
	 * Returns a range of all the fundamentacao pedidos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.FundamentacaoPedidoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fundamentacao pedidos
	 * @param end the upper bound of the range of fundamentacao pedidos (not inclusive)
	 * @return the range of fundamentacao pedidos
	 */
	public static List<FundamentacaoPedido> getFundamentacaoPedidos(
		int start, int end) {

		return getService().getFundamentacaoPedidos(start, end);
	}

	/**
	 * Returns the number of fundamentacao pedidos.
	 *
	 * @return the number of fundamentacao pedidos
	 */
	public static int getFundamentacaoPedidosCount() {
		return getService().getFundamentacaoPedidosCount();
	}

	public static List<FundamentacaoPedido> getFundamentacoesPedidoByPropostaId(
		long propostaId) {

		return getService().getFundamentacoesPedidoByPropostaId(propostaId);
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
	 * Updates the fundamentacao pedido in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FundamentacaoPedidoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fundamentacaoPedido the fundamentacao pedido
	 * @return the fundamentacao pedido that was updated
	 */
	public static FundamentacaoPedido updateFundamentacaoPedido(
		FundamentacaoPedido fundamentacaoPedido) {

		return getService().updateFundamentacaoPedido(fundamentacaoPedido);
	}

	public static FundamentacaoPedidoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FundamentacaoPedidoLocalService>
		_serviceSnapshot = new Snapshot<>(
			FundamentacaoPedidoLocalServiceUtil.class,
			FundamentacaoPedidoLocalService.class);

}