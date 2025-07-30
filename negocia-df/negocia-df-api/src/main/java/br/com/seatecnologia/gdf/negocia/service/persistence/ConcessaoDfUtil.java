/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.ConcessaoDf;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the concessao df service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.ConcessaoDfPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConcessaoDfPersistence
 * @generated
 */
public class ConcessaoDfUtil {

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
	public static void clearCache(ConcessaoDf concessaoDf) {
		getPersistence().clearCache(concessaoDf);
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
	public static Map<Serializable, ConcessaoDf> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ConcessaoDf> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ConcessaoDf> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ConcessaoDf> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ConcessaoDf> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ConcessaoDf update(ConcessaoDf concessaoDf) {
		return getPersistence().update(concessaoDf);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ConcessaoDf update(
		ConcessaoDf concessaoDf, ServiceContext serviceContext) {

		return getPersistence().update(concessaoDf, serviceContext);
	}

	/**
	 * Returns all the concessao dfs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching concessao dfs
	 */
	public static List<ConcessaoDf> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the concessao dfs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @return the range of matching concessao dfs
	 */
	public static List<ConcessaoDf> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the concessao dfs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching concessao dfs
	 */
	public static List<ConcessaoDf> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ConcessaoDf> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the concessao dfs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching concessao dfs
	 */
	public static List<ConcessaoDf> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ConcessaoDf> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first concessao df in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching concessao df
	 * @throws NoSuchConcessaoDfException if a matching concessao df could not be found
	 */
	public static ConcessaoDf findByUuid_First(
			String uuid, OrderByComparator<ConcessaoDf> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchConcessaoDfException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first concessao df in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching concessao df, or <code>null</code> if a matching concessao df could not be found
	 */
	public static ConcessaoDf fetchByUuid_First(
		String uuid, OrderByComparator<ConcessaoDf> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last concessao df in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching concessao df
	 * @throws NoSuchConcessaoDfException if a matching concessao df could not be found
	 */
	public static ConcessaoDf findByUuid_Last(
			String uuid, OrderByComparator<ConcessaoDf> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchConcessaoDfException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last concessao df in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching concessao df, or <code>null</code> if a matching concessao df could not be found
	 */
	public static ConcessaoDf fetchByUuid_Last(
		String uuid, OrderByComparator<ConcessaoDf> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the concessao dfs before and after the current concessao df in the ordered set where uuid = &#63;.
	 *
	 * @param concessaoId the primary key of the current concessao df
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next concessao df
	 * @throws NoSuchConcessaoDfException if a concessao df with the primary key could not be found
	 */
	public static ConcessaoDf[] findByUuid_PrevAndNext(
			long concessaoId, String uuid,
			OrderByComparator<ConcessaoDf> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchConcessaoDfException {

		return getPersistence().findByUuid_PrevAndNext(
			concessaoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the concessao dfs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of concessao dfs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching concessao dfs
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the concessao dfs where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching concessao dfs
	 */
	public static List<ConcessaoDf> findByPropostaId(long propostaId) {
		return getPersistence().findByPropostaId(propostaId);
	}

	/**
	 * Returns a range of all the concessao dfs where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @return the range of matching concessao dfs
	 */
	public static List<ConcessaoDf> findByPropostaId(
		long propostaId, int start, int end) {

		return getPersistence().findByPropostaId(propostaId, start, end);
	}

	/**
	 * Returns an ordered range of all the concessao dfs where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching concessao dfs
	 */
	public static List<ConcessaoDf> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<ConcessaoDf> orderByComparator) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the concessao dfs where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching concessao dfs
	 */
	public static List<ConcessaoDf> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<ConcessaoDf> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first concessao df in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching concessao df
	 * @throws NoSuchConcessaoDfException if a matching concessao df could not be found
	 */
	public static ConcessaoDf findByPropostaId_First(
			long propostaId, OrderByComparator<ConcessaoDf> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchConcessaoDfException {

		return getPersistence().findByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the first concessao df in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching concessao df, or <code>null</code> if a matching concessao df could not be found
	 */
	public static ConcessaoDf fetchByPropostaId_First(
		long propostaId, OrderByComparator<ConcessaoDf> orderByComparator) {

		return getPersistence().fetchByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last concessao df in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching concessao df
	 * @throws NoSuchConcessaoDfException if a matching concessao df could not be found
	 */
	public static ConcessaoDf findByPropostaId_Last(
			long propostaId, OrderByComparator<ConcessaoDf> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchConcessaoDfException {

		return getPersistence().findByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last concessao df in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching concessao df, or <code>null</code> if a matching concessao df could not be found
	 */
	public static ConcessaoDf fetchByPropostaId_Last(
		long propostaId, OrderByComparator<ConcessaoDf> orderByComparator) {

		return getPersistence().fetchByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the concessao dfs before and after the current concessao df in the ordered set where propostaId = &#63;.
	 *
	 * @param concessaoId the primary key of the current concessao df
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next concessao df
	 * @throws NoSuchConcessaoDfException if a concessao df with the primary key could not be found
	 */
	public static ConcessaoDf[] findByPropostaId_PrevAndNext(
			long concessaoId, long propostaId,
			OrderByComparator<ConcessaoDf> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchConcessaoDfException {

		return getPersistence().findByPropostaId_PrevAndNext(
			concessaoId, propostaId, orderByComparator);
	}

	/**
	 * Removes all the concessao dfs where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public static void removeByPropostaId(long propostaId) {
		getPersistence().removeByPropostaId(propostaId);
	}

	/**
	 * Returns the number of concessao dfs where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching concessao dfs
	 */
	public static int countByPropostaId(long propostaId) {
		return getPersistence().countByPropostaId(propostaId);
	}

	/**
	 * Caches the concessao df in the entity cache if it is enabled.
	 *
	 * @param concessaoDf the concessao df
	 */
	public static void cacheResult(ConcessaoDf concessaoDf) {
		getPersistence().cacheResult(concessaoDf);
	}

	/**
	 * Caches the concessao dfs in the entity cache if it is enabled.
	 *
	 * @param concessaoDfs the concessao dfs
	 */
	public static void cacheResult(List<ConcessaoDf> concessaoDfs) {
		getPersistence().cacheResult(concessaoDfs);
	}

	/**
	 * Creates a new concessao df with the primary key. Does not add the concessao df to the database.
	 *
	 * @param concessaoId the primary key for the new concessao df
	 * @return the new concessao df
	 */
	public static ConcessaoDf create(long concessaoId) {
		return getPersistence().create(concessaoId);
	}

	/**
	 * Removes the concessao df with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param concessaoId the primary key of the concessao df
	 * @return the concessao df that was removed
	 * @throws NoSuchConcessaoDfException if a concessao df with the primary key could not be found
	 */
	public static ConcessaoDf remove(long concessaoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchConcessaoDfException {

		return getPersistence().remove(concessaoId);
	}

	public static ConcessaoDf updateImpl(ConcessaoDf concessaoDf) {
		return getPersistence().updateImpl(concessaoDf);
	}

	/**
	 * Returns the concessao df with the primary key or throws a <code>NoSuchConcessaoDfException</code> if it could not be found.
	 *
	 * @param concessaoId the primary key of the concessao df
	 * @return the concessao df
	 * @throws NoSuchConcessaoDfException if a concessao df with the primary key could not be found
	 */
	public static ConcessaoDf findByPrimaryKey(long concessaoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchConcessaoDfException {

		return getPersistence().findByPrimaryKey(concessaoId);
	}

	/**
	 * Returns the concessao df with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param concessaoId the primary key of the concessao df
	 * @return the concessao df, or <code>null</code> if a concessao df with the primary key could not be found
	 */
	public static ConcessaoDf fetchByPrimaryKey(long concessaoId) {
		return getPersistence().fetchByPrimaryKey(concessaoId);
	}

	/**
	 * Returns all the concessao dfs.
	 *
	 * @return the concessao dfs
	 */
	public static List<ConcessaoDf> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the concessao dfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @return the range of concessao dfs
	 */
	public static List<ConcessaoDf> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the concessao dfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of concessao dfs
	 */
	public static List<ConcessaoDf> findAll(
		int start, int end, OrderByComparator<ConcessaoDf> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the concessao dfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of concessao dfs
	 */
	public static List<ConcessaoDf> findAll(
		int start, int end, OrderByComparator<ConcessaoDf> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the concessao dfs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of concessao dfs.
	 *
	 * @return the number of concessao dfs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ConcessaoDfPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(ConcessaoDfPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile ConcessaoDfPersistence _persistence;

}