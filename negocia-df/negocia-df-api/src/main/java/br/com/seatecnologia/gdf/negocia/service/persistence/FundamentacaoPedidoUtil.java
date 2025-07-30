/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the fundamentacao pedido service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.FundamentacaoPedidoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FundamentacaoPedidoPersistence
 * @generated
 */
public class FundamentacaoPedidoUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(FundamentacaoPedido fundamentacaoPedido) {
		getPersistence().clearCache(fundamentacaoPedido);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, FundamentacaoPedido> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FundamentacaoPedido> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FundamentacaoPedido> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FundamentacaoPedido> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FundamentacaoPedido> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FundamentacaoPedido update(
		FundamentacaoPedido fundamentacaoPedido) {

		return getPersistence().update(fundamentacaoPedido);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FundamentacaoPedido update(
		FundamentacaoPedido fundamentacaoPedido,
		ServiceContext serviceContext) {

		return getPersistence().update(fundamentacaoPedido, serviceContext);
	}

	/**
	 * Returns all the fundamentacao pedidos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching fundamentacao pedidos
	 */
	public static List<FundamentacaoPedido> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the fundamentacao pedidos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FundamentacaoPedidoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fundamentacao pedidos
	 * @param end the upper bound of the range of fundamentacao pedidos (not inclusive)
	 * @return the range of matching fundamentacao pedidos
	 */
	public static List<FundamentacaoPedido> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the fundamentacao pedidos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FundamentacaoPedidoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fundamentacao pedidos
	 * @param end the upper bound of the range of fundamentacao pedidos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fundamentacao pedidos
	 */
	public static List<FundamentacaoPedido> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FundamentacaoPedido> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fundamentacao pedidos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FundamentacaoPedidoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fundamentacao pedidos
	 * @param end the upper bound of the range of fundamentacao pedidos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fundamentacao pedidos
	 */
	public static List<FundamentacaoPedido> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FundamentacaoPedido> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first fundamentacao pedido in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a matching fundamentacao pedido could not be found
	 */
	public static FundamentacaoPedido findByUuid_First(
			String uuid,
			OrderByComparator<FundamentacaoPedido> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchFundamentacaoPedidoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first fundamentacao pedido in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fundamentacao pedido, or <code>null</code> if a matching fundamentacao pedido could not be found
	 */
	public static FundamentacaoPedido fetchByUuid_First(
		String uuid, OrderByComparator<FundamentacaoPedido> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last fundamentacao pedido in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a matching fundamentacao pedido could not be found
	 */
	public static FundamentacaoPedido findByUuid_Last(
			String uuid,
			OrderByComparator<FundamentacaoPedido> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchFundamentacaoPedidoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last fundamentacao pedido in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fundamentacao pedido, or <code>null</code> if a matching fundamentacao pedido could not be found
	 */
	public static FundamentacaoPedido fetchByUuid_Last(
		String uuid, OrderByComparator<FundamentacaoPedido> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the fundamentacao pedidos before and after the current fundamentacao pedido in the ordered set where uuid = &#63;.
	 *
	 * @param fundamentacaoId the primary key of the current fundamentacao pedido
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a fundamentacao pedido with the primary key could not be found
	 */
	public static FundamentacaoPedido[] findByUuid_PrevAndNext(
			long fundamentacaoId, String uuid,
			OrderByComparator<FundamentacaoPedido> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchFundamentacaoPedidoException {

		return getPersistence().findByUuid_PrevAndNext(
			fundamentacaoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the fundamentacao pedidos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of fundamentacao pedidos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching fundamentacao pedidos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the fundamentacao pedidos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching fundamentacao pedidos
	 */
	public static List<FundamentacaoPedido> findByPropostaId(long propostaId) {
		return getPersistence().findByPropostaId(propostaId);
	}

	/**
	 * Returns a range of all the fundamentacao pedidos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FundamentacaoPedidoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of fundamentacao pedidos
	 * @param end the upper bound of the range of fundamentacao pedidos (not inclusive)
	 * @return the range of matching fundamentacao pedidos
	 */
	public static List<FundamentacaoPedido> findByPropostaId(
		long propostaId, int start, int end) {

		return getPersistence().findByPropostaId(propostaId, start, end);
	}

	/**
	 * Returns an ordered range of all the fundamentacao pedidos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FundamentacaoPedidoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of fundamentacao pedidos
	 * @param end the upper bound of the range of fundamentacao pedidos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fundamentacao pedidos
	 */
	public static List<FundamentacaoPedido> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<FundamentacaoPedido> orderByComparator) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fundamentacao pedidos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FundamentacaoPedidoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of fundamentacao pedidos
	 * @param end the upper bound of the range of fundamentacao pedidos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fundamentacao pedidos
	 */
	public static List<FundamentacaoPedido> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<FundamentacaoPedido> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first fundamentacao pedido in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a matching fundamentacao pedido could not be found
	 */
	public static FundamentacaoPedido findByPropostaId_First(
			long propostaId,
			OrderByComparator<FundamentacaoPedido> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchFundamentacaoPedidoException {

		return getPersistence().findByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the first fundamentacao pedido in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fundamentacao pedido, or <code>null</code> if a matching fundamentacao pedido could not be found
	 */
	public static FundamentacaoPedido fetchByPropostaId_First(
		long propostaId,
		OrderByComparator<FundamentacaoPedido> orderByComparator) {

		return getPersistence().fetchByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last fundamentacao pedido in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a matching fundamentacao pedido could not be found
	 */
	public static FundamentacaoPedido findByPropostaId_Last(
			long propostaId,
			OrderByComparator<FundamentacaoPedido> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchFundamentacaoPedidoException {

		return getPersistence().findByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last fundamentacao pedido in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fundamentacao pedido, or <code>null</code> if a matching fundamentacao pedido could not be found
	 */
	public static FundamentacaoPedido fetchByPropostaId_Last(
		long propostaId,
		OrderByComparator<FundamentacaoPedido> orderByComparator) {

		return getPersistence().fetchByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the fundamentacao pedidos before and after the current fundamentacao pedido in the ordered set where propostaId = &#63;.
	 *
	 * @param fundamentacaoId the primary key of the current fundamentacao pedido
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a fundamentacao pedido with the primary key could not be found
	 */
	public static FundamentacaoPedido[] findByPropostaId_PrevAndNext(
			long fundamentacaoId, long propostaId,
			OrderByComparator<FundamentacaoPedido> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchFundamentacaoPedidoException {

		return getPersistence().findByPropostaId_PrevAndNext(
			fundamentacaoId, propostaId, orderByComparator);
	}

	/**
	 * Removes all the fundamentacao pedidos where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public static void removeByPropostaId(long propostaId) {
		getPersistence().removeByPropostaId(propostaId);
	}

	/**
	 * Returns the number of fundamentacao pedidos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching fundamentacao pedidos
	 */
	public static int countByPropostaId(long propostaId) {
		return getPersistence().countByPropostaId(propostaId);
	}

	/**
	 * Caches the fundamentacao pedido in the entity cache if it is enabled.
	 *
	 * @param fundamentacaoPedido the fundamentacao pedido
	 */
	public static void cacheResult(FundamentacaoPedido fundamentacaoPedido) {
		getPersistence().cacheResult(fundamentacaoPedido);
	}

	/**
	 * Caches the fundamentacao pedidos in the entity cache if it is enabled.
	 *
	 * @param fundamentacaoPedidos the fundamentacao pedidos
	 */
	public static void cacheResult(
		List<FundamentacaoPedido> fundamentacaoPedidos) {

		getPersistence().cacheResult(fundamentacaoPedidos);
	}

	/**
	 * Creates a new fundamentacao pedido with the primary key. Does not add the fundamentacao pedido to the database.
	 *
	 * @param fundamentacaoId the primary key for the new fundamentacao pedido
	 * @return the new fundamentacao pedido
	 */
	public static FundamentacaoPedido create(long fundamentacaoId) {
		return getPersistence().create(fundamentacaoId);
	}

	/**
	 * Removes the fundamentacao pedido with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fundamentacaoId the primary key of the fundamentacao pedido
	 * @return the fundamentacao pedido that was removed
	 * @throws NoSuchFundamentacaoPedidoException if a fundamentacao pedido with the primary key could not be found
	 */
	public static FundamentacaoPedido remove(long fundamentacaoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchFundamentacaoPedidoException {

		return getPersistence().remove(fundamentacaoId);
	}

	public static FundamentacaoPedido updateImpl(
		FundamentacaoPedido fundamentacaoPedido) {

		return getPersistence().updateImpl(fundamentacaoPedido);
	}

	/**
	 * Returns the fundamentacao pedido with the primary key or throws a <code>NoSuchFundamentacaoPedidoException</code> if it could not be found.
	 *
	 * @param fundamentacaoId the primary key of the fundamentacao pedido
	 * @return the fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a fundamentacao pedido with the primary key could not be found
	 */
	public static FundamentacaoPedido findByPrimaryKey(long fundamentacaoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchFundamentacaoPedidoException {

		return getPersistence().findByPrimaryKey(fundamentacaoId);
	}

	/**
	 * Returns the fundamentacao pedido with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fundamentacaoId the primary key of the fundamentacao pedido
	 * @return the fundamentacao pedido, or <code>null</code> if a fundamentacao pedido with the primary key could not be found
	 */
	public static FundamentacaoPedido fetchByPrimaryKey(long fundamentacaoId) {
		return getPersistence().fetchByPrimaryKey(fundamentacaoId);
	}

	/**
	 * Returns all the fundamentacao pedidos.
	 *
	 * @return the fundamentacao pedidos
	 */
	public static List<FundamentacaoPedido> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the fundamentacao pedidos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FundamentacaoPedidoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fundamentacao pedidos
	 * @param end the upper bound of the range of fundamentacao pedidos (not inclusive)
	 * @return the range of fundamentacao pedidos
	 */
	public static List<FundamentacaoPedido> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the fundamentacao pedidos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FundamentacaoPedidoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fundamentacao pedidos
	 * @param end the upper bound of the range of fundamentacao pedidos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fundamentacao pedidos
	 */
	public static List<FundamentacaoPedido> findAll(
		int start, int end,
		OrderByComparator<FundamentacaoPedido> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fundamentacao pedidos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FundamentacaoPedidoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fundamentacao pedidos
	 * @param end the upper bound of the range of fundamentacao pedidos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fundamentacao pedidos
	 */
	public static List<FundamentacaoPedido> findAll(
		int start, int end,
		OrderByComparator<FundamentacaoPedido> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the fundamentacao pedidos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of fundamentacao pedidos.
	 *
	 * @return the number of fundamentacao pedidos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FundamentacaoPedidoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FundamentacaoPedidoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FundamentacaoPedidoPersistence _persistence;

}