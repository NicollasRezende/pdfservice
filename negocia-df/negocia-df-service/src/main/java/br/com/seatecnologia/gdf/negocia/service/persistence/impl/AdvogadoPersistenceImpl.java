/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchAdvogadoException;
import br.com.seatecnologia.gdf.negocia.model.Advogado;
import br.com.seatecnologia.gdf.negocia.model.AdvogadoTable;
import br.com.seatecnologia.gdf.negocia.model.impl.AdvogadoImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.AdvogadoModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.AdvogadoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AdvogadoUtil;
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
 * The persistence implementation for the advogado service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AdvogadoPersistence.class)
public class AdvogadoPersistenceImpl
	extends BasePersistenceImpl<Advogado> implements AdvogadoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AdvogadoUtil</code> to access the advogado persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AdvogadoImpl.class.getName();

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
	 * Returns all the advogados where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching advogados
	 */
	@Override
	public List<Advogado> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the advogados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdvogadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of advogados
	 * @param end the upper bound of the range of advogados (not inclusive)
	 * @return the range of matching advogados
	 */
	@Override
	public List<Advogado> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the advogados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdvogadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of advogados
	 * @param end the upper bound of the range of advogados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching advogados
	 */
	@Override
	public List<Advogado> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Advogado> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the advogados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdvogadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of advogados
	 * @param end the upper bound of the range of advogados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching advogados
	 */
	@Override
	public List<Advogado> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Advogado> orderByComparator, boolean useFinderCache) {

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

		List<Advogado> list = null;

		if (useFinderCache) {
			list = (List<Advogado>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Advogado advogado : list) {
					if (!uuid.equals(advogado.getUuid())) {
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

			sb.append(_SQL_SELECT_ADVOGADO_WHERE);

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
				sb.append(AdvogadoModelImpl.ORDER_BY_JPQL);
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

				list = (List<Advogado>)QueryUtil.list(
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
	 * Returns the first advogado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching advogado
	 * @throws NoSuchAdvogadoException if a matching advogado could not be found
	 */
	@Override
	public Advogado findByUuid_First(
			String uuid, OrderByComparator<Advogado> orderByComparator)
		throws NoSuchAdvogadoException {

		Advogado advogado = fetchByUuid_First(uuid, orderByComparator);

		if (advogado != null) {
			return advogado;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAdvogadoException(sb.toString());
	}

	/**
	 * Returns the first advogado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching advogado, or <code>null</code> if a matching advogado could not be found
	 */
	@Override
	public Advogado fetchByUuid_First(
		String uuid, OrderByComparator<Advogado> orderByComparator) {

		List<Advogado> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last advogado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching advogado
	 * @throws NoSuchAdvogadoException if a matching advogado could not be found
	 */
	@Override
	public Advogado findByUuid_Last(
			String uuid, OrderByComparator<Advogado> orderByComparator)
		throws NoSuchAdvogadoException {

		Advogado advogado = fetchByUuid_Last(uuid, orderByComparator);

		if (advogado != null) {
			return advogado;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAdvogadoException(sb.toString());
	}

	/**
	 * Returns the last advogado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching advogado, or <code>null</code> if a matching advogado could not be found
	 */
	@Override
	public Advogado fetchByUuid_Last(
		String uuid, OrderByComparator<Advogado> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Advogado> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the advogados before and after the current advogado in the ordered set where uuid = &#63;.
	 *
	 * @param advogadoId the primary key of the current advogado
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next advogado
	 * @throws NoSuchAdvogadoException if a advogado with the primary key could not be found
	 */
	@Override
	public Advogado[] findByUuid_PrevAndNext(
			long advogadoId, String uuid,
			OrderByComparator<Advogado> orderByComparator)
		throws NoSuchAdvogadoException {

		uuid = Objects.toString(uuid, "");

		Advogado advogado = findByPrimaryKey(advogadoId);

		Session session = null;

		try {
			session = openSession();

			Advogado[] array = new AdvogadoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, advogado, uuid, orderByComparator, true);

			array[1] = advogado;

			array[2] = getByUuid_PrevAndNext(
				session, advogado, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Advogado getByUuid_PrevAndNext(
		Session session, Advogado advogado, String uuid,
		OrderByComparator<Advogado> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ADVOGADO_WHERE);

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
			sb.append(AdvogadoModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(advogado)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Advogado> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the advogados where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Advogado advogado :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(advogado);
		}
	}

	/**
	 * Returns the number of advogados where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching advogados
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADVOGADO_WHERE);

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
		"advogado.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(advogado.uuid IS NULL OR advogado.uuid = '')";

	public AdvogadoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Advogado.class);

		setModelImplClass(AdvogadoImpl.class);
		setModelPKClass(long.class);

		setTable(AdvogadoTable.INSTANCE);
	}

	/**
	 * Caches the advogado in the entity cache if it is enabled.
	 *
	 * @param advogado the advogado
	 */
	@Override
	public void cacheResult(Advogado advogado) {
		entityCache.putResult(
			AdvogadoImpl.class, advogado.getPrimaryKey(), advogado);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the advogados in the entity cache if it is enabled.
	 *
	 * @param advogados the advogados
	 */
	@Override
	public void cacheResult(List<Advogado> advogados) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (advogados.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Advogado advogado : advogados) {
			if (entityCache.getResult(
					AdvogadoImpl.class, advogado.getPrimaryKey()) == null) {

				cacheResult(advogado);
			}
		}
	}

	/**
	 * Clears the cache for all advogados.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AdvogadoImpl.class);

		finderCache.clearCache(AdvogadoImpl.class);
	}

	/**
	 * Clears the cache for the advogado.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Advogado advogado) {
		entityCache.removeResult(AdvogadoImpl.class, advogado);
	}

	@Override
	public void clearCache(List<Advogado> advogados) {
		for (Advogado advogado : advogados) {
			entityCache.removeResult(AdvogadoImpl.class, advogado);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AdvogadoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AdvogadoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new advogado with the primary key. Does not add the advogado to the database.
	 *
	 * @param advogadoId the primary key for the new advogado
	 * @return the new advogado
	 */
	@Override
	public Advogado create(long advogadoId) {
		Advogado advogado = new AdvogadoImpl();

		advogado.setNew(true);
		advogado.setPrimaryKey(advogadoId);

		String uuid = PortalUUIDUtil.generate();

		advogado.setUuid(uuid);

		return advogado;
	}

	/**
	 * Removes the advogado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param advogadoId the primary key of the advogado
	 * @return the advogado that was removed
	 * @throws NoSuchAdvogadoException if a advogado with the primary key could not be found
	 */
	@Override
	public Advogado remove(long advogadoId) throws NoSuchAdvogadoException {
		return remove((Serializable)advogadoId);
	}

	/**
	 * Removes the advogado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the advogado
	 * @return the advogado that was removed
	 * @throws NoSuchAdvogadoException if a advogado with the primary key could not be found
	 */
	@Override
	public Advogado remove(Serializable primaryKey)
		throws NoSuchAdvogadoException {

		Session session = null;

		try {
			session = openSession();

			Advogado advogado = (Advogado)session.get(
				AdvogadoImpl.class, primaryKey);

			if (advogado == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAdvogadoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(advogado);
		}
		catch (NoSuchAdvogadoException noSuchEntityException) {
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
	protected Advogado removeImpl(Advogado advogado) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(advogado)) {
				advogado = (Advogado)session.get(
					AdvogadoImpl.class, advogado.getPrimaryKeyObj());
			}

			if (advogado != null) {
				session.delete(advogado);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (advogado != null) {
			clearCache(advogado);
		}

		return advogado;
	}

	@Override
	public Advogado updateImpl(Advogado advogado) {
		boolean isNew = advogado.isNew();

		if (!(advogado instanceof AdvogadoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(advogado.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(advogado);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in advogado proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Advogado implementation " +
					advogado.getClass());
		}

		AdvogadoModelImpl advogadoModelImpl = (AdvogadoModelImpl)advogado;

		if (Validator.isNull(advogado.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			advogado.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(advogado);
			}
			else {
				advogado = (Advogado)session.merge(advogado);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AdvogadoImpl.class, advogadoModelImpl, false, true);

		if (isNew) {
			advogado.setNew(false);
		}

		advogado.resetOriginalValues();

		return advogado;
	}

	/**
	 * Returns the advogado with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the advogado
	 * @return the advogado
	 * @throws NoSuchAdvogadoException if a advogado with the primary key could not be found
	 */
	@Override
	public Advogado findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAdvogadoException {

		Advogado advogado = fetchByPrimaryKey(primaryKey);

		if (advogado == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAdvogadoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return advogado;
	}

	/**
	 * Returns the advogado with the primary key or throws a <code>NoSuchAdvogadoException</code> if it could not be found.
	 *
	 * @param advogadoId the primary key of the advogado
	 * @return the advogado
	 * @throws NoSuchAdvogadoException if a advogado with the primary key could not be found
	 */
	@Override
	public Advogado findByPrimaryKey(long advogadoId)
		throws NoSuchAdvogadoException {

		return findByPrimaryKey((Serializable)advogadoId);
	}

	/**
	 * Returns the advogado with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param advogadoId the primary key of the advogado
	 * @return the advogado, or <code>null</code> if a advogado with the primary key could not be found
	 */
	@Override
	public Advogado fetchByPrimaryKey(long advogadoId) {
		return fetchByPrimaryKey((Serializable)advogadoId);
	}

	/**
	 * Returns all the advogados.
	 *
	 * @return the advogados
	 */
	@Override
	public List<Advogado> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the advogados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdvogadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of advogados
	 * @param end the upper bound of the range of advogados (not inclusive)
	 * @return the range of advogados
	 */
	@Override
	public List<Advogado> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the advogados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdvogadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of advogados
	 * @param end the upper bound of the range of advogados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of advogados
	 */
	@Override
	public List<Advogado> findAll(
		int start, int end, OrderByComparator<Advogado> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the advogados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdvogadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of advogados
	 * @param end the upper bound of the range of advogados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of advogados
	 */
	@Override
	public List<Advogado> findAll(
		int start, int end, OrderByComparator<Advogado> orderByComparator,
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

		List<Advogado> list = null;

		if (useFinderCache) {
			list = (List<Advogado>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADVOGADO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADVOGADO;

				sql = sql.concat(AdvogadoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Advogado>)QueryUtil.list(
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
	 * Removes all the advogados from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Advogado advogado : findAll()) {
			remove(advogado);
		}
	}

	/**
	 * Returns the number of advogados.
	 *
	 * @return the number of advogados
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ADVOGADO);

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
		return "advogadoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADVOGADO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AdvogadoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the advogado persistence.
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

		AdvogadoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AdvogadoUtil.setPersistence(null);

		entityCache.removeCache(AdvogadoImpl.class.getName());
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

	private static final String _SQL_SELECT_ADVOGADO =
		"SELECT advogado FROM Advogado advogado";

	private static final String _SQL_SELECT_ADVOGADO_WHERE =
		"SELECT advogado FROM Advogado advogado WHERE ";

	private static final String _SQL_COUNT_ADVOGADO =
		"SELECT COUNT(advogado) FROM Advogado advogado";

	private static final String _SQL_COUNT_ADVOGADO_WHERE =
		"SELECT COUNT(advogado) FROM Advogado advogado WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "advogado.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Advogado exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Advogado exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AdvogadoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}