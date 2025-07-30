/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the bens direitos laudo service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.BensDireitosLaudoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BensDireitosLaudoPersistence
 * @generated
 */
public class BensDireitosLaudoUtil {

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
	public static void clearCache(BensDireitosLaudo bensDireitosLaudo) {
		getPersistence().clearCache(bensDireitosLaudo);
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
	public static Map<Serializable, BensDireitosLaudo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<BensDireitosLaudo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BensDireitosLaudo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BensDireitosLaudo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BensDireitosLaudo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BensDireitosLaudo update(
		BensDireitosLaudo bensDireitosLaudo) {

		return getPersistence().update(bensDireitosLaudo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BensDireitosLaudo update(
		BensDireitosLaudo bensDireitosLaudo, ServiceContext serviceContext) {

		return getPersistence().update(bensDireitosLaudo, serviceContext);
	}

	/**
	 * Returns all the bens direitos laudos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching bens direitos laudos
	 */
	public static List<BensDireitosLaudo> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the bens direitos laudos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @return the range of matching bens direitos laudos
	 */
	public static List<BensDireitosLaudo> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the bens direitos laudos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bens direitos laudos
	 */
	public static List<BensDireitosLaudo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BensDireitosLaudo> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bens direitos laudos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bens direitos laudos
	 */
	public static List<BensDireitosLaudo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BensDireitosLaudo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first bens direitos laudo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos laudo
	 * @throws NoSuchBensDireitosLaudoException if a matching bens direitos laudo could not be found
	 */
	public static BensDireitosLaudo findByUuid_First(
			String uuid, OrderByComparator<BensDireitosLaudo> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBensDireitosLaudoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first bens direitos laudo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos laudo, or <code>null</code> if a matching bens direitos laudo could not be found
	 */
	public static BensDireitosLaudo fetchByUuid_First(
		String uuid, OrderByComparator<BensDireitosLaudo> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last bens direitos laudo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos laudo
	 * @throws NoSuchBensDireitosLaudoException if a matching bens direitos laudo could not be found
	 */
	public static BensDireitosLaudo findByUuid_Last(
			String uuid, OrderByComparator<BensDireitosLaudo> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBensDireitosLaudoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last bens direitos laudo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos laudo, or <code>null</code> if a matching bens direitos laudo could not be found
	 */
	public static BensDireitosLaudo fetchByUuid_Last(
		String uuid, OrderByComparator<BensDireitosLaudo> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the bens direitos laudos before and after the current bens direitos laudo in the ordered set where uuid = &#63;.
	 *
	 * @param bensDireitosLaudoId the primary key of the current bens direitos laudo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bens direitos laudo
	 * @throws NoSuchBensDireitosLaudoException if a bens direitos laudo with the primary key could not be found
	 */
	public static BensDireitosLaudo[] findByUuid_PrevAndNext(
			long bensDireitosLaudoId, String uuid,
			OrderByComparator<BensDireitosLaudo> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBensDireitosLaudoException {

		return getPersistence().findByUuid_PrevAndNext(
			bensDireitosLaudoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the bens direitos laudos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of bens direitos laudos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching bens direitos laudos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the bens direitos laudo in the entity cache if it is enabled.
	 *
	 * @param bensDireitosLaudo the bens direitos laudo
	 */
	public static void cacheResult(BensDireitosLaudo bensDireitosLaudo) {
		getPersistence().cacheResult(bensDireitosLaudo);
	}

	/**
	 * Caches the bens direitos laudos in the entity cache if it is enabled.
	 *
	 * @param bensDireitosLaudos the bens direitos laudos
	 */
	public static void cacheResult(List<BensDireitosLaudo> bensDireitosLaudos) {
		getPersistence().cacheResult(bensDireitosLaudos);
	}

	/**
	 * Creates a new bens direitos laudo with the primary key. Does not add the bens direitos laudo to the database.
	 *
	 * @param bensDireitosLaudoId the primary key for the new bens direitos laudo
	 * @return the new bens direitos laudo
	 */
	public static BensDireitosLaudo create(long bensDireitosLaudoId) {
		return getPersistence().create(bensDireitosLaudoId);
	}

	/**
	 * Removes the bens direitos laudo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bensDireitosLaudoId the primary key of the bens direitos laudo
	 * @return the bens direitos laudo that was removed
	 * @throws NoSuchBensDireitosLaudoException if a bens direitos laudo with the primary key could not be found
	 */
	public static BensDireitosLaudo remove(long bensDireitosLaudoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBensDireitosLaudoException {

		return getPersistence().remove(bensDireitosLaudoId);
	}

	public static BensDireitosLaudo updateImpl(
		BensDireitosLaudo bensDireitosLaudo) {

		return getPersistence().updateImpl(bensDireitosLaudo);
	}

	/**
	 * Returns the bens direitos laudo with the primary key or throws a <code>NoSuchBensDireitosLaudoException</code> if it could not be found.
	 *
	 * @param bensDireitosLaudoId the primary key of the bens direitos laudo
	 * @return the bens direitos laudo
	 * @throws NoSuchBensDireitosLaudoException if a bens direitos laudo with the primary key could not be found
	 */
	public static BensDireitosLaudo findByPrimaryKey(long bensDireitosLaudoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBensDireitosLaudoException {

		return getPersistence().findByPrimaryKey(bensDireitosLaudoId);
	}

	/**
	 * Returns the bens direitos laudo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bensDireitosLaudoId the primary key of the bens direitos laudo
	 * @return the bens direitos laudo, or <code>null</code> if a bens direitos laudo with the primary key could not be found
	 */
	public static BensDireitosLaudo fetchByPrimaryKey(
		long bensDireitosLaudoId) {

		return getPersistence().fetchByPrimaryKey(bensDireitosLaudoId);
	}

	/**
	 * Returns all the bens direitos laudos.
	 *
	 * @return the bens direitos laudos
	 */
	public static List<BensDireitosLaudo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the bens direitos laudos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @return the range of bens direitos laudos
	 */
	public static List<BensDireitosLaudo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the bens direitos laudos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bens direitos laudos
	 */
	public static List<BensDireitosLaudo> findAll(
		int start, int end,
		OrderByComparator<BensDireitosLaudo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bens direitos laudos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bens direitos laudos
	 */
	public static List<BensDireitosLaudo> findAll(
		int start, int end,
		OrderByComparator<BensDireitosLaudo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the bens direitos laudos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of bens direitos laudos.
	 *
	 * @return the number of bens direitos laudos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BensDireitosLaudoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		BensDireitosLaudoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile BensDireitosLaudoPersistence _persistence;

}