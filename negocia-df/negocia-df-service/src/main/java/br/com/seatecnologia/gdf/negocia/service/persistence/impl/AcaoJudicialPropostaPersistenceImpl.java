/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchAcaoJudicialPropostaException;
import br.com.seatecnologia.gdf.negocia.model.AcaoJudicialProposta;
import br.com.seatecnologia.gdf.negocia.model.AcaoJudicialPropostaTable;
import br.com.seatecnologia.gdf.negocia.model.impl.AcaoJudicialPropostaImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.AcaoJudicialPropostaModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.AcaoJudicialPropostaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AcaoJudicialPropostaUtil;
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
 * The persistence implementation for the acao judicial proposta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcaoJudicialPropostaPersistence.class)
public class AcaoJudicialPropostaPersistenceImpl
	extends BasePersistenceImpl<AcaoJudicialProposta>
	implements AcaoJudicialPropostaPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcaoJudicialPropostaUtil</code> to access the acao judicial proposta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcaoJudicialPropostaImpl.class.getName();

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
	 * Returns all the acao judicial propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acao judicial propostas
	 */
	@Override
	public List<AcaoJudicialProposta> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acao judicial propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @return the range of matching acao judicial propostas
	 */
	@Override
	public List<AcaoJudicialProposta> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acao judicial propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acao judicial propostas
	 */
	@Override
	public List<AcaoJudicialProposta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AcaoJudicialProposta> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acao judicial propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acao judicial propostas
	 */
	@Override
	public List<AcaoJudicialProposta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AcaoJudicialProposta> orderByComparator,
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

		List<AcaoJudicialProposta> list = null;

		if (useFinderCache) {
			list = (List<AcaoJudicialProposta>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AcaoJudicialProposta acaoJudicialProposta : list) {
					if (!uuid.equals(acaoJudicialProposta.getUuid())) {
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

			sb.append(_SQL_SELECT_ACAOJUDICIALPROPOSTA_WHERE);

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
				sb.append(AcaoJudicialPropostaModelImpl.ORDER_BY_JPQL);
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

				list = (List<AcaoJudicialProposta>)QueryUtil.list(
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
	 * Returns the first acao judicial proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a matching acao judicial proposta could not be found
	 */
	@Override
	public AcaoJudicialProposta findByUuid_First(
			String uuid,
			OrderByComparator<AcaoJudicialProposta> orderByComparator)
		throws NoSuchAcaoJudicialPropostaException {

		AcaoJudicialProposta acaoJudicialProposta = fetchByUuid_First(
			uuid, orderByComparator);

		if (acaoJudicialProposta != null) {
			return acaoJudicialProposta;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAcaoJudicialPropostaException(sb.toString());
	}

	/**
	 * Returns the first acao judicial proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial proposta, or <code>null</code> if a matching acao judicial proposta could not be found
	 */
	@Override
	public AcaoJudicialProposta fetchByUuid_First(
		String uuid,
		OrderByComparator<AcaoJudicialProposta> orderByComparator) {

		List<AcaoJudicialProposta> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acao judicial proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a matching acao judicial proposta could not be found
	 */
	@Override
	public AcaoJudicialProposta findByUuid_Last(
			String uuid,
			OrderByComparator<AcaoJudicialProposta> orderByComparator)
		throws NoSuchAcaoJudicialPropostaException {

		AcaoJudicialProposta acaoJudicialProposta = fetchByUuid_Last(
			uuid, orderByComparator);

		if (acaoJudicialProposta != null) {
			return acaoJudicialProposta;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAcaoJudicialPropostaException(sb.toString());
	}

	/**
	 * Returns the last acao judicial proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial proposta, or <code>null</code> if a matching acao judicial proposta could not be found
	 */
	@Override
	public AcaoJudicialProposta fetchByUuid_Last(
		String uuid,
		OrderByComparator<AcaoJudicialProposta> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<AcaoJudicialProposta> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acao judicial propostas before and after the current acao judicial proposta in the ordered set where uuid = &#63;.
	 *
	 * @param acaoPropostaId the primary key of the current acao judicial proposta
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a acao judicial proposta with the primary key could not be found
	 */
	@Override
	public AcaoJudicialProposta[] findByUuid_PrevAndNext(
			long acaoPropostaId, String uuid,
			OrderByComparator<AcaoJudicialProposta> orderByComparator)
		throws NoSuchAcaoJudicialPropostaException {

		uuid = Objects.toString(uuid, "");

		AcaoJudicialProposta acaoJudicialProposta = findByPrimaryKey(
			acaoPropostaId);

		Session session = null;

		try {
			session = openSession();

			AcaoJudicialProposta[] array = new AcaoJudicialPropostaImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, acaoJudicialProposta, uuid, orderByComparator, true);

			array[1] = acaoJudicialProposta;

			array[2] = getByUuid_PrevAndNext(
				session, acaoJudicialProposta, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AcaoJudicialProposta getByUuid_PrevAndNext(
		Session session, AcaoJudicialProposta acaoJudicialProposta, String uuid,
		OrderByComparator<AcaoJudicialProposta> orderByComparator,
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

		sb.append(_SQL_SELECT_ACAOJUDICIALPROPOSTA_WHERE);

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
			sb.append(AcaoJudicialPropostaModelImpl.ORDER_BY_JPQL);
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
						acaoJudicialProposta)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AcaoJudicialProposta> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acao judicial propostas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (AcaoJudicialProposta acaoJudicialProposta :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(acaoJudicialProposta);
		}
	}

	/**
	 * Returns the number of acao judicial propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acao judicial propostas
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACAOJUDICIALPROPOSTA_WHERE);

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
		"acaoJudicialProposta.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(acaoJudicialProposta.uuid IS NULL OR acaoJudicialProposta.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByPropostaId;
	private FinderPath _finderPathWithoutPaginationFindByPropostaId;
	private FinderPath _finderPathCountByPropostaId;

	/**
	 * Returns all the acao judicial propostas where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching acao judicial propostas
	 */
	@Override
	public List<AcaoJudicialProposta> findByPropostaId(long propostaId) {
		return findByPropostaId(
			propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acao judicial propostas where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @return the range of matching acao judicial propostas
	 */
	@Override
	public List<AcaoJudicialProposta> findByPropostaId(
		long propostaId, int start, int end) {

		return findByPropostaId(propostaId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acao judicial propostas where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acao judicial propostas
	 */
	@Override
	public List<AcaoJudicialProposta> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<AcaoJudicialProposta> orderByComparator) {

		return findByPropostaId(
			propostaId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acao judicial propostas where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acao judicial propostas
	 */
	@Override
	public List<AcaoJudicialProposta> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<AcaoJudicialProposta> orderByComparator,
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

		List<AcaoJudicialProposta> list = null;

		if (useFinderCache) {
			list = (List<AcaoJudicialProposta>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AcaoJudicialProposta acaoJudicialProposta : list) {
					if (propostaId != acaoJudicialProposta.getPropostaId()) {
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

			sb.append(_SQL_SELECT_ACAOJUDICIALPROPOSTA_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AcaoJudicialPropostaModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

				list = (List<AcaoJudicialProposta>)QueryUtil.list(
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
	 * Returns the first acao judicial proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a matching acao judicial proposta could not be found
	 */
	@Override
	public AcaoJudicialProposta findByPropostaId_First(
			long propostaId,
			OrderByComparator<AcaoJudicialProposta> orderByComparator)
		throws NoSuchAcaoJudicialPropostaException {

		AcaoJudicialProposta acaoJudicialProposta = fetchByPropostaId_First(
			propostaId, orderByComparator);

		if (acaoJudicialProposta != null) {
			return acaoJudicialProposta;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchAcaoJudicialPropostaException(sb.toString());
	}

	/**
	 * Returns the first acao judicial proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial proposta, or <code>null</code> if a matching acao judicial proposta could not be found
	 */
	@Override
	public AcaoJudicialProposta fetchByPropostaId_First(
		long propostaId,
		OrderByComparator<AcaoJudicialProposta> orderByComparator) {

		List<AcaoJudicialProposta> list = findByPropostaId(
			propostaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acao judicial proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a matching acao judicial proposta could not be found
	 */
	@Override
	public AcaoJudicialProposta findByPropostaId_Last(
			long propostaId,
			OrderByComparator<AcaoJudicialProposta> orderByComparator)
		throws NoSuchAcaoJudicialPropostaException {

		AcaoJudicialProposta acaoJudicialProposta = fetchByPropostaId_Last(
			propostaId, orderByComparator);

		if (acaoJudicialProposta != null) {
			return acaoJudicialProposta;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchAcaoJudicialPropostaException(sb.toString());
	}

	/**
	 * Returns the last acao judicial proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial proposta, or <code>null</code> if a matching acao judicial proposta could not be found
	 */
	@Override
	public AcaoJudicialProposta fetchByPropostaId_Last(
		long propostaId,
		OrderByComparator<AcaoJudicialProposta> orderByComparator) {

		int count = countByPropostaId(propostaId);

		if (count == 0) {
			return null;
		}

		List<AcaoJudicialProposta> list = findByPropostaId(
			propostaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acao judicial propostas before and after the current acao judicial proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param acaoPropostaId the primary key of the current acao judicial proposta
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a acao judicial proposta with the primary key could not be found
	 */
	@Override
	public AcaoJudicialProposta[] findByPropostaId_PrevAndNext(
			long acaoPropostaId, long propostaId,
			OrderByComparator<AcaoJudicialProposta> orderByComparator)
		throws NoSuchAcaoJudicialPropostaException {

		AcaoJudicialProposta acaoJudicialProposta = findByPrimaryKey(
			acaoPropostaId);

		Session session = null;

		try {
			session = openSession();

			AcaoJudicialProposta[] array = new AcaoJudicialPropostaImpl[3];

			array[0] = getByPropostaId_PrevAndNext(
				session, acaoJudicialProposta, propostaId, orderByComparator,
				true);

			array[1] = acaoJudicialProposta;

			array[2] = getByPropostaId_PrevAndNext(
				session, acaoJudicialProposta, propostaId, orderByComparator,
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

	protected AcaoJudicialProposta getByPropostaId_PrevAndNext(
		Session session, AcaoJudicialProposta acaoJudicialProposta,
		long propostaId,
		OrderByComparator<AcaoJudicialProposta> orderByComparator,
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

		sb.append(_SQL_SELECT_ACAOJUDICIALPROPOSTA_WHERE);

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
			sb.append(AcaoJudicialPropostaModelImpl.ORDER_BY_JPQL);
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
						acaoJudicialProposta)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AcaoJudicialProposta> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acao judicial propostas where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	@Override
	public void removeByPropostaId(long propostaId) {
		for (AcaoJudicialProposta acaoJudicialProposta :
				findByPropostaId(
					propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(acaoJudicialProposta);
		}
	}

	/**
	 * Returns the number of acao judicial propostas where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching acao judicial propostas
	 */
	@Override
	public int countByPropostaId(long propostaId) {
		FinderPath finderPath = _finderPathCountByPropostaId;

		Object[] finderArgs = new Object[] {propostaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACAOJUDICIALPROPOSTA_WHERE);

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
		"acaoJudicialProposta.propostaId = ?";

	public AcaoJudicialPropostaPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AcaoJudicialProposta.class);

		setModelImplClass(AcaoJudicialPropostaImpl.class);
		setModelPKClass(long.class);

		setTable(AcaoJudicialPropostaTable.INSTANCE);
	}

	/**
	 * Caches the acao judicial proposta in the entity cache if it is enabled.
	 *
	 * @param acaoJudicialProposta the acao judicial proposta
	 */
	@Override
	public void cacheResult(AcaoJudicialProposta acaoJudicialProposta) {
		entityCache.putResult(
			AcaoJudicialPropostaImpl.class,
			acaoJudicialProposta.getPrimaryKey(), acaoJudicialProposta);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acao judicial propostas in the entity cache if it is enabled.
	 *
	 * @param acaoJudicialPropostas the acao judicial propostas
	 */
	@Override
	public void cacheResult(List<AcaoJudicialProposta> acaoJudicialPropostas) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acaoJudicialPropostas.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcaoJudicialProposta acaoJudicialProposta :
				acaoJudicialPropostas) {

			if (entityCache.getResult(
					AcaoJudicialPropostaImpl.class,
					acaoJudicialProposta.getPrimaryKey()) == null) {

				cacheResult(acaoJudicialProposta);
			}
		}
	}

	/**
	 * Clears the cache for all acao judicial propostas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcaoJudicialPropostaImpl.class);

		finderCache.clearCache(AcaoJudicialPropostaImpl.class);
	}

	/**
	 * Clears the cache for the acao judicial proposta.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AcaoJudicialProposta acaoJudicialProposta) {
		entityCache.removeResult(
			AcaoJudicialPropostaImpl.class, acaoJudicialProposta);
	}

	@Override
	public void clearCache(List<AcaoJudicialProposta> acaoJudicialPropostas) {
		for (AcaoJudicialProposta acaoJudicialProposta :
				acaoJudicialPropostas) {

			entityCache.removeResult(
				AcaoJudicialPropostaImpl.class, acaoJudicialProposta);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcaoJudicialPropostaImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AcaoJudicialPropostaImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new acao judicial proposta with the primary key. Does not add the acao judicial proposta to the database.
	 *
	 * @param acaoPropostaId the primary key for the new acao judicial proposta
	 * @return the new acao judicial proposta
	 */
	@Override
	public AcaoJudicialProposta create(long acaoPropostaId) {
		AcaoJudicialProposta acaoJudicialProposta =
			new AcaoJudicialPropostaImpl();

		acaoJudicialProposta.setNew(true);
		acaoJudicialProposta.setPrimaryKey(acaoPropostaId);

		String uuid = PortalUUIDUtil.generate();

		acaoJudicialProposta.setUuid(uuid);

		return acaoJudicialProposta;
	}

	/**
	 * Removes the acao judicial proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acaoPropostaId the primary key of the acao judicial proposta
	 * @return the acao judicial proposta that was removed
	 * @throws NoSuchAcaoJudicialPropostaException if a acao judicial proposta with the primary key could not be found
	 */
	@Override
	public AcaoJudicialProposta remove(long acaoPropostaId)
		throws NoSuchAcaoJudicialPropostaException {

		return remove((Serializable)acaoPropostaId);
	}

	/**
	 * Removes the acao judicial proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acao judicial proposta
	 * @return the acao judicial proposta that was removed
	 * @throws NoSuchAcaoJudicialPropostaException if a acao judicial proposta with the primary key could not be found
	 */
	@Override
	public AcaoJudicialProposta remove(Serializable primaryKey)
		throws NoSuchAcaoJudicialPropostaException {

		Session session = null;

		try {
			session = openSession();

			AcaoJudicialProposta acaoJudicialProposta =
				(AcaoJudicialProposta)session.get(
					AcaoJudicialPropostaImpl.class, primaryKey);

			if (acaoJudicialProposta == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcaoJudicialPropostaException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acaoJudicialProposta);
		}
		catch (NoSuchAcaoJudicialPropostaException noSuchEntityException) {
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
	protected AcaoJudicialProposta removeImpl(
		AcaoJudicialProposta acaoJudicialProposta) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acaoJudicialProposta)) {
				acaoJudicialProposta = (AcaoJudicialProposta)session.get(
					AcaoJudicialPropostaImpl.class,
					acaoJudicialProposta.getPrimaryKeyObj());
			}

			if (acaoJudicialProposta != null) {
				session.delete(acaoJudicialProposta);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acaoJudicialProposta != null) {
			clearCache(acaoJudicialProposta);
		}

		return acaoJudicialProposta;
	}

	@Override
	public AcaoJudicialProposta updateImpl(
		AcaoJudicialProposta acaoJudicialProposta) {

		boolean isNew = acaoJudicialProposta.isNew();

		if (!(acaoJudicialProposta instanceof AcaoJudicialPropostaModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acaoJudicialProposta.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acaoJudicialProposta);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acaoJudicialProposta proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcaoJudicialProposta implementation " +
					acaoJudicialProposta.getClass());
		}

		AcaoJudicialPropostaModelImpl acaoJudicialPropostaModelImpl =
			(AcaoJudicialPropostaModelImpl)acaoJudicialProposta;

		if (Validator.isNull(acaoJudicialProposta.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			acaoJudicialProposta.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acaoJudicialProposta);
			}
			else {
				acaoJudicialProposta = (AcaoJudicialProposta)session.merge(
					acaoJudicialProposta);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcaoJudicialPropostaImpl.class, acaoJudicialPropostaModelImpl,
			false, true);

		if (isNew) {
			acaoJudicialProposta.setNew(false);
		}

		acaoJudicialProposta.resetOriginalValues();

		return acaoJudicialProposta;
	}

	/**
	 * Returns the acao judicial proposta with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acao judicial proposta
	 * @return the acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a acao judicial proposta with the primary key could not be found
	 */
	@Override
	public AcaoJudicialProposta findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcaoJudicialPropostaException {

		AcaoJudicialProposta acaoJudicialProposta = fetchByPrimaryKey(
			primaryKey);

		if (acaoJudicialProposta == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcaoJudicialPropostaException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acaoJudicialProposta;
	}

	/**
	 * Returns the acao judicial proposta with the primary key or throws a <code>NoSuchAcaoJudicialPropostaException</code> if it could not be found.
	 *
	 * @param acaoPropostaId the primary key of the acao judicial proposta
	 * @return the acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a acao judicial proposta with the primary key could not be found
	 */
	@Override
	public AcaoJudicialProposta findByPrimaryKey(long acaoPropostaId)
		throws NoSuchAcaoJudicialPropostaException {

		return findByPrimaryKey((Serializable)acaoPropostaId);
	}

	/**
	 * Returns the acao judicial proposta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acaoPropostaId the primary key of the acao judicial proposta
	 * @return the acao judicial proposta, or <code>null</code> if a acao judicial proposta with the primary key could not be found
	 */
	@Override
	public AcaoJudicialProposta fetchByPrimaryKey(long acaoPropostaId) {
		return fetchByPrimaryKey((Serializable)acaoPropostaId);
	}

	/**
	 * Returns all the acao judicial propostas.
	 *
	 * @return the acao judicial propostas
	 */
	@Override
	public List<AcaoJudicialProposta> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acao judicial propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @return the range of acao judicial propostas
	 */
	@Override
	public List<AcaoJudicialProposta> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acao judicial propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acao judicial propostas
	 */
	@Override
	public List<AcaoJudicialProposta> findAll(
		int start, int end,
		OrderByComparator<AcaoJudicialProposta> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acao judicial propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acao judicial propostas
	 */
	@Override
	public List<AcaoJudicialProposta> findAll(
		int start, int end,
		OrderByComparator<AcaoJudicialProposta> orderByComparator,
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

		List<AcaoJudicialProposta> list = null;

		if (useFinderCache) {
			list = (List<AcaoJudicialProposta>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACAOJUDICIALPROPOSTA);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACAOJUDICIALPROPOSTA;

				sql = sql.concat(AcaoJudicialPropostaModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcaoJudicialProposta>)QueryUtil.list(
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
	 * Removes all the acao judicial propostas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcaoJudicialProposta acaoJudicialProposta : findAll()) {
			remove(acaoJudicialProposta);
		}
	}

	/**
	 * Returns the number of acao judicial propostas.
	 *
	 * @return the number of acao judicial propostas
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
					_SQL_COUNT_ACAOJUDICIALPROPOSTA);

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
		return "acaoPropostaId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACAOJUDICIALPROPOSTA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcaoJudicialPropostaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acao judicial proposta persistence.
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

		AcaoJudicialPropostaUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcaoJudicialPropostaUtil.setPersistence(null);

		entityCache.removeCache(AcaoJudicialPropostaImpl.class.getName());
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

	private static final String _SQL_SELECT_ACAOJUDICIALPROPOSTA =
		"SELECT acaoJudicialProposta FROM AcaoJudicialProposta acaoJudicialProposta";

	private static final String _SQL_SELECT_ACAOJUDICIALPROPOSTA_WHERE =
		"SELECT acaoJudicialProposta FROM AcaoJudicialProposta acaoJudicialProposta WHERE ";

	private static final String _SQL_COUNT_ACAOJUDICIALPROPOSTA =
		"SELECT COUNT(acaoJudicialProposta) FROM AcaoJudicialProposta acaoJudicialProposta";

	private static final String _SQL_COUNT_ACAOJUDICIALPROPOSTA_WHERE =
		"SELECT COUNT(acaoJudicialProposta) FROM AcaoJudicialProposta acaoJudicialProposta WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"acaoJudicialProposta.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcaoJudicialProposta exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcaoJudicialProposta exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcaoJudicialPropostaPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}