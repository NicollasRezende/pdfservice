/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDadosRegistroException;
import br.com.seatecnologia.gdf.negocia.model.DadosRegistro;
import br.com.seatecnologia.gdf.negocia.model.DadosRegistroTable;
import br.com.seatecnologia.gdf.negocia.model.impl.DadosRegistroImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.DadosRegistroModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.DadosRegistroPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DadosRegistroUtil;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
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
 * The persistence implementation for the dados registro service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = DadosRegistroPersistence.class)
public class DadosRegistroPersistenceImpl
	extends BasePersistenceImpl<DadosRegistro>
	implements DadosRegistroPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DadosRegistroUtil</code> to access the dados registro persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DadosRegistroImpl.class.getName();

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
	 * Returns all the dados registros where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching dados registros
	 */
	@Override
	public List<DadosRegistro> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dados registros where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @return the range of matching dados registros
	 */
	@Override
	public List<DadosRegistro> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dados registros where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dados registros
	 */
	@Override
	public List<DadosRegistro> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DadosRegistro> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dados registros where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dados registros
	 */
	@Override
	public List<DadosRegistro> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DadosRegistro> orderByComparator,
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

		List<DadosRegistro> list = null;

		if (useFinderCache) {
			list = (List<DadosRegistro>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DadosRegistro dadosRegistro : list) {
					if (!uuid.equals(dadosRegistro.getUuid())) {
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

			sb.append(_SQL_SELECT_DADOSREGISTRO_WHERE);

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
				sb.append(DadosRegistroModelImpl.ORDER_BY_JPQL);
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

				list = (List<DadosRegistro>)QueryUtil.list(
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
	 * Returns the first dados registro in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados registro
	 * @throws NoSuchDadosRegistroException if a matching dados registro could not be found
	 */
	@Override
	public DadosRegistro findByUuid_First(
			String uuid, OrderByComparator<DadosRegistro> orderByComparator)
		throws NoSuchDadosRegistroException {

		DadosRegistro dadosRegistro = fetchByUuid_First(
			uuid, orderByComparator);

		if (dadosRegistro != null) {
			return dadosRegistro;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDadosRegistroException(sb.toString());
	}

	/**
	 * Returns the first dados registro in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados registro, or <code>null</code> if a matching dados registro could not be found
	 */
	@Override
	public DadosRegistro fetchByUuid_First(
		String uuid, OrderByComparator<DadosRegistro> orderByComparator) {

		List<DadosRegistro> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dados registro in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados registro
	 * @throws NoSuchDadosRegistroException if a matching dados registro could not be found
	 */
	@Override
	public DadosRegistro findByUuid_Last(
			String uuid, OrderByComparator<DadosRegistro> orderByComparator)
		throws NoSuchDadosRegistroException {

		DadosRegistro dadosRegistro = fetchByUuid_Last(uuid, orderByComparator);

		if (dadosRegistro != null) {
			return dadosRegistro;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDadosRegistroException(sb.toString());
	}

	/**
	 * Returns the last dados registro in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados registro, or <code>null</code> if a matching dados registro could not be found
	 */
	@Override
	public DadosRegistro fetchByUuid_Last(
		String uuid, OrderByComparator<DadosRegistro> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<DadosRegistro> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dados registros before and after the current dados registro in the ordered set where uuid = &#63;.
	 *
	 * @param dadosRegistroId the primary key of the current dados registro
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dados registro
	 * @throws NoSuchDadosRegistroException if a dados registro with the primary key could not be found
	 */
	@Override
	public DadosRegistro[] findByUuid_PrevAndNext(
			long dadosRegistroId, String uuid,
			OrderByComparator<DadosRegistro> orderByComparator)
		throws NoSuchDadosRegistroException {

		uuid = Objects.toString(uuid, "");

		DadosRegistro dadosRegistro = findByPrimaryKey(dadosRegistroId);

		Session session = null;

		try {
			session = openSession();

			DadosRegistro[] array = new DadosRegistroImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, dadosRegistro, uuid, orderByComparator, true);

			array[1] = dadosRegistro;

			array[2] = getByUuid_PrevAndNext(
				session, dadosRegistro, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected DadosRegistro getByUuid_PrevAndNext(
		Session session, DadosRegistro dadosRegistro, String uuid,
		OrderByComparator<DadosRegistro> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_DADOSREGISTRO_WHERE);

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
			sb.append(DadosRegistroModelImpl.ORDER_BY_JPQL);
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
						dadosRegistro)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DadosRegistro> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dados registros where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (DadosRegistro dadosRegistro :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(dadosRegistro);
		}
	}

	/**
	 * Returns the number of dados registros where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching dados registros
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DADOSREGISTRO_WHERE);

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
		"dadosRegistro.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(dadosRegistro.uuid IS NULL OR dadosRegistro.uuid = '')";

	private FinderPath _finderPathFetchByGarantiaId;

	/**
	 * Returns the dados registro where garantiaId = &#63; or throws a <code>NoSuchDadosRegistroException</code> if it could not be found.
	 *
	 * @param garantiaId the garantia ID
	 * @return the matching dados registro
	 * @throws NoSuchDadosRegistroException if a matching dados registro could not be found
	 */
	@Override
	public DadosRegistro findByGarantiaId(long garantiaId)
		throws NoSuchDadosRegistroException {

		DadosRegistro dadosRegistro = fetchByGarantiaId(garantiaId);

		if (dadosRegistro == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("garantiaId=");
			sb.append(garantiaId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchDadosRegistroException(sb.toString());
		}

		return dadosRegistro;
	}

	/**
	 * Returns the dados registro where garantiaId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param garantiaId the garantia ID
	 * @return the matching dados registro, or <code>null</code> if a matching dados registro could not be found
	 */
	@Override
	public DadosRegistro fetchByGarantiaId(long garantiaId) {
		return fetchByGarantiaId(garantiaId, true);
	}

	/**
	 * Returns the dados registro where garantiaId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param garantiaId the garantia ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dados registro, or <code>null</code> if a matching dados registro could not be found
	 */
	@Override
	public DadosRegistro fetchByGarantiaId(
		long garantiaId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {garantiaId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByGarantiaId, finderArgs, this);
		}

		if (result instanceof DadosRegistro) {
			DadosRegistro dadosRegistro = (DadosRegistro)result;

			if (garantiaId != dadosRegistro.getGarantiaId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_DADOSREGISTRO_WHERE);

			sb.append(_FINDER_COLUMN_GARANTIAID_GARANTIAID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(garantiaId);

				List<DadosRegistro> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByGarantiaId, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {garantiaId};
							}

							_log.warn(
								"DadosRegistroPersistenceImpl.fetchByGarantiaId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					DadosRegistro dadosRegistro = list.get(0);

					result = dadosRegistro;

					cacheResult(dadosRegistro);
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
			return (DadosRegistro)result;
		}
	}

	/**
	 * Removes the dados registro where garantiaId = &#63; from the database.
	 *
	 * @param garantiaId the garantia ID
	 * @return the dados registro that was removed
	 */
	@Override
	public DadosRegistro removeByGarantiaId(long garantiaId)
		throws NoSuchDadosRegistroException {

		DadosRegistro dadosRegistro = findByGarantiaId(garantiaId);

		return remove(dadosRegistro);
	}

	/**
	 * Returns the number of dados registros where garantiaId = &#63;.
	 *
	 * @param garantiaId the garantia ID
	 * @return the number of matching dados registros
	 */
	@Override
	public int countByGarantiaId(long garantiaId) {
		DadosRegistro dadosRegistro = fetchByGarantiaId(garantiaId);

		if (dadosRegistro == null) {
			return 0;
		}

		return 1;
	}

	private static final String _FINDER_COLUMN_GARANTIAID_GARANTIAID_2 =
		"dadosRegistro.garantiaId = ?";

	public DadosRegistroPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(DadosRegistro.class);

		setModelImplClass(DadosRegistroImpl.class);
		setModelPKClass(long.class);

		setTable(DadosRegistroTable.INSTANCE);
	}

	/**
	 * Caches the dados registro in the entity cache if it is enabled.
	 *
	 * @param dadosRegistro the dados registro
	 */
	@Override
	public void cacheResult(DadosRegistro dadosRegistro) {
		entityCache.putResult(
			DadosRegistroImpl.class, dadosRegistro.getPrimaryKey(),
			dadosRegistro);

		finderCache.putResult(
			_finderPathFetchByGarantiaId,
			new Object[] {dadosRegistro.getGarantiaId()}, dadosRegistro);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the dados registros in the entity cache if it is enabled.
	 *
	 * @param dadosRegistros the dados registros
	 */
	@Override
	public void cacheResult(List<DadosRegistro> dadosRegistros) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (dadosRegistros.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (DadosRegistro dadosRegistro : dadosRegistros) {
			if (entityCache.getResult(
					DadosRegistroImpl.class, dadosRegistro.getPrimaryKey()) ==
						null) {

				cacheResult(dadosRegistro);
			}
		}
	}

	/**
	 * Clears the cache for all dados registros.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DadosRegistroImpl.class);

		finderCache.clearCache(DadosRegistroImpl.class);
	}

	/**
	 * Clears the cache for the dados registro.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DadosRegistro dadosRegistro) {
		entityCache.removeResult(DadosRegistroImpl.class, dadosRegistro);
	}

	@Override
	public void clearCache(List<DadosRegistro> dadosRegistros) {
		for (DadosRegistro dadosRegistro : dadosRegistros) {
			entityCache.removeResult(DadosRegistroImpl.class, dadosRegistro);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DadosRegistroImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(DadosRegistroImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		DadosRegistroModelImpl dadosRegistroModelImpl) {

		Object[] args = new Object[] {dadosRegistroModelImpl.getGarantiaId()};

		finderCache.putResult(
			_finderPathFetchByGarantiaId, args, dadosRegistroModelImpl);
	}

	/**
	 * Creates a new dados registro with the primary key. Does not add the dados registro to the database.
	 *
	 * @param dadosRegistroId the primary key for the new dados registro
	 * @return the new dados registro
	 */
	@Override
	public DadosRegistro create(long dadosRegistroId) {
		DadosRegistro dadosRegistro = new DadosRegistroImpl();

		dadosRegistro.setNew(true);
		dadosRegistro.setPrimaryKey(dadosRegistroId);

		String uuid = PortalUUIDUtil.generate();

		dadosRegistro.setUuid(uuid);

		return dadosRegistro;
	}

	/**
	 * Removes the dados registro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dadosRegistroId the primary key of the dados registro
	 * @return the dados registro that was removed
	 * @throws NoSuchDadosRegistroException if a dados registro with the primary key could not be found
	 */
	@Override
	public DadosRegistro remove(long dadosRegistroId)
		throws NoSuchDadosRegistroException {

		return remove((Serializable)dadosRegistroId);
	}

	/**
	 * Removes the dados registro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dados registro
	 * @return the dados registro that was removed
	 * @throws NoSuchDadosRegistroException if a dados registro with the primary key could not be found
	 */
	@Override
	public DadosRegistro remove(Serializable primaryKey)
		throws NoSuchDadosRegistroException {

		Session session = null;

		try {
			session = openSession();

			DadosRegistro dadosRegistro = (DadosRegistro)session.get(
				DadosRegistroImpl.class, primaryKey);

			if (dadosRegistro == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDadosRegistroException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(dadosRegistro);
		}
		catch (NoSuchDadosRegistroException noSuchEntityException) {
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
	protected DadosRegistro removeImpl(DadosRegistro dadosRegistro) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dadosRegistro)) {
				dadosRegistro = (DadosRegistro)session.get(
					DadosRegistroImpl.class, dadosRegistro.getPrimaryKeyObj());
			}

			if (dadosRegistro != null) {
				session.delete(dadosRegistro);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (dadosRegistro != null) {
			clearCache(dadosRegistro);
		}

		return dadosRegistro;
	}

	@Override
	public DadosRegistro updateImpl(DadosRegistro dadosRegistro) {
		boolean isNew = dadosRegistro.isNew();

		if (!(dadosRegistro instanceof DadosRegistroModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(dadosRegistro.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					dadosRegistro);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in dadosRegistro proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DadosRegistro implementation " +
					dadosRegistro.getClass());
		}

		DadosRegistroModelImpl dadosRegistroModelImpl =
			(DadosRegistroModelImpl)dadosRegistro;

		if (Validator.isNull(dadosRegistro.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			dadosRegistro.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(dadosRegistro);
			}
			else {
				dadosRegistro = (DadosRegistro)session.merge(dadosRegistro);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DadosRegistroImpl.class, dadosRegistroModelImpl, false, true);

		cacheUniqueFindersCache(dadosRegistroModelImpl);

		if (isNew) {
			dadosRegistro.setNew(false);
		}

		dadosRegistro.resetOriginalValues();

		return dadosRegistro;
	}

	/**
	 * Returns the dados registro with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dados registro
	 * @return the dados registro
	 * @throws NoSuchDadosRegistroException if a dados registro with the primary key could not be found
	 */
	@Override
	public DadosRegistro findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDadosRegistroException {

		DadosRegistro dadosRegistro = fetchByPrimaryKey(primaryKey);

		if (dadosRegistro == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDadosRegistroException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return dadosRegistro;
	}

	/**
	 * Returns the dados registro with the primary key or throws a <code>NoSuchDadosRegistroException</code> if it could not be found.
	 *
	 * @param dadosRegistroId the primary key of the dados registro
	 * @return the dados registro
	 * @throws NoSuchDadosRegistroException if a dados registro with the primary key could not be found
	 */
	@Override
	public DadosRegistro findByPrimaryKey(long dadosRegistroId)
		throws NoSuchDadosRegistroException {

		return findByPrimaryKey((Serializable)dadosRegistroId);
	}

	/**
	 * Returns the dados registro with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dadosRegistroId the primary key of the dados registro
	 * @return the dados registro, or <code>null</code> if a dados registro with the primary key could not be found
	 */
	@Override
	public DadosRegistro fetchByPrimaryKey(long dadosRegistroId) {
		return fetchByPrimaryKey((Serializable)dadosRegistroId);
	}

	/**
	 * Returns all the dados registros.
	 *
	 * @return the dados registros
	 */
	@Override
	public List<DadosRegistro> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dados registros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @return the range of dados registros
	 */
	@Override
	public List<DadosRegistro> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dados registros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dados registros
	 */
	@Override
	public List<DadosRegistro> findAll(
		int start, int end,
		OrderByComparator<DadosRegistro> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dados registros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dados registros
	 */
	@Override
	public List<DadosRegistro> findAll(
		int start, int end, OrderByComparator<DadosRegistro> orderByComparator,
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

		List<DadosRegistro> list = null;

		if (useFinderCache) {
			list = (List<DadosRegistro>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DADOSREGISTRO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DADOSREGISTRO;

				sql = sql.concat(DadosRegistroModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DadosRegistro>)QueryUtil.list(
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
	 * Removes all the dados registros from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DadosRegistro dadosRegistro : findAll()) {
			remove(dadosRegistro);
		}
	}

	/**
	 * Returns the number of dados registros.
	 *
	 * @return the number of dados registros
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_DADOSREGISTRO);

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
		return "dadosRegistroId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DADOSREGISTRO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DadosRegistroModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dados registro persistence.
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

		_finderPathFetchByGarantiaId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByGarantiaId",
			new String[] {Long.class.getName()}, new String[] {"garantiaId"},
			true);

		DadosRegistroUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		DadosRegistroUtil.setPersistence(null);

		entityCache.removeCache(DadosRegistroImpl.class.getName());
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

	private static final String _SQL_SELECT_DADOSREGISTRO =
		"SELECT dadosRegistro FROM DadosRegistro dadosRegistro";

	private static final String _SQL_SELECT_DADOSREGISTRO_WHERE =
		"SELECT dadosRegistro FROM DadosRegistro dadosRegistro WHERE ";

	private static final String _SQL_COUNT_DADOSREGISTRO =
		"SELECT COUNT(dadosRegistro) FROM DadosRegistro dadosRegistro";

	private static final String _SQL_COUNT_DADOSREGISTRO_WHERE =
		"SELECT COUNT(dadosRegistro) FROM DadosRegistro dadosRegistro WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "dadosRegistro.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DadosRegistro exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DadosRegistro exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DadosRegistroPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}