/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDadosContribuinteException;
import br.com.seatecnologia.gdf.negocia.model.DadosContribuinte;
import br.com.seatecnologia.gdf.negocia.model.DadosContribuinteTable;
import br.com.seatecnologia.gdf.negocia.model.impl.DadosContribuinteImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.DadosContribuinteModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.DadosContribuintePersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DadosContribuinteUtil;
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
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
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

import java.util.Date;
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
 * The persistence implementation for the dados contribuinte service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = DadosContribuintePersistence.class)
public class DadosContribuintePersistenceImpl
	extends BasePersistenceImpl<DadosContribuinte>
	implements DadosContribuintePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DadosContribuinteUtil</code> to access the dados contribuinte persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DadosContribuinteImpl.class.getName();

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
	 * Returns all the dados contribuintes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching dados contribuintes
	 */
	@Override
	public List<DadosContribuinte> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dados contribuintes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @return the range of matching dados contribuintes
	 */
	@Override
	public List<DadosContribuinte> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dados contribuintes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dados contribuintes
	 */
	@Override
	public List<DadosContribuinte> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DadosContribuinte> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dados contribuintes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dados contribuintes
	 */
	@Override
	public List<DadosContribuinte> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DadosContribuinte> orderByComparator,
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

		List<DadosContribuinte> list = null;

		if (useFinderCache) {
			list = (List<DadosContribuinte>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DadosContribuinte dadosContribuinte : list) {
					if (!uuid.equals(dadosContribuinte.getUuid())) {
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

			sb.append(_SQL_SELECT_DADOSCONTRIBUINTE_WHERE);

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
				sb.append(DadosContribuinteModelImpl.ORDER_BY_JPQL);
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

				list = (List<DadosContribuinte>)QueryUtil.list(
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
	 * Returns the first dados contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a matching dados contribuinte could not be found
	 */
	@Override
	public DadosContribuinte findByUuid_First(
			String uuid, OrderByComparator<DadosContribuinte> orderByComparator)
		throws NoSuchDadosContribuinteException {

		DadosContribuinte dadosContribuinte = fetchByUuid_First(
			uuid, orderByComparator);

		if (dadosContribuinte != null) {
			return dadosContribuinte;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDadosContribuinteException(sb.toString());
	}

	/**
	 * Returns the first dados contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	@Override
	public DadosContribuinte fetchByUuid_First(
		String uuid, OrderByComparator<DadosContribuinte> orderByComparator) {

		List<DadosContribuinte> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dados contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a matching dados contribuinte could not be found
	 */
	@Override
	public DadosContribuinte findByUuid_Last(
			String uuid, OrderByComparator<DadosContribuinte> orderByComparator)
		throws NoSuchDadosContribuinteException {

		DadosContribuinte dadosContribuinte = fetchByUuid_Last(
			uuid, orderByComparator);

		if (dadosContribuinte != null) {
			return dadosContribuinte;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDadosContribuinteException(sb.toString());
	}

	/**
	 * Returns the last dados contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	@Override
	public DadosContribuinte fetchByUuid_Last(
		String uuid, OrderByComparator<DadosContribuinte> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<DadosContribuinte> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dados contribuintes before and after the current dados contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param dadosContribuinteId the primary key of the current dados contribuinte
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a dados contribuinte with the primary key could not be found
	 */
	@Override
	public DadosContribuinte[] findByUuid_PrevAndNext(
			long dadosContribuinteId, String uuid,
			OrderByComparator<DadosContribuinte> orderByComparator)
		throws NoSuchDadosContribuinteException {

		uuid = Objects.toString(uuid, "");

		DadosContribuinte dadosContribuinte = findByPrimaryKey(
			dadosContribuinteId);

		Session session = null;

		try {
			session = openSession();

			DadosContribuinte[] array = new DadosContribuinteImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, dadosContribuinte, uuid, orderByComparator, true);

			array[1] = dadosContribuinte;

			array[2] = getByUuid_PrevAndNext(
				session, dadosContribuinte, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected DadosContribuinte getByUuid_PrevAndNext(
		Session session, DadosContribuinte dadosContribuinte, String uuid,
		OrderByComparator<DadosContribuinte> orderByComparator,
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

		sb.append(_SQL_SELECT_DADOSCONTRIBUINTE_WHERE);

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
			sb.append(DadosContribuinteModelImpl.ORDER_BY_JPQL);
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
						dadosContribuinte)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DadosContribuinte> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dados contribuintes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (DadosContribuinte dadosContribuinte :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(dadosContribuinte);
		}
	}

	/**
	 * Returns the number of dados contribuintes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching dados contribuintes
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DADOSCONTRIBUINTE_WHERE);

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
		"dadosContribuinte.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(dadosContribuinte.uuid IS NULL OR dadosContribuinte.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;

	/**
	 * Returns the dados contribuinte where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDadosContribuinteException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a matching dados contribuinte could not be found
	 */
	@Override
	public DadosContribuinte findByUUID_G(String uuid, long groupId)
		throws NoSuchDadosContribuinteException {

		DadosContribuinte dadosContribuinte = fetchByUUID_G(uuid, groupId);

		if (dadosContribuinte == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchDadosContribuinteException(sb.toString());
		}

		return dadosContribuinte;
	}

	/**
	 * Returns the dados contribuinte where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	@Override
	public DadosContribuinte fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the dados contribuinte where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	@Override
	public DadosContribuinte fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof DadosContribuinte) {
			DadosContribuinte dadosContribuinte = (DadosContribuinte)result;

			if (!Objects.equals(uuid, dadosContribuinte.getUuid()) ||
				(groupId != dadosContribuinte.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_DADOSCONTRIBUINTE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<DadosContribuinte> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					DadosContribuinte dadosContribuinte = list.get(0);

					result = dadosContribuinte;

					cacheResult(dadosContribuinte);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (DadosContribuinte)result;
		}
	}

	/**
	 * Removes the dados contribuinte where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the dados contribuinte that was removed
	 */
	@Override
	public DadosContribuinte removeByUUID_G(String uuid, long groupId)
		throws NoSuchDadosContribuinteException {

		DadosContribuinte dadosContribuinte = findByUUID_G(uuid, groupId);

		return remove(dadosContribuinte);
	}

	/**
	 * Returns the number of dados contribuintes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching dados contribuintes
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		DadosContribuinte dadosContribuinte = fetchByUUID_G(uuid, groupId);

		if (dadosContribuinte == null) {
			return 0;
		}

		return 1;
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"dadosContribuinte.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(dadosContribuinte.uuid IS NULL OR dadosContribuinte.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"dadosContribuinte.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the dados contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching dados contribuintes
	 */
	@Override
	public List<DadosContribuinte> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dados contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @return the range of matching dados contribuintes
	 */
	@Override
	public List<DadosContribuinte> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dados contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dados contribuintes
	 */
	@Override
	public List<DadosContribuinte> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DadosContribuinte> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dados contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dados contribuintes
	 */
	@Override
	public List<DadosContribuinte> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DadosContribuinte> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<DadosContribuinte> list = null;

		if (useFinderCache) {
			list = (List<DadosContribuinte>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DadosContribuinte dadosContribuinte : list) {
					if (!uuid.equals(dadosContribuinte.getUuid()) ||
						(companyId != dadosContribuinte.getCompanyId())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_DADOSCONTRIBUINTE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(DadosContribuinteModelImpl.ORDER_BY_JPQL);
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

				queryPos.add(companyId);

				list = (List<DadosContribuinte>)QueryUtil.list(
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
	 * Returns the first dados contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a matching dados contribuinte could not be found
	 */
	@Override
	public DadosContribuinte findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<DadosContribuinte> orderByComparator)
		throws NoSuchDadosContribuinteException {

		DadosContribuinte dadosContribuinte = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (dadosContribuinte != null) {
			return dadosContribuinte;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchDadosContribuinteException(sb.toString());
	}

	/**
	 * Returns the first dados contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	@Override
	public DadosContribuinte fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<DadosContribuinte> orderByComparator) {

		List<DadosContribuinte> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dados contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a matching dados contribuinte could not be found
	 */
	@Override
	public DadosContribuinte findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<DadosContribuinte> orderByComparator)
		throws NoSuchDadosContribuinteException {

		DadosContribuinte dadosContribuinte = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (dadosContribuinte != null) {
			return dadosContribuinte;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchDadosContribuinteException(sb.toString());
	}

	/**
	 * Returns the last dados contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	@Override
	public DadosContribuinte fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<DadosContribuinte> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<DadosContribuinte> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dados contribuintes before and after the current dados contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param dadosContribuinteId the primary key of the current dados contribuinte
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a dados contribuinte with the primary key could not be found
	 */
	@Override
	public DadosContribuinte[] findByUuid_C_PrevAndNext(
			long dadosContribuinteId, String uuid, long companyId,
			OrderByComparator<DadosContribuinte> orderByComparator)
		throws NoSuchDadosContribuinteException {

		uuid = Objects.toString(uuid, "");

		DadosContribuinte dadosContribuinte = findByPrimaryKey(
			dadosContribuinteId);

		Session session = null;

		try {
			session = openSession();

			DadosContribuinte[] array = new DadosContribuinteImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, dadosContribuinte, uuid, companyId, orderByComparator,
				true);

			array[1] = dadosContribuinte;

			array[2] = getByUuid_C_PrevAndNext(
				session, dadosContribuinte, uuid, companyId, orderByComparator,
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

	protected DadosContribuinte getByUuid_C_PrevAndNext(
		Session session, DadosContribuinte dadosContribuinte, String uuid,
		long companyId, OrderByComparator<DadosContribuinte> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_DADOSCONTRIBUINTE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
			sb.append(DadosContribuinteModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						dadosContribuinte)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DadosContribuinte> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dados contribuintes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (DadosContribuinte dadosContribuinte :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(dadosContribuinte);
		}
	}

	/**
	 * Returns the number of dados contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching dados contribuintes
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_DADOSCONTRIBUINTE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"dadosContribuinte.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(dadosContribuinte.uuid IS NULL OR dadosContribuinte.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"dadosContribuinte.companyId = ?";

	public DadosContribuintePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(DadosContribuinte.class);

		setModelImplClass(DadosContribuinteImpl.class);
		setModelPKClass(long.class);

		setTable(DadosContribuinteTable.INSTANCE);
	}

	/**
	 * Caches the dados contribuinte in the entity cache if it is enabled.
	 *
	 * @param dadosContribuinte the dados contribuinte
	 */
	@Override
	public void cacheResult(DadosContribuinte dadosContribuinte) {
		entityCache.putResult(
			DadosContribuinteImpl.class, dadosContribuinte.getPrimaryKey(),
			dadosContribuinte);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				dadosContribuinte.getUuid(), dadosContribuinte.getGroupId()
			},
			dadosContribuinte);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the dados contribuintes in the entity cache if it is enabled.
	 *
	 * @param dadosContribuintes the dados contribuintes
	 */
	@Override
	public void cacheResult(List<DadosContribuinte> dadosContribuintes) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (dadosContribuintes.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (DadosContribuinte dadosContribuinte : dadosContribuintes) {
			if (entityCache.getResult(
					DadosContribuinteImpl.class,
					dadosContribuinte.getPrimaryKey()) == null) {

				cacheResult(dadosContribuinte);
			}
		}
	}

	/**
	 * Clears the cache for all dados contribuintes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DadosContribuinteImpl.class);

		finderCache.clearCache(DadosContribuinteImpl.class);
	}

	/**
	 * Clears the cache for the dados contribuinte.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DadosContribuinte dadosContribuinte) {
		entityCache.removeResult(
			DadosContribuinteImpl.class, dadosContribuinte);
	}

	@Override
	public void clearCache(List<DadosContribuinte> dadosContribuintes) {
		for (DadosContribuinte dadosContribuinte : dadosContribuintes) {
			entityCache.removeResult(
				DadosContribuinteImpl.class, dadosContribuinte);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DadosContribuinteImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(DadosContribuinteImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		DadosContribuinteModelImpl dadosContribuinteModelImpl) {

		Object[] args = new Object[] {
			dadosContribuinteModelImpl.getUuid(),
			dadosContribuinteModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathFetchByUUID_G, args, dadosContribuinteModelImpl);
	}

	/**
	 * Creates a new dados contribuinte with the primary key. Does not add the dados contribuinte to the database.
	 *
	 * @param dadosContribuinteId the primary key for the new dados contribuinte
	 * @return the new dados contribuinte
	 */
	@Override
	public DadosContribuinte create(long dadosContribuinteId) {
		DadosContribuinte dadosContribuinte = new DadosContribuinteImpl();

		dadosContribuinte.setNew(true);
		dadosContribuinte.setPrimaryKey(dadosContribuinteId);

		String uuid = PortalUUIDUtil.generate();

		dadosContribuinte.setUuid(uuid);

		dadosContribuinte.setCompanyId(CompanyThreadLocal.getCompanyId());

		return dadosContribuinte;
	}

	/**
	 * Removes the dados contribuinte with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dadosContribuinteId the primary key of the dados contribuinte
	 * @return the dados contribuinte that was removed
	 * @throws NoSuchDadosContribuinteException if a dados contribuinte with the primary key could not be found
	 */
	@Override
	public DadosContribuinte remove(long dadosContribuinteId)
		throws NoSuchDadosContribuinteException {

		return remove((Serializable)dadosContribuinteId);
	}

	/**
	 * Removes the dados contribuinte with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dados contribuinte
	 * @return the dados contribuinte that was removed
	 * @throws NoSuchDadosContribuinteException if a dados contribuinte with the primary key could not be found
	 */
	@Override
	public DadosContribuinte remove(Serializable primaryKey)
		throws NoSuchDadosContribuinteException {

		Session session = null;

		try {
			session = openSession();

			DadosContribuinte dadosContribuinte =
				(DadosContribuinte)session.get(
					DadosContribuinteImpl.class, primaryKey);

			if (dadosContribuinte == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDadosContribuinteException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(dadosContribuinte);
		}
		catch (NoSuchDadosContribuinteException noSuchEntityException) {
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
	protected DadosContribuinte removeImpl(
		DadosContribuinte dadosContribuinte) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dadosContribuinte)) {
				dadosContribuinte = (DadosContribuinte)session.get(
					DadosContribuinteImpl.class,
					dadosContribuinte.getPrimaryKeyObj());
			}

			if (dadosContribuinte != null) {
				session.delete(dadosContribuinte);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (dadosContribuinte != null) {
			clearCache(dadosContribuinte);
		}

		return dadosContribuinte;
	}

	@Override
	public DadosContribuinte updateImpl(DadosContribuinte dadosContribuinte) {
		boolean isNew = dadosContribuinte.isNew();

		if (!(dadosContribuinte instanceof DadosContribuinteModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(dadosContribuinte.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					dadosContribuinte);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in dadosContribuinte proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DadosContribuinte implementation " +
					dadosContribuinte.getClass());
		}

		DadosContribuinteModelImpl dadosContribuinteModelImpl =
			(DadosContribuinteModelImpl)dadosContribuinte;

		if (Validator.isNull(dadosContribuinte.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			dadosContribuinte.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (dadosContribuinte.getCreateDate() == null)) {
			if (serviceContext == null) {
				dadosContribuinte.setCreateDate(date);
			}
			else {
				dadosContribuinte.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!dadosContribuinteModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				dadosContribuinte.setModifiedDate(date);
			}
			else {
				dadosContribuinte.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(dadosContribuinte);
			}
			else {
				dadosContribuinte = (DadosContribuinte)session.merge(
					dadosContribuinte);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DadosContribuinteImpl.class, dadosContribuinteModelImpl, false,
			true);

		cacheUniqueFindersCache(dadosContribuinteModelImpl);

		if (isNew) {
			dadosContribuinte.setNew(false);
		}

		dadosContribuinte.resetOriginalValues();

		return dadosContribuinte;
	}

	/**
	 * Returns the dados contribuinte with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dados contribuinte
	 * @return the dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a dados contribuinte with the primary key could not be found
	 */
	@Override
	public DadosContribuinte findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDadosContribuinteException {

		DadosContribuinte dadosContribuinte = fetchByPrimaryKey(primaryKey);

		if (dadosContribuinte == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDadosContribuinteException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return dadosContribuinte;
	}

	/**
	 * Returns the dados contribuinte with the primary key or throws a <code>NoSuchDadosContribuinteException</code> if it could not be found.
	 *
	 * @param dadosContribuinteId the primary key of the dados contribuinte
	 * @return the dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a dados contribuinte with the primary key could not be found
	 */
	@Override
	public DadosContribuinte findByPrimaryKey(long dadosContribuinteId)
		throws NoSuchDadosContribuinteException {

		return findByPrimaryKey((Serializable)dadosContribuinteId);
	}

	/**
	 * Returns the dados contribuinte with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dadosContribuinteId the primary key of the dados contribuinte
	 * @return the dados contribuinte, or <code>null</code> if a dados contribuinte with the primary key could not be found
	 */
	@Override
	public DadosContribuinte fetchByPrimaryKey(long dadosContribuinteId) {
		return fetchByPrimaryKey((Serializable)dadosContribuinteId);
	}

	/**
	 * Returns all the dados contribuintes.
	 *
	 * @return the dados contribuintes
	 */
	@Override
	public List<DadosContribuinte> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dados contribuintes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @return the range of dados contribuintes
	 */
	@Override
	public List<DadosContribuinte> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dados contribuintes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dados contribuintes
	 */
	@Override
	public List<DadosContribuinte> findAll(
		int start, int end,
		OrderByComparator<DadosContribuinte> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dados contribuintes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dados contribuintes
	 */
	@Override
	public List<DadosContribuinte> findAll(
		int start, int end,
		OrderByComparator<DadosContribuinte> orderByComparator,
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

		List<DadosContribuinte> list = null;

		if (useFinderCache) {
			list = (List<DadosContribuinte>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DADOSCONTRIBUINTE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DADOSCONTRIBUINTE;

				sql = sql.concat(DadosContribuinteModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DadosContribuinte>)QueryUtil.list(
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
	 * Removes all the dados contribuintes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DadosContribuinte dadosContribuinte : findAll()) {
			remove(dadosContribuinte);
		}
	}

	/**
	 * Returns the number of dados contribuintes.
	 *
	 * @return the number of dados contribuintes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_DADOSCONTRIBUINTE);

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
		return "dadosContribuinteId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DADOSCONTRIBUINTE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DadosContribuinteModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dados contribuinte persistence.
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

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		DadosContribuinteUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		DadosContribuinteUtil.setPersistence(null);

		entityCache.removeCache(DadosContribuinteImpl.class.getName());
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

	private static final String _SQL_SELECT_DADOSCONTRIBUINTE =
		"SELECT dadosContribuinte FROM DadosContribuinte dadosContribuinte";

	private static final String _SQL_SELECT_DADOSCONTRIBUINTE_WHERE =
		"SELECT dadosContribuinte FROM DadosContribuinte dadosContribuinte WHERE ";

	private static final String _SQL_COUNT_DADOSCONTRIBUINTE =
		"SELECT COUNT(dadosContribuinte) FROM DadosContribuinte dadosContribuinte";

	private static final String _SQL_COUNT_DADOSCONTRIBUINTE_WHERE =
		"SELECT COUNT(dadosContribuinte) FROM DadosContribuinte dadosContribuinte WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "dadosContribuinte.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DadosContribuinte exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DadosContribuinte exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DadosContribuintePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}