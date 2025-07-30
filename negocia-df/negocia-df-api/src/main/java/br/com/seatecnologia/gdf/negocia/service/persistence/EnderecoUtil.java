/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.Endereco;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the endereco service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.EnderecoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EnderecoPersistence
 * @generated
 */
public class EnderecoUtil {

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
	public static void clearCache(Endereco endereco) {
		getPersistence().clearCache(endereco);
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
	public static Map<Serializable, Endereco> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Endereco> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Endereco> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Endereco> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Endereco> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Endereco update(Endereco endereco) {
		return getPersistence().update(endereco);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Endereco update(
		Endereco endereco, ServiceContext serviceContext) {

		return getPersistence().update(endereco, serviceContext);
	}

	/**
	 * Returns all the enderecos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching enderecos
	 */
	public static List<Endereco> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the enderecos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @return the range of matching enderecos
	 */
	public static List<Endereco> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the enderecos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching enderecos
	 */
	public static List<Endereco> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Endereco> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the enderecos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching enderecos
	 */
	public static List<Endereco> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Endereco> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first endereco in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching endereco
	 * @throws NoSuchEnderecoException if a matching endereco could not be found
	 */
	public static Endereco findByUuid_First(
			String uuid, OrderByComparator<Endereco> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEnderecoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first endereco in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching endereco, or <code>null</code> if a matching endereco could not be found
	 */
	public static Endereco fetchByUuid_First(
		String uuid, OrderByComparator<Endereco> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last endereco in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching endereco
	 * @throws NoSuchEnderecoException if a matching endereco could not be found
	 */
	public static Endereco findByUuid_Last(
			String uuid, OrderByComparator<Endereco> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEnderecoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last endereco in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching endereco, or <code>null</code> if a matching endereco could not be found
	 */
	public static Endereco fetchByUuid_Last(
		String uuid, OrderByComparator<Endereco> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the enderecos before and after the current endereco in the ordered set where uuid = &#63;.
	 *
	 * @param enderecoId the primary key of the current endereco
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next endereco
	 * @throws NoSuchEnderecoException if a endereco with the primary key could not be found
	 */
	public static Endereco[] findByUuid_PrevAndNext(
			long enderecoId, String uuid,
			OrderByComparator<Endereco> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEnderecoException {

		return getPersistence().findByUuid_PrevAndNext(
			enderecoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the enderecos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of enderecos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching enderecos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the endereco in the entity cache if it is enabled.
	 *
	 * @param endereco the endereco
	 */
	public static void cacheResult(Endereco endereco) {
		getPersistence().cacheResult(endereco);
	}

	/**
	 * Caches the enderecos in the entity cache if it is enabled.
	 *
	 * @param enderecos the enderecos
	 */
	public static void cacheResult(List<Endereco> enderecos) {
		getPersistence().cacheResult(enderecos);
	}

	/**
	 * Creates a new endereco with the primary key. Does not add the endereco to the database.
	 *
	 * @param enderecoId the primary key for the new endereco
	 * @return the new endereco
	 */
	public static Endereco create(long enderecoId) {
		return getPersistence().create(enderecoId);
	}

	/**
	 * Removes the endereco with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param enderecoId the primary key of the endereco
	 * @return the endereco that was removed
	 * @throws NoSuchEnderecoException if a endereco with the primary key could not be found
	 */
	public static Endereco remove(long enderecoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEnderecoException {

		return getPersistence().remove(enderecoId);
	}

	public static Endereco updateImpl(Endereco endereco) {
		return getPersistence().updateImpl(endereco);
	}

	/**
	 * Returns the endereco with the primary key or throws a <code>NoSuchEnderecoException</code> if it could not be found.
	 *
	 * @param enderecoId the primary key of the endereco
	 * @return the endereco
	 * @throws NoSuchEnderecoException if a endereco with the primary key could not be found
	 */
	public static Endereco findByPrimaryKey(long enderecoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchEnderecoException {

		return getPersistence().findByPrimaryKey(enderecoId);
	}

	/**
	 * Returns the endereco with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param enderecoId the primary key of the endereco
	 * @return the endereco, or <code>null</code> if a endereco with the primary key could not be found
	 */
	public static Endereco fetchByPrimaryKey(long enderecoId) {
		return getPersistence().fetchByPrimaryKey(enderecoId);
	}

	/**
	 * Returns all the enderecos.
	 *
	 * @return the enderecos
	 */
	public static List<Endereco> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the enderecos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @return the range of enderecos
	 */
	public static List<Endereco> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the enderecos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of enderecos
	 */
	public static List<Endereco> findAll(
		int start, int end, OrderByComparator<Endereco> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the enderecos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of enderecos
	 */
	public static List<Endereco> findAll(
		int start, int end, OrderByComparator<Endereco> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the enderecos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of enderecos.
	 *
	 * @return the number of enderecos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EnderecoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(EnderecoPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile EnderecoPersistence _persistence;

}