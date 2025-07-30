/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchBensDireitosLaudoException;
import br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo;
import br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudoTable;
import br.com.seatecnologia.gdf.negocia.model.impl.BensDireitosLaudoImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.BensDireitosLaudoModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.BensDireitosLaudoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.BensDireitosLaudoUtil;
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
 * The persistence implementation for the bens direitos laudo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = BensDireitosLaudoPersistence.class)
public class BensDireitosLaudoPersistenceImpl
	extends BasePersistenceImpl<BensDireitosLaudo>
	implements BensDireitosLaudoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>BensDireitosLaudoUtil</code> to access the bens direitos laudo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		BensDireitosLaudoImpl.class.getName();

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
	 * Returns all the bens direitos laudos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching bens direitos laudos
	 */
	@Override
	public List<BensDireitosLaudo> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bens direitos laudos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @return the range of matching bens direitos laudos
	 */
	@Override
	public List<BensDireitosLaudo> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bens direitos laudos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bens direitos laudos
	 */
	@Override
	public List<BensDireitosLaudo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BensDireitosLaudo> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bens direitos laudos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bens direitos laudos
	 */
	@Override
	public List<BensDireitosLaudo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BensDireitosLaudo> orderByComparator,
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

		List<BensDireitosLaudo> list = null;

		if (useFinderCache) {
			list = (List<BensDireitosLaudo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BensDireitosLaudo bensDireitosLaudo : list) {
					if (!uuid.equals(bensDireitosLaudo.getUuid())) {
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

			sb.append(_SQL_SELECT_BENSDIREITOSLAUDO_WHERE);

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
				sb.append(BensDireitosLaudoModelImpl.ORDER_BY_JPQL);
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

				list = (List<BensDireitosLaudo>)QueryUtil.list(
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
	 * Returns the first bens direitos laudo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos laudo
	 * @throws NoSuchBensDireitosLaudoException if a matching bens direitos laudo could not be found
	 */
	@Override
	public BensDireitosLaudo findByUuid_First(
			String uuid, OrderByComparator<BensDireitosLaudo> orderByComparator)
		throws NoSuchBensDireitosLaudoException {

		BensDireitosLaudo bensDireitosLaudo = fetchByUuid_First(
			uuid, orderByComparator);

		if (bensDireitosLaudo != null) {
			return bensDireitosLaudo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchBensDireitosLaudoException(sb.toString());
	}

	/**
	 * Returns the first bens direitos laudo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos laudo, or <code>null</code> if a matching bens direitos laudo could not be found
	 */
	@Override
	public BensDireitosLaudo fetchByUuid_First(
		String uuid, OrderByComparator<BensDireitosLaudo> orderByComparator) {

		List<BensDireitosLaudo> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bens direitos laudo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos laudo
	 * @throws NoSuchBensDireitosLaudoException if a matching bens direitos laudo could not be found
	 */
	@Override
	public BensDireitosLaudo findByUuid_Last(
			String uuid, OrderByComparator<BensDireitosLaudo> orderByComparator)
		throws NoSuchBensDireitosLaudoException {

		BensDireitosLaudo bensDireitosLaudo = fetchByUuid_Last(
			uuid, orderByComparator);

		if (bensDireitosLaudo != null) {
			return bensDireitosLaudo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchBensDireitosLaudoException(sb.toString());
	}

	/**
	 * Returns the last bens direitos laudo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos laudo, or <code>null</code> if a matching bens direitos laudo could not be found
	 */
	@Override
	public BensDireitosLaudo fetchByUuid_Last(
		String uuid, OrderByComparator<BensDireitosLaudo> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<BensDireitosLaudo> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bens direitos laudos before and after the current bens direitos laudo in the ordered set where uuid = &#63;.
	 *
	 * @param bensDireitosLaudoId the primary key of the current bens direitos laudo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bens direitos laudo
	 * @throws NoSuchBensDireitosLaudoException if a bens direitos laudo with the primary key could not be found
	 */
	@Override
	public BensDireitosLaudo[] findByUuid_PrevAndNext(
			long bensDireitosLaudoId, String uuid,
			OrderByComparator<BensDireitosLaudo> orderByComparator)
		throws NoSuchBensDireitosLaudoException {

		uuid = Objects.toString(uuid, "");

		BensDireitosLaudo bensDireitosLaudo = findByPrimaryKey(
			bensDireitosLaudoId);

		Session session = null;

		try {
			session = openSession();

			BensDireitosLaudo[] array = new BensDireitosLaudoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, bensDireitosLaudo, uuid, orderByComparator, true);

			array[1] = bensDireitosLaudo;

			array[2] = getByUuid_PrevAndNext(
				session, bensDireitosLaudo, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected BensDireitosLaudo getByUuid_PrevAndNext(
		Session session, BensDireitosLaudo bensDireitosLaudo, String uuid,
		OrderByComparator<BensDireitosLaudo> orderByComparator,
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

		sb.append(_SQL_SELECT_BENSDIREITOSLAUDO_WHERE);

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
			sb.append(BensDireitosLaudoModelImpl.ORDER_BY_JPQL);
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
						bensDireitosLaudo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<BensDireitosLaudo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bens direitos laudos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (BensDireitosLaudo bensDireitosLaudo :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(bensDireitosLaudo);
		}
	}

	/**
	 * Returns the number of bens direitos laudos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching bens direitos laudos
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_BENSDIREITOSLAUDO_WHERE);

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
		"bensDireitosLaudo.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(bensDireitosLaudo.uuid IS NULL OR bensDireitosLaudo.uuid = '')";

	public BensDireitosLaudoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(BensDireitosLaudo.class);

		setModelImplClass(BensDireitosLaudoImpl.class);
		setModelPKClass(long.class);

		setTable(BensDireitosLaudoTable.INSTANCE);
	}

	/**
	 * Caches the bens direitos laudo in the entity cache if it is enabled.
	 *
	 * @param bensDireitosLaudo the bens direitos laudo
	 */
	@Override
	public void cacheResult(BensDireitosLaudo bensDireitosLaudo) {
		entityCache.putResult(
			BensDireitosLaudoImpl.class, bensDireitosLaudo.getPrimaryKey(),
			bensDireitosLaudo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the bens direitos laudos in the entity cache if it is enabled.
	 *
	 * @param bensDireitosLaudos the bens direitos laudos
	 */
	@Override
	public void cacheResult(List<BensDireitosLaudo> bensDireitosLaudos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (bensDireitosLaudos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (BensDireitosLaudo bensDireitosLaudo : bensDireitosLaudos) {
			if (entityCache.getResult(
					BensDireitosLaudoImpl.class,
					bensDireitosLaudo.getPrimaryKey()) == null) {

				cacheResult(bensDireitosLaudo);
			}
		}
	}

	/**
	 * Clears the cache for all bens direitos laudos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BensDireitosLaudoImpl.class);

		finderCache.clearCache(BensDireitosLaudoImpl.class);
	}

	/**
	 * Clears the cache for the bens direitos laudo.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BensDireitosLaudo bensDireitosLaudo) {
		entityCache.removeResult(
			BensDireitosLaudoImpl.class, bensDireitosLaudo);
	}

	@Override
	public void clearCache(List<BensDireitosLaudo> bensDireitosLaudos) {
		for (BensDireitosLaudo bensDireitosLaudo : bensDireitosLaudos) {
			entityCache.removeResult(
				BensDireitosLaudoImpl.class, bensDireitosLaudo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(BensDireitosLaudoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(BensDireitosLaudoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new bens direitos laudo with the primary key. Does not add the bens direitos laudo to the database.
	 *
	 * @param bensDireitosLaudoId the primary key for the new bens direitos laudo
	 * @return the new bens direitos laudo
	 */
	@Override
	public BensDireitosLaudo create(long bensDireitosLaudoId) {
		BensDireitosLaudo bensDireitosLaudo = new BensDireitosLaudoImpl();

		bensDireitosLaudo.setNew(true);
		bensDireitosLaudo.setPrimaryKey(bensDireitosLaudoId);

		String uuid = PortalUUIDUtil.generate();

		bensDireitosLaudo.setUuid(uuid);

		return bensDireitosLaudo;
	}

	/**
	 * Removes the bens direitos laudo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bensDireitosLaudoId the primary key of the bens direitos laudo
	 * @return the bens direitos laudo that was removed
	 * @throws NoSuchBensDireitosLaudoException if a bens direitos laudo with the primary key could not be found
	 */
	@Override
	public BensDireitosLaudo remove(long bensDireitosLaudoId)
		throws NoSuchBensDireitosLaudoException {

		return remove((Serializable)bensDireitosLaudoId);
	}

	/**
	 * Removes the bens direitos laudo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bens direitos laudo
	 * @return the bens direitos laudo that was removed
	 * @throws NoSuchBensDireitosLaudoException if a bens direitos laudo with the primary key could not be found
	 */
	@Override
	public BensDireitosLaudo remove(Serializable primaryKey)
		throws NoSuchBensDireitosLaudoException {

		Session session = null;

		try {
			session = openSession();

			BensDireitosLaudo bensDireitosLaudo =
				(BensDireitosLaudo)session.get(
					BensDireitosLaudoImpl.class, primaryKey);

			if (bensDireitosLaudo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBensDireitosLaudoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(bensDireitosLaudo);
		}
		catch (NoSuchBensDireitosLaudoException noSuchEntityException) {
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
	protected BensDireitosLaudo removeImpl(
		BensDireitosLaudo bensDireitosLaudo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bensDireitosLaudo)) {
				bensDireitosLaudo = (BensDireitosLaudo)session.get(
					BensDireitosLaudoImpl.class,
					bensDireitosLaudo.getPrimaryKeyObj());
			}

			if (bensDireitosLaudo != null) {
				session.delete(bensDireitosLaudo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (bensDireitosLaudo != null) {
			clearCache(bensDireitosLaudo);
		}

		return bensDireitosLaudo;
	}

	@Override
	public BensDireitosLaudo updateImpl(BensDireitosLaudo bensDireitosLaudo) {
		boolean isNew = bensDireitosLaudo.isNew();

		if (!(bensDireitosLaudo instanceof BensDireitosLaudoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(bensDireitosLaudo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					bensDireitosLaudo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in bensDireitosLaudo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom BensDireitosLaudo implementation " +
					bensDireitosLaudo.getClass());
		}

		BensDireitosLaudoModelImpl bensDireitosLaudoModelImpl =
			(BensDireitosLaudoModelImpl)bensDireitosLaudo;

		if (Validator.isNull(bensDireitosLaudo.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			bensDireitosLaudo.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(bensDireitosLaudo);
			}
			else {
				bensDireitosLaudo = (BensDireitosLaudo)session.merge(
					bensDireitosLaudo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			BensDireitosLaudoImpl.class, bensDireitosLaudoModelImpl, false,
			true);

		if (isNew) {
			bensDireitosLaudo.setNew(false);
		}

		bensDireitosLaudo.resetOriginalValues();

		return bensDireitosLaudo;
	}

	/**
	 * Returns the bens direitos laudo with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bens direitos laudo
	 * @return the bens direitos laudo
	 * @throws NoSuchBensDireitosLaudoException if a bens direitos laudo with the primary key could not be found
	 */
	@Override
	public BensDireitosLaudo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBensDireitosLaudoException {

		BensDireitosLaudo bensDireitosLaudo = fetchByPrimaryKey(primaryKey);

		if (bensDireitosLaudo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBensDireitosLaudoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return bensDireitosLaudo;
	}

	/**
	 * Returns the bens direitos laudo with the primary key or throws a <code>NoSuchBensDireitosLaudoException</code> if it could not be found.
	 *
	 * @param bensDireitosLaudoId the primary key of the bens direitos laudo
	 * @return the bens direitos laudo
	 * @throws NoSuchBensDireitosLaudoException if a bens direitos laudo with the primary key could not be found
	 */
	@Override
	public BensDireitosLaudo findByPrimaryKey(long bensDireitosLaudoId)
		throws NoSuchBensDireitosLaudoException {

		return findByPrimaryKey((Serializable)bensDireitosLaudoId);
	}

	/**
	 * Returns the bens direitos laudo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bensDireitosLaudoId the primary key of the bens direitos laudo
	 * @return the bens direitos laudo, or <code>null</code> if a bens direitos laudo with the primary key could not be found
	 */
	@Override
	public BensDireitosLaudo fetchByPrimaryKey(long bensDireitosLaudoId) {
		return fetchByPrimaryKey((Serializable)bensDireitosLaudoId);
	}

	/**
	 * Returns all the bens direitos laudos.
	 *
	 * @return the bens direitos laudos
	 */
	@Override
	public List<BensDireitosLaudo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bens direitos laudos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @return the range of bens direitos laudos
	 */
	@Override
	public List<BensDireitosLaudo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bens direitos laudos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bens direitos laudos
	 */
	@Override
	public List<BensDireitosLaudo> findAll(
		int start, int end,
		OrderByComparator<BensDireitosLaudo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bens direitos laudos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bens direitos laudos
	 */
	@Override
	public List<BensDireitosLaudo> findAll(
		int start, int end,
		OrderByComparator<BensDireitosLaudo> orderByComparator,
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

		List<BensDireitosLaudo> list = null;

		if (useFinderCache) {
			list = (List<BensDireitosLaudo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_BENSDIREITOSLAUDO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_BENSDIREITOSLAUDO;

				sql = sql.concat(BensDireitosLaudoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<BensDireitosLaudo>)QueryUtil.list(
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
	 * Removes all the bens direitos laudos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (BensDireitosLaudo bensDireitosLaudo : findAll()) {
			remove(bensDireitosLaudo);
		}
	}

	/**
	 * Returns the number of bens direitos laudos.
	 *
	 * @return the number of bens direitos laudos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_BENSDIREITOSLAUDO);

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
		return "bensDireitosLaudoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_BENSDIREITOSLAUDO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return BensDireitosLaudoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the bens direitos laudo persistence.
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

		BensDireitosLaudoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		BensDireitosLaudoUtil.setPersistence(null);

		entityCache.removeCache(BensDireitosLaudoImpl.class.getName());
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

	private static final String _SQL_SELECT_BENSDIREITOSLAUDO =
		"SELECT bensDireitosLaudo FROM BensDireitosLaudo bensDireitosLaudo";

	private static final String _SQL_SELECT_BENSDIREITOSLAUDO_WHERE =
		"SELECT bensDireitosLaudo FROM BensDireitosLaudo bensDireitosLaudo WHERE ";

	private static final String _SQL_COUNT_BENSDIREITOSLAUDO =
		"SELECT COUNT(bensDireitosLaudo) FROM BensDireitosLaudo bensDireitosLaudo";

	private static final String _SQL_COUNT_BENSDIREITOSLAUDO_WHERE =
		"SELECT COUNT(bensDireitosLaudo) FROM BensDireitosLaudo bensDireitosLaudo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "bensDireitosLaudo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No BensDireitosLaudo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No BensDireitosLaudo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		BensDireitosLaudoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}