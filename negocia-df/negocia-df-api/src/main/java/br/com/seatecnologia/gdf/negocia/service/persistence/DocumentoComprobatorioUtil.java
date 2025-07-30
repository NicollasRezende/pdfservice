/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the documento comprobatorio service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.DocumentoComprobatorioPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DocumentoComprobatorioPersistence
 * @generated
 */
public class DocumentoComprobatorioUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		DocumentoComprobatorio documentoComprobatorio) {

		getPersistence().clearCache(documentoComprobatorio);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, DocumentoComprobatorio> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DocumentoComprobatorio> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DocumentoComprobatorio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DocumentoComprobatorio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DocumentoComprobatorio> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DocumentoComprobatorio update(
		DocumentoComprobatorio documentoComprobatorio) {

		return getPersistence().update(documentoComprobatorio);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DocumentoComprobatorio update(
		DocumentoComprobatorio documentoComprobatorio,
		ServiceContext serviceContext) {

		return getPersistence().update(documentoComprobatorio, serviceContext);
	}

	/**
	 * Returns all the documento comprobatorios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching documento comprobatorios
	 */
	public static List<DocumentoComprobatorio> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
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
	public static List<DocumentoComprobatorio> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
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
	public static List<DocumentoComprobatorio> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DocumentoComprobatorio> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
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
	public static List<DocumentoComprobatorio> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DocumentoComprobatorio> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first documento comprobatorio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a matching documento comprobatorio could not be found
	 */
	public static DocumentoComprobatorio findByUuid_First(
			String uuid,
			OrderByComparator<DocumentoComprobatorio> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDocumentoComprobatorioException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first documento comprobatorio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching documento comprobatorio, or <code>null</code> if a matching documento comprobatorio could not be found
	 */
	public static DocumentoComprobatorio fetchByUuid_First(
		String uuid,
		OrderByComparator<DocumentoComprobatorio> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last documento comprobatorio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a matching documento comprobatorio could not be found
	 */
	public static DocumentoComprobatorio findByUuid_Last(
			String uuid,
			OrderByComparator<DocumentoComprobatorio> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDocumentoComprobatorioException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last documento comprobatorio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching documento comprobatorio, or <code>null</code> if a matching documento comprobatorio could not be found
	 */
	public static DocumentoComprobatorio fetchByUuid_Last(
		String uuid,
		OrderByComparator<DocumentoComprobatorio> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
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
	public static DocumentoComprobatorio[] findByUuid_PrevAndNext(
			long documentoId, String uuid,
			OrderByComparator<DocumentoComprobatorio> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDocumentoComprobatorioException {

		return getPersistence().findByUuid_PrevAndNext(
			documentoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the documento comprobatorios where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of documento comprobatorios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching documento comprobatorios
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the documento comprobatorios where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @return the matching documento comprobatorios
	 */
	public static List<DocumentoComprobatorio> findByFundamentacaoId(
		long fundamentacaoId) {

		return getPersistence().findByFundamentacaoId(fundamentacaoId);
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
	public static List<DocumentoComprobatorio> findByFundamentacaoId(
		long fundamentacaoId, int start, int end) {

		return getPersistence().findByFundamentacaoId(
			fundamentacaoId, start, end);
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
	public static List<DocumentoComprobatorio> findByFundamentacaoId(
		long fundamentacaoId, int start, int end,
		OrderByComparator<DocumentoComprobatorio> orderByComparator) {

		return getPersistence().findByFundamentacaoId(
			fundamentacaoId, start, end, orderByComparator);
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
	public static List<DocumentoComprobatorio> findByFundamentacaoId(
		long fundamentacaoId, int start, int end,
		OrderByComparator<DocumentoComprobatorio> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByFundamentacaoId(
			fundamentacaoId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first documento comprobatorio in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a matching documento comprobatorio could not be found
	 */
	public static DocumentoComprobatorio findByFundamentacaoId_First(
			long fundamentacaoId,
			OrderByComparator<DocumentoComprobatorio> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDocumentoComprobatorioException {

		return getPersistence().findByFundamentacaoId_First(
			fundamentacaoId, orderByComparator);
	}

	/**
	 * Returns the first documento comprobatorio in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching documento comprobatorio, or <code>null</code> if a matching documento comprobatorio could not be found
	 */
	public static DocumentoComprobatorio fetchByFundamentacaoId_First(
		long fundamentacaoId,
		OrderByComparator<DocumentoComprobatorio> orderByComparator) {

		return getPersistence().fetchByFundamentacaoId_First(
			fundamentacaoId, orderByComparator);
	}

	/**
	 * Returns the last documento comprobatorio in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a matching documento comprobatorio could not be found
	 */
	public static DocumentoComprobatorio findByFundamentacaoId_Last(
			long fundamentacaoId,
			OrderByComparator<DocumentoComprobatorio> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDocumentoComprobatorioException {

		return getPersistence().findByFundamentacaoId_Last(
			fundamentacaoId, orderByComparator);
	}

	/**
	 * Returns the last documento comprobatorio in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching documento comprobatorio, or <code>null</code> if a matching documento comprobatorio could not be found
	 */
	public static DocumentoComprobatorio fetchByFundamentacaoId_Last(
		long fundamentacaoId,
		OrderByComparator<DocumentoComprobatorio> orderByComparator) {

		return getPersistence().fetchByFundamentacaoId_Last(
			fundamentacaoId, orderByComparator);
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
	public static DocumentoComprobatorio[] findByFundamentacaoId_PrevAndNext(
			long documentoId, long fundamentacaoId,
			OrderByComparator<DocumentoComprobatorio> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDocumentoComprobatorioException {

		return getPersistence().findByFundamentacaoId_PrevAndNext(
			documentoId, fundamentacaoId, orderByComparator);
	}

	/**
	 * Removes all the documento comprobatorios where fundamentacaoId = &#63; from the database.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 */
	public static void removeByFundamentacaoId(long fundamentacaoId) {
		getPersistence().removeByFundamentacaoId(fundamentacaoId);
	}

	/**
	 * Returns the number of documento comprobatorios where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @return the number of matching documento comprobatorios
	 */
	public static int countByFundamentacaoId(long fundamentacaoId) {
		return getPersistence().countByFundamentacaoId(fundamentacaoId);
	}

	/**
	 * Caches the documento comprobatorio in the entity cache if it is enabled.
	 *
	 * @param documentoComprobatorio the documento comprobatorio
	 */
	public static void cacheResult(
		DocumentoComprobatorio documentoComprobatorio) {

		getPersistence().cacheResult(documentoComprobatorio);
	}

	/**
	 * Caches the documento comprobatorios in the entity cache if it is enabled.
	 *
	 * @param documentoComprobatorios the documento comprobatorios
	 */
	public static void cacheResult(
		List<DocumentoComprobatorio> documentoComprobatorios) {

		getPersistence().cacheResult(documentoComprobatorios);
	}

	/**
	 * Creates a new documento comprobatorio with the primary key. Does not add the documento comprobatorio to the database.
	 *
	 * @param documentoId the primary key for the new documento comprobatorio
	 * @return the new documento comprobatorio
	 */
	public static DocumentoComprobatorio create(long documentoId) {
		return getPersistence().create(documentoId);
	}

	/**
	 * Removes the documento comprobatorio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param documentoId the primary key of the documento comprobatorio
	 * @return the documento comprobatorio that was removed
	 * @throws NoSuchDocumentoComprobatorioException if a documento comprobatorio with the primary key could not be found
	 */
	public static DocumentoComprobatorio remove(long documentoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDocumentoComprobatorioException {

		return getPersistence().remove(documentoId);
	}

	public static DocumentoComprobatorio updateImpl(
		DocumentoComprobatorio documentoComprobatorio) {

		return getPersistence().updateImpl(documentoComprobatorio);
	}

	/**
	 * Returns the documento comprobatorio with the primary key or throws a <code>NoSuchDocumentoComprobatorioException</code> if it could not be found.
	 *
	 * @param documentoId the primary key of the documento comprobatorio
	 * @return the documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a documento comprobatorio with the primary key could not be found
	 */
	public static DocumentoComprobatorio findByPrimaryKey(long documentoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDocumentoComprobatorioException {

		return getPersistence().findByPrimaryKey(documentoId);
	}

	/**
	 * Returns the documento comprobatorio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param documentoId the primary key of the documento comprobatorio
	 * @return the documento comprobatorio, or <code>null</code> if a documento comprobatorio with the primary key could not be found
	 */
	public static DocumentoComprobatorio fetchByPrimaryKey(long documentoId) {
		return getPersistence().fetchByPrimaryKey(documentoId);
	}

	/**
	 * Returns all the documento comprobatorios.
	 *
	 * @return the documento comprobatorios
	 */
	public static List<DocumentoComprobatorio> findAll() {
		return getPersistence().findAll();
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
	public static List<DocumentoComprobatorio> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<DocumentoComprobatorio> findAll(
		int start, int end,
		OrderByComparator<DocumentoComprobatorio> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<DocumentoComprobatorio> findAll(
		int start, int end,
		OrderByComparator<DocumentoComprobatorio> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the documento comprobatorios from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of documento comprobatorios.
	 *
	 * @return the number of documento comprobatorios
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DocumentoComprobatorioPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		DocumentoComprobatorioPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile DocumentoComprobatorioPersistence _persistence;

}