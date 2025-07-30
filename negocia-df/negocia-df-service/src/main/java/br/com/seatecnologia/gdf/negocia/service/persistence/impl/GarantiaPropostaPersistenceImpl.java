/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchGarantiaPropostaException;
import br.com.seatecnologia.gdf.negocia.model.GarantiaProposta;
import br.com.seatecnologia.gdf.negocia.model.GarantiaPropostaTable;
import br.com.seatecnologia.gdf.negocia.model.impl.GarantiaPropostaImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.GarantiaPropostaModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.GarantiaPropostaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.GarantiaPropostaUtil;
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
 * The persistence implementation for the garantia proposta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = GarantiaPropostaPersistence.class)
public class GarantiaPropostaPersistenceImpl
	extends BasePersistenceImpl<GarantiaProposta>
	implements GarantiaPropostaPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>GarantiaPropostaUtil</code> to access the garantia proposta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		GarantiaPropostaImpl.class.getName();

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
	 * Returns all the garantia propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching garantia propostas
	 */
	@Override
	public List<GarantiaProposta> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the garantia propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @return the range of matching garantia propostas
	 */
	@Override
	public List<GarantiaProposta> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the garantia propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching garantia propostas
	 */
	@Override
	public List<GarantiaProposta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<GarantiaProposta> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the garantia propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching garantia propostas
	 */
	@Override
	public List<GarantiaProposta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<GarantiaProposta> orderByComparator,
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

		List<GarantiaProposta> list = null;

		if (useFinderCache) {
			list = (List<GarantiaProposta>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (GarantiaProposta garantiaProposta : list) {
					if (!uuid.equals(garantiaProposta.getUuid())) {
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

			sb.append(_SQL_SELECT_GARANTIAPROPOSTA_WHERE);

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
				sb.append(GarantiaPropostaModelImpl.ORDER_BY_JPQL);
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

				list = (List<GarantiaProposta>)QueryUtil.list(
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
	 * Returns the first garantia proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching garantia proposta
	 * @throws NoSuchGarantiaPropostaException if a matching garantia proposta could not be found
	 */
	@Override
	public GarantiaProposta findByUuid_First(
			String uuid, OrderByComparator<GarantiaProposta> orderByComparator)
		throws NoSuchGarantiaPropostaException {

		GarantiaProposta garantiaProposta = fetchByUuid_First(
			uuid, orderByComparator);

		if (garantiaProposta != null) {
			return garantiaProposta;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchGarantiaPropostaException(sb.toString());
	}

	/**
	 * Returns the first garantia proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching garantia proposta, or <code>null</code> if a matching garantia proposta could not be found
	 */
	@Override
	public GarantiaProposta fetchByUuid_First(
		String uuid, OrderByComparator<GarantiaProposta> orderByComparator) {

		List<GarantiaProposta> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last garantia proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching garantia proposta
	 * @throws NoSuchGarantiaPropostaException if a matching garantia proposta could not be found
	 */
	@Override
	public GarantiaProposta findByUuid_Last(
			String uuid, OrderByComparator<GarantiaProposta> orderByComparator)
		throws NoSuchGarantiaPropostaException {

		GarantiaProposta garantiaProposta = fetchByUuid_Last(
			uuid, orderByComparator);

		if (garantiaProposta != null) {
			return garantiaProposta;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchGarantiaPropostaException(sb.toString());
	}

	/**
	 * Returns the last garantia proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching garantia proposta, or <code>null</code> if a matching garantia proposta could not be found
	 */
	@Override
	public GarantiaProposta fetchByUuid_Last(
		String uuid, OrderByComparator<GarantiaProposta> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<GarantiaProposta> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the garantia propostas before and after the current garantia proposta in the ordered set where uuid = &#63;.
	 *
	 * @param garantiaPropostaId the primary key of the current garantia proposta
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next garantia proposta
	 * @throws NoSuchGarantiaPropostaException if a garantia proposta with the primary key could not be found
	 */
	@Override
	public GarantiaProposta[] findByUuid_PrevAndNext(
			long garantiaPropostaId, String uuid,
			OrderByComparator<GarantiaProposta> orderByComparator)
		throws NoSuchGarantiaPropostaException {

		uuid = Objects.toString(uuid, "");

		GarantiaProposta garantiaProposta = findByPrimaryKey(
			garantiaPropostaId);

		Session session = null;

		try {
			session = openSession();

			GarantiaProposta[] array = new GarantiaPropostaImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, garantiaProposta, uuid, orderByComparator, true);

			array[1] = garantiaProposta;

			array[2] = getByUuid_PrevAndNext(
				session, garantiaProposta, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected GarantiaProposta getByUuid_PrevAndNext(
		Session session, GarantiaProposta garantiaProposta, String uuid,
		OrderByComparator<GarantiaProposta> orderByComparator,
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

		sb.append(_SQL_SELECT_GARANTIAPROPOSTA_WHERE);

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
			sb.append(GarantiaPropostaModelImpl.ORDER_BY_JPQL);
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
						garantiaProposta)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<GarantiaProposta> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the garantia propostas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (GarantiaProposta garantiaProposta :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(garantiaProposta);
		}
	}

	/**
	 * Returns the number of garantia propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching garantia propostas
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_GARANTIAPROPOSTA_WHERE);

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
		"garantiaProposta.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(garantiaProposta.uuid IS NULL OR garantiaProposta.uuid = '')";

	public GarantiaPropostaPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(GarantiaProposta.class);

		setModelImplClass(GarantiaPropostaImpl.class);
		setModelPKClass(long.class);

		setTable(GarantiaPropostaTable.INSTANCE);
	}

	/**
	 * Caches the garantia proposta in the entity cache if it is enabled.
	 *
	 * @param garantiaProposta the garantia proposta
	 */
	@Override
	public void cacheResult(GarantiaProposta garantiaProposta) {
		entityCache.putResult(
			GarantiaPropostaImpl.class, garantiaProposta.getPrimaryKey(),
			garantiaProposta);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the garantia propostas in the entity cache if it is enabled.
	 *
	 * @param garantiaPropostas the garantia propostas
	 */
	@Override
	public void cacheResult(List<GarantiaProposta> garantiaPropostas) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (garantiaPropostas.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (GarantiaProposta garantiaProposta : garantiaPropostas) {
			if (entityCache.getResult(
					GarantiaPropostaImpl.class,
					garantiaProposta.getPrimaryKey()) == null) {

				cacheResult(garantiaProposta);
			}
		}
	}

	/**
	 * Clears the cache for all garantia propostas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(GarantiaPropostaImpl.class);

		finderCache.clearCache(GarantiaPropostaImpl.class);
	}

	/**
	 * Clears the cache for the garantia proposta.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(GarantiaProposta garantiaProposta) {
		entityCache.removeResult(GarantiaPropostaImpl.class, garantiaProposta);
	}

	@Override
	public void clearCache(List<GarantiaProposta> garantiaPropostas) {
		for (GarantiaProposta garantiaProposta : garantiaPropostas) {
			entityCache.removeResult(
				GarantiaPropostaImpl.class, garantiaProposta);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(GarantiaPropostaImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(GarantiaPropostaImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new garantia proposta with the primary key. Does not add the garantia proposta to the database.
	 *
	 * @param garantiaPropostaId the primary key for the new garantia proposta
	 * @return the new garantia proposta
	 */
	@Override
	public GarantiaProposta create(long garantiaPropostaId) {
		GarantiaProposta garantiaProposta = new GarantiaPropostaImpl();

		garantiaProposta.setNew(true);
		garantiaProposta.setPrimaryKey(garantiaPropostaId);

		String uuid = PortalUUIDUtil.generate();

		garantiaProposta.setUuid(uuid);

		return garantiaProposta;
	}

	/**
	 * Removes the garantia proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param garantiaPropostaId the primary key of the garantia proposta
	 * @return the garantia proposta that was removed
	 * @throws NoSuchGarantiaPropostaException if a garantia proposta with the primary key could not be found
	 */
	@Override
	public GarantiaProposta remove(long garantiaPropostaId)
		throws NoSuchGarantiaPropostaException {

		return remove((Serializable)garantiaPropostaId);
	}

	/**
	 * Removes the garantia proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the garantia proposta
	 * @return the garantia proposta that was removed
	 * @throws NoSuchGarantiaPropostaException if a garantia proposta with the primary key could not be found
	 */
	@Override
	public GarantiaProposta remove(Serializable primaryKey)
		throws NoSuchGarantiaPropostaException {

		Session session = null;

		try {
			session = openSession();

			GarantiaProposta garantiaProposta = (GarantiaProposta)session.get(
				GarantiaPropostaImpl.class, primaryKey);

			if (garantiaProposta == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchGarantiaPropostaException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(garantiaProposta);
		}
		catch (NoSuchGarantiaPropostaException noSuchEntityException) {
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
	protected GarantiaProposta removeImpl(GarantiaProposta garantiaProposta) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(garantiaProposta)) {
				garantiaProposta = (GarantiaProposta)session.get(
					GarantiaPropostaImpl.class,
					garantiaProposta.getPrimaryKeyObj());
			}

			if (garantiaProposta != null) {
				session.delete(garantiaProposta);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (garantiaProposta != null) {
			clearCache(garantiaProposta);
		}

		return garantiaProposta;
	}

	@Override
	public GarantiaProposta updateImpl(GarantiaProposta garantiaProposta) {
		boolean isNew = garantiaProposta.isNew();

		if (!(garantiaProposta instanceof GarantiaPropostaModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(garantiaProposta.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					garantiaProposta);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in garantiaProposta proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom GarantiaProposta implementation " +
					garantiaProposta.getClass());
		}

		GarantiaPropostaModelImpl garantiaPropostaModelImpl =
			(GarantiaPropostaModelImpl)garantiaProposta;

		if (Validator.isNull(garantiaProposta.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			garantiaProposta.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(garantiaProposta);
			}
			else {
				garantiaProposta = (GarantiaProposta)session.merge(
					garantiaProposta);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			GarantiaPropostaImpl.class, garantiaPropostaModelImpl, false, true);

		if (isNew) {
			garantiaProposta.setNew(false);
		}

		garantiaProposta.resetOriginalValues();

		return garantiaProposta;
	}

	/**
	 * Returns the garantia proposta with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the garantia proposta
	 * @return the garantia proposta
	 * @throws NoSuchGarantiaPropostaException if a garantia proposta with the primary key could not be found
	 */
	@Override
	public GarantiaProposta findByPrimaryKey(Serializable primaryKey)
		throws NoSuchGarantiaPropostaException {

		GarantiaProposta garantiaProposta = fetchByPrimaryKey(primaryKey);

		if (garantiaProposta == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchGarantiaPropostaException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return garantiaProposta;
	}

	/**
	 * Returns the garantia proposta with the primary key or throws a <code>NoSuchGarantiaPropostaException</code> if it could not be found.
	 *
	 * @param garantiaPropostaId the primary key of the garantia proposta
	 * @return the garantia proposta
	 * @throws NoSuchGarantiaPropostaException if a garantia proposta with the primary key could not be found
	 */
	@Override
	public GarantiaProposta findByPrimaryKey(long garantiaPropostaId)
		throws NoSuchGarantiaPropostaException {

		return findByPrimaryKey((Serializable)garantiaPropostaId);
	}

	/**
	 * Returns the garantia proposta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param garantiaPropostaId the primary key of the garantia proposta
	 * @return the garantia proposta, or <code>null</code> if a garantia proposta with the primary key could not be found
	 */
	@Override
	public GarantiaProposta fetchByPrimaryKey(long garantiaPropostaId) {
		return fetchByPrimaryKey((Serializable)garantiaPropostaId);
	}

	/**
	 * Returns all the garantia propostas.
	 *
	 * @return the garantia propostas
	 */
	@Override
	public List<GarantiaProposta> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the garantia propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @return the range of garantia propostas
	 */
	@Override
	public List<GarantiaProposta> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the garantia propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of garantia propostas
	 */
	@Override
	public List<GarantiaProposta> findAll(
		int start, int end,
		OrderByComparator<GarantiaProposta> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the garantia propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of garantia propostas
	 */
	@Override
	public List<GarantiaProposta> findAll(
		int start, int end,
		OrderByComparator<GarantiaProposta> orderByComparator,
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

		List<GarantiaProposta> list = null;

		if (useFinderCache) {
			list = (List<GarantiaProposta>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_GARANTIAPROPOSTA);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_GARANTIAPROPOSTA;

				sql = sql.concat(GarantiaPropostaModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<GarantiaProposta>)QueryUtil.list(
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
	 * Removes all the garantia propostas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (GarantiaProposta garantiaProposta : findAll()) {
			remove(garantiaProposta);
		}
	}

	/**
	 * Returns the number of garantia propostas.
	 *
	 * @return the number of garantia propostas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_GARANTIAPROPOSTA);

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
		return "garantiaPropostaId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_GARANTIAPROPOSTA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return GarantiaPropostaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the garantia proposta persistence.
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

		GarantiaPropostaUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		GarantiaPropostaUtil.setPersistence(null);

		entityCache.removeCache(GarantiaPropostaImpl.class.getName());
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

	private static final String _SQL_SELECT_GARANTIAPROPOSTA =
		"SELECT garantiaProposta FROM GarantiaProposta garantiaProposta";

	private static final String _SQL_SELECT_GARANTIAPROPOSTA_WHERE =
		"SELECT garantiaProposta FROM GarantiaProposta garantiaProposta WHERE ";

	private static final String _SQL_COUNT_GARANTIAPROPOSTA =
		"SELECT COUNT(garantiaProposta) FROM GarantiaProposta garantiaProposta";

	private static final String _SQL_COUNT_GARANTIAPROPOSTA_WHERE =
		"SELECT COUNT(garantiaProposta) FROM GarantiaProposta garantiaProposta WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "garantiaProposta.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No GarantiaProposta exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No GarantiaProposta exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		GarantiaPropostaPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}