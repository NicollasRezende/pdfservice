/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the demonstracao documentos service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.DemonstracaoDocumentosPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DemonstracaoDocumentosPersistence
 * @generated
 */
public class DemonstracaoDocumentosUtil {

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
		DemonstracaoDocumentos demonstracaoDocumentos) {

		getPersistence().clearCache(demonstracaoDocumentos);
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
	public static Map<Serializable, DemonstracaoDocumentos> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DemonstracaoDocumentos> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DemonstracaoDocumentos> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DemonstracaoDocumentos> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DemonstracaoDocumentos update(
		DemonstracaoDocumentos demonstracaoDocumentos) {

		return getPersistence().update(demonstracaoDocumentos);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DemonstracaoDocumentos update(
		DemonstracaoDocumentos demonstracaoDocumentos,
		ServiceContext serviceContext) {

		return getPersistence().update(demonstracaoDocumentos, serviceContext);
	}

	/**
	 * Returns all the demonstracao documentoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching demonstracao documentoses
	 */
	public static List<DemonstracaoDocumentos> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
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
	public static List<DemonstracaoDocumentos> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
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
	public static List<DemonstracaoDocumentos> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
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
	public static List<DemonstracaoDocumentos> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first demonstracao documentos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a matching demonstracao documentos could not be found
	 */
	public static DemonstracaoDocumentos findByUuid_First(
			String uuid,
			OrderByComparator<DemonstracaoDocumentos> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemonstracaoDocumentosException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first demonstracao documentos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao documentos, or <code>null</code> if a matching demonstracao documentos could not be found
	 */
	public static DemonstracaoDocumentos fetchByUuid_First(
		String uuid,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last demonstracao documentos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a matching demonstracao documentos could not be found
	 */
	public static DemonstracaoDocumentos findByUuid_Last(
			String uuid,
			OrderByComparator<DemonstracaoDocumentos> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemonstracaoDocumentosException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last demonstracao documentos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao documentos, or <code>null</code> if a matching demonstracao documentos could not be found
	 */
	public static DemonstracaoDocumentos fetchByUuid_Last(
		String uuid,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
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
	public static DemonstracaoDocumentos[] findByUuid_PrevAndNext(
			long demonstracaoDocumentosId, String uuid,
			OrderByComparator<DemonstracaoDocumentos> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemonstracaoDocumentosException {

		return getPersistence().findByUuid_PrevAndNext(
			demonstracaoDocumentosId, uuid, orderByComparator);
	}

	/**
	 * Removes all the demonstracao documentoses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of demonstracao documentoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching demonstracao documentoses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the demonstracao documentoses where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @return the matching demonstracao documentoses
	 */
	public static List<DemonstracaoDocumentos> findByDemonstracaoId(
		long demonstracaoId) {

		return getPersistence().findByDemonstracaoId(demonstracaoId);
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
	public static List<DemonstracaoDocumentos> findByDemonstracaoId(
		long demonstracaoId, int start, int end) {

		return getPersistence().findByDemonstracaoId(
			demonstracaoId, start, end);
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
	public static List<DemonstracaoDocumentos> findByDemonstracaoId(
		long demonstracaoId, int start, int end,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator) {

		return getPersistence().findByDemonstracaoId(
			demonstracaoId, start, end, orderByComparator);
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
	public static List<DemonstracaoDocumentos> findByDemonstracaoId(
		long demonstracaoId, int start, int end,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByDemonstracaoId(
			demonstracaoId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first demonstracao documentos in the ordered set where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a matching demonstracao documentos could not be found
	 */
	public static DemonstracaoDocumentos findByDemonstracaoId_First(
			long demonstracaoId,
			OrderByComparator<DemonstracaoDocumentos> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemonstracaoDocumentosException {

		return getPersistence().findByDemonstracaoId_First(
			demonstracaoId, orderByComparator);
	}

	/**
	 * Returns the first demonstracao documentos in the ordered set where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao documentos, or <code>null</code> if a matching demonstracao documentos could not be found
	 */
	public static DemonstracaoDocumentos fetchByDemonstracaoId_First(
		long demonstracaoId,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator) {

		return getPersistence().fetchByDemonstracaoId_First(
			demonstracaoId, orderByComparator);
	}

	/**
	 * Returns the last demonstracao documentos in the ordered set where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a matching demonstracao documentos could not be found
	 */
	public static DemonstracaoDocumentos findByDemonstracaoId_Last(
			long demonstracaoId,
			OrderByComparator<DemonstracaoDocumentos> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemonstracaoDocumentosException {

		return getPersistence().findByDemonstracaoId_Last(
			demonstracaoId, orderByComparator);
	}

	/**
	 * Returns the last demonstracao documentos in the ordered set where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao documentos, or <code>null</code> if a matching demonstracao documentos could not be found
	 */
	public static DemonstracaoDocumentos fetchByDemonstracaoId_Last(
		long demonstracaoId,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator) {

		return getPersistence().fetchByDemonstracaoId_Last(
			demonstracaoId, orderByComparator);
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
	public static DemonstracaoDocumentos[] findByDemonstracaoId_PrevAndNext(
			long demonstracaoDocumentosId, long demonstracaoId,
			OrderByComparator<DemonstracaoDocumentos> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemonstracaoDocumentosException {

		return getPersistence().findByDemonstracaoId_PrevAndNext(
			demonstracaoDocumentosId, demonstracaoId, orderByComparator);
	}

	/**
	 * Removes all the demonstracao documentoses where demonstracaoId = &#63; from the database.
	 *
	 * @param demonstracaoId the demonstracao ID
	 */
	public static void removeByDemonstracaoId(long demonstracaoId) {
		getPersistence().removeByDemonstracaoId(demonstracaoId);
	}

	/**
	 * Returns the number of demonstracao documentoses where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @return the number of matching demonstracao documentoses
	 */
	public static int countByDemonstracaoId(long demonstracaoId) {
		return getPersistence().countByDemonstracaoId(demonstracaoId);
	}

	/**
	 * Caches the demonstracao documentos in the entity cache if it is enabled.
	 *
	 * @param demonstracaoDocumentos the demonstracao documentos
	 */
	public static void cacheResult(
		DemonstracaoDocumentos demonstracaoDocumentos) {

		getPersistence().cacheResult(demonstracaoDocumentos);
	}

	/**
	 * Caches the demonstracao documentoses in the entity cache if it is enabled.
	 *
	 * @param demonstracaoDocumentoses the demonstracao documentoses
	 */
	public static void cacheResult(
		List<DemonstracaoDocumentos> demonstracaoDocumentoses) {

		getPersistence().cacheResult(demonstracaoDocumentoses);
	}

	/**
	 * Creates a new demonstracao documentos with the primary key. Does not add the demonstracao documentos to the database.
	 *
	 * @param demonstracaoDocumentosId the primary key for the new demonstracao documentos
	 * @return the new demonstracao documentos
	 */
	public static DemonstracaoDocumentos create(long demonstracaoDocumentosId) {
		return getPersistence().create(demonstracaoDocumentosId);
	}

	/**
	 * Removes the demonstracao documentos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param demonstracaoDocumentosId the primary key of the demonstracao documentos
	 * @return the demonstracao documentos that was removed
	 * @throws NoSuchDemonstracaoDocumentosException if a demonstracao documentos with the primary key could not be found
	 */
	public static DemonstracaoDocumentos remove(long demonstracaoDocumentosId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemonstracaoDocumentosException {

		return getPersistence().remove(demonstracaoDocumentosId);
	}

	public static DemonstracaoDocumentos updateImpl(
		DemonstracaoDocumentos demonstracaoDocumentos) {

		return getPersistence().updateImpl(demonstracaoDocumentos);
	}

	/**
	 * Returns the demonstracao documentos with the primary key or throws a <code>NoSuchDemonstracaoDocumentosException</code> if it could not be found.
	 *
	 * @param demonstracaoDocumentosId the primary key of the demonstracao documentos
	 * @return the demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a demonstracao documentos with the primary key could not be found
	 */
	public static DemonstracaoDocumentos findByPrimaryKey(
			long demonstracaoDocumentosId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemonstracaoDocumentosException {

		return getPersistence().findByPrimaryKey(demonstracaoDocumentosId);
	}

	/**
	 * Returns the demonstracao documentos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param demonstracaoDocumentosId the primary key of the demonstracao documentos
	 * @return the demonstracao documentos, or <code>null</code> if a demonstracao documentos with the primary key could not be found
	 */
	public static DemonstracaoDocumentos fetchByPrimaryKey(
		long demonstracaoDocumentosId) {

		return getPersistence().fetchByPrimaryKey(demonstracaoDocumentosId);
	}

	/**
	 * Returns all the demonstracao documentoses.
	 *
	 * @return the demonstracao documentoses
	 */
	public static List<DemonstracaoDocumentos> findAll() {
		return getPersistence().findAll();
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
	public static List<DemonstracaoDocumentos> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<DemonstracaoDocumentos> findAll(
		int start, int end,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<DemonstracaoDocumentos> findAll(
		int start, int end,
		OrderByComparator<DemonstracaoDocumentos> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the demonstracao documentoses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of demonstracao documentoses.
	 *
	 * @return the number of demonstracao documentoses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DemonstracaoDocumentosPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		DemonstracaoDocumentosPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile DemonstracaoDocumentosPersistence _persistence;

}