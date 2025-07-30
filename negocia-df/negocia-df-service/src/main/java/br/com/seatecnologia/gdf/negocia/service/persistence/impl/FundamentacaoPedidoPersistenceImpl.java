/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchFundamentacaoPedidoException;
import br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido;
import br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedidoTable;
import br.com.seatecnologia.gdf.negocia.model.impl.FundamentacaoPedidoImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.FundamentacaoPedidoModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.FundamentacaoPedidoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.FundamentacaoPedidoUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.impl.constants.GDFPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the fundamentacao pedido service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FundamentacaoPedidoPersistence.class)
public class FundamentacaoPedidoPersistenceImpl
	extends BasePersistenceImpl<FundamentacaoPedido>
	implements FundamentacaoPedidoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FundamentacaoPedidoUtil</code> to access the fundamentacao pedido persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FundamentacaoPedidoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the fundamentacao pedidos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching fundamentacao pedidos
	 */
	@Override
	public List<FundamentacaoPedido> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<FundamentacaoPedido> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<FundamentacaoPedido> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FundamentacaoPedido> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<FundamentacaoPedido> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FundamentacaoPedido> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<FundamentacaoPedido> list = null;

		if (useFinderCache) {
			list = (List<FundamentacaoPedido>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FundamentacaoPedido fundamentacaoPedido : list) {
					if (!uuid.equals(fundamentacaoPedido.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_FUNDAMENTACAOPEDIDO_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FundamentacaoPedidoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<FundamentacaoPedido>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first fundamentacao pedido in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a matching fundamentacao pedido could not be found
	 */
	@Override
	public FundamentacaoPedido findByUuid_First(
			String uuid,
			OrderByComparator<FundamentacaoPedido> orderByComparator)
		throws NoSuchFundamentacaoPedidoException {

		FundamentacaoPedido fundamentacaoPedido = fetchByUuid_First(
			uuid, orderByComparator);

		if (fundamentacaoPedido != null) {
			return fundamentacaoPedido;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchFundamentacaoPedidoException(sb.toString());
	}

	/**
	 * Returns the first fundamentacao pedido in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fundamentacao pedido, or <code>null</code> if a matching fundamentacao pedido could not be found
	 */
	@Override
	public FundamentacaoPedido fetchByUuid_First(
		String uuid, OrderByComparator<FundamentacaoPedido> orderByComparator) {

		List<FundamentacaoPedido> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fundamentacao pedido in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a matching fundamentacao pedido could not be found
	 */
	@Override
	public FundamentacaoPedido findByUuid_Last(
			String uuid,
			OrderByComparator<FundamentacaoPedido> orderByComparator)
		throws NoSuchFundamentacaoPedidoException {

		FundamentacaoPedido fundamentacaoPedido = fetchByUuid_Last(
			uuid, orderByComparator);

		if (fundamentacaoPedido != null) {
			return fundamentacaoPedido;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchFundamentacaoPedidoException(sb.toString());
	}

	/**
	 * Returns the last fundamentacao pedido in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fundamentacao pedido, or <code>null</code> if a matching fundamentacao pedido could not be found
	 */
	@Override
	public FundamentacaoPedido fetchByUuid_Last(
		String uuid, OrderByComparator<FundamentacaoPedido> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<FundamentacaoPedido> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public FundamentacaoPedido[] findByUuid_PrevAndNext(
			long fundamentacaoId, String uuid,
			OrderByComparator<FundamentacaoPedido> orderByComparator)
		throws NoSuchFundamentacaoPedidoException {

		uuid = Objects.toString(uuid, "");

		FundamentacaoPedido fundamentacaoPedido = findByPrimaryKey(
			fundamentacaoId);

		Session session = null;

		try {
			session = openSession();

			FundamentacaoPedido[] array = new FundamentacaoPedidoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, fundamentacaoPedido, uuid, orderByComparator, true);

			array[1] = fundamentacaoPedido;

			array[2] = getByUuid_PrevAndNext(
				session, fundamentacaoPedido, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FundamentacaoPedido getByUuid_PrevAndNext(
		Session session, FundamentacaoPedido fundamentacaoPedido, String uuid,
		OrderByComparator<FundamentacaoPedido> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_FUNDAMENTACAOPEDIDO_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(FundamentacaoPedidoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						fundamentacaoPedido)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FundamentacaoPedido> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fundamentacao pedidos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (FundamentacaoPedido fundamentacaoPedido :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(fundamentacaoPedido);
		}
	}

	/**
	 * Returns the number of fundamentacao pedidos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching fundamentacao pedidos
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FUNDAMENTACAOPEDIDO_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"fundamentacaoPedido.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(fundamentacaoPedido.uuid IS NULL OR fundamentacaoPedido.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByPropostaId;
	private FinderPath _finderPathWithoutPaginationFindByPropostaId;
	private FinderPath _finderPathCountByPropostaId;

	/**
	 * Returns all the fundamentacao pedidos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching fundamentacao pedidos
	 */
	@Override
	public List<FundamentacaoPedido> findByPropostaId(long propostaId) {
		return findByPropostaId(
			propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<FundamentacaoPedido> findByPropostaId(
		long propostaId, int start, int end) {

		return findByPropostaId(propostaId, start, end, null);
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
	@Override
	public List<FundamentacaoPedido> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<FundamentacaoPedido> orderByComparator) {

		return findByPropostaId(
			propostaId, start, end, orderByComparator, true);
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
	@Override
	public List<FundamentacaoPedido> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<FundamentacaoPedido> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByPropostaId;
				finderArgs = new Object[] {propostaId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByPropostaId;
			finderArgs = new Object[] {
				propostaId, start, end, orderByComparator
			};
		}

		List<FundamentacaoPedido> list = null;

		if (useFinderCache) {
			list = (List<FundamentacaoPedido>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FundamentacaoPedido fundamentacaoPedido : list) {
					if (propostaId != fundamentacaoPedido.getPropostaId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_FUNDAMENTACAOPEDIDO_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FundamentacaoPedidoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

				list = (List<FundamentacaoPedido>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first fundamentacao pedido in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a matching fundamentacao pedido could not be found
	 */
	@Override
	public FundamentacaoPedido findByPropostaId_First(
			long propostaId,
			OrderByComparator<FundamentacaoPedido> orderByComparator)
		throws NoSuchFundamentacaoPedidoException {

		FundamentacaoPedido fundamentacaoPedido = fetchByPropostaId_First(
			propostaId, orderByComparator);

		if (fundamentacaoPedido != null) {
			return fundamentacaoPedido;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchFundamentacaoPedidoException(sb.toString());
	}

	/**
	 * Returns the first fundamentacao pedido in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fundamentacao pedido, or <code>null</code> if a matching fundamentacao pedido could not be found
	 */
	@Override
	public FundamentacaoPedido fetchByPropostaId_First(
		long propostaId,
		OrderByComparator<FundamentacaoPedido> orderByComparator) {

		List<FundamentacaoPedido> list = findByPropostaId(
			propostaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fundamentacao pedido in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a matching fundamentacao pedido could not be found
	 */
	@Override
	public FundamentacaoPedido findByPropostaId_Last(
			long propostaId,
			OrderByComparator<FundamentacaoPedido> orderByComparator)
		throws NoSuchFundamentacaoPedidoException {

		FundamentacaoPedido fundamentacaoPedido = fetchByPropostaId_Last(
			propostaId, orderByComparator);

		if (fundamentacaoPedido != null) {
			return fundamentacaoPedido;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchFundamentacaoPedidoException(sb.toString());
	}

	/**
	 * Returns the last fundamentacao pedido in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fundamentacao pedido, or <code>null</code> if a matching fundamentacao pedido could not be found
	 */
	@Override
	public FundamentacaoPedido fetchByPropostaId_Last(
		long propostaId,
		OrderByComparator<FundamentacaoPedido> orderByComparator) {

		int count = countByPropostaId(propostaId);

		if (count == 0) {
			return null;
		}

		List<FundamentacaoPedido> list = findByPropostaId(
			propostaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public FundamentacaoPedido[] findByPropostaId_PrevAndNext(
			long fundamentacaoId, long propostaId,
			OrderByComparator<FundamentacaoPedido> orderByComparator)
		throws NoSuchFundamentacaoPedidoException {

		FundamentacaoPedido fundamentacaoPedido = findByPrimaryKey(
			fundamentacaoId);

		Session session = null;

		try {
			session = openSession();

			FundamentacaoPedido[] array = new FundamentacaoPedidoImpl[3];

			array[0] = getByPropostaId_PrevAndNext(
				session, fundamentacaoPedido, propostaId, orderByComparator,
				true);

			array[1] = fundamentacaoPedido;

			array[2] = getByPropostaId_PrevAndNext(
				session, fundamentacaoPedido, propostaId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FundamentacaoPedido getByPropostaId_PrevAndNext(
		Session session, FundamentacaoPedido fundamentacaoPedido,
		long propostaId,
		OrderByComparator<FundamentacaoPedido> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_FUNDAMENTACAOPEDIDO_WHERE);

		sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(FundamentacaoPedidoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(propostaId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						fundamentacaoPedido)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FundamentacaoPedido> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fundamentacao pedidos where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	@Override
	public void removeByPropostaId(long propostaId) {
		for (FundamentacaoPedido fundamentacaoPedido :
				findByPropostaId(
					propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(fundamentacaoPedido);
		}
	}

	/**
	 * Returns the number of fundamentacao pedidos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching fundamentacao pedidos
	 */
	@Override
	public int countByPropostaId(long propostaId) {
		FinderPath finderPath = _finderPathCountByPropostaId;

		Object[] finderArgs = new Object[] {propostaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FUNDAMENTACAOPEDIDO_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2 =
		"fundamentacaoPedido.propostaId = ?";

	public FundamentacaoPedidoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(FundamentacaoPedido.class);

		setModelImplClass(FundamentacaoPedidoImpl.class);
		setModelPKClass(long.class);

		setTable(FundamentacaoPedidoTable.INSTANCE);
	}

	/**
	 * Caches the fundamentacao pedido in the entity cache if it is enabled.
	 *
	 * @param fundamentacaoPedido the fundamentacao pedido
	 */
	@Override
	public void cacheResult(FundamentacaoPedido fundamentacaoPedido) {
		entityCache.putResult(
			FundamentacaoPedidoImpl.class, fundamentacaoPedido.getPrimaryKey(),
			fundamentacaoPedido);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fundamentacao pedidos in the entity cache if it is enabled.
	 *
	 * @param fundamentacaoPedidos the fundamentacao pedidos
	 */
	@Override
	public void cacheResult(List<FundamentacaoPedido> fundamentacaoPedidos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fundamentacaoPedidos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FundamentacaoPedido fundamentacaoPedido : fundamentacaoPedidos) {
			if (entityCache.getResult(
					FundamentacaoPedidoImpl.class,
					fundamentacaoPedido.getPrimaryKey()) == null) {

				cacheResult(fundamentacaoPedido);
			}
		}
	}

	/**
	 * Clears the cache for all fundamentacao pedidos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FundamentacaoPedidoImpl.class);

		finderCache.clearCache(FundamentacaoPedidoImpl.class);
	}

	/**
	 * Clears the cache for the fundamentacao pedido.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FundamentacaoPedido fundamentacaoPedido) {
		entityCache.removeResult(
			FundamentacaoPedidoImpl.class, fundamentacaoPedido);
	}

	@Override
	public void clearCache(List<FundamentacaoPedido> fundamentacaoPedidos) {
		for (FundamentacaoPedido fundamentacaoPedido : fundamentacaoPedidos) {
			entityCache.removeResult(
				FundamentacaoPedidoImpl.class, fundamentacaoPedido);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FundamentacaoPedidoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FundamentacaoPedidoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new fundamentacao pedido with the primary key. Does not add the fundamentacao pedido to the database.
	 *
	 * @param fundamentacaoId the primary key for the new fundamentacao pedido
	 * @return the new fundamentacao pedido
	 */
	@Override
	public FundamentacaoPedido create(long fundamentacaoId) {
		FundamentacaoPedido fundamentacaoPedido = new FundamentacaoPedidoImpl();

		fundamentacaoPedido.setNew(true);
		fundamentacaoPedido.setPrimaryKey(fundamentacaoId);

		String uuid = PortalUUIDUtil.generate();

		fundamentacaoPedido.setUuid(uuid);

		return fundamentacaoPedido;
	}

	/**
	 * Removes the fundamentacao pedido with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fundamentacaoId the primary key of the fundamentacao pedido
	 * @return the fundamentacao pedido that was removed
	 * @throws NoSuchFundamentacaoPedidoException if a fundamentacao pedido with the primary key could not be found
	 */
	@Override
	public FundamentacaoPedido remove(long fundamentacaoId)
		throws NoSuchFundamentacaoPedidoException {

		return remove((Serializable)fundamentacaoId);
	}

	/**
	 * Removes the fundamentacao pedido with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fundamentacao pedido
	 * @return the fundamentacao pedido that was removed
	 * @throws NoSuchFundamentacaoPedidoException if a fundamentacao pedido with the primary key could not be found
	 */
	@Override
	public FundamentacaoPedido remove(Serializable primaryKey)
		throws NoSuchFundamentacaoPedidoException {

		Session session = null;

		try {
			session = openSession();

			FundamentacaoPedido fundamentacaoPedido =
				(FundamentacaoPedido)session.get(
					FundamentacaoPedidoImpl.class, primaryKey);

			if (fundamentacaoPedido == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFundamentacaoPedidoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fundamentacaoPedido);
		}
		catch (NoSuchFundamentacaoPedidoException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected FundamentacaoPedido removeImpl(
		FundamentacaoPedido fundamentacaoPedido) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fundamentacaoPedido)) {
				fundamentacaoPedido = (FundamentacaoPedido)session.get(
					FundamentacaoPedidoImpl.class,
					fundamentacaoPedido.getPrimaryKeyObj());
			}

			if (fundamentacaoPedido != null) {
				session.delete(fundamentacaoPedido);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fundamentacaoPedido != null) {
			clearCache(fundamentacaoPedido);
		}

		return fundamentacaoPedido;
	}

	@Override
	public FundamentacaoPedido updateImpl(
		FundamentacaoPedido fundamentacaoPedido) {

		boolean isNew = fundamentacaoPedido.isNew();

		if (!(fundamentacaoPedido instanceof FundamentacaoPedidoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(fundamentacaoPedido.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					fundamentacaoPedido);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fundamentacaoPedido proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FundamentacaoPedido implementation " +
					fundamentacaoPedido.getClass());
		}

		FundamentacaoPedidoModelImpl fundamentacaoPedidoModelImpl =
			(FundamentacaoPedidoModelImpl)fundamentacaoPedido;

		if (Validator.isNull(fundamentacaoPedido.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			fundamentacaoPedido.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fundamentacaoPedido);
			}
			else {
				fundamentacaoPedido = (FundamentacaoPedido)session.merge(
					fundamentacaoPedido);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FundamentacaoPedidoImpl.class, fundamentacaoPedidoModelImpl, false,
			true);

		if (isNew) {
			fundamentacaoPedido.setNew(false);
		}

		fundamentacaoPedido.resetOriginalValues();

		return fundamentacaoPedido;
	}

	/**
	 * Returns the fundamentacao pedido with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fundamentacao pedido
	 * @return the fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a fundamentacao pedido with the primary key could not be found
	 */
	@Override
	public FundamentacaoPedido findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFundamentacaoPedidoException {

		FundamentacaoPedido fundamentacaoPedido = fetchByPrimaryKey(primaryKey);

		if (fundamentacaoPedido == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFundamentacaoPedidoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fundamentacaoPedido;
	}

	/**
	 * Returns the fundamentacao pedido with the primary key or throws a <code>NoSuchFundamentacaoPedidoException</code> if it could not be found.
	 *
	 * @param fundamentacaoId the primary key of the fundamentacao pedido
	 * @return the fundamentacao pedido
	 * @throws NoSuchFundamentacaoPedidoException if a fundamentacao pedido with the primary key could not be found
	 */
	@Override
	public FundamentacaoPedido findByPrimaryKey(long fundamentacaoId)
		throws NoSuchFundamentacaoPedidoException {

		return findByPrimaryKey((Serializable)fundamentacaoId);
	}

	/**
	 * Returns the fundamentacao pedido with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fundamentacaoId the primary key of the fundamentacao pedido
	 * @return the fundamentacao pedido, or <code>null</code> if a fundamentacao pedido with the primary key could not be found
	 */
	@Override
	public FundamentacaoPedido fetchByPrimaryKey(long fundamentacaoId) {
		return fetchByPrimaryKey((Serializable)fundamentacaoId);
	}

	/**
	 * Returns all the fundamentacao pedidos.
	 *
	 * @return the fundamentacao pedidos
	 */
	@Override
	public List<FundamentacaoPedido> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<FundamentacaoPedido> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<FundamentacaoPedido> findAll(
		int start, int end,
		OrderByComparator<FundamentacaoPedido> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<FundamentacaoPedido> findAll(
		int start, int end,
		OrderByComparator<FundamentacaoPedido> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<FundamentacaoPedido> list = null;

		if (useFinderCache) {
			list = (List<FundamentacaoPedido>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FUNDAMENTACAOPEDIDO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FUNDAMENTACAOPEDIDO;

				sql = sql.concat(FundamentacaoPedidoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FundamentacaoPedido>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the fundamentacao pedidos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FundamentacaoPedido fundamentacaoPedido : findAll()) {
			remove(fundamentacaoPedido);
		}
	}

	/**
	 * Returns the number of fundamentacao pedidos.
	 *
	 * @return the number of fundamentacao pedidos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_FUNDAMENTACAOPEDIDO);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "fundamentacaoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FUNDAMENTACAOPEDIDO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FundamentacaoPedidoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fundamentacao pedido persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathWithPaginationFindByPropostaId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPropostaId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"propostaId"}, true);

		_finderPathWithoutPaginationFindByPropostaId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPropostaId",
			new String[] {Long.class.getName()}, new String[] {"propostaId"},
			true);

		_finderPathCountByPropostaId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPropostaId",
			new String[] {Long.class.getName()}, new String[] {"propostaId"},
			false);

		FundamentacaoPedidoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FundamentacaoPedidoUtil.setPersistence(null);

		entityCache.removeCache(FundamentacaoPedidoImpl.class.getName());
	}

	@Override
	@Reference(
		target = GDFPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = GDFPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = GDFPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FUNDAMENTACAOPEDIDO =
		"SELECT fundamentacaoPedido FROM FundamentacaoPedido fundamentacaoPedido";

	private static final String _SQL_SELECT_FUNDAMENTACAOPEDIDO_WHERE =
		"SELECT fundamentacaoPedido FROM FundamentacaoPedido fundamentacaoPedido WHERE ";

	private static final String _SQL_COUNT_FUNDAMENTACAOPEDIDO =
		"SELECT COUNT(fundamentacaoPedido) FROM FundamentacaoPedido fundamentacaoPedido";

	private static final String _SQL_COUNT_FUNDAMENTACAOPEDIDO_WHERE =
		"SELECT COUNT(fundamentacaoPedido) FROM FundamentacaoPedido fundamentacaoPedido WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "fundamentacaoPedido.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FundamentacaoPedido exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FundamentacaoPedido exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FundamentacaoPedidoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}