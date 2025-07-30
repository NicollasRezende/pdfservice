/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the demonstracao contabil service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.DemonstracaoContabilPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DemonstracaoContabilPersistence
 * @generated
 */
public class DemonstracaoContabilUtil {

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
	public static void clearCache(DemonstracaoContabil demonstracaoContabil) {
		getPersistence().clearCache(demonstracaoContabil);
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
	public static Map<Serializable, DemonstracaoContabil> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DemonstracaoContabil> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DemonstracaoContabil> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DemonstracaoContabil> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DemonstracaoContabil> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DemonstracaoContabil update(
		DemonstracaoContabil demonstracaoContabil) {

		return getPersistence().update(demonstracaoContabil);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DemonstracaoContabil update(
		DemonstracaoContabil demonstracaoContabil,
		ServiceContext serviceContext) {

		return getPersistence().update(demonstracaoContabil, serviceContext);
	}

	/**
	 * Returns all the demonstracao contabils where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching demonstracao contabils
	 */
	public static List<DemonstracaoContabil> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the demonstracao contabils where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @return the range of matching demonstracao contabils
	 */
	public static List<DemonstracaoContabil> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the demonstracao contabils where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demonstracao contabils
	 */
	public static List<DemonstracaoContabil> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DemonstracaoContabil> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the demonstracao contabils where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demonstracao contabils
	 */
	public static List<DemonstracaoContabil> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DemonstracaoContabil> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first demonstracao contabil in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao contabil
	 * @throws NoSuchDemonstracaoContabilException if a matching demonstracao contabil could not be found
	 */
	public static DemonstracaoContabil findByUuid_First(
			String uuid,
			OrderByComparator<DemonstracaoContabil> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemonstracaoContabilException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first demonstracao contabil in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao contabil, or <code>null</code> if a matching demonstracao contabil could not be found
	 */
	public static DemonstracaoContabil fetchByUuid_First(
		String uuid,
		OrderByComparator<DemonstracaoContabil> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last demonstracao contabil in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao contabil
	 * @throws NoSuchDemonstracaoContabilException if a matching demonstracao contabil could not be found
	 */
	public static DemonstracaoContabil findByUuid_Last(
			String uuid,
			OrderByComparator<DemonstracaoContabil> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemonstracaoContabilException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last demonstracao contabil in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao contabil, or <code>null</code> if a matching demonstracao contabil could not be found
	 */
	public static DemonstracaoContabil fetchByUuid_Last(
		String uuid,
		OrderByComparator<DemonstracaoContabil> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the demonstracao contabils before and after the current demonstracao contabil in the ordered set where uuid = &#63;.
	 *
	 * @param demonstracaoId the primary key of the current demonstracao contabil
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demonstracao contabil
	 * @throws NoSuchDemonstracaoContabilException if a demonstracao contabil with the primary key could not be found
	 */
	public static DemonstracaoContabil[] findByUuid_PrevAndNext(
			long demonstracaoId, String uuid,
			OrderByComparator<DemonstracaoContabil> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemonstracaoContabilException {

		return getPersistence().findByUuid_PrevAndNext(
			demonstracaoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the demonstracao contabils where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of demonstracao contabils where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching demonstracao contabils
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the demonstracao contabils where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching demonstracao contabils
	 */
	public static List<DemonstracaoContabil> findByPropostaId(long propostaId) {
		return getPersistence().findByPropostaId(propostaId);
	}

	/**
	 * Returns a range of all the demonstracao contabils where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @return the range of matching demonstracao contabils
	 */
	public static List<DemonstracaoContabil> findByPropostaId(
		long propostaId, int start, int end) {

		return getPersistence().findByPropostaId(propostaId, start, end);
	}

	/**
	 * Returns an ordered range of all the demonstracao contabils where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demonstracao contabils
	 */
	public static List<DemonstracaoContabil> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<DemonstracaoContabil> orderByComparator) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the demonstracao contabils where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demonstracao contabils
	 */
	public static List<DemonstracaoContabil> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<DemonstracaoContabil> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first demonstracao contabil in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao contabil
	 * @throws NoSuchDemonstracaoContabilException if a matching demonstracao contabil could not be found
	 */
	public static DemonstracaoContabil findByPropostaId_First(
			long propostaId,
			OrderByComparator<DemonstracaoContabil> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemonstracaoContabilException {

		return getPersistence().findByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the first demonstracao contabil in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao contabil, or <code>null</code> if a matching demonstracao contabil could not be found
	 */
	public static DemonstracaoContabil fetchByPropostaId_First(
		long propostaId,
		OrderByComparator<DemonstracaoContabil> orderByComparator) {

		return getPersistence().fetchByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last demonstracao contabil in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao contabil
	 * @throws NoSuchDemonstracaoContabilException if a matching demonstracao contabil could not be found
	 */
	public static DemonstracaoContabil findByPropostaId_Last(
			long propostaId,
			OrderByComparator<DemonstracaoContabil> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemonstracaoContabilException {

		return getPersistence().findByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last demonstracao contabil in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao contabil, or <code>null</code> if a matching demonstracao contabil could not be found
	 */
	public static DemonstracaoContabil fetchByPropostaId_Last(
		long propostaId,
		OrderByComparator<DemonstracaoContabil> orderByComparator) {

		return getPersistence().fetchByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the demonstracao contabils before and after the current demonstracao contabil in the ordered set where propostaId = &#63;.
	 *
	 * @param demonstracaoId the primary key of the current demonstracao contabil
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demonstracao contabil
	 * @throws NoSuchDemonstracaoContabilException if a demonstracao contabil with the primary key could not be found
	 */
	public static DemonstracaoContabil[] findByPropostaId_PrevAndNext(
			long demonstracaoId, long propostaId,
			OrderByComparator<DemonstracaoContabil> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemonstracaoContabilException {

		return getPersistence().findByPropostaId_PrevAndNext(
			demonstracaoId, propostaId, orderByComparator);
	}

	/**
	 * Removes all the demonstracao contabils where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public static void removeByPropostaId(long propostaId) {
		getPersistence().removeByPropostaId(propostaId);
	}

	/**
	 * Returns the number of demonstracao contabils where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching demonstracao contabils
	 */
	public static int countByPropostaId(long propostaId) {
		return getPersistence().countByPropostaId(propostaId);
	}

	/**
	 * Caches the demonstracao contabil in the entity cache if it is enabled.
	 *
	 * @param demonstracaoContabil the demonstracao contabil
	 */
	public static void cacheResult(DemonstracaoContabil demonstracaoContabil) {
		getPersistence().cacheResult(demonstracaoContabil);
	}

	/**
	 * Caches the demonstracao contabils in the entity cache if it is enabled.
	 *
	 * @param demonstracaoContabils the demonstracao contabils
	 */
	public static void cacheResult(
		List<DemonstracaoContabil> demonstracaoContabils) {

		getPersistence().cacheResult(demonstracaoContabils);
	}

	/**
	 * Creates a new demonstracao contabil with the primary key. Does not add the demonstracao contabil to the database.
	 *
	 * @param demonstracaoId the primary key for the new demonstracao contabil
	 * @return the new demonstracao contabil
	 */
	public static DemonstracaoContabil create(long demonstracaoId) {
		return getPersistence().create(demonstracaoId);
	}

	/**
	 * Removes the demonstracao contabil with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param demonstracaoId the primary key of the demonstracao contabil
	 * @return the demonstracao contabil that was removed
	 * @throws NoSuchDemonstracaoContabilException if a demonstracao contabil with the primary key could not be found
	 */
	public static DemonstracaoContabil remove(long demonstracaoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemonstracaoContabilException {

		return getPersistence().remove(demonstracaoId);
	}

	public static DemonstracaoContabil updateImpl(
		DemonstracaoContabil demonstracaoContabil) {

		return getPersistence().updateImpl(demonstracaoContabil);
	}

	/**
	 * Returns the demonstracao contabil with the primary key or throws a <code>NoSuchDemonstracaoContabilException</code> if it could not be found.
	 *
	 * @param demonstracaoId the primary key of the demonstracao contabil
	 * @return the demonstracao contabil
	 * @throws NoSuchDemonstracaoContabilException if a demonstracao contabil with the primary key could not be found
	 */
	public static DemonstracaoContabil findByPrimaryKey(long demonstracaoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDemonstracaoContabilException {

		return getPersistence().findByPrimaryKey(demonstracaoId);
	}

	/**
	 * Returns the demonstracao contabil with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param demonstracaoId the primary key of the demonstracao contabil
	 * @return the demonstracao contabil, or <code>null</code> if a demonstracao contabil with the primary key could not be found
	 */
	public static DemonstracaoContabil fetchByPrimaryKey(long demonstracaoId) {
		return getPersistence().fetchByPrimaryKey(demonstracaoId);
	}

	/**
	 * Returns all the demonstracao contabils.
	 *
	 * @return the demonstracao contabils
	 */
	public static List<DemonstracaoContabil> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the demonstracao contabils.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @return the range of demonstracao contabils
	 */
	public static List<DemonstracaoContabil> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the demonstracao contabils.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of demonstracao contabils
	 */
	public static List<DemonstracaoContabil> findAll(
		int start, int end,
		OrderByComparator<DemonstracaoContabil> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the demonstracao contabils.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of demonstracao contabils
	 */
	public static List<DemonstracaoContabil> findAll(
		int start, int end,
		OrderByComparator<DemonstracaoContabil> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the demonstracao contabils from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of demonstracao contabils.
	 *
	 * @return the number of demonstracao contabils
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DemonstracaoContabilPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		DemonstracaoContabilPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile DemonstracaoContabilPersistence _persistence;

}