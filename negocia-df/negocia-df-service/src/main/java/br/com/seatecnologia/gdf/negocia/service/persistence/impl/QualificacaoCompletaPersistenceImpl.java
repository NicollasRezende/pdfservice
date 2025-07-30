/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchQualificacaoCompletaException;
import br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta;
import br.com.seatecnologia.gdf.negocia.model.QualificacaoCompletaTable;
import br.com.seatecnologia.gdf.negocia.model.impl.QualificacaoCompletaImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.QualificacaoCompletaModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.QualificacaoCompletaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.QualificacaoCompletaUtil;
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
 * The persistence implementation for the qualificacao completa service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QualificacaoCompletaPersistence.class)
public class QualificacaoCompletaPersistenceImpl
	extends BasePersistenceImpl<QualificacaoCompleta>
	implements QualificacaoCompletaPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QualificacaoCompletaUtil</code> to access the qualificacao completa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QualificacaoCompletaImpl.class.getName();

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
	 * Returns all the qualificacao completas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching qualificacao completas
	 */
	@Override
	public List<QualificacaoCompleta> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qualificacao completas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @return the range of matching qualificacao completas
	 */
	@Override
	public List<QualificacaoCompleta> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the qualificacao completas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qualificacao completas
	 */
	@Override
	public List<QualificacaoCompleta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QualificacaoCompleta> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the qualificacao completas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching qualificacao completas
	 */
	@Override
	public List<QualificacaoCompleta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QualificacaoCompleta> orderByComparator,
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

		List<QualificacaoCompleta> list = null;

		if (useFinderCache) {
			list = (List<QualificacaoCompleta>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QualificacaoCompleta qualificacaoCompleta : list) {
					if (!uuid.equals(qualificacaoCompleta.getUuid())) {
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

			sb.append(_SQL_SELECT_QUALIFICACAOCOMPLETA_WHERE);

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
				sb.append(QualificacaoCompletaModelImpl.ORDER_BY_JPQL);
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

				list = (List<QualificacaoCompleta>)QueryUtil.list(
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
	 * Returns the first qualificacao completa in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualificacao completa
	 * @throws NoSuchQualificacaoCompletaException if a matching qualificacao completa could not be found
	 */
	@Override
	public QualificacaoCompleta findByUuid_First(
			String uuid,
			OrderByComparator<QualificacaoCompleta> orderByComparator)
		throws NoSuchQualificacaoCompletaException {

		QualificacaoCompleta qualificacaoCompleta = fetchByUuid_First(
			uuid, orderByComparator);

		if (qualificacaoCompleta != null) {
			return qualificacaoCompleta;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchQualificacaoCompletaException(sb.toString());
	}

	/**
	 * Returns the first qualificacao completa in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualificacao completa, or <code>null</code> if a matching qualificacao completa could not be found
	 */
	@Override
	public QualificacaoCompleta fetchByUuid_First(
		String uuid,
		OrderByComparator<QualificacaoCompleta> orderByComparator) {

		List<QualificacaoCompleta> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qualificacao completa in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualificacao completa
	 * @throws NoSuchQualificacaoCompletaException if a matching qualificacao completa could not be found
	 */
	@Override
	public QualificacaoCompleta findByUuid_Last(
			String uuid,
			OrderByComparator<QualificacaoCompleta> orderByComparator)
		throws NoSuchQualificacaoCompletaException {

		QualificacaoCompleta qualificacaoCompleta = fetchByUuid_Last(
			uuid, orderByComparator);

		if (qualificacaoCompleta != null) {
			return qualificacaoCompleta;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchQualificacaoCompletaException(sb.toString());
	}

	/**
	 * Returns the last qualificacao completa in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualificacao completa, or <code>null</code> if a matching qualificacao completa could not be found
	 */
	@Override
	public QualificacaoCompleta fetchByUuid_Last(
		String uuid,
		OrderByComparator<QualificacaoCompleta> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<QualificacaoCompleta> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qualificacao completas before and after the current qualificacao completa in the ordered set where uuid = &#63;.
	 *
	 * @param qualificacaoId the primary key of the current qualificacao completa
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qualificacao completa
	 * @throws NoSuchQualificacaoCompletaException if a qualificacao completa with the primary key could not be found
	 */
	@Override
	public QualificacaoCompleta[] findByUuid_PrevAndNext(
			long qualificacaoId, String uuid,
			OrderByComparator<QualificacaoCompleta> orderByComparator)
		throws NoSuchQualificacaoCompletaException {

		uuid = Objects.toString(uuid, "");

		QualificacaoCompleta qualificacaoCompleta = findByPrimaryKey(
			qualificacaoId);

		Session session = null;

		try {
			session = openSession();

			QualificacaoCompleta[] array = new QualificacaoCompletaImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, qualificacaoCompleta, uuid, orderByComparator, true);

			array[1] = qualificacaoCompleta;

			array[2] = getByUuid_PrevAndNext(
				session, qualificacaoCompleta, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QualificacaoCompleta getByUuid_PrevAndNext(
		Session session, QualificacaoCompleta qualificacaoCompleta, String uuid,
		OrderByComparator<QualificacaoCompleta> orderByComparator,
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

		sb.append(_SQL_SELECT_QUALIFICACAOCOMPLETA_WHERE);

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
			sb.append(QualificacaoCompletaModelImpl.ORDER_BY_JPQL);
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
						qualificacaoCompleta)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QualificacaoCompleta> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qualificacao completas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (QualificacaoCompleta qualificacaoCompleta :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(qualificacaoCompleta);
		}
	}

	/**
	 * Returns the number of qualificacao completas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching qualificacao completas
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUALIFICACAOCOMPLETA_WHERE);

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
		"qualificacaoCompleta.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(qualificacaoCompleta.uuid IS NULL OR qualificacaoCompleta.uuid = '')";

	public QualificacaoCompletaPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(QualificacaoCompleta.class);

		setModelImplClass(QualificacaoCompletaImpl.class);
		setModelPKClass(long.class);

		setTable(QualificacaoCompletaTable.INSTANCE);
	}

	/**
	 * Caches the qualificacao completa in the entity cache if it is enabled.
	 *
	 * @param qualificacaoCompleta the qualificacao completa
	 */
	@Override
	public void cacheResult(QualificacaoCompleta qualificacaoCompleta) {
		entityCache.putResult(
			QualificacaoCompletaImpl.class,
			qualificacaoCompleta.getPrimaryKey(), qualificacaoCompleta);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the qualificacao completas in the entity cache if it is enabled.
	 *
	 * @param qualificacaoCompletas the qualificacao completas
	 */
	@Override
	public void cacheResult(List<QualificacaoCompleta> qualificacaoCompletas) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (qualificacaoCompletas.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QualificacaoCompleta qualificacaoCompleta :
				qualificacaoCompletas) {

			if (entityCache.getResult(
					QualificacaoCompletaImpl.class,
					qualificacaoCompleta.getPrimaryKey()) == null) {

				cacheResult(qualificacaoCompleta);
			}
		}
	}

	/**
	 * Clears the cache for all qualificacao completas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QualificacaoCompletaImpl.class);

		finderCache.clearCache(QualificacaoCompletaImpl.class);
	}

	/**
	 * Clears the cache for the qualificacao completa.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QualificacaoCompleta qualificacaoCompleta) {
		entityCache.removeResult(
			QualificacaoCompletaImpl.class, qualificacaoCompleta);
	}

	@Override
	public void clearCache(List<QualificacaoCompleta> qualificacaoCompletas) {
		for (QualificacaoCompleta qualificacaoCompleta :
				qualificacaoCompletas) {

			entityCache.removeResult(
				QualificacaoCompletaImpl.class, qualificacaoCompleta);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QualificacaoCompletaImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				QualificacaoCompletaImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new qualificacao completa with the primary key. Does not add the qualificacao completa to the database.
	 *
	 * @param qualificacaoId the primary key for the new qualificacao completa
	 * @return the new qualificacao completa
	 */
	@Override
	public QualificacaoCompleta create(long qualificacaoId) {
		QualificacaoCompleta qualificacaoCompleta =
			new QualificacaoCompletaImpl();

		qualificacaoCompleta.setNew(true);
		qualificacaoCompleta.setPrimaryKey(qualificacaoId);

		String uuid = PortalUUIDUtil.generate();

		qualificacaoCompleta.setUuid(uuid);

		return qualificacaoCompleta;
	}

	/**
	 * Removes the qualificacao completa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualificacaoId the primary key of the qualificacao completa
	 * @return the qualificacao completa that was removed
	 * @throws NoSuchQualificacaoCompletaException if a qualificacao completa with the primary key could not be found
	 */
	@Override
	public QualificacaoCompleta remove(long qualificacaoId)
		throws NoSuchQualificacaoCompletaException {

		return remove((Serializable)qualificacaoId);
	}

	/**
	 * Removes the qualificacao completa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qualificacao completa
	 * @return the qualificacao completa that was removed
	 * @throws NoSuchQualificacaoCompletaException if a qualificacao completa with the primary key could not be found
	 */
	@Override
	public QualificacaoCompleta remove(Serializable primaryKey)
		throws NoSuchQualificacaoCompletaException {

		Session session = null;

		try {
			session = openSession();

			QualificacaoCompleta qualificacaoCompleta =
				(QualificacaoCompleta)session.get(
					QualificacaoCompletaImpl.class, primaryKey);

			if (qualificacaoCompleta == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQualificacaoCompletaException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(qualificacaoCompleta);
		}
		catch (NoSuchQualificacaoCompletaException noSuchEntityException) {
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
	protected QualificacaoCompleta removeImpl(
		QualificacaoCompleta qualificacaoCompleta) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qualificacaoCompleta)) {
				qualificacaoCompleta = (QualificacaoCompleta)session.get(
					QualificacaoCompletaImpl.class,
					qualificacaoCompleta.getPrimaryKeyObj());
			}

			if (qualificacaoCompleta != null) {
				session.delete(qualificacaoCompleta);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (qualificacaoCompleta != null) {
			clearCache(qualificacaoCompleta);
		}

		return qualificacaoCompleta;
	}

	@Override
	public QualificacaoCompleta updateImpl(
		QualificacaoCompleta qualificacaoCompleta) {

		boolean isNew = qualificacaoCompleta.isNew();

		if (!(qualificacaoCompleta instanceof QualificacaoCompletaModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(qualificacaoCompleta.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					qualificacaoCompleta);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in qualificacaoCompleta proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QualificacaoCompleta implementation " +
					qualificacaoCompleta.getClass());
		}

		QualificacaoCompletaModelImpl qualificacaoCompletaModelImpl =
			(QualificacaoCompletaModelImpl)qualificacaoCompleta;

		if (Validator.isNull(qualificacaoCompleta.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			qualificacaoCompleta.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(qualificacaoCompleta);
			}
			else {
				qualificacaoCompleta = (QualificacaoCompleta)session.merge(
					qualificacaoCompleta);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QualificacaoCompletaImpl.class, qualificacaoCompletaModelImpl,
			false, true);

		if (isNew) {
			qualificacaoCompleta.setNew(false);
		}

		qualificacaoCompleta.resetOriginalValues();

		return qualificacaoCompleta;
	}

	/**
	 * Returns the qualificacao completa with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qualificacao completa
	 * @return the qualificacao completa
	 * @throws NoSuchQualificacaoCompletaException if a qualificacao completa with the primary key could not be found
	 */
	@Override
	public QualificacaoCompleta findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQualificacaoCompletaException {

		QualificacaoCompleta qualificacaoCompleta = fetchByPrimaryKey(
			primaryKey);

		if (qualificacaoCompleta == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQualificacaoCompletaException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return qualificacaoCompleta;
	}

	/**
	 * Returns the qualificacao completa with the primary key or throws a <code>NoSuchQualificacaoCompletaException</code> if it could not be found.
	 *
	 * @param qualificacaoId the primary key of the qualificacao completa
	 * @return the qualificacao completa
	 * @throws NoSuchQualificacaoCompletaException if a qualificacao completa with the primary key could not be found
	 */
	@Override
	public QualificacaoCompleta findByPrimaryKey(long qualificacaoId)
		throws NoSuchQualificacaoCompletaException {

		return findByPrimaryKey((Serializable)qualificacaoId);
	}

	/**
	 * Returns the qualificacao completa with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualificacaoId the primary key of the qualificacao completa
	 * @return the qualificacao completa, or <code>null</code> if a qualificacao completa with the primary key could not be found
	 */
	@Override
	public QualificacaoCompleta fetchByPrimaryKey(long qualificacaoId) {
		return fetchByPrimaryKey((Serializable)qualificacaoId);
	}

	/**
	 * Returns all the qualificacao completas.
	 *
	 * @return the qualificacao completas
	 */
	@Override
	public List<QualificacaoCompleta> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qualificacao completas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @return the range of qualificacao completas
	 */
	@Override
	public List<QualificacaoCompleta> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qualificacao completas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qualificacao completas
	 */
	@Override
	public List<QualificacaoCompleta> findAll(
		int start, int end,
		OrderByComparator<QualificacaoCompleta> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the qualificacao completas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of qualificacao completas
	 */
	@Override
	public List<QualificacaoCompleta> findAll(
		int start, int end,
		OrderByComparator<QualificacaoCompleta> orderByComparator,
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

		List<QualificacaoCompleta> list = null;

		if (useFinderCache) {
			list = (List<QualificacaoCompleta>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUALIFICACAOCOMPLETA);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUALIFICACAOCOMPLETA;

				sql = sql.concat(QualificacaoCompletaModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QualificacaoCompleta>)QueryUtil.list(
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
	 * Removes all the qualificacao completas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QualificacaoCompleta qualificacaoCompleta : findAll()) {
			remove(qualificacaoCompleta);
		}
	}

	/**
	 * Returns the number of qualificacao completas.
	 *
	 * @return the number of qualificacao completas
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
					_SQL_COUNT_QUALIFICACAOCOMPLETA);

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
		return "qualificacaoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUALIFICACAOCOMPLETA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QualificacaoCompletaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the qualificacao completa persistence.
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

		QualificacaoCompletaUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QualificacaoCompletaUtil.setPersistence(null);

		entityCache.removeCache(QualificacaoCompletaImpl.class.getName());
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

	private static final String _SQL_SELECT_QUALIFICACAOCOMPLETA =
		"SELECT qualificacaoCompleta FROM QualificacaoCompleta qualificacaoCompleta";

	private static final String _SQL_SELECT_QUALIFICACAOCOMPLETA_WHERE =
		"SELECT qualificacaoCompleta FROM QualificacaoCompleta qualificacaoCompleta WHERE ";

	private static final String _SQL_COUNT_QUALIFICACAOCOMPLETA =
		"SELECT COUNT(qualificacaoCompleta) FROM QualificacaoCompleta qualificacaoCompleta";

	private static final String _SQL_COUNT_QUALIFICACAOCOMPLETA_WHERE =
		"SELECT COUNT(qualificacaoCompleta) FROM QualificacaoCompleta qualificacaoCompleta WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"qualificacaoCompleta.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QualificacaoCompleta exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QualificacaoCompleta exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QualificacaoCompletaPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}