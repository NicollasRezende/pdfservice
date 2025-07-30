/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchCredorPropostaException;
import br.com.seatecnologia.gdf.negocia.model.CredorProposta;
import br.com.seatecnologia.gdf.negocia.model.CredorPropostaTable;
import br.com.seatecnologia.gdf.negocia.model.impl.CredorPropostaImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.CredorPropostaModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.CredorPropostaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.CredorPropostaUtil;
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
 * The persistence implementation for the credor proposta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CredorPropostaPersistence.class)
public class CredorPropostaPersistenceImpl
	extends BasePersistenceImpl<CredorProposta>
	implements CredorPropostaPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CredorPropostaUtil</code> to access the credor proposta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CredorPropostaImpl.class.getName();

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
	 * Returns all the credor propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching credor propostas
	 */
	@Override
	public List<CredorProposta> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the credor propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @return the range of matching credor propostas
	 */
	@Override
	public List<CredorProposta> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the credor propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching credor propostas
	 */
	@Override
	public List<CredorProposta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CredorProposta> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the credor propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching credor propostas
	 */
	@Override
	public List<CredorProposta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CredorProposta> orderByComparator,
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

		List<CredorProposta> list = null;

		if (useFinderCache) {
			list = (List<CredorProposta>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CredorProposta credorProposta : list) {
					if (!uuid.equals(credorProposta.getUuid())) {
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

			sb.append(_SQL_SELECT_CREDORPROPOSTA_WHERE);

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
				sb.append(CredorPropostaModelImpl.ORDER_BY_JPQL);
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

				list = (List<CredorProposta>)QueryUtil.list(
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
	 * Returns the first credor proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credor proposta
	 * @throws NoSuchCredorPropostaException if a matching credor proposta could not be found
	 */
	@Override
	public CredorProposta findByUuid_First(
			String uuid, OrderByComparator<CredorProposta> orderByComparator)
		throws NoSuchCredorPropostaException {

		CredorProposta credorProposta = fetchByUuid_First(
			uuid, orderByComparator);

		if (credorProposta != null) {
			return credorProposta;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCredorPropostaException(sb.toString());
	}

	/**
	 * Returns the first credor proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credor proposta, or <code>null</code> if a matching credor proposta could not be found
	 */
	@Override
	public CredorProposta fetchByUuid_First(
		String uuid, OrderByComparator<CredorProposta> orderByComparator) {

		List<CredorProposta> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last credor proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credor proposta
	 * @throws NoSuchCredorPropostaException if a matching credor proposta could not be found
	 */
	@Override
	public CredorProposta findByUuid_Last(
			String uuid, OrderByComparator<CredorProposta> orderByComparator)
		throws NoSuchCredorPropostaException {

		CredorProposta credorProposta = fetchByUuid_Last(
			uuid, orderByComparator);

		if (credorProposta != null) {
			return credorProposta;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCredorPropostaException(sb.toString());
	}

	/**
	 * Returns the last credor proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credor proposta, or <code>null</code> if a matching credor proposta could not be found
	 */
	@Override
	public CredorProposta fetchByUuid_Last(
		String uuid, OrderByComparator<CredorProposta> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CredorProposta> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the credor propostas before and after the current credor proposta in the ordered set where uuid = &#63;.
	 *
	 * @param credorPropostaId the primary key of the current credor proposta
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next credor proposta
	 * @throws NoSuchCredorPropostaException if a credor proposta with the primary key could not be found
	 */
	@Override
	public CredorProposta[] findByUuid_PrevAndNext(
			long credorPropostaId, String uuid,
			OrderByComparator<CredorProposta> orderByComparator)
		throws NoSuchCredorPropostaException {

		uuid = Objects.toString(uuid, "");

		CredorProposta credorProposta = findByPrimaryKey(credorPropostaId);

		Session session = null;

		try {
			session = openSession();

			CredorProposta[] array = new CredorPropostaImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, credorProposta, uuid, orderByComparator, true);

			array[1] = credorProposta;

			array[2] = getByUuid_PrevAndNext(
				session, credorProposta, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CredorProposta getByUuid_PrevAndNext(
		Session session, CredorProposta credorProposta, String uuid,
		OrderByComparator<CredorProposta> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CREDORPROPOSTA_WHERE);

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
			sb.append(CredorPropostaModelImpl.ORDER_BY_JPQL);
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
						credorProposta)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CredorProposta> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the credor propostas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CredorProposta credorProposta :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(credorProposta);
		}
	}

	/**
	 * Returns the number of credor propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching credor propostas
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREDORPROPOSTA_WHERE);

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
		"credorProposta.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(credorProposta.uuid IS NULL OR credorProposta.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByPropostaId;
	private FinderPath _finderPathWithoutPaginationFindByPropostaId;
	private FinderPath _finderPathCountByPropostaId;

	/**
	 * Returns all the credor propostas where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching credor propostas
	 */
	@Override
	public List<CredorProposta> findByPropostaId(long propostaId) {
		return findByPropostaId(
			propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the credor propostas where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @return the range of matching credor propostas
	 */
	@Override
	public List<CredorProposta> findByPropostaId(
		long propostaId, int start, int end) {

		return findByPropostaId(propostaId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the credor propostas where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching credor propostas
	 */
	@Override
	public List<CredorProposta> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<CredorProposta> orderByComparator) {

		return findByPropostaId(
			propostaId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the credor propostas where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching credor propostas
	 */
	@Override
	public List<CredorProposta> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<CredorProposta> orderByComparator,
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

		List<CredorProposta> list = null;

		if (useFinderCache) {
			list = (List<CredorProposta>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CredorProposta credorProposta : list) {
					if (propostaId != credorProposta.getPropostaId()) {
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

			sb.append(_SQL_SELECT_CREDORPROPOSTA_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CredorPropostaModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

				list = (List<CredorProposta>)QueryUtil.list(
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
	 * Returns the first credor proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credor proposta
	 * @throws NoSuchCredorPropostaException if a matching credor proposta could not be found
	 */
	@Override
	public CredorProposta findByPropostaId_First(
			long propostaId,
			OrderByComparator<CredorProposta> orderByComparator)
		throws NoSuchCredorPropostaException {

		CredorProposta credorProposta = fetchByPropostaId_First(
			propostaId, orderByComparator);

		if (credorProposta != null) {
			return credorProposta;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchCredorPropostaException(sb.toString());
	}

	/**
	 * Returns the first credor proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credor proposta, or <code>null</code> if a matching credor proposta could not be found
	 */
	@Override
	public CredorProposta fetchByPropostaId_First(
		long propostaId, OrderByComparator<CredorProposta> orderByComparator) {

		List<CredorProposta> list = findByPropostaId(
			propostaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last credor proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credor proposta
	 * @throws NoSuchCredorPropostaException if a matching credor proposta could not be found
	 */
	@Override
	public CredorProposta findByPropostaId_Last(
			long propostaId,
			OrderByComparator<CredorProposta> orderByComparator)
		throws NoSuchCredorPropostaException {

		CredorProposta credorProposta = fetchByPropostaId_Last(
			propostaId, orderByComparator);

		if (credorProposta != null) {
			return credorProposta;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchCredorPropostaException(sb.toString());
	}

	/**
	 * Returns the last credor proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credor proposta, or <code>null</code> if a matching credor proposta could not be found
	 */
	@Override
	public CredorProposta fetchByPropostaId_Last(
		long propostaId, OrderByComparator<CredorProposta> orderByComparator) {

		int count = countByPropostaId(propostaId);

		if (count == 0) {
			return null;
		}

		List<CredorProposta> list = findByPropostaId(
			propostaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the credor propostas before and after the current credor proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param credorPropostaId the primary key of the current credor proposta
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next credor proposta
	 * @throws NoSuchCredorPropostaException if a credor proposta with the primary key could not be found
	 */
	@Override
	public CredorProposta[] findByPropostaId_PrevAndNext(
			long credorPropostaId, long propostaId,
			OrderByComparator<CredorProposta> orderByComparator)
		throws NoSuchCredorPropostaException {

		CredorProposta credorProposta = findByPrimaryKey(credorPropostaId);

		Session session = null;

		try {
			session = openSession();

			CredorProposta[] array = new CredorPropostaImpl[3];

			array[0] = getByPropostaId_PrevAndNext(
				session, credorProposta, propostaId, orderByComparator, true);

			array[1] = credorProposta;

			array[2] = getByPropostaId_PrevAndNext(
				session, credorProposta, propostaId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CredorProposta getByPropostaId_PrevAndNext(
		Session session, CredorProposta credorProposta, long propostaId,
		OrderByComparator<CredorProposta> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CREDORPROPOSTA_WHERE);

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
			sb.append(CredorPropostaModelImpl.ORDER_BY_JPQL);
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
						credorProposta)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CredorProposta> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the credor propostas where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	@Override
	public void removeByPropostaId(long propostaId) {
		for (CredorProposta credorProposta :
				findByPropostaId(
					propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(credorProposta);
		}
	}

	/**
	 * Returns the number of credor propostas where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching credor propostas
	 */
	@Override
	public int countByPropostaId(long propostaId) {
		FinderPath finderPath = _finderPathCountByPropostaId;

		Object[] finderArgs = new Object[] {propostaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREDORPROPOSTA_WHERE);

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
		"credorProposta.propostaId = ?";

	public CredorPropostaPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(CredorProposta.class);

		setModelImplClass(CredorPropostaImpl.class);
		setModelPKClass(long.class);

		setTable(CredorPropostaTable.INSTANCE);
	}

	/**
	 * Caches the credor proposta in the entity cache if it is enabled.
	 *
	 * @param credorProposta the credor proposta
	 */
	@Override
	public void cacheResult(CredorProposta credorProposta) {
		entityCache.putResult(
			CredorPropostaImpl.class, credorProposta.getPrimaryKey(),
			credorProposta);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the credor propostas in the entity cache if it is enabled.
	 *
	 * @param credorPropostas the credor propostas
	 */
	@Override
	public void cacheResult(List<CredorProposta> credorPropostas) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (credorPropostas.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CredorProposta credorProposta : credorPropostas) {
			if (entityCache.getResult(
					CredorPropostaImpl.class, credorProposta.getPrimaryKey()) ==
						null) {

				cacheResult(credorProposta);
			}
		}
	}

	/**
	 * Clears the cache for all credor propostas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CredorPropostaImpl.class);

		finderCache.clearCache(CredorPropostaImpl.class);
	}

	/**
	 * Clears the cache for the credor proposta.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CredorProposta credorProposta) {
		entityCache.removeResult(CredorPropostaImpl.class, credorProposta);
	}

	@Override
	public void clearCache(List<CredorProposta> credorPropostas) {
		for (CredorProposta credorProposta : credorPropostas) {
			entityCache.removeResult(CredorPropostaImpl.class, credorProposta);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CredorPropostaImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(CredorPropostaImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new credor proposta with the primary key. Does not add the credor proposta to the database.
	 *
	 * @param credorPropostaId the primary key for the new credor proposta
	 * @return the new credor proposta
	 */
	@Override
	public CredorProposta create(long credorPropostaId) {
		CredorProposta credorProposta = new CredorPropostaImpl();

		credorProposta.setNew(true);
		credorProposta.setPrimaryKey(credorPropostaId);

		String uuid = PortalUUIDUtil.generate();

		credorProposta.setUuid(uuid);

		return credorProposta;
	}

	/**
	 * Removes the credor proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param credorPropostaId the primary key of the credor proposta
	 * @return the credor proposta that was removed
	 * @throws NoSuchCredorPropostaException if a credor proposta with the primary key could not be found
	 */
	@Override
	public CredorProposta remove(long credorPropostaId)
		throws NoSuchCredorPropostaException {

		return remove((Serializable)credorPropostaId);
	}

	/**
	 * Removes the credor proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the credor proposta
	 * @return the credor proposta that was removed
	 * @throws NoSuchCredorPropostaException if a credor proposta with the primary key could not be found
	 */
	@Override
	public CredorProposta remove(Serializable primaryKey)
		throws NoSuchCredorPropostaException {

		Session session = null;

		try {
			session = openSession();

			CredorProposta credorProposta = (CredorProposta)session.get(
				CredorPropostaImpl.class, primaryKey);

			if (credorProposta == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCredorPropostaException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(credorProposta);
		}
		catch (NoSuchCredorPropostaException noSuchEntityException) {
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
	protected CredorProposta removeImpl(CredorProposta credorProposta) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(credorProposta)) {
				credorProposta = (CredorProposta)session.get(
					CredorPropostaImpl.class,
					credorProposta.getPrimaryKeyObj());
			}

			if (credorProposta != null) {
				session.delete(credorProposta);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (credorProposta != null) {
			clearCache(credorProposta);
		}

		return credorProposta;
	}

	@Override
	public CredorProposta updateImpl(CredorProposta credorProposta) {
		boolean isNew = credorProposta.isNew();

		if (!(credorProposta instanceof CredorPropostaModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(credorProposta.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					credorProposta);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in credorProposta proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CredorProposta implementation " +
					credorProposta.getClass());
		}

		CredorPropostaModelImpl credorPropostaModelImpl =
			(CredorPropostaModelImpl)credorProposta;

		if (Validator.isNull(credorProposta.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			credorProposta.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(credorProposta);
			}
			else {
				credorProposta = (CredorProposta)session.merge(credorProposta);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CredorPropostaImpl.class, credorPropostaModelImpl, false, true);

		if (isNew) {
			credorProposta.setNew(false);
		}

		credorProposta.resetOriginalValues();

		return credorProposta;
	}

	/**
	 * Returns the credor proposta with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the credor proposta
	 * @return the credor proposta
	 * @throws NoSuchCredorPropostaException if a credor proposta with the primary key could not be found
	 */
	@Override
	public CredorProposta findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCredorPropostaException {

		CredorProposta credorProposta = fetchByPrimaryKey(primaryKey);

		if (credorProposta == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCredorPropostaException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return credorProposta;
	}

	/**
	 * Returns the credor proposta with the primary key or throws a <code>NoSuchCredorPropostaException</code> if it could not be found.
	 *
	 * @param credorPropostaId the primary key of the credor proposta
	 * @return the credor proposta
	 * @throws NoSuchCredorPropostaException if a credor proposta with the primary key could not be found
	 */
	@Override
	public CredorProposta findByPrimaryKey(long credorPropostaId)
		throws NoSuchCredorPropostaException {

		return findByPrimaryKey((Serializable)credorPropostaId);
	}

	/**
	 * Returns the credor proposta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param credorPropostaId the primary key of the credor proposta
	 * @return the credor proposta, or <code>null</code> if a credor proposta with the primary key could not be found
	 */
	@Override
	public CredorProposta fetchByPrimaryKey(long credorPropostaId) {
		return fetchByPrimaryKey((Serializable)credorPropostaId);
	}

	/**
	 * Returns all the credor propostas.
	 *
	 * @return the credor propostas
	 */
	@Override
	public List<CredorProposta> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the credor propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @return the range of credor propostas
	 */
	@Override
	public List<CredorProposta> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the credor propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of credor propostas
	 */
	@Override
	public List<CredorProposta> findAll(
		int start, int end,
		OrderByComparator<CredorProposta> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the credor propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of credor propostas
	 */
	@Override
	public List<CredorProposta> findAll(
		int start, int end, OrderByComparator<CredorProposta> orderByComparator,
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

		List<CredorProposta> list = null;

		if (useFinderCache) {
			list = (List<CredorProposta>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREDORPROPOSTA);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREDORPROPOSTA;

				sql = sql.concat(CredorPropostaModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CredorProposta>)QueryUtil.list(
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
	 * Removes all the credor propostas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CredorProposta credorProposta : findAll()) {
			remove(credorProposta);
		}
	}

	/**
	 * Returns the number of credor propostas.
	 *
	 * @return the number of credor propostas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_CREDORPROPOSTA);

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
		return "credorPropostaId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREDORPROPOSTA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CredorPropostaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the credor proposta persistence.
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

		CredorPropostaUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CredorPropostaUtil.setPersistence(null);

		entityCache.removeCache(CredorPropostaImpl.class.getName());
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

	private static final String _SQL_SELECT_CREDORPROPOSTA =
		"SELECT credorProposta FROM CredorProposta credorProposta";

	private static final String _SQL_SELECT_CREDORPROPOSTA_WHERE =
		"SELECT credorProposta FROM CredorProposta credorProposta WHERE ";

	private static final String _SQL_COUNT_CREDORPROPOSTA =
		"SELECT COUNT(credorProposta) FROM CredorProposta credorProposta";

	private static final String _SQL_COUNT_CREDORPROPOSTA_WHERE =
		"SELECT COUNT(credorProposta) FROM CredorProposta credorProposta WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "credorProposta.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CredorProposta exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CredorProposta exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CredorPropostaPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}