/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDocumentoComprobatorioException;
import br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio;
import br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorioTable;
import br.com.seatecnologia.gdf.negocia.model.impl.DocumentoComprobatorioImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.DocumentoComprobatorioModelImpl;
import br.com.seatecnologia.gdf.negocia.service.persistence.DocumentoComprobatorioPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DocumentoComprobatorioUtil;
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
 * The persistence implementation for the documento comprobatorio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = DocumentoComprobatorioPersistence.class)
public class DocumentoComprobatorioPersistenceImpl
	extends BasePersistenceImpl<DocumentoComprobatorio>
	implements DocumentoComprobatorioPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DocumentoComprobatorioUtil</code> to access the documento comprobatorio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DocumentoComprobatorioImpl.class.getName();

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
	 * Returns all the documento comprobatorios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching documento comprobatorios
	 */
	@Override
	public List<DocumentoComprobatorio> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the documento comprobatorios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @return the range of matching documento comprobatorios
	 */
	@Override
	public List<DocumentoComprobatorio> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the documento comprobatorios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching documento comprobatorios
	 */
	@Override
	public List<DocumentoComprobatorio> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DocumentoComprobatorio> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the documento comprobatorios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching documento comprobatorios
	 */
	@Override
	public List<DocumentoComprobatorio> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DocumentoComprobatorio> orderByComparator,
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

		List<DocumentoComprobatorio> list = null;

		if (useFinderCache) {
			list = (List<DocumentoComprobatorio>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DocumentoComprobatorio documentoComprobatorio : list) {
					if (!uuid.equals(documentoComprobatorio.getUuid())) {
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

			sb.append(_SQL_SELECT_DOCUMENTOCOMPROBATORIO_WHERE);

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
				sb.append(DocumentoComprobatorioModelImpl.ORDER_BY_JPQL);
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

				list = (List<DocumentoComprobatorio>)QueryUtil.list(
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
	 * Returns the first documento comprobatorio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a matching documento comprobatorio could not be found
	 */
	@Override
	public DocumentoComprobatorio findByUuid_First(
			String uuid,
			OrderByComparator<DocumentoComprobatorio> orderByComparator)
		throws NoSuchDocumentoComprobatorioException {

		DocumentoComprobatorio documentoComprobatorio = fetchByUuid_First(
			uuid, orderByComparator);

		if (documentoComprobatorio != null) {
			return documentoComprobatorio;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDocumentoComprobatorioException(sb.toString());
	}

	/**
	 * Returns the first documento comprobatorio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching documento comprobatorio, or <code>null</code> if a matching documento comprobatorio could not be found
	 */
	@Override
	public DocumentoComprobatorio fetchByUuid_First(
		String uuid,
		OrderByComparator<DocumentoComprobatorio> orderByComparator) {

		List<DocumentoComprobatorio> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last documento comprobatorio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a matching documento comprobatorio could not be found
	 */
	@Override
	public DocumentoComprobatorio findByUuid_Last(
			String uuid,
			OrderByComparator<DocumentoComprobatorio> orderByComparator)
		throws NoSuchDocumentoComprobatorioException {

		DocumentoComprobatorio documentoComprobatorio = fetchByUuid_Last(
			uuid, orderByComparator);

		if (documentoComprobatorio != null) {
			return documentoComprobatorio;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDocumentoComprobatorioException(sb.toString());
	}

	/**
	 * Returns the last documento comprobatorio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching documento comprobatorio, or <code>null</code> if a matching documento comprobatorio could not be found
	 */
	@Override
	public DocumentoComprobatorio fetchByUuid_Last(
		String uuid,
		OrderByComparator<DocumentoComprobatorio> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<DocumentoComprobatorio> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the documento comprobatorios before and after the current documento comprobatorio in the ordered set where uuid = &#63;.
	 *
	 * @param documentoId the primary key of the current documento comprobatorio
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a documento comprobatorio with the primary key could not be found
	 */
	@Override
	public DocumentoComprobatorio[] findByUuid_PrevAndNext(
			long documentoId, String uuid,
			OrderByComparator<DocumentoComprobatorio> orderByComparator)
		throws NoSuchDocumentoComprobatorioException {

		uuid = Objects.toString(uuid, "");

		DocumentoComprobatorio documentoComprobatorio = findByPrimaryKey(
			documentoId);

		Session session = null;

		try {
			session = openSession();

			DocumentoComprobatorio[] array = new DocumentoComprobatorioImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, documentoComprobatorio, uuid, orderByComparator, true);

			array[1] = documentoComprobatorio;

			array[2] = getByUuid_PrevAndNext(
				session, documentoComprobatorio, uuid, orderByComparator,
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

	protected DocumentoComprobatorio getByUuid_PrevAndNext(
		Session session, DocumentoComprobatorio documentoComprobatorio,
		String uuid,
		OrderByComparator<DocumentoComprobatorio> orderByComparator,
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

		sb.append(_SQL_SELECT_DOCUMENTOCOMPROBATORIO_WHERE);

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
			sb.append(DocumentoComprobatorioModelImpl.ORDER_BY_JPQL);
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
						documentoComprobatorio)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DocumentoComprobatorio> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the documento comprobatorios where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (DocumentoComprobatorio documentoComprobatorio :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(documentoComprobatorio);
		}
	}

	/**
	 * Returns the number of documento comprobatorios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching documento comprobatorios
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DOCUMENTOCOMPROBATORIO_WHERE);

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
		"documentoComprobatorio.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(documentoComprobatorio.uuid IS NULL OR documentoComprobatorio.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByFundamentacaoId;
	private FinderPath _finderPathWithoutPaginationFindByFundamentacaoId;
	private FinderPath _finderPathCountByFundamentacaoId;

	/**
	 * Returns all the documento comprobatorios where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @return the matching documento comprobatorios
	 */
	@Override
	public List<DocumentoComprobatorio> findByFundamentacaoId(
		long fundamentacaoId) {

		return findByFundamentacaoId(
			fundamentacaoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the documento comprobatorios where fundamentacaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @return the range of matching documento comprobatorios
	 */
	@Override
	public List<DocumentoComprobatorio> findByFundamentacaoId(
		long fundamentacaoId, int start, int end) {

		return findByFundamentacaoId(fundamentacaoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the documento comprobatorios where fundamentacaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching documento comprobatorios
	 */
	@Override
	public List<DocumentoComprobatorio> findByFundamentacaoId(
		long fundamentacaoId, int start, int end,
		OrderByComparator<DocumentoComprobatorio> orderByComparator) {

		return findByFundamentacaoId(
			fundamentacaoId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the documento comprobatorios where fundamentacaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching documento comprobatorios
	 */
	@Override
	public List<DocumentoComprobatorio> findByFundamentacaoId(
		long fundamentacaoId, int start, int end,
		OrderByComparator<DocumentoComprobatorio> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByFundamentacaoId;
				finderArgs = new Object[] {fundamentacaoId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByFundamentacaoId;
			finderArgs = new Object[] {
				fundamentacaoId, start, end, orderByComparator
			};
		}

		List<DocumentoComprobatorio> list = null;

		if (useFinderCache) {
			list = (List<DocumentoComprobatorio>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DocumentoComprobatorio documentoComprobatorio : list) {
					if (fundamentacaoId !=
							documentoComprobatorio.getFundamentacaoId()) {

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

			sb.append(_SQL_SELECT_DOCUMENTOCOMPROBATORIO_WHERE);

			sb.append(_FINDER_COLUMN_FUNDAMENTACAOID_FUNDAMENTACAOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(DocumentoComprobatorioModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fundamentacaoId);

				list = (List<DocumentoComprobatorio>)QueryUtil.list(
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
	 * Returns the first documento comprobatorio in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a matching documento comprobatorio could not be found
	 */
	@Override
	public DocumentoComprobatorio findByFundamentacaoId_First(
			long fundamentacaoId,
			OrderByComparator<DocumentoComprobatorio> orderByComparator)
		throws NoSuchDocumentoComprobatorioException {

		DocumentoComprobatorio documentoComprobatorio =
			fetchByFundamentacaoId_First(fundamentacaoId, orderByComparator);

		if (documentoComprobatorio != null) {
			return documentoComprobatorio;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("fundamentacaoId=");
		sb.append(fundamentacaoId);

		sb.append("}");

		throw new NoSuchDocumentoComprobatorioException(sb.toString());
	}

	/**
	 * Returns the first documento comprobatorio in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching documento comprobatorio, or <code>null</code> if a matching documento comprobatorio could not be found
	 */
	@Override
	public DocumentoComprobatorio fetchByFundamentacaoId_First(
		long fundamentacaoId,
		OrderByComparator<DocumentoComprobatorio> orderByComparator) {

		List<DocumentoComprobatorio> list = findByFundamentacaoId(
			fundamentacaoId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last documento comprobatorio in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a matching documento comprobatorio could not be found
	 */
	@Override
	public DocumentoComprobatorio findByFundamentacaoId_Last(
			long fundamentacaoId,
			OrderByComparator<DocumentoComprobatorio> orderByComparator)
		throws NoSuchDocumentoComprobatorioException {

		DocumentoComprobatorio documentoComprobatorio =
			fetchByFundamentacaoId_Last(fundamentacaoId, orderByComparator);

		if (documentoComprobatorio != null) {
			return documentoComprobatorio;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("fundamentacaoId=");
		sb.append(fundamentacaoId);

		sb.append("}");

		throw new NoSuchDocumentoComprobatorioException(sb.toString());
	}

	/**
	 * Returns the last documento comprobatorio in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching documento comprobatorio, or <code>null</code> if a matching documento comprobatorio could not be found
	 */
	@Override
	public DocumentoComprobatorio fetchByFundamentacaoId_Last(
		long fundamentacaoId,
		OrderByComparator<DocumentoComprobatorio> orderByComparator) {

		int count = countByFundamentacaoId(fundamentacaoId);

		if (count == 0) {
			return null;
		}

		List<DocumentoComprobatorio> list = findByFundamentacaoId(
			fundamentacaoId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the documento comprobatorios before and after the current documento comprobatorio in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param documentoId the primary key of the current documento comprobatorio
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a documento comprobatorio with the primary key could not be found
	 */
	@Override
	public DocumentoComprobatorio[] findByFundamentacaoId_PrevAndNext(
			long documentoId, long fundamentacaoId,
			OrderByComparator<DocumentoComprobatorio> orderByComparator)
		throws NoSuchDocumentoComprobatorioException {

		DocumentoComprobatorio documentoComprobatorio = findByPrimaryKey(
			documentoId);

		Session session = null;

		try {
			session = openSession();

			DocumentoComprobatorio[] array = new DocumentoComprobatorioImpl[3];

			array[0] = getByFundamentacaoId_PrevAndNext(
				session, documentoComprobatorio, fundamentacaoId,
				orderByComparator, true);

			array[1] = documentoComprobatorio;

			array[2] = getByFundamentacaoId_PrevAndNext(
				session, documentoComprobatorio, fundamentacaoId,
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

	protected DocumentoComprobatorio getByFundamentacaoId_PrevAndNext(
		Session session, DocumentoComprobatorio documentoComprobatorio,
		long fundamentacaoId,
		OrderByComparator<DocumentoComprobatorio> orderByComparator,
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

		sb.append(_SQL_SELECT_DOCUMENTOCOMPROBATORIO_WHERE);

		sb.append(_FINDER_COLUMN_FUNDAMENTACAOID_FUNDAMENTACAOID_2);

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
			sb.append(DocumentoComprobatorioModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(fundamentacaoId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						documentoComprobatorio)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DocumentoComprobatorio> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the documento comprobatorios where fundamentacaoId = &#63; from the database.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 */
	@Override
	public void removeByFundamentacaoId(long fundamentacaoId) {
		for (DocumentoComprobatorio documentoComprobatorio :
				findByFundamentacaoId(
					fundamentacaoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(documentoComprobatorio);
		}
	}

	/**
	 * Returns the number of documento comprobatorios where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @return the number of matching documento comprobatorios
	 */
	@Override
	public int countByFundamentacaoId(long fundamentacaoId) {
		FinderPath finderPath = _finderPathCountByFundamentacaoId;

		Object[] finderArgs = new Object[] {fundamentacaoId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DOCUMENTOCOMPROBATORIO_WHERE);

			sb.append(_FINDER_COLUMN_FUNDAMENTACAOID_FUNDAMENTACAOID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fundamentacaoId);

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
		_FINDER_COLUMN_FUNDAMENTACAOID_FUNDAMENTACAOID_2 =
			"documentoComprobatorio.fundamentacaoId = ?";

	public DocumentoComprobatorioPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(DocumentoComprobatorio.class);

		setModelImplClass(DocumentoComprobatorioImpl.class);
		setModelPKClass(long.class);

		setTable(DocumentoComprobatorioTable.INSTANCE);
	}

	/**
	 * Caches the documento comprobatorio in the entity cache if it is enabled.
	 *
	 * @param documentoComprobatorio the documento comprobatorio
	 */
	@Override
	public void cacheResult(DocumentoComprobatorio documentoComprobatorio) {
		entityCache.putResult(
			DocumentoComprobatorioImpl.class,
			documentoComprobatorio.getPrimaryKey(), documentoComprobatorio);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the documento comprobatorios in the entity cache if it is enabled.
	 *
	 * @param documentoComprobatorios the documento comprobatorios
	 */
	@Override
	public void cacheResult(
		List<DocumentoComprobatorio> documentoComprobatorios) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (documentoComprobatorios.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (DocumentoComprobatorio documentoComprobatorio :
				documentoComprobatorios) {

			if (entityCache.getResult(
					DocumentoComprobatorioImpl.class,
					documentoComprobatorio.getPrimaryKey()) == null) {

				cacheResult(documentoComprobatorio);
			}
		}
	}

	/**
	 * Clears the cache for all documento comprobatorios.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DocumentoComprobatorioImpl.class);

		finderCache.clearCache(DocumentoComprobatorioImpl.class);
	}

	/**
	 * Clears the cache for the documento comprobatorio.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DocumentoComprobatorio documentoComprobatorio) {
		entityCache.removeResult(
			DocumentoComprobatorioImpl.class, documentoComprobatorio);
	}

	@Override
	public void clearCache(
		List<DocumentoComprobatorio> documentoComprobatorios) {

		for (DocumentoComprobatorio documentoComprobatorio :
				documentoComprobatorios) {

			entityCache.removeResult(
				DocumentoComprobatorioImpl.class, documentoComprobatorio);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DocumentoComprobatorioImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				DocumentoComprobatorioImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new documento comprobatorio with the primary key. Does not add the documento comprobatorio to the database.
	 *
	 * @param documentoId the primary key for the new documento comprobatorio
	 * @return the new documento comprobatorio
	 */
	@Override
	public DocumentoComprobatorio create(long documentoId) {
		DocumentoComprobatorio documentoComprobatorio =
			new DocumentoComprobatorioImpl();

		documentoComprobatorio.setNew(true);
		documentoComprobatorio.setPrimaryKey(documentoId);

		String uuid = PortalUUIDUtil.generate();

		documentoComprobatorio.setUuid(uuid);

		return documentoComprobatorio;
	}

	/**
	 * Removes the documento comprobatorio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param documentoId the primary key of the documento comprobatorio
	 * @return the documento comprobatorio that was removed
	 * @throws NoSuchDocumentoComprobatorioException if a documento comprobatorio with the primary key could not be found
	 */
	@Override
	public DocumentoComprobatorio remove(long documentoId)
		throws NoSuchDocumentoComprobatorioException {

		return remove((Serializable)documentoId);
	}

	/**
	 * Removes the documento comprobatorio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the documento comprobatorio
	 * @return the documento comprobatorio that was removed
	 * @throws NoSuchDocumentoComprobatorioException if a documento comprobatorio with the primary key could not be found
	 */
	@Override
	public DocumentoComprobatorio remove(Serializable primaryKey)
		throws NoSuchDocumentoComprobatorioException {

		Session session = null;

		try {
			session = openSession();

			DocumentoComprobatorio documentoComprobatorio =
				(DocumentoComprobatorio)session.get(
					DocumentoComprobatorioImpl.class, primaryKey);

			if (documentoComprobatorio == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDocumentoComprobatorioException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(documentoComprobatorio);
		}
		catch (NoSuchDocumentoComprobatorioException noSuchEntityException) {
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
	protected DocumentoComprobatorio removeImpl(
		DocumentoComprobatorio documentoComprobatorio) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(documentoComprobatorio)) {
				documentoComprobatorio = (DocumentoComprobatorio)session.get(
					DocumentoComprobatorioImpl.class,
					documentoComprobatorio.getPrimaryKeyObj());
			}

			if (documentoComprobatorio != null) {
				session.delete(documentoComprobatorio);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (documentoComprobatorio != null) {
			clearCache(documentoComprobatorio);
		}

		return documentoComprobatorio;
	}

	@Override
	public DocumentoComprobatorio updateImpl(
		DocumentoComprobatorio documentoComprobatorio) {

		boolean isNew = documentoComprobatorio.isNew();

		if (!(documentoComprobatorio instanceof
				DocumentoComprobatorioModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(documentoComprobatorio.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					documentoComprobatorio);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in documentoComprobatorio proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DocumentoComprobatorio implementation " +
					documentoComprobatorio.getClass());
		}

		DocumentoComprobatorioModelImpl documentoComprobatorioModelImpl =
			(DocumentoComprobatorioModelImpl)documentoComprobatorio;

		if (Validator.isNull(documentoComprobatorio.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			documentoComprobatorio.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(documentoComprobatorio);
			}
			else {
				documentoComprobatorio = (DocumentoComprobatorio)session.merge(
					documentoComprobatorio);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DocumentoComprobatorioImpl.class, documentoComprobatorioModelImpl,
			false, true);

		if (isNew) {
			documentoComprobatorio.setNew(false);
		}

		documentoComprobatorio.resetOriginalValues();

		return documentoComprobatorio;
	}

	/**
	 * Returns the documento comprobatorio with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the documento comprobatorio
	 * @return the documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a documento comprobatorio with the primary key could not be found
	 */
	@Override
	public DocumentoComprobatorio findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDocumentoComprobatorioException {

		DocumentoComprobatorio documentoComprobatorio = fetchByPrimaryKey(
			primaryKey);

		if (documentoComprobatorio == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDocumentoComprobatorioException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return documentoComprobatorio;
	}

	/**
	 * Returns the documento comprobatorio with the primary key or throws a <code>NoSuchDocumentoComprobatorioException</code> if it could not be found.
	 *
	 * @param documentoId the primary key of the documento comprobatorio
	 * @return the documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a documento comprobatorio with the primary key could not be found
	 */
	@Override
	public DocumentoComprobatorio findByPrimaryKey(long documentoId)
		throws NoSuchDocumentoComprobatorioException {

		return findByPrimaryKey((Serializable)documentoId);
	}

	/**
	 * Returns the documento comprobatorio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param documentoId the primary key of the documento comprobatorio
	 * @return the documento comprobatorio, or <code>null</code> if a documento comprobatorio with the primary key could not be found
	 */
	@Override
	public DocumentoComprobatorio fetchByPrimaryKey(long documentoId) {
		return fetchByPrimaryKey((Serializable)documentoId);
	}

	/**
	 * Returns all the documento comprobatorios.
	 *
	 * @return the documento comprobatorios
	 */
	@Override
	public List<DocumentoComprobatorio> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the documento comprobatorios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @return the range of documento comprobatorios
	 */
	@Override
	public List<DocumentoComprobatorio> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the documento comprobatorios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of documento comprobatorios
	 */
	@Override
	public List<DocumentoComprobatorio> findAll(
		int start, int end,
		OrderByComparator<DocumentoComprobatorio> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the documento comprobatorios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of documento comprobatorios
	 */
	@Override
	public List<DocumentoComprobatorio> findAll(
		int start, int end,
		OrderByComparator<DocumentoComprobatorio> orderByComparator,
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

		List<DocumentoComprobatorio> list = null;

		if (useFinderCache) {
			list = (List<DocumentoComprobatorio>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DOCUMENTOCOMPROBATORIO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DOCUMENTOCOMPROBATORIO;

				sql = sql.concat(DocumentoComprobatorioModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DocumentoComprobatorio>)QueryUtil.list(
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
	 * Removes all the documento comprobatorios from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DocumentoComprobatorio documentoComprobatorio : findAll()) {
			remove(documentoComprobatorio);
		}
	}

	/**
	 * Returns the number of documento comprobatorios.
	 *
	 * @return the number of documento comprobatorios
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
					_SQL_COUNT_DOCUMENTOCOMPROBATORIO);

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
		return "documentoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DOCUMENTOCOMPROBATORIO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DocumentoComprobatorioModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the documento comprobatorio persistence.
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

		_finderPathWithPaginationFindByFundamentacaoId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFundamentacaoId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"fundamentacaoId"}, true);

		_finderPathWithoutPaginationFindByFundamentacaoId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFundamentacaoId",
			new String[] {Long.class.getName()},
			new String[] {"fundamentacaoId"}, true);

		_finderPathCountByFundamentacaoId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFundamentacaoId",
			new String[] {Long.class.getName()},
			new String[] {"fundamentacaoId"}, false);

		DocumentoComprobatorioUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		DocumentoComprobatorioUtil.setPersistence(null);

		entityCache.removeCache(DocumentoComprobatorioImpl.class.getName());
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

	private static final String _SQL_SELECT_DOCUMENTOCOMPROBATORIO =
		"SELECT documentoComprobatorio FROM DocumentoComprobatorio documentoComprobatorio";

	private static final String _SQL_SELECT_DOCUMENTOCOMPROBATORIO_WHERE =
		"SELECT documentoComprobatorio FROM DocumentoComprobatorio documentoComprobatorio WHERE ";

	private static final String _SQL_COUNT_DOCUMENTOCOMPROBATORIO =
		"SELECT COUNT(documentoComprobatorio) FROM DocumentoComprobatorio documentoComprobatorio";

	private static final String _SQL_COUNT_DOCUMENTOCOMPROBATORIO_WHERE =
		"SELECT COUNT(documentoComprobatorio) FROM DocumentoComprobatorio documentoComprobatorio WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"documentoComprobatorio.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DocumentoComprobatorio exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DocumentoComprobatorio exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DocumentoComprobatorioPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}