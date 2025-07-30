/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchParcelamentoException;
import br.com.seatecnologia.gdf.negocia.model.Parcelamento;
import br.com.seatecnologia.gdf.negocia.model.ParcelamentoTable;
import br.com.seatecnologia.gdf.negocia.model.impl.ParcelamentoImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.ParcelamentoModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.ParcelamentoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.ParcelamentoUtil;
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
 * The persistence implementation for the parcelamento service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ParcelamentoPersistence.class)
public class ParcelamentoPersistenceImpl
	extends BasePersistenceImpl<Parcelamento>
	implements ParcelamentoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ParcelamentoUtil</code> to access the parcelamento persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ParcelamentoImpl.class.getName();

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
	 * Returns all the parcelamentos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching parcelamentos
	 */
	@Override
	public List<Parcelamento> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the parcelamentos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @return the range of matching parcelamentos
	 */
	@Override
	public List<Parcelamento> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the parcelamentos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching parcelamentos
	 */
	@Override
	public List<Parcelamento> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Parcelamento> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the parcelamentos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching parcelamentos
	 */
	@Override
	public List<Parcelamento> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Parcelamento> orderByComparator,
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

		List<Parcelamento> list = null;

		if (useFinderCache) {
			list = (List<Parcelamento>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Parcelamento parcelamento : list) {
					if (!uuid.equals(parcelamento.getUuid())) {
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

			sb.append(_SQL_SELECT_PARCELAMENTO_WHERE);

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
				sb.append(ParcelamentoModelImpl.ORDER_BY_JPQL);
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

				list = (List<Parcelamento>)QueryUtil.list(
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
	 * Returns the first parcelamento in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parcelamento
	 * @throws NoSuchParcelamentoException if a matching parcelamento could not be found
	 */
	@Override
	public Parcelamento findByUuid_First(
			String uuid, OrderByComparator<Parcelamento> orderByComparator)
		throws NoSuchParcelamentoException {

		Parcelamento parcelamento = fetchByUuid_First(uuid, orderByComparator);

		if (parcelamento != null) {
			return parcelamento;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchParcelamentoException(sb.toString());
	}

	/**
	 * Returns the first parcelamento in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parcelamento, or <code>null</code> if a matching parcelamento could not be found
	 */
	@Override
	public Parcelamento fetchByUuid_First(
		String uuid, OrderByComparator<Parcelamento> orderByComparator) {

		List<Parcelamento> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last parcelamento in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parcelamento
	 * @throws NoSuchParcelamentoException if a matching parcelamento could not be found
	 */
	@Override
	public Parcelamento findByUuid_Last(
			String uuid, OrderByComparator<Parcelamento> orderByComparator)
		throws NoSuchParcelamentoException {

		Parcelamento parcelamento = fetchByUuid_Last(uuid, orderByComparator);

		if (parcelamento != null) {
			return parcelamento;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchParcelamentoException(sb.toString());
	}

	/**
	 * Returns the last parcelamento in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parcelamento, or <code>null</code> if a matching parcelamento could not be found
	 */
	@Override
	public Parcelamento fetchByUuid_Last(
		String uuid, OrderByComparator<Parcelamento> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Parcelamento> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the parcelamentos before and after the current parcelamento in the ordered set where uuid = &#63;.
	 *
	 * @param parcelamentoId the primary key of the current parcelamento
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next parcelamento
	 * @throws NoSuchParcelamentoException if a parcelamento with the primary key could not be found
	 */
	@Override
	public Parcelamento[] findByUuid_PrevAndNext(
			long parcelamentoId, String uuid,
			OrderByComparator<Parcelamento> orderByComparator)
		throws NoSuchParcelamentoException {

		uuid = Objects.toString(uuid, "");

		Parcelamento parcelamento = findByPrimaryKey(parcelamentoId);

		Session session = null;

		try {
			session = openSession();

			Parcelamento[] array = new ParcelamentoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, parcelamento, uuid, orderByComparator, true);

			array[1] = parcelamento;

			array[2] = getByUuid_PrevAndNext(
				session, parcelamento, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Parcelamento getByUuid_PrevAndNext(
		Session session, Parcelamento parcelamento, String uuid,
		OrderByComparator<Parcelamento> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PARCELAMENTO_WHERE);

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
			sb.append(ParcelamentoModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(parcelamento)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Parcelamento> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the parcelamentos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Parcelamento parcelamento :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(parcelamento);
		}
	}

	/**
	 * Returns the number of parcelamentos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching parcelamentos
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PARCELAMENTO_WHERE);

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
		"parcelamento.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(parcelamento.uuid IS NULL OR parcelamento.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByPropostaId;
	private FinderPath _finderPathWithoutPaginationFindByPropostaId;
	private FinderPath _finderPathCountByPropostaId;

	/**
	 * Returns all the parcelamentos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching parcelamentos
	 */
	@Override
	public List<Parcelamento> findByPropostaId(long propostaId) {
		return findByPropostaId(
			propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the parcelamentos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @return the range of matching parcelamentos
	 */
	@Override
	public List<Parcelamento> findByPropostaId(
		long propostaId, int start, int end) {

		return findByPropostaId(propostaId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the parcelamentos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching parcelamentos
	 */
	@Override
	public List<Parcelamento> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<Parcelamento> orderByComparator) {

		return findByPropostaId(
			propostaId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the parcelamentos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching parcelamentos
	 */
	@Override
	public List<Parcelamento> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<Parcelamento> orderByComparator,
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

		List<Parcelamento> list = null;

		if (useFinderCache) {
			list = (List<Parcelamento>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Parcelamento parcelamento : list) {
					if (propostaId != parcelamento.getPropostaId()) {
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

			sb.append(_SQL_SELECT_PARCELAMENTO_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ParcelamentoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

				list = (List<Parcelamento>)QueryUtil.list(
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
	 * Returns the first parcelamento in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parcelamento
	 * @throws NoSuchParcelamentoException if a matching parcelamento could not be found
	 */
	@Override
	public Parcelamento findByPropostaId_First(
			long propostaId, OrderByComparator<Parcelamento> orderByComparator)
		throws NoSuchParcelamentoException {

		Parcelamento parcelamento = fetchByPropostaId_First(
			propostaId, orderByComparator);

		if (parcelamento != null) {
			return parcelamento;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchParcelamentoException(sb.toString());
	}

	/**
	 * Returns the first parcelamento in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parcelamento, or <code>null</code> if a matching parcelamento could not be found
	 */
	@Override
	public Parcelamento fetchByPropostaId_First(
		long propostaId, OrderByComparator<Parcelamento> orderByComparator) {

		List<Parcelamento> list = findByPropostaId(
			propostaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last parcelamento in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parcelamento
	 * @throws NoSuchParcelamentoException if a matching parcelamento could not be found
	 */
	@Override
	public Parcelamento findByPropostaId_Last(
			long propostaId, OrderByComparator<Parcelamento> orderByComparator)
		throws NoSuchParcelamentoException {

		Parcelamento parcelamento = fetchByPropostaId_Last(
			propostaId, orderByComparator);

		if (parcelamento != null) {
			return parcelamento;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchParcelamentoException(sb.toString());
	}

	/**
	 * Returns the last parcelamento in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parcelamento, or <code>null</code> if a matching parcelamento could not be found
	 */
	@Override
	public Parcelamento fetchByPropostaId_Last(
		long propostaId, OrderByComparator<Parcelamento> orderByComparator) {

		int count = countByPropostaId(propostaId);

		if (count == 0) {
			return null;
		}

		List<Parcelamento> list = findByPropostaId(
			propostaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the parcelamentos before and after the current parcelamento in the ordered set where propostaId = &#63;.
	 *
	 * @param parcelamentoId the primary key of the current parcelamento
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next parcelamento
	 * @throws NoSuchParcelamentoException if a parcelamento with the primary key could not be found
	 */
	@Override
	public Parcelamento[] findByPropostaId_PrevAndNext(
			long parcelamentoId, long propostaId,
			OrderByComparator<Parcelamento> orderByComparator)
		throws NoSuchParcelamentoException {

		Parcelamento parcelamento = findByPrimaryKey(parcelamentoId);

		Session session = null;

		try {
			session = openSession();

			Parcelamento[] array = new ParcelamentoImpl[3];

			array[0] = getByPropostaId_PrevAndNext(
				session, parcelamento, propostaId, orderByComparator, true);

			array[1] = parcelamento;

			array[2] = getByPropostaId_PrevAndNext(
				session, parcelamento, propostaId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Parcelamento getByPropostaId_PrevAndNext(
		Session session, Parcelamento parcelamento, long propostaId,
		OrderByComparator<Parcelamento> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PARCELAMENTO_WHERE);

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
			sb.append(ParcelamentoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(propostaId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(parcelamento)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Parcelamento> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the parcelamentos where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	@Override
	public void removeByPropostaId(long propostaId) {
		for (Parcelamento parcelamento :
				findByPropostaId(
					propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(parcelamento);
		}
	}

	/**
	 * Returns the number of parcelamentos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching parcelamentos
	 */
	@Override
	public int countByPropostaId(long propostaId) {
		FinderPath finderPath = _finderPathCountByPropostaId;

		Object[] finderArgs = new Object[] {propostaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PARCELAMENTO_WHERE);

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
		"parcelamento.propostaId = ?";

	public ParcelamentoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Parcelamento.class);

		setModelImplClass(ParcelamentoImpl.class);
		setModelPKClass(long.class);

		setTable(ParcelamentoTable.INSTANCE);
	}

	/**
	 * Caches the parcelamento in the entity cache if it is enabled.
	 *
	 * @param parcelamento the parcelamento
	 */
	@Override
	public void cacheResult(Parcelamento parcelamento) {
		entityCache.putResult(
			ParcelamentoImpl.class, parcelamento.getPrimaryKey(), parcelamento);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the parcelamentos in the entity cache if it is enabled.
	 *
	 * @param parcelamentos the parcelamentos
	 */
	@Override
	public void cacheResult(List<Parcelamento> parcelamentos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (parcelamentos.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Parcelamento parcelamento : parcelamentos) {
			if (entityCache.getResult(
					ParcelamentoImpl.class, parcelamento.getPrimaryKey()) ==
						null) {

				cacheResult(parcelamento);
			}
		}
	}

	/**
	 * Clears the cache for all parcelamentos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ParcelamentoImpl.class);

		finderCache.clearCache(ParcelamentoImpl.class);
	}

	/**
	 * Clears the cache for the parcelamento.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Parcelamento parcelamento) {
		entityCache.removeResult(ParcelamentoImpl.class, parcelamento);
	}

	@Override
	public void clearCache(List<Parcelamento> parcelamentos) {
		for (Parcelamento parcelamento : parcelamentos) {
			entityCache.removeResult(ParcelamentoImpl.class, parcelamento);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ParcelamentoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ParcelamentoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new parcelamento with the primary key. Does not add the parcelamento to the database.
	 *
	 * @param parcelamentoId the primary key for the new parcelamento
	 * @return the new parcelamento
	 */
	@Override
	public Parcelamento create(long parcelamentoId) {
		Parcelamento parcelamento = new ParcelamentoImpl();

		parcelamento.setNew(true);
		parcelamento.setPrimaryKey(parcelamentoId);

		String uuid = PortalUUIDUtil.generate();

		parcelamento.setUuid(uuid);

		return parcelamento;
	}

	/**
	 * Removes the parcelamento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param parcelamentoId the primary key of the parcelamento
	 * @return the parcelamento that was removed
	 * @throws NoSuchParcelamentoException if a parcelamento with the primary key could not be found
	 */
	@Override
	public Parcelamento remove(long parcelamentoId)
		throws NoSuchParcelamentoException {

		return remove((Serializable)parcelamentoId);
	}

	/**
	 * Removes the parcelamento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the parcelamento
	 * @return the parcelamento that was removed
	 * @throws NoSuchParcelamentoException if a parcelamento with the primary key could not be found
	 */
	@Override
	public Parcelamento remove(Serializable primaryKey)
		throws NoSuchParcelamentoException {

		Session session = null;

		try {
			session = openSession();

			Parcelamento parcelamento = (Parcelamento)session.get(
				ParcelamentoImpl.class, primaryKey);

			if (parcelamento == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchParcelamentoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(parcelamento);
		}
		catch (NoSuchParcelamentoException noSuchEntityException) {
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
	protected Parcelamento removeImpl(Parcelamento parcelamento) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(parcelamento)) {
				parcelamento = (Parcelamento)session.get(
					ParcelamentoImpl.class, parcelamento.getPrimaryKeyObj());
			}

			if (parcelamento != null) {
				session.delete(parcelamento);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (parcelamento != null) {
			clearCache(parcelamento);
		}

		return parcelamento;
	}

	@Override
	public Parcelamento updateImpl(Parcelamento parcelamento) {
		boolean isNew = parcelamento.isNew();

		if (!(parcelamento instanceof ParcelamentoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(parcelamento.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					parcelamento);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in parcelamento proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Parcelamento implementation " +
					parcelamento.getClass());
		}

		ParcelamentoModelImpl parcelamentoModelImpl =
			(ParcelamentoModelImpl)parcelamento;

		if (Validator.isNull(parcelamento.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			parcelamento.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(parcelamento);
			}
			else {
				parcelamento = (Parcelamento)session.merge(parcelamento);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ParcelamentoImpl.class, parcelamentoModelImpl, false, true);

		if (isNew) {
			parcelamento.setNew(false);
		}

		parcelamento.resetOriginalValues();

		return parcelamento;
	}

	/**
	 * Returns the parcelamento with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the parcelamento
	 * @return the parcelamento
	 * @throws NoSuchParcelamentoException if a parcelamento with the primary key could not be found
	 */
	@Override
	public Parcelamento findByPrimaryKey(Serializable primaryKey)
		throws NoSuchParcelamentoException {

		Parcelamento parcelamento = fetchByPrimaryKey(primaryKey);

		if (parcelamento == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchParcelamentoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return parcelamento;
	}

	/**
	 * Returns the parcelamento with the primary key or throws a <code>NoSuchParcelamentoException</code> if it could not be found.
	 *
	 * @param parcelamentoId the primary key of the parcelamento
	 * @return the parcelamento
	 * @throws NoSuchParcelamentoException if a parcelamento with the primary key could not be found
	 */
	@Override
	public Parcelamento findByPrimaryKey(long parcelamentoId)
		throws NoSuchParcelamentoException {

		return findByPrimaryKey((Serializable)parcelamentoId);
	}

	/**
	 * Returns the parcelamento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param parcelamentoId the primary key of the parcelamento
	 * @return the parcelamento, or <code>null</code> if a parcelamento with the primary key could not be found
	 */
	@Override
	public Parcelamento fetchByPrimaryKey(long parcelamentoId) {
		return fetchByPrimaryKey((Serializable)parcelamentoId);
	}

	/**
	 * Returns all the parcelamentos.
	 *
	 * @return the parcelamentos
	 */
	@Override
	public List<Parcelamento> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the parcelamentos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @return the range of parcelamentos
	 */
	@Override
	public List<Parcelamento> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the parcelamentos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of parcelamentos
	 */
	@Override
	public List<Parcelamento> findAll(
		int start, int end, OrderByComparator<Parcelamento> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the parcelamentos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of parcelamentos
	 */
	@Override
	public List<Parcelamento> findAll(
		int start, int end, OrderByComparator<Parcelamento> orderByComparator,
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

		List<Parcelamento> list = null;

		if (useFinderCache) {
			list = (List<Parcelamento>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PARCELAMENTO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PARCELAMENTO;

				sql = sql.concat(ParcelamentoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Parcelamento>)QueryUtil.list(
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
	 * Removes all the parcelamentos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Parcelamento parcelamento : findAll()) {
			remove(parcelamento);
		}
	}

	/**
	 * Returns the number of parcelamentos.
	 *
	 * @return the number of parcelamentos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PARCELAMENTO);

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
		return "parcelamentoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PARCELAMENTO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ParcelamentoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the parcelamento persistence.
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

		ParcelamentoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ParcelamentoUtil.setPersistence(null);

		entityCache.removeCache(ParcelamentoImpl.class.getName());
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

	private static final String _SQL_SELECT_PARCELAMENTO =
		"SELECT parcelamento FROM Parcelamento parcelamento";

	private static final String _SQL_SELECT_PARCELAMENTO_WHERE =
		"SELECT parcelamento FROM Parcelamento parcelamento WHERE ";

	private static final String _SQL_COUNT_PARCELAMENTO =
		"SELECT COUNT(parcelamento) FROM Parcelamento parcelamento";

	private static final String _SQL_COUNT_PARCELAMENTO_WHERE =
		"SELECT COUNT(parcelamento) FROM Parcelamento parcelamento WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "parcelamento.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Parcelamento exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Parcelamento exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ParcelamentoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}