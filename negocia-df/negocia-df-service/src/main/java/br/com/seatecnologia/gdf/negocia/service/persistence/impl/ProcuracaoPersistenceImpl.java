/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchProcuracaoException;
import br.com.seatecnologia.gdf.negocia.model.Procuracao;
import br.com.seatecnologia.gdf.negocia.model.ProcuracaoTable;
import br.com.seatecnologia.gdf.negocia.model.impl.ProcuracaoImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.ProcuracaoModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.ProcuracaoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.ProcuracaoUtil;
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
 * The persistence implementation for the procuracao service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ProcuracaoPersistence.class)
public class ProcuracaoPersistenceImpl
	extends BasePersistenceImpl<Procuracao> implements ProcuracaoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ProcuracaoUtil</code> to access the procuracao persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ProcuracaoImpl.class.getName();

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
	 * Returns all the procuracaos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching procuracaos
	 */
	@Override
	public List<Procuracao> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the procuracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @return the range of matching procuracaos
	 */
	@Override
	public List<Procuracao> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the procuracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching procuracaos
	 */
	@Override
	public List<Procuracao> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Procuracao> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the procuracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching procuracaos
	 */
	@Override
	public List<Procuracao> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Procuracao> orderByComparator,
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

		List<Procuracao> list = null;

		if (useFinderCache) {
			list = (List<Procuracao>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Procuracao procuracao : list) {
					if (!uuid.equals(procuracao.getUuid())) {
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

			sb.append(_SQL_SELECT_PROCURACAO_WHERE);

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
				sb.append(ProcuracaoModelImpl.ORDER_BY_JPQL);
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

				list = (List<Procuracao>)QueryUtil.list(
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
	 * Returns the first procuracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching procuracao
	 * @throws NoSuchProcuracaoException if a matching procuracao could not be found
	 */
	@Override
	public Procuracao findByUuid_First(
			String uuid, OrderByComparator<Procuracao> orderByComparator)
		throws NoSuchProcuracaoException {

		Procuracao procuracao = fetchByUuid_First(uuid, orderByComparator);

		if (procuracao != null) {
			return procuracao;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchProcuracaoException(sb.toString());
	}

	/**
	 * Returns the first procuracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching procuracao, or <code>null</code> if a matching procuracao could not be found
	 */
	@Override
	public Procuracao fetchByUuid_First(
		String uuid, OrderByComparator<Procuracao> orderByComparator) {

		List<Procuracao> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last procuracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching procuracao
	 * @throws NoSuchProcuracaoException if a matching procuracao could not be found
	 */
	@Override
	public Procuracao findByUuid_Last(
			String uuid, OrderByComparator<Procuracao> orderByComparator)
		throws NoSuchProcuracaoException {

		Procuracao procuracao = fetchByUuid_Last(uuid, orderByComparator);

		if (procuracao != null) {
			return procuracao;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchProcuracaoException(sb.toString());
	}

	/**
	 * Returns the last procuracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching procuracao, or <code>null</code> if a matching procuracao could not be found
	 */
	@Override
	public Procuracao fetchByUuid_Last(
		String uuid, OrderByComparator<Procuracao> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Procuracao> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the procuracaos before and after the current procuracao in the ordered set where uuid = &#63;.
	 *
	 * @param procuracaoId the primary key of the current procuracao
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next procuracao
	 * @throws NoSuchProcuracaoException if a procuracao with the primary key could not be found
	 */
	@Override
	public Procuracao[] findByUuid_PrevAndNext(
			long procuracaoId, String uuid,
			OrderByComparator<Procuracao> orderByComparator)
		throws NoSuchProcuracaoException {

		uuid = Objects.toString(uuid, "");

		Procuracao procuracao = findByPrimaryKey(procuracaoId);

		Session session = null;

		try {
			session = openSession();

			Procuracao[] array = new ProcuracaoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, procuracao, uuid, orderByComparator, true);

			array[1] = procuracao;

			array[2] = getByUuid_PrevAndNext(
				session, procuracao, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Procuracao getByUuid_PrevAndNext(
		Session session, Procuracao procuracao, String uuid,
		OrderByComparator<Procuracao> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PROCURACAO_WHERE);

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
			sb.append(ProcuracaoModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(procuracao)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Procuracao> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the procuracaos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Procuracao procuracao :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(procuracao);
		}
	}

	/**
	 * Returns the number of procuracaos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching procuracaos
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PROCURACAO_WHERE);

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
		"procuracao.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(procuracao.uuid IS NULL OR procuracao.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByPropostaId;
	private FinderPath _finderPathWithoutPaginationFindByPropostaId;
	private FinderPath _finderPathCountByPropostaId;

	/**
	 * Returns all the procuracaos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching procuracaos
	 */
	@Override
	public List<Procuracao> findByPropostaId(long propostaId) {
		return findByPropostaId(
			propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the procuracaos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @return the range of matching procuracaos
	 */
	@Override
	public List<Procuracao> findByPropostaId(
		long propostaId, int start, int end) {

		return findByPropostaId(propostaId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the procuracaos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching procuracaos
	 */
	@Override
	public List<Procuracao> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<Procuracao> orderByComparator) {

		return findByPropostaId(
			propostaId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the procuracaos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching procuracaos
	 */
	@Override
	public List<Procuracao> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<Procuracao> orderByComparator,
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

		List<Procuracao> list = null;

		if (useFinderCache) {
			list = (List<Procuracao>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Procuracao procuracao : list) {
					if (propostaId != procuracao.getPropostaId()) {
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

			sb.append(_SQL_SELECT_PROCURACAO_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ProcuracaoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

				list = (List<Procuracao>)QueryUtil.list(
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
	 * Returns the first procuracao in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching procuracao
	 * @throws NoSuchProcuracaoException if a matching procuracao could not be found
	 */
	@Override
	public Procuracao findByPropostaId_First(
			long propostaId, OrderByComparator<Procuracao> orderByComparator)
		throws NoSuchProcuracaoException {

		Procuracao procuracao = fetchByPropostaId_First(
			propostaId, orderByComparator);

		if (procuracao != null) {
			return procuracao;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchProcuracaoException(sb.toString());
	}

	/**
	 * Returns the first procuracao in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching procuracao, or <code>null</code> if a matching procuracao could not be found
	 */
	@Override
	public Procuracao fetchByPropostaId_First(
		long propostaId, OrderByComparator<Procuracao> orderByComparator) {

		List<Procuracao> list = findByPropostaId(
			propostaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last procuracao in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching procuracao
	 * @throws NoSuchProcuracaoException if a matching procuracao could not be found
	 */
	@Override
	public Procuracao findByPropostaId_Last(
			long propostaId, OrderByComparator<Procuracao> orderByComparator)
		throws NoSuchProcuracaoException {

		Procuracao procuracao = fetchByPropostaId_Last(
			propostaId, orderByComparator);

		if (procuracao != null) {
			return procuracao;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("propostaId=");
		sb.append(propostaId);

		sb.append("}");

		throw new NoSuchProcuracaoException(sb.toString());
	}

	/**
	 * Returns the last procuracao in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching procuracao, or <code>null</code> if a matching procuracao could not be found
	 */
	@Override
	public Procuracao fetchByPropostaId_Last(
		long propostaId, OrderByComparator<Procuracao> orderByComparator) {

		int count = countByPropostaId(propostaId);

		if (count == 0) {
			return null;
		}

		List<Procuracao> list = findByPropostaId(
			propostaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the procuracaos before and after the current procuracao in the ordered set where propostaId = &#63;.
	 *
	 * @param procuracaoId the primary key of the current procuracao
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next procuracao
	 * @throws NoSuchProcuracaoException if a procuracao with the primary key could not be found
	 */
	@Override
	public Procuracao[] findByPropostaId_PrevAndNext(
			long procuracaoId, long propostaId,
			OrderByComparator<Procuracao> orderByComparator)
		throws NoSuchProcuracaoException {

		Procuracao procuracao = findByPrimaryKey(procuracaoId);

		Session session = null;

		try {
			session = openSession();

			Procuracao[] array = new ProcuracaoImpl[3];

			array[0] = getByPropostaId_PrevAndNext(
				session, procuracao, propostaId, orderByComparator, true);

			array[1] = procuracao;

			array[2] = getByPropostaId_PrevAndNext(
				session, procuracao, propostaId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Procuracao getByPropostaId_PrevAndNext(
		Session session, Procuracao procuracao, long propostaId,
		OrderByComparator<Procuracao> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PROCURACAO_WHERE);

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
			sb.append(ProcuracaoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(propostaId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(procuracao)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Procuracao> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the procuracaos where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	@Override
	public void removeByPropostaId(long propostaId) {
		for (Procuracao procuracao :
				findByPropostaId(
					propostaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(procuracao);
		}
	}

	/**
	 * Returns the number of procuracaos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching procuracaos
	 */
	@Override
	public int countByPropostaId(long propostaId) {
		FinderPath finderPath = _finderPathCountByPropostaId;

		Object[] finderArgs = new Object[] {propostaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PROCURACAO_WHERE);

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
		"procuracao.propostaId = ?";

	public ProcuracaoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Procuracao.class);

		setModelImplClass(ProcuracaoImpl.class);
		setModelPKClass(long.class);

		setTable(ProcuracaoTable.INSTANCE);
	}

	/**
	 * Caches the procuracao in the entity cache if it is enabled.
	 *
	 * @param procuracao the procuracao
	 */
	@Override
	public void cacheResult(Procuracao procuracao) {
		entityCache.putResult(
			ProcuracaoImpl.class, procuracao.getPrimaryKey(), procuracao);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the procuracaos in the entity cache if it is enabled.
	 *
	 * @param procuracaos the procuracaos
	 */
	@Override
	public void cacheResult(List<Procuracao> procuracaos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (procuracaos.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Procuracao procuracao : procuracaos) {
			if (entityCache.getResult(
					ProcuracaoImpl.class, procuracao.getPrimaryKey()) == null) {

				cacheResult(procuracao);
			}
		}
	}

	/**
	 * Clears the cache for all procuracaos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ProcuracaoImpl.class);

		finderCache.clearCache(ProcuracaoImpl.class);
	}

	/**
	 * Clears the cache for the procuracao.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Procuracao procuracao) {
		entityCache.removeResult(ProcuracaoImpl.class, procuracao);
	}

	@Override
	public void clearCache(List<Procuracao> procuracaos) {
		for (Procuracao procuracao : procuracaos) {
			entityCache.removeResult(ProcuracaoImpl.class, procuracao);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ProcuracaoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ProcuracaoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new procuracao with the primary key. Does not add the procuracao to the database.
	 *
	 * @param procuracaoId the primary key for the new procuracao
	 * @return the new procuracao
	 */
	@Override
	public Procuracao create(long procuracaoId) {
		Procuracao procuracao = new ProcuracaoImpl();

		procuracao.setNew(true);
		procuracao.setPrimaryKey(procuracaoId);

		String uuid = PortalUUIDUtil.generate();

		procuracao.setUuid(uuid);

		return procuracao;
	}

	/**
	 * Removes the procuracao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param procuracaoId the primary key of the procuracao
	 * @return the procuracao that was removed
	 * @throws NoSuchProcuracaoException if a procuracao with the primary key could not be found
	 */
	@Override
	public Procuracao remove(long procuracaoId)
		throws NoSuchProcuracaoException {

		return remove((Serializable)procuracaoId);
	}

	/**
	 * Removes the procuracao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the procuracao
	 * @return the procuracao that was removed
	 * @throws NoSuchProcuracaoException if a procuracao with the primary key could not be found
	 */
	@Override
	public Procuracao remove(Serializable primaryKey)
		throws NoSuchProcuracaoException {

		Session session = null;

		try {
			session = openSession();

			Procuracao procuracao = (Procuracao)session.get(
				ProcuracaoImpl.class, primaryKey);

			if (procuracao == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProcuracaoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(procuracao);
		}
		catch (NoSuchProcuracaoException noSuchEntityException) {
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
	protected Procuracao removeImpl(Procuracao procuracao) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(procuracao)) {
				procuracao = (Procuracao)session.get(
					ProcuracaoImpl.class, procuracao.getPrimaryKeyObj());
			}

			if (procuracao != null) {
				session.delete(procuracao);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (procuracao != null) {
			clearCache(procuracao);
		}

		return procuracao;
	}

	@Override
	public Procuracao updateImpl(Procuracao procuracao) {
		boolean isNew = procuracao.isNew();

		if (!(procuracao instanceof ProcuracaoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(procuracao.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(procuracao);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in procuracao proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Procuracao implementation " +
					procuracao.getClass());
		}

		ProcuracaoModelImpl procuracaoModelImpl =
			(ProcuracaoModelImpl)procuracao;

		if (Validator.isNull(procuracao.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			procuracao.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(procuracao);
			}
			else {
				procuracao = (Procuracao)session.merge(procuracao);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ProcuracaoImpl.class, procuracaoModelImpl, false, true);

		if (isNew) {
			procuracao.setNew(false);
		}

		procuracao.resetOriginalValues();

		return procuracao;
	}

	/**
	 * Returns the procuracao with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the procuracao
	 * @return the procuracao
	 * @throws NoSuchProcuracaoException if a procuracao with the primary key could not be found
	 */
	@Override
	public Procuracao findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProcuracaoException {

		Procuracao procuracao = fetchByPrimaryKey(primaryKey);

		if (procuracao == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProcuracaoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return procuracao;
	}

	/**
	 * Returns the procuracao with the primary key or throws a <code>NoSuchProcuracaoException</code> if it could not be found.
	 *
	 * @param procuracaoId the primary key of the procuracao
	 * @return the procuracao
	 * @throws NoSuchProcuracaoException if a procuracao with the primary key could not be found
	 */
	@Override
	public Procuracao findByPrimaryKey(long procuracaoId)
		throws NoSuchProcuracaoException {

		return findByPrimaryKey((Serializable)procuracaoId);
	}

	/**
	 * Returns the procuracao with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param procuracaoId the primary key of the procuracao
	 * @return the procuracao, or <code>null</code> if a procuracao with the primary key could not be found
	 */
	@Override
	public Procuracao fetchByPrimaryKey(long procuracaoId) {
		return fetchByPrimaryKey((Serializable)procuracaoId);
	}

	/**
	 * Returns all the procuracaos.
	 *
	 * @return the procuracaos
	 */
	@Override
	public List<Procuracao> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the procuracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @return the range of procuracaos
	 */
	@Override
	public List<Procuracao> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the procuracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of procuracaos
	 */
	@Override
	public List<Procuracao> findAll(
		int start, int end, OrderByComparator<Procuracao> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the procuracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of procuracaos
	 */
	@Override
	public List<Procuracao> findAll(
		int start, int end, OrderByComparator<Procuracao> orderByComparator,
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

		List<Procuracao> list = null;

		if (useFinderCache) {
			list = (List<Procuracao>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PROCURACAO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PROCURACAO;

				sql = sql.concat(ProcuracaoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Procuracao>)QueryUtil.list(
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
	 * Removes all the procuracaos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Procuracao procuracao : findAll()) {
			remove(procuracao);
		}
	}

	/**
	 * Returns the number of procuracaos.
	 *
	 * @return the number of procuracaos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PROCURACAO);

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
		return "procuracaoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PROCURACAO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ProcuracaoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the procuracao persistence.
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

		ProcuracaoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ProcuracaoUtil.setPersistence(null);

		entityCache.removeCache(ProcuracaoImpl.class.getName());
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

	private static final String _SQL_SELECT_PROCURACAO =
		"SELECT procuracao FROM Procuracao procuracao";

	private static final String _SQL_SELECT_PROCURACAO_WHERE =
		"SELECT procuracao FROM Procuracao procuracao WHERE ";

	private static final String _SQL_COUNT_PROCURACAO =
		"SELECT COUNT(procuracao) FROM Procuracao procuracao";

	private static final String _SQL_COUNT_PROCURACAO_WHERE =
		"SELECT COUNT(procuracao) FROM Procuracao procuracao WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "procuracao.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Procuracao exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Procuracao exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ProcuracaoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}