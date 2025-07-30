/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the bem direito adicional service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.BemDireitoAdicionalPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BemDireitoAdicionalPersistence
 * @generated
 */
public class BemDireitoAdicionalUtil {

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
	public static void clearCache(BemDireitoAdicional bemDireitoAdicional) {
		getPersistence().clearCache(bemDireitoAdicional);
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
	public static Map<Serializable, BemDireitoAdicional> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<BemDireitoAdicional> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BemDireitoAdicional> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BemDireitoAdicional> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BemDireitoAdicional> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BemDireitoAdicional update(
		BemDireitoAdicional bemDireitoAdicional) {

		return getPersistence().update(bemDireitoAdicional);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BemDireitoAdicional update(
		BemDireitoAdicional bemDireitoAdicional,
		ServiceContext serviceContext) {

		return getPersistence().update(bemDireitoAdicional, serviceContext);
	}

	/**
	 * Returns all the bem direito adicionals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching bem direito adicionals
	 */
	public static List<BemDireitoAdicional> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the bem direito adicionals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @return the range of matching bem direito adicionals
	 */
	public static List<BemDireitoAdicional> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the bem direito adicionals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bem direito adicionals
	 */
	public static List<BemDireitoAdicional> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BemDireitoAdicional> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bem direito adicionals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bem direito adicionals
	 */
	public static List<BemDireitoAdicional> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BemDireitoAdicional> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first bem direito adicional in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a matching bem direito adicional could not be found
	 */
	public static BemDireitoAdicional findByUuid_First(
			String uuid,
			OrderByComparator<BemDireitoAdicional> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBemDireitoAdicionalException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first bem direito adicional in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bem direito adicional, or <code>null</code> if a matching bem direito adicional could not be found
	 */
	public static BemDireitoAdicional fetchByUuid_First(
		String uuid, OrderByComparator<BemDireitoAdicional> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last bem direito adicional in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a matching bem direito adicional could not be found
	 */
	public static BemDireitoAdicional findByUuid_Last(
			String uuid,
			OrderByComparator<BemDireitoAdicional> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBemDireitoAdicionalException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last bem direito adicional in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bem direito adicional, or <code>null</code> if a matching bem direito adicional could not be found
	 */
	public static BemDireitoAdicional fetchByUuid_Last(
		String uuid, OrderByComparator<BemDireitoAdicional> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the bem direito adicionals before and after the current bem direito adicional in the ordered set where uuid = &#63;.
	 *
	 * @param bemId the primary key of the current bem direito adicional
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a bem direito adicional with the primary key could not be found
	 */
	public static BemDireitoAdicional[] findByUuid_PrevAndNext(
			long bemId, String uuid,
			OrderByComparator<BemDireitoAdicional> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBemDireitoAdicionalException {

		return getPersistence().findByUuid_PrevAndNext(
			bemId, uuid, orderByComparator);
	}

	/**
	 * Removes all the bem direito adicionals where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of bem direito adicionals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching bem direito adicionals
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the bem direito adicionals where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching bem direito adicionals
	 */
	public static List<BemDireitoAdicional> findByPropostaId(long propostaId) {
		return getPersistence().findByPropostaId(propostaId);
	}

	/**
	 * Returns a range of all the bem direito adicionals where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @return the range of matching bem direito adicionals
	 */
	public static List<BemDireitoAdicional> findByPropostaId(
		long propostaId, int start, int end) {

		return getPersistence().findByPropostaId(propostaId, start, end);
	}

	/**
	 * Returns an ordered range of all the bem direito adicionals where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bem direito adicionals
	 */
	public static List<BemDireitoAdicional> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<BemDireitoAdicional> orderByComparator) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bem direito adicionals where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bem direito adicionals
	 */
	public static List<BemDireitoAdicional> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<BemDireitoAdicional> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first bem direito adicional in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a matching bem direito adicional could not be found
	 */
	public static BemDireitoAdicional findByPropostaId_First(
			long propostaId,
			OrderByComparator<BemDireitoAdicional> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBemDireitoAdicionalException {

		return getPersistence().findByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the first bem direito adicional in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bem direito adicional, or <code>null</code> if a matching bem direito adicional could not be found
	 */
	public static BemDireitoAdicional fetchByPropostaId_First(
		long propostaId,
		OrderByComparator<BemDireitoAdicional> orderByComparator) {

		return getPersistence().fetchByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last bem direito adicional in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a matching bem direito adicional could not be found
	 */
	public static BemDireitoAdicional findByPropostaId_Last(
			long propostaId,
			OrderByComparator<BemDireitoAdicional> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBemDireitoAdicionalException {

		return getPersistence().findByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last bem direito adicional in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bem direito adicional, or <code>null</code> if a matching bem direito adicional could not be found
	 */
	public static BemDireitoAdicional fetchByPropostaId_Last(
		long propostaId,
		OrderByComparator<BemDireitoAdicional> orderByComparator) {

		return getPersistence().fetchByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the bem direito adicionals before and after the current bem direito adicional in the ordered set where propostaId = &#63;.
	 *
	 * @param bemId the primary key of the current bem direito adicional
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a bem direito adicional with the primary key could not be found
	 */
	public static BemDireitoAdicional[] findByPropostaId_PrevAndNext(
			long bemId, long propostaId,
			OrderByComparator<BemDireitoAdicional> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBemDireitoAdicionalException {

		return getPersistence().findByPropostaId_PrevAndNext(
			bemId, propostaId, orderByComparator);
	}

	/**
	 * Removes all the bem direito adicionals where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public static void removeByPropostaId(long propostaId) {
		getPersistence().removeByPropostaId(propostaId);
	}

	/**
	 * Returns the number of bem direito adicionals where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching bem direito adicionals
	 */
	public static int countByPropostaId(long propostaId) {
		return getPersistence().countByPropostaId(propostaId);
	}

	/**
	 * Caches the bem direito adicional in the entity cache if it is enabled.
	 *
	 * @param bemDireitoAdicional the bem direito adicional
	 */
	public static void cacheResult(BemDireitoAdicional bemDireitoAdicional) {
		getPersistence().cacheResult(bemDireitoAdicional);
	}

	/**
	 * Caches the bem direito adicionals in the entity cache if it is enabled.
	 *
	 * @param bemDireitoAdicionals the bem direito adicionals
	 */
	public static void cacheResult(
		List<BemDireitoAdicional> bemDireitoAdicionals) {

		getPersistence().cacheResult(bemDireitoAdicionals);
	}

	/**
	 * Creates a new bem direito adicional with the primary key. Does not add the bem direito adicional to the database.
	 *
	 * @param bemId the primary key for the new bem direito adicional
	 * @return the new bem direito adicional
	 */
	public static BemDireitoAdicional create(long bemId) {
		return getPersistence().create(bemId);
	}

	/**
	 * Removes the bem direito adicional with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bemId the primary key of the bem direito adicional
	 * @return the bem direito adicional that was removed
	 * @throws NoSuchBemDireitoAdicionalException if a bem direito adicional with the primary key could not be found
	 */
	public static BemDireitoAdicional remove(long bemId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBemDireitoAdicionalException {

		return getPersistence().remove(bemId);
	}

	public static BemDireitoAdicional updateImpl(
		BemDireitoAdicional bemDireitoAdicional) {

		return getPersistence().updateImpl(bemDireitoAdicional);
	}

	/**
	 * Returns the bem direito adicional with the primary key or throws a <code>NoSuchBemDireitoAdicionalException</code> if it could not be found.
	 *
	 * @param bemId the primary key of the bem direito adicional
	 * @return the bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a bem direito adicional with the primary key could not be found
	 */
	public static BemDireitoAdicional findByPrimaryKey(long bemId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBemDireitoAdicionalException {

		return getPersistence().findByPrimaryKey(bemId);
	}

	/**
	 * Returns the bem direito adicional with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bemId the primary key of the bem direito adicional
	 * @return the bem direito adicional, or <code>null</code> if a bem direito adicional with the primary key could not be found
	 */
	public static BemDireitoAdicional fetchByPrimaryKey(long bemId) {
		return getPersistence().fetchByPrimaryKey(bemId);
	}

	/**
	 * Returns all the bem direito adicionals.
	 *
	 * @return the bem direito adicionals
	 */
	public static List<BemDireitoAdicional> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the bem direito adicionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @return the range of bem direito adicionals
	 */
	public static List<BemDireitoAdicional> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the bem direito adicionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bem direito adicionals
	 */
	public static List<BemDireitoAdicional> findAll(
		int start, int end,
		OrderByComparator<BemDireitoAdicional> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bem direito adicionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bem direito adicionals
	 */
	public static List<BemDireitoAdicional> findAll(
		int start, int end,
		OrderByComparator<BemDireitoAdicional> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the bem direito adicionals from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of bem direito adicionals.
	 *
	 * @return the number of bem direito adicionals
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BemDireitoAdicionalPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		BemDireitoAdicionalPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile BemDireitoAdicionalPersistence _persistence;

}