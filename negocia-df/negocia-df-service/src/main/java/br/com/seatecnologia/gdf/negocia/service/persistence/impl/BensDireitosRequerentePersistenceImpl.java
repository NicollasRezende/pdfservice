/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchBensDireitosRequerenteException;
import br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente;
import br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerenteTable;
import br.com.seatecnologia.gdf.negocia.model.impl.BensDireitosRequerenteImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.BensDireitosRequerenteModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.BensDireitosRequerentePersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.BensDireitosRequerenteUtil;
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
 * The persistence implementation for the bens direitos requerente service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = BensDireitosRequerentePersistence.class)
public class BensDireitosRequerentePersistenceImpl
	extends BasePersistenceImpl<BensDireitosRequerente>
	implements BensDireitosRequerentePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>BensDireitosRequerenteUtil</code> to access the bens direitos requerente persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		BensDireitosRequerenteImpl.class.getName();

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
	 * Returns all the bens direitos requerentes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching bens direitos requerentes
	 */
	@Override
	public List<BensDireitosRequerente> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bens direitos requerentes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @return the range of matching bens direitos requerentes
	 */
	@Override
	public List<BensDireitosRequerente> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bens direitos requerentes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bens direitos requerentes
	 */
	@Override
	public List<BensDireitosRequerente> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BensDireitosRequerente> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bens direitos requerentes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bens direitos requerentes
	 */
	@Override
	public List<BensDireitosRequerente> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BensDireitosRequerente> orderByComparator,
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

		List<BensDireitosRequerente> list = null;

		if (useFinderCache) {
			list = (List<BensDireitosRequerente>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BensDireitosRequerente bensDireitosRequerente : list) {
					if (!uuid.equals(bensDireitosRequerente.getUuid())) {
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

			sb.append(_SQL_SELECT_BENSDIREITOSREQUERENTE_WHERE);

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
				sb.append(BensDireitosRequerenteModelImpl.ORDER_BY_JPQL);
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

				list = (List<BensDireitosRequerente>)QueryUtil.list(
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
	 * Returns the first bens direitos requerente in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a matching bens direitos requerente could not be found
	 */
	@Override
	public BensDireitosRequerente findByUuid_First(
			String uuid,
			OrderByComparator<BensDireitosRequerente> orderByComparator)
		throws NoSuchBensDireitosRequerenteException {

		BensDireitosRequerente bensDireitosRequerente = fetchByUuid_First(
			uuid, orderByComparator);

		if (bensDireitosRequerente != null) {
			return bensDireitosRequerente;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchBensDireitosRequerenteException(sb.toString());
	}

	/**
	 * Returns the first bens direitos requerente in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos requerente, or <code>null</code> if a matching bens direitos requerente could not be found
	 */
	@Override
	public BensDireitosRequerente fetchByUuid_First(
		String uuid,
		OrderByComparator<BensDireitosRequerente> orderByComparator) {

		List<BensDireitosRequerente> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bens direitos requerente in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a matching bens direitos requerente could not be found
	 */
	@Override
	public BensDireitosRequerente findByUuid_Last(
			String uuid,
			OrderByComparator<BensDireitosRequerente> orderByComparator)
		throws NoSuchBensDireitosRequerenteException {

		BensDireitosRequerente bensDireitosRequerente = fetchByUuid_Last(
			uuid, orderByComparator);

		if (bensDireitosRequerente != null) {
			return bensDireitosRequerente;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchBensDireitosRequerenteException(sb.toString());
	}

	/**
	 * Returns the last bens direitos requerente in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos requerente, or <code>null</code> if a matching bens direitos requerente could not be found
	 */
	@Override
	public BensDireitosRequerente fetchByUuid_Last(
		String uuid,
		OrderByComparator<BensDireitosRequerente> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<BensDireitosRequerente> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bens direitos requerentes before and after the current bens direitos requerente in the ordered set where uuid = &#63;.
	 *
	 * @param bemId the primary key of the current bens direitos requerente
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a bens direitos requerente with the primary key could not be found
	 */
	@Override
	public BensDireitosRequerente[] findByUuid_PrevAndNext(
			long bemId, String uuid,
			OrderByComparator<BensDireitosRequerente> orderByComparator)
		throws NoSuchBensDireitosRequerenteException {

		uuid = Objects.toString(uuid, "");

		BensDireitosRequerente bensDireitosRequerente = findByPrimaryKey(bemId);

		Session session = null;

		try {
			session = openSession();

			BensDireitosRequerente[] array = new BensDireitosRequerenteImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, bensDireitosRequerente, uuid, orderByComparator, true);

			array[1] = bensDireitosRequerente;

			array[2] = getByUuid_PrevAndNext(
				session, bensDireitosRequerente, uuid, orderByComparator,
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

	protected BensDireitosRequerente getByUuid_PrevAndNext(
		Session session, BensDireitosRequerente bensDireitosRequerente,
		String uuid,
		OrderByComparator<BensDireitosRequerente> orderByComparator,
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

		sb.append(_SQL_SELECT_BENSDIREITOSREQUERENTE_WHERE);

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
			sb.append(BensDireitosRequerenteModelImpl.ORDER_BY_JPQL);
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
						bensDireitosRequerente)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<BensDireitosRequerente> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bens direitos requerentes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (BensDireitosRequerente bensDireitosRequerente :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(bensDireitosRequerente);
		}
	}

	/**
	 * Returns the number of bens direitos requerentes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching bens direitos requerentes
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_BENSDIREITOSREQUERENTE_WHERE);

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
		"bensDireitosRequerente.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(bensDireitosRequerente.uuid IS NULL OR bensDireitosRequerente.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByPropostaId;
	private FinderPath _finderPathWithoutPaginationFindByPropostaId;
	private FinderPath _finderPathCountByPropostaId;

	/**
	 * Returns all the bens direitos requerentes where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching bens direitos requerentes
	 */
	@Override
	public List<BensDireitosRequerente> findByPropostaId(long propostaId) {
		return findByPropostaId(
			propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bens direitos requerentes where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @return the range of matching bens direitos requerentes
	 */
	@Override
	public List<BensDireitosRequerente> findByPropostaId(
		long propostaId, int start, int end) {

		return findByPropostaId(propostaId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bens direitos requerentes where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bens direitos requerentes
	 */
	@Override
	public List<BensDireitosRequerente> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<BensDireitosRequerente> orderByComparator) {

		return findByPropostaId(
			propostaId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bens direitos requerentes where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bens direitos requerentes
	 */
	@Override
	public List<BensDireitosRequerente> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<BensDireitosRequerente> orderByComparator,
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

		List<BensDireitosRequerente> list = null;

		if (useFinderCache) {
			list = (List<BensDireitosRequerente>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BensDireitosRequerente bensDireitosRequerente : list) {
					if (propostaId != bensDireitosRequerente.getPropostaId()) {
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

			sb.append(_SQL_SELECT_BENSDIREITOSREQUERENTE_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(BensDireitosRequerenteModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

				list = (List<BensDireitosRequerente>)QueryUtil.list(
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
	 * Returns the first bens direitos requerente in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a matching bens direitos requerente could not be found
	 */
	@Override
	public BensDireitosRequerente findByPropostaId_First(
			long propostaId,
			OrderByComparator<BensDireitosRequerente> orderByComparator)
		throws NoSuchBensDireitosRequerenteException {

		BensDireitosRequerente bensDireitosRequerente = fetchByPropostaId_First(
			propostaId, orderByComparator);

		if (bensDireitosRequerente != null) {
			return bensDireitosRequerente;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchBensDireitosRequerenteException(sb.toString());
	}

	/**
	 * Returns the first bens direitos requerente in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos requerente, or <code>null</code> if a matching bens direitos requerente could not be found
	 */
	@Override
	public BensDireitosRequerente fetchByPropostaId_First(
		long propostaId,
		OrderByComparator<BensDireitosRequerente> orderByComparator) {

		List<BensDireitosRequerente> list = findByPropostaId(
			propostaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bens direitos requerente in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a matching bens direitos requerente could not be found
	 */
	@Override
	public BensDireitosRequerente findByPropostaId_Last(
			long propostaId,
			OrderByComparator<BensDireitosRequerente> orderByComparator)
		throws NoSuchBensDireitosRequerenteException {

		BensDireitosRequerente bensDireitosRequerente = fetchByPropostaId_Last(
			propostaId, orderByComparator);

		if (bensDireitosRequerente != null) {
			return bensDireitosRequerente;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchBensDireitosRequerenteException(sb.toString());
	}

	/**
	 * Returns the last bens direitos requerente in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos requerente, or <code>null</code> if a matching bens direitos requerente could not be found
	 */
	@Override
	public BensDireitosRequerente fetchByPropostaId_Last(
		long propostaId,
		OrderByComparator<BensDireitosRequerente> orderByComparator) {

		int count = countByPropostaId(propostaId);

		if (count == 0) {
			return null;
		}

		List<BensDireitosRequerente> list = findByPropostaId(
			propostaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bens direitos requerentes before and after the current bens direitos requerente in the ordered set where propostaId = &#63;.
	 *
	 * @param bemId the primary key of the current bens direitos requerente
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a bens direitos requerente with the primary key could not be found
	 */
	@Override
	public BensDireitosRequerente[] findByPropostaId_PrevAndNext(
			long bemId, long propostaId,
			OrderByComparator<BensDireitosRequerente> orderByComparator)
		throws NoSuchBensDireitosRequerenteException {

		BensDireitosRequerente bensDireitosRequerente = findByPrimaryKey(bemId);

		Session session = null;

		try {
			session = openSession();

			BensDireitosRequerente[] array = new BensDireitosRequerenteImpl[3];

			array[0] = getByPropostaId_PrevAndNext(
				session, bensDireitosRequerente, propostaId, orderByComparator,
				true);

			array[1] = bensDireitosRequerente;

			array[2] = getByPropostaId_PrevAndNext(
				session, bensDireitosRequerente, propostaId, orderByComparator,
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

	protected BensDireitosRequerente getByPropostaId_PrevAndNext(
		Session session, BensDireitosRequerente bensDireitosRequerente,
		long propostaId,
		OrderByComparator<BensDireitosRequerente> orderByComparator,
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

		sb.append(_SQL_SELECT_BENSDIREITOSREQUERENTE_WHERE);

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
			sb.append(BensDireitosRequerenteModelImpl.ORDER_BY_JPQL);
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
						bensDireitosRequerente)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<BensDireitosRequerente> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bens direitos requerentes where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	@Override
	public void removeByPropostaId(long propostaId) {
		for (BensDireitosRequerente bensDireitosRequerente :
				findByPropostaId(
					propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(bensDireitosRequerente);
		}
	}

	/**
	 * Returns the number of bens direitos requerentes where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching bens direitos requerentes
	 */
	@Override
	public int countByPropostaId(long propostaId) {
		FinderPath finderPath = _finderPathCountByPropostaId;

		Object[] finderArgs = new Object[] {propostaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_BENSDIREITOSREQUERENTE_WHERE);

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
		"bensDireitosRequerente.propostaId = ?";

	public BensDireitosRequerentePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(BensDireitosRequerente.class);

		setModelImplClass(BensDireitosRequerenteImpl.class);
		setModelPKClass(long.class);

		setTable(BensDireitosRequerenteTable.INSTANCE);
	}

	/**
	 * Caches the bens direitos requerente in the entity cache if it is enabled.
	 *
	 * @param bensDireitosRequerente the bens direitos requerente
	 */
	@Override
	public void cacheResult(BensDireitosRequerente bensDireitosRequerente) {
		entityCache.putResult(
			BensDireitosRequerenteImpl.class,
			bensDireitosRequerente.getPrimaryKey(), bensDireitosRequerente);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the bens direitos requerentes in the entity cache if it is enabled.
	 *
	 * @param bensDireitosRequerentes the bens direitos requerentes
	 */
	@Override
	public void cacheResult(
		List<BensDireitosRequerente> bensDireitosRequerentes) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (bensDireitosRequerentes.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (BensDireitosRequerente bensDireitosRequerente :
				bensDireitosRequerentes) {

			if (entityCache.getResult(
					BensDireitosRequerenteImpl.class,
					bensDireitosRequerente.getPrimaryKey()) == null) {

				cacheResult(bensDireitosRequerente);
			}
		}
	}

	/**
	 * Clears the cache for all bens direitos requerentes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BensDireitosRequerenteImpl.class);

		finderCache.clearCache(BensDireitosRequerenteImpl.class);
	}

	/**
	 * Clears the cache for the bens direitos requerente.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BensDireitosRequerente bensDireitosRequerente) {
		entityCache.removeResult(
			BensDireitosRequerenteImpl.class, bensDireitosRequerente);
	}

	@Override
	public void clearCache(
		List<BensDireitosRequerente> bensDireitosRequerentes) {

		for (BensDireitosRequerente bensDireitosRequerente :
				bensDireitosRequerentes) {

			entityCache.removeResult(
				BensDireitosRequerenteImpl.class, bensDireitosRequerente);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(BensDireitosRequerenteImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				BensDireitosRequerenteImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new bens direitos requerente with the primary key. Does not add the bens direitos requerente to the database.
	 *
	 * @param bemId the primary key for the new bens direitos requerente
	 * @return the new bens direitos requerente
	 */
	@Override
	public BensDireitosRequerente create(long bemId) {
		BensDireitosRequerente bensDireitosRequerente =
			new BensDireitosRequerenteImpl();

		bensDireitosRequerente.setNew(true);
		bensDireitosRequerente.setPrimaryKey(bemId);

		String uuid = PortalUUIDUtil.generate();

		bensDireitosRequerente.setUuid(uuid);

		return bensDireitosRequerente;
	}

	/**
	 * Removes the bens direitos requerente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bemId the primary key of the bens direitos requerente
	 * @return the bens direitos requerente that was removed
	 * @throws NoSuchBensDireitosRequerenteException if a bens direitos requerente with the primary key could not be found
	 */
	@Override
	public BensDireitosRequerente remove(long bemId)
		throws NoSuchBensDireitosRequerenteException {

		return remove((Serializable)bemId);
	}

	/**
	 * Removes the bens direitos requerente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bens direitos requerente
	 * @return the bens direitos requerente that was removed
	 * @throws NoSuchBensDireitosRequerenteException if a bens direitos requerente with the primary key could not be found
	 */
	@Override
	public BensDireitosRequerente remove(Serializable primaryKey)
		throws NoSuchBensDireitosRequerenteException {

		Session session = null;

		try {
			session = openSession();

			BensDireitosRequerente bensDireitosRequerente =
				(BensDireitosRequerente)session.get(
					BensDireitosRequerenteImpl.class, primaryKey);

			if (bensDireitosRequerente == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBensDireitosRequerenteException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(bensDireitosRequerente);
		}
		catch (NoSuchBensDireitosRequerenteException noSuchEntityException) {
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
	protected BensDireitosRequerente removeImpl(
		BensDireitosRequerente bensDireitosRequerente) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bensDireitosRequerente)) {
				bensDireitosRequerente = (BensDireitosRequerente)session.get(
					BensDireitosRequerenteImpl.class,
					bensDireitosRequerente.getPrimaryKeyObj());
			}

			if (bensDireitosRequerente != null) {
				session.delete(bensDireitosRequerente);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (bensDireitosRequerente != null) {
			clearCache(bensDireitosRequerente);
		}

		return bensDireitosRequerente;
	}

	@Override
	public BensDireitosRequerente updateImpl(
		BensDireitosRequerente bensDireitosRequerente) {

		boolean isNew = bensDireitosRequerente.isNew();

		if (!(bensDireitosRequerente instanceof
				BensDireitosRequerenteModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(bensDireitosRequerente.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					bensDireitosRequerente);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in bensDireitosRequerente proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom BensDireitosRequerente implementation " +
					bensDireitosRequerente.getClass());
		}

		BensDireitosRequerenteModelImpl bensDireitosRequerenteModelImpl =
			(BensDireitosRequerenteModelImpl)bensDireitosRequerente;

		if (Validator.isNull(bensDireitosRequerente.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			bensDireitosRequerente.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(bensDireitosRequerente);
			}
			else {
				bensDireitosRequerente = (BensDireitosRequerente)session.merge(
					bensDireitosRequerente);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			BensDireitosRequerenteImpl.class, bensDireitosRequerenteModelImpl,
			false, true);

		if (isNew) {
			bensDireitosRequerente.setNew(false);
		}

		bensDireitosRequerente.resetOriginalValues();

		return bensDireitosRequerente;
	}

	/**
	 * Returns the bens direitos requerente with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bens direitos requerente
	 * @return the bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a bens direitos requerente with the primary key could not be found
	 */
	@Override
	public BensDireitosRequerente findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBensDireitosRequerenteException {

		BensDireitosRequerente bensDireitosRequerente = fetchByPrimaryKey(
			primaryKey);

		if (bensDireitosRequerente == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBensDireitosRequerenteException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return bensDireitosRequerente;
	}

	/**
	 * Returns the bens direitos requerente with the primary key or throws a <code>NoSuchBensDireitosRequerenteException</code> if it could not be found.
	 *
	 * @param bemId the primary key of the bens direitos requerente
	 * @return the bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a bens direitos requerente with the primary key could not be found
	 */
	@Override
	public BensDireitosRequerente findByPrimaryKey(long bemId)
		throws NoSuchBensDireitosRequerenteException {

		return findByPrimaryKey((Serializable)bemId);
	}

	/**
	 * Returns the bens direitos requerente with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bemId the primary key of the bens direitos requerente
	 * @return the bens direitos requerente, or <code>null</code> if a bens direitos requerente with the primary key could not be found
	 */
	@Override
	public BensDireitosRequerente fetchByPrimaryKey(long bemId) {
		return fetchByPrimaryKey((Serializable)bemId);
	}

	/**
	 * Returns all the bens direitos requerentes.
	 *
	 * @return the bens direitos requerentes
	 */
	@Override
	public List<BensDireitosRequerente> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bens direitos requerentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @return the range of bens direitos requerentes
	 */
	@Override
	public List<BensDireitosRequerente> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bens direitos requerentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bens direitos requerentes
	 */
	@Override
	public List<BensDireitosRequerente> findAll(
		int start, int end,
		OrderByComparator<BensDireitosRequerente> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bens direitos requerentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bens direitos requerentes
	 */
	@Override
	public List<BensDireitosRequerente> findAll(
		int start, int end,
		OrderByComparator<BensDireitosRequerente> orderByComparator,
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

		List<BensDireitosRequerente> list = null;

		if (useFinderCache) {
			list = (List<BensDireitosRequerente>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_BENSDIREITOSREQUERENTE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_BENSDIREITOSREQUERENTE;

				sql = sql.concat(BensDireitosRequerenteModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<BensDireitosRequerente>)QueryUtil.list(
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
	 * Removes all the bens direitos requerentes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (BensDireitosRequerente bensDireitosRequerente : findAll()) {
			remove(bensDireitosRequerente);
		}
	}

	/**
	 * Returns the number of bens direitos requerentes.
	 *
	 * @return the number of bens direitos requerentes
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
					_SQL_COUNT_BENSDIREITOSREQUERENTE);

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
		return "bemId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_BENSDIREITOSREQUERENTE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return BensDireitosRequerenteModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the bens direitos requerente persistence.
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

		BensDireitosRequerenteUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		BensDireitosRequerenteUtil.setPersistence(null);

		entityCache.removeCache(BensDireitosRequerenteImpl.class.getName());
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

	private static final String _SQL_SELECT_BENSDIREITOSREQUERENTE =
		"SELECT bensDireitosRequerente FROM BensDireitosRequerente bensDireitosRequerente";

	private static final String _SQL_SELECT_BENSDIREITOSREQUERENTE_WHERE =
		"SELECT bensDireitosRequerente FROM BensDireitosRequerente bensDireitosRequerente WHERE ";

	private static final String _SQL_COUNT_BENSDIREITOSREQUERENTE =
		"SELECT COUNT(bensDireitosRequerente) FROM BensDireitosRequerente bensDireitosRequerente";

	private static final String _SQL_COUNT_BENSDIREITOSREQUERENTE_WHERE =
		"SELECT COUNT(bensDireitosRequerente) FROM BensDireitosRequerente bensDireitosRequerente WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"bensDireitosRequerente.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No BensDireitosRequerente exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No BensDireitosRequerente exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		BensDireitosRequerentePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}