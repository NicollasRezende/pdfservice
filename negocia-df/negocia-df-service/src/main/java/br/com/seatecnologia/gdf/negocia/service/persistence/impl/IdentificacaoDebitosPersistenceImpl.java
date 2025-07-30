/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchIdentificacaoDebitosException;
import br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos;
import br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitosTable;
import br.com.seatecnologia.gdf.negocia.model.impl.IdentificacaoDebitosImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.IdentificacaoDebitosModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.IdentificacaoDebitosPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.IdentificacaoDebitosUtil;
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
 * The persistence implementation for the identificacao debitos service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = IdentificacaoDebitosPersistence.class)
public class IdentificacaoDebitosPersistenceImpl
	extends BasePersistenceImpl<IdentificacaoDebitos>
	implements IdentificacaoDebitosPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>IdentificacaoDebitosUtil</code> to access the identificacao debitos persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		IdentificacaoDebitosImpl.class.getName();

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
	 * Returns all the identificacao debitoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching identificacao debitoses
	 */
	@Override
	public List<IdentificacaoDebitos> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the identificacao debitoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @return the range of matching identificacao debitoses
	 */
	@Override
	public List<IdentificacaoDebitos> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the identificacao debitoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching identificacao debitoses
	 */
	@Override
	public List<IdentificacaoDebitos> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<IdentificacaoDebitos> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the identificacao debitoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching identificacao debitoses
	 */
	@Override
	public List<IdentificacaoDebitos> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<IdentificacaoDebitos> orderByComparator,
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

		List<IdentificacaoDebitos> list = null;

		if (useFinderCache) {
			list = (List<IdentificacaoDebitos>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (IdentificacaoDebitos identificacaoDebitos : list) {
					if (!uuid.equals(identificacaoDebitos.getUuid())) {
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

			sb.append(_SQL_SELECT_IDENTIFICACAODEBITOS_WHERE);

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
				sb.append(IdentificacaoDebitosModelImpl.ORDER_BY_JPQL);
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

				list = (List<IdentificacaoDebitos>)QueryUtil.list(
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
	 * Returns the first identificacao debitos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a matching identificacao debitos could not be found
	 */
	@Override
	public IdentificacaoDebitos findByUuid_First(
			String uuid,
			OrderByComparator<IdentificacaoDebitos> orderByComparator)
		throws NoSuchIdentificacaoDebitosException {

		IdentificacaoDebitos identificacaoDebitos = fetchByUuid_First(
			uuid, orderByComparator);

		if (identificacaoDebitos != null) {
			return identificacaoDebitos;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchIdentificacaoDebitosException(sb.toString());
	}

	/**
	 * Returns the first identificacao debitos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching identificacao debitos, or <code>null</code> if a matching identificacao debitos could not be found
	 */
	@Override
	public IdentificacaoDebitos fetchByUuid_First(
		String uuid,
		OrderByComparator<IdentificacaoDebitos> orderByComparator) {

		List<IdentificacaoDebitos> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last identificacao debitos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a matching identificacao debitos could not be found
	 */
	@Override
	public IdentificacaoDebitos findByUuid_Last(
			String uuid,
			OrderByComparator<IdentificacaoDebitos> orderByComparator)
		throws NoSuchIdentificacaoDebitosException {

		IdentificacaoDebitos identificacaoDebitos = fetchByUuid_Last(
			uuid, orderByComparator);

		if (identificacaoDebitos != null) {
			return identificacaoDebitos;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchIdentificacaoDebitosException(sb.toString());
	}

	/**
	 * Returns the last identificacao debitos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching identificacao debitos, or <code>null</code> if a matching identificacao debitos could not be found
	 */
	@Override
	public IdentificacaoDebitos fetchByUuid_Last(
		String uuid,
		OrderByComparator<IdentificacaoDebitos> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<IdentificacaoDebitos> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the identificacao debitoses before and after the current identificacao debitos in the ordered set where uuid = &#63;.
	 *
	 * @param identificacaoDebitosId the primary key of the current identificacao debitos
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a identificacao debitos with the primary key could not be found
	 */
	@Override
	public IdentificacaoDebitos[] findByUuid_PrevAndNext(
			long identificacaoDebitosId, String uuid,
			OrderByComparator<IdentificacaoDebitos> orderByComparator)
		throws NoSuchIdentificacaoDebitosException {

		uuid = Objects.toString(uuid, "");

		IdentificacaoDebitos identificacaoDebitos = findByPrimaryKey(
			identificacaoDebitosId);

		Session session = null;

		try {
			session = openSession();

			IdentificacaoDebitos[] array = new IdentificacaoDebitosImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, identificacaoDebitos, uuid, orderByComparator, true);

			array[1] = identificacaoDebitos;

			array[2] = getByUuid_PrevAndNext(
				session, identificacaoDebitos, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected IdentificacaoDebitos getByUuid_PrevAndNext(
		Session session, IdentificacaoDebitos identificacaoDebitos, String uuid,
		OrderByComparator<IdentificacaoDebitos> orderByComparator,
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

		sb.append(_SQL_SELECT_IDENTIFICACAODEBITOS_WHERE);

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
			sb.append(IdentificacaoDebitosModelImpl.ORDER_BY_JPQL);
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
						identificacaoDebitos)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<IdentificacaoDebitos> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the identificacao debitoses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (IdentificacaoDebitos identificacaoDebitos :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(identificacaoDebitos);
		}
	}

	/**
	 * Returns the number of identificacao debitoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching identificacao debitoses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_IDENTIFICACAODEBITOS_WHERE);

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
		"identificacaoDebitos.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(identificacaoDebitos.uuid IS NULL OR identificacaoDebitos.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByFundamentacaoId;
	private FinderPath _finderPathWithoutPaginationFindByFundamentacaoId;
	private FinderPath _finderPathCountByFundamentacaoId;

	/**
	 * Returns all the identificacao debitoses where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @return the matching identificacao debitoses
	 */
	@Override
	public List<IdentificacaoDebitos> findByFundamentacaoId(
		long fundamentacaoId) {

		return findByFundamentacaoId(
			fundamentacaoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the identificacao debitoses where fundamentacaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @return the range of matching identificacao debitoses
	 */
	@Override
	public List<IdentificacaoDebitos> findByFundamentacaoId(
		long fundamentacaoId, int start, int end) {

		return findByFundamentacaoId(fundamentacaoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the identificacao debitoses where fundamentacaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching identificacao debitoses
	 */
	@Override
	public List<IdentificacaoDebitos> findByFundamentacaoId(
		long fundamentacaoId, int start, int end,
		OrderByComparator<IdentificacaoDebitos> orderByComparator) {

		return findByFundamentacaoId(
			fundamentacaoId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the identificacao debitoses where fundamentacaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching identificacao debitoses
	 */
	@Override
	public List<IdentificacaoDebitos> findByFundamentacaoId(
		long fundamentacaoId, int start, int end,
		OrderByComparator<IdentificacaoDebitos> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByFundamentacaoId;
				finderArgs = new Object[] {fundamentacaoId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByFundamentacaoId;
			finderArgs = new Object[] {
				fundamentacaoId, start, end, orderByComparator
			};
		}

		List<IdentificacaoDebitos> list = null;

		if (useFinderCache) {
			list = (List<IdentificacaoDebitos>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (IdentificacaoDebitos identificacaoDebitos : list) {
					if (fundamentacaoId !=
							identificacaoDebitos.getFundamentacaoId()) {

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

			sb.append(_SQL_SELECT_IDENTIFICACAODEBITOS_WHERE);

			sb.append(_FINDER_COLUMN_FUNDAMENTACAOID_FUNDAMENTACAOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(IdentificacaoDebitosModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fundamentacaoId);

				list = (List<IdentificacaoDebitos>)QueryUtil.list(
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
	 * Returns the first identificacao debitos in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a matching identificacao debitos could not be found
	 */
	@Override
	public IdentificacaoDebitos findByFundamentacaoId_First(
			long fundamentacaoId,
			OrderByComparator<IdentificacaoDebitos> orderByComparator)
		throws NoSuchIdentificacaoDebitosException {

		IdentificacaoDebitos identificacaoDebitos =
			fetchByFundamentacaoId_First(fundamentacaoId, orderByComparator);

		if (identificacaoDebitos != null) {
			return identificacaoDebitos;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("fundamentacaoId=");
		sb.append(fundamentacaoId);

		sb.append("}");

		throw new NoSuchIdentificacaoDebitosException(sb.toString());
	}

	/**
	 * Returns the first identificacao debitos in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching identificacao debitos, or <code>null</code> if a matching identificacao debitos could not be found
	 */
	@Override
	public IdentificacaoDebitos fetchByFundamentacaoId_First(
		long fundamentacaoId,
		OrderByComparator<IdentificacaoDebitos> orderByComparator) {

		List<IdentificacaoDebitos> list = findByFundamentacaoId(
			fundamentacaoId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last identificacao debitos in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a matching identificacao debitos could not be found
	 */
	@Override
	public IdentificacaoDebitos findByFundamentacaoId_Last(
			long fundamentacaoId,
			OrderByComparator<IdentificacaoDebitos> orderByComparator)
		throws NoSuchIdentificacaoDebitosException {

		IdentificacaoDebitos identificacaoDebitos = fetchByFundamentacaoId_Last(
			fundamentacaoId, orderByComparator);

		if (identificacaoDebitos != null) {
			return identificacaoDebitos;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("fundamentacaoId=");
		sb.append(fundamentacaoId);

		sb.append("}");

		throw new NoSuchIdentificacaoDebitosException(sb.toString());
	}

	/**
	 * Returns the last identificacao debitos in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching identificacao debitos, or <code>null</code> if a matching identificacao debitos could not be found
	 */
	@Override
	public IdentificacaoDebitos fetchByFundamentacaoId_Last(
		long fundamentacaoId,
		OrderByComparator<IdentificacaoDebitos> orderByComparator) {

		int count = countByFundamentacaoId(fundamentacaoId);

		if (count == 0) {
			return null;
		}

		List<IdentificacaoDebitos> list = findByFundamentacaoId(
			fundamentacaoId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the identificacao debitoses before and after the current identificacao debitos in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param identificacaoDebitosId the primary key of the current identificacao debitos
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a identificacao debitos with the primary key could not be found
	 */
	@Override
	public IdentificacaoDebitos[] findByFundamentacaoId_PrevAndNext(
			long identificacaoDebitosId, long fundamentacaoId,
			OrderByComparator<IdentificacaoDebitos> orderByComparator)
		throws NoSuchIdentificacaoDebitosException {

		IdentificacaoDebitos identificacaoDebitos = findByPrimaryKey(
			identificacaoDebitosId);

		Session session = null;

		try {
			session = openSession();

			IdentificacaoDebitos[] array = new IdentificacaoDebitosImpl[3];

			array[0] = getByFundamentacaoId_PrevAndNext(
				session, identificacaoDebitos, fundamentacaoId,
				orderByComparator, true);

			array[1] = identificacaoDebitos;

			array[2] = getByFundamentacaoId_PrevAndNext(
				session, identificacaoDebitos, fundamentacaoId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected IdentificacaoDebitos getByFundamentacaoId_PrevAndNext(
		Session session, IdentificacaoDebitos identificacaoDebitos,
		long fundamentacaoId,
		OrderByComparator<IdentificacaoDebitos> orderByComparator,
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

		sb.append(_SQL_SELECT_IDENTIFICACAODEBITOS_WHERE);

		sb.append(_FINDER_COLUMN_FUNDAMENTACAOID_FUNDAMENTACAOID_2);

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
			sb.append(IdentificacaoDebitosModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(fundamentacaoId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						identificacaoDebitos)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<IdentificacaoDebitos> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the identificacao debitoses where fundamentacaoId = &#63; from the database.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 */
	@Override
	public void removeByFundamentacaoId(long fundamentacaoId) {
		for (IdentificacaoDebitos identificacaoDebitos :
				findByFundamentacaoId(
					fundamentacaoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(identificacaoDebitos);
		}
	}

	/**
	 * Returns the number of identificacao debitoses where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @return the number of matching identificacao debitoses
	 */
	@Override
	public int countByFundamentacaoId(long fundamentacaoId) {
		FinderPath finderPath = _finderPathCountByFundamentacaoId;

		Object[] finderArgs = new Object[] {fundamentacaoId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_IDENTIFICACAODEBITOS_WHERE);

			sb.append(_FINDER_COLUMN_FUNDAMENTACAOID_FUNDAMENTACAOID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fundamentacaoId);

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

	private static final String
		_FINDER_COLUMN_FUNDAMENTACAOID_FUNDAMENTACAOID_2 =
			"identificacaoDebitos.fundamentacaoId = ?";

	public IdentificacaoDebitosPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(IdentificacaoDebitos.class);

		setModelImplClass(IdentificacaoDebitosImpl.class);
		setModelPKClass(long.class);

		setTable(IdentificacaoDebitosTable.INSTANCE);
	}

	/**
	 * Caches the identificacao debitos in the entity cache if it is enabled.
	 *
	 * @param identificacaoDebitos the identificacao debitos
	 */
	@Override
	public void cacheResult(IdentificacaoDebitos identificacaoDebitos) {
		entityCache.putResult(
			IdentificacaoDebitosImpl.class,
			identificacaoDebitos.getPrimaryKey(), identificacaoDebitos);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the identificacao debitoses in the entity cache if it is enabled.
	 *
	 * @param identificacaoDebitoses the identificacao debitoses
	 */
	@Override
	public void cacheResult(List<IdentificacaoDebitos> identificacaoDebitoses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (identificacaoDebitoses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (IdentificacaoDebitos identificacaoDebitos :
				identificacaoDebitoses) {

			if (entityCache.getResult(
					IdentificacaoDebitosImpl.class,
					identificacaoDebitos.getPrimaryKey()) == null) {

				cacheResult(identificacaoDebitos);
			}
		}
	}

	/**
	 * Clears the cache for all identificacao debitoses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(IdentificacaoDebitosImpl.class);

		finderCache.clearCache(IdentificacaoDebitosImpl.class);
	}

	/**
	 * Clears the cache for the identificacao debitos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(IdentificacaoDebitos identificacaoDebitos) {
		entityCache.removeResult(
			IdentificacaoDebitosImpl.class, identificacaoDebitos);
	}

	@Override
	public void clearCache(List<IdentificacaoDebitos> identificacaoDebitoses) {
		for (IdentificacaoDebitos identificacaoDebitos :
				identificacaoDebitoses) {

			entityCache.removeResult(
				IdentificacaoDebitosImpl.class, identificacaoDebitos);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(IdentificacaoDebitosImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				IdentificacaoDebitosImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new identificacao debitos with the primary key. Does not add the identificacao debitos to the database.
	 *
	 * @param identificacaoDebitosId the primary key for the new identificacao debitos
	 * @return the new identificacao debitos
	 */
	@Override
	public IdentificacaoDebitos create(long identificacaoDebitosId) {
		IdentificacaoDebitos identificacaoDebitos =
			new IdentificacaoDebitosImpl();

		identificacaoDebitos.setNew(true);
		identificacaoDebitos.setPrimaryKey(identificacaoDebitosId);

		String uuid = PortalUUIDUtil.generate();

		identificacaoDebitos.setUuid(uuid);

		return identificacaoDebitos;
	}

	/**
	 * Removes the identificacao debitos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param identificacaoDebitosId the primary key of the identificacao debitos
	 * @return the identificacao debitos that was removed
	 * @throws NoSuchIdentificacaoDebitosException if a identificacao debitos with the primary key could not be found
	 */
	@Override
	public IdentificacaoDebitos remove(long identificacaoDebitosId)
		throws NoSuchIdentificacaoDebitosException {

		return remove((Serializable)identificacaoDebitosId);
	}

	/**
	 * Removes the identificacao debitos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the identificacao debitos
	 * @return the identificacao debitos that was removed
	 * @throws NoSuchIdentificacaoDebitosException if a identificacao debitos with the primary key could not be found
	 */
	@Override
	public IdentificacaoDebitos remove(Serializable primaryKey)
		throws NoSuchIdentificacaoDebitosException {

		Session session = null;

		try {
			session = openSession();

			IdentificacaoDebitos identificacaoDebitos =
				(IdentificacaoDebitos)session.get(
					IdentificacaoDebitosImpl.class, primaryKey);

			if (identificacaoDebitos == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchIdentificacaoDebitosException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(identificacaoDebitos);
		}
		catch (NoSuchIdentificacaoDebitosException noSuchEntityException) {
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
	protected IdentificacaoDebitos removeImpl(
		IdentificacaoDebitos identificacaoDebitos) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(identificacaoDebitos)) {
				identificacaoDebitos = (IdentificacaoDebitos)session.get(
					IdentificacaoDebitosImpl.class,
					identificacaoDebitos.getPrimaryKeyObj());
			}

			if (identificacaoDebitos != null) {
				session.delete(identificacaoDebitos);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (identificacaoDebitos != null) {
			clearCache(identificacaoDebitos);
		}

		return identificacaoDebitos;
	}

	@Override
	public IdentificacaoDebitos updateImpl(
		IdentificacaoDebitos identificacaoDebitos) {

		boolean isNew = identificacaoDebitos.isNew();

		if (!(identificacaoDebitos instanceof IdentificacaoDebitosModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(identificacaoDebitos.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					identificacaoDebitos);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in identificacaoDebitos proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom IdentificacaoDebitos implementation " +
					identificacaoDebitos.getClass());
		}

		IdentificacaoDebitosModelImpl identificacaoDebitosModelImpl =
			(IdentificacaoDebitosModelImpl)identificacaoDebitos;

		if (Validator.isNull(identificacaoDebitos.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			identificacaoDebitos.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(identificacaoDebitos);
			}
			else {
				identificacaoDebitos = (IdentificacaoDebitos)session.merge(
					identificacaoDebitos);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			IdentificacaoDebitosImpl.class, identificacaoDebitosModelImpl,
			false, true);

		if (isNew) {
			identificacaoDebitos.setNew(false);
		}

		identificacaoDebitos.resetOriginalValues();

		return identificacaoDebitos;
	}

	/**
	 * Returns the identificacao debitos with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the identificacao debitos
	 * @return the identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a identificacao debitos with the primary key could not be found
	 */
	@Override
	public IdentificacaoDebitos findByPrimaryKey(Serializable primaryKey)
		throws NoSuchIdentificacaoDebitosException {

		IdentificacaoDebitos identificacaoDebitos = fetchByPrimaryKey(
			primaryKey);

		if (identificacaoDebitos == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchIdentificacaoDebitosException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return identificacaoDebitos;
	}

	/**
	 * Returns the identificacao debitos with the primary key or throws a <code>NoSuchIdentificacaoDebitosException</code> if it could not be found.
	 *
	 * @param identificacaoDebitosId the primary key of the identificacao debitos
	 * @return the identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a identificacao debitos with the primary key could not be found
	 */
	@Override
	public IdentificacaoDebitos findByPrimaryKey(long identificacaoDebitosId)
		throws NoSuchIdentificacaoDebitosException {

		return findByPrimaryKey((Serializable)identificacaoDebitosId);
	}

	/**
	 * Returns the identificacao debitos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param identificacaoDebitosId the primary key of the identificacao debitos
	 * @return the identificacao debitos, or <code>null</code> if a identificacao debitos with the primary key could not be found
	 */
	@Override
	public IdentificacaoDebitos fetchByPrimaryKey(long identificacaoDebitosId) {
		return fetchByPrimaryKey((Serializable)identificacaoDebitosId);
	}

	/**
	 * Returns all the identificacao debitoses.
	 *
	 * @return the identificacao debitoses
	 */
	@Override
	public List<IdentificacaoDebitos> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the identificacao debitoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @return the range of identificacao debitoses
	 */
	@Override
	public List<IdentificacaoDebitos> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the identificacao debitoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of identificacao debitoses
	 */
	@Override
	public List<IdentificacaoDebitos> findAll(
		int start, int end,
		OrderByComparator<IdentificacaoDebitos> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the identificacao debitoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of identificacao debitoses
	 */
	@Override
	public List<IdentificacaoDebitos> findAll(
		int start, int end,
		OrderByComparator<IdentificacaoDebitos> orderByComparator,
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

		List<IdentificacaoDebitos> list = null;

		if (useFinderCache) {
			list = (List<IdentificacaoDebitos>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_IDENTIFICACAODEBITOS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_IDENTIFICACAODEBITOS;

				sql = sql.concat(IdentificacaoDebitosModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<IdentificacaoDebitos>)QueryUtil.list(
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
	 * Removes all the identificacao debitoses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (IdentificacaoDebitos identificacaoDebitos : findAll()) {
			remove(identificacaoDebitos);
		}
	}

	/**
	 * Returns the number of identificacao debitoses.
	 *
	 * @return the number of identificacao debitoses
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
					_SQL_COUNT_IDENTIFICACAODEBITOS);

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
		return "identificacaoDebitosId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_IDENTIFICACAODEBITOS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return IdentificacaoDebitosModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the identificacao debitos persistence.
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

		_finderPathWithPaginationFindByFundamentacaoId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFundamentacaoId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"fundamentacaoId"}, true);

		_finderPathWithoutPaginationFindByFundamentacaoId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFundamentacaoId",
			new String[] {Long.class.getName()},
			new String[] {"fundamentacaoId"}, true);

		_finderPathCountByFundamentacaoId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFundamentacaoId",
			new String[] {Long.class.getName()},
			new String[] {"fundamentacaoId"}, false);

		IdentificacaoDebitosUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		IdentificacaoDebitosUtil.setPersistence(null);

		entityCache.removeCache(IdentificacaoDebitosImpl.class.getName());
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

	private static final String _SQL_SELECT_IDENTIFICACAODEBITOS =
		"SELECT identificacaoDebitos FROM IdentificacaoDebitos identificacaoDebitos";

	private static final String _SQL_SELECT_IDENTIFICACAODEBITOS_WHERE =
		"SELECT identificacaoDebitos FROM IdentificacaoDebitos identificacaoDebitos WHERE ";

	private static final String _SQL_COUNT_IDENTIFICACAODEBITOS =
		"SELECT COUNT(identificacaoDebitos) FROM IdentificacaoDebitos identificacaoDebitos";

	private static final String _SQL_COUNT_IDENTIFICACAODEBITOS_WHERE =
		"SELECT COUNT(identificacaoDebitos) FROM IdentificacaoDebitos identificacaoDebitos WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"identificacaoDebitos.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No IdentificacaoDebitos exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No IdentificacaoDebitos exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		IdentificacaoDebitosPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}