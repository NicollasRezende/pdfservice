/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.DadosRegistro;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the dados registro service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.DadosRegistroPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DadosRegistroPersistence
 * @generated
 */
public class DadosRegistroUtil {

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
	public static void clearCache(DadosRegistro dadosRegistro) {
		getPersistence().clearCache(dadosRegistro);
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
	public static Map<Serializable, DadosRegistro> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DadosRegistro> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DadosRegistro> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DadosRegistro> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DadosRegistro> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DadosRegistro update(DadosRegistro dadosRegistro) {
		return getPersistence().update(dadosRegistro);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DadosRegistro update(
		DadosRegistro dadosRegistro, ServiceContext serviceContext) {

		return getPersistence().update(dadosRegistro, serviceContext);
	}

	/**
	 * Returns all the dados registros where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching dados registros
	 */
	public static List<DadosRegistro> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the dados registros where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @return the range of matching dados registros
	 */
	public static List<DadosRegistro> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the dados registros where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dados registros
	 */
	public static List<DadosRegistro> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DadosRegistro> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dados registros where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dados registros
	 */
	public static List<DadosRegistro> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DadosRegistro> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dados registro in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados registro
	 * @throws NoSuchDadosRegistroException if a matching dados registro could not be found
	 */
	public static DadosRegistro findByUuid_First(
			String uuid, OrderByComparator<DadosRegistro> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosRegistroException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first dados registro in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados registro, or <code>null</code> if a matching dados registro could not be found
	 */
	public static DadosRegistro fetchByUuid_First(
		String uuid, OrderByComparator<DadosRegistro> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last dados registro in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados registro
	 * @throws NoSuchDadosRegistroException if a matching dados registro could not be found
	 */
	public static DadosRegistro findByUuid_Last(
			String uuid, OrderByComparator<DadosRegistro> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosRegistroException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last dados registro in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados registro, or <code>null</code> if a matching dados registro could not be found
	 */
	public static DadosRegistro fetchByUuid_Last(
		String uuid, OrderByComparator<DadosRegistro> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the dados registros before and after the current dados registro in the ordered set where uuid = &#63;.
	 *
	 * @param dadosRegistroId the primary key of the current dados registro
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dados registro
	 * @throws NoSuchDadosRegistroException if a dados registro with the primary key could not be found
	 */
	public static DadosRegistro[] findByUuid_PrevAndNext(
			long dadosRegistroId, String uuid,
			OrderByComparator<DadosRegistro> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosRegistroException {

		return getPersistence().findByUuid_PrevAndNext(
			dadosRegistroId, uuid, orderByComparator);
	}

	/**
	 * Removes all the dados registros where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of dados registros where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching dados registros
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the dados registro where garantiaId = &#63; or throws a <code>NoSuchDadosRegistroException</code> if it could not be found.
	 *
	 * @param garantiaId the garantia ID
	 * @return the matching dados registro
	 * @throws NoSuchDadosRegistroException if a matching dados registro could not be found
	 */
	public static DadosRegistro findByGarantiaId(long garantiaId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosRegistroException {

		return getPersistence().findByGarantiaId(garantiaId);
	}

	/**
	 * Returns the dados registro where garantiaId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param garantiaId the garantia ID
	 * @return the matching dados registro, or <code>null</code> if a matching dados registro could not be found
	 */
	public static DadosRegistro fetchByGarantiaId(long garantiaId) {
		return getPersistence().fetchByGarantiaId(garantiaId);
	}

	/**
	 * Returns the dados registro where garantiaId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param garantiaId the garantia ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dados registro, or <code>null</code> if a matching dados registro could not be found
	 */
	public static DadosRegistro fetchByGarantiaId(
		long garantiaId, boolean useFinderCache) {

		return getPersistence().fetchByGarantiaId(garantiaId, useFinderCache);
	}

	/**
	 * Removes the dados registro where garantiaId = &#63; from the database.
	 *
	 * @param garantiaId the garantia ID
	 * @return the dados registro that was removed
	 */
	public static DadosRegistro removeByGarantiaId(long garantiaId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosRegistroException {

		return getPersistence().removeByGarantiaId(garantiaId);
	}

	/**
	 * Returns the number of dados registros where garantiaId = &#63;.
	 *
	 * @param garantiaId the garantia ID
	 * @return the number of matching dados registros
	 */
	public static int countByGarantiaId(long garantiaId) {
		return getPersistence().countByGarantiaId(garantiaId);
	}

	/**
	 * Caches the dados registro in the entity cache if it is enabled.
	 *
	 * @param dadosRegistro the dados registro
	 */
	public static void cacheResult(DadosRegistro dadosRegistro) {
		getPersistence().cacheResult(dadosRegistro);
	}

	/**
	 * Caches the dados registros in the entity cache if it is enabled.
	 *
	 * @param dadosRegistros the dados registros
	 */
	public static void cacheResult(List<DadosRegistro> dadosRegistros) {
		getPersistence().cacheResult(dadosRegistros);
	}

	/**
	 * Creates a new dados registro with the primary key. Does not add the dados registro to the database.
	 *
	 * @param dadosRegistroId the primary key for the new dados registro
	 * @return the new dados registro
	 */
	public static DadosRegistro create(long dadosRegistroId) {
		return getPersistence().create(dadosRegistroId);
	}

	/**
	 * Removes the dados registro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dadosRegistroId the primary key of the dados registro
	 * @return the dados registro that was removed
	 * @throws NoSuchDadosRegistroException if a dados registro with the primary key could not be found
	 */
	public static DadosRegistro remove(long dadosRegistroId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosRegistroException {

		return getPersistence().remove(dadosRegistroId);
	}

	public static DadosRegistro updateImpl(DadosRegistro dadosRegistro) {
		return getPersistence().updateImpl(dadosRegistro);
	}

	/**
	 * Returns the dados registro with the primary key or throws a <code>NoSuchDadosRegistroException</code> if it could not be found.
	 *
	 * @param dadosRegistroId the primary key of the dados registro
	 * @return the dados registro
	 * @throws NoSuchDadosRegistroException if a dados registro with the primary key could not be found
	 */
	public static DadosRegistro findByPrimaryKey(long dadosRegistroId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosRegistroException {

		return getPersistence().findByPrimaryKey(dadosRegistroId);
	}

	/**
	 * Returns the dados registro with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dadosRegistroId the primary key of the dados registro
	 * @return the dados registro, or <code>null</code> if a dados registro with the primary key could not be found
	 */
	public static DadosRegistro fetchByPrimaryKey(long dadosRegistroId) {
		return getPersistence().fetchByPrimaryKey(dadosRegistroId);
	}

	/**
	 * Returns all the dados registros.
	 *
	 * @return the dados registros
	 */
	public static List<DadosRegistro> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the dados registros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @return the range of dados registros
	 */
	public static List<DadosRegistro> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the dados registros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dados registros
	 */
	public static List<DadosRegistro> findAll(
		int start, int end,
		OrderByComparator<DadosRegistro> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dados registros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dados registros
	 */
	public static List<DadosRegistro> findAll(
		int start, int end, OrderByComparator<DadosRegistro> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the dados registros from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of dados registros.
	 *
	 * @return the number of dados registros
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DadosRegistroPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(DadosRegistroPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile DadosRegistroPersistence _persistence;

}