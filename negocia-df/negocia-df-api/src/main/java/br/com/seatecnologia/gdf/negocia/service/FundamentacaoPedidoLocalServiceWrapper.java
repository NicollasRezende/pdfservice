/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FundamentacaoPedidoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FundamentacaoPedidoLocalService
 * @generated
 */
public class FundamentacaoPedidoLocalServiceWrapper
	implements FundamentacaoPedidoLocalService,
			   ServiceWrapper<FundamentacaoPedidoLocalService> {

	public FundamentacaoPedidoLocalServiceWrapper() {
		this(null);
	}

	public FundamentacaoPedidoLocalServiceWrapper(
		FundamentacaoPedidoLocalService fundamentacaoPedidoLocalService) {

		_fundamentacaoPedidoLocalService = fundamentacaoPedidoLocalService;
	}

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
	@Override
	public br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido
		addFundamentacaoPedido(
			br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido
				fundamentacaoPedido) {

		return _fundamentacaoPedidoLocalService.addFundamentacaoPedido(
			fundamentacaoPedido);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido
		addFundamentacaoPedido(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String fundamentacaoPedido, long propostaId) {

		return _fundamentacaoPedidoLocalService.addFundamentacaoPedido(
			serviceContext, fundamentacaoPedido, propostaId);
	}

	/**
	 * Creates a new fundamentacao pedido with the primary key. Does not add the fundamentacao pedido to the database.
	 *
	 * @param fundamentacaoId the primary key for the new fundamentacao pedido
	 * @return the new fundamentacao pedido
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido
		createFundamentacaoPedido(long fundamentacaoId) {

		return _fundamentacaoPedidoLocalService.createFundamentacaoPedido(
			fundamentacaoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fundamentacaoPedidoLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido
		deleteFundamentacaoPedido(
			br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido
				fundamentacaoPedido) {

		return _fundamentacaoPedidoLocalService.deleteFundamentacaoPedido(
			fundamentacaoPedido);
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
	@Override
	public br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido
			deleteFundamentacaoPedido(long fundamentacaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fundamentacaoPedidoLocalService.deleteFundamentacaoPedido(
			fundamentacaoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fundamentacaoPedidoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fundamentacaoPedidoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fundamentacaoPedidoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fundamentacaoPedidoLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _fundamentacaoPedidoLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _fundamentacaoPedidoLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _fundamentacaoPedidoLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _fundamentacaoPedidoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _fundamentacaoPedidoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido
		fetchFundamentacaoPedido(long fundamentacaoId) {

		return _fundamentacaoPedidoLocalService.fetchFundamentacaoPedido(
			fundamentacaoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fundamentacaoPedidoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the fundamentacao pedido with the primary key.
	 *
	 * @param fundamentacaoId the primary key of the fundamentacao pedido
	 * @return the fundamentacao pedido
	 * @throws PortalException if a fundamentacao pedido with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido
			getFundamentacaoPedido(long fundamentacaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fundamentacaoPedidoLocalService.getFundamentacaoPedido(
			fundamentacaoId);
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
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido>
			getFundamentacaoPedidos(int start, int end) {

		return _fundamentacaoPedidoLocalService.getFundamentacaoPedidos(
			start, end);
	}

	/**
	 * Returns the number of fundamentacao pedidos.
	 *
	 * @return the number of fundamentacao pedidos
	 */
	@Override
	public int getFundamentacaoPedidosCount() {
		return _fundamentacaoPedidoLocalService.getFundamentacaoPedidosCount();
	}

	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido>
			getFundamentacoesPedidoByPropostaId(long propostaId) {

		return _fundamentacaoPedidoLocalService.
			getFundamentacoesPedidoByPropostaId(propostaId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fundamentacaoPedidoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fundamentacaoPedidoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fundamentacaoPedidoLocalService.getPersistedModel(
			primaryKeyObj);
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
	@Override
	public br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido
		updateFundamentacaoPedido(
			br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido
				fundamentacaoPedido) {

		return _fundamentacaoPedidoLocalService.updateFundamentacaoPedido(
			fundamentacaoPedido);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fundamentacaoPedidoLocalService.getBasePersistence();
	}

	@Override
	public FundamentacaoPedidoLocalService getWrappedService() {
		return _fundamentacaoPedidoLocalService;
	}

	@Override
	public void setWrappedService(
		FundamentacaoPedidoLocalService fundamentacaoPedidoLocalService) {

		_fundamentacaoPedidoLocalService = fundamentacaoPedidoLocalService;
	}

	private FundamentacaoPedidoLocalService _fundamentacaoPedidoLocalService;

}