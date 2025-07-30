/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDeclaracaoException;
import br.com.seatecnologia.gdf.negocia.model.Declaracao;
import br.com.seatecnologia.gdf.negocia.model.DeclaracaoTable;
import br.com.seatecnologia.gdf.negocia.model.impl.DeclaracaoImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.DeclaracaoModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.DeclaracaoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DeclaracaoUtil;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
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
 * The persistence implementation for the declaracao service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = DeclaracaoPersistence.class)
public class DeclaracaoPersistenceImpl
	extends BasePersistenceImpl<Declaracao> implements DeclaracaoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DeclaracaoUtil</code> to access the declaracao persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DeclaracaoImpl.class.getName();

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
	 * Returns all the declaracaos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching declaracaos
	 */
	@Override
	public List<Declaracao> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the declaracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @return the range of matching declaracaos
	 */
	@Override
	public List<Declaracao> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the declaracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching declaracaos
	 */
	@Override
	public List<Declaracao> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Declaracao> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the declaracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching declaracaos
	 */
	@Override
	public List<Declaracao> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Declaracao> orderByComparator,
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

		List<Declaracao> list = null;

		if (useFinderCache) {
			list = (List<Declaracao>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Declaracao declaracao : list) {
					if (!uuid.equals(declaracao.getUuid())) {
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

			sb.append(_SQL_SELECT_DECLARACAO_WHERE);

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
				sb.append(DeclaracaoModelImpl.ORDER_BY_JPQL);
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

				list = (List<Declaracao>)QueryUtil.list(
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
	 * Returns the first declaracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching declaracao
	 * @throws NoSuchDeclaracaoException if a matching declaracao could not be found
	 */
	@Override
	public Declaracao findByUuid_First(
			String uuid, OrderByComparator<Declaracao> orderByComparator)
		throws NoSuchDeclaracaoException {

		Declaracao declaracao = fetchByUuid_First(uuid, orderByComparator);

		if (declaracao != null) {
			return declaracao;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDeclaracaoException(sb.toString());
	}

	/**
	 * Returns the first declaracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching declaracao, or <code>null</code> if a matching declaracao could not be found
	 */
	@Override
	public Declaracao fetchByUuid_First(
		String uuid, OrderByComparator<Declaracao> orderByComparator) {

		List<Declaracao> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last declaracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching declaracao
	 * @throws NoSuchDeclaracaoException if a matching declaracao could not be found
	 */
	@Override
	public Declaracao findByUuid_Last(
			String uuid, OrderByComparator<Declaracao> orderByComparator)
		throws NoSuchDeclaracaoException {

		Declaracao declaracao = fetchByUuid_Last(uuid, orderByComparator);

		if (declaracao != null) {
			return declaracao;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDeclaracaoException(sb.toString());
	}

	/**
	 * Returns the last declaracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching declaracao, or <code>null</code> if a matching declaracao could not be found
	 */
	@Override
	public Declaracao fetchByUuid_Last(
		String uuid, OrderByComparator<Declaracao> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Declaracao> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the declaracaos before and after the current declaracao in the ordered set where uuid = &#63;.
	 *
	 * @param declaracaoId the primary key of the current declaracao
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next declaracao
	 * @throws NoSuchDeclaracaoException if a declaracao with the primary key could not be found
	 */
	@Override
	public Declaracao[] findByUuid_PrevAndNext(
			long declaracaoId, String uuid,
			OrderByComparator<Declaracao> orderByComparator)
		throws NoSuchDeclaracaoException {

		uuid = Objects.toString(uuid, "");

		Declaracao declaracao = findByPrimaryKey(declaracaoId);

		Session session = null;

		try {
			session = openSession();

			Declaracao[] array = new DeclaracaoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, declaracao, uuid, orderByComparator, true);

			array[1] = declaracao;

			array[2] = getByUuid_PrevAndNext(
				session, declaracao, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Declaracao getByUuid_PrevAndNext(
		Session session, Declaracao declaracao, String uuid,
		OrderByComparator<Declaracao> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_DECLARACAO_WHERE);

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
			sb.append(DeclaracaoModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(declaracao)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Declaracao> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the declaracaos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Declaracao declaracao :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(declaracao);
		}
	}

	/**
	 * Returns the number of declaracaos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching declaracaos
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DECLARACAO_WHERE);

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
		"declaracao.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(declaracao.uuid IS NULL OR declaracao.uuid = '')";

	private FinderPath _finderPathFetchByPropostaId;

	/**
	 * Returns the declaracao where propostaId = &#63; or throws a <code>NoSuchDeclaracaoException</code> if it could not be found.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching declaracao
	 * @throws NoSuchDeclaracaoException if a matching declaracao could not be found
	 */
	@Override
	public Declaracao findByPropostaId(long propostaId)
		throws NoSuchDeclaracaoException {

		Declaracao declaracao = fetchByPropostaId(propostaId);

		if (declaracao == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("propostaId=");
			sb.append(propostaId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchDeclaracaoException(sb.toString());
		}

		return declaracao;
	}

	/**
	 * Returns the declaracao where propostaId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching declaracao, or <code>null</code> if a matching declaracao could not be found
	 */
	@Override
	public Declaracao fetchByPropostaId(long propostaId) {
		return fetchByPropostaId(propostaId, true);
	}

	/**
	 * Returns the declaracao where propostaId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param propostaId the proposta ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching declaracao, or <code>null</code> if a matching declaracao could not be found
	 */
	@Override
	public Declaracao fetchByPropostaId(
		long propostaId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {propostaId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByPropostaId, finderArgs, this);
		}

		if (result instanceof Declaracao) {
			Declaracao declaracao = (Declaracao)result;

			if (propostaId != declaracao.getPropostaId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_DECLARACAO_WHERE);

			sb.append(_FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(propostaId);

				List<Declaracao> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByPropostaId, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {propostaId};
							}

							_log.warn(
								"DeclaracaoPersistenceImpl.fetchByPropostaId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					Declaracao declaracao = list.get(0);

					result = declaracao;

					cacheResult(declaracao);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Declaracao)result;
		}
	}

	/**
	 * Removes the declaracao where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 * @return the declaracao that was removed
	 */
	@Override
	public Declaracao removeByPropostaId(long propostaId)
		throws NoSuchDeclaracaoException {

		Declaracao declaracao = findByPropostaId(propostaId);

		return remove(declaracao);
	}

	/**
	 * Returns the number of declaracaos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching declaracaos
	 */
	@Override
	public int countByPropostaId(long propostaId) {
		Declaracao declaracao = fetchByPropostaId(propostaId);

		if (declaracao == null) {
			return 0;
		}

		return 1;
	}

	private static final String _FINDER_COLUMN_PROPOSTAID_PROPOSTAID_2 =
		"declaracao.propostaId = ?";

	public DeclaracaoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Declaracao.class);

		setModelImplClass(DeclaracaoImpl.class);
		setModelPKClass(long.class);

		setTable(DeclaracaoTable.INSTANCE);
	}

	/**
	 * Caches the declaracao in the entity cache if it is enabled.
	 *
	 * @param declaracao the declaracao
	 */
	@Override
	public void cacheResult(Declaracao declaracao) {
		entityCache.putResult(
			DeclaracaoImpl.class, declaracao.getPrimaryKey(), declaracao);

		finderCache.putResult(
			_finderPathFetchByPropostaId,
			new Object[] {declaracao.getPropostaId()}, declaracao);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the declaracaos in the entity cache if it is enabled.
	 *
	 * @param declaracaos the declaracaos
	 */
	@Override
	public void cacheResult(List<Declaracao> declaracaos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (declaracaos.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Declaracao declaracao : declaracaos) {
			if (entityCache.getResult(
					DeclaracaoImpl.class, declaracao.getPrimaryKey()) == null) {

				cacheResult(declaracao);
			}
		}
	}

	/**
	 * Clears the cache for all declaracaos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DeclaracaoImpl.class);

		finderCache.clearCache(DeclaracaoImpl.class);
	}

	/**
	 * Clears the cache for the declaracao.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Declaracao declaracao) {
		entityCache.removeResult(DeclaracaoImpl.class, declaracao);
	}

	@Override
	public void clearCache(List<Declaracao> declaracaos) {
		for (Declaracao declaracao : declaracaos) {
			entityCache.removeResult(DeclaracaoImpl.class, declaracao);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DeclaracaoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(DeclaracaoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		DeclaracaoModelImpl declaracaoModelImpl) {

		Object[] args = new Object[] {declaracaoModelImpl.getPropostaId()};

		finderCache.putResult(
			_finderPathFetchByPropostaId, args, declaracaoModelImpl);
	}

	/**
	 * Creates a new declaracao with the primary key. Does not add the declaracao to the database.
	 *
	 * @param declaracaoId the primary key for the new declaracao
	 * @return the new declaracao
	 */
	@Override
	public Declaracao create(long declaracaoId) {
		Declaracao declaracao = new DeclaracaoImpl();

		declaracao.setNew(true);
		declaracao.setPrimaryKey(declaracaoId);

		String uuid = PortalUUIDUtil.generate();

		declaracao.setUuid(uuid);

		return declaracao;
	}

	/**
	 * Removes the declaracao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param declaracaoId the primary key of the declaracao
	 * @return the declaracao that was removed
	 * @throws NoSuchDeclaracaoException if a declaracao with the primary key could not be found
	 */
	@Override
	public Declaracao remove(long declaracaoId)
		throws NoSuchDeclaracaoException {

		return remove((Serializable)declaracaoId);
	}

	/**
	 * Removes the declaracao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the declaracao
	 * @return the declaracao that was removed
	 * @throws NoSuchDeclaracaoException if a declaracao with the primary key could not be found
	 */
	@Override
	public Declaracao remove(Serializable primaryKey)
		throws NoSuchDeclaracaoException {

		Session session = null;

		try {
			session = openSession();

			Declaracao declaracao = (Declaracao)session.get(
				DeclaracaoImpl.class, primaryKey);

			if (declaracao == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDeclaracaoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(declaracao);
		}
		catch (NoSuchDeclaracaoException noSuchEntityException) {
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
	protected Declaracao removeImpl(Declaracao declaracao) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(declaracao)) {
				declaracao = (Declaracao)session.get(
					DeclaracaoImpl.class, declaracao.getPrimaryKeyObj());
			}

			if (declaracao != null) {
				session.delete(declaracao);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (declaracao != null) {
			clearCache(declaracao);
		}

		return declaracao;
	}

	@Override
	public Declaracao updateImpl(Declaracao declaracao) {
		boolean isNew = declaracao.isNew();

		if (!(declaracao instanceof DeclaracaoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(declaracao.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(declaracao);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in declaracao proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Declaracao implementation " +
					declaracao.getClass());
		}

		DeclaracaoModelImpl declaracaoModelImpl =
			(DeclaracaoModelImpl)declaracao;

		if (Validator.isNull(declaracao.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			declaracao.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(declaracao);
			}
			else {
				declaracao = (Declaracao)session.merge(declaracao);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DeclaracaoImpl.class, declaracaoModelImpl, false, true);

		cacheUniqueFindersCache(declaracaoModelImpl);

		if (isNew) {
			declaracao.setNew(false);
		}

		declaracao.resetOriginalValues();

		return declaracao;
	}

	/**
	 * Returns the declaracao with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the declaracao
	 * @return the declaracao
	 * @throws NoSuchDeclaracaoException if a declaracao with the primary key could not be found
	 */
	@Override
	public Declaracao findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDeclaracaoException {

		Declaracao declaracao = fetchByPrimaryKey(primaryKey);

		if (declaracao == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDeclaracaoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return declaracao;
	}

	/**
	 * Returns the declaracao with the primary key or throws a <code>NoSuchDeclaracaoException</code> if it could not be found.
	 *
	 * @param declaracaoId the primary key of the declaracao
	 * @return the declaracao
	 * @throws NoSuchDeclaracaoException if a declaracao with the primary key could not be found
	 */
	@Override
	public Declaracao findByPrimaryKey(long declaracaoId)
		throws NoSuchDeclaracaoException {

		return findByPrimaryKey((Serializable)declaracaoId);
	}

	/**
	 * Returns the declaracao with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param declaracaoId the primary key of the declaracao
	 * @return the declaracao, or <code>null</code> if a declaracao with the primary key could not be found
	 */
	@Override
	public Declaracao fetchByPrimaryKey(long declaracaoId) {
		return fetchByPrimaryKey((Serializable)declaracaoId);
	}

	/**
	 * Returns all the declaracaos.
	 *
	 * @return the declaracaos
	 */
	@Override
	public List<Declaracao> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the declaracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @return the range of declaracaos
	 */
	@Override
	public List<Declaracao> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the declaracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of declaracaos
	 */
	@Override
	public List<Declaracao> findAll(
		int start, int end, OrderByComparator<Declaracao> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the declaracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of declaracaos
	 */
	@Override
	public List<Declaracao> findAll(
		int start, int end, OrderByComparator<Declaracao> orderByComparator,
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

		List<Declaracao> list = null;

		if (useFinderCache) {
			list = (List<Declaracao>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DECLARACAO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DECLARACAO;

				sql = sql.concat(DeclaracaoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Declaracao>)QueryUtil.list(
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
	 * Removes all the declaracaos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Declaracao declaracao : findAll()) {
			remove(declaracao);
		}
	}

	/**
	 * Returns the number of declaracaos.
	 *
	 * @return the number of declaracaos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_DECLARACAO);

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
		return "declaracaoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DECLARACAO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DeclaracaoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the declaracao persistence.
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

		_finderPathFetchByPropostaId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByPropostaId",
			new String[] {Long.class.getName()}, new String[] {"propostaId"},
			true);

		DeclaracaoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		DeclaracaoUtil.setPersistence(null);

		entityCache.removeCache(DeclaracaoImpl.class.getName());
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

	private static final String _SQL_SELECT_DECLARACAO =
		"SELECT declaracao FROM Declaracao declaracao";

	private static final String _SQL_SELECT_DECLARACAO_WHERE =
		"SELECT declaracao FROM Declaracao declaracao WHERE ";

	private static final String _SQL_COUNT_DECLARACAO =
		"SELECT COUNT(declaracao) FROM Declaracao declaracao";

	private static final String _SQL_COUNT_DECLARACAO_WHERE =
		"SELECT COUNT(declaracao) FROM Declaracao declaracao WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "declaracao.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Declaracao exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Declaracao exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DeclaracaoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}