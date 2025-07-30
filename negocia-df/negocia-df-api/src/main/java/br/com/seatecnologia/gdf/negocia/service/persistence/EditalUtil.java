/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.Edital;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the edital service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.EditalPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EditalPersistence
 * @generated
 */
public class EditalUtil {

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
	public static void clearCache(Edital edital) {
		getPersistence().clearCache(edital);
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
	public static Map<Serializable, Edital> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Edital> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Edital> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Edital> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Edital> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Edital update(Edital edital) {
		return getPersistence().update(edital);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Edital update(Edital edital, ServiceContext serviceContext) {
		return getPersistence().update(edital, serviceContext);
	}

	/**
	 * Returns all the editals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching editals
	 */
	public static List<Edital> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the editals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EditalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of editals
	 * @param end the upper bound of the range of editals (not inclusive)
	 * @return the range of matching editals
	 */
	public static List<Edital> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the editals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EditalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of editals
	 * @param end the upper bound of the range of editals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching editals
	 */
	public static List<Edital> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Edital> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the editals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EditalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of editals
	 * @param end the upper bound of the range of editals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching editals
	 */
	public static List<Edital> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Edital> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first edital in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edital
	 * @throws NoSuchEditalException if a matching edital could not be found
	 */
	public static Edital findByUuid_First(
			String uuid, OrderByComparator<Edital> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEditalException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first edital in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edital, or <code>null</code> if a matching edital could not be found
	 */
	public static Edital fetchByUuid_First(
		String uuid, OrderByComparator<Edital> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last edital in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edital
	 * @throws NoSuchEditalException if a matching edital could not be found
	 */
	public static Edital findByUuid_Last(
			String uuid, OrderByComparator<Edital> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEditalException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last edital in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edital, or <code>null</code> if a matching edital could not be found
	 */
	public static Edital fetchByUuid_Last(
		String uuid, OrderByComparator<Edital> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the editals before and after the current edital in the ordered set where uuid = &#63;.
	 *
	 * @param editalId the primary key of the current edital
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edital
	 * @throws NoSuchEditalException if a edital with the primary key could not be found
	 */
	public static Edital[] findByUuid_PrevAndNext(
			long editalId, String uuid,
			OrderByComparator<Edital> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEditalException {

		return getPersistence().findByUuid_PrevAndNext(
			editalId, uuid, orderByComparator);
	}

	/**
	 * Removes all the editals where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of editals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching editals
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the edital in the entity cache if it is enabled.
	 *
	 * @param edital the edital
	 */
	public static void cacheResult(Edital edital) {
		getPersistence().cacheResult(edital);
	}

	/**
	 * Caches the editals in the entity cache if it is enabled.
	 *
	 * @param editals the editals
	 */
	public static void cacheResult(List<Edital> editals) {
		getPersistence().cacheResult(editals);
	}

	/**
	 * Creates a new edital with the primary key. Does not add the edital to the database.
	 *
	 * @param editalId the primary key for the new edital
	 * @return the new edital
	 */
	public static Edital create(long editalId) {
		return getPersistence().create(editalId);
	}

	/**
	 * Removes the edital with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param editalId the primary key of the edital
	 * @return the edital that was removed
	 * @throws NoSuchEditalException if a edital with the primary key could not be found
	 */
	public static Edital remove(long editalId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEditalException {

		return getPersistence().remove(editalId);
	}

	public static Edital updateImpl(Edital edital) {
		return getPersistence().updateImpl(edital);
	}

	/**
	 * Returns the edital with the primary key or throws a <code>NoSuchEditalException</code> if it could not be found.
	 *
	 * @param editalId the primary key of the edital
	 * @return the edital
	 * @throws NoSuchEditalException if a edital with the primary key could not be found
	 */
	public static Edital findByPrimaryKey(long editalId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEditalException {

		return getPersistence().findByPrimaryKey(editalId);
	}

	/**
	 * Returns the edital with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param editalId the primary key of the edital
	 * @return the edital, or <code>null</code> if a edital with the primary key could not be found
	 */
	public static Edital fetchByPrimaryKey(long editalId) {
		return getPersistence().fetchByPrimaryKey(editalId);
	}

	/**
	 * Returns all the editals.
	 *
	 * @return the editals
	 */
	public static List<Edital> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the editals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EditalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of editals
	 * @param end the upper bound of the range of editals (not inclusive)
	 * @return the range of editals
	 */
	public static List<Edital> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the editals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EditalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of editals
	 * @param end the upper bound of the range of editals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of editals
	 */
	public static List<Edital> findAll(
		int start, int end, OrderByComparator<Edital> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the editals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EditalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of editals
	 * @param end the upper bound of the range of editals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of editals
	 */
	public static List<Edital> findAll(
		int start, int end, OrderByComparator<Edital> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the editals from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of editals.
	 *
	 * @return the number of editals
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EditalPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(EditalPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile EditalPersistence _persistence;

}