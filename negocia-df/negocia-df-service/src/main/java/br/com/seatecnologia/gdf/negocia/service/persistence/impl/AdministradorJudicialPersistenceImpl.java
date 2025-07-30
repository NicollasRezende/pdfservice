/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchAdministradorJudicialException;
import br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial;
import br.com.seatecnologia.gdf.negocia.model.AdministradorJudicialTable;
import br.com.seatecnologia.gdf.negocia.model.impl.AdministradorJudicialImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.AdministradorJudicialModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.AdministradorJudicialPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AdministradorJudicialUtil;
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
 * The persistence implementation for the administrador judicial service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AdministradorJudicialPersistence.class)
public class AdministradorJudicialPersistenceImpl
	extends BasePersistenceImpl<AdministradorJudicial>
	implements AdministradorJudicialPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AdministradorJudicialUtil</code> to access the administrador judicial persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AdministradorJudicialImpl.class.getName();

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
	 * Returns all the administrador judicials where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching administrador judicials
	 */
	@Override
	public List<AdministradorJudicial> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the administrador judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @return the range of matching administrador judicials
	 */
	@Override
	public List<AdministradorJudicial> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the administrador judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching administrador judicials
	 */
	@Override
	public List<AdministradorJudicial> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AdministradorJudicial> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the administrador judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching administrador judicials
	 */
	@Override
	public List<AdministradorJudicial> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AdministradorJudicial> orderByComparator,
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

		List<AdministradorJudicial> list = null;

		if (useFinderCache) {
			list = (List<AdministradorJudicial>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AdministradorJudicial administradorJudicial : list) {
					if (!uuid.equals(administradorJudicial.getUuid())) {
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

			sb.append(_SQL_SELECT_ADMINISTRADORJUDICIAL_WHERE);

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
				sb.append(AdministradorJudicialModelImpl.ORDER_BY_JPQL);
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

				list = (List<AdministradorJudicial>)QueryUtil.list(
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
	 * Returns the first administrador judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching administrador judicial
	 * @throws NoSuchAdministradorJudicialException if a matching administrador judicial could not be found
	 */
	@Override
	public AdministradorJudicial findByUuid_First(
			String uuid,
			OrderByComparator<AdministradorJudicial> orderByComparator)
		throws NoSuchAdministradorJudicialException {

		AdministradorJudicial administradorJudicial = fetchByUuid_First(
			uuid, orderByComparator);

		if (administradorJudicial != null) {
			return administradorJudicial;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAdministradorJudicialException(sb.toString());
	}

	/**
	 * Returns the first administrador judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching administrador judicial, or <code>null</code> if a matching administrador judicial could not be found
	 */
	@Override
	public AdministradorJudicial fetchByUuid_First(
		String uuid,
		OrderByComparator<AdministradorJudicial> orderByComparator) {

		List<AdministradorJudicial> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last administrador judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching administrador judicial
	 * @throws NoSuchAdministradorJudicialException if a matching administrador judicial could not be found
	 */
	@Override
	public AdministradorJudicial findByUuid_Last(
			String uuid,
			OrderByComparator<AdministradorJudicial> orderByComparator)
		throws NoSuchAdministradorJudicialException {

		AdministradorJudicial administradorJudicial = fetchByUuid_Last(
			uuid, orderByComparator);

		if (administradorJudicial != null) {
			return administradorJudicial;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAdministradorJudicialException(sb.toString());
	}

	/**
	 * Returns the last administrador judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching administrador judicial, or <code>null</code> if a matching administrador judicial could not be found
	 */
	@Override
	public AdministradorJudicial fetchByUuid_Last(
		String uuid,
		OrderByComparator<AdministradorJudicial> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<AdministradorJudicial> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the administrador judicials before and after the current administrador judicial in the ordered set where uuid = &#63;.
	 *
	 * @param administradorJudicialId the primary key of the current administrador judicial
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next administrador judicial
	 * @throws NoSuchAdministradorJudicialException if a administrador judicial with the primary key could not be found
	 */
	@Override
	public AdministradorJudicial[] findByUuid_PrevAndNext(
			long administradorJudicialId, String uuid,
			OrderByComparator<AdministradorJudicial> orderByComparator)
		throws NoSuchAdministradorJudicialException {

		uuid = Objects.toString(uuid, "");

		AdministradorJudicial administradorJudicial = findByPrimaryKey(
			administradorJudicialId);

		Session session = null;

		try {
			session = openSession();

			AdministradorJudicial[] array = new AdministradorJudicialImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, administradorJudicial, uuid, orderByComparator, true);

			array[1] = administradorJudicial;

			array[2] = getByUuid_PrevAndNext(
				session, administradorJudicial, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AdministradorJudicial getByUuid_PrevAndNext(
		Session session, AdministradorJudicial administradorJudicial,
		String uuid, OrderByComparator<AdministradorJudicial> orderByComparator,
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

		sb.append(_SQL_SELECT_ADMINISTRADORJUDICIAL_WHERE);

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
			sb.append(AdministradorJudicialModelImpl.ORDER_BY_JPQL);
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
						administradorJudicial)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AdministradorJudicial> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the administrador judicials where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (AdministradorJudicial administradorJudicial :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(administradorJudicial);
		}
	}

	/**
	 * Returns the number of administrador judicials where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching administrador judicials
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADMINISTRADORJUDICIAL_WHERE);

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
		"administradorJudicial.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(administradorJudicial.uuid IS NULL OR administradorJudicial.uuid = '')";

	public AdministradorJudicialPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AdministradorJudicial.class);

		setModelImplClass(AdministradorJudicialImpl.class);
		setModelPKClass(long.class);

		setTable(AdministradorJudicialTable.INSTANCE);
	}

	/**
	 * Caches the administrador judicial in the entity cache if it is enabled.
	 *
	 * @param administradorJudicial the administrador judicial
	 */
	@Override
	public void cacheResult(AdministradorJudicial administradorJudicial) {
		entityCache.putResult(
			AdministradorJudicialImpl.class,
			administradorJudicial.getPrimaryKey(), administradorJudicial);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the administrador judicials in the entity cache if it is enabled.
	 *
	 * @param administradorJudicials the administrador judicials
	 */
	@Override
	public void cacheResult(
		List<AdministradorJudicial> administradorJudicials) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (administradorJudicials.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AdministradorJudicial administradorJudicial :
				administradorJudicials) {

			if (entityCache.getResult(
					AdministradorJudicialImpl.class,
					administradorJudicial.getPrimaryKey()) == null) {

				cacheResult(administradorJudicial);
			}
		}
	}

	/**
	 * Clears the cache for all administrador judicials.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AdministradorJudicialImpl.class);

		finderCache.clearCache(AdministradorJudicialImpl.class);
	}

	/**
	 * Clears the cache for the administrador judicial.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AdministradorJudicial administradorJudicial) {
		entityCache.removeResult(
			AdministradorJudicialImpl.class, administradorJudicial);
	}

	@Override
	public void clearCache(List<AdministradorJudicial> administradorJudicials) {
		for (AdministradorJudicial administradorJudicial :
				administradorJudicials) {

			entityCache.removeResult(
				AdministradorJudicialImpl.class, administradorJudicial);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AdministradorJudicialImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AdministradorJudicialImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new administrador judicial with the primary key. Does not add the administrador judicial to the database.
	 *
	 * @param administradorJudicialId the primary key for the new administrador judicial
	 * @return the new administrador judicial
	 */
	@Override
	public AdministradorJudicial create(long administradorJudicialId) {
		AdministradorJudicial administradorJudicial =
			new AdministradorJudicialImpl();

		administradorJudicial.setNew(true);
		administradorJudicial.setPrimaryKey(administradorJudicialId);

		String uuid = PortalUUIDUtil.generate();

		administradorJudicial.setUuid(uuid);

		return administradorJudicial;
	}

	/**
	 * Removes the administrador judicial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param administradorJudicialId the primary key of the administrador judicial
	 * @return the administrador judicial that was removed
	 * @throws NoSuchAdministradorJudicialException if a administrador judicial with the primary key could not be found
	 */
	@Override
	public AdministradorJudicial remove(long administradorJudicialId)
		throws NoSuchAdministradorJudicialException {

		return remove((Serializable)administradorJudicialId);
	}

	/**
	 * Removes the administrador judicial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the administrador judicial
	 * @return the administrador judicial that was removed
	 * @throws NoSuchAdministradorJudicialException if a administrador judicial with the primary key could not be found
	 */
	@Override
	public AdministradorJudicial remove(Serializable primaryKey)
		throws NoSuchAdministradorJudicialException {

		Session session = null;

		try {
			session = openSession();

			AdministradorJudicial administradorJudicial =
				(AdministradorJudicial)session.get(
					AdministradorJudicialImpl.class, primaryKey);

			if (administradorJudicial == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAdministradorJudicialException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(administradorJudicial);
		}
		catch (NoSuchAdministradorJudicialException noSuchEntityException) {
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
	protected AdministradorJudicial removeImpl(
		AdministradorJudicial administradorJudicial) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(administradorJudicial)) {
				administradorJudicial = (AdministradorJudicial)session.get(
					AdministradorJudicialImpl.class,
					administradorJudicial.getPrimaryKeyObj());
			}

			if (administradorJudicial != null) {
				session.delete(administradorJudicial);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (administradorJudicial != null) {
			clearCache(administradorJudicial);
		}

		return administradorJudicial;
	}

	@Override
	public AdministradorJudicial updateImpl(
		AdministradorJudicial administradorJudicial) {

		boolean isNew = administradorJudicial.isNew();

		if (!(administradorJudicial instanceof
				AdministradorJudicialModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(administradorJudicial.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					administradorJudicial);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in administradorJudicial proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AdministradorJudicial implementation " +
					administradorJudicial.getClass());
		}

		AdministradorJudicialModelImpl administradorJudicialModelImpl =
			(AdministradorJudicialModelImpl)administradorJudicial;

		if (Validator.isNull(administradorJudicial.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			administradorJudicial.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(administradorJudicial);
			}
			else {
				administradorJudicial = (AdministradorJudicial)session.merge(
					administradorJudicial);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AdministradorJudicialImpl.class, administradorJudicialModelImpl,
			false, true);

		if (isNew) {
			administradorJudicial.setNew(false);
		}

		administradorJudicial.resetOriginalValues();

		return administradorJudicial;
	}

	/**
	 * Returns the administrador judicial with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the administrador judicial
	 * @return the administrador judicial
	 * @throws NoSuchAdministradorJudicialException if a administrador judicial with the primary key could not be found
	 */
	@Override
	public AdministradorJudicial findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAdministradorJudicialException {

		AdministradorJudicial administradorJudicial = fetchByPrimaryKey(
			primaryKey);

		if (administradorJudicial == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAdministradorJudicialException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return administradorJudicial;
	}

	/**
	 * Returns the administrador judicial with the primary key or throws a <code>NoSuchAdministradorJudicialException</code> if it could not be found.
	 *
	 * @param administradorJudicialId the primary key of the administrador judicial
	 * @return the administrador judicial
	 * @throws NoSuchAdministradorJudicialException if a administrador judicial with the primary key could not be found
	 */
	@Override
	public AdministradorJudicial findByPrimaryKey(long administradorJudicialId)
		throws NoSuchAdministradorJudicialException {

		return findByPrimaryKey((Serializable)administradorJudicialId);
	}

	/**
	 * Returns the administrador judicial with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param administradorJudicialId the primary key of the administrador judicial
	 * @return the administrador judicial, or <code>null</code> if a administrador judicial with the primary key could not be found
	 */
	@Override
	public AdministradorJudicial fetchByPrimaryKey(
		long administradorJudicialId) {

		return fetchByPrimaryKey((Serializable)administradorJudicialId);
	}

	/**
	 * Returns all the administrador judicials.
	 *
	 * @return the administrador judicials
	 */
	@Override
	public List<AdministradorJudicial> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the administrador judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @return the range of administrador judicials
	 */
	@Override
	public List<AdministradorJudicial> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the administrador judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of administrador judicials
	 */
	@Override
	public List<AdministradorJudicial> findAll(
		int start, int end,
		OrderByComparator<AdministradorJudicial> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the administrador judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of administrador judicials
	 */
	@Override
	public List<AdministradorJudicial> findAll(
		int start, int end,
		OrderByComparator<AdministradorJudicial> orderByComparator,
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

		List<AdministradorJudicial> list = null;

		if (useFinderCache) {
			list = (List<AdministradorJudicial>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADMINISTRADORJUDICIAL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADMINISTRADORJUDICIAL;

				sql = sql.concat(AdministradorJudicialModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AdministradorJudicial>)QueryUtil.list(
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
	 * Removes all the administrador judicials from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AdministradorJudicial administradorJudicial : findAll()) {
			remove(administradorJudicial);
		}
	}

	/**
	 * Returns the number of administrador judicials.
	 *
	 * @return the number of administrador judicials
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
					_SQL_COUNT_ADMINISTRADORJUDICIAL);

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
		return "administradorJudicialId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADMINISTRADORJUDICIAL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AdministradorJudicialModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the administrador judicial persistence.
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

		AdministradorJudicialUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AdministradorJudicialUtil.setPersistence(null);

		entityCache.removeCache(AdministradorJudicialImpl.class.getName());
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

	private static final String _SQL_SELECT_ADMINISTRADORJUDICIAL =
		"SELECT administradorJudicial FROM AdministradorJudicial administradorJudicial";

	private static final String _SQL_SELECT_ADMINISTRADORJUDICIAL_WHERE =
		"SELECT administradorJudicial FROM AdministradorJudicial administradorJudicial WHERE ";

	private static final String _SQL_COUNT_ADMINISTRADORJUDICIAL =
		"SELECT COUNT(administradorJudicial) FROM AdministradorJudicial administradorJudicial";

	private static final String _SQL_COUNT_ADMINISTRADORJUDICIAL_WHERE =
		"SELECT COUNT(administradorJudicial) FROM AdministradorJudicial administradorJudicial WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"administradorJudicial.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AdministradorJudicial exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AdministradorJudicial exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AdministradorJudicialPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}