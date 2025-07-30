/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchFundamentacaoPedidoException;
import br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fundamentacao pedido service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FundamentacaoPedidoUtil
 * @generated
 */
@ProviderType
public interface FundamentacaoPedidoPersistence
	extends BasePersistence<FundamentacaoPedido> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FundamentacaoPedidoUtil} to access the fundamentacao pedido persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the fundamentacao pedidos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching fundamentacao pedidos
	 */
	public java.util.List<FundamentacaoPedido> findByUuid(String uuid);

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
	public java.util.List<FundamentacaoPedido> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<FundamentacaoPedido> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FundamentacaoPedido>
			orderByComparator);

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
	public java.util.List<FundamentacaoPedido> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FundamentacaoPedido>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first fundamentacao pedido in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a matching fundamentacao pedido could not be found
	 */
	public FundamentacaoPedido findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FundamentacaoPedido> orderByComparator)
		throws NoSuchFundamentacaoPedidoException;

	/**
	 * Returns the first fundamentacao pedido in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fundamentacao pedido, or <code>null</code> if a matching fundamentacao pedido could not be found
	 */
	public FundamentacaoPedido fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<FundamentacaoPedido>
			orderByComparator);

	/**
	 * Returns the last fundamentacao pedido in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a matching fundamentacao pedido could not be found
	 */
	public FundamentacaoPedido findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FundamentacaoPedido> orderByComparator)
		throws NoSuchFundamentacaoPedidoException;

	/**
	 * Returns the last fundamentacao pedido in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fundamentacao pedido, or <code>null</code> if a matching fundamentacao pedido could not be found
	 */
	public FundamentacaoPedido fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<FundamentacaoPedido>
			orderByComparator);

	/**
	 * Returns the fundamentacao pedidos before and after the current fundamentacao pedido in the ordered set where uuid = &#63;.
	 *
	 * @param fundamentacaoId the primary key of the current fundamentacao pedido
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a fundamentacao pedido with the primary key could not be found
	 */
	public FundamentacaoPedido[] findByUuid_PrevAndNext(
			long fundamentacaoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FundamentacaoPedido> orderByComparator)
		throws NoSuchFundamentacaoPedidoException;

	/**
	 * Removes all the fundamentacao pedidos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of fundamentacao pedidos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching fundamentacao pedidos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the fundamentacao pedidos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching fundamentacao pedidos
	 */
	public java.util.List<FundamentacaoPedido> findByPropostaId(
		long propostaId);

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
	public java.util.List<FundamentacaoPedido> findByPropostaId(
		long propostaId, int start, int end);

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
	public java.util.List<FundamentacaoPedido> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FundamentacaoPedido>
			orderByComparator);

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
	public java.util.List<FundamentacaoPedido> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FundamentacaoPedido>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first fundamentacao pedido in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a matching fundamentacao pedido could not be found
	 */
	public FundamentacaoPedido findByPropostaId_First(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FundamentacaoPedido> orderByComparator)
		throws NoSuchFundamentacaoPedidoException;

	/**
	 * Returns the first fundamentacao pedido in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fundamentacao pedido, or <code>null</code> if a matching fundamentacao pedido could not be found
	 */
	public FundamentacaoPedido fetchByPropostaId_First(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<FundamentacaoPedido>
			orderByComparator);

	/**
	 * Returns the last fundamentacao pedido in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a matching fundamentacao pedido could not be found
	 */
	public FundamentacaoPedido findByPropostaId_Last(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FundamentacaoPedido> orderByComparator)
		throws NoSuchFundamentacaoPedidoException;

	/**
	 * Returns the last fundamentacao pedido in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fundamentacao pedido, or <code>null</code> if a matching fundamentacao pedido could not be found
	 */
	public FundamentacaoPedido fetchByPropostaId_Last(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<FundamentacaoPedido>
			orderByComparator);

	/**
	 * Returns the fundamentacao pedidos before and after the current fundamentacao pedido in the ordered set where propostaId = &#63;.
	 *
	 * @param fundamentacaoId the primary key of the current fundamentacao pedido
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a fundamentacao pedido with the primary key could not be found
	 */
	public FundamentacaoPedido[] findByPropostaId_PrevAndNext(
			long fundamentacaoId, long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FundamentacaoPedido> orderByComparator)
		throws NoSuchFundamentacaoPedidoException;

	/**
	 * Removes all the fundamentacao pedidos where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public void removeByPropostaId(long propostaId);

	/**
	 * Returns the number of fundamentacao pedidos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching fundamentacao pedidos
	 */
	public int countByPropostaId(long propostaId);

	/**
	 * Caches the fundamentacao pedido in the entity cache if it is enabled.
	 *
	 * @param fundamentacaoPedido the fundamentacao pedido
	 */
	public void cacheResult(FundamentacaoPedido fundamentacaoPedido);

	/**
	 * Caches the fundamentacao pedidos in the entity cache if it is enabled.
	 *
	 * @param fundamentacaoPedidos the fundamentacao pedidos
	 */
	public void cacheResult(
		java.util.List<FundamentacaoPedido> fundamentacaoPedidos);

	/**
	 * Creates a new fundamentacao pedido with the primary key. Does not add the fundamentacao pedido to the database.
	 *
	 * @param fundamentacaoId the primary key for the new fundamentacao pedido
	 * @return the new fundamentacao pedido
	 */
	public FundamentacaoPedido create(long fundamentacaoId);

	/**
	 * Removes the fundamentacao pedido with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fundamentacaoId the primary key of the fundamentacao pedido
	 * @return the fundamentacao pedido that was removed
	 * @throws NoSuchFundamentacaoPedidoException if a fundamentacao pedido with the primary key could not be found
	 */
	public FundamentacaoPedido remove(long fundamentacaoId)
		throws NoSuchFundamentacaoPedidoException;

	public FundamentacaoPedido updateImpl(
		FundamentacaoPedido fundamentacaoPedido);

	/**
	 * Returns the fundamentacao pedido with the primary key or throws a <code>NoSuchFundamentacaoPedidoException</code> if it could not be found.
	 *
	 * @param fundamentacaoId the primary key of the fundamentacao pedido
	 * @return the fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a fundamentacao pedido with the primary key could not be found
	 */
	public FundamentacaoPedido findByPrimaryKey(long fundamentacaoId)
		throws NoSuchFundamentacaoPedidoException;

	/**
	 * Returns the fundamentacao pedido with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fundamentacaoId the primary key of the fundamentacao pedido
	 * @return the fundamentacao pedido, or <code>null</code> if a fundamentacao pedido with the primary key could not be found
	 */
	public FundamentacaoPedido fetchByPrimaryKey(long fundamentacaoId);

	/**
	 * Returns all the fundamentacao pedidos.
	 *
	 * @return the fundamentacao pedidos
	 */
	public java.util.List<FundamentacaoPedido> findAll();

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
	public java.util.List<FundamentacaoPedido> findAll(int start, int end);

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
	public java.util.List<FundamentacaoPedido> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FundamentacaoPedido>
			orderByComparator);

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
	public java.util.List<FundamentacaoPedido> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FundamentacaoPedido>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fundamentacao pedidos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fundamentacao pedidos.
	 *
	 * @return the number of fundamentacao pedidos
	 */
	public int countAll();

}