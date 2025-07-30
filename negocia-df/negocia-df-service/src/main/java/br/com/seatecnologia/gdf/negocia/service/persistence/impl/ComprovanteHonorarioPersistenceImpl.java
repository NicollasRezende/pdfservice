/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchComprovanteHonorarioException;
import br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario;
import br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorarioTable;
import br.com.seatecnologia.gdf.negocia.model.impl.ComprovanteHonorarioImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.ComprovanteHonorarioModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.ComprovanteHonorarioPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.ComprovanteHonorarioUtil;
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
 * The persistence implementation for the comprovante honorario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ComprovanteHonorarioPersistence.class)
public class ComprovanteHonorarioPersistenceImpl
	extends BasePersistenceImpl<ComprovanteHonorario>
	implements ComprovanteHonorarioPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ComprovanteHonorarioUtil</code> to access the comprovante honorario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ComprovanteHonorarioImpl.class.getName();

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
	 * Returns all the comprovante honorarios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching comprovante honorarios
	 */
	@Override
	public List<ComprovanteHonorario> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the comprovante honorarios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @return the range of matching comprovante honorarios
	 */
	@Override
	public List<ComprovanteHonorario> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the comprovante honorarios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching comprovante honorarios
	 */
	@Override
	public List<ComprovanteHonorario> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ComprovanteHonorario> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the comprovante honorarios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching comprovante honorarios
	 */
	@Override
	public List<ComprovanteHonorario> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ComprovanteHonorario> orderByComparator,
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

		List<ComprovanteHonorario> list = null;

		if (useFinderCache) {
			list = (List<ComprovanteHonorario>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ComprovanteHonorario comprovanteHonorario : list) {
					if (!uuid.equals(comprovanteHonorario.getUuid())) {
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

			sb.append(_SQL_SELECT_COMPROVANTEHONORARIO_WHERE);

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
				sb.append(ComprovanteHonorarioModelImpl.ORDER_BY_JPQL);
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

				list = (List<ComprovanteHonorario>)QueryUtil.list(
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
	 * Returns the first comprovante honorario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a matching comprovante honorario could not be found
	 */
	@Override
	public ComprovanteHonorario findByUuid_First(
			String uuid,
			OrderByComparator<ComprovanteHonorario> orderByComparator)
		throws NoSuchComprovanteHonorarioException {

		ComprovanteHonorario comprovanteHonorario = fetchByUuid_First(
			uuid, orderByComparator);

		if (comprovanteHonorario != null) {
			return comprovanteHonorario;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchComprovanteHonorarioException(sb.toString());
	}

	/**
	 * Returns the first comprovante honorario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching comprovante honorario, or <code>null</code> if a matching comprovante honorario could not be found
	 */
	@Override
	public ComprovanteHonorario fetchByUuid_First(
		String uuid,
		OrderByComparator<ComprovanteHonorario> orderByComparator) {

		List<ComprovanteHonorario> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last comprovante honorario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a matching comprovante honorario could not be found
	 */
	@Override
	public ComprovanteHonorario findByUuid_Last(
			String uuid,
			OrderByComparator<ComprovanteHonorario> orderByComparator)
		throws NoSuchComprovanteHonorarioException {

		ComprovanteHonorario comprovanteHonorario = fetchByUuid_Last(
			uuid, orderByComparator);

		if (comprovanteHonorario != null) {
			return comprovanteHonorario;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchComprovanteHonorarioException(sb.toString());
	}

	/**
	 * Returns the last comprovante honorario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching comprovante honorario, or <code>null</code> if a matching comprovante honorario could not be found
	 */
	@Override
	public ComprovanteHonorario fetchByUuid_Last(
		String uuid,
		OrderByComparator<ComprovanteHonorario> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<ComprovanteHonorario> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the comprovante honorarios before and after the current comprovante honorario in the ordered set where uuid = &#63;.
	 *
	 * @param comprovanteId the primary key of the current comprovante honorario
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a comprovante honorario with the primary key could not be found
	 */
	@Override
	public ComprovanteHonorario[] findByUuid_PrevAndNext(
			long comprovanteId, String uuid,
			OrderByComparator<ComprovanteHonorario> orderByComparator)
		throws NoSuchComprovanteHonorarioException {

		uuid = Objects.toString(uuid, "");

		ComprovanteHonorario comprovanteHonorario = findByPrimaryKey(
			comprovanteId);

		Session session = null;

		try {
			session = openSession();

			ComprovanteHonorario[] array = new ComprovanteHonorarioImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, comprovanteHonorario, uuid, orderByComparator, true);

			array[1] = comprovanteHonorario;

			array[2] = getByUuid_PrevAndNext(
				session, comprovanteHonorario, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ComprovanteHonorario getByUuid_PrevAndNext(
		Session session, ComprovanteHonorario comprovanteHonorario, String uuid,
		OrderByComparator<ComprovanteHonorario> orderByComparator,
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

		sb.append(_SQL_SELECT_COMPROVANTEHONORARIO_WHERE);

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
			sb.append(ComprovanteHonorarioModelImpl.ORDER_BY_JPQL);
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
						comprovanteHonorario)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ComprovanteHonorario> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the comprovante honorarios where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (ComprovanteHonorario comprovanteHonorario :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(comprovanteHonorario);
		}
	}

	/**
	 * Returns the number of comprovante honorarios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching comprovante honorarios
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_COMPROVANTEHONORARIO_WHERE);

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
		"comprovanteHonorario.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(comprovanteHonorario.uuid IS NULL OR comprovanteHonorario.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByPropostaId;
	private FinderPath _finderPathWithoutPaginationFindByPropostaId;
	private FinderPath _finderPathCountByPropostaId;

	/**
	 * Returns all the comprovante honorarios where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching comprovante honorarios
	 */
	@Override
	public List<ComprovanteHonorario> findByPropostaId(long propostaId) {
		return findByPropostaId(
			propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the comprovante honorarios where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @return the range of matching comprovante honorarios
	 */
	@Override
	public List<ComprovanteHonorario> findByPropostaId(
		long propostaId, int start, int end) {

		return findByPropostaId(propostaId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the comprovante honorarios where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching comprovante honorarios
	 */
	@Override
	public List<ComprovanteHonorario> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<ComprovanteHonorario> orderByComparator) {

		return findByPropostaId(
			propostaId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the comprovante honorarios where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching comprovante honorarios
	 */
	@Override
	public List<ComprovanteHonorario> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<ComprovanteHonorario> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByPropostaId;
				finderArgs = new Object[] {propostaId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByPropostaId;
			finderArgs = new Object[] {
				propostaId, start, end, orderByComparator
			};
		}

		List<ComprovanteHonorario> list = null;

		if (useFinderCache) {
			list = (List<ComprovanteHonorario>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ComprovanteHonorario comprovanteHonorario : list) {
					if (propostaId != comprovanteHonorario.getPropostaId()) {
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

			sb.append(_SQL_SELECT_COMPROVANTEHONORARIO_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ComprovanteHonorarioModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

				list = (List<ComprovanteHonorario>)QueryUtil.list(
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
	 * Returns the first comprovante honorario in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a matching comprovante honorario could not be found
	 */
	@Override
	public ComprovanteHonorario findByPropostaId_First(
			long propostaId,
			OrderByComparator<ComprovanteHonorario> orderByComparator)
		throws NoSuchComprovanteHonorarioException {

		ComprovanteHonorario comprovanteHonorario = fetchByPropostaId_First(
			propostaId, orderByComparator);

		if (comprovanteHonorario != null) {
			return comprovanteHonorario;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchComprovanteHonorarioException(sb.toString());
	}

	/**
	 * Returns the first comprovante honorario in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching comprovante honorario, or <code>null</code> if a matching comprovante honorario could not be found
	 */
	@Override
	public ComprovanteHonorario fetchByPropostaId_First(
		long propostaId,
		OrderByComparator<ComprovanteHonorario> orderByComparator) {

		List<ComprovanteHonorario> list = findByPropostaId(
			propostaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last comprovante honorario in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a matching comprovante honorario could not be found
	 */
	@Override
	public ComprovanteHonorario findByPropostaId_Last(
			long propostaId,
			OrderByComparator<ComprovanteHonorario> orderByComparator)
		throws NoSuchComprovanteHonorarioException {

		ComprovanteHonorario comprovanteHonorario = fetchByPropostaId_Last(
			propostaId, orderByComparator);

		if (comprovanteHonorario != null) {
			return comprovanteHonorario;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchComprovanteHonorarioException(sb.toString());
	}

	/**
	 * Returns the last comprovante honorario in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching comprovante honorario, or <code>null</code> if a matching comprovante honorario could not be found
	 */
	@Override
	public ComprovanteHonorario fetchByPropostaId_Last(
		long propostaId,
		OrderByComparator<ComprovanteHonorario> orderByComparator) {

		int count = countByPropostaId(propostaId);

		if (count == 0) {
			return null;
		}

		List<ComprovanteHonorario> list = findByPropostaId(
			propostaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the comprovante honorarios before and after the current comprovante honorario in the ordered set where propostaId = &#63;.
	 *
	 * @param comprovanteId the primary key of the current comprovante honorario
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a comprovante honorario with the primary key could not be found
	 */
	@Override
	public ComprovanteHonorario[] findByPropostaId_PrevAndNext(
			long comprovanteId, long propostaId,
			OrderByComparator<ComprovanteHonorario> orderByComparator)
		throws NoSuchComprovanteHonorarioException {

		ComprovanteHonorario comprovanteHonorario = findByPrimaryKey(
			comprovanteId);

		Session session = null;

		try {
			session = openSession();

			ComprovanteHonorario[] array = new ComprovanteHonorarioImpl[3];

			array[0] = getByPropostaId_PrevAndNext(
				session, comprovanteHonorario, propostaId, orderByComparator,
				true);

			array[1] = comprovanteHonorario;

			array[2] = getByPropostaId_PrevAndNext(
				session, comprovanteHonorario, propostaId, orderByComparator,
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

	protected ComprovanteHonorario getByPropostaId_PrevAndNext(
		Session session, ComprovanteHonorario comprovanteHonorario,
		long propostaId,
		OrderByComparator<ComprovanteHonorario> orderByComparator,
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

		sb.append(_SQL_SELECT_COMPROVANTEHONORARIO_WHERE);

		sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

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
			sb.append(ComprovanteHonorarioModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(propostaId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						comprovanteHonorario)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ComprovanteHonorario> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the comprovante honorarios where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	@Override
	public void removeByPropostaId(long propostaId) {
		for (ComprovanteHonorario comprovanteHonorario :
				findByPropostaId(
					propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(comprovanteHonorario);
		}
	}

	/**
	 * Returns the number of comprovante honorarios where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching comprovante honorarios
	 */
	@Override
	public int countByPropostaId(long propostaId) {
		FinderPath finderPath = _finderPathCountByPropostaId;

		Object[] finderArgs = new Object[] {propostaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_COMPROVANTEHONORARIO_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

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

	private static final String _FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2 =
		"comprovanteHonorario.propostaId = ?";

	public ComprovanteHonorarioPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(ComprovanteHonorario.class);

		setModelImplClass(ComprovanteHonorarioImpl.class);
		setModelPKClass(long.class);

		setTable(ComprovanteHonorarioTable.INSTANCE);
	}

	/**
	 * Caches the comprovante honorario in the entity cache if it is enabled.
	 *
	 * @param comprovanteHonorario the comprovante honorario
	 */
	@Override
	public void cacheResult(ComprovanteHonorario comprovanteHonorario) {
		entityCache.putResult(
			ComprovanteHonorarioImpl.class,
			comprovanteHonorario.getPrimaryKey(), comprovanteHonorario);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the comprovante honorarios in the entity cache if it is enabled.
	 *
	 * @param comprovanteHonorarios the comprovante honorarios
	 */
	@Override
	public void cacheResult(List<ComprovanteHonorario> comprovanteHonorarios) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (comprovanteHonorarios.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ComprovanteHonorario comprovanteHonorario :
				comprovanteHonorarios) {

			if (entityCache.getResult(
					ComprovanteHonorarioImpl.class,
					comprovanteHonorario.getPrimaryKey()) == null) {

				cacheResult(comprovanteHonorario);
			}
		}
	}

	/**
	 * Clears the cache for all comprovante honorarios.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ComprovanteHonorarioImpl.class);

		finderCache.clearCache(ComprovanteHonorarioImpl.class);
	}

	/**
	 * Clears the cache for the comprovante honorario.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ComprovanteHonorario comprovanteHonorario) {
		entityCache.removeResult(
			ComprovanteHonorarioImpl.class, comprovanteHonorario);
	}

	@Override
	public void clearCache(List<ComprovanteHonorario> comprovanteHonorarios) {
		for (ComprovanteHonorario comprovanteHonorario :
				comprovanteHonorarios) {

			entityCache.removeResult(
				ComprovanteHonorarioImpl.class, comprovanteHonorario);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ComprovanteHonorarioImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ComprovanteHonorarioImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new comprovante honorario with the primary key. Does not add the comprovante honorario to the database.
	 *
	 * @param comprovanteId the primary key for the new comprovante honorario
	 * @return the new comprovante honorario
	 */
	@Override
	public ComprovanteHonorario create(long comprovanteId) {
		ComprovanteHonorario comprovanteHonorario =
			new ComprovanteHonorarioImpl();

		comprovanteHonorario.setNew(true);
		comprovanteHonorario.setPrimaryKey(comprovanteId);

		String uuid = PortalUUIDUtil.generate();

		comprovanteHonorario.setUuid(uuid);

		return comprovanteHonorario;
	}

	/**
	 * Removes the comprovante honorario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param comprovanteId the primary key of the comprovante honorario
	 * @return the comprovante honorario that was removed
	 * @throws NoSuchComprovanteHonorarioException if a comprovante honorario with the primary key could not be found
	 */
	@Override
	public ComprovanteHonorario remove(long comprovanteId)
		throws NoSuchComprovanteHonorarioException {

		return remove((Serializable)comprovanteId);
	}

	/**
	 * Removes the comprovante honorario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the comprovante honorario
	 * @return the comprovante honorario that was removed
	 * @throws NoSuchComprovanteHonorarioException if a comprovante honorario with the primary key could not be found
	 */
	@Override
	public ComprovanteHonorario remove(Serializable primaryKey)
		throws NoSuchComprovanteHonorarioException {

		Session session = null;

		try {
			session = openSession();

			ComprovanteHonorario comprovanteHonorario =
				(ComprovanteHonorario)session.get(
					ComprovanteHonorarioImpl.class, primaryKey);

			if (comprovanteHonorario == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchComprovanteHonorarioException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(comprovanteHonorario);
		}
		catch (NoSuchComprovanteHonorarioException noSuchEntityException) {
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
	protected ComprovanteHonorario removeImpl(
		ComprovanteHonorario comprovanteHonorario) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(comprovanteHonorario)) {
				comprovanteHonorario = (ComprovanteHonorario)session.get(
					ComprovanteHonorarioImpl.class,
					comprovanteHonorario.getPrimaryKeyObj());
			}

			if (comprovanteHonorario != null) {
				session.delete(comprovanteHonorario);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (comprovanteHonorario != null) {
			clearCache(comprovanteHonorario);
		}

		return comprovanteHonorario;
	}

	@Override
	public ComprovanteHonorario updateImpl(
		ComprovanteHonorario comprovanteHonorario) {

		boolean isNew = comprovanteHonorario.isNew();

		if (!(comprovanteHonorario instanceof ComprovanteHonorarioModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(comprovanteHonorario.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					comprovanteHonorario);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in comprovanteHonorario proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ComprovanteHonorario implementation " +
					comprovanteHonorario.getClass());
		}

		ComprovanteHonorarioModelImpl comprovanteHonorarioModelImpl =
			(ComprovanteHonorarioModelImpl)comprovanteHonorario;

		if (Validator.isNull(comprovanteHonorario.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			comprovanteHonorario.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(comprovanteHonorario);
			}
			else {
				comprovanteHonorario = (ComprovanteHonorario)session.merge(
					comprovanteHonorario);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ComprovanteHonorarioImpl.class, comprovanteHonorarioModelImpl,
			false, true);

		if (isNew) {
			comprovanteHonorario.setNew(false);
		}

		comprovanteHonorario.resetOriginalValues();

		return comprovanteHonorario;
	}

	/**
	 * Returns the comprovante honorario with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the comprovante honorario
	 * @return the comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a comprovante honorario with the primary key could not be found
	 */
	@Override
	public ComprovanteHonorario findByPrimaryKey(Serializable primaryKey)
		throws NoSuchComprovanteHonorarioException {

		ComprovanteHonorario comprovanteHonorario = fetchByPrimaryKey(
			primaryKey);

		if (comprovanteHonorario == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchComprovanteHonorarioException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return comprovanteHonorario;
	}

	/**
	 * Returns the comprovante honorario with the primary key or throws a <code>NoSuchComprovanteHonorarioException</code> if it could not be found.
	 *
	 * @param comprovanteId the primary key of the comprovante honorario
	 * @return the comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a comprovante honorario with the primary key could not be found
	 */
	@Override
	public ComprovanteHonorario findByPrimaryKey(long comprovanteId)
		throws NoSuchComprovanteHonorarioException {

		return findByPrimaryKey((Serializable)comprovanteId);
	}

	/**
	 * Returns the comprovante honorario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param comprovanteId the primary key of the comprovante honorario
	 * @return the comprovante honorario, or <code>null</code> if a comprovante honorario with the primary key could not be found
	 */
	@Override
	public ComprovanteHonorario fetchByPrimaryKey(long comprovanteId) {
		return fetchByPrimaryKey((Serializable)comprovanteId);
	}

	/**
	 * Returns all the comprovante honorarios.
	 *
	 * @return the comprovante honorarios
	 */
	@Override
	public List<ComprovanteHonorario> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the comprovante honorarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @return the range of comprovante honorarios
	 */
	@Override
	public List<ComprovanteHonorario> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the comprovante honorarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of comprovante honorarios
	 */
	@Override
	public List<ComprovanteHonorario> findAll(
		int start, int end,
		OrderByComparator<ComprovanteHonorario> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the comprovante honorarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of comprovante honorarios
	 */
	@Override
	public List<ComprovanteHonorario> findAll(
		int start, int end,
		OrderByComparator<ComprovanteHonorario> orderByComparator,
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

		List<ComprovanteHonorario> list = null;

		if (useFinderCache) {
			list = (List<ComprovanteHonorario>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_COMPROVANTEHONORARIO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_COMPROVANTEHONORARIO;

				sql = sql.concat(ComprovanteHonorarioModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ComprovanteHonorario>)QueryUtil.list(
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
	 * Removes all the comprovante honorarios from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ComprovanteHonorario comprovanteHonorario : findAll()) {
			remove(comprovanteHonorario);
		}
	}

	/**
	 * Returns the number of comprovante honorarios.
	 *
	 * @return the number of comprovante honorarios
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
					_SQL_COUNT_COMPROVANTEHONORARIO);

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
		return "comprovanteId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_COMPROVANTEHONORARIO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ComprovanteHonorarioModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the comprovante honorario persistence.
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

		_finderPathWithPaginationFindByPropostaId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPropostaId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"propostaId"}, true);

		_finderPathWithoutPaginationFindByPropostaId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPropostaId",
			new String[] {Long.class.getName()}, new String[] {"propostaId"},
			true);

		_finderPathCountByPropostaId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPropostaId",
			new String[] {Long.class.getName()}, new String[] {"propostaId"},
			false);

		ComprovanteHonorarioUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ComprovanteHonorarioUtil.setPersistence(null);

		entityCache.removeCache(ComprovanteHonorarioImpl.class.getName());
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

	private static final String _SQL_SELECT_COMPROVANTEHONORARIO =
		"SELECT comprovanteHonorario FROM ComprovanteHonorario comprovanteHonorario";

	private static final String _SQL_SELECT_COMPROVANTEHONORARIO_WHERE =
		"SELECT comprovanteHonorario FROM ComprovanteHonorario comprovanteHonorario WHERE ";

	private static final String _SQL_COUNT_COMPROVANTEHONORARIO =
		"SELECT COUNT(comprovanteHonorario) FROM ComprovanteHonorario comprovanteHonorario";

	private static final String _SQL_COUNT_COMPROVANTEHONORARIO_WHERE =
		"SELECT COUNT(comprovanteHonorario) FROM ComprovanteHonorario comprovanteHonorario WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"comprovanteHonorario.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ComprovanteHonorario exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ComprovanteHonorario exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ComprovanteHonorarioPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}