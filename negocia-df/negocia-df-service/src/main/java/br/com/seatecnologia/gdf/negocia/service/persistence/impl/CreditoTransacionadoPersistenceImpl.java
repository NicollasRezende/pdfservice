/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchCreditoTransacionadoException;
import br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado;
import br.com.seatecnologia.gdf.negocia.model.CreditoTransacionadoTable;
import br.com.seatecnologia.gdf.negocia.model.impl.CreditoTransacionadoImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.CreditoTransacionadoModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.CreditoTransacionadoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.CreditoTransacionadoUtil;
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
 * The persistence implementation for the credito transacionado service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreditoTransacionadoPersistence.class)
public class CreditoTransacionadoPersistenceImpl
	extends BasePersistenceImpl<CreditoTransacionado>
	implements CreditoTransacionadoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreditoTransacionadoUtil</code> to access the credito transacionado persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreditoTransacionadoImpl.class.getName();

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
	 * Returns all the credito transacionados where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching credito transacionados
	 */
	@Override
	public List<CreditoTransacionado> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the credito transacionados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @return the range of matching credito transacionados
	 */
	@Override
	public List<CreditoTransacionado> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the credito transacionados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching credito transacionados
	 */
	@Override
	public List<CreditoTransacionado> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CreditoTransacionado> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the credito transacionados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching credito transacionados
	 */
	@Override
	public List<CreditoTransacionado> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CreditoTransacionado> orderByComparator,
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

		List<CreditoTransacionado> list = null;

		if (useFinderCache) {
			list = (List<CreditoTransacionado>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreditoTransacionado creditoTransacionado : list) {
					if (!uuid.equals(creditoTransacionado.getUuid())) {
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

			sb.append(_SQL_SELECT_CREDITOTRANSACIONADO_WHERE);

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
				sb.append(CreditoTransacionadoModelImpl.ORDER_BY_JPQL);
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

				list = (List<CreditoTransacionado>)QueryUtil.list(
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
	 * Returns the first credito transacionado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a matching credito transacionado could not be found
	 */
	@Override
	public CreditoTransacionado findByUuid_First(
			String uuid,
			OrderByComparator<CreditoTransacionado> orderByComparator)
		throws NoSuchCreditoTransacionadoException {

		CreditoTransacionado creditoTransacionado = fetchByUuid_First(
			uuid, orderByComparator);

		if (creditoTransacionado != null) {
			return creditoTransacionado;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCreditoTransacionadoException(sb.toString());
	}

	/**
	 * Returns the first credito transacionado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credito transacionado, or <code>null</code> if a matching credito transacionado could not be found
	 */
	@Override
	public CreditoTransacionado fetchByUuid_First(
		String uuid,
		OrderByComparator<CreditoTransacionado> orderByComparator) {

		List<CreditoTransacionado> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last credito transacionado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a matching credito transacionado could not be found
	 */
	@Override
	public CreditoTransacionado findByUuid_Last(
			String uuid,
			OrderByComparator<CreditoTransacionado> orderByComparator)
		throws NoSuchCreditoTransacionadoException {

		CreditoTransacionado creditoTransacionado = fetchByUuid_Last(
			uuid, orderByComparator);

		if (creditoTransacionado != null) {
			return creditoTransacionado;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCreditoTransacionadoException(sb.toString());
	}

	/**
	 * Returns the last credito transacionado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credito transacionado, or <code>null</code> if a matching credito transacionado could not be found
	 */
	@Override
	public CreditoTransacionado fetchByUuid_Last(
		String uuid,
		OrderByComparator<CreditoTransacionado> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CreditoTransacionado> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the credito transacionados before and after the current credito transacionado in the ordered set where uuid = &#63;.
	 *
	 * @param creditoId the primary key of the current credito transacionado
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a credito transacionado with the primary key could not be found
	 */
	@Override
	public CreditoTransacionado[] findByUuid_PrevAndNext(
			long creditoId, String uuid,
			OrderByComparator<CreditoTransacionado> orderByComparator)
		throws NoSuchCreditoTransacionadoException {

		uuid = Objects.toString(uuid, "");

		CreditoTransacionado creditoTransacionado = findByPrimaryKey(creditoId);

		Session session = null;

		try {
			session = openSession();

			CreditoTransacionado[] array = new CreditoTransacionadoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, creditoTransacionado, uuid, orderByComparator, true);

			array[1] = creditoTransacionado;

			array[2] = getByUuid_PrevAndNext(
				session, creditoTransacionado, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CreditoTransacionado getByUuid_PrevAndNext(
		Session session, CreditoTransacionado creditoTransacionado, String uuid,
		OrderByComparator<CreditoTransacionado> orderByComparator,
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

		sb.append(_SQL_SELECT_CREDITOTRANSACIONADO_WHERE);

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
			sb.append(CreditoTransacionadoModelImpl.ORDER_BY_JPQL);
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
						creditoTransacionado)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreditoTransacionado> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the credito transacionados where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CreditoTransacionado creditoTransacionado :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(creditoTransacionado);
		}
	}

	/**
	 * Returns the number of credito transacionados where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching credito transacionados
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREDITOTRANSACIONADO_WHERE);

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
		"creditoTransacionado.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(creditoTransacionado.uuid IS NULL OR creditoTransacionado.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByPropostaId;
	private FinderPath _finderPathWithoutPaginationFindByPropostaId;
	private FinderPath _finderPathCountByPropostaId;

	/**
	 * Returns all the credito transacionados where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching credito transacionados
	 */
	@Override
	public List<CreditoTransacionado> findByPropostaId(long propostaId) {
		return findByPropostaId(
			propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the credito transacionados where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @return the range of matching credito transacionados
	 */
	@Override
	public List<CreditoTransacionado> findByPropostaId(
		long propostaId, int start, int end) {

		return findByPropostaId(propostaId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the credito transacionados where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching credito transacionados
	 */
	@Override
	public List<CreditoTransacionado> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<CreditoTransacionado> orderByComparator) {

		return findByPropostaId(
			propostaId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the credito transacionados where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching credito transacionados
	 */
	@Override
	public List<CreditoTransacionado> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<CreditoTransacionado> orderByComparator,
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

		List<CreditoTransacionado> list = null;

		if (useFinderCache) {
			list = (List<CreditoTransacionado>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreditoTransacionado creditoTransacionado : list) {
					if (propostaId != creditoTransacionado.getPropostaId()) {
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

			sb.append(_SQL_SELECT_CREDITOTRANSACIONADO_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CreditoTransacionadoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

				list = (List<CreditoTransacionado>)QueryUtil.list(
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
	 * Returns the first credito transacionado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a matching credito transacionado could not be found
	 */
	@Override
	public CreditoTransacionado findByPropostaId_First(
			long propostaId,
			OrderByComparator<CreditoTransacionado> orderByComparator)
		throws NoSuchCreditoTransacionadoException {

		CreditoTransacionado creditoTransacionado = fetchByPropostaId_First(
			propostaId, orderByComparator);

		if (creditoTransacionado != null) {
			return creditoTransacionado;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchCreditoTransacionadoException(sb.toString());
	}

	/**
	 * Returns the first credito transacionado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credito transacionado, or <code>null</code> if a matching credito transacionado could not be found
	 */
	@Override
	public CreditoTransacionado fetchByPropostaId_First(
		long propostaId,
		OrderByComparator<CreditoTransacionado> orderByComparator) {

		List<CreditoTransacionado> list = findByPropostaId(
			propostaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last credito transacionado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a matching credito transacionado could not be found
	 */
	@Override
	public CreditoTransacionado findByPropostaId_Last(
			long propostaId,
			OrderByComparator<CreditoTransacionado> orderByComparator)
		throws NoSuchCreditoTransacionadoException {

		CreditoTransacionado creditoTransacionado = fetchByPropostaId_Last(
			propostaId, orderByComparator);

		if (creditoTransacionado != null) {
			return creditoTransacionado;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchCreditoTransacionadoException(sb.toString());
	}

	/**
	 * Returns the last credito transacionado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credito transacionado, or <code>null</code> if a matching credito transacionado could not be found
	 */
	@Override
	public CreditoTransacionado fetchByPropostaId_Last(
		long propostaId,
		OrderByComparator<CreditoTransacionado> orderByComparator) {

		int count = countByPropostaId(propostaId);

		if (count == 0) {
			return null;
		}

		List<CreditoTransacionado> list = findByPropostaId(
			propostaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the credito transacionados before and after the current credito transacionado in the ordered set where propostaId = &#63;.
	 *
	 * @param creditoId the primary key of the current credito transacionado
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a credito transacionado with the primary key could not be found
	 */
	@Override
	public CreditoTransacionado[] findByPropostaId_PrevAndNext(
			long creditoId, long propostaId,
			OrderByComparator<CreditoTransacionado> orderByComparator)
		throws NoSuchCreditoTransacionadoException {

		CreditoTransacionado creditoTransacionado = findByPrimaryKey(creditoId);

		Session session = null;

		try {
			session = openSession();

			CreditoTransacionado[] array = new CreditoTransacionadoImpl[3];

			array[0] = getByPropostaId_PrevAndNext(
				session, creditoTransacionado, propostaId, orderByComparator,
				true);

			array[1] = creditoTransacionado;

			array[2] = getByPropostaId_PrevAndNext(
				session, creditoTransacionado, propostaId, orderByComparator,
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

	protected CreditoTransacionado getByPropostaId_PrevAndNext(
		Session session, CreditoTransacionado creditoTransacionado,
		long propostaId,
		OrderByComparator<CreditoTransacionado> orderByComparator,
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

		sb.append(_SQL_SELECT_CREDITOTRANSACIONADO_WHERE);

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
			sb.append(CreditoTransacionadoModelImpl.ORDER_BY_JPQL);
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
						creditoTransacionado)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreditoTransacionado> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the credito transacionados where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	@Override
	public void removeByPropostaId(long propostaId) {
		for (CreditoTransacionado creditoTransacionado :
				findByPropostaId(
					propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(creditoTransacionado);
		}
	}

	/**
	 * Returns the number of credito transacionados where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching credito transacionados
	 */
	@Override
	public int countByPropostaId(long propostaId) {
		FinderPath finderPath = _finderPathCountByPropostaId;

		Object[] finderArgs = new Object[] {propostaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREDITOTRANSACIONADO_WHERE);

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
		"creditoTransacionado.propostaId = ?";

	public CreditoTransacionadoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(CreditoTransacionado.class);

		setModelImplClass(CreditoTransacionadoImpl.class);
		setModelPKClass(long.class);

		setTable(CreditoTransacionadoTable.INSTANCE);
	}

	/**
	 * Caches the credito transacionado in the entity cache if it is enabled.
	 *
	 * @param creditoTransacionado the credito transacionado
	 */
	@Override
	public void cacheResult(CreditoTransacionado creditoTransacionado) {
		entityCache.putResult(
			CreditoTransacionadoImpl.class,
			creditoTransacionado.getPrimaryKey(), creditoTransacionado);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the credito transacionados in the entity cache if it is enabled.
	 *
	 * @param creditoTransacionados the credito transacionados
	 */
	@Override
	public void cacheResult(List<CreditoTransacionado> creditoTransacionados) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creditoTransacionados.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreditoTransacionado creditoTransacionado :
				creditoTransacionados) {

			if (entityCache.getResult(
					CreditoTransacionadoImpl.class,
					creditoTransacionado.getPrimaryKey()) == null) {

				cacheResult(creditoTransacionado);
			}
		}
	}

	/**
	 * Clears the cache for all credito transacionados.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreditoTransacionadoImpl.class);

		finderCache.clearCache(CreditoTransacionadoImpl.class);
	}

	/**
	 * Clears the cache for the credito transacionado.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CreditoTransacionado creditoTransacionado) {
		entityCache.removeResult(
			CreditoTransacionadoImpl.class, creditoTransacionado);
	}

	@Override
	public void clearCache(List<CreditoTransacionado> creditoTransacionados) {
		for (CreditoTransacionado creditoTransacionado :
				creditoTransacionados) {

			entityCache.removeResult(
				CreditoTransacionadoImpl.class, creditoTransacionado);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreditoTransacionadoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CreditoTransacionadoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new credito transacionado with the primary key. Does not add the credito transacionado to the database.
	 *
	 * @param creditoId the primary key for the new credito transacionado
	 * @return the new credito transacionado
	 */
	@Override
	public CreditoTransacionado create(long creditoId) {
		CreditoTransacionado creditoTransacionado =
			new CreditoTransacionadoImpl();

		creditoTransacionado.setNew(true);
		creditoTransacionado.setPrimaryKey(creditoId);

		String uuid = PortalUUIDUtil.generate();

		creditoTransacionado.setUuid(uuid);

		return creditoTransacionado;
	}

	/**
	 * Removes the credito transacionado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creditoId the primary key of the credito transacionado
	 * @return the credito transacionado that was removed
	 * @throws NoSuchCreditoTransacionadoException if a credito transacionado with the primary key could not be found
	 */
	@Override
	public CreditoTransacionado remove(long creditoId)
		throws NoSuchCreditoTransacionadoException {

		return remove((Serializable)creditoId);
	}

	/**
	 * Removes the credito transacionado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the credito transacionado
	 * @return the credito transacionado that was removed
	 * @throws NoSuchCreditoTransacionadoException if a credito transacionado with the primary key could not be found
	 */
	@Override
	public CreditoTransacionado remove(Serializable primaryKey)
		throws NoSuchCreditoTransacionadoException {

		Session session = null;

		try {
			session = openSession();

			CreditoTransacionado creditoTransacionado =
				(CreditoTransacionado)session.get(
					CreditoTransacionadoImpl.class, primaryKey);

			if (creditoTransacionado == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreditoTransacionadoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creditoTransacionado);
		}
		catch (NoSuchCreditoTransacionadoException noSuchEntityException) {
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
	protected CreditoTransacionado removeImpl(
		CreditoTransacionado creditoTransacionado) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creditoTransacionado)) {
				creditoTransacionado = (CreditoTransacionado)session.get(
					CreditoTransacionadoImpl.class,
					creditoTransacionado.getPrimaryKeyObj());
			}

			if (creditoTransacionado != null) {
				session.delete(creditoTransacionado);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creditoTransacionado != null) {
			clearCache(creditoTransacionado);
		}

		return creditoTransacionado;
	}

	@Override
	public CreditoTransacionado updateImpl(
		CreditoTransacionado creditoTransacionado) {

		boolean isNew = creditoTransacionado.isNew();

		if (!(creditoTransacionado instanceof CreditoTransacionadoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(creditoTransacionado.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					creditoTransacionado);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creditoTransacionado proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreditoTransacionado implementation " +
					creditoTransacionado.getClass());
		}

		CreditoTransacionadoModelImpl creditoTransacionadoModelImpl =
			(CreditoTransacionadoModelImpl)creditoTransacionado;

		if (Validator.isNull(creditoTransacionado.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			creditoTransacionado.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creditoTransacionado);
			}
			else {
				creditoTransacionado = (CreditoTransacionado)session.merge(
					creditoTransacionado);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreditoTransacionadoImpl.class, creditoTransacionadoModelImpl,
			false, true);

		if (isNew) {
			creditoTransacionado.setNew(false);
		}

		creditoTransacionado.resetOriginalValues();

		return creditoTransacionado;
	}

	/**
	 * Returns the credito transacionado with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the credito transacionado
	 * @return the credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a credito transacionado with the primary key could not be found
	 */
	@Override
	public CreditoTransacionado findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCreditoTransacionadoException {

		CreditoTransacionado creditoTransacionado = fetchByPrimaryKey(
			primaryKey);

		if (creditoTransacionado == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreditoTransacionadoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creditoTransacionado;
	}

	/**
	 * Returns the credito transacionado with the primary key or throws a <code>NoSuchCreditoTransacionadoException</code> if it could not be found.
	 *
	 * @param creditoId the primary key of the credito transacionado
	 * @return the credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a credito transacionado with the primary key could not be found
	 */
	@Override
	public CreditoTransacionado findByPrimaryKey(long creditoId)
		throws NoSuchCreditoTransacionadoException {

		return findByPrimaryKey((Serializable)creditoId);
	}

	/**
	 * Returns the credito transacionado with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creditoId the primary key of the credito transacionado
	 * @return the credito transacionado, or <code>null</code> if a credito transacionado with the primary key could not be found
	 */
	@Override
	public CreditoTransacionado fetchByPrimaryKey(long creditoId) {
		return fetchByPrimaryKey((Serializable)creditoId);
	}

	/**
	 * Returns all the credito transacionados.
	 *
	 * @return the credito transacionados
	 */
	@Override
	public List<CreditoTransacionado> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the credito transacionados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @return the range of credito transacionados
	 */
	@Override
	public List<CreditoTransacionado> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the credito transacionados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of credito transacionados
	 */
	@Override
	public List<CreditoTransacionado> findAll(
		int start, int end,
		OrderByComparator<CreditoTransacionado> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the credito transacionados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of credito transacionados
	 */
	@Override
	public List<CreditoTransacionado> findAll(
		int start, int end,
		OrderByComparator<CreditoTransacionado> orderByComparator,
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

		List<CreditoTransacionado> list = null;

		if (useFinderCache) {
			list = (List<CreditoTransacionado>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREDITOTRANSACIONADO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREDITOTRANSACIONADO;

				sql = sql.concat(CreditoTransacionadoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CreditoTransacionado>)QueryUtil.list(
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
	 * Removes all the credito transacionados from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreditoTransacionado creditoTransacionado : findAll()) {
			remove(creditoTransacionado);
		}
	}

	/**
	 * Returns the number of credito transacionados.
	 *
	 * @return the number of credito transacionados
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
					_SQL_COUNT_CREDITOTRANSACIONADO);

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
		return "creditoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREDITOTRANSACIONADO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreditoTransacionadoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the credito transacionado persistence.
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

		CreditoTransacionadoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreditoTransacionadoUtil.setPersistence(null);

		entityCache.removeCache(CreditoTransacionadoImpl.class.getName());
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

	private static final String _SQL_SELECT_CREDITOTRANSACIONADO =
		"SELECT creditoTransacionado FROM CreditoTransacionado creditoTransacionado";

	private static final String _SQL_SELECT_CREDITOTRANSACIONADO_WHERE =
		"SELECT creditoTransacionado FROM CreditoTransacionado creditoTransacionado WHERE ";

	private static final String _SQL_COUNT_CREDITOTRANSACIONADO =
		"SELECT COUNT(creditoTransacionado) FROM CreditoTransacionado creditoTransacionado";

	private static final String _SQL_COUNT_CREDITOTRANSACIONADO_WHERE =
		"SELECT COUNT(creditoTransacionado) FROM CreditoTransacionado creditoTransacionado WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"creditoTransacionado.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreditoTransacionado exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreditoTransacionado exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreditoTransacionadoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}