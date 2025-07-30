/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchTermoAssinadoException;
import br.com.seatecnologia.gdf.negocia.model.TermoAssinado;
import br.com.seatecnologia.gdf.negocia.model.TermoAssinadoTable;
import br.com.seatecnologia.gdf.negocia.model.impl.TermoAssinadoImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.TermoAssinadoModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.TermoAssinadoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.TermoAssinadoUtil;
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
 * The persistence implementation for the termo assinado service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TermoAssinadoPersistence.class)
public class TermoAssinadoPersistenceImpl
	extends BasePersistenceImpl<TermoAssinado>
	implements TermoAssinadoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TermoAssinadoUtil</code> to access the termo assinado persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TermoAssinadoImpl.class.getName();

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
	 * Returns all the termo assinados where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching termo assinados
	 */
	@Override
	public List<TermoAssinado> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the termo assinados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @return the range of matching termo assinados
	 */
	@Override
	public List<TermoAssinado> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the termo assinados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching termo assinados
	 */
	@Override
	public List<TermoAssinado> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<TermoAssinado> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the termo assinados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching termo assinados
	 */
	@Override
	public List<TermoAssinado> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<TermoAssinado> orderByComparator,
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

		List<TermoAssinado> list = null;

		if (useFinderCache) {
			list = (List<TermoAssinado>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TermoAssinado termoAssinado : list) {
					if (!uuid.equals(termoAssinado.getUuid())) {
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

			sb.append(_SQL_SELECT_TERMOASSINADO_WHERE);

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
				sb.append(TermoAssinadoModelImpl.ORDER_BY_JPQL);
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

				list = (List<TermoAssinado>)QueryUtil.list(
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
	 * Returns the first termo assinado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching termo assinado
	 * @throws NoSuchTermoAssinadoException if a matching termo assinado could not be found
	 */
	@Override
	public TermoAssinado findByUuid_First(
			String uuid, OrderByComparator<TermoAssinado> orderByComparator)
		throws NoSuchTermoAssinadoException {

		TermoAssinado termoAssinado = fetchByUuid_First(
			uuid, orderByComparator);

		if (termoAssinado != null) {
			return termoAssinado;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchTermoAssinadoException(sb.toString());
	}

	/**
	 * Returns the first termo assinado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching termo assinado, or <code>null</code> if a matching termo assinado could not be found
	 */
	@Override
	public TermoAssinado fetchByUuid_First(
		String uuid, OrderByComparator<TermoAssinado> orderByComparator) {

		List<TermoAssinado> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last termo assinado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching termo assinado
	 * @throws NoSuchTermoAssinadoException if a matching termo assinado could not be found
	 */
	@Override
	public TermoAssinado findByUuid_Last(
			String uuid, OrderByComparator<TermoAssinado> orderByComparator)
		throws NoSuchTermoAssinadoException {

		TermoAssinado termoAssinado = fetchByUuid_Last(uuid, orderByComparator);

		if (termoAssinado != null) {
			return termoAssinado;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchTermoAssinadoException(sb.toString());
	}

	/**
	 * Returns the last termo assinado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching termo assinado, or <code>null</code> if a matching termo assinado could not be found
	 */
	@Override
	public TermoAssinado fetchByUuid_Last(
		String uuid, OrderByComparator<TermoAssinado> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<TermoAssinado> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the termo assinados before and after the current termo assinado in the ordered set where uuid = &#63;.
	 *
	 * @param termoId the primary key of the current termo assinado
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next termo assinado
	 * @throws NoSuchTermoAssinadoException if a termo assinado with the primary key could not be found
	 */
	@Override
	public TermoAssinado[] findByUuid_PrevAndNext(
			long termoId, String uuid,
			OrderByComparator<TermoAssinado> orderByComparator)
		throws NoSuchTermoAssinadoException {

		uuid = Objects.toString(uuid, "");

		TermoAssinado termoAssinado = findByPrimaryKey(termoId);

		Session session = null;

		try {
			session = openSession();

			TermoAssinado[] array = new TermoAssinadoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, termoAssinado, uuid, orderByComparator, true);

			array[1] = termoAssinado;

			array[2] = getByUuid_PrevAndNext(
				session, termoAssinado, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected TermoAssinado getByUuid_PrevAndNext(
		Session session, TermoAssinado termoAssinado, String uuid,
		OrderByComparator<TermoAssinado> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_TERMOASSINADO_WHERE);

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
			sb.append(TermoAssinadoModelImpl.ORDER_BY_JPQL);
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
						termoAssinado)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TermoAssinado> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the termo assinados where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (TermoAssinado termoAssinado :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(termoAssinado);
		}
	}

	/**
	 * Returns the number of termo assinados where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching termo assinados
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TERMOASSINADO_WHERE);

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
		"termoAssinado.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(termoAssinado.uuid IS NULL OR termoAssinado.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByPropostaId;
	private FinderPath _finderPathWithoutPaginationFindByPropostaId;
	private FinderPath _finderPathCountByPropostaId;

	/**
	 * Returns all the termo assinados where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching termo assinados
	 */
	@Override
	public List<TermoAssinado> findByPropostaId(long propostaId) {
		return findByPropostaId(
			propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the termo assinados where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @return the range of matching termo assinados
	 */
	@Override
	public List<TermoAssinado> findByPropostaId(
		long propostaId, int start, int end) {

		return findByPropostaId(propostaId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the termo assinados where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching termo assinados
	 */
	@Override
	public List<TermoAssinado> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<TermoAssinado> orderByComparator) {

		return findByPropostaId(
			propostaId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the termo assinados where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching termo assinados
	 */
	@Override
	public List<TermoAssinado> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<TermoAssinado> orderByComparator,
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

		List<TermoAssinado> list = null;

		if (useFinderCache) {
			list = (List<TermoAssinado>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TermoAssinado termoAssinado : list) {
					if (propostaId != termoAssinado.getPropostaId()) {
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

			sb.append(_SQL_SELECT_TERMOASSINADO_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TermoAssinadoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

				list = (List<TermoAssinado>)QueryUtil.list(
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
	 * Returns the first termo assinado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching termo assinado
	 * @throws NoSuchTermoAssinadoException if a matching termo assinado could not be found
	 */
	@Override
	public TermoAssinado findByPropostaId_First(
			long propostaId, OrderByComparator<TermoAssinado> orderByComparator)
		throws NoSuchTermoAssinadoException {

		TermoAssinado termoAssinado = fetchByPropostaId_First(
			propostaId, orderByComparator);

		if (termoAssinado != null) {
			return termoAssinado;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchTermoAssinadoException(sb.toString());
	}

	/**
	 * Returns the first termo assinado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching termo assinado, or <code>null</code> if a matching termo assinado could not be found
	 */
	@Override
	public TermoAssinado fetchByPropostaId_First(
		long propostaId, OrderByComparator<TermoAssinado> orderByComparator) {

		List<TermoAssinado> list = findByPropostaId(
			propostaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last termo assinado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching termo assinado
	 * @throws NoSuchTermoAssinadoException if a matching termo assinado could not be found
	 */
	@Override
	public TermoAssinado findByPropostaId_Last(
			long propostaId, OrderByComparator<TermoAssinado> orderByComparator)
		throws NoSuchTermoAssinadoException {

		TermoAssinado termoAssinado = fetchByPropostaId_Last(
			propostaId, orderByComparator);

		if (termoAssinado != null) {
			return termoAssinado;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchTermoAssinadoException(sb.toString());
	}

	/**
	 * Returns the last termo assinado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching termo assinado, or <code>null</code> if a matching termo assinado could not be found
	 */
	@Override
	public TermoAssinado fetchByPropostaId_Last(
		long propostaId, OrderByComparator<TermoAssinado> orderByComparator) {

		int count = countByPropostaId(propostaId);

		if (count == 0) {
			return null;
		}

		List<TermoAssinado> list = findByPropostaId(
			propostaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the termo assinados before and after the current termo assinado in the ordered set where propostaId = &#63;.
	 *
	 * @param termoId the primary key of the current termo assinado
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next termo assinado
	 * @throws NoSuchTermoAssinadoException if a termo assinado with the primary key could not be found
	 */
	@Override
	public TermoAssinado[] findByPropostaId_PrevAndNext(
			long termoId, long propostaId,
			OrderByComparator<TermoAssinado> orderByComparator)
		throws NoSuchTermoAssinadoException {

		TermoAssinado termoAssinado = findByPrimaryKey(termoId);

		Session session = null;

		try {
			session = openSession();

			TermoAssinado[] array = new TermoAssinadoImpl[3];

			array[0] = getByPropostaId_PrevAndNext(
				session, termoAssinado, propostaId, orderByComparator, true);

			array[1] = termoAssinado;

			array[2] = getByPropostaId_PrevAndNext(
				session, termoAssinado, propostaId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected TermoAssinado getByPropostaId_PrevAndNext(
		Session session, TermoAssinado termoAssinado, long propostaId,
		OrderByComparator<TermoAssinado> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_TERMOASSINADO_WHERE);

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
			sb.append(TermoAssinadoModelImpl.ORDER_BY_JPQL);
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
						termoAssinado)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TermoAssinado> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the termo assinados where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	@Override
	public void removeByPropostaId(long propostaId) {
		for (TermoAssinado termoAssinado :
				findByPropostaId(
					propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(termoAssinado);
		}
	}

	/**
	 * Returns the number of termo assinados where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching termo assinados
	 */
	@Override
	public int countByPropostaId(long propostaId) {
		FinderPath finderPath = _finderPathCountByPropostaId;

		Object[] finderArgs = new Object[] {propostaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TERMOASSINADO_WHERE);

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
		"termoAssinado.propostaId = ?";

	public TermoAssinadoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(TermoAssinado.class);

		setModelImplClass(TermoAssinadoImpl.class);
		setModelPKClass(long.class);

		setTable(TermoAssinadoTable.INSTANCE);
	}

	/**
	 * Caches the termo assinado in the entity cache if it is enabled.
	 *
	 * @param termoAssinado the termo assinado
	 */
	@Override
	public void cacheResult(TermoAssinado termoAssinado) {
		entityCache.putResult(
			TermoAssinadoImpl.class, termoAssinado.getPrimaryKey(),
			termoAssinado);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the termo assinados in the entity cache if it is enabled.
	 *
	 * @param termoAssinados the termo assinados
	 */
	@Override
	public void cacheResult(List<TermoAssinado> termoAssinados) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (termoAssinados.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TermoAssinado termoAssinado : termoAssinados) {
			if (entityCache.getResult(
					TermoAssinadoImpl.class, termoAssinado.getPrimaryKey()) ==
						null) {

				cacheResult(termoAssinado);
			}
		}
	}

	/**
	 * Clears the cache for all termo assinados.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TermoAssinadoImpl.class);

		finderCache.clearCache(TermoAssinadoImpl.class);
	}

	/**
	 * Clears the cache for the termo assinado.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TermoAssinado termoAssinado) {
		entityCache.removeResult(TermoAssinadoImpl.class, termoAssinado);
	}

	@Override
	public void clearCache(List<TermoAssinado> termoAssinados) {
		for (TermoAssinado termoAssinado : termoAssinados) {
			entityCache.removeResult(TermoAssinadoImpl.class, termoAssinado);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TermoAssinadoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(TermoAssinadoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new termo assinado with the primary key. Does not add the termo assinado to the database.
	 *
	 * @param termoId the primary key for the new termo assinado
	 * @return the new termo assinado
	 */
	@Override
	public TermoAssinado create(long termoId) {
		TermoAssinado termoAssinado = new TermoAssinadoImpl();

		termoAssinado.setNew(true);
		termoAssinado.setPrimaryKey(termoId);

		String uuid = PortalUUIDUtil.generate();

		termoAssinado.setUuid(uuid);

		return termoAssinado;
	}

	/**
	 * Removes the termo assinado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param termoId the primary key of the termo assinado
	 * @return the termo assinado that was removed
	 * @throws NoSuchTermoAssinadoException if a termo assinado with the primary key could not be found
	 */
	@Override
	public TermoAssinado remove(long termoId)
		throws NoSuchTermoAssinadoException {

		return remove((Serializable)termoId);
	}

	/**
	 * Removes the termo assinado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the termo assinado
	 * @return the termo assinado that was removed
	 * @throws NoSuchTermoAssinadoException if a termo assinado with the primary key could not be found
	 */
	@Override
	public TermoAssinado remove(Serializable primaryKey)
		throws NoSuchTermoAssinadoException {

		Session session = null;

		try {
			session = openSession();

			TermoAssinado termoAssinado = (TermoAssinado)session.get(
				TermoAssinadoImpl.class, primaryKey);

			if (termoAssinado == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTermoAssinadoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(termoAssinado);
		}
		catch (NoSuchTermoAssinadoException noSuchEntityException) {
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
	protected TermoAssinado removeImpl(TermoAssinado termoAssinado) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(termoAssinado)) {
				termoAssinado = (TermoAssinado)session.get(
					TermoAssinadoImpl.class, termoAssinado.getPrimaryKeyObj());
			}

			if (termoAssinado != null) {
				session.delete(termoAssinado);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (termoAssinado != null) {
			clearCache(termoAssinado);
		}

		return termoAssinado;
	}

	@Override
	public TermoAssinado updateImpl(TermoAssinado termoAssinado) {
		boolean isNew = termoAssinado.isNew();

		if (!(termoAssinado instanceof TermoAssinadoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(termoAssinado.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					termoAssinado);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in termoAssinado proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TermoAssinado implementation " +
					termoAssinado.getClass());
		}

		TermoAssinadoModelImpl termoAssinadoModelImpl =
			(TermoAssinadoModelImpl)termoAssinado;

		if (Validator.isNull(termoAssinado.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			termoAssinado.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(termoAssinado);
			}
			else {
				termoAssinado = (TermoAssinado)session.merge(termoAssinado);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TermoAssinadoImpl.class, termoAssinadoModelImpl, false, true);

		if (isNew) {
			termoAssinado.setNew(false);
		}

		termoAssinado.resetOriginalValues();

		return termoAssinado;
	}

	/**
	 * Returns the termo assinado with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the termo assinado
	 * @return the termo assinado
	 * @throws NoSuchTermoAssinadoException if a termo assinado with the primary key could not be found
	 */
	@Override
	public TermoAssinado findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTermoAssinadoException {

		TermoAssinado termoAssinado = fetchByPrimaryKey(primaryKey);

		if (termoAssinado == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTermoAssinadoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return termoAssinado;
	}

	/**
	 * Returns the termo assinado with the primary key or throws a <code>NoSuchTermoAssinadoException</code> if it could not be found.
	 *
	 * @param termoId the primary key of the termo assinado
	 * @return the termo assinado
	 * @throws NoSuchTermoAssinadoException if a termo assinado with the primary key could not be found
	 */
	@Override
	public TermoAssinado findByPrimaryKey(long termoId)
		throws NoSuchTermoAssinadoException {

		return findByPrimaryKey((Serializable)termoId);
	}

	/**
	 * Returns the termo assinado with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param termoId the primary key of the termo assinado
	 * @return the termo assinado, or <code>null</code> if a termo assinado with the primary key could not be found
	 */
	@Override
	public TermoAssinado fetchByPrimaryKey(long termoId) {
		return fetchByPrimaryKey((Serializable)termoId);
	}

	/**
	 * Returns all the termo assinados.
	 *
	 * @return the termo assinados
	 */
	@Override
	public List<TermoAssinado> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the termo assinados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @return the range of termo assinados
	 */
	@Override
	public List<TermoAssinado> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the termo assinados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of termo assinados
	 */
	@Override
	public List<TermoAssinado> findAll(
		int start, int end,
		OrderByComparator<TermoAssinado> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the termo assinados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of termo assinados
	 */
	@Override
	public List<TermoAssinado> findAll(
		int start, int end, OrderByComparator<TermoAssinado> orderByComparator,
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

		List<TermoAssinado> list = null;

		if (useFinderCache) {
			list = (List<TermoAssinado>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TERMOASSINADO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TERMOASSINADO;

				sql = sql.concat(TermoAssinadoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TermoAssinado>)QueryUtil.list(
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
	 * Removes all the termo assinados from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TermoAssinado termoAssinado : findAll()) {
			remove(termoAssinado);
		}
	}

	/**
	 * Returns the number of termo assinados.
	 *
	 * @return the number of termo assinados
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_TERMOASSINADO);

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
		return "termoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TERMOASSINADO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TermoAssinadoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the termo assinado persistence.
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

		TermoAssinadoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TermoAssinadoUtil.setPersistence(null);

		entityCache.removeCache(TermoAssinadoImpl.class.getName());
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

	private static final String _SQL_SELECT_TERMOASSINADO =
		"SELECT termoAssinado FROM TermoAssinado termoAssinado";

	private static final String _SQL_SELECT_TERMOASSINADO_WHERE =
		"SELECT termoAssinado FROM TermoAssinado termoAssinado WHERE ";

	private static final String _SQL_COUNT_TERMOASSINADO =
		"SELECT COUNT(termoAssinado) FROM TermoAssinado termoAssinado";

	private static final String _SQL_COUNT_TERMOASSINADO_WHERE =
		"SELECT COUNT(termoAssinado) FROM TermoAssinado termoAssinado WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "termoAssinado.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TermoAssinado exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TermoAssinado exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TermoAssinadoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}