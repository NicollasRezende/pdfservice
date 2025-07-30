/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.DadosContribuinte;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the dados contribuinte service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.DadosContribuintePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DadosContribuintePersistence
 * @generated
 */
public class DadosContribuinteUtil {

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
	public static void clearCache(DadosContribuinte dadosContribuinte) {
		getPersistence().clearCache(dadosContribuinte);
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
	public static Map<Serializable, DadosContribuinte> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DadosContribuinte> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DadosContribuinte> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DadosContribuinte> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DadosContribuinte> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DadosContribuinte update(
		DadosContribuinte dadosContribuinte) {

		return getPersistence().update(dadosContribuinte);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DadosContribuinte update(
		DadosContribuinte dadosContribuinte, ServiceContext serviceContext) {

		return getPersistence().update(dadosContribuinte, serviceContext);
	}

	/**
	 * Returns all the dados contribuintes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching dados contribuintes
	 */
	public static List<DadosContribuinte> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the dados contribuintes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @return the range of matching dados contribuintes
	 */
	public static List<DadosContribuinte> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the dados contribuintes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dados contribuintes
	 */
	public static List<DadosContribuinte> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DadosContribuinte> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dados contribuintes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dados contribuintes
	 */
	public static List<DadosContribuinte> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DadosContribuinte> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dados contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a matching dados contribuinte could not be found
	 */
	public static DadosContribuinte findByUuid_First(
			String uuid, OrderByComparator<DadosContribuinte> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosContribuinteException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first dados contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	public static DadosContribuinte fetchByUuid_First(
		String uuid, OrderByComparator<DadosContribuinte> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last dados contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a matching dados contribuinte could not be found
	 */
	public static DadosContribuinte findByUuid_Last(
			String uuid, OrderByComparator<DadosContribuinte> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosContribuinteException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last dados contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	public static DadosContribuinte fetchByUuid_Last(
		String uuid, OrderByComparator<DadosContribuinte> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the dados contribuintes before and after the current dados contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param dadosContribuinteId the primary key of the current dados contribuinte
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a dados contribuinte with the primary key could not be found
	 */
	public static DadosContribuinte[] findByUuid_PrevAndNext(
			long dadosContribuinteId, String uuid,
			OrderByComparator<DadosContribuinte> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosContribuinteException {

		return getPersistence().findByUuid_PrevAndNext(
			dadosContribuinteId, uuid, orderByComparator);
	}

	/**
	 * Removes all the dados contribuintes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of dados contribuintes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching dados contribuintes
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the dados contribuinte where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDadosContribuinteException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a matching dados contribuinte could not be found
	 */
	public static DadosContribuinte findByUUID_G(String uuid, long groupId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosContribuinteException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the dados contribuinte where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	public static DadosContribuinte fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the dados contribuinte where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	public static DadosContribuinte fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the dados contribuinte where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the dados contribuinte that was removed
	 */
	public static DadosContribuinte removeByUUID_G(String uuid, long groupId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosContribuinteException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of dados contribuintes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching dados contribuintes
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the dados contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching dados contribuintes
	 */
	public static List<DadosContribuinte> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the dados contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @return the range of matching dados contribuintes
	 */
	public static List<DadosContribuinte> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the dados contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dados contribuintes
	 */
	public static List<DadosContribuinte> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DadosContribuinte> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dados contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dados contribuintes
	 */
	public static List<DadosContribuinte> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DadosContribuinte> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dados contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a matching dados contribuinte could not be found
	 */
	public static DadosContribuinte findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<DadosContribuinte> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosContribuinteException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first dados contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	public static DadosContribuinte fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<DadosContribuinte> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last dados contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a matching dados contribuinte could not be found
	 */
	public static DadosContribuinte findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<DadosContribuinte> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosContribuinteException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last dados contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	public static DadosContribuinte fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<DadosContribuinte> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the dados contribuintes before and after the current dados contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param dadosContribuinteId the primary key of the current dados contribuinte
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a dados contribuinte with the primary key could not be found
	 */
	public static DadosContribuinte[] findByUuid_C_PrevAndNext(
			long dadosContribuinteId, String uuid, long companyId,
			OrderByComparator<DadosContribuinte> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosContribuinteException {

		return getPersistence().findByUuid_C_PrevAndNext(
			dadosContribuinteId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the dados contribuintes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of dados contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching dados contribuintes
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the dados contribuinte in the entity cache if it is enabled.
	 *
	 * @param dadosContribuinte the dados contribuinte
	 */
	public static void cacheResult(DadosContribuinte dadosContribuinte) {
		getPersistence().cacheResult(dadosContribuinte);
	}

	/**
	 * Caches the dados contribuintes in the entity cache if it is enabled.
	 *
	 * @param dadosContribuintes the dados contribuintes
	 */
	public static void cacheResult(List<DadosContribuinte> dadosContribuintes) {
		getPersistence().cacheResult(dadosContribuintes);
	}

	/**
	 * Creates a new dados contribuinte with the primary key. Does not add the dados contribuinte to the database.
	 *
	 * @param dadosContribuinteId the primary key for the new dados contribuinte
	 * @return the new dados contribuinte
	 */
	public static DadosContribuinte create(long dadosContribuinteId) {
		return getPersistence().create(dadosContribuinteId);
	}

	/**
	 * Removes the dados contribuinte with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dadosContribuinteId the primary key of the dados contribuinte
	 * @return the dados contribuinte that was removed
	 * @throws NoSuchDadosContribuinteException if a dados contribuinte with the primary key could not be found
	 */
	public static DadosContribuinte remove(long dadosContribuinteId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosContribuinteException {

		return getPersistence().remove(dadosContribuinteId);
	}

	public static DadosContribuinte updateImpl(
		DadosContribuinte dadosContribuinte) {

		return getPersistence().updateImpl(dadosContribuinte);
	}

	/**
	 * Returns the dados contribuinte with the primary key or throws a <code>NoSuchDadosContribuinteException</code> if it could not be found.
	 *
	 * @param dadosContribuinteId the primary key of the dados contribuinte
	 * @return the dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a dados contribuinte with the primary key could not be found
	 */
	public static DadosContribuinte findByPrimaryKey(long dadosContribuinteId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosContribuinteException {

		return getPersistence().findByPrimaryKey(dadosContribuinteId);
	}

	/**
	 * Returns the dados contribuinte with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dadosContribuinteId the primary key of the dados contribuinte
	 * @return the dados contribuinte, or <code>null</code> if a dados contribuinte with the primary key could not be found
	 */
	public static DadosContribuinte fetchByPrimaryKey(
		long dadosContribuinteId) {

		return getPersistence().fetchByPrimaryKey(dadosContribuinteId);
	}

	/**
	 * Returns all the dados contribuintes.
	 *
	 * @return the dados contribuintes
	 */
	public static List<DadosContribuinte> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the dados contribuintes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @return the range of dados contribuintes
	 */
	public static List<DadosContribuinte> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the dados contribuintes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dados contribuintes
	 */
	public static List<DadosContribuinte> findAll(
		int start, int end,
		OrderByComparator<DadosContribuinte> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dados contribuintes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dados contribuintes
	 */
	public static List<DadosContribuinte> findAll(
		int start, int end,
		OrderByComparator<DadosContribuinte> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the dados contribuintes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of dados contribuintes.
	 *
	 * @return the number of dados contribuintes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DadosContribuintePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		DadosContribuintePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile DadosContribuintePersistence _persistence;

}