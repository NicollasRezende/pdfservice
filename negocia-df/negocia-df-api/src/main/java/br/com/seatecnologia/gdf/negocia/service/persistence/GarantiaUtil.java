/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.Garantia;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the garantia service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.GarantiaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GarantiaPersistence
 * @generated
 */
public class GarantiaUtil {

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
	public static void clearCache(Garantia garantia) {
		getPersistence().clearCache(garantia);
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
	public static Map<Serializable, Garantia> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Garantia> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Garantia> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Garantia> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Garantia> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Garantia update(Garantia garantia) {
		return getPersistence().update(garantia);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Garantia update(
		Garantia garantia, ServiceContext serviceContext) {

		return getPersistence().update(garantia, serviceContext);
	}

	/**
	 * Returns all the garantias where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching garantias
	 */
	public static List<Garantia> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the garantias where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @return the range of matching garantias
	 */
	public static List<Garantia> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the garantias where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching garantias
	 */
	public static List<Garantia> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Garantia> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the garantias where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching garantias
	 */
	public static List<Garantia> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Garantia> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first garantia in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching garantia
	 * @throws NoSuchGarantiaException if a matching garantia could not be found
	 */
	public static Garantia findByUuid_First(
			String uuid, OrderByComparator<Garantia> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchGarantiaException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first garantia in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching garantia, or <code>null</code> if a matching garantia could not be found
	 */
	public static Garantia fetchByUuid_First(
		String uuid, OrderByComparator<Garantia> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last garantia in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching garantia
	 * @throws NoSuchGarantiaException if a matching garantia could not be found
	 */
	public static Garantia findByUuid_Last(
			String uuid, OrderByComparator<Garantia> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchGarantiaException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last garantia in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching garantia, or <code>null</code> if a matching garantia could not be found
	 */
	public static Garantia fetchByUuid_Last(
		String uuid, OrderByComparator<Garantia> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the garantias before and after the current garantia in the ordered set where uuid = &#63;.
	 *
	 * @param garantiaId the primary key of the current garantia
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next garantia
	 * @throws NoSuchGarantiaException if a garantia with the primary key could not be found
	 */
	public static Garantia[] findByUuid_PrevAndNext(
			long garantiaId, String uuid,
			OrderByComparator<Garantia> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchGarantiaException {

		return getPersistence().findByUuid_PrevAndNext(
			garantiaId, uuid, orderByComparator);
	}

	/**
	 * Removes all the garantias where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of garantias where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching garantias
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the garantias where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching garantias
	 */
	public static List<Garantia> findByPropostaId(long propostaId) {
		return getPersistence().findByPropostaId(propostaId);
	}

	/**
	 * Returns a range of all the garantias where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @return the range of matching garantias
	 */
	public static List<Garantia> findByPropostaId(
		long propostaId, int start, int end) {

		return getPersistence().findByPropostaId(propostaId, start, end);
	}

	/**
	 * Returns an ordered range of all the garantias where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching garantias
	 */
	public static List<Garantia> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<Garantia> orderByComparator) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the garantias where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching garantias
	 */
	public static List<Garantia> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<Garantia> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first garantia in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching garantia
	 * @throws NoSuchGarantiaException if a matching garantia could not be found
	 */
	public static Garantia findByPropostaId_First(
			long propostaId, OrderByComparator<Garantia> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchGarantiaException {

		return getPersistence().findByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the first garantia in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching garantia, or <code>null</code> if a matching garantia could not be found
	 */
	public static Garantia fetchByPropostaId_First(
		long propostaId, OrderByComparator<Garantia> orderByComparator) {

		return getPersistence().fetchByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last garantia in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching garantia
	 * @throws NoSuchGarantiaException if a matching garantia could not be found
	 */
	public static Garantia findByPropostaId_Last(
			long propostaId, OrderByComparator<Garantia> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchGarantiaException {

		return getPersistence().findByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last garantia in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching garantia, or <code>null</code> if a matching garantia could not be found
	 */
	public static Garantia fetchByPropostaId_Last(
		long propostaId, OrderByComparator<Garantia> orderByComparator) {

		return getPersistence().fetchByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the garantias before and after the current garantia in the ordered set where propostaId = &#63;.
	 *
	 * @param garantiaId the primary key of the current garantia
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next garantia
	 * @throws NoSuchGarantiaException if a garantia with the primary key could not be found
	 */
	public static Garantia[] findByPropostaId_PrevAndNext(
			long garantiaId, long propostaId,
			OrderByComparator<Garantia> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchGarantiaException {

		return getPersistence().findByPropostaId_PrevAndNext(
			garantiaId, propostaId, orderByComparator);
	}

	/**
	 * Removes all the garantias where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public static void removeByPropostaId(long propostaId) {
		getPersistence().removeByPropostaId(propostaId);
	}

	/**
	 * Returns the number of garantias where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching garantias
	 */
	public static int countByPropostaId(long propostaId) {
		return getPersistence().countByPropostaId(propostaId);
	}

	/**
	 * Caches the garantia in the entity cache if it is enabled.
	 *
	 * @param garantia the garantia
	 */
	public static void cacheResult(Garantia garantia) {
		getPersistence().cacheResult(garantia);
	}

	/**
	 * Caches the garantias in the entity cache if it is enabled.
	 *
	 * @param garantias the garantias
	 */
	public static void cacheResult(List<Garantia> garantias) {
		getPersistence().cacheResult(garantias);
	}

	/**
	 * Creates a new garantia with the primary key. Does not add the garantia to the database.
	 *
	 * @param garantiaId the primary key for the new garantia
	 * @return the new garantia
	 */
	public static Garantia create(long garantiaId) {
		return getPersistence().create(garantiaId);
	}

	/**
	 * Removes the garantia with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param garantiaId the primary key of the garantia
	 * @return the garantia that was removed
	 * @throws NoSuchGarantiaException if a garantia with the primary key could not be found
	 */
	public static Garantia remove(long garantiaId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchGarantiaException {

		return getPersistence().remove(garantiaId);
	}

	public static Garantia updateImpl(Garantia garantia) {
		return getPersistence().updateImpl(garantia);
	}

	/**
	 * Returns the garantia with the primary key or throws a <code>NoSuchGarantiaException</code> if it could not be found.
	 *
	 * @param garantiaId the primary key of the garantia
	 * @return the garantia
	 * @throws NoSuchGarantiaException if a garantia with the primary key could not be found
	 */
	public static Garantia findByPrimaryKey(long garantiaId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchGarantiaException {

		return getPersistence().findByPrimaryKey(garantiaId);
	}

	/**
	 * Returns the garantia with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param garantiaId the primary key of the garantia
	 * @return the garantia, or <code>null</code> if a garantia with the primary key could not be found
	 */
	public static Garantia fetchByPrimaryKey(long garantiaId) {
		return getPersistence().fetchByPrimaryKey(garantiaId);
	}

	/**
	 * Returns all the garantias.
	 *
	 * @return the garantias
	 */
	public static List<Garantia> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the garantias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @return the range of garantias
	 */
	public static List<Garantia> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the garantias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of garantias
	 */
	public static List<Garantia> findAll(
		int start, int end, OrderByComparator<Garantia> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the garantias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of garantias
	 */
	public static List<Garantia> findAll(
		int start, int end, OrderByComparator<Garantia> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the garantias from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of garantias.
	 *
	 * @return the number of garantias
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static GarantiaPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(GarantiaPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile GarantiaPersistence _persistence;

}