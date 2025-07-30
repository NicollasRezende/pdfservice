/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.Encargo;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the encargo service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.EncargoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EncargoPersistence
 * @generated
 */
public class EncargoUtil {

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
	public static void clearCache(Encargo encargo) {
		getPersistence().clearCache(encargo);
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
	public static Map<Serializable, Encargo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Encargo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Encargo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Encargo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Encargo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Encargo update(Encargo encargo) {
		return getPersistence().update(encargo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Encargo update(
		Encargo encargo, ServiceContext serviceContext) {

		return getPersistence().update(encargo, serviceContext);
	}

	/**
	 * Returns all the encargos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching encargos
	 */
	public static List<Encargo> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the encargos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @return the range of matching encargos
	 */
	public static List<Encargo> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the encargos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching encargos
	 */
	public static List<Encargo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Encargo> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the encargos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching encargos
	 */
	public static List<Encargo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Encargo> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first encargo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching encargo
	 * @throws NoSuchEncargoException if a matching encargo could not be found
	 */
	public static Encargo findByUuid_First(
			String uuid, OrderByComparator<Encargo> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEncargoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first encargo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching encargo, or <code>null</code> if a matching encargo could not be found
	 */
	public static Encargo fetchByUuid_First(
		String uuid, OrderByComparator<Encargo> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last encargo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching encargo
	 * @throws NoSuchEncargoException if a matching encargo could not be found
	 */
	public static Encargo findByUuid_Last(
			String uuid, OrderByComparator<Encargo> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEncargoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last encargo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching encargo, or <code>null</code> if a matching encargo could not be found
	 */
	public static Encargo fetchByUuid_Last(
		String uuid, OrderByComparator<Encargo> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the encargos before and after the current encargo in the ordered set where uuid = &#63;.
	 *
	 * @param encargoId the primary key of the current encargo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next encargo
	 * @throws NoSuchEncargoException if a encargo with the primary key could not be found
	 */
	public static Encargo[] findByUuid_PrevAndNext(
			long encargoId, String uuid,
			OrderByComparator<Encargo> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEncargoException {

		return getPersistence().findByUuid_PrevAndNext(
			encargoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the encargos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of encargos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching encargos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the encargos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching encargos
	 */
	public static List<Encargo> findByPropostaId(long propostaId) {
		return getPersistence().findByPropostaId(propostaId);
	}

	/**
	 * Returns a range of all the encargos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @return the range of matching encargos
	 */
	public static List<Encargo> findByPropostaId(
		long propostaId, int start, int end) {

		return getPersistence().findByPropostaId(propostaId, start, end);
	}

	/**
	 * Returns an ordered range of all the encargos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching encargos
	 */
	public static List<Encargo> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<Encargo> orderByComparator) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the encargos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching encargos
	 */
	public static List<Encargo> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<Encargo> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first encargo in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching encargo
	 * @throws NoSuchEncargoException if a matching encargo could not be found
	 */
	public static Encargo findByPropostaId_First(
			long propostaId, OrderByComparator<Encargo> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEncargoException {

		return getPersistence().findByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the first encargo in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching encargo, or <code>null</code> if a matching encargo could not be found
	 */
	public static Encargo fetchByPropostaId_First(
		long propostaId, OrderByComparator<Encargo> orderByComparator) {

		return getPersistence().fetchByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last encargo in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching encargo
	 * @throws NoSuchEncargoException if a matching encargo could not be found
	 */
	public static Encargo findByPropostaId_Last(
			long propostaId, OrderByComparator<Encargo> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEncargoException {

		return getPersistence().findByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last encargo in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching encargo, or <code>null</code> if a matching encargo could not be found
	 */
	public static Encargo fetchByPropostaId_Last(
		long propostaId, OrderByComparator<Encargo> orderByComparator) {

		return getPersistence().fetchByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the encargos before and after the current encargo in the ordered set where propostaId = &#63;.
	 *
	 * @param encargoId the primary key of the current encargo
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next encargo
	 * @throws NoSuchEncargoException if a encargo with the primary key could not be found
	 */
	public static Encargo[] findByPropostaId_PrevAndNext(
			long encargoId, long propostaId,
			OrderByComparator<Encargo> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEncargoException {

		return getPersistence().findByPropostaId_PrevAndNext(
			encargoId, propostaId, orderByComparator);
	}

	/**
	 * Removes all the encargos where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public static void removeByPropostaId(long propostaId) {
		getPersistence().removeByPropostaId(propostaId);
	}

	/**
	 * Returns the number of encargos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching encargos
	 */
	public static int countByPropostaId(long propostaId) {
		return getPersistence().countByPropostaId(propostaId);
	}

	/**
	 * Caches the encargo in the entity cache if it is enabled.
	 *
	 * @param encargo the encargo
	 */
	public static void cacheResult(Encargo encargo) {
		getPersistence().cacheResult(encargo);
	}

	/**
	 * Caches the encargos in the entity cache if it is enabled.
	 *
	 * @param encargos the encargos
	 */
	public static void cacheResult(List<Encargo> encargos) {
		getPersistence().cacheResult(encargos);
	}

	/**
	 * Creates a new encargo with the primary key. Does not add the encargo to the database.
	 *
	 * @param encargoId the primary key for the new encargo
	 * @return the new encargo
	 */
	public static Encargo create(long encargoId) {
		return getPersistence().create(encargoId);
	}

	/**
	 * Removes the encargo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param encargoId the primary key of the encargo
	 * @return the encargo that was removed
	 * @throws NoSuchEncargoException if a encargo with the primary key could not be found
	 */
	public static Encargo remove(long encargoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEncargoException {

		return getPersistence().remove(encargoId);
	}

	public static Encargo updateImpl(Encargo encargo) {
		return getPersistence().updateImpl(encargo);
	}

	/**
	 * Returns the encargo with the primary key or throws a <code>NoSuchEncargoException</code> if it could not be found.
	 *
	 * @param encargoId the primary key of the encargo
	 * @return the encargo
	 * @throws NoSuchEncargoException if a encargo with the primary key could not be found
	 */
	public static Encargo findByPrimaryKey(long encargoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEncargoException {

		return getPersistence().findByPrimaryKey(encargoId);
	}

	/**
	 * Returns the encargo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param encargoId the primary key of the encargo
	 * @return the encargo, or <code>null</code> if a encargo with the primary key could not be found
	 */
	public static Encargo fetchByPrimaryKey(long encargoId) {
		return getPersistence().fetchByPrimaryKey(encargoId);
	}

	/**
	 * Returns all the encargos.
	 *
	 * @return the encargos
	 */
	public static List<Encargo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the encargos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @return the range of encargos
	 */
	public static List<Encargo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the encargos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of encargos
	 */
	public static List<Encargo> findAll(
		int start, int end, OrderByComparator<Encargo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the encargos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of encargos
	 */
	public static List<Encargo> findAll(
		int start, int end, OrderByComparator<Encargo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the encargos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of encargos.
	 *
	 * @return the number of encargos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EncargoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(EncargoPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile EncargoPersistence _persistence;

}