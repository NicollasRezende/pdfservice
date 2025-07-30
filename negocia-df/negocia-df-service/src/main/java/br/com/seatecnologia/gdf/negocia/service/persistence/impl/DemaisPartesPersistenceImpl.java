/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDemaisPartesException;
import br.com.seatecnologia.gdf.negocia.model.DemaisPartes;
import br.com.seatecnologia.gdf.negocia.model.DemaisPartesTable;
import br.com.seatecnologia.gdf.negocia.model.impl.DemaisPartesImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.DemaisPartesModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.DemaisPartesPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DemaisPartesUtil;
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
 * The persistence implementation for the demais partes service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = DemaisPartesPersistence.class)
public class DemaisPartesPersistenceImpl
	extends BasePersistenceImpl<DemaisPartes>
	implements DemaisPartesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DemaisPartesUtil</code> to access the demais partes persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DemaisPartesImpl.class.getName();

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
	 * Returns all the demais parteses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching demais parteses
	 */
	@Override
	public List<DemaisPartes> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the demais parteses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @return the range of matching demais parteses
	 */
	@Override
	public List<DemaisPartes> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the demais parteses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demais parteses
	 */
	@Override
	public List<DemaisPartes> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DemaisPartes> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the demais parteses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demais parteses
	 */
	@Override
	public List<DemaisPartes> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DemaisPartes> orderByComparator,
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

		List<DemaisPartes> list = null;

		if (useFinderCache) {
			list = (List<DemaisPartes>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DemaisPartes demaisPartes : list) {
					if (!uuid.equals(demaisPartes.getUuid())) {
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

			sb.append(_SQL_SELECT_DEMAISPARTES_WHERE);

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
				sb.append(DemaisPartesModelImpl.ORDER_BY_JPQL);
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

				list = (List<DemaisPartes>)QueryUtil.list(
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
	 * Returns the first demais partes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demais partes
	 * @throws NoSuchDemaisPartesException if a matching demais partes could not be found
	 */
	@Override
	public DemaisPartes findByUuid_First(
			String uuid, OrderByComparator<DemaisPartes> orderByComparator)
		throws NoSuchDemaisPartesException {

		DemaisPartes demaisPartes = fetchByUuid_First(uuid, orderByComparator);

		if (demaisPartes != null) {
			return demaisPartes;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDemaisPartesException(sb.toString());
	}

	/**
	 * Returns the first demais partes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demais partes, or <code>null</code> if a matching demais partes could not be found
	 */
	@Override
	public DemaisPartes fetchByUuid_First(
		String uuid, OrderByComparator<DemaisPartes> orderByComparator) {

		List<DemaisPartes> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last demais partes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demais partes
	 * @throws NoSuchDemaisPartesException if a matching demais partes could not be found
	 */
	@Override
	public DemaisPartes findByUuid_Last(
			String uuid, OrderByComparator<DemaisPartes> orderByComparator)
		throws NoSuchDemaisPartesException {

		DemaisPartes demaisPartes = fetchByUuid_Last(uuid, orderByComparator);

		if (demaisPartes != null) {
			return demaisPartes;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDemaisPartesException(sb.toString());
	}

	/**
	 * Returns the last demais partes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demais partes, or <code>null</code> if a matching demais partes could not be found
	 */
	@Override
	public DemaisPartes fetchByUuid_Last(
		String uuid, OrderByComparator<DemaisPartes> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<DemaisPartes> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the demais parteses before and after the current demais partes in the ordered set where uuid = &#63;.
	 *
	 * @param demaisPartesId the primary key of the current demais partes
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demais partes
	 * @throws NoSuchDemaisPartesException if a demais partes with the primary key could not be found
	 */
	@Override
	public DemaisPartes[] findByUuid_PrevAndNext(
			long demaisPartesId, String uuid,
			OrderByComparator<DemaisPartes> orderByComparator)
		throws NoSuchDemaisPartesException {

		uuid = Objects.toString(uuid, "");

		DemaisPartes demaisPartes = findByPrimaryKey(demaisPartesId);

		Session session = null;

		try {
			session = openSession();

			DemaisPartes[] array = new DemaisPartesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, demaisPartes, uuid, orderByComparator, true);

			array[1] = demaisPartes;

			array[2] = getByUuid_PrevAndNext(
				session, demaisPartes, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected DemaisPartes getByUuid_PrevAndNext(
		Session session, DemaisPartes demaisPartes, String uuid,
		OrderByComparator<DemaisPartes> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_DEMAISPARTES_WHERE);

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
			sb.append(DemaisPartesModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(demaisPartes)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DemaisPartes> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the demais parteses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (DemaisPartes demaisPartes :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(demaisPartes);
		}
	}

	/**
	 * Returns the number of demais parteses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching demais parteses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DEMAISPARTES_WHERE);

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
		"demaisPartes.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(demaisPartes.uuid IS NULL OR demaisPartes.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByPropostaId;
	private FinderPath _finderPathWithoutPaginationFindByPropostaId;
	private FinderPath _finderPathCountByPropostaId;

	/**
	 * Returns all the demais parteses where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching demais parteses
	 */
	@Override
	public List<DemaisPartes> findByPropostaId(long propostaId) {
		return findByPropostaId(
			propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the demais parteses where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @return the range of matching demais parteses
	 */
	@Override
	public List<DemaisPartes> findByPropostaId(
		long propostaId, int start, int end) {

		return findByPropostaId(propostaId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the demais parteses where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demais parteses
	 */
	@Override
	public List<DemaisPartes> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<DemaisPartes> orderByComparator) {

		return findByPropostaId(
			propostaId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the demais parteses where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demais parteses
	 */
	@Override
	public List<DemaisPartes> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<DemaisPartes> orderByComparator,
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

		List<DemaisPartes> list = null;

		if (useFinderCache) {
			list = (List<DemaisPartes>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DemaisPartes demaisPartes : list) {
					if (propostaId != demaisPartes.getPropostaId()) {
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

			sb.append(_SQL_SELECT_DEMAISPARTES_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(DemaisPartesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

				list = (List<DemaisPartes>)QueryUtil.list(
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
	 * Returns the first demais partes in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demais partes
	 * @throws NoSuchDemaisPartesException if a matching demais partes could not be found
	 */
	@Override
	public DemaisPartes findByPropostaId_First(
			long propostaId, OrderByComparator<DemaisPartes> orderByComparator)
		throws NoSuchDemaisPartesException {

		DemaisPartes demaisPartes = fetchByPropostaId_First(
			propostaId, orderByComparator);

		if (demaisPartes != null) {
			return demaisPartes;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchDemaisPartesException(sb.toString());
	}

	/**
	 * Returns the first demais partes in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demais partes, or <code>null</code> if a matching demais partes could not be found
	 */
	@Override
	public DemaisPartes fetchByPropostaId_First(
		long propostaId, OrderByComparator<DemaisPartes> orderByComparator) {

		List<DemaisPartes> list = findByPropostaId(
			propostaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last demais partes in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demais partes
	 * @throws NoSuchDemaisPartesException if a matching demais partes could not be found
	 */
	@Override
	public DemaisPartes findByPropostaId_Last(
			long propostaId, OrderByComparator<DemaisPartes> orderByComparator)
		throws NoSuchDemaisPartesException {

		DemaisPartes demaisPartes = fetchByPropostaId_Last(
			propostaId, orderByComparator);

		if (demaisPartes != null) {
			return demaisPartes;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchDemaisPartesException(sb.toString());
	}

	/**
	 * Returns the last demais partes in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demais partes, or <code>null</code> if a matching demais partes could not be found
	 */
	@Override
	public DemaisPartes fetchByPropostaId_Last(
		long propostaId, OrderByComparator<DemaisPartes> orderByComparator) {

		int count = countByPropostaId(propostaId);

		if (count == 0) {
			return null;
		}

		List<DemaisPartes> list = findByPropostaId(
			propostaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the demais parteses before and after the current demais partes in the ordered set where propostaId = &#63;.
	 *
	 * @param demaisPartesId the primary key of the current demais partes
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demais partes
	 * @throws NoSuchDemaisPartesException if a demais partes with the primary key could not be found
	 */
	@Override
	public DemaisPartes[] findByPropostaId_PrevAndNext(
			long demaisPartesId, long propostaId,
			OrderByComparator<DemaisPartes> orderByComparator)
		throws NoSuchDemaisPartesException {

		DemaisPartes demaisPartes = findByPrimaryKey(demaisPartesId);

		Session session = null;

		try {
			session = openSession();

			DemaisPartes[] array = new DemaisPartesImpl[3];

			array[0] = getByPropostaId_PrevAndNext(
				session, demaisPartes, propostaId, orderByComparator, true);

			array[1] = demaisPartes;

			array[2] = getByPropostaId_PrevAndNext(
				session, demaisPartes, propostaId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected DemaisPartes getByPropostaId_PrevAndNext(
		Session session, DemaisPartes demaisPartes, long propostaId,
		OrderByComparator<DemaisPartes> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_DEMAISPARTES_WHERE);

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
			sb.append(DemaisPartesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(propostaId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(demaisPartes)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DemaisPartes> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the demais parteses where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	@Override
	public void removeByPropostaId(long propostaId) {
		for (DemaisPartes demaisPartes :
				findByPropostaId(
					propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(demaisPartes);
		}
	}

	/**
	 * Returns the number of demais parteses where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching demais parteses
	 */
	@Override
	public int countByPropostaId(long propostaId) {
		FinderPath finderPath = _finderPathCountByPropostaId;

		Object[] finderArgs = new Object[] {propostaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DEMAISPARTES_WHERE);

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
		"demaisPartes.propostaId = ?";

	public DemaisPartesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(DemaisPartes.class);

		setModelImplClass(DemaisPartesImpl.class);
		setModelPKClass(long.class);

		setTable(DemaisPartesTable.INSTANCE);
	}

	/**
	 * Caches the demais partes in the entity cache if it is enabled.
	 *
	 * @param demaisPartes the demais partes
	 */
	@Override
	public void cacheResult(DemaisPartes demaisPartes) {
		entityCache.putResult(
			DemaisPartesImpl.class, demaisPartes.getPrimaryKey(), demaisPartes);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the demais parteses in the entity cache if it is enabled.
	 *
	 * @param demaisParteses the demais parteses
	 */
	@Override
	public void cacheResult(List<DemaisPartes> demaisParteses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (demaisParteses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (DemaisPartes demaisPartes : demaisParteses) {
			if (entityCache.getResult(
					DemaisPartesImpl.class, demaisPartes.getPrimaryKey()) ==
						null) {

				cacheResult(demaisPartes);
			}
		}
	}

	/**
	 * Clears the cache for all demais parteses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DemaisPartesImpl.class);

		finderCache.clearCache(DemaisPartesImpl.class);
	}

	/**
	 * Clears the cache for the demais partes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DemaisPartes demaisPartes) {
		entityCache.removeResult(DemaisPartesImpl.class, demaisPartes);
	}

	@Override
	public void clearCache(List<DemaisPartes> demaisParteses) {
		for (DemaisPartes demaisPartes : demaisParteses) {
			entityCache.removeResult(DemaisPartesImpl.class, demaisPartes);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DemaisPartesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(DemaisPartesImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new demais partes with the primary key. Does not add the demais partes to the database.
	 *
	 * @param demaisPartesId the primary key for the new demais partes
	 * @return the new demais partes
	 */
	@Override
	public DemaisPartes create(long demaisPartesId) {
		DemaisPartes demaisPartes = new DemaisPartesImpl();

		demaisPartes.setNew(true);
		demaisPartes.setPrimaryKey(demaisPartesId);

		String uuid = PortalUUIDUtil.generate();

		demaisPartes.setUuid(uuid);

		return demaisPartes;
	}

	/**
	 * Removes the demais partes with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param demaisPartesId the primary key of the demais partes
	 * @return the demais partes that was removed
	 * @throws NoSuchDemaisPartesException if a demais partes with the primary key could not be found
	 */
	@Override
	public DemaisPartes remove(long demaisPartesId)
		throws NoSuchDemaisPartesException {

		return remove((Serializable)demaisPartesId);
	}

	/**
	 * Removes the demais partes with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the demais partes
	 * @return the demais partes that was removed
	 * @throws NoSuchDemaisPartesException if a demais partes with the primary key could not be found
	 */
	@Override
	public DemaisPartes remove(Serializable primaryKey)
		throws NoSuchDemaisPartesException {

		Session session = null;

		try {
			session = openSession();

			DemaisPartes demaisPartes = (DemaisPartes)session.get(
				DemaisPartesImpl.class, primaryKey);

			if (demaisPartes == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDemaisPartesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(demaisPartes);
		}
		catch (NoSuchDemaisPartesException noSuchEntityException) {
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
	protected DemaisPartes removeImpl(DemaisPartes demaisPartes) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(demaisPartes)) {
				demaisPartes = (DemaisPartes)session.get(
					DemaisPartesImpl.class, demaisPartes.getPrimaryKeyObj());
			}

			if (demaisPartes != null) {
				session.delete(demaisPartes);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (demaisPartes != null) {
			clearCache(demaisPartes);
		}

		return demaisPartes;
	}

	@Override
	public DemaisPartes updateImpl(DemaisPartes demaisPartes) {
		boolean isNew = demaisPartes.isNew();

		if (!(demaisPartes instanceof DemaisPartesModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(demaisPartes.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					demaisPartes);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in demaisPartes proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DemaisPartes implementation " +
					demaisPartes.getClass());
		}

		DemaisPartesModelImpl demaisPartesModelImpl =
			(DemaisPartesModelImpl)demaisPartes;

		if (Validator.isNull(demaisPartes.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			demaisPartes.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(demaisPartes);
			}
			else {
				demaisPartes = (DemaisPartes)session.merge(demaisPartes);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DemaisPartesImpl.class, demaisPartesModelImpl, false, true);

		if (isNew) {
			demaisPartes.setNew(false);
		}

		demaisPartes.resetOriginalValues();

		return demaisPartes;
	}

	/**
	 * Returns the demais partes with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the demais partes
	 * @return the demais partes
	 * @throws NoSuchDemaisPartesException if a demais partes with the primary key could not be found
	 */
	@Override
	public DemaisPartes findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDemaisPartesException {

		DemaisPartes demaisPartes = fetchByPrimaryKey(primaryKey);

		if (demaisPartes == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDemaisPartesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return demaisPartes;
	}

	/**
	 * Returns the demais partes with the primary key or throws a <code>NoSuchDemaisPartesException</code> if it could not be found.
	 *
	 * @param demaisPartesId the primary key of the demais partes
	 * @return the demais partes
	 * @throws NoSuchDemaisPartesException if a demais partes with the primary key could not be found
	 */
	@Override
	public DemaisPartes findByPrimaryKey(long demaisPartesId)
		throws NoSuchDemaisPartesException {

		return findByPrimaryKey((Serializable)demaisPartesId);
	}

	/**
	 * Returns the demais partes with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param demaisPartesId the primary key of the demais partes
	 * @return the demais partes, or <code>null</code> if a demais partes with the primary key could not be found
	 */
	@Override
	public DemaisPartes fetchByPrimaryKey(long demaisPartesId) {
		return fetchByPrimaryKey((Serializable)demaisPartesId);
	}

	/**
	 * Returns all the demais parteses.
	 *
	 * @return the demais parteses
	 */
	@Override
	public List<DemaisPartes> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the demais parteses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @return the range of demais parteses
	 */
	@Override
	public List<DemaisPartes> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the demais parteses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of demais parteses
	 */
	@Override
	public List<DemaisPartes> findAll(
		int start, int end, OrderByComparator<DemaisPartes> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the demais parteses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of demais parteses
	 */
	@Override
	public List<DemaisPartes> findAll(
		int start, int end, OrderByComparator<DemaisPartes> orderByComparator,
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

		List<DemaisPartes> list = null;

		if (useFinderCache) {
			list = (List<DemaisPartes>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DEMAISPARTES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DEMAISPARTES;

				sql = sql.concat(DemaisPartesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DemaisPartes>)QueryUtil.list(
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
	 * Removes all the demais parteses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DemaisPartes demaisPartes : findAll()) {
			remove(demaisPartes);
		}
	}

	/**
	 * Returns the number of demais parteses.
	 *
	 * @return the number of demais parteses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_DEMAISPARTES);

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
		return "demaisPartesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DEMAISPARTES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DemaisPartesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the demais partes persistence.
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

		DemaisPartesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		DemaisPartesUtil.setPersistence(null);

		entityCache.removeCache(DemaisPartesImpl.class.getName());
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

	private static final String _SQL_SELECT_DEMAISPARTES =
		"SELECT demaisPartes FROM DemaisPartes demaisPartes";

	private static final String _SQL_SELECT_DEMAISPARTES_WHERE =
		"SELECT demaisPartes FROM DemaisPartes demaisPartes WHERE ";

	private static final String _SQL_COUNT_DEMAISPARTES =
		"SELECT COUNT(demaisPartes) FROM DemaisPartes demaisPartes";

	private static final String _SQL_COUNT_DEMAISPARTES_WHERE =
		"SELECT COUNT(demaisPartes) FROM DemaisPartes demaisPartes WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "demaisPartes.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DemaisPartes exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DemaisPartes exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DemaisPartesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}