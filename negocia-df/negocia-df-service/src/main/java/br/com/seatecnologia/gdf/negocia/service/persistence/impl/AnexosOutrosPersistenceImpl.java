/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchAnexosOutrosException;
import br.com.seatecnologia.gdf.negocia.model.AnexosOutros;
import br.com.seatecnologia.gdf.negocia.model.AnexosOutrosTable;
import br.com.seatecnologia.gdf.negocia.model.impl.AnexosOutrosImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.AnexosOutrosModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.AnexosOutrosPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AnexosOutrosUtil;
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
 * The persistence implementation for the anexos outros service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AnexosOutrosPersistence.class)
public class AnexosOutrosPersistenceImpl
	extends BasePersistenceImpl<AnexosOutros>
	implements AnexosOutrosPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AnexosOutrosUtil</code> to access the anexos outros persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AnexosOutrosImpl.class.getName();

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
	 * Returns all the anexos outroses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching anexos outroses
	 */
	@Override
	public List<AnexosOutros> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the anexos outroses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @return the range of matching anexos outroses
	 */
	@Override
	public List<AnexosOutros> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the anexos outroses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching anexos outroses
	 */
	@Override
	public List<AnexosOutros> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AnexosOutros> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the anexos outroses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching anexos outroses
	 */
	@Override
	public List<AnexosOutros> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AnexosOutros> orderByComparator,
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

		List<AnexosOutros> list = null;

		if (useFinderCache) {
			list = (List<AnexosOutros>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AnexosOutros anexosOutros : list) {
					if (!uuid.equals(anexosOutros.getUuid())) {
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

			sb.append(_SQL_SELECT_ANEXOSOUTROS_WHERE);

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
				sb.append(AnexosOutrosModelImpl.ORDER_BY_JPQL);
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

				list = (List<AnexosOutros>)QueryUtil.list(
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
	 * Returns the first anexos outros in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching anexos outros
	 * @throws NoSuchAnexosOutrosException if a matching anexos outros could not be found
	 */
	@Override
	public AnexosOutros findByUuid_First(
			String uuid, OrderByComparator<AnexosOutros> orderByComparator)
		throws NoSuchAnexosOutrosException {

		AnexosOutros anexosOutros = fetchByUuid_First(uuid, orderByComparator);

		if (anexosOutros != null) {
			return anexosOutros;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAnexosOutrosException(sb.toString());
	}

	/**
	 * Returns the first anexos outros in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching anexos outros, or <code>null</code> if a matching anexos outros could not be found
	 */
	@Override
	public AnexosOutros fetchByUuid_First(
		String uuid, OrderByComparator<AnexosOutros> orderByComparator) {

		List<AnexosOutros> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last anexos outros in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching anexos outros
	 * @throws NoSuchAnexosOutrosException if a matching anexos outros could not be found
	 */
	@Override
	public AnexosOutros findByUuid_Last(
			String uuid, OrderByComparator<AnexosOutros> orderByComparator)
		throws NoSuchAnexosOutrosException {

		AnexosOutros anexosOutros = fetchByUuid_Last(uuid, orderByComparator);

		if (anexosOutros != null) {
			return anexosOutros;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAnexosOutrosException(sb.toString());
	}

	/**
	 * Returns the last anexos outros in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching anexos outros, or <code>null</code> if a matching anexos outros could not be found
	 */
	@Override
	public AnexosOutros fetchByUuid_Last(
		String uuid, OrderByComparator<AnexosOutros> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<AnexosOutros> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the anexos outroses before and after the current anexos outros in the ordered set where uuid = &#63;.
	 *
	 * @param anexosOutrosId the primary key of the current anexos outros
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next anexos outros
	 * @throws NoSuchAnexosOutrosException if a anexos outros with the primary key could not be found
	 */
	@Override
	public AnexosOutros[] findByUuid_PrevAndNext(
			long anexosOutrosId, String uuid,
			OrderByComparator<AnexosOutros> orderByComparator)
		throws NoSuchAnexosOutrosException {

		uuid = Objects.toString(uuid, "");

		AnexosOutros anexosOutros = findByPrimaryKey(anexosOutrosId);

		Session session = null;

		try {
			session = openSession();

			AnexosOutros[] array = new AnexosOutrosImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, anexosOutros, uuid, orderByComparator, true);

			array[1] = anexosOutros;

			array[2] = getByUuid_PrevAndNext(
				session, anexosOutros, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AnexosOutros getByUuid_PrevAndNext(
		Session session, AnexosOutros anexosOutros, String uuid,
		OrderByComparator<AnexosOutros> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ANEXOSOUTROS_WHERE);

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
			sb.append(AnexosOutrosModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(anexosOutros)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AnexosOutros> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the anexos outroses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (AnexosOutros anexosOutros :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(anexosOutros);
		}
	}

	/**
	 * Returns the number of anexos outroses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching anexos outroses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ANEXOSOUTROS_WHERE);

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
		"anexosOutros.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(anexosOutros.uuid IS NULL OR anexosOutros.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByDadosRegistroId;
	private FinderPath _finderPathWithoutPaginationFindByDadosRegistroId;
	private FinderPath _finderPathCountByDadosRegistroId;

	/**
	 * Returns all the anexos outroses where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @return the matching anexos outroses
	 */
	@Override
	public List<AnexosOutros> findByDadosRegistroId(long dadosRegistroId) {
		return findByDadosRegistroId(
			dadosRegistroId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the anexos outroses where dadosRegistroId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @return the range of matching anexos outroses
	 */
	@Override
	public List<AnexosOutros> findByDadosRegistroId(
		long dadosRegistroId, int start, int end) {

		return findByDadosRegistroId(dadosRegistroId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the anexos outroses where dadosRegistroId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching anexos outroses
	 */
	@Override
	public List<AnexosOutros> findByDadosRegistroId(
		long dadosRegistroId, int start, int end,
		OrderByComparator<AnexosOutros> orderByComparator) {

		return findByDadosRegistroId(
			dadosRegistroId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the anexos outroses where dadosRegistroId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching anexos outroses
	 */
	@Override
	public List<AnexosOutros> findByDadosRegistroId(
		long dadosRegistroId, int start, int end,
		OrderByComparator<AnexosOutros> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByDadosRegistroId;
				finderArgs = new Object[] {dadosRegistroId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByDadosRegistroId;
			finderArgs = new Object[] {
				dadosRegistroId, start, end, orderByComparator
			};
		}

		List<AnexosOutros> list = null;

		if (useFinderCache) {
			list = (List<AnexosOutros>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AnexosOutros anexosOutros : list) {
					if (dadosRegistroId != anexosOutros.getDadosRegistroId()) {
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

			sb.append(_SQL_SELECT_ANEXOSOUTROS_WHERE);

			sb.append(_FINDER_COLUMN_DADOSREGISTROID_DADOSREGISTROID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AnexosOutrosModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(dadosRegistroId);

				list = (List<AnexosOutros>)QueryUtil.list(
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
	 * Returns the first anexos outros in the ordered set where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching anexos outros
	 * @throws NoSuchAnexosOutrosException if a matching anexos outros could not be found
	 */
	@Override
	public AnexosOutros findByDadosRegistroId_First(
			long dadosRegistroId,
			OrderByComparator<AnexosOutros> orderByComparator)
		throws NoSuchAnexosOutrosException {

		AnexosOutros anexosOutros = fetchByDadosRegistroId_First(
			dadosRegistroId, orderByComparator);

		if (anexosOutros != null) {
			return anexosOutros;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("dadosRegistroId=");
		sb.append(dadosRegistroId);

		sb.append("}");

		throw new NoSuchAnexosOutrosException(sb.toString());
	}

	/**
	 * Returns the first anexos outros in the ordered set where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching anexos outros, or <code>null</code> if a matching anexos outros could not be found
	 */
	@Override
	public AnexosOutros fetchByDadosRegistroId_First(
		long dadosRegistroId,
		OrderByComparator<AnexosOutros> orderByComparator) {

		List<AnexosOutros> list = findByDadosRegistroId(
			dadosRegistroId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last anexos outros in the ordered set where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching anexos outros
	 * @throws NoSuchAnexosOutrosException if a matching anexos outros could not be found
	 */
	@Override
	public AnexosOutros findByDadosRegistroId_Last(
			long dadosRegistroId,
			OrderByComparator<AnexosOutros> orderByComparator)
		throws NoSuchAnexosOutrosException {

		AnexosOutros anexosOutros = fetchByDadosRegistroId_Last(
			dadosRegistroId, orderByComparator);

		if (anexosOutros != null) {
			return anexosOutros;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("dadosRegistroId=");
		sb.append(dadosRegistroId);

		sb.append("}");

		throw new NoSuchAnexosOutrosException(sb.toString());
	}

	/**
	 * Returns the last anexos outros in the ordered set where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching anexos outros, or <code>null</code> if a matching anexos outros could not be found
	 */
	@Override
	public AnexosOutros fetchByDadosRegistroId_Last(
		long dadosRegistroId,
		OrderByComparator<AnexosOutros> orderByComparator) {

		int count = countByDadosRegistroId(dadosRegistroId);

		if (count == 0) {
			return null;
		}

		List<AnexosOutros> list = findByDadosRegistroId(
			dadosRegistroId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the anexos outroses before and after the current anexos outros in the ordered set where dadosRegistroId = &#63;.
	 *
	 * @param anexosOutrosId the primary key of the current anexos outros
	 * @param dadosRegistroId the dados registro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next anexos outros
	 * @throws NoSuchAnexosOutrosException if a anexos outros with the primary key could not be found
	 */
	@Override
	public AnexosOutros[] findByDadosRegistroId_PrevAndNext(
			long anexosOutrosId, long dadosRegistroId,
			OrderByComparator<AnexosOutros> orderByComparator)
		throws NoSuchAnexosOutrosException {

		AnexosOutros anexosOutros = findByPrimaryKey(anexosOutrosId);

		Session session = null;

		try {
			session = openSession();

			AnexosOutros[] array = new AnexosOutrosImpl[3];

			array[0] = getByDadosRegistroId_PrevAndNext(
				session, anexosOutros, dadosRegistroId, orderByComparator,
				true);

			array[1] = anexosOutros;

			array[2] = getByDadosRegistroId_PrevAndNext(
				session, anexosOutros, dadosRegistroId, orderByComparator,
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

	protected AnexosOutros getByDadosRegistroId_PrevAndNext(
		Session session, AnexosOutros anexosOutros, long dadosRegistroId,
		OrderByComparator<AnexosOutros> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ANEXOSOUTROS_WHERE);

		sb.append(_FINDER_COLUMN_DADOSREGISTROID_DADOSREGISTROID_2);

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
			sb.append(AnexosOutrosModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(dadosRegistroId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(anexosOutros)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AnexosOutros> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the anexos outroses where dadosRegistroId = &#63; from the database.
	 *
	 * @param dadosRegistroId the dados registro ID
	 */
	@Override
	public void removeByDadosRegistroId(long dadosRegistroId) {
		for (AnexosOutros anexosOutros :
				findByDadosRegistroId(
					dadosRegistroId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(anexosOutros);
		}
	}

	/**
	 * Returns the number of anexos outroses where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @return the number of matching anexos outroses
	 */
	@Override
	public int countByDadosRegistroId(long dadosRegistroId) {
		FinderPath finderPath = _finderPathCountByDadosRegistroId;

		Object[] finderArgs = new Object[] {dadosRegistroId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ANEXOSOUTROS_WHERE);

			sb.append(_FINDER_COLUMN_DADOSREGISTROID_DADOSREGISTROID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(dadosRegistroId);

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
		_FINDER_COLUMN_DADOSREGISTROID_DADOSREGISTROID_2 =
			"anexosOutros.dadosRegistroId = ?";

	public AnexosOutrosPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AnexosOutros.class);

		setModelImplClass(AnexosOutrosImpl.class);
		setModelPKClass(long.class);

		setTable(AnexosOutrosTable.INSTANCE);
	}

	/**
	 * Caches the anexos outros in the entity cache if it is enabled.
	 *
	 * @param anexosOutros the anexos outros
	 */
	@Override
	public void cacheResult(AnexosOutros anexosOutros) {
		entityCache.putResult(
			AnexosOutrosImpl.class, anexosOutros.getPrimaryKey(), anexosOutros);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the anexos outroses in the entity cache if it is enabled.
	 *
	 * @param anexosOutroses the anexos outroses
	 */
	@Override
	public void cacheResult(List<AnexosOutros> anexosOutroses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (anexosOutroses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AnexosOutros anexosOutros : anexosOutroses) {
			if (entityCache.getResult(
					AnexosOutrosImpl.class, anexosOutros.getPrimaryKey()) ==
						null) {

				cacheResult(anexosOutros);
			}
		}
	}

	/**
	 * Clears the cache for all anexos outroses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AnexosOutrosImpl.class);

		finderCache.clearCache(AnexosOutrosImpl.class);
	}

	/**
	 * Clears the cache for the anexos outros.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AnexosOutros anexosOutros) {
		entityCache.removeResult(AnexosOutrosImpl.class, anexosOutros);
	}

	@Override
	public void clearCache(List<AnexosOutros> anexosOutroses) {
		for (AnexosOutros anexosOutros : anexosOutroses) {
			entityCache.removeResult(AnexosOutrosImpl.class, anexosOutros);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AnexosOutrosImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AnexosOutrosImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new anexos outros with the primary key. Does not add the anexos outros to the database.
	 *
	 * @param anexosOutrosId the primary key for the new anexos outros
	 * @return the new anexos outros
	 */
	@Override
	public AnexosOutros create(long anexosOutrosId) {
		AnexosOutros anexosOutros = new AnexosOutrosImpl();

		anexosOutros.setNew(true);
		anexosOutros.setPrimaryKey(anexosOutrosId);

		String uuid = PortalUUIDUtil.generate();

		anexosOutros.setUuid(uuid);

		return anexosOutros;
	}

	/**
	 * Removes the anexos outros with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param anexosOutrosId the primary key of the anexos outros
	 * @return the anexos outros that was removed
	 * @throws NoSuchAnexosOutrosException if a anexos outros with the primary key could not be found
	 */
	@Override
	public AnexosOutros remove(long anexosOutrosId)
		throws NoSuchAnexosOutrosException {

		return remove((Serializable)anexosOutrosId);
	}

	/**
	 * Removes the anexos outros with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the anexos outros
	 * @return the anexos outros that was removed
	 * @throws NoSuchAnexosOutrosException if a anexos outros with the primary key could not be found
	 */
	@Override
	public AnexosOutros remove(Serializable primaryKey)
		throws NoSuchAnexosOutrosException {

		Session session = null;

		try {
			session = openSession();

			AnexosOutros anexosOutros = (AnexosOutros)session.get(
				AnexosOutrosImpl.class, primaryKey);

			if (anexosOutros == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAnexosOutrosException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(anexosOutros);
		}
		catch (NoSuchAnexosOutrosException noSuchEntityException) {
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
	protected AnexosOutros removeImpl(AnexosOutros anexosOutros) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(anexosOutros)) {
				anexosOutros = (AnexosOutros)session.get(
					AnexosOutrosImpl.class, anexosOutros.getPrimaryKeyObj());
			}

			if (anexosOutros != null) {
				session.delete(anexosOutros);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (anexosOutros != null) {
			clearCache(anexosOutros);
		}

		return anexosOutros;
	}

	@Override
	public AnexosOutros updateImpl(AnexosOutros anexosOutros) {
		boolean isNew = anexosOutros.isNew();

		if (!(anexosOutros instanceof AnexosOutrosModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(anexosOutros.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					anexosOutros);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in anexosOutros proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AnexosOutros implementation " +
					anexosOutros.getClass());
		}

		AnexosOutrosModelImpl anexosOutrosModelImpl =
			(AnexosOutrosModelImpl)anexosOutros;

		if (Validator.isNull(anexosOutros.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			anexosOutros.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(anexosOutros);
			}
			else {
				anexosOutros = (AnexosOutros)session.merge(anexosOutros);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AnexosOutrosImpl.class, anexosOutrosModelImpl, false, true);

		if (isNew) {
			anexosOutros.setNew(false);
		}

		anexosOutros.resetOriginalValues();

		return anexosOutros;
	}

	/**
	 * Returns the anexos outros with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the anexos outros
	 * @return the anexos outros
	 * @throws NoSuchAnexosOutrosException if a anexos outros with the primary key could not be found
	 */
	@Override
	public AnexosOutros findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAnexosOutrosException {

		AnexosOutros anexosOutros = fetchByPrimaryKey(primaryKey);

		if (anexosOutros == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAnexosOutrosException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return anexosOutros;
	}

	/**
	 * Returns the anexos outros with the primary key or throws a <code>NoSuchAnexosOutrosException</code> if it could not be found.
	 *
	 * @param anexosOutrosId the primary key of the anexos outros
	 * @return the anexos outros
	 * @throws NoSuchAnexosOutrosException if a anexos outros with the primary key could not be found
	 */
	@Override
	public AnexosOutros findByPrimaryKey(long anexosOutrosId)
		throws NoSuchAnexosOutrosException {

		return findByPrimaryKey((Serializable)anexosOutrosId);
	}

	/**
	 * Returns the anexos outros with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param anexosOutrosId the primary key of the anexos outros
	 * @return the anexos outros, or <code>null</code> if a anexos outros with the primary key could not be found
	 */
	@Override
	public AnexosOutros fetchByPrimaryKey(long anexosOutrosId) {
		return fetchByPrimaryKey((Serializable)anexosOutrosId);
	}

	/**
	 * Returns all the anexos outroses.
	 *
	 * @return the anexos outroses
	 */
	@Override
	public List<AnexosOutros> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the anexos outroses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @return the range of anexos outroses
	 */
	@Override
	public List<AnexosOutros> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the anexos outroses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of anexos outroses
	 */
	@Override
	public List<AnexosOutros> findAll(
		int start, int end, OrderByComparator<AnexosOutros> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the anexos outroses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of anexos outroses
	 */
	@Override
	public List<AnexosOutros> findAll(
		int start, int end, OrderByComparator<AnexosOutros> orderByComparator,
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

		List<AnexosOutros> list = null;

		if (useFinderCache) {
			list = (List<AnexosOutros>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ANEXOSOUTROS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ANEXOSOUTROS;

				sql = sql.concat(AnexosOutrosModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AnexosOutros>)QueryUtil.list(
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
	 * Removes all the anexos outroses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AnexosOutros anexosOutros : findAll()) {
			remove(anexosOutros);
		}
	}

	/**
	 * Returns the number of anexos outroses.
	 *
	 * @return the number of anexos outroses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ANEXOSOUTROS);

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
		return "anexosOutrosId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ANEXOSOUTROS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AnexosOutrosModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the anexos outros persistence.
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

		_finderPathWithPaginationFindByDadosRegistroId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDadosRegistroId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"dadosRegistroId"}, true);

		_finderPathWithoutPaginationFindByDadosRegistroId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDadosRegistroId",
			new String[] {Long.class.getName()},
			new String[] {"dadosRegistroId"}, true);

		_finderPathCountByDadosRegistroId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDadosRegistroId",
			new String[] {Long.class.getName()},
			new String[] {"dadosRegistroId"}, false);

		AnexosOutrosUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AnexosOutrosUtil.setPersistence(null);

		entityCache.removeCache(AnexosOutrosImpl.class.getName());
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

	private static final String _SQL_SELECT_ANEXOSOUTROS =
		"SELECT anexosOutros FROM AnexosOutros anexosOutros";

	private static final String _SQL_SELECT_ANEXOSOUTROS_WHERE =
		"SELECT anexosOutros FROM AnexosOutros anexosOutros WHERE ";

	private static final String _SQL_COUNT_ANEXOSOUTROS =
		"SELECT COUNT(anexosOutros) FROM AnexosOutros anexosOutros";

	private static final String _SQL_COUNT_ANEXOSOUTROS_WHERE =
		"SELECT COUNT(anexosOutros) FROM AnexosOutros anexosOutros WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "anexosOutros.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AnexosOutros exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AnexosOutros exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AnexosOutrosPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}