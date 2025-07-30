/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the administrador judicial service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.AdministradorJudicialPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdministradorJudicialPersistence
 * @generated
 */
public class AdministradorJudicialUtil {

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
	public static void clearCache(AdministradorJudicial administradorJudicial) {
		getPersistence().clearCache(administradorJudicial);
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
	public static Map<Serializable, AdministradorJudicial> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AdministradorJudicial> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AdministradorJudicial> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AdministradorJudicial> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AdministradorJudicial> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AdministradorJudicial update(
		AdministradorJudicial administradorJudicial) {

		return getPersistence().update(administradorJudicial);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AdministradorJudicial update(
		AdministradorJudicial administradorJudicial,
		ServiceContext serviceContext) {

		return getPersistence().update(administradorJudicial, serviceContext);
	}

	/**
	 * Returns all the administrador judicials where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching administrador judicials
	 */
	public static List<AdministradorJudicial> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the administrador judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @return the range of matching administrador judicials
	 */
	public static List<AdministradorJudicial> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the administrador judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching administrador judicials
	 */
	public static List<AdministradorJudicial> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AdministradorJudicial> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the administrador judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching administrador judicials
	 */
	public static List<AdministradorJudicial> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AdministradorJudicial> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first administrador judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching administrador judicial
	 * @throws NoSuchAdministradorJudicialException if a matching administrador judicial could not be found
	 */
	public static AdministradorJudicial findByUuid_First(
			String uuid,
			OrderByComparator<AdministradorJudicial> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAdministradorJudicialException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first administrador judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching administrador judicial, or <code>null</code> if a matching administrador judicial could not be found
	 */
	public static AdministradorJudicial fetchByUuid_First(
		String uuid,
		OrderByComparator<AdministradorJudicial> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last administrador judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching administrador judicial
	 * @throws NoSuchAdministradorJudicialException if a matching administrador judicial could not be found
	 */
	public static AdministradorJudicial findByUuid_Last(
			String uuid,
			OrderByComparator<AdministradorJudicial> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAdministradorJudicialException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last administrador judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching administrador judicial, or <code>null</code> if a matching administrador judicial could not be found
	 */
	public static AdministradorJudicial fetchByUuid_Last(
		String uuid,
		OrderByComparator<AdministradorJudicial> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the administrador judicials before and after the current administrador judicial in the ordered set where uuid = &#63;.
	 *
	 * @param administradorJudicialId the primary key of the current administrador judicial
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next administrador judicial
	 * @throws NoSuchAdministradorJudicialException if a administrador judicial with the primary key could not be found
	 */
	public static AdministradorJudicial[] findByUuid_PrevAndNext(
			long administradorJudicialId, String uuid,
			OrderByComparator<AdministradorJudicial> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAdministradorJudicialException {

		return getPersistence().findByUuid_PrevAndNext(
			administradorJudicialId, uuid, orderByComparator);
	}

	/**
	 * Removes all the administrador judicials where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of administrador judicials where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching administrador judicials
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the administrador judicial in the entity cache if it is enabled.
	 *
	 * @param administradorJudicial the administrador judicial
	 */
	public static void cacheResult(
		AdministradorJudicial administradorJudicial) {

		getPersistence().cacheResult(administradorJudicial);
	}

	/**
	 * Caches the administrador judicials in the entity cache if it is enabled.
	 *
	 * @param administradorJudicials the administrador judicials
	 */
	public static void cacheResult(
		List<AdministradorJudicial> administradorJudicials) {

		getPersistence().cacheResult(administradorJudicials);
	}

	/**
	 * Creates a new administrador judicial with the primary key. Does not add the administrador judicial to the database.
	 *
	 * @param administradorJudicialId the primary key for the new administrador judicial
	 * @return the new administrador judicial
	 */
	public static AdministradorJudicial create(long administradorJudicialId) {
		return getPersistence().create(administradorJudicialId);
	}

	/**
	 * Removes the administrador judicial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param administradorJudicialId the primary key of the administrador judicial
	 * @return the administrador judicial that was removed
	 * @throws NoSuchAdministradorJudicialException if a administrador judicial with the primary key could not be found
	 */
	public static AdministradorJudicial remove(long administradorJudicialId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAdministradorJudicialException {

		return getPersistence().remove(administradorJudicialId);
	}

	public static AdministradorJudicial updateImpl(
		AdministradorJudicial administradorJudicial) {

		return getPersistence().updateImpl(administradorJudicial);
	}

	/**
	 * Returns the administrador judicial with the primary key or throws a <code>NoSuchAdministradorJudicialException</code> if it could not be found.
	 *
	 * @param administradorJudicialId the primary key of the administrador judicial
	 * @return the administrador judicial
	 * @throws NoSuchAdministradorJudicialException if a administrador judicial with the primary key could not be found
	 */
	public static AdministradorJudicial findByPrimaryKey(
			long administradorJudicialId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAdministradorJudicialException {

		return getPersistence().findByPrimaryKey(administradorJudicialId);
	}

	/**
	 * Returns the administrador judicial with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param administradorJudicialId the primary key of the administrador judicial
	 * @return the administrador judicial, or <code>null</code> if a administrador judicial with the primary key could not be found
	 */
	public static AdministradorJudicial fetchByPrimaryKey(
		long administradorJudicialId) {

		return getPersistence().fetchByPrimaryKey(administradorJudicialId);
	}

	/**
	 * Returns all the administrador judicials.
	 *
	 * @return the administrador judicials
	 */
	public static List<AdministradorJudicial> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the administrador judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @return the range of administrador judicials
	 */
	public static List<AdministradorJudicial> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the administrador judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of administrador judicials
	 */
	public static List<AdministradorJudicial> findAll(
		int start, int end,
		OrderByComparator<AdministradorJudicial> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the administrador judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of administrador judicials
	 */
	public static List<AdministradorJudicial> findAll(
		int start, int end,
		OrderByComparator<AdministradorJudicial> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the administrador judicials from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of administrador judicials.
	 *
	 * @return the number of administrador judicials
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AdministradorJudicialPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AdministradorJudicialPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AdministradorJudicialPersistence _persistence;

}