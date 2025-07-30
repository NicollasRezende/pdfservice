/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchAcaoJudicialException;
import br.com.seatecnologia.gdf.negocia.model.AcaoJudicial;
import br.com.seatecnologia.gdf.negocia.model.AcaoJudicialTable;
import br.com.seatecnologia.gdf.negocia.model.impl.AcaoJudicialImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.AcaoJudicialModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.AcaoJudicialPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AcaoJudicialUtil;
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
 * The persistence implementation for the acao judicial service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcaoJudicialPersistence.class)
public class AcaoJudicialPersistenceImpl
	extends BasePersistenceImpl<AcaoJudicial>
	implements AcaoJudicialPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcaoJudicialUtil</code> to access the acao judicial persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcaoJudicialImpl.class.getName();

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
	 * Returns all the acao judicials where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acao judicials
	 */
	@Override
	public List<AcaoJudicial> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acao judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @return the range of matching acao judicials
	 */
	@Override
	public List<AcaoJudicial> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acao judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acao judicials
	 */
	@Override
	public List<AcaoJudicial> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AcaoJudicial> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acao judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acao judicials
	 */
	@Override
	public List<AcaoJudicial> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AcaoJudicial> orderByComparator,
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

		List<AcaoJudicial> list = null;

		if (useFinderCache) {
			list = (List<AcaoJudicial>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AcaoJudicial acaoJudicial : list) {
					if (!uuid.equals(acaoJudicial.getUuid())) {
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

			sb.append(_SQL_SELECT_ACAOJUDICIAL_WHERE);

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
				sb.append(AcaoJudicialModelImpl.ORDER_BY_JPQL);
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

				list = (List<AcaoJudicial>)QueryUtil.list(
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
	 * Returns the first acao judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial
	 * @throws NoSuchAcaoJudicialException if a matching acao judicial could not be found
	 */
	@Override
	public AcaoJudicial findByUuid_First(
			String uuid, OrderByComparator<AcaoJudicial> orderByComparator)
		throws NoSuchAcaoJudicialException {

		AcaoJudicial acaoJudicial = fetchByUuid_First(uuid, orderByComparator);

		if (acaoJudicial != null) {
			return acaoJudicial;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAcaoJudicialException(sb.toString());
	}

	/**
	 * Returns the first acao judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial, or <code>null</code> if a matching acao judicial could not be found
	 */
	@Override
	public AcaoJudicial fetchByUuid_First(
		String uuid, OrderByComparator<AcaoJudicial> orderByComparator) {

		List<AcaoJudicial> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acao judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial
	 * @throws NoSuchAcaoJudicialException if a matching acao judicial could not be found
	 */
	@Override
	public AcaoJudicial findByUuid_Last(
			String uuid, OrderByComparator<AcaoJudicial> orderByComparator)
		throws NoSuchAcaoJudicialException {

		AcaoJudicial acaoJudicial = fetchByUuid_Last(uuid, orderByComparator);

		if (acaoJudicial != null) {
			return acaoJudicial;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAcaoJudicialException(sb.toString());
	}

	/**
	 * Returns the last acao judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial, or <code>null</code> if a matching acao judicial could not be found
	 */
	@Override
	public AcaoJudicial fetchByUuid_Last(
		String uuid, OrderByComparator<AcaoJudicial> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<AcaoJudicial> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acao judicials before and after the current acao judicial in the ordered set where uuid = &#63;.
	 *
	 * @param acaoId the primary key of the current acao judicial
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acao judicial
	 * @throws NoSuchAcaoJudicialException if a acao judicial with the primary key could not be found
	 */
	@Override
	public AcaoJudicial[] findByUuid_PrevAndNext(
			long acaoId, String uuid,
			OrderByComparator<AcaoJudicial> orderByComparator)
		throws NoSuchAcaoJudicialException {

		uuid = Objects.toString(uuid, "");

		AcaoJudicial acaoJudicial = findByPrimaryKey(acaoId);

		Session session = null;

		try {
			session = openSession();

			AcaoJudicial[] array = new AcaoJudicialImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, acaoJudicial, uuid, orderByComparator, true);

			array[1] = acaoJudicial;

			array[2] = getByUuid_PrevAndNext(
				session, acaoJudicial, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AcaoJudicial getByUuid_PrevAndNext(
		Session session, AcaoJudicial acaoJudicial, String uuid,
		OrderByComparator<AcaoJudicial> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ACAOJUDICIAL_WHERE);

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
			sb.append(AcaoJudicialModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(acaoJudicial)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AcaoJudicial> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acao judicials where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (AcaoJudicial acaoJudicial :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(acaoJudicial);
		}
	}

	/**
	 * Returns the number of acao judicials where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acao judicials
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACAOJUDICIAL_WHERE);

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
		"acaoJudicial.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(acaoJudicial.uuid IS NULL OR acaoJudicial.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByPropostaId;
	private FinderPath _finderPathWithoutPaginationFindByPropostaId;
	private FinderPath _finderPathCountByPropostaId;

	/**
	 * Returns all the acao judicials where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching acao judicials
	 */
	@Override
	public List<AcaoJudicial> findByPropostaId(long propostaId) {
		return findByPropostaId(
			propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acao judicials where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @return the range of matching acao judicials
	 */
	@Override
	public List<AcaoJudicial> findByPropostaId(
		long propostaId, int start, int end) {

		return findByPropostaId(propostaId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acao judicials where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acao judicials
	 */
	@Override
	public List<AcaoJudicial> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<AcaoJudicial> orderByComparator) {

		return findByPropostaId(
			propostaId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acao judicials where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acao judicials
	 */
	@Override
	public List<AcaoJudicial> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<AcaoJudicial> orderByComparator,
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

		List<AcaoJudicial> list = null;

		if (useFinderCache) {
			list = (List<AcaoJudicial>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AcaoJudicial acaoJudicial : list) {
					if (propostaId != acaoJudicial.getPropostaId()) {
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

			sb.append(_SQL_SELECT_ACAOJUDICIAL_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AcaoJudicialModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

				list = (List<AcaoJudicial>)QueryUtil.list(
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
	 * Returns the first acao judicial in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial
	 * @throws NoSuchAcaoJudicialException if a matching acao judicial could not be found
	 */
	@Override
	public AcaoJudicial findByPropostaId_First(
			long propostaId, OrderByComparator<AcaoJudicial> orderByComparator)
		throws NoSuchAcaoJudicialException {

		AcaoJudicial acaoJudicial = fetchByPropostaId_First(
			propostaId, orderByComparator);

		if (acaoJudicial != null) {
			return acaoJudicial;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchAcaoJudicialException(sb.toString());
	}

	/**
	 * Returns the first acao judicial in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial, or <code>null</code> if a matching acao judicial could not be found
	 */
	@Override
	public AcaoJudicial fetchByPropostaId_First(
		long propostaId, OrderByComparator<AcaoJudicial> orderByComparator) {

		List<AcaoJudicial> list = findByPropostaId(
			propostaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acao judicial in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial
	 * @throws NoSuchAcaoJudicialException if a matching acao judicial could not be found
	 */
	@Override
	public AcaoJudicial findByPropostaId_Last(
			long propostaId, OrderByComparator<AcaoJudicial> orderByComparator)
		throws NoSuchAcaoJudicialException {

		AcaoJudicial acaoJudicial = fetchByPropostaId_Last(
			propostaId, orderByComparator);

		if (acaoJudicial != null) {
			return acaoJudicial;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchAcaoJudicialException(sb.toString());
	}

	/**
	 * Returns the last acao judicial in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial, or <code>null</code> if a matching acao judicial could not be found
	 */
	@Override
	public AcaoJudicial fetchByPropostaId_Last(
		long propostaId, OrderByComparator<AcaoJudicial> orderByComparator) {

		int count = countByPropostaId(propostaId);

		if (count == 0) {
			return null;
		}

		List<AcaoJudicial> list = findByPropostaId(
			propostaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acao judicials before and after the current acao judicial in the ordered set where propostaId = &#63;.
	 *
	 * @param acaoId the primary key of the current acao judicial
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acao judicial
	 * @throws NoSuchAcaoJudicialException if a acao judicial with the primary key could not be found
	 */
	@Override
	public AcaoJudicial[] findByPropostaId_PrevAndNext(
			long acaoId, long propostaId,
			OrderByComparator<AcaoJudicial> orderByComparator)
		throws NoSuchAcaoJudicialException {

		AcaoJudicial acaoJudicial = findByPrimaryKey(acaoId);

		Session session = null;

		try {
			session = openSession();

			AcaoJudicial[] array = new AcaoJudicialImpl[3];

			array[0] = getByPropostaId_PrevAndNext(
				session, acaoJudicial, propostaId, orderByComparator, true);

			array[1] = acaoJudicial;

			array[2] = getByPropostaId_PrevAndNext(
				session, acaoJudicial, propostaId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AcaoJudicial getByPropostaId_PrevAndNext(
		Session session, AcaoJudicial acaoJudicial, long propostaId,
		OrderByComparator<AcaoJudicial> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ACAOJUDICIAL_WHERE);

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
			sb.append(AcaoJudicialModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(propostaId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(acaoJudicial)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AcaoJudicial> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acao judicials where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	@Override
	public void removeByPropostaId(long propostaId) {
		for (AcaoJudicial acaoJudicial :
				findByPropostaId(
					propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(acaoJudicial);
		}
	}

	/**
	 * Returns the number of acao judicials where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching acao judicials
	 */
	@Override
	public int countByPropostaId(long propostaId) {
		FinderPath finderPath = _finderPathCountByPropostaId;

		Object[] finderArgs = new Object[] {propostaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACAOJUDICIAL_WHERE);

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
		"acaoJudicial.propostaId = ?";

	public AcaoJudicialPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AcaoJudicial.class);

		setModelImplClass(AcaoJudicialImpl.class);
		setModelPKClass(long.class);

		setTable(AcaoJudicialTable.INSTANCE);
	}

	/**
	 * Caches the acao judicial in the entity cache if it is enabled.
	 *
	 * @param acaoJudicial the acao judicial
	 */
	@Override
	public void cacheResult(AcaoJudicial acaoJudicial) {
		entityCache.putResult(
			AcaoJudicialImpl.class, acaoJudicial.getPrimaryKey(), acaoJudicial);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acao judicials in the entity cache if it is enabled.
	 *
	 * @param acaoJudicials the acao judicials
	 */
	@Override
	public void cacheResult(List<AcaoJudicial> acaoJudicials) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acaoJudicials.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcaoJudicial acaoJudicial : acaoJudicials) {
			if (entityCache.getResult(
					AcaoJudicialImpl.class, acaoJudicial.getPrimaryKey()) ==
						null) {

				cacheResult(acaoJudicial);
			}
		}
	}

	/**
	 * Clears the cache for all acao judicials.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcaoJudicialImpl.class);

		finderCache.clearCache(AcaoJudicialImpl.class);
	}

	/**
	 * Clears the cache for the acao judicial.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AcaoJudicial acaoJudicial) {
		entityCache.removeResult(AcaoJudicialImpl.class, acaoJudicial);
	}

	@Override
	public void clearCache(List<AcaoJudicial> acaoJudicials) {
		for (AcaoJudicial acaoJudicial : acaoJudicials) {
			entityCache.removeResult(AcaoJudicialImpl.class, acaoJudicial);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcaoJudicialImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AcaoJudicialImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new acao judicial with the primary key. Does not add the acao judicial to the database.
	 *
	 * @param acaoId the primary key for the new acao judicial
	 * @return the new acao judicial
	 */
	@Override
	public AcaoJudicial create(long acaoId) {
		AcaoJudicial acaoJudicial = new AcaoJudicialImpl();

		acaoJudicial.setNew(true);
		acaoJudicial.setPrimaryKey(acaoId);

		String uuid = PortalUUIDUtil.generate();

		acaoJudicial.setUuid(uuid);

		return acaoJudicial;
	}

	/**
	 * Removes the acao judicial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acaoId the primary key of the acao judicial
	 * @return the acao judicial that was removed
	 * @throws NoSuchAcaoJudicialException if a acao judicial with the primary key could not be found
	 */
	@Override
	public AcaoJudicial remove(long acaoId) throws NoSuchAcaoJudicialException {
		return remove((Serializable)acaoId);
	}

	/**
	 * Removes the acao judicial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acao judicial
	 * @return the acao judicial that was removed
	 * @throws NoSuchAcaoJudicialException if a acao judicial with the primary key could not be found
	 */
	@Override
	public AcaoJudicial remove(Serializable primaryKey)
		throws NoSuchAcaoJudicialException {

		Session session = null;

		try {
			session = openSession();

			AcaoJudicial acaoJudicial = (AcaoJudicial)session.get(
				AcaoJudicialImpl.class, primaryKey);

			if (acaoJudicial == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcaoJudicialException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acaoJudicial);
		}
		catch (NoSuchAcaoJudicialException noSuchEntityException) {
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
	protected AcaoJudicial removeImpl(AcaoJudicial acaoJudicial) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acaoJudicial)) {
				acaoJudicial = (AcaoJudicial)session.get(
					AcaoJudicialImpl.class, acaoJudicial.getPrimaryKeyObj());
			}

			if (acaoJudicial != null) {
				session.delete(acaoJudicial);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acaoJudicial != null) {
			clearCache(acaoJudicial);
		}

		return acaoJudicial;
	}

	@Override
	public AcaoJudicial updateImpl(AcaoJudicial acaoJudicial) {
		boolean isNew = acaoJudicial.isNew();

		if (!(acaoJudicial instanceof AcaoJudicialModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acaoJudicial.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acaoJudicial);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acaoJudicial proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcaoJudicial implementation " +
					acaoJudicial.getClass());
		}

		AcaoJudicialModelImpl acaoJudicialModelImpl =
			(AcaoJudicialModelImpl)acaoJudicial;

		if (Validator.isNull(acaoJudicial.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			acaoJudicial.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acaoJudicial);
			}
			else {
				acaoJudicial = (AcaoJudicial)session.merge(acaoJudicial);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcaoJudicialImpl.class, acaoJudicialModelImpl, false, true);

		if (isNew) {
			acaoJudicial.setNew(false);
		}

		acaoJudicial.resetOriginalValues();

		return acaoJudicial;
	}

	/**
	 * Returns the acao judicial with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acao judicial
	 * @return the acao judicial
	 * @throws NoSuchAcaoJudicialException if a acao judicial with the primary key could not be found
	 */
	@Override
	public AcaoJudicial findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcaoJudicialException {

		AcaoJudicial acaoJudicial = fetchByPrimaryKey(primaryKey);

		if (acaoJudicial == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcaoJudicialException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acaoJudicial;
	}

	/**
	 * Returns the acao judicial with the primary key or throws a <code>NoSuchAcaoJudicialException</code> if it could not be found.
	 *
	 * @param acaoId the primary key of the acao judicial
	 * @return the acao judicial
	 * @throws NoSuchAcaoJudicialException if a acao judicial with the primary key could not be found
	 */
	@Override
	public AcaoJudicial findByPrimaryKey(long acaoId)
		throws NoSuchAcaoJudicialException {

		return findByPrimaryKey((Serializable)acaoId);
	}

	/**
	 * Returns the acao judicial with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acaoId the primary key of the acao judicial
	 * @return the acao judicial, or <code>null</code> if a acao judicial with the primary key could not be found
	 */
	@Override
	public AcaoJudicial fetchByPrimaryKey(long acaoId) {
		return fetchByPrimaryKey((Serializable)acaoId);
	}

	/**
	 * Returns all the acao judicials.
	 *
	 * @return the acao judicials
	 */
	@Override
	public List<AcaoJudicial> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acao judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @return the range of acao judicials
	 */
	@Override
	public List<AcaoJudicial> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acao judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acao judicials
	 */
	@Override
	public List<AcaoJudicial> findAll(
		int start, int end, OrderByComparator<AcaoJudicial> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acao judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acao judicials
	 */
	@Override
	public List<AcaoJudicial> findAll(
		int start, int end, OrderByComparator<AcaoJudicial> orderByComparator,
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

		List<AcaoJudicial> list = null;

		if (useFinderCache) {
			list = (List<AcaoJudicial>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACAOJUDICIAL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACAOJUDICIAL;

				sql = sql.concat(AcaoJudicialModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcaoJudicial>)QueryUtil.list(
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
	 * Removes all the acao judicials from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcaoJudicial acaoJudicial : findAll()) {
			remove(acaoJudicial);
		}
	}

	/**
	 * Returns the number of acao judicials.
	 *
	 * @return the number of acao judicials
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ACAOJUDICIAL);

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
		return "acaoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACAOJUDICIAL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcaoJudicialModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acao judicial persistence.
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

		AcaoJudicialUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcaoJudicialUtil.setPersistence(null);

		entityCache.removeCache(AcaoJudicialImpl.class.getName());
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

	private static final String _SQL_SELECT_ACAOJUDICIAL =
		"SELECT acaoJudicial FROM AcaoJudicial acaoJudicial";

	private static final String _SQL_SELECT_ACAOJUDICIAL_WHERE =
		"SELECT acaoJudicial FROM AcaoJudicial acaoJudicial WHERE ";

	private static final String _SQL_COUNT_ACAOJUDICIAL =
		"SELECT COUNT(acaoJudicial) FROM AcaoJudicial acaoJudicial";

	private static final String _SQL_COUNT_ACAOJUDICIAL_WHERE =
		"SELECT COUNT(acaoJudicial) FROM AcaoJudicial acaoJudicial WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "acaoJudicial.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcaoJudicial exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcaoJudicial exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcaoJudicialPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}