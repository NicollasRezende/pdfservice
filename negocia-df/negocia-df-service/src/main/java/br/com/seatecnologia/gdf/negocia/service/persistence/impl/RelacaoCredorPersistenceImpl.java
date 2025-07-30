/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchRelacaoCredorException;
import br.com.seatecnologia.gdf.negocia.model.RelacaoCredor;
import br.com.seatecnologia.gdf.negocia.model.RelacaoCredorTable;
import br.com.seatecnologia.gdf.negocia.model.impl.RelacaoCredorImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.RelacaoCredorModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.RelacaoCredorPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.RelacaoCredorUtil;
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
 * The persistence implementation for the relacao credor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = RelacaoCredorPersistence.class)
public class RelacaoCredorPersistenceImpl
	extends BasePersistenceImpl<RelacaoCredor>
	implements RelacaoCredorPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RelacaoCredorUtil</code> to access the relacao credor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RelacaoCredorImpl.class.getName();

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
	 * Returns all the relacao credors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching relacao credors
	 */
	@Override
	public List<RelacaoCredor> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the relacao credors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @return the range of matching relacao credors
	 */
	@Override
	public List<RelacaoCredor> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the relacao credors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching relacao credors
	 */
	@Override
	public List<RelacaoCredor> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<RelacaoCredor> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the relacao credors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching relacao credors
	 */
	@Override
	public List<RelacaoCredor> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<RelacaoCredor> orderByComparator,
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

		List<RelacaoCredor> list = null;

		if (useFinderCache) {
			list = (List<RelacaoCredor>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RelacaoCredor relacaoCredor : list) {
					if (!uuid.equals(relacaoCredor.getUuid())) {
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

			sb.append(_SQL_SELECT_RELACAOCREDOR_WHERE);

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
				sb.append(RelacaoCredorModelImpl.ORDER_BY_JPQL);
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

				list = (List<RelacaoCredor>)QueryUtil.list(
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
	 * Returns the first relacao credor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching relacao credor
	 * @throws NoSuchRelacaoCredorException if a matching relacao credor could not be found
	 */
	@Override
	public RelacaoCredor findByUuid_First(
			String uuid, OrderByComparator<RelacaoCredor> orderByComparator)
		throws NoSuchRelacaoCredorException {

		RelacaoCredor relacaoCredor = fetchByUuid_First(
			uuid, orderByComparator);

		if (relacaoCredor != null) {
			return relacaoCredor;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchRelacaoCredorException(sb.toString());
	}

	/**
	 * Returns the first relacao credor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching relacao credor, or <code>null</code> if a matching relacao credor could not be found
	 */
	@Override
	public RelacaoCredor fetchByUuid_First(
		String uuid, OrderByComparator<RelacaoCredor> orderByComparator) {

		List<RelacaoCredor> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last relacao credor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching relacao credor
	 * @throws NoSuchRelacaoCredorException if a matching relacao credor could not be found
	 */
	@Override
	public RelacaoCredor findByUuid_Last(
			String uuid, OrderByComparator<RelacaoCredor> orderByComparator)
		throws NoSuchRelacaoCredorException {

		RelacaoCredor relacaoCredor = fetchByUuid_Last(uuid, orderByComparator);

		if (relacaoCredor != null) {
			return relacaoCredor;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchRelacaoCredorException(sb.toString());
	}

	/**
	 * Returns the last relacao credor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching relacao credor, or <code>null</code> if a matching relacao credor could not be found
	 */
	@Override
	public RelacaoCredor fetchByUuid_Last(
		String uuid, OrderByComparator<RelacaoCredor> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<RelacaoCredor> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the relacao credors before and after the current relacao credor in the ordered set where uuid = &#63;.
	 *
	 * @param credorId the primary key of the current relacao credor
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next relacao credor
	 * @throws NoSuchRelacaoCredorException if a relacao credor with the primary key could not be found
	 */
	@Override
	public RelacaoCredor[] findByUuid_PrevAndNext(
			long credorId, String uuid,
			OrderByComparator<RelacaoCredor> orderByComparator)
		throws NoSuchRelacaoCredorException {

		uuid = Objects.toString(uuid, "");

		RelacaoCredor relacaoCredor = findByPrimaryKey(credorId);

		Session session = null;

		try {
			session = openSession();

			RelacaoCredor[] array = new RelacaoCredorImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, relacaoCredor, uuid, orderByComparator, true);

			array[1] = relacaoCredor;

			array[2] = getByUuid_PrevAndNext(
				session, relacaoCredor, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected RelacaoCredor getByUuid_PrevAndNext(
		Session session, RelacaoCredor relacaoCredor, String uuid,
		OrderByComparator<RelacaoCredor> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_RELACAOCREDOR_WHERE);

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
			sb.append(RelacaoCredorModelImpl.ORDER_BY_JPQL);
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
						relacaoCredor)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<RelacaoCredor> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the relacao credors where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (RelacaoCredor relacaoCredor :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(relacaoCredor);
		}
	}

	/**
	 * Returns the number of relacao credors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching relacao credors
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_RELACAOCREDOR_WHERE);

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
		"relacaoCredor.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(relacaoCredor.uuid IS NULL OR relacaoCredor.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByPropostaId;
	private FinderPath _finderPathWithoutPaginationFindByPropostaId;
	private FinderPath _finderPathCountByPropostaId;

	/**
	 * Returns all the relacao credors where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching relacao credors
	 */
	@Override
	public List<RelacaoCredor> findByPropostaId(long propostaId) {
		return findByPropostaId(
			propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the relacao credors where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @return the range of matching relacao credors
	 */
	@Override
	public List<RelacaoCredor> findByPropostaId(
		long propostaId, int start, int end) {

		return findByPropostaId(propostaId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the relacao credors where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching relacao credors
	 */
	@Override
	public List<RelacaoCredor> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<RelacaoCredor> orderByComparator) {

		return findByPropostaId(
			propostaId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the relacao credors where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching relacao credors
	 */
	@Override
	public List<RelacaoCredor> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<RelacaoCredor> orderByComparator,
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

		List<RelacaoCredor> list = null;

		if (useFinderCache) {
			list = (List<RelacaoCredor>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RelacaoCredor relacaoCredor : list) {
					if (propostaId != relacaoCredor.getPropostaId()) {
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

			sb.append(_SQL_SELECT_RELACAOCREDOR_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(RelacaoCredorModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

				list = (List<RelacaoCredor>)QueryUtil.list(
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
	 * Returns the first relacao credor in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching relacao credor
	 * @throws NoSuchRelacaoCredorException if a matching relacao credor could not be found
	 */
	@Override
	public RelacaoCredor findByPropostaId_First(
			long propostaId, OrderByComparator<RelacaoCredor> orderByComparator)
		throws NoSuchRelacaoCredorException {

		RelacaoCredor relacaoCredor = fetchByPropostaId_First(
			propostaId, orderByComparator);

		if (relacaoCredor != null) {
			return relacaoCredor;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchRelacaoCredorException(sb.toString());
	}

	/**
	 * Returns the first relacao credor in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching relacao credor, or <code>null</code> if a matching relacao credor could not be found
	 */
	@Override
	public RelacaoCredor fetchByPropostaId_First(
		long propostaId, OrderByComparator<RelacaoCredor> orderByComparator) {

		List<RelacaoCredor> list = findByPropostaId(
			propostaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last relacao credor in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching relacao credor
	 * @throws NoSuchRelacaoCredorException if a matching relacao credor could not be found
	 */
	@Override
	public RelacaoCredor findByPropostaId_Last(
			long propostaId, OrderByComparator<RelacaoCredor> orderByComparator)
		throws NoSuchRelacaoCredorException {

		RelacaoCredor relacaoCredor = fetchByPropostaId_Last(
			propostaId, orderByComparator);

		if (relacaoCredor != null) {
			return relacaoCredor;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchRelacaoCredorException(sb.toString());
	}

	/**
	 * Returns the last relacao credor in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching relacao credor, or <code>null</code> if a matching relacao credor could not be found
	 */
	@Override
	public RelacaoCredor fetchByPropostaId_Last(
		long propostaId, OrderByComparator<RelacaoCredor> orderByComparator) {

		int count = countByPropostaId(propostaId);

		if (count == 0) {
			return null;
		}

		List<RelacaoCredor> list = findByPropostaId(
			propostaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the relacao credors before and after the current relacao credor in the ordered set where propostaId = &#63;.
	 *
	 * @param credorId the primary key of the current relacao credor
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next relacao credor
	 * @throws NoSuchRelacaoCredorException if a relacao credor with the primary key could not be found
	 */
	@Override
	public RelacaoCredor[] findByPropostaId_PrevAndNext(
			long credorId, long propostaId,
			OrderByComparator<RelacaoCredor> orderByComparator)
		throws NoSuchRelacaoCredorException {

		RelacaoCredor relacaoCredor = findByPrimaryKey(credorId);

		Session session = null;

		try {
			session = openSession();

			RelacaoCredor[] array = new RelacaoCredorImpl[3];

			array[0] = getByPropostaId_PrevAndNext(
				session, relacaoCredor, propostaId, orderByComparator, true);

			array[1] = relacaoCredor;

			array[2] = getByPropostaId_PrevAndNext(
				session, relacaoCredor, propostaId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected RelacaoCredor getByPropostaId_PrevAndNext(
		Session session, RelacaoCredor relacaoCredor, long propostaId,
		OrderByComparator<RelacaoCredor> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_RELACAOCREDOR_WHERE);

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
			sb.append(RelacaoCredorModelImpl.ORDER_BY_JPQL);
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
						relacaoCredor)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<RelacaoCredor> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the relacao credors where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	@Override
	public void removeByPropostaId(long propostaId) {
		for (RelacaoCredor relacaoCredor :
				findByPropostaId(
					propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(relacaoCredor);
		}
	}

	/**
	 * Returns the number of relacao credors where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching relacao credors
	 */
	@Override
	public int countByPropostaId(long propostaId) {
		FinderPath finderPath = _finderPathCountByPropostaId;

		Object[] finderArgs = new Object[] {propostaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_RELACAOCREDOR_WHERE);

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
		"relacaoCredor.propostaId = ?";

	public RelacaoCredorPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(RelacaoCredor.class);

		setModelImplClass(RelacaoCredorImpl.class);
		setModelPKClass(long.class);

		setTable(RelacaoCredorTable.INSTANCE);
	}

	/**
	 * Caches the relacao credor in the entity cache if it is enabled.
	 *
	 * @param relacaoCredor the relacao credor
	 */
	@Override
	public void cacheResult(RelacaoCredor relacaoCredor) {
		entityCache.putResult(
			RelacaoCredorImpl.class, relacaoCredor.getPrimaryKey(),
			relacaoCredor);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the relacao credors in the entity cache if it is enabled.
	 *
	 * @param relacaoCredors the relacao credors
	 */
	@Override
	public void cacheResult(List<RelacaoCredor> relacaoCredors) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (relacaoCredors.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (RelacaoCredor relacaoCredor : relacaoCredors) {
			if (entityCache.getResult(
					RelacaoCredorImpl.class, relacaoCredor.getPrimaryKey()) ==
						null) {

				cacheResult(relacaoCredor);
			}
		}
	}

	/**
	 * Clears the cache for all relacao credors.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RelacaoCredorImpl.class);

		finderCache.clearCache(RelacaoCredorImpl.class);
	}

	/**
	 * Clears the cache for the relacao credor.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RelacaoCredor relacaoCredor) {
		entityCache.removeResult(RelacaoCredorImpl.class, relacaoCredor);
	}

	@Override
	public void clearCache(List<RelacaoCredor> relacaoCredors) {
		for (RelacaoCredor relacaoCredor : relacaoCredors) {
			entityCache.removeResult(RelacaoCredorImpl.class, relacaoCredor);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RelacaoCredorImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(RelacaoCredorImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new relacao credor with the primary key. Does not add the relacao credor to the database.
	 *
	 * @param credorId the primary key for the new relacao credor
	 * @return the new relacao credor
	 */
	@Override
	public RelacaoCredor create(long credorId) {
		RelacaoCredor relacaoCredor = new RelacaoCredorImpl();

		relacaoCredor.setNew(true);
		relacaoCredor.setPrimaryKey(credorId);

		String uuid = PortalUUIDUtil.generate();

		relacaoCredor.setUuid(uuid);

		return relacaoCredor;
	}

	/**
	 * Removes the relacao credor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param credorId the primary key of the relacao credor
	 * @return the relacao credor that was removed
	 * @throws NoSuchRelacaoCredorException if a relacao credor with the primary key could not be found
	 */
	@Override
	public RelacaoCredor remove(long credorId)
		throws NoSuchRelacaoCredorException {

		return remove((Serializable)credorId);
	}

	/**
	 * Removes the relacao credor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the relacao credor
	 * @return the relacao credor that was removed
	 * @throws NoSuchRelacaoCredorException if a relacao credor with the primary key could not be found
	 */
	@Override
	public RelacaoCredor remove(Serializable primaryKey)
		throws NoSuchRelacaoCredorException {

		Session session = null;

		try {
			session = openSession();

			RelacaoCredor relacaoCredor = (RelacaoCredor)session.get(
				RelacaoCredorImpl.class, primaryKey);

			if (relacaoCredor == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRelacaoCredorException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(relacaoCredor);
		}
		catch (NoSuchRelacaoCredorException noSuchEntityException) {
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
	protected RelacaoCredor removeImpl(RelacaoCredor relacaoCredor) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(relacaoCredor)) {
				relacaoCredor = (RelacaoCredor)session.get(
					RelacaoCredorImpl.class, relacaoCredor.getPrimaryKeyObj());
			}

			if (relacaoCredor != null) {
				session.delete(relacaoCredor);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (relacaoCredor != null) {
			clearCache(relacaoCredor);
		}

		return relacaoCredor;
	}

	@Override
	public RelacaoCredor updateImpl(RelacaoCredor relacaoCredor) {
		boolean isNew = relacaoCredor.isNew();

		if (!(relacaoCredor instanceof RelacaoCredorModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(relacaoCredor.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					relacaoCredor);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in relacaoCredor proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom RelacaoCredor implementation " +
					relacaoCredor.getClass());
		}

		RelacaoCredorModelImpl relacaoCredorModelImpl =
			(RelacaoCredorModelImpl)relacaoCredor;

		if (Validator.isNull(relacaoCredor.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			relacaoCredor.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(relacaoCredor);
			}
			else {
				relacaoCredor = (RelacaoCredor)session.merge(relacaoCredor);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RelacaoCredorImpl.class, relacaoCredorModelImpl, false, true);

		if (isNew) {
			relacaoCredor.setNew(false);
		}

		relacaoCredor.resetOriginalValues();

		return relacaoCredor;
	}

	/**
	 * Returns the relacao credor with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the relacao credor
	 * @return the relacao credor
	 * @throws NoSuchRelacaoCredorException if a relacao credor with the primary key could not be found
	 */
	@Override
	public RelacaoCredor findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRelacaoCredorException {

		RelacaoCredor relacaoCredor = fetchByPrimaryKey(primaryKey);

		if (relacaoCredor == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRelacaoCredorException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return relacaoCredor;
	}

	/**
	 * Returns the relacao credor with the primary key or throws a <code>NoSuchRelacaoCredorException</code> if it could not be found.
	 *
	 * @param credorId the primary key of the relacao credor
	 * @return the relacao credor
	 * @throws NoSuchRelacaoCredorException if a relacao credor with the primary key could not be found
	 */
	@Override
	public RelacaoCredor findByPrimaryKey(long credorId)
		throws NoSuchRelacaoCredorException {

		return findByPrimaryKey((Serializable)credorId);
	}

	/**
	 * Returns the relacao credor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param credorId the primary key of the relacao credor
	 * @return the relacao credor, or <code>null</code> if a relacao credor with the primary key could not be found
	 */
	@Override
	public RelacaoCredor fetchByPrimaryKey(long credorId) {
		return fetchByPrimaryKey((Serializable)credorId);
	}

	/**
	 * Returns all the relacao credors.
	 *
	 * @return the relacao credors
	 */
	@Override
	public List<RelacaoCredor> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the relacao credors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @return the range of relacao credors
	 */
	@Override
	public List<RelacaoCredor> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the relacao credors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of relacao credors
	 */
	@Override
	public List<RelacaoCredor> findAll(
		int start, int end,
		OrderByComparator<RelacaoCredor> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the relacao credors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of relacao credors
	 */
	@Override
	public List<RelacaoCredor> findAll(
		int start, int end, OrderByComparator<RelacaoCredor> orderByComparator,
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

		List<RelacaoCredor> list = null;

		if (useFinderCache) {
			list = (List<RelacaoCredor>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RELACAOCREDOR);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RELACAOCREDOR;

				sql = sql.concat(RelacaoCredorModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RelacaoCredor>)QueryUtil.list(
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
	 * Removes all the relacao credors from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RelacaoCredor relacaoCredor : findAll()) {
			remove(relacaoCredor);
		}
	}

	/**
	 * Returns the number of relacao credors.
	 *
	 * @return the number of relacao credors
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_RELACAOCREDOR);

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
		return "credorId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_RELACAOCREDOR;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RelacaoCredorModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the relacao credor persistence.
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

		RelacaoCredorUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		RelacaoCredorUtil.setPersistence(null);

		entityCache.removeCache(RelacaoCredorImpl.class.getName());
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

	private static final String _SQL_SELECT_RELACAOCREDOR =
		"SELECT relacaoCredor FROM RelacaoCredor relacaoCredor";

	private static final String _SQL_SELECT_RELACAOCREDOR_WHERE =
		"SELECT relacaoCredor FROM RelacaoCredor relacaoCredor WHERE ";

	private static final String _SQL_COUNT_RELACAOCREDOR =
		"SELECT COUNT(relacaoCredor) FROM RelacaoCredor relacaoCredor";

	private static final String _SQL_COUNT_RELACAOCREDOR_WHERE =
		"SELECT COUNT(relacaoCredor) FROM RelacaoCredor relacaoCredor WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "relacaoCredor.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RelacaoCredor exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No RelacaoCredor exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		RelacaoCredorPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}