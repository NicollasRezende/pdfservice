/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDemonstracaoDocumentosException;
import br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos;
import br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentosTable;
import br.com.seatecnologia.gdf.negocia.model.impl.DemonstracaoDocumentosImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.DemonstracaoDocumentosModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.DemonstracaoDocumentosPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DemonstracaoDocumentosUtil;
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
 * The persistence implementation for the demonstracao documentos service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = DemonstracaoDocumentosPersistence.class)
public class DemonstracaoDocumentosPersistenceImpl
	extends BasePersistenceImpl<DemonstracaoDocumentos>
	implements DemonstracaoDocumentosPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DemonstracaoDocumentosUtil</code> to access the demonstracao documentos persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DemonstracaoDocumentosImpl.class.getName();

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
	 * Returns all the demonstracao documentoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching demonstracao documentoses
	 */
	@Override
	public List<DemonstracaoDocumentos> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the demonstracao documentoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @return the range of matching demonstracao documentoses
	 */
	@Override
	public List<DemonstracaoDocumentos> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the demonstracao documentoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demonstracao documentoses
	 */
	@Override
	public List<DemonstracaoDocumentos> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the demonstracao documentoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demonstracao documentoses
	 */
	@Override
	public List<DemonstracaoDocumentos> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator,
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

		List<DemonstracaoDocumentos> list = null;

		if (useFinderCache) {
			list = (List<DemonstracaoDocumentos>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DemonstracaoDocumentos demonstracaoDocumentos : list) {
					if (!uuid.equals(demonstracaoDocumentos.getUuid())) {
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

			sb.append(_SQL_SELECT_DEMONSTRACAODOCUMENTOS_WHERE);

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
				sb.append(DemonstracaoDocumentosModelImpl.ORDER_BY_JPQL);
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

				list = (List<DemonstracaoDocumentos>)QueryUtil.list(
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
	 * Returns the first demonstracao documentos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a matching demonstracao documentos could not be found
	 */
	@Override
	public DemonstracaoDocumentos findByUuid_First(
			String uuid,
			OrderByComparator<DemonstracaoDocumentos> orderByComparator)
		throws NoSuchDemonstracaoDocumentosException {

		DemonstracaoDocumentos demonstracaoDocumentos = fetchByUuid_First(
			uuid, orderByComparator);

		if (demonstracaoDocumentos != null) {
			return demonstracaoDocumentos;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDemonstracaoDocumentosException(sb.toString());
	}

	/**
	 * Returns the first demonstracao documentos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao documentos, or <code>null</code> if a matching demonstracao documentos could not be found
	 */
	@Override
	public DemonstracaoDocumentos fetchByUuid_First(
		String uuid,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator) {

		List<DemonstracaoDocumentos> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last demonstracao documentos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a matching demonstracao documentos could not be found
	 */
	@Override
	public DemonstracaoDocumentos findByUuid_Last(
			String uuid,
			OrderByComparator<DemonstracaoDocumentos> orderByComparator)
		throws NoSuchDemonstracaoDocumentosException {

		DemonstracaoDocumentos demonstracaoDocumentos = fetchByUuid_Last(
			uuid, orderByComparator);

		if (demonstracaoDocumentos != null) {
			return demonstracaoDocumentos;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDemonstracaoDocumentosException(sb.toString());
	}

	/**
	 * Returns the last demonstracao documentos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao documentos, or <code>null</code> if a matching demonstracao documentos could not be found
	 */
	@Override
	public DemonstracaoDocumentos fetchByUuid_Last(
		String uuid,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<DemonstracaoDocumentos> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the demonstracao documentoses before and after the current demonstracao documentos in the ordered set where uuid = &#63;.
	 *
	 * @param demonstracaoDocumentosId the primary key of the current demonstracao documentos
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a demonstracao documentos with the primary key could not be found
	 */
	@Override
	public DemonstracaoDocumentos[] findByUuid_PrevAndNext(
			long demonstracaoDocumentosId, String uuid,
			OrderByComparator<DemonstracaoDocumentos> orderByComparator)
		throws NoSuchDemonstracaoDocumentosException {

		uuid = Objects.toString(uuid, "");

		DemonstracaoDocumentos demonstracaoDocumentos = findByPrimaryKey(
			demonstracaoDocumentosId);

		Session session = null;

		try {
			session = openSession();

			DemonstracaoDocumentos[] array = new DemonstracaoDocumentosImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, demonstracaoDocumentos, uuid, orderByComparator, true);

			array[1] = demonstracaoDocumentos;

			array[2] = getByUuid_PrevAndNext(
				session, demonstracaoDocumentos, uuid, orderByComparator,
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

	protected DemonstracaoDocumentos getByUuid_PrevAndNext(
		Session session, DemonstracaoDocumentos demonstracaoDocumentos,
		String uuid,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator,
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

		sb.append(_SQL_SELECT_DEMONSTRACAODOCUMENTOS_WHERE);

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
			sb.append(DemonstracaoDocumentosModelImpl.ORDER_BY_JPQL);
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
						demonstracaoDocumentos)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DemonstracaoDocumentos> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the demonstracao documentoses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (DemonstracaoDocumentos demonstracaoDocumentos :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(demonstracaoDocumentos);
		}
	}

	/**
	 * Returns the number of demonstracao documentoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching demonstracao documentoses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DEMONSTRACAODOCUMENTOS_WHERE);

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
		"demonstracaoDocumentos.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(demonstracaoDocumentos.uuid IS NULL OR demonstracaoDocumentos.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByDemonstracaoId;
	private FinderPath _finderPathWithoutPaginationFindByDemonstracaoId;
	private FinderPath _finderPathCountByDemonstracaoId;

	/**
	 * Returns all the demonstracao documentoses where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @return the matching demonstracao documentoses
	 */
	@Override
	public List<DemonstracaoDocumentos> findByDemonstracaoId(
		long demonstracaoId) {

		return findByDemonstracaoId(
			demonstracaoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the demonstracao documentoses where demonstracaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @return the range of matching demonstracao documentoses
	 */
	@Override
	public List<DemonstracaoDocumentos> findByDemonstracaoId(
		long demonstracaoId, int start, int end) {

		return findByDemonstracaoId(demonstracaoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the demonstracao documentoses where demonstracaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demonstracao documentoses
	 */
	@Override
	public List<DemonstracaoDocumentos> findByDemonstracaoId(
		long demonstracaoId, int start, int end,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator) {

		return findByDemonstracaoId(
			demonstracaoId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the demonstracao documentoses where demonstracaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demonstracao documentoses
	 */
	@Override
	public List<DemonstracaoDocumentos> findByDemonstracaoId(
		long demonstracaoId, int start, int end,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByDemonstracaoId;
				finderArgs = new Object[] {demonstracaoId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByDemonstracaoId;
			finderArgs = new Object[] {
				demonstracaoId, start, end, orderByComparator
			};
		}

		List<DemonstracaoDocumentos> list = null;

		if (useFinderCache) {
			list = (List<DemonstracaoDocumentos>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DemonstracaoDocumentos demonstracaoDocumentos : list) {
					if (demonstracaoId !=
							demonstracaoDocumentos.getDemonstracaoId()) {

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

			sb.append(_SQL_SELECT_DEMONSTRACAODOCUMENTOS_WHERE);

			sb.append(_FINDER_COLUMN_DEMONSTRACAOID_DEMONSTRACAOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(DemonstracaoDocumentosModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(demonstracaoId);

				list = (List<DemonstracaoDocumentos>)QueryUtil.list(
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
	 * Returns the first demonstracao documentos in the ordered set where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a matching demonstracao documentos could not be found
	 */
	@Override
	public DemonstracaoDocumentos findByDemonstracaoId_First(
			long demonstracaoId,
			OrderByComparator<DemonstracaoDocumentos> orderByComparator)
		throws NoSuchDemonstracaoDocumentosException {

		DemonstracaoDocumentos demonstracaoDocumentos =
			fetchByDemonstracaoId_First(demonstracaoId, orderByComparator);

		if (demonstracaoDocumentos != null) {
			return demonstracaoDocumentos;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("demonstracaoId=");
		sb.append(demonstracaoId);

		sb.append("}");

		throw new NoSuchDemonstracaoDocumentosException(sb.toString());
	}

	/**
	 * Returns the first demonstracao documentos in the ordered set where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao documentos, or <code>null</code> if a matching demonstracao documentos could not be found
	 */
	@Override
	public DemonstracaoDocumentos fetchByDemonstracaoId_First(
		long demonstracaoId,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator) {

		List<DemonstracaoDocumentos> list = findByDemonstracaoId(
			demonstracaoId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last demonstracao documentos in the ordered set where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a matching demonstracao documentos could not be found
	 */
	@Override
	public DemonstracaoDocumentos findByDemonstracaoId_Last(
			long demonstracaoId,
			OrderByComparator<DemonstracaoDocumentos> orderByComparator)
		throws NoSuchDemonstracaoDocumentosException {

		DemonstracaoDocumentos demonstracaoDocumentos =
			fetchByDemonstracaoId_Last(demonstracaoId, orderByComparator);

		if (demonstracaoDocumentos != null) {
			return demonstracaoDocumentos;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("demonstracaoId=");
		sb.append(demonstracaoId);

		sb.append("}");

		throw new NoSuchDemonstracaoDocumentosException(sb.toString());
	}

	/**
	 * Returns the last demonstracao documentos in the ordered set where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao documentos, or <code>null</code> if a matching demonstracao documentos could not be found
	 */
	@Override
	public DemonstracaoDocumentos fetchByDemonstracaoId_Last(
		long demonstracaoId,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator) {

		int count = countByDemonstracaoId(demonstracaoId);

		if (count == 0) {
			return null;
		}

		List<DemonstracaoDocumentos> list = findByDemonstracaoId(
			demonstracaoId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the demonstracao documentoses before and after the current demonstracao documentos in the ordered set where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoDocumentosId the primary key of the current demonstracao documentos
	 * @param demonstracaoId the demonstracao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a demonstracao documentos with the primary key could not be found
	 */
	@Override
	public DemonstracaoDocumentos[] findByDemonstracaoId_PrevAndNext(
			long demonstracaoDocumentosId, long demonstracaoId,
			OrderByComparator<DemonstracaoDocumentos> orderByComparator)
		throws NoSuchDemonstracaoDocumentosException {

		DemonstracaoDocumentos demonstracaoDocumentos = findByPrimaryKey(
			demonstracaoDocumentosId);

		Session session = null;

		try {
			session = openSession();

			DemonstracaoDocumentos[] array = new DemonstracaoDocumentosImpl[3];

			array[0] = getByDemonstracaoId_PrevAndNext(
				session, demonstracaoDocumentos, demonstracaoId,
				orderByComparator, true);

			array[1] = demonstracaoDocumentos;

			array[2] = getByDemonstracaoId_PrevAndNext(
				session, demonstracaoDocumentos, demonstracaoId,
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

	protected DemonstracaoDocumentos getByDemonstracaoId_PrevAndNext(
		Session session, DemonstracaoDocumentos demonstracaoDocumentos,
		long demonstracaoId,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator,
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

		sb.append(_SQL_SELECT_DEMONSTRACAODOCUMENTOS_WHERE);

		sb.append(_FINDER_COLUMN_DEMONSTRACAOID_DEMONSTRACAOID_2);

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
			sb.append(DemonstracaoDocumentosModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(demonstracaoId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						demonstracaoDocumentos)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DemonstracaoDocumentos> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the demonstracao documentoses where demonstracaoId = &#63; from the database.
	 *
	 * @param demonstracaoId the demonstracao ID
	 */
	@Override
	public void removeByDemonstracaoId(long demonstracaoId) {
		for (DemonstracaoDocumentos demonstracaoDocumentos :
				findByDemonstracaoId(
					demonstracaoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(demonstracaoDocumentos);
		}
	}

	/**
	 * Returns the number of demonstracao documentoses where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @return the number of matching demonstracao documentoses
	 */
	@Override
	public int countByDemonstracaoId(long demonstracaoId) {
		FinderPath finderPath = _finderPathCountByDemonstracaoId;

		Object[] finderArgs = new Object[] {demonstracaoId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DEMONSTRACAODOCUMENTOS_WHERE);

			sb.append(_FINDER_COLUMN_DEMONSTRACAOID_DEMONSTRACAOID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(demonstracaoId);

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

	private static final String _FINDER_COLUMN_DEMONSTRACAOID_DEMONSTRACAOID_2 =
		"demonstracaoDocumentos.demonstracaoId = ?";

	public DemonstracaoDocumentosPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(DemonstracaoDocumentos.class);

		setModelImplClass(DemonstracaoDocumentosImpl.class);
		setModelPKClass(long.class);

		setTable(DemonstracaoDocumentosTable.INSTANCE);
	}

	/**
	 * Caches the demonstracao documentos in the entity cache if it is enabled.
	 *
	 * @param demonstracaoDocumentos the demonstracao documentos
	 */
	@Override
	public void cacheResult(DemonstracaoDocumentos demonstracaoDocumentos) {
		entityCache.putResult(
			DemonstracaoDocumentosImpl.class,
			demonstracaoDocumentos.getPrimaryKey(), demonstracaoDocumentos);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the demonstracao documentoses in the entity cache if it is enabled.
	 *
	 * @param demonstracaoDocumentoses the demonstracao documentoses
	 */
	@Override
	public void cacheResult(
		List<DemonstracaoDocumentos> demonstracaoDocumentoses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (demonstracaoDocumentoses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (DemonstracaoDocumentos demonstracaoDocumentos :
				demonstracaoDocumentoses) {

			if (entityCache.getResult(
					DemonstracaoDocumentosImpl.class,
					demonstracaoDocumentos.getPrimaryKey()) == null) {

				cacheResult(demonstracaoDocumentos);
			}
		}
	}

	/**
	 * Clears the cache for all demonstracao documentoses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DemonstracaoDocumentosImpl.class);

		finderCache.clearCache(DemonstracaoDocumentosImpl.class);
	}

	/**
	 * Clears the cache for the demonstracao documentos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DemonstracaoDocumentos demonstracaoDocumentos) {
		entityCache.removeResult(
			DemonstracaoDocumentosImpl.class, demonstracaoDocumentos);
	}

	@Override
	public void clearCache(
		List<DemonstracaoDocumentos> demonstracaoDocumentoses) {

		for (DemonstracaoDocumentos demonstracaoDocumentos :
				demonstracaoDocumentoses) {

			entityCache.removeResult(
				DemonstracaoDocumentosImpl.class, demonstracaoDocumentos);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DemonstracaoDocumentosImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				DemonstracaoDocumentosImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new demonstracao documentos with the primary key. Does not add the demonstracao documentos to the database.
	 *
	 * @param demonstracaoDocumentosId the primary key for the new demonstracao documentos
	 * @return the new demonstracao documentos
	 */
	@Override
	public DemonstracaoDocumentos create(long demonstracaoDocumentosId) {
		DemonstracaoDocumentos demonstracaoDocumentos =
			new DemonstracaoDocumentosImpl();

		demonstracaoDocumentos.setNew(true);
		demonstracaoDocumentos.setPrimaryKey(demonstracaoDocumentosId);

		String uuid = PortalUUIDUtil.generate();

		demonstracaoDocumentos.setUuid(uuid);

		return demonstracaoDocumentos;
	}

	/**
	 * Removes the demonstracao documentos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param demonstracaoDocumentosId the primary key of the demonstracao documentos
	 * @return the demonstracao documentos that was removed
	 * @throws NoSuchDemonstracaoDocumentosException if a demonstracao documentos with the primary key could not be found
	 */
	@Override
	public DemonstracaoDocumentos remove(long demonstracaoDocumentosId)
		throws NoSuchDemonstracaoDocumentosException {

		return remove((Serializable)demonstracaoDocumentosId);
	}

	/**
	 * Removes the demonstracao documentos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the demonstracao documentos
	 * @return the demonstracao documentos that was removed
	 * @throws NoSuchDemonstracaoDocumentosException if a demonstracao documentos with the primary key could not be found
	 */
	@Override
	public DemonstracaoDocumentos remove(Serializable primaryKey)
		throws NoSuchDemonstracaoDocumentosException {

		Session session = null;

		try {
			session = openSession();

			DemonstracaoDocumentos demonstracaoDocumentos =
				(DemonstracaoDocumentos)session.get(
					DemonstracaoDocumentosImpl.class, primaryKey);

			if (demonstracaoDocumentos == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDemonstracaoDocumentosException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(demonstracaoDocumentos);
		}
		catch (NoSuchDemonstracaoDocumentosException noSuchEntityException) {
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
	protected DemonstracaoDocumentos removeImpl(
		DemonstracaoDocumentos demonstracaoDocumentos) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(demonstracaoDocumentos)) {
				demonstracaoDocumentos = (DemonstracaoDocumentos)session.get(
					DemonstracaoDocumentosImpl.class,
					demonstracaoDocumentos.getPrimaryKeyObj());
			}

			if (demonstracaoDocumentos != null) {
				session.delete(demonstracaoDocumentos);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (demonstracaoDocumentos != null) {
			clearCache(demonstracaoDocumentos);
		}

		return demonstracaoDocumentos;
	}

	@Override
	public DemonstracaoDocumentos updateImpl(
		DemonstracaoDocumentos demonstracaoDocumentos) {

		boolean isNew = demonstracaoDocumentos.isNew();

		if (!(demonstracaoDocumentos instanceof
				DemonstracaoDocumentosModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(demonstracaoDocumentos.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					demonstracaoDocumentos);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in demonstracaoDocumentos proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DemonstracaoDocumentos implementation " +
					demonstracaoDocumentos.getClass());
		}

		DemonstracaoDocumentosModelImpl demonstracaoDocumentosModelImpl =
			(DemonstracaoDocumentosModelImpl)demonstracaoDocumentos;

		if (Validator.isNull(demonstracaoDocumentos.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			demonstracaoDocumentos.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(demonstracaoDocumentos);
			}
			else {
				demonstracaoDocumentos = (DemonstracaoDocumentos)session.merge(
					demonstracaoDocumentos);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DemonstracaoDocumentosImpl.class, demonstracaoDocumentosModelImpl,
			false, true);

		if (isNew) {
			demonstracaoDocumentos.setNew(false);
		}

		demonstracaoDocumentos.resetOriginalValues();

		return demonstracaoDocumentos;
	}

	/**
	 * Returns the demonstracao documentos with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the demonstracao documentos
	 * @return the demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a demonstracao documentos with the primary key could not be found
	 */
	@Override
	public DemonstracaoDocumentos findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDemonstracaoDocumentosException {

		DemonstracaoDocumentos demonstracaoDocumentos = fetchByPrimaryKey(
			primaryKey);

		if (demonstracaoDocumentos == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDemonstracaoDocumentosException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return demonstracaoDocumentos;
	}

	/**
	 * Returns the demonstracao documentos with the primary key or throws a <code>NoSuchDemonstracaoDocumentosException</code> if it could not be found.
	 *
	 * @param demonstracaoDocumentosId the primary key of the demonstracao documentos
	 * @return the demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a demonstracao documentos with the primary key could not be found
	 */
	@Override
	public DemonstracaoDocumentos findByPrimaryKey(
			long demonstracaoDocumentosId)
		throws NoSuchDemonstracaoDocumentosException {

		return findByPrimaryKey((Serializable)demonstracaoDocumentosId);
	}

	/**
	 * Returns the demonstracao documentos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param demonstracaoDocumentosId the primary key of the demonstracao documentos
	 * @return the demonstracao documentos, or <code>null</code> if a demonstracao documentos with the primary key could not be found
	 */
	@Override
	public DemonstracaoDocumentos fetchByPrimaryKey(
		long demonstracaoDocumentosId) {

		return fetchByPrimaryKey((Serializable)demonstracaoDocumentosId);
	}

	/**
	 * Returns all the demonstracao documentoses.
	 *
	 * @return the demonstracao documentoses
	 */
	@Override
	public List<DemonstracaoDocumentos> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the demonstracao documentoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @return the range of demonstracao documentoses
	 */
	@Override
	public List<DemonstracaoDocumentos> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the demonstracao documentoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of demonstracao documentoses
	 */
	@Override
	public List<DemonstracaoDocumentos> findAll(
		int start, int end,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the demonstracao documentoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of demonstracao documentoses
	 */
	@Override
	public List<DemonstracaoDocumentos> findAll(
		int start, int end,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator,
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

		List<DemonstracaoDocumentos> list = null;

		if (useFinderCache) {
			list = (List<DemonstracaoDocumentos>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DEMONSTRACAODOCUMENTOS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DEMONSTRACAODOCUMENTOS;

				sql = sql.concat(DemonstracaoDocumentosModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DemonstracaoDocumentos>)QueryUtil.list(
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
	 * Removes all the demonstracao documentoses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DemonstracaoDocumentos demonstracaoDocumentos : findAll()) {
			remove(demonstracaoDocumentos);
		}
	}

	/**
	 * Returns the number of demonstracao documentoses.
	 *
	 * @return the number of demonstracao documentoses
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
					_SQL_COUNT_DEMONSTRACAODOCUMENTOS);

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
		return "demonstracaoDocumentosId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DEMONSTRACAODOCUMENTOS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DemonstracaoDocumentosModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the demonstracao documentos persistence.
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

		_finderPathWithPaginationFindByDemonstracaoId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDemonstracaoId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"demonstracaoId"}, true);

		_finderPathWithoutPaginationFindByDemonstracaoId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDemonstracaoId",
			new String[] {Long.class.getName()},
			new String[] {"demonstracaoId"}, true);

		_finderPathCountByDemonstracaoId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDemonstracaoId",
			new String[] {Long.class.getName()},
			new String[] {"demonstracaoId"}, false);

		DemonstracaoDocumentosUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		DemonstracaoDocumentosUtil.setPersistence(null);

		entityCache.removeCache(DemonstracaoDocumentosImpl.class.getName());
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

	private static final String _SQL_SELECT_DEMONSTRACAODOCUMENTOS =
		"SELECT demonstracaoDocumentos FROM DemonstracaoDocumentos demonstracaoDocumentos";

	private static final String _SQL_SELECT_DEMONSTRACAODOCUMENTOS_WHERE =
		"SELECT demonstracaoDocumentos FROM DemonstracaoDocumentos demonstracaoDocumentos WHERE ";

	private static final String _SQL_COUNT_DEMONSTRACAODOCUMENTOS =
		"SELECT COUNT(demonstracaoDocumentos) FROM DemonstracaoDocumentos demonstracaoDocumentos";

	private static final String _SQL_COUNT_DEMONSTRACAODOCUMENTOS_WHERE =
		"SELECT COUNT(demonstracaoDocumentos) FROM DemonstracaoDocumentos demonstracaoDocumentos WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"demonstracaoDocumentos.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DemonstracaoDocumentos exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DemonstracaoDocumentos exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DemonstracaoDocumentosPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}