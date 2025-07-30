/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the identificacao debitos service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.IdentificacaoDebitosPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IdentificacaoDebitosPersistence
 * @generated
 */
public class IdentificacaoDebitosUtil {

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
	public static void clearCache(IdentificacaoDebitos identificacaoDebitos) {
		getPersistence().clearCache(identificacaoDebitos);
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
	public static Map<Serializable, IdentificacaoDebitos> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<IdentificacaoDebitos> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<IdentificacaoDebitos> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<IdentificacaoDebitos> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<IdentificacaoDebitos> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static IdentificacaoDebitos update(
		IdentificacaoDebitos identificacaoDebitos) {

		return getPersistence().update(identificacaoDebitos);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static IdentificacaoDebitos update(
		IdentificacaoDebitos identificacaoDebitos,
		ServiceContext serviceContext) {

		return getPersistence().update(identificacaoDebitos, serviceContext);
	}

	/**
	 * Returns all the identificacao debitoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching identificacao debitoses
	 */
	public static List<IdentificacaoDebitos> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the identificacao debitoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @return the range of matching identificacao debitoses
	 */
	public static List<IdentificacaoDebitos> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the identificacao debitoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching identificacao debitoses
	 */
	public static List<IdentificacaoDebitos> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<IdentificacaoDebitos> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the identificacao debitoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching identificacao debitoses
	 */
	public static List<IdentificacaoDebitos> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<IdentificacaoDebitos> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first identificacao debitos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a matching identificacao debitos could not be found
	 */
	public static IdentificacaoDebitos findByUuid_First(
			String uuid,
			OrderByComparator<IdentificacaoDebitos> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchIdentificacaoDebitosException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first identificacao debitos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching identificacao debitos, or <code>null</code> if a matching identificacao debitos could not be found
	 */
	public static IdentificacaoDebitos fetchByUuid_First(
		String uuid,
		OrderByComparator<IdentificacaoDebitos> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last identificacao debitos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a matching identificacao debitos could not be found
	 */
	public static IdentificacaoDebitos findByUuid_Last(
			String uuid,
			OrderByComparator<IdentificacaoDebitos> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchIdentificacaoDebitosException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last identificacao debitos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching identificacao debitos, or <code>null</code> if a matching identificacao debitos could not be found
	 */
	public static IdentificacaoDebitos fetchByUuid_Last(
		String uuid,
		OrderByComparator<IdentificacaoDebitos> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the identificacao debitoses before and after the current identificacao debitos in the ordered set where uuid = &#63;.
	 *
	 * @param identificacaoDebitosId the primary key of the current identificacao debitos
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a identificacao debitos with the primary key could not be found
	 */
	public static IdentificacaoDebitos[] findByUuid_PrevAndNext(
			long identificacaoDebitosId, String uuid,
			OrderByComparator<IdentificacaoDebitos> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchIdentificacaoDebitosException {

		return getPersistence().findByUuid_PrevAndNext(
			identificacaoDebitosId, uuid, orderByComparator);
	}

	/**
	 * Removes all the identificacao debitoses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of identificacao debitoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching identificacao debitoses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the identificacao debitoses where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @return the matching identificacao debitoses
	 */
	public static List<IdentificacaoDebitos> findByFundamentacaoId(
		long fundamentacaoId) {

		return getPersistence().findByFundamentacaoId(fundamentacaoId);
	}

	/**
	 * Returns a range of all the identificacao debitoses where fundamentacaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @return the range of matching identificacao debitoses
	 */
	public static List<IdentificacaoDebitos> findByFundamentacaoId(
		long fundamentacaoId, int start, int end) {

		return getPersistence().findByFundamentacaoId(
			fundamentacaoId, start, end);
	}

	/**
	 * Returns an ordered range of all the identificacao debitoses where fundamentacaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching identificacao debitoses
	 */
	public static List<IdentificacaoDebitos> findByFundamentacaoId(
		long fundamentacaoId, int start, int end,
		OrderByComparator<IdentificacaoDebitos> orderByComparator) {

		return getPersistence().findByFundamentacaoId(
			fundamentacaoId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the identificacao debitoses where fundamentacaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching identificacao debitoses
	 */
	public static List<IdentificacaoDebitos> findByFundamentacaoId(
		long fundamentacaoId, int start, int end,
		OrderByComparator<IdentificacaoDebitos> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByFundamentacaoId(
			fundamentacaoId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first identificacao debitos in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a matching identificacao debitos could not be found
	 */
	public static IdentificacaoDebitos findByFundamentacaoId_First(
			long fundamentacaoId,
			OrderByComparator<IdentificacaoDebitos> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchIdentificacaoDebitosException {

		return getPersistence().findByFundamentacaoId_First(
			fundamentacaoId, orderByComparator);
	}

	/**
	 * Returns the first identificacao debitos in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching identificacao debitos, or <code>null</code> if a matching identificacao debitos could not be found
	 */
	public static IdentificacaoDebitos fetchByFundamentacaoId_First(
		long fundamentacaoId,
		OrderByComparator<IdentificacaoDebitos> orderByComparator) {

		return getPersistence().fetchByFundamentacaoId_First(
			fundamentacaoId, orderByComparator);
	}

	/**
	 * Returns the last identificacao debitos in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a matching identificacao debitos could not be found
	 */
	public static IdentificacaoDebitos findByFundamentacaoId_Last(
			long fundamentacaoId,
			OrderByComparator<IdentificacaoDebitos> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchIdentificacaoDebitosException {

		return getPersistence().findByFundamentacaoId_Last(
			fundamentacaoId, orderByComparator);
	}

	/**
	 * Returns the last identificacao debitos in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching identificacao debitos, or <code>null</code> if a matching identificacao debitos could not be found
	 */
	public static IdentificacaoDebitos fetchByFundamentacaoId_Last(
		long fundamentacaoId,
		OrderByComparator<IdentificacaoDebitos> orderByComparator) {

		return getPersistence().fetchByFundamentacaoId_Last(
			fundamentacaoId, orderByComparator);
	}

	/**
	 * Returns the identificacao debitoses before and after the current identificacao debitos in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param identificacaoDebitosId the primary key of the current identificacao debitos
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a identificacao debitos with the primary key could not be found
	 */
	public static IdentificacaoDebitos[] findByFundamentacaoId_PrevAndNext(
			long identificacaoDebitosId, long fundamentacaoId,
			OrderByComparator<IdentificacaoDebitos> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchIdentificacaoDebitosException {

		return getPersistence().findByFundamentacaoId_PrevAndNext(
			identificacaoDebitosId, fundamentacaoId, orderByComparator);
	}

	/**
	 * Removes all the identificacao debitoses where fundamentacaoId = &#63; from the database.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 */
	public static void removeByFundamentacaoId(long fundamentacaoId) {
		getPersistence().removeByFundamentacaoId(fundamentacaoId);
	}

	/**
	 * Returns the number of identificacao debitoses where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @return the number of matching identificacao debitoses
	 */
	public static int countByFundamentacaoId(long fundamentacaoId) {
		return getPersistence().countByFundamentacaoId(fundamentacaoId);
	}

	/**
	 * Caches the identificacao debitos in the entity cache if it is enabled.
	 *
	 * @param identificacaoDebitos the identificacao debitos
	 */
	public static void cacheResult(IdentificacaoDebitos identificacaoDebitos) {
		getPersistence().cacheResult(identificacaoDebitos);
	}

	/**
	 * Caches the identificacao debitoses in the entity cache if it is enabled.
	 *
	 * @param identificacaoDebitoses the identificacao debitoses
	 */
	public static void cacheResult(
		List<IdentificacaoDebitos> identificacaoDebitoses) {

		getPersistence().cacheResult(identificacaoDebitoses);
	}

	/**
	 * Creates a new identificacao debitos with the primary key. Does not add the identificacao debitos to the database.
	 *
	 * @param identificacaoDebitosId the primary key for the new identificacao debitos
	 * @return the new identificacao debitos
	 */
	public static IdentificacaoDebitos create(long identificacaoDebitosId) {
		return getPersistence().create(identificacaoDebitosId);
	}

	/**
	 * Removes the identificacao debitos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param identificacaoDebitosId the primary key of the identificacao debitos
	 * @return the identificacao debitos that was removed
	 * @throws NoSuchIdentificacaoDebitosException if a identificacao debitos with the primary key could not be found
	 */
	public static IdentificacaoDebitos remove(long identificacaoDebitosId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchIdentificacaoDebitosException {

		return getPersistence().remove(identificacaoDebitosId);
	}

	public static IdentificacaoDebitos updateImpl(
		IdentificacaoDebitos identificacaoDebitos) {

		return getPersistence().updateImpl(identificacaoDebitos);
	}

	/**
	 * Returns the identificacao debitos with the primary key or throws a <code>NoSuchIdentificacaoDebitosException</code> if it could not be found.
	 *
	 * @param identificacaoDebitosId the primary key of the identificacao debitos
	 * @return the identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a identificacao debitos with the primary key could not be found
	 */
	public static IdentificacaoDebitos findByPrimaryKey(
			long identificacaoDebitosId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchIdentificacaoDebitosException {

		return getPersistence().findByPrimaryKey(identificacaoDebitosId);
	}

	/**
	 * Returns the identificacao debitos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param identificacaoDebitosId the primary key of the identificacao debitos
	 * @return the identificacao debitos, or <code>null</code> if a identificacao debitos with the primary key could not be found
	 */
	public static IdentificacaoDebitos fetchByPrimaryKey(
		long identificacaoDebitosId) {

		return getPersistence().fetchByPrimaryKey(identificacaoDebitosId);
	}

	/**
	 * Returns all the identificacao debitoses.
	 *
	 * @return the identificacao debitoses
	 */
	public static List<IdentificacaoDebitos> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the identificacao debitoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @return the range of identificacao debitoses
	 */
	public static List<IdentificacaoDebitos> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the identificacao debitoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of identificacao debitoses
	 */
	public static List<IdentificacaoDebitos> findAll(
		int start, int end,
		OrderByComparator<IdentificacaoDebitos> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the identificacao debitoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of identificacao debitoses
	 */
	public static List<IdentificacaoDebitos> findAll(
		int start, int end,
		OrderByComparator<IdentificacaoDebitos> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the identificacao debitoses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of identificacao debitoses.
	 *
	 * @return the number of identificacao debitoses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static IdentificacaoDebitosPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		IdentificacaoDebitosPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile IdentificacaoDebitosPersistence _persistence;

}