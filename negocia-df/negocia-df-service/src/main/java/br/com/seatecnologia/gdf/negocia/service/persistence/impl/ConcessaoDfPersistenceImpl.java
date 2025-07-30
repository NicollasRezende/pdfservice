/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchConcessaoDfException;
import br.com.seatecnologia.gdf.negocia.model.ConcessaoDf;
import br.com.seatecnologia.gdf.negocia.model.ConcessaoDfTable;
import br.com.seatecnologia.gdf.negocia.model.impl.ConcessaoDfImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.ConcessaoDfModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.ConcessaoDfPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.ConcessaoDfUtil;
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
 * The persistence implementation for the concessao df service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ConcessaoDfPersistence.class)
public class ConcessaoDfPersistenceImpl
	extends BasePersistenceImpl<ConcessaoDf> implements ConcessaoDfPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ConcessaoDfUtil</code> to access the concessao df persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ConcessaoDfImpl.class.getName();

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
	 * Returns all the concessao dfs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching concessao dfs
	 */
	@Override
	public List<ConcessaoDf> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the concessao dfs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @return the range of matching concessao dfs
	 */
	@Override
	public List<ConcessaoDf> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the concessao dfs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching concessao dfs
	 */
	@Override
	public List<ConcessaoDf> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ConcessaoDf> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the concessao dfs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching concessao dfs
	 */
	@Override
	public List<ConcessaoDf> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ConcessaoDf> orderByComparator,
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

		List<ConcessaoDf> list = null;

		if (useFinderCache) {
			list = (List<ConcessaoDf>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ConcessaoDf concessaoDf : list) {
					if (!uuid.equals(concessaoDf.getUuid())) {
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

			sb.append(_SQL_SELECT_CONCESSAODF_WHERE);

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
				sb.append(ConcessaoDfModelImpl.ORDER_BY_JPQL);
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

				list = (List<ConcessaoDf>)QueryUtil.list(
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
	 * Returns the first concessao df in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching concessao df
	 * @throws NoSuchConcessaoDfException if a matching concessao df could not be found
	 */
	@Override
	public ConcessaoDf findByUuid_First(
			String uuid, OrderByComparator<ConcessaoDf> orderByComparator)
		throws NoSuchConcessaoDfException {

		ConcessaoDf concessaoDf = fetchByUuid_First(uuid, orderByComparator);

		if (concessaoDf != null) {
			return concessaoDf;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchConcessaoDfException(sb.toString());
	}

	/**
	 * Returns the first concessao df in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching concessao df, or <code>null</code> if a matching concessao df could not be found
	 */
	@Override
	public ConcessaoDf fetchByUuid_First(
		String uuid, OrderByComparator<ConcessaoDf> orderByComparator) {

		List<ConcessaoDf> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last concessao df in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching concessao df
	 * @throws NoSuchConcessaoDfException if a matching concessao df could not be found
	 */
	@Override
	public ConcessaoDf findByUuid_Last(
			String uuid, OrderByComparator<ConcessaoDf> orderByComparator)
		throws NoSuchConcessaoDfException {

		ConcessaoDf concessaoDf = fetchByUuid_Last(uuid, orderByComparator);

		if (concessaoDf != null) {
			return concessaoDf;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchConcessaoDfException(sb.toString());
	}

	/**
	 * Returns the last concessao df in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching concessao df, or <code>null</code> if a matching concessao df could not be found
	 */
	@Override
	public ConcessaoDf fetchByUuid_Last(
		String uuid, OrderByComparator<ConcessaoDf> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<ConcessaoDf> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the concessao dfs before and after the current concessao df in the ordered set where uuid = &#63;.
	 *
	 * @param concessaoId the primary key of the current concessao df
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next concessao df
	 * @throws NoSuchConcessaoDfException if a concessao df with the primary key could not be found
	 */
	@Override
	public ConcessaoDf[] findByUuid_PrevAndNext(
			long concessaoId, String uuid,
			OrderByComparator<ConcessaoDf> orderByComparator)
		throws NoSuchConcessaoDfException {

		uuid = Objects.toString(uuid, "");

		ConcessaoDf concessaoDf = findByPrimaryKey(concessaoId);

		Session session = null;

		try {
			session = openSession();

			ConcessaoDf[] array = new ConcessaoDfImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, concessaoDf, uuid, orderByComparator, true);

			array[1] = concessaoDf;

			array[2] = getByUuid_PrevAndNext(
				session, concessaoDf, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ConcessaoDf getByUuid_PrevAndNext(
		Session session, ConcessaoDf concessaoDf, String uuid,
		OrderByComparator<ConcessaoDf> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CONCESSAODF_WHERE);

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
			sb.append(ConcessaoDfModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(concessaoDf)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ConcessaoDf> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the concessao dfs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (ConcessaoDf concessaoDf :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(concessaoDf);
		}
	}

	/**
	 * Returns the number of concessao dfs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching concessao dfs
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CONCESSAODF_WHERE);

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
		"concessaoDf.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(concessaoDf.uuid IS NULL OR concessaoDf.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByPropostaId;
	private FinderPath _finderPathWithoutPaginationFindByPropostaId;
	private FinderPath _finderPathCountByPropostaId;

	/**
	 * Returns all the concessao dfs where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching concessao dfs
	 */
	@Override
	public List<ConcessaoDf> findByPropostaId(long propostaId) {
		return findByPropostaId(
			propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the concessao dfs where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @return the range of matching concessao dfs
	 */
	@Override
	public List<ConcessaoDf> findByPropostaId(
		long propostaId, int start, int end) {

		return findByPropostaId(propostaId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the concessao dfs where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching concessao dfs
	 */
	@Override
	public List<ConcessaoDf> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<ConcessaoDf> orderByComparator) {

		return findByPropostaId(
			propostaId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the concessao dfs where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching concessao dfs
	 */
	@Override
	public List<ConcessaoDf> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<ConcessaoDf> orderByComparator,
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

		List<ConcessaoDf> list = null;

		if (useFinderCache) {
			list = (List<ConcessaoDf>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ConcessaoDf concessaoDf : list) {
					if (propostaId != concessaoDf.getPropostaId()) {
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

			sb.append(_SQL_SELECT_CONCESSAODF_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ConcessaoDfModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

				list = (List<ConcessaoDf>)QueryUtil.list(
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
	 * Returns the first concessao df in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching concessao df
	 * @throws NoSuchConcessaoDfException if a matching concessao df could not be found
	 */
	@Override
	public ConcessaoDf findByPropostaId_First(
			long propostaId, OrderByComparator<ConcessaoDf> orderByComparator)
		throws NoSuchConcessaoDfException {

		ConcessaoDf concessaoDf = fetchByPropostaId_First(
			propostaId, orderByComparator);

		if (concessaoDf != null) {
			return concessaoDf;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchConcessaoDfException(sb.toString());
	}

	/**
	 * Returns the first concessao df in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching concessao df, or <code>null</code> if a matching concessao df could not be found
	 */
	@Override
	public ConcessaoDf fetchByPropostaId_First(
		long propostaId, OrderByComparator<ConcessaoDf> orderByComparator) {

		List<ConcessaoDf> list = findByPropostaId(
			propostaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last concessao df in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching concessao df
	 * @throws NoSuchConcessaoDfException if a matching concessao df could not be found
	 */
	@Override
	public ConcessaoDf findByPropostaId_Last(
			long propostaId, OrderByComparator<ConcessaoDf> orderByComparator)
		throws NoSuchConcessaoDfException {

		ConcessaoDf concessaoDf = fetchByPropostaId_Last(
			propostaId, orderByComparator);

		if (concessaoDf != null) {
			return concessaoDf;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchConcessaoDfException(sb.toString());
	}

	/**
	 * Returns the last concessao df in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching concessao df, or <code>null</code> if a matching concessao df could not be found
	 */
	@Override
	public ConcessaoDf fetchByPropostaId_Last(
		long propostaId, OrderByComparator<ConcessaoDf> orderByComparator) {

		int count = countByPropostaId(propostaId);

		if (count == 0) {
			return null;
		}

		List<ConcessaoDf> list = findByPropostaId(
			propostaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the concessao dfs before and after the current concessao df in the ordered set where propostaId = &#63;.
	 *
	 * @param concessaoId the primary key of the current concessao df
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next concessao df
	 * @throws NoSuchConcessaoDfException if a concessao df with the primary key could not be found
	 */
	@Override
	public ConcessaoDf[] findByPropostaId_PrevAndNext(
			long concessaoId, long propostaId,
			OrderByComparator<ConcessaoDf> orderByComparator)
		throws NoSuchConcessaoDfException {

		ConcessaoDf concessaoDf = findByPrimaryKey(concessaoId);

		Session session = null;

		try {
			session = openSession();

			ConcessaoDf[] array = new ConcessaoDfImpl[3];

			array[0] = getByPropostaId_PrevAndNext(
				session, concessaoDf, propostaId, orderByComparator, true);

			array[1] = concessaoDf;

			array[2] = getByPropostaId_PrevAndNext(
				session, concessaoDf, propostaId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ConcessaoDf getByPropostaId_PrevAndNext(
		Session session, ConcessaoDf concessaoDf, long propostaId,
		OrderByComparator<ConcessaoDf> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CONCESSAODF_WHERE);

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
			sb.append(ConcessaoDfModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(propostaId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(concessaoDf)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ConcessaoDf> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the concessao dfs where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	@Override
	public void removeByPropostaId(long propostaId) {
		for (ConcessaoDf concessaoDf :
				findByPropostaId(
					propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(concessaoDf);
		}
	}

	/**
	 * Returns the number of concessao dfs where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching concessao dfs
	 */
	@Override
	public int countByPropostaId(long propostaId) {
		FinderPath finderPath = _finderPathCountByPropostaId;

		Object[] finderArgs = new Object[] {propostaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CONCESSAODF_WHERE);

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
		"concessaoDf.propostaId = ?";

	public ConcessaoDfPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(ConcessaoDf.class);

		setModelImplClass(ConcessaoDfImpl.class);
		setModelPKClass(long.class);

		setTable(ConcessaoDfTable.INSTANCE);
	}

	/**
	 * Caches the concessao df in the entity cache if it is enabled.
	 *
	 * @param concessaoDf the concessao df
	 */
	@Override
	public void cacheResult(ConcessaoDf concessaoDf) {
		entityCache.putResult(
			ConcessaoDfImpl.class, concessaoDf.getPrimaryKey(), concessaoDf);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the concessao dfs in the entity cache if it is enabled.
	 *
	 * @param concessaoDfs the concessao dfs
	 */
	@Override
	public void cacheResult(List<ConcessaoDf> concessaoDfs) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (concessaoDfs.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ConcessaoDf concessaoDf : concessaoDfs) {
			if (entityCache.getResult(
					ConcessaoDfImpl.class, concessaoDf.getPrimaryKey()) ==
						null) {

				cacheResult(concessaoDf);
			}
		}
	}

	/**
	 * Clears the cache for all concessao dfs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ConcessaoDfImpl.class);

		finderCache.clearCache(ConcessaoDfImpl.class);
	}

	/**
	 * Clears the cache for the concessao df.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ConcessaoDf concessaoDf) {
		entityCache.removeResult(ConcessaoDfImpl.class, concessaoDf);
	}

	@Override
	public void clearCache(List<ConcessaoDf> concessaoDfs) {
		for (ConcessaoDf concessaoDf : concessaoDfs) {
			entityCache.removeResult(ConcessaoDfImpl.class, concessaoDf);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ConcessaoDfImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ConcessaoDfImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new concessao df with the primary key. Does not add the concessao df to the database.
	 *
	 * @param concessaoId the primary key for the new concessao df
	 * @return the new concessao df
	 */
	@Override
	public ConcessaoDf create(long concessaoId) {
		ConcessaoDf concessaoDf = new ConcessaoDfImpl();

		concessaoDf.setNew(true);
		concessaoDf.setPrimaryKey(concessaoId);

		String uuid = PortalUUIDUtil.generate();

		concessaoDf.setUuid(uuid);

		return concessaoDf;
	}

	/**
	 * Removes the concessao df with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param concessaoId the primary key of the concessao df
	 * @return the concessao df that was removed
	 * @throws NoSuchConcessaoDfException if a concessao df with the primary key could not be found
	 */
	@Override
	public ConcessaoDf remove(long concessaoId)
		throws NoSuchConcessaoDfException {

		return remove((Serializable)concessaoId);
	}

	/**
	 * Removes the concessao df with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the concessao df
	 * @return the concessao df that was removed
	 * @throws NoSuchConcessaoDfException if a concessao df with the primary key could not be found
	 */
	@Override
	public ConcessaoDf remove(Serializable primaryKey)
		throws NoSuchConcessaoDfException {

		Session session = null;

		try {
			session = openSession();

			ConcessaoDf concessaoDf = (ConcessaoDf)session.get(
				ConcessaoDfImpl.class, primaryKey);

			if (concessaoDf == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchConcessaoDfException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(concessaoDf);
		}
		catch (NoSuchConcessaoDfException noSuchEntityException) {
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
	protected ConcessaoDf removeImpl(ConcessaoDf concessaoDf) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(concessaoDf)) {
				concessaoDf = (ConcessaoDf)session.get(
					ConcessaoDfImpl.class, concessaoDf.getPrimaryKeyObj());
			}

			if (concessaoDf != null) {
				session.delete(concessaoDf);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (concessaoDf != null) {
			clearCache(concessaoDf);
		}

		return concessaoDf;
	}

	@Override
	public ConcessaoDf updateImpl(ConcessaoDf concessaoDf) {
		boolean isNew = concessaoDf.isNew();

		if (!(concessaoDf instanceof ConcessaoDfModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(concessaoDf.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(concessaoDf);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in concessaoDf proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ConcessaoDf implementation " +
					concessaoDf.getClass());
		}

		ConcessaoDfModelImpl concessaoDfModelImpl =
			(ConcessaoDfModelImpl)concessaoDf;

		if (Validator.isNull(concessaoDf.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			concessaoDf.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(concessaoDf);
			}
			else {
				concessaoDf = (ConcessaoDf)session.merge(concessaoDf);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ConcessaoDfImpl.class, concessaoDfModelImpl, false, true);

		if (isNew) {
			concessaoDf.setNew(false);
		}

		concessaoDf.resetOriginalValues();

		return concessaoDf;
	}

	/**
	 * Returns the concessao df with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the concessao df
	 * @return the concessao df
	 * @throws NoSuchConcessaoDfException if a concessao df with the primary key could not be found
	 */
	@Override
	public ConcessaoDf findByPrimaryKey(Serializable primaryKey)
		throws NoSuchConcessaoDfException {

		ConcessaoDf concessaoDf = fetchByPrimaryKey(primaryKey);

		if (concessaoDf == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchConcessaoDfException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return concessaoDf;
	}

	/**
	 * Returns the concessao df with the primary key or throws a <code>NoSuchConcessaoDfException</code> if it could not be found.
	 *
	 * @param concessaoId the primary key of the concessao df
	 * @return the concessao df
	 * @throws NoSuchConcessaoDfException if a concessao df with the primary key could not be found
	 */
	@Override
	public ConcessaoDf findByPrimaryKey(long concessaoId)
		throws NoSuchConcessaoDfException {

		return findByPrimaryKey((Serializable)concessaoId);
	}

	/**
	 * Returns the concessao df with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param concessaoId the primary key of the concessao df
	 * @return the concessao df, or <code>null</code> if a concessao df with the primary key could not be found
	 */
	@Override
	public ConcessaoDf fetchByPrimaryKey(long concessaoId) {
		return fetchByPrimaryKey((Serializable)concessaoId);
	}

	/**
	 * Returns all the concessao dfs.
	 *
	 * @return the concessao dfs
	 */
	@Override
	public List<ConcessaoDf> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the concessao dfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @return the range of concessao dfs
	 */
	@Override
	public List<ConcessaoDf> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the concessao dfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of concessao dfs
	 */
	@Override
	public List<ConcessaoDf> findAll(
		int start, int end, OrderByComparator<ConcessaoDf> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the concessao dfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of concessao dfs
	 */
	@Override
	public List<ConcessaoDf> findAll(
		int start, int end, OrderByComparator<ConcessaoDf> orderByComparator,
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

		List<ConcessaoDf> list = null;

		if (useFinderCache) {
			list = (List<ConcessaoDf>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CONCESSAODF);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CONCESSAODF;

				sql = sql.concat(ConcessaoDfModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ConcessaoDf>)QueryUtil.list(
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
	 * Removes all the concessao dfs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ConcessaoDf concessaoDf : findAll()) {
			remove(concessaoDf);
		}
	}

	/**
	 * Returns the number of concessao dfs.
	 *
	 * @return the number of concessao dfs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_CONCESSAODF);

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
		return "concessaoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CONCESSAODF;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ConcessaoDfModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the concessao df persistence.
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

		ConcessaoDfUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ConcessaoDfUtil.setPersistence(null);

		entityCache.removeCache(ConcessaoDfImpl.class.getName());
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

	private static final String _SQL_SELECT_CONCESSAODF =
		"SELECT concessaoDf FROM ConcessaoDf concessaoDf";

	private static final String _SQL_SELECT_CONCESSAODF_WHERE =
		"SELECT concessaoDf FROM ConcessaoDf concessaoDf WHERE ";

	private static final String _SQL_COUNT_CONCESSAODF =
		"SELECT COUNT(concessaoDf) FROM ConcessaoDf concessaoDf";

	private static final String _SQL_COUNT_CONCESSAODF_WHERE =
		"SELECT COUNT(concessaoDf) FROM ConcessaoDf concessaoDf WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "concessaoDf.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ConcessaoDf exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ConcessaoDf exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ConcessaoDfPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}