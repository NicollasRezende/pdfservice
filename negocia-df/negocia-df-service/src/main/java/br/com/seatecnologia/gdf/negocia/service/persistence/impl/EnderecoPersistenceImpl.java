/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchEnderecoException;
import br.com.seatecnologia.gdf.negocia.model.Endereco;
import br.com.seatecnologia.gdf.negocia.model.EnderecoTable;
import br.com.seatecnologia.gdf.negocia.model.impl.EnderecoImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.EnderecoModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.EnderecoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.EnderecoUtil;
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
 * The persistence implementation for the endereco service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = EnderecoPersistence.class)
public class EnderecoPersistenceImpl
	extends BasePersistenceImpl<Endereco> implements EnderecoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EnderecoUtil</code> to access the endereco persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EnderecoImpl.class.getName();

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
	 * Returns all the enderecos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching enderecos
	 */
	@Override
	public List<Endereco> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the enderecos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @return the range of matching enderecos
	 */
	@Override
	public List<Endereco> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the enderecos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching enderecos
	 */
	@Override
	public List<Endereco> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Endereco> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the enderecos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching enderecos
	 */
	@Override
	public List<Endereco> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Endereco> orderByComparator, boolean useFinderCache) {

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

		List<Endereco> list = null;

		if (useFinderCache) {
			list = (List<Endereco>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Endereco endereco : list) {
					if (!uuid.equals(endereco.getUuid())) {
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

			sb.append(_SQL_SELECT_ENDERECO_WHERE);

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
				sb.append(EnderecoModelImpl.ORDER_BY_JPQL);
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

				list = (List<Endereco>)QueryUtil.list(
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
	 * Returns the first endereco in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching endereco
	 * @throws NoSuchEnderecoException if a matching endereco could not be found
	 */
	@Override
	public Endereco findByUuid_First(
			String uuid, OrderByComparator<Endereco> orderByComparator)
		throws NoSuchEnderecoException {

		Endereco endereco = fetchByUuid_First(uuid, orderByComparator);

		if (endereco != null) {
			return endereco;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEnderecoException(sb.toString());
	}

	/**
	 * Returns the first endereco in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching endereco, or <code>null</code> if a matching endereco could not be found
	 */
	@Override
	public Endereco fetchByUuid_First(
		String uuid, OrderByComparator<Endereco> orderByComparator) {

		List<Endereco> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last endereco in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching endereco
	 * @throws NoSuchEnderecoException if a matching endereco could not be found
	 */
	@Override
	public Endereco findByUuid_Last(
			String uuid, OrderByComparator<Endereco> orderByComparator)
		throws NoSuchEnderecoException {

		Endereco endereco = fetchByUuid_Last(uuid, orderByComparator);

		if (endereco != null) {
			return endereco;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEnderecoException(sb.toString());
	}

	/**
	 * Returns the last endereco in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching endereco, or <code>null</code> if a matching endereco could not be found
	 */
	@Override
	public Endereco fetchByUuid_Last(
		String uuid, OrderByComparator<Endereco> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Endereco> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the enderecos before and after the current endereco in the ordered set where uuid = &#63;.
	 *
	 * @param enderecoId the primary key of the current endereco
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next endereco
	 * @throws NoSuchEnderecoException if a endereco with the primary key could not be found
	 */
	@Override
	public Endereco[] findByUuid_PrevAndNext(
			long enderecoId, String uuid,
			OrderByComparator<Endereco> orderByComparator)
		throws NoSuchEnderecoException {

		uuid = Objects.toString(uuid, "");

		Endereco endereco = findByPrimaryKey(enderecoId);

		Session session = null;

		try {
			session = openSession();

			Endereco[] array = new EnderecoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, endereco, uuid, orderByComparator, true);

			array[1] = endereco;

			array[2] = getByUuid_PrevAndNext(
				session, endereco, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Endereco getByUuid_PrevAndNext(
		Session session, Endereco endereco, String uuid,
		OrderByComparator<Endereco> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ENDERECO_WHERE);

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
			sb.append(EnderecoModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(endereco)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Endereco> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the enderecos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Endereco endereco :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(endereco);
		}
	}

	/**
	 * Returns the number of enderecos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching enderecos
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ENDERECO_WHERE);

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
		"endereco.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(endereco.uuid IS NULL OR endereco.uuid = '')";

	public EnderecoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Endereco.class);

		setModelImplClass(EnderecoImpl.class);
		setModelPKClass(long.class);

		setTable(EnderecoTable.INSTANCE);
	}

	/**
	 * Caches the endereco in the entity cache if it is enabled.
	 *
	 * @param endereco the endereco
	 */
	@Override
	public void cacheResult(Endereco endereco) {
		entityCache.putResult(
			EnderecoImpl.class, endereco.getPrimaryKey(), endereco);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the enderecos in the entity cache if it is enabled.
	 *
	 * @param enderecos the enderecos
	 */
	@Override
	public void cacheResult(List<Endereco> enderecos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (enderecos.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Endereco endereco : enderecos) {
			if (entityCache.getResult(
					EnderecoImpl.class, endereco.getPrimaryKey()) == null) {

				cacheResult(endereco);
			}
		}
	}

	/**
	 * Clears the cache for all enderecos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EnderecoImpl.class);

		finderCache.clearCache(EnderecoImpl.class);
	}

	/**
	 * Clears the cache for the endereco.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Endereco endereco) {
		entityCache.removeResult(EnderecoImpl.class, endereco);
	}

	@Override
	public void clearCache(List<Endereco> enderecos) {
		for (Endereco endereco : enderecos) {
			entityCache.removeResult(EnderecoImpl.class, endereco);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(EnderecoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(EnderecoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new endereco with the primary key. Does not add the endereco to the database.
	 *
	 * @param enderecoId the primary key for the new endereco
	 * @return the new endereco
	 */
	@Override
	public Endereco create(long enderecoId) {
		Endereco endereco = new EnderecoImpl();

		endereco.setNew(true);
		endereco.setPrimaryKey(enderecoId);

		String uuid = PortalUUIDUtil.generate();

		endereco.setUuid(uuid);

		return endereco;
	}

	/**
	 * Removes the endereco with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param enderecoId the primary key of the endereco
	 * @return the endereco that was removed
	 * @throws NoSuchEnderecoException if a endereco with the primary key could not be found
	 */
	@Override
	public Endereco remove(long enderecoId) throws NoSuchEnderecoException {
		return remove((Serializable)enderecoId);
	}

	/**
	 * Removes the endereco with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the endereco
	 * @return the endereco that was removed
	 * @throws NoSuchEnderecoException if a endereco with the primary key could not be found
	 */
	@Override
	public Endereco remove(Serializable primaryKey)
		throws NoSuchEnderecoException {

		Session session = null;

		try {
			session = openSession();

			Endereco endereco = (Endereco)session.get(
				EnderecoImpl.class, primaryKey);

			if (endereco == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEnderecoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(endereco);
		}
		catch (NoSuchEnderecoException noSuchEntityException) {
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
	protected Endereco removeImpl(Endereco endereco) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(endereco)) {
				endereco = (Endereco)session.get(
					EnderecoImpl.class, endereco.getPrimaryKeyObj());
			}

			if (endereco != null) {
				session.delete(endereco);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (endereco != null) {
			clearCache(endereco);
		}

		return endereco;
	}

	@Override
	public Endereco updateImpl(Endereco endereco) {
		boolean isNew = endereco.isNew();

		if (!(endereco instanceof EnderecoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(endereco.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(endereco);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in endereco proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Endereco implementation " +
					endereco.getClass());
		}

		EnderecoModelImpl enderecoModelImpl = (EnderecoModelImpl)endereco;

		if (Validator.isNull(endereco.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			endereco.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(endereco);
			}
			else {
				endereco = (Endereco)session.merge(endereco);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			EnderecoImpl.class, enderecoModelImpl, false, true);

		if (isNew) {
			endereco.setNew(false);
		}

		endereco.resetOriginalValues();

		return endereco;
	}

	/**
	 * Returns the endereco with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the endereco
	 * @return the endereco
	 * @throws NoSuchEnderecoException if a endereco with the primary key could not be found
	 */
	@Override
	public Endereco findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEnderecoException {

		Endereco endereco = fetchByPrimaryKey(primaryKey);

		if (endereco == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEnderecoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return endereco;
	}

	/**
	 * Returns the endereco with the primary key or throws a <code>NoSuchEnderecoException</code> if it could not be found.
	 *
	 * @param enderecoId the primary key of the endereco
	 * @return the endereco
	 * @throws NoSuchEnderecoException if a endereco with the primary key could not be found
	 */
	@Override
	public Endereco findByPrimaryKey(long enderecoId)
		throws NoSuchEnderecoException {

		return findByPrimaryKey((Serializable)enderecoId);
	}

	/**
	 * Returns the endereco with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param enderecoId the primary key of the endereco
	 * @return the endereco, or <code>null</code> if a endereco with the primary key could not be found
	 */
	@Override
	public Endereco fetchByPrimaryKey(long enderecoId) {
		return fetchByPrimaryKey((Serializable)enderecoId);
	}

	/**
	 * Returns all the enderecos.
	 *
	 * @return the enderecos
	 */
	@Override
	public List<Endereco> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the enderecos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @return the range of enderecos
	 */
	@Override
	public List<Endereco> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the enderecos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of enderecos
	 */
	@Override
	public List<Endereco> findAll(
		int start, int end, OrderByComparator<Endereco> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the enderecos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of enderecos
	 */
	@Override
	public List<Endereco> findAll(
		int start, int end, OrderByComparator<Endereco> orderByComparator,
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

		List<Endereco> list = null;

		if (useFinderCache) {
			list = (List<Endereco>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ENDERECO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ENDERECO;

				sql = sql.concat(EnderecoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Endereco>)QueryUtil.list(
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
	 * Removes all the enderecos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Endereco endereco : findAll()) {
			remove(endereco);
		}
	}

	/**
	 * Returns the number of enderecos.
	 *
	 * @return the number of enderecos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ENDERECO);

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
		return "enderecoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ENDERECO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EnderecoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the endereco persistence.
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

		EnderecoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		EnderecoUtil.setPersistence(null);

		entityCache.removeCache(EnderecoImpl.class.getName());
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

	private static final String _SQL_SELECT_ENDERECO =
		"SELECT endereco FROM Endereco endereco";

	private static final String _SQL_SELECT_ENDERECO_WHERE =
		"SELECT endereco FROM Endereco endereco WHERE ";

	private static final String _SQL_COUNT_ENDERECO =
		"SELECT COUNT(endereco) FROM Endereco endereco";

	private static final String _SQL_COUNT_ENDERECO_WHERE =
		"SELECT COUNT(endereco) FROM Endereco endereco WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "endereco.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Endereco exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Endereco exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		EnderecoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}