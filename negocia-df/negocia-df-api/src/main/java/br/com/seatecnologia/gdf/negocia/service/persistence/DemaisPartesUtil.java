/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.DemaisPartes;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the demais partes service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.DemaisPartesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DemaisPartesPersistence
 * @generated
 */
public class DemaisPartesUtil {

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
	public static void clearCache(DemaisPartes demaisPartes) {
		getPersistence().clearCache(demaisPartes);
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
	public static Map<Serializable, DemaisPartes> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DemaisPartes> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DemaisPartes> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DemaisPartes> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DemaisPartes> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DemaisPartes update(DemaisPartes demaisPartes) {
		return getPersistence().update(demaisPartes);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DemaisPartes update(
		DemaisPartes demaisPartes, ServiceContext serviceContext) {

		return getPersistence().update(demaisPartes, serviceContext);
	}

	/**
	 * Returns all the demais parteses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching demais parteses
	 */
	public static List<DemaisPartes> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the demais parteses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @return the range of matching demais parteses
	 */
	public static List<DemaisPartes> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the demais parteses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demais parteses
	 */
	public static List<DemaisPartes> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DemaisPartes> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the demais parteses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demais parteses
	 */
	public static List<DemaisPartes> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DemaisPartes> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first demais partes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demais partes
	 * @throws NoSuchDemaisPartesException if a matching demais partes could not be found
	 */
	public static DemaisPartes findByUuid_First(
			String uuid, OrderByComparator<DemaisPartes> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemaisPartesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first demais partes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demais partes, or <code>null</code> if a matching demais partes could not be found
	 */
	public static DemaisPartes fetchByUuid_First(
		String uuid, OrderByComparator<DemaisPartes> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last demais partes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demais partes
	 * @throws NoSuchDemaisPartesException if a matching demais partes could not be found
	 */
	public static DemaisPartes findByUuid_Last(
			String uuid, OrderByComparator<DemaisPartes> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemaisPartesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last demais partes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demais partes, or <code>null</code> if a matching demais partes could not be found
	 */
	public static DemaisPartes fetchByUuid_Last(
		String uuid, OrderByComparator<DemaisPartes> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the demais parteses before and after the current demais partes in the ordered set where uuid = &#63;.
	 *
	 * @param demaisPartesId the primary key of the current demais partes
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demais partes
	 * @throws NoSuchDemaisPartesException if a demais partes with the primary key could not be found
	 */
	public static DemaisPartes[] findByUuid_PrevAndNext(
			long demaisPartesId, String uuid,
			OrderByComparator<DemaisPartes> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemaisPartesException {

		return getPersistence().findByUuid_PrevAndNext(
			demaisPartesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the demais parteses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of demais parteses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching demais parteses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the demais parteses where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching demais parteses
	 */
	public static List<DemaisPartes> findByPropostaId(long propostaId) {
		return getPersistence().findByPropostaId(propostaId);
	}

	/**
	 * Returns a range of all the demais parteses where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @return the range of matching demais parteses
	 */
	public static List<DemaisPartes> findByPropostaId(
		long propostaId, int start, int end) {

		return getPersistence().findByPropostaId(propostaId, start, end);
	}

	/**
	 * Returns an ordered range of all the demais parteses where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demais parteses
	 */
	public static List<DemaisPartes> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<DemaisPartes> orderByComparator) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the demais parteses where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demais parteses
	 */
	public static List<DemaisPartes> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<DemaisPartes> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first demais partes in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demais partes
	 * @throws NoSuchDemaisPartesException if a matching demais partes could not be found
	 */
	public static DemaisPartes findByPropostaId_First(
			long propostaId, OrderByComparator<DemaisPartes> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemaisPartesException {

		return getPersistence().findByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the first demais partes in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demais partes, or <code>null</code> if a matching demais partes could not be found
	 */
	public static DemaisPartes fetchByPropostaId_First(
		long propostaId, OrderByComparator<DemaisPartes> orderByComparator) {

		return getPersistence().fetchByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last demais partes in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demais partes
	 * @throws NoSuchDemaisPartesException if a matching demais partes could not be found
	 */
	public static DemaisPartes findByPropostaId_Last(
			long propostaId, OrderByComparator<DemaisPartes> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemaisPartesException {

		return getPersistence().findByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last demais partes in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demais partes, or <code>null</code> if a matching demais partes could not be found
	 */
	public static DemaisPartes fetchByPropostaId_Last(
		long propostaId, OrderByComparator<DemaisPartes> orderByComparator) {

		return getPersistence().fetchByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the demais parteses before and after the current demais partes in the ordered set where propostaId = &#63;.
	 *
	 * @param demaisPartesId the primary key of the current demais partes
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demais partes
	 * @throws NoSuchDemaisPartesException if a demais partes with the primary key could not be found
	 */
	public static DemaisPartes[] findByPropostaId_PrevAndNext(
			long demaisPartesId, long propostaId,
			OrderByComparator<DemaisPartes> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemaisPartesException {

		return getPersistence().findByPropostaId_PrevAndNext(
			demaisPartesId, propostaId, orderByComparator);
	}

	/**
	 * Removes all the demais parteses where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public static void removeByPropostaId(long propostaId) {
		getPersistence().removeByPropostaId(propostaId);
	}

	/**
	 * Returns the number of demais parteses where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching demais parteses
	 */
	public static int countByPropostaId(long propostaId) {
		return getPersistence().countByPropostaId(propostaId);
	}

	/**
	 * Caches the demais partes in the entity cache if it is enabled.
	 *
	 * @param demaisPartes the demais partes
	 */
	public static void cacheResult(DemaisPartes demaisPartes) {
		getPersistence().cacheResult(demaisPartes);
	}

	/**
	 * Caches the demais parteses in the entity cache if it is enabled.
	 *
	 * @param demaisParteses the demais parteses
	 */
	public static void cacheResult(List<DemaisPartes> demaisParteses) {
		getPersistence().cacheResult(demaisParteses);
	}

	/**
	 * Creates a new demais partes with the primary key. Does not add the demais partes to the database.
	 *
	 * @param demaisPartesId the primary key for the new demais partes
	 * @return the new demais partes
	 */
	public static DemaisPartes create(long demaisPartesId) {
		return getPersistence().create(demaisPartesId);
	}

	/**
	 * Removes the demais partes with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param demaisPartesId the primary key of the demais partes
	 * @return the demais partes that was removed
	 * @throws NoSuchDemaisPartesException if a demais partes with the primary key could not be found
	 */
	public static DemaisPartes remove(long demaisPartesId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemaisPartesException {

		return getPersistence().remove(demaisPartesId);
	}

	public static DemaisPartes updateImpl(DemaisPartes demaisPartes) {
		return getPersistence().updateImpl(demaisPartes);
	}

	/**
	 * Returns the demais partes with the primary key or throws a <code>NoSuchDemaisPartesException</code> if it could not be found.
	 *
	 * @param demaisPartesId the primary key of the demais partes
	 * @return the demais partes
	 * @throws NoSuchDemaisPartesException if a demais partes with the primary key could not be found
	 */
	public static DemaisPartes findByPrimaryKey(long demaisPartesId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemaisPartesException {

		return getPersistence().findByPrimaryKey(demaisPartesId);
	}

	/**
	 * Returns the demais partes with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param demaisPartesId the primary key of the demais partes
	 * @return the demais partes, or <code>null</code> if a demais partes with the primary key could not be found
	 */
	public static DemaisPartes fetchByPrimaryKey(long demaisPartesId) {
		return getPersistence().fetchByPrimaryKey(demaisPartesId);
	}

	/**
	 * Returns all the demais parteses.
	 *
	 * @return the demais parteses
	 */
	public static List<DemaisPartes> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the demais parteses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @return the range of demais parteses
	 */
	public static List<DemaisPartes> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the demais parteses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of demais parteses
	 */
	public static List<DemaisPartes> findAll(
		int start, int end, OrderByComparator<DemaisPartes> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the demais parteses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of demais parteses
	 */
	public static List<DemaisPartes> findAll(
		int start, int end, OrderByComparator<DemaisPartes> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the demais parteses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of demais parteses.
	 *
	 * @return the number of demais parteses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DemaisPartesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(DemaisPartesPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile DemaisPartesPersistence _persistence;

}