/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDemonstracaoContabilException;
import br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil;
import br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabilTable;
import br.com.seatecnologia.gdf.negocia.model.impl.DemonstracaoContabilImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.DemonstracaoContabilModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.DemonstracaoContabilPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DemonstracaoContabilUtil;
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
 * The persistence implementation for the demonstracao contabil service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = DemonstracaoContabilPersistence.class)
public class DemonstracaoContabilPersistenceImpl
	extends BasePersistenceImpl<DemonstracaoContabil>
	implements DemonstracaoContabilPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DemonstracaoContabilUtil</code> to access the demonstracao contabil persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DemonstracaoContabilImpl.class.getName();

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
	 * Returns all the demonstracao contabils where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching demonstracao contabils
	 */
	@Override
	public List<DemonstracaoContabil> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the demonstracao contabils where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @return the range of matching demonstracao contabils
	 */
	@Override
	public List<DemonstracaoContabil> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the demonstracao contabils where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demonstracao contabils
	 */
	@Override
	public List<DemonstracaoContabil> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DemonstracaoContabil> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the demonstracao contabils where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demonstracao contabils
	 */
	@Override
	public List<DemonstracaoContabil> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DemonstracaoContabil> orderByComparator,
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

		List<DemonstracaoContabil> list = null;

		if (useFinderCache) {
			list = (List<DemonstracaoContabil>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DemonstracaoContabil demonstracaoContabil : list) {
					if (!uuid.equals(demonstracaoContabil.getUuid())) {
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

			sb.append(_SQL_SELECT_DEMONSTRACAOCONTABIL_WHERE);

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
				sb.append(DemonstracaoContabilModelImpl.ORDER_BY_JPQL);
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

				list = (List<DemonstracaoContabil>)QueryUtil.list(
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
	 * Returns the first demonstracao contabil in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao contabil
	 * @throws NoSuchDemonstracaoContabilException if a matching demonstracao contabil could not be found
	 */
	@Override
	public DemonstracaoContabil findByUuid_First(
			String uuid,
			OrderByComparator<DemonstracaoContabil> orderByComparator)
		throws NoSuchDemonstracaoContabilException {

		DemonstracaoContabil demonstracaoContabil = fetchByUuid_First(
			uuid, orderByComparator);

		if (demonstracaoContabil != null) {
			return demonstracaoContabil;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDemonstracaoContabilException(sb.toString());
	}

	/**
	 * Returns the first demonstracao contabil in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao contabil, or <code>null</code> if a matching demonstracao contabil could not be found
	 */
	@Override
	public DemonstracaoContabil fetchByUuid_First(
		String uuid,
		OrderByComparator<DemonstracaoContabil> orderByComparator) {

		List<DemonstracaoContabil> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last demonstracao contabil in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao contabil
	 * @throws NoSuchDemonstracaoContabilException if a matching demonstracao contabil could not be found
	 */
	@Override
	public DemonstracaoContabil findByUuid_Last(
			String uuid,
			OrderByComparator<DemonstracaoContabil> orderByComparator)
		throws NoSuchDemonstracaoContabilException {

		DemonstracaoContabil demonstracaoContabil = fetchByUuid_Last(
			uuid, orderByComparator);

		if (demonstracaoContabil != null) {
			return demonstracaoContabil;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDemonstracaoContabilException(sb.toString());
	}

	/**
	 * Returns the last demonstracao contabil in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao contabil, or <code>null</code> if a matching demonstracao contabil could not be found
	 */
	@Override
	public DemonstracaoContabil fetchByUuid_Last(
		String uuid,
		OrderByComparator<DemonstracaoContabil> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<DemonstracaoContabil> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the demonstracao contabils before and after the current demonstracao contabil in the ordered set where uuid = &#63;.
	 *
	 * @param demonstracaoId the primary key of the current demonstracao contabil
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demonstracao contabil
	 * @throws NoSuchDemonstracaoContabilException if a demonstracao contabil with the primary key could not be found
	 */
	@Override
	public DemonstracaoContabil[] findByUuid_PrevAndNext(
			long demonstracaoId, String uuid,
			OrderByComparator<DemonstracaoContabil> orderByComparator)
		throws NoSuchDemonstracaoContabilException {

		uuid = Objects.toString(uuid, "");

		DemonstracaoContabil demonstracaoContabil = findByPrimaryKey(
			demonstracaoId);

		Session session = null;

		try {
			session = openSession();

			DemonstracaoContabil[] array = new DemonstracaoContabilImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, demonstracaoContabil, uuid, orderByComparator, true);

			array[1] = demonstracaoContabil;

			array[2] = getByUuid_PrevAndNext(
				session, demonstracaoContabil, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected DemonstracaoContabil getByUuid_PrevAndNext(
		Session session, DemonstracaoContabil demonstracaoContabil, String uuid,
		OrderByComparator<DemonstracaoContabil> orderByComparator,
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

		sb.append(_SQL_SELECT_DEMONSTRACAOCONTABIL_WHERE);

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
			sb.append(DemonstracaoContabilModelImpl.ORDER_BY_JPQL);
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
						demonstracaoContabil)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DemonstracaoContabil> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the demonstracao contabils where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (DemonstracaoContabil demonstracaoContabil :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(demonstracaoContabil);
		}
	}

	/**
	 * Returns the number of demonstracao contabils where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching demonstracao contabils
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DEMONSTRACAOCONTABIL_WHERE);

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
		"demonstracaoContabil.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(demonstracaoContabil.uuid IS NULL OR demonstracaoContabil.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByPropostaId;
	private FinderPath _finderPathWithoutPaginationFindByPropostaId;
	private FinderPath _finderPathCountByPropostaId;

	/**
	 * Returns all the demonstracao contabils where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching demonstracao contabils
	 */
	@Override
	public List<DemonstracaoContabil> findByPropostaId(long propostaId) {
		return findByPropostaId(
			propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the demonstracao contabils where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @return the range of matching demonstracao contabils
	 */
	@Override
	public List<DemonstracaoContabil> findByPropostaId(
		long propostaId, int start, int end) {

		return findByPropostaId(propostaId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the demonstracao contabils where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demonstracao contabils
	 */
	@Override
	public List<DemonstracaoContabil> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<DemonstracaoContabil> orderByComparator) {

		return findByPropostaId(
			propostaId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the demonstracao contabils where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demonstracao contabils
	 */
	@Override
	public List<DemonstracaoContabil> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<DemonstracaoContabil> orderByComparator,
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

		List<DemonstracaoContabil> list = null;

		if (useFinderCache) {
			list = (List<DemonstracaoContabil>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DemonstracaoContabil demonstracaoContabil : list) {
					if (propostaId != demonstracaoContabil.getPropostaId()) {
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

			sb.append(_SQL_SELECT_DEMONSTRACAOCONTABIL_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(DemonstracaoContabilModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

				list = (List<DemonstracaoContabil>)QueryUtil.list(
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
	 * Returns the first demonstracao contabil in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao contabil
	 * @throws NoSuchDemonstracaoContabilException if a matching demonstracao contabil could not be found
	 */
	@Override
	public DemonstracaoContabil findByPropostaId_First(
			long propostaId,
			OrderByComparator<DemonstracaoContabil> orderByComparator)
		throws NoSuchDemonstracaoContabilException {

		DemonstracaoContabil demonstracaoContabil = fetchByPropostaId_First(
			propostaId, orderByComparator);

		if (demonstracaoContabil != null) {
			return demonstracaoContabil;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchDemonstracaoContabilException(sb.toString());
	}

	/**
	 * Returns the first demonstracao contabil in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao contabil, or <code>null</code> if a matching demonstracao contabil could not be found
	 */
	@Override
	public DemonstracaoContabil fetchByPropostaId_First(
		long propostaId,
		OrderByComparator<DemonstracaoContabil> orderByComparator) {

		List<DemonstracaoContabil> list = findByPropostaId(
			propostaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last demonstracao contabil in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao contabil
	 * @throws NoSuchDemonstracaoContabilException if a matching demonstracao contabil could not be found
	 */
	@Override
	public DemonstracaoContabil findByPropostaId_Last(
			long propostaId,
			OrderByComparator<DemonstracaoContabil> orderByComparator)
		throws NoSuchDemonstracaoContabilException {

		DemonstracaoContabil demonstracaoContabil = fetchByPropostaId_Last(
			propostaId, orderByComparator);

		if (demonstracaoContabil != null) {
			return demonstracaoContabil;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchDemonstracaoContabilException(sb.toString());
	}

	/**
	 * Returns the last demonstracao contabil in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao contabil, or <code>null</code> if a matching demonstracao contabil could not be found
	 */
	@Override
	public DemonstracaoContabil fetchByPropostaId_Last(
		long propostaId,
		OrderByComparator<DemonstracaoContabil> orderByComparator) {

		int count = countByPropostaId(propostaId);

		if (count == 0) {
			return null;
		}

		List<DemonstracaoContabil> list = findByPropostaId(
			propostaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the demonstracao contabils before and after the current demonstracao contabil in the ordered set where propostaId = &#63;.
	 *
	 * @param demonstracaoId the primary key of the current demonstracao contabil
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demonstracao contabil
	 * @throws NoSuchDemonstracaoContabilException if a demonstracao contabil with the primary key could not be found
	 */
	@Override
	public DemonstracaoContabil[] findByPropostaId_PrevAndNext(
			long demonstracaoId, long propostaId,
			OrderByComparator<DemonstracaoContabil> orderByComparator)
		throws NoSuchDemonstracaoContabilException {

		DemonstracaoContabil demonstracaoContabil = findByPrimaryKey(
			demonstracaoId);

		Session session = null;

		try {
			session = openSession();

			DemonstracaoContabil[] array = new DemonstracaoContabilImpl[3];

			array[0] = getByPropostaId_PrevAndNext(
				session, demonstracaoContabil, propostaId, orderByComparator,
				true);

			array[1] = demonstracaoContabil;

			array[2] = getByPropostaId_PrevAndNext(
				session, demonstracaoContabil, propostaId, orderByComparator,
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

	protected DemonstracaoContabil getByPropostaId_PrevAndNext(
		Session session, DemonstracaoContabil demonstracaoContabil,
		long propostaId,
		OrderByComparator<DemonstracaoContabil> orderByComparator,
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

		sb.append(_SQL_SELECT_DEMONSTRACAOCONTABIL_WHERE);

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
			sb.append(DemonstracaoContabilModelImpl.ORDER_BY_JPQL);
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
						demonstracaoContabil)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DemonstracaoContabil> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the demonstracao contabils where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	@Override
	public void removeByPropostaId(long propostaId) {
		for (DemonstracaoContabil demonstracaoContabil :
				findByPropostaId(
					propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(demonstracaoContabil);
		}
	}

	/**
	 * Returns the number of demonstracao contabils where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching demonstracao contabils
	 */
	@Override
	public int countByPropostaId(long propostaId) {
		FinderPath finderPath = _finderPathCountByPropostaId;

		Object[] finderArgs = new Object[] {propostaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DEMONSTRACAOCONTABIL_WHERE);

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
		"demonstracaoContabil.propostaId = ?";

	public DemonstracaoContabilPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(DemonstracaoContabil.class);

		setModelImplClass(DemonstracaoContabilImpl.class);
		setModelPKClass(long.class);

		setTable(DemonstracaoContabilTable.INSTANCE);
	}

	/**
	 * Caches the demonstracao contabil in the entity cache if it is enabled.
	 *
	 * @param demonstracaoContabil the demonstracao contabil
	 */
	@Override
	public void cacheResult(DemonstracaoContabil demonstracaoContabil) {
		entityCache.putResult(
			DemonstracaoContabilImpl.class,
			demonstracaoContabil.getPrimaryKey(), demonstracaoContabil);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the demonstracao contabils in the entity cache if it is enabled.
	 *
	 * @param demonstracaoContabils the demonstracao contabils
	 */
	@Override
	public void cacheResult(List<DemonstracaoContabil> demonstracaoContabils) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (demonstracaoContabils.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (DemonstracaoContabil demonstracaoContabil :
				demonstracaoContabils) {

			if (entityCache.getResult(
					DemonstracaoContabilImpl.class,
					demonstracaoContabil.getPrimaryKey()) == null) {

				cacheResult(demonstracaoContabil);
			}
		}
	}

	/**
	 * Clears the cache for all demonstracao contabils.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DemonstracaoContabilImpl.class);

		finderCache.clearCache(DemonstracaoContabilImpl.class);
	}

	/**
	 * Clears the cache for the demonstracao contabil.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DemonstracaoContabil demonstracaoContabil) {
		entityCache.removeResult(
			DemonstracaoContabilImpl.class, demonstracaoContabil);
	}

	@Override
	public void clearCache(List<DemonstracaoContabil> demonstracaoContabils) {
		for (DemonstracaoContabil demonstracaoContabil :
				demonstracaoContabils) {

			entityCache.removeResult(
				DemonstracaoContabilImpl.class, demonstracaoContabil);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DemonstracaoContabilImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				DemonstracaoContabilImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new demonstracao contabil with the primary key. Does not add the demonstracao contabil to the database.
	 *
	 * @param demonstracaoId the primary key for the new demonstracao contabil
	 * @return the new demonstracao contabil
	 */
	@Override
	public DemonstracaoContabil create(long demonstracaoId) {
		DemonstracaoContabil demonstracaoContabil =
			new DemonstracaoContabilImpl();

		demonstracaoContabil.setNew(true);
		demonstracaoContabil.setPrimaryKey(demonstracaoId);

		String uuid = PortalUUIDUtil.generate();

		demonstracaoContabil.setUuid(uuid);

		return demonstracaoContabil;
	}

	/**
	 * Removes the demonstracao contabil with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param demonstracaoId the primary key of the demonstracao contabil
	 * @return the demonstracao contabil that was removed
	 * @throws NoSuchDemonstracaoContabilException if a demonstracao contabil with the primary key could not be found
	 */
	@Override
	public DemonstracaoContabil remove(long demonstracaoId)
		throws NoSuchDemonstracaoContabilException {

		return remove((Serializable)demonstracaoId);
	}

	/**
	 * Removes the demonstracao contabil with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the demonstracao contabil
	 * @return the demonstracao contabil that was removed
	 * @throws NoSuchDemonstracaoContabilException if a demonstracao contabil with the primary key could not be found
	 */
	@Override
	public DemonstracaoContabil remove(Serializable primaryKey)
		throws NoSuchDemonstracaoContabilException {

		Session session = null;

		try {
			session = openSession();

			DemonstracaoContabil demonstracaoContabil =
				(DemonstracaoContabil)session.get(
					DemonstracaoContabilImpl.class, primaryKey);

			if (demonstracaoContabil == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDemonstracaoContabilException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(demonstracaoContabil);
		}
		catch (NoSuchDemonstracaoContabilException noSuchEntityException) {
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
	protected DemonstracaoContabil removeImpl(
		DemonstracaoContabil demonstracaoContabil) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(demonstracaoContabil)) {
				demonstracaoContabil = (DemonstracaoContabil)session.get(
					DemonstracaoContabilImpl.class,
					demonstracaoContabil.getPrimaryKeyObj());
			}

			if (demonstracaoContabil != null) {
				session.delete(demonstracaoContabil);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (demonstracaoContabil != null) {
			clearCache(demonstracaoContabil);
		}

		return demonstracaoContabil;
	}

	@Override
	public DemonstracaoContabil updateImpl(
		DemonstracaoContabil demonstracaoContabil) {

		boolean isNew = demonstracaoContabil.isNew();

		if (!(demonstracaoContabil instanceof DemonstracaoContabilModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(demonstracaoContabil.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					demonstracaoContabil);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in demonstracaoContabil proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DemonstracaoContabil implementation " +
					demonstracaoContabil.getClass());
		}

		DemonstracaoContabilModelImpl demonstracaoContabilModelImpl =
			(DemonstracaoContabilModelImpl)demonstracaoContabil;

		if (Validator.isNull(demonstracaoContabil.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			demonstracaoContabil.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(demonstracaoContabil);
			}
			else {
				demonstracaoContabil = (DemonstracaoContabil)session.merge(
					demonstracaoContabil);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DemonstracaoContabilImpl.class, demonstracaoContabilModelImpl,
			false, true);

		if (isNew) {
			demonstracaoContabil.setNew(false);
		}

		demonstracaoContabil.resetOriginalValues();

		return demonstracaoContabil;
	}

	/**
	 * Returns the demonstracao contabil with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the demonstracao contabil
	 * @return the demonstracao contabil
	 * @throws NoSuchDemonstracaoContabilException if a demonstracao contabil with the primary key could not be found
	 */
	@Override
	public DemonstracaoContabil findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDemonstracaoContabilException {

		DemonstracaoContabil demonstracaoContabil = fetchByPrimaryKey(
			primaryKey);

		if (demonstracaoContabil == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDemonstracaoContabilException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return demonstracaoContabil;
	}

	/**
	 * Returns the demonstracao contabil with the primary key or throws a <code>NoSuchDemonstracaoContabilException</code> if it could not be found.
	 *
	 * @param demonstracaoId the primary key of the demonstracao contabil
	 * @return the demonstracao contabil
	 * @throws NoSuchDemonstracaoContabilException if a demonstracao contabil with the primary key could not be found
	 */
	@Override
	public DemonstracaoContabil findByPrimaryKey(long demonstracaoId)
		throws NoSuchDemonstracaoContabilException {

		return findByPrimaryKey((Serializable)demonstracaoId);
	}

	/**
	 * Returns the demonstracao contabil with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param demonstracaoId the primary key of the demonstracao contabil
	 * @return the demonstracao contabil, or <code>null</code> if a demonstracao contabil with the primary key could not be found
	 */
	@Override
	public DemonstracaoContabil fetchByPrimaryKey(long demonstracaoId) {
		return fetchByPrimaryKey((Serializable)demonstracaoId);
	}

	/**
	 * Returns all the demonstracao contabils.
	 *
	 * @return the demonstracao contabils
	 */
	@Override
	public List<DemonstracaoContabil> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the demonstracao contabils.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @return the range of demonstracao contabils
	 */
	@Override
	public List<DemonstracaoContabil> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the demonstracao contabils.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of demonstracao contabils
	 */
	@Override
	public List<DemonstracaoContabil> findAll(
		int start, int end,
		OrderByComparator<DemonstracaoContabil> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the demonstracao contabils.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of demonstracao contabils
	 */
	@Override
	public List<DemonstracaoContabil> findAll(
		int start, int end,
		OrderByComparator<DemonstracaoContabil> orderByComparator,
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

		List<DemonstracaoContabil> list = null;

		if (useFinderCache) {
			list = (List<DemonstracaoContabil>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DEMONSTRACAOCONTABIL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DEMONSTRACAOCONTABIL;

				sql = sql.concat(DemonstracaoContabilModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DemonstracaoContabil>)QueryUtil.list(
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
	 * Removes all the demonstracao contabils from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DemonstracaoContabil demonstracaoContabil : findAll()) {
			remove(demonstracaoContabil);
		}
	}

	/**
	 * Returns the number of demonstracao contabils.
	 *
	 * @return the number of demonstracao contabils
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
					_SQL_COUNT_DEMONSTRACAOCONTABIL);

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
		return "demonstracaoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DEMONSTRACAOCONTABIL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DemonstracaoContabilModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the demonstracao contabil persistence.
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

		DemonstracaoContabilUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		DemonstracaoContabilUtil.setPersistence(null);

		entityCache.removeCache(DemonstracaoContabilImpl.class.getName());
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

	private static final String _SQL_SELECT_DEMONSTRACAOCONTABIL =
		"SELECT demonstracaoContabil FROM DemonstracaoContabil demonstracaoContabil";

	private static final String _SQL_SELECT_DEMONSTRACAOCONTABIL_WHERE =
		"SELECT demonstracaoContabil FROM DemonstracaoContabil demonstracaoContabil WHERE ";

	private static final String _SQL_COUNT_DEMONSTRACAOCONTABIL =
		"SELECT COUNT(demonstracaoContabil) FROM DemonstracaoContabil demonstracaoContabil";

	private static final String _SQL_COUNT_DEMONSTRACAOCONTABIL_WHERE =
		"SELECT COUNT(demonstracaoContabil) FROM DemonstracaoContabil demonstracaoContabil WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"demonstracaoContabil.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DemonstracaoContabil exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DemonstracaoContabil exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DemonstracaoContabilPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}