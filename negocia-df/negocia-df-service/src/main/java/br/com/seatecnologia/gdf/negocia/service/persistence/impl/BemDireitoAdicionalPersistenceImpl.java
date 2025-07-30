/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchBemDireitoAdicionalException;
import br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional;
import br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicionalTable;
import br.com.seatecnologia.gdf.negocia.model.impl.BemDireitoAdicionalImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.BemDireitoAdicionalModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.BemDireitoAdicionalPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.BemDireitoAdicionalUtil;
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
 * The persistence implementation for the bem direito adicional service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = BemDireitoAdicionalPersistence.class)
public class BemDireitoAdicionalPersistenceImpl
	extends BasePersistenceImpl<BemDireitoAdicional>
	implements BemDireitoAdicionalPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>BemDireitoAdicionalUtil</code> to access the bem direito adicional persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		BemDireitoAdicionalImpl.class.getName();

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
	 * Returns all the bem direito adicionals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching bem direito adicionals
	 */
	@Override
	public List<BemDireitoAdicional> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bem direito adicionals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @return the range of matching bem direito adicionals
	 */
	@Override
	public List<BemDireitoAdicional> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bem direito adicionals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bem direito adicionals
	 */
	@Override
	public List<BemDireitoAdicional> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BemDireitoAdicional> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bem direito adicionals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bem direito adicionals
	 */
	@Override
	public List<BemDireitoAdicional> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BemDireitoAdicional> orderByComparator,
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

		List<BemDireitoAdicional> list = null;

		if (useFinderCache) {
			list = (List<BemDireitoAdicional>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BemDireitoAdicional bemDireitoAdicional : list) {
					if (!uuid.equals(bemDireitoAdicional.getUuid())) {
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

			sb.append(_SQL_SELECT_BEMDIREITOADICIONAL_WHERE);

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
				sb.append(BemDireitoAdicionalModelImpl.ORDER_BY_JPQL);
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

				list = (List<BemDireitoAdicional>)QueryUtil.list(
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
	 * Returns the first bem direito adicional in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a matching bem direito adicional could not be found
	 */
	@Override
	public BemDireitoAdicional findByUuid_First(
			String uuid,
			OrderByComparator<BemDireitoAdicional> orderByComparator)
		throws NoSuchBemDireitoAdicionalException {

		BemDireitoAdicional bemDireitoAdicional = fetchByUuid_First(
			uuid, orderByComparator);

		if (bemDireitoAdicional != null) {
			return bemDireitoAdicional;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchBemDireitoAdicionalException(sb.toString());
	}

	/**
	 * Returns the first bem direito adicional in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bem direito adicional, or <code>null</code> if a matching bem direito adicional could not be found
	 */
	@Override
	public BemDireitoAdicional fetchByUuid_First(
		String uuid, OrderByComparator<BemDireitoAdicional> orderByComparator) {

		List<BemDireitoAdicional> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bem direito adicional in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a matching bem direito adicional could not be found
	 */
	@Override
	public BemDireitoAdicional findByUuid_Last(
			String uuid,
			OrderByComparator<BemDireitoAdicional> orderByComparator)
		throws NoSuchBemDireitoAdicionalException {

		BemDireitoAdicional bemDireitoAdicional = fetchByUuid_Last(
			uuid, orderByComparator);

		if (bemDireitoAdicional != null) {
			return bemDireitoAdicional;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchBemDireitoAdicionalException(sb.toString());
	}

	/**
	 * Returns the last bem direito adicional in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bem direito adicional, or <code>null</code> if a matching bem direito adicional could not be found
	 */
	@Override
	public BemDireitoAdicional fetchByUuid_Last(
		String uuid, OrderByComparator<BemDireitoAdicional> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<BemDireitoAdicional> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bem direito adicionals before and after the current bem direito adicional in the ordered set where uuid = &#63;.
	 *
	 * @param bemId the primary key of the current bem direito adicional
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a bem direito adicional with the primary key could not be found
	 */
	@Override
	public BemDireitoAdicional[] findByUuid_PrevAndNext(
			long bemId, String uuid,
			OrderByComparator<BemDireitoAdicional> orderByComparator)
		throws NoSuchBemDireitoAdicionalException {

		uuid = Objects.toString(uuid, "");

		BemDireitoAdicional bemDireitoAdicional = findByPrimaryKey(bemId);

		Session session = null;

		try {
			session = openSession();

			BemDireitoAdicional[] array = new BemDireitoAdicionalImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, bemDireitoAdicional, uuid, orderByComparator, true);

			array[1] = bemDireitoAdicional;

			array[2] = getByUuid_PrevAndNext(
				session, bemDireitoAdicional, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected BemDireitoAdicional getByUuid_PrevAndNext(
		Session session, BemDireitoAdicional bemDireitoAdicional, String uuid,
		OrderByComparator<BemDireitoAdicional> orderByComparator,
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

		sb.append(_SQL_SELECT_BEMDIREITOADICIONAL_WHERE);

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
			sb.append(BemDireitoAdicionalModelImpl.ORDER_BY_JPQL);
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
						bemDireitoAdicional)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<BemDireitoAdicional> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bem direito adicionals where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (BemDireitoAdicional bemDireitoAdicional :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(bemDireitoAdicional);
		}
	}

	/**
	 * Returns the number of bem direito adicionals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching bem direito adicionals
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_BEMDIREITOADICIONAL_WHERE);

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
		"bemDireitoAdicional.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(bemDireitoAdicional.uuid IS NULL OR bemDireitoAdicional.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByPropostaId;
	private FinderPath _finderPathWithoutPaginationFindByPropostaId;
	private FinderPath _finderPathCountByPropostaId;

	/**
	 * Returns all the bem direito adicionals where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching bem direito adicionals
	 */
	@Override
	public List<BemDireitoAdicional> findByPropostaId(long propostaId) {
		return findByPropostaId(
			propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bem direito adicionals where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @return the range of matching bem direito adicionals
	 */
	@Override
	public List<BemDireitoAdicional> findByPropostaId(
		long propostaId, int start, int end) {

		return findByPropostaId(propostaId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bem direito adicionals where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bem direito adicionals
	 */
	@Override
	public List<BemDireitoAdicional> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<BemDireitoAdicional> orderByComparator) {

		return findByPropostaId(
			propostaId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bem direito adicionals where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bem direito adicionals
	 */
	@Override
	public List<BemDireitoAdicional> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<BemDireitoAdicional> orderByComparator,
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

		List<BemDireitoAdicional> list = null;

		if (useFinderCache) {
			list = (List<BemDireitoAdicional>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BemDireitoAdicional bemDireitoAdicional : list) {
					if (propostaId != bemDireitoAdicional.getPropostaId()) {
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

			sb.append(_SQL_SELECT_BEMDIREITOADICIONAL_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(BemDireitoAdicionalModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

				list = (List<BemDireitoAdicional>)QueryUtil.list(
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
	 * Returns the first bem direito adicional in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a matching bem direito adicional could not be found
	 */
	@Override
	public BemDireitoAdicional findByPropostaId_First(
			long propostaId,
			OrderByComparator<BemDireitoAdicional> orderByComparator)
		throws NoSuchBemDireitoAdicionalException {

		BemDireitoAdicional bemDireitoAdicional = fetchByPropostaId_First(
			propostaId, orderByComparator);

		if (bemDireitoAdicional != null) {
			return bemDireitoAdicional;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchBemDireitoAdicionalException(sb.toString());
	}

	/**
	 * Returns the first bem direito adicional in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bem direito adicional, or <code>null</code> if a matching bem direito adicional could not be found
	 */
	@Override
	public BemDireitoAdicional fetchByPropostaId_First(
		long propostaId,
		OrderByComparator<BemDireitoAdicional> orderByComparator) {

		List<BemDireitoAdicional> list = findByPropostaId(
			propostaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bem direito adicional in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a matching bem direito adicional could not be found
	 */
	@Override
	public BemDireitoAdicional findByPropostaId_Last(
			long propostaId,
			OrderByComparator<BemDireitoAdicional> orderByComparator)
		throws NoSuchBemDireitoAdicionalException {

		BemDireitoAdicional bemDireitoAdicional = fetchByPropostaId_Last(
			propostaId, orderByComparator);

		if (bemDireitoAdicional != null) {
			return bemDireitoAdicional;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchBemDireitoAdicionalException(sb.toString());
	}

	/**
	 * Returns the last bem direito adicional in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bem direito adicional, or <code>null</code> if a matching bem direito adicional could not be found
	 */
	@Override
	public BemDireitoAdicional fetchByPropostaId_Last(
		long propostaId,
		OrderByComparator<BemDireitoAdicional> orderByComparator) {

		int count = countByPropostaId(propostaId);

		if (count == 0) {
			return null;
		}

		List<BemDireitoAdicional> list = findByPropostaId(
			propostaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bem direito adicionals before and after the current bem direito adicional in the ordered set where propostaId = &#63;.
	 *
	 * @param bemId the primary key of the current bem direito adicional
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a bem direito adicional with the primary key could not be found
	 */
	@Override
	public BemDireitoAdicional[] findByPropostaId_PrevAndNext(
			long bemId, long propostaId,
			OrderByComparator<BemDireitoAdicional> orderByComparator)
		throws NoSuchBemDireitoAdicionalException {

		BemDireitoAdicional bemDireitoAdicional = findByPrimaryKey(bemId);

		Session session = null;

		try {
			session = openSession();

			BemDireitoAdicional[] array = new BemDireitoAdicionalImpl[3];

			array[0] = getByPropostaId_PrevAndNext(
				session, bemDireitoAdicional, propostaId, orderByComparator,
				true);

			array[1] = bemDireitoAdicional;

			array[2] = getByPropostaId_PrevAndNext(
				session, bemDireitoAdicional, propostaId, orderByComparator,
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

	protected BemDireitoAdicional getByPropostaId_PrevAndNext(
		Session session, BemDireitoAdicional bemDireitoAdicional,
		long propostaId,
		OrderByComparator<BemDireitoAdicional> orderByComparator,
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

		sb.append(_SQL_SELECT_BEMDIREITOADICIONAL_WHERE);

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
			sb.append(BemDireitoAdicionalModelImpl.ORDER_BY_JPQL);
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
						bemDireitoAdicional)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<BemDireitoAdicional> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bem direito adicionals where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	@Override
	public void removeByPropostaId(long propostaId) {
		for (BemDireitoAdicional bemDireitoAdicional :
				findByPropostaId(
					propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(bemDireitoAdicional);
		}
	}

	/**
	 * Returns the number of bem direito adicionals where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching bem direito adicionals
	 */
	@Override
	public int countByPropostaId(long propostaId) {
		FinderPath finderPath = _finderPathCountByPropostaId;

		Object[] finderArgs = new Object[] {propostaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_BEMDIREITOADICIONAL_WHERE);

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
		"bemDireitoAdicional.propostaId = ?";

	public BemDireitoAdicionalPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(BemDireitoAdicional.class);

		setModelImplClass(BemDireitoAdicionalImpl.class);
		setModelPKClass(long.class);

		setTable(BemDireitoAdicionalTable.INSTANCE);
	}

	/**
	 * Caches the bem direito adicional in the entity cache if it is enabled.
	 *
	 * @param bemDireitoAdicional the bem direito adicional
	 */
	@Override
	public void cacheResult(BemDireitoAdicional bemDireitoAdicional) {
		entityCache.putResult(
			BemDireitoAdicionalImpl.class, bemDireitoAdicional.getPrimaryKey(),
			bemDireitoAdicional);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the bem direito adicionals in the entity cache if it is enabled.
	 *
	 * @param bemDireitoAdicionals the bem direito adicionals
	 */
	@Override
	public void cacheResult(List<BemDireitoAdicional> bemDireitoAdicionals) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (bemDireitoAdicionals.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (BemDireitoAdicional bemDireitoAdicional : bemDireitoAdicionals) {
			if (entityCache.getResult(
					BemDireitoAdicionalImpl.class,
					bemDireitoAdicional.getPrimaryKey()) == null) {

				cacheResult(bemDireitoAdicional);
			}
		}
	}

	/**
	 * Clears the cache for all bem direito adicionals.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BemDireitoAdicionalImpl.class);

		finderCache.clearCache(BemDireitoAdicionalImpl.class);
	}

	/**
	 * Clears the cache for the bem direito adicional.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BemDireitoAdicional bemDireitoAdicional) {
		entityCache.removeResult(
			BemDireitoAdicionalImpl.class, bemDireitoAdicional);
	}

	@Override
	public void clearCache(List<BemDireitoAdicional> bemDireitoAdicionals) {
		for (BemDireitoAdicional bemDireitoAdicional : bemDireitoAdicionals) {
			entityCache.removeResult(
				BemDireitoAdicionalImpl.class, bemDireitoAdicional);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(BemDireitoAdicionalImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(BemDireitoAdicionalImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new bem direito adicional with the primary key. Does not add the bem direito adicional to the database.
	 *
	 * @param bemId the primary key for the new bem direito adicional
	 * @return the new bem direito adicional
	 */
	@Override
	public BemDireitoAdicional create(long bemId) {
		BemDireitoAdicional bemDireitoAdicional = new BemDireitoAdicionalImpl();

		bemDireitoAdicional.setNew(true);
		bemDireitoAdicional.setPrimaryKey(bemId);

		String uuid = PortalUUIDUtil.generate();

		bemDireitoAdicional.setUuid(uuid);

		return bemDireitoAdicional;
	}

	/**
	 * Removes the bem direito adicional with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bemId the primary key of the bem direito adicional
	 * @return the bem direito adicional that was removed
	 * @throws NoSuchBemDireitoAdicionalException if a bem direito adicional with the primary key could not be found
	 */
	@Override
	public BemDireitoAdicional remove(long bemId)
		throws NoSuchBemDireitoAdicionalException {

		return remove((Serializable)bemId);
	}

	/**
	 * Removes the bem direito adicional with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bem direito adicional
	 * @return the bem direito adicional that was removed
	 * @throws NoSuchBemDireitoAdicionalException if a bem direito adicional with the primary key could not be found
	 */
	@Override
	public BemDireitoAdicional remove(Serializable primaryKey)
		throws NoSuchBemDireitoAdicionalException {

		Session session = null;

		try {
			session = openSession();

			BemDireitoAdicional bemDireitoAdicional =
				(BemDireitoAdicional)session.get(
					BemDireitoAdicionalImpl.class, primaryKey);

			if (bemDireitoAdicional == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBemDireitoAdicionalException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(bemDireitoAdicional);
		}
		catch (NoSuchBemDireitoAdicionalException noSuchEntityException) {
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
	protected BemDireitoAdicional removeImpl(
		BemDireitoAdicional bemDireitoAdicional) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bemDireitoAdicional)) {
				bemDireitoAdicional = (BemDireitoAdicional)session.get(
					BemDireitoAdicionalImpl.class,
					bemDireitoAdicional.getPrimaryKeyObj());
			}

			if (bemDireitoAdicional != null) {
				session.delete(bemDireitoAdicional);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (bemDireitoAdicional != null) {
			clearCache(bemDireitoAdicional);
		}

		return bemDireitoAdicional;
	}

	@Override
	public BemDireitoAdicional updateImpl(
		BemDireitoAdicional bemDireitoAdicional) {

		boolean isNew = bemDireitoAdicional.isNew();

		if (!(bemDireitoAdicional instanceof BemDireitoAdicionalModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(bemDireitoAdicional.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					bemDireitoAdicional);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in bemDireitoAdicional proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom BemDireitoAdicional implementation " +
					bemDireitoAdicional.getClass());
		}

		BemDireitoAdicionalModelImpl bemDireitoAdicionalModelImpl =
			(BemDireitoAdicionalModelImpl)bemDireitoAdicional;

		if (Validator.isNull(bemDireitoAdicional.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			bemDireitoAdicional.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(bemDireitoAdicional);
			}
			else {
				bemDireitoAdicional = (BemDireitoAdicional)session.merge(
					bemDireitoAdicional);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			BemDireitoAdicionalImpl.class, bemDireitoAdicionalModelImpl, false,
			true);

		if (isNew) {
			bemDireitoAdicional.setNew(false);
		}

		bemDireitoAdicional.resetOriginalValues();

		return bemDireitoAdicional;
	}

	/**
	 * Returns the bem direito adicional with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bem direito adicional
	 * @return the bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a bem direito adicional with the primary key could not be found
	 */
	@Override
	public BemDireitoAdicional findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBemDireitoAdicionalException {

		BemDireitoAdicional bemDireitoAdicional = fetchByPrimaryKey(primaryKey);

		if (bemDireitoAdicional == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBemDireitoAdicionalException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return bemDireitoAdicional;
	}

	/**
	 * Returns the bem direito adicional with the primary key or throws a <code>NoSuchBemDireitoAdicionalException</code> if it could not be found.
	 *
	 * @param bemId the primary key of the bem direito adicional
	 * @return the bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a bem direito adicional with the primary key could not be found
	 */
	@Override
	public BemDireitoAdicional findByPrimaryKey(long bemId)
		throws NoSuchBemDireitoAdicionalException {

		return findByPrimaryKey((Serializable)bemId);
	}

	/**
	 * Returns the bem direito adicional with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bemId the primary key of the bem direito adicional
	 * @return the bem direito adicional, or <code>null</code> if a bem direito adicional with the primary key could not be found
	 */
	@Override
	public BemDireitoAdicional fetchByPrimaryKey(long bemId) {
		return fetchByPrimaryKey((Serializable)bemId);
	}

	/**
	 * Returns all the bem direito adicionals.
	 *
	 * @return the bem direito adicionals
	 */
	@Override
	public List<BemDireitoAdicional> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bem direito adicionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @return the range of bem direito adicionals
	 */
	@Override
	public List<BemDireitoAdicional> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bem direito adicionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bem direito adicionals
	 */
	@Override
	public List<BemDireitoAdicional> findAll(
		int start, int end,
		OrderByComparator<BemDireitoAdicional> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bem direito adicionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bem direito adicionals
	 */
	@Override
	public List<BemDireitoAdicional> findAll(
		int start, int end,
		OrderByComparator<BemDireitoAdicional> orderByComparator,
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

		List<BemDireitoAdicional> list = null;

		if (useFinderCache) {
			list = (List<BemDireitoAdicional>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_BEMDIREITOADICIONAL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_BEMDIREITOADICIONAL;

				sql = sql.concat(BemDireitoAdicionalModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<BemDireitoAdicional>)QueryUtil.list(
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
	 * Removes all the bem direito adicionals from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (BemDireitoAdicional bemDireitoAdicional : findAll()) {
			remove(bemDireitoAdicional);
		}
	}

	/**
	 * Returns the number of bem direito adicionals.
	 *
	 * @return the number of bem direito adicionals
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
					_SQL_COUNT_BEMDIREITOADICIONAL);

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
		return "bemId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_BEMDIREITOADICIONAL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return BemDireitoAdicionalModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the bem direito adicional persistence.
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

		BemDireitoAdicionalUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		BemDireitoAdicionalUtil.setPersistence(null);

		entityCache.removeCache(BemDireitoAdicionalImpl.class.getName());
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

	private static final String _SQL_SELECT_BEMDIREITOADICIONAL =
		"SELECT bemDireitoAdicional FROM BemDireitoAdicional bemDireitoAdicional";

	private static final String _SQL_SELECT_BEMDIREITOADICIONAL_WHERE =
		"SELECT bemDireitoAdicional FROM BemDireitoAdicional bemDireitoAdicional WHERE ";

	private static final String _SQL_COUNT_BEMDIREITOADICIONAL =
		"SELECT COUNT(bemDireitoAdicional) FROM BemDireitoAdicional bemDireitoAdicional";

	private static final String _SQL_COUNT_BEMDIREITOADICIONAL_WHERE =
		"SELECT COUNT(bemDireitoAdicional) FROM BemDireitoAdicional bemDireitoAdicional WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "bemDireitoAdicional.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No BemDireitoAdicional exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No BemDireitoAdicional exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		BemDireitoAdicionalPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}