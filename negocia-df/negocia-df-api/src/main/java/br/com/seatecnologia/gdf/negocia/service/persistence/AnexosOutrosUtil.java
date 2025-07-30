/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.AnexosOutros;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the anexos outros service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.AnexosOutrosPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AnexosOutrosPersistence
 * @generated
 */
public class AnexosOutrosUtil {

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
	public static void clearCache(AnexosOutros anexosOutros) {
		getPersistence().clearCache(anexosOutros);
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
	public static Map<Serializable, AnexosOutros> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AnexosOutros> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AnexosOutros> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AnexosOutros> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AnexosOutros> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AnexosOutros update(AnexosOutros anexosOutros) {
		return getPersistence().update(anexosOutros);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AnexosOutros update(
		AnexosOutros anexosOutros, ServiceContext serviceContext) {

		return getPersistence().update(anexosOutros, serviceContext);
	}

	/**
	 * Returns all the anexos outroses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching anexos outroses
	 */
	public static List<AnexosOutros> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the anexos outroses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @return the range of matching anexos outroses
	 */
	public static List<AnexosOutros> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the anexos outroses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching anexos outroses
	 */
	public static List<AnexosOutros> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AnexosOutros> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the anexos outroses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching anexos outroses
	 */
	public static List<AnexosOutros> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AnexosOutros> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first anexos outros in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching anexos outros
	 * @throws NoSuchAnexosOutrosException if a matching anexos outros could not be found
	 */
	public static AnexosOutros findByUuid_First(
			String uuid, OrderByComparator<AnexosOutros> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAnexosOutrosException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first anexos outros in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching anexos outros, or <code>null</code> if a matching anexos outros could not be found
	 */
	public static AnexosOutros fetchByUuid_First(
		String uuid, OrderByComparator<AnexosOutros> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last anexos outros in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching anexos outros
	 * @throws NoSuchAnexosOutrosException if a matching anexos outros could not be found
	 */
	public static AnexosOutros findByUuid_Last(
			String uuid, OrderByComparator<AnexosOutros> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAnexosOutrosException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last anexos outros in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching anexos outros, or <code>null</code> if a matching anexos outros could not be found
	 */
	public static AnexosOutros fetchByUuid_Last(
		String uuid, OrderByComparator<AnexosOutros> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the anexos outroses before and after the current anexos outros in the ordered set where uuid = &#63;.
	 *
	 * @param anexosOutrosId the primary key of the current anexos outros
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next anexos outros
	 * @throws NoSuchAnexosOutrosException if a anexos outros with the primary key could not be found
	 */
	public static AnexosOutros[] findByUuid_PrevAndNext(
			long anexosOutrosId, String uuid,
			OrderByComparator<AnexosOutros> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAnexosOutrosException {

		return getPersistence().findByUuid_PrevAndNext(
			anexosOutrosId, uuid, orderByComparator);
	}

	/**
	 * Removes all the anexos outroses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of anexos outroses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching anexos outroses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the anexos outroses where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @return the matching anexos outroses
	 */
	public static List<AnexosOutros> findByDadosRegistroId(
		long dadosRegistroId) {

		return getPersistence().findByDadosRegistroId(dadosRegistroId);
	}

	/**
	 * Returns a range of all the anexos outroses where dadosRegistroId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @return the range of matching anexos outroses
	 */
	public static List<AnexosOutros> findByDadosRegistroId(
		long dadosRegistroId, int start, int end) {

		return getPersistence().findByDadosRegistroId(
			dadosRegistroId, start, end);
	}

	/**
	 * Returns an ordered range of all the anexos outroses where dadosRegistroId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching anexos outroses
	 */
	public static List<AnexosOutros> findByDadosRegistroId(
		long dadosRegistroId, int start, int end,
		OrderByComparator<AnexosOutros> orderByComparator) {

		return getPersistence().findByDadosRegistroId(
			dadosRegistroId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the anexos outroses where dadosRegistroId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching anexos outroses
	 */
	public static List<AnexosOutros> findByDadosRegistroId(
		long dadosRegistroId, int start, int end,
		OrderByComparator<AnexosOutros> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByDadosRegistroId(
			dadosRegistroId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first anexos outros in the ordered set where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching anexos outros
	 * @throws NoSuchAnexosOutrosException if a matching anexos outros could not be found
	 */
	public static AnexosOutros findByDadosRegistroId_First(
			long dadosRegistroId,
			OrderByComparator<AnexosOutros> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAnexosOutrosException {

		return getPersistence().findByDadosRegistroId_First(
			dadosRegistroId, orderByComparator);
	}

	/**
	 * Returns the first anexos outros in the ordered set where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching anexos outros, or <code>null</code> if a matching anexos outros could not be found
	 */
	public static AnexosOutros fetchByDadosRegistroId_First(
		long dadosRegistroId,
		OrderByComparator<AnexosOutros> orderByComparator) {

		return getPersistence().fetchByDadosRegistroId_First(
			dadosRegistroId, orderByComparator);
	}

	/**
	 * Returns the last anexos outros in the ordered set where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching anexos outros
	 * @throws NoSuchAnexosOutrosException if a matching anexos outros could not be found
	 */
	public static AnexosOutros findByDadosRegistroId_Last(
			long dadosRegistroId,
			OrderByComparator<AnexosOutros> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAnexosOutrosException {

		return getPersistence().findByDadosRegistroId_Last(
			dadosRegistroId, orderByComparator);
	}

	/**
	 * Returns the last anexos outros in the ordered set where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching anexos outros, or <code>null</code> if a matching anexos outros could not be found
	 */
	public static AnexosOutros fetchByDadosRegistroId_Last(
		long dadosRegistroId,
		OrderByComparator<AnexosOutros> orderByComparator) {

		return getPersistence().fetchByDadosRegistroId_Last(
			dadosRegistroId, orderByComparator);
	}

	/**
	 * Returns the anexos outroses before and after the current anexos outros in the ordered set where dadosRegistroId = &#63;.
	 *
	 * @param anexosOutrosId the primary key of the current anexos outros
	 * @param dadosRegistroId the dados registro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next anexos outros
	 * @throws NoSuchAnexosOutrosException if a anexos outros with the primary key could not be found
	 */
	public static AnexosOutros[] findByDadosRegistroId_PrevAndNext(
			long anexosOutrosId, long dadosRegistroId,
			OrderByComparator<AnexosOutros> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAnexosOutrosException {

		return getPersistence().findByDadosRegistroId_PrevAndNext(
			anexosOutrosId, dadosRegistroId, orderByComparator);
	}

	/**
	 * Removes all the anexos outroses where dadosRegistroId = &#63; from the database.
	 *
	 * @param dadosRegistroId the dados registro ID
	 */
	public static void removeByDadosRegistroId(long dadosRegistroId) {
		getPersistence().removeByDadosRegistroId(dadosRegistroId);
	}

	/**
	 * Returns the number of anexos outroses where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @return the number of matching anexos outroses
	 */
	public static int countByDadosRegistroId(long dadosRegistroId) {
		return getPersistence().countByDadosRegistroId(dadosRegistroId);
	}

	/**
	 * Caches the anexos outros in the entity cache if it is enabled.
	 *
	 * @param anexosOutros the anexos outros
	 */
	public static void cacheResult(AnexosOutros anexosOutros) {
		getPersistence().cacheResult(anexosOutros);
	}

	/**
	 * Caches the anexos outroses in the entity cache if it is enabled.
	 *
	 * @param anexosOutroses the anexos outroses
	 */
	public static void cacheResult(List<AnexosOutros> anexosOutroses) {
		getPersistence().cacheResult(anexosOutroses);
	}

	/**
	 * Creates a new anexos outros with the primary key. Does not add the anexos outros to the database.
	 *
	 * @param anexosOutrosId the primary key for the new anexos outros
	 * @return the new anexos outros
	 */
	public static AnexosOutros create(long anexosOutrosId) {
		return getPersistence().create(anexosOutrosId);
	}

	/**
	 * Removes the anexos outros with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param anexosOutrosId the primary key of the anexos outros
	 * @return the anexos outros that was removed
	 * @throws NoSuchAnexosOutrosException if a anexos outros with the primary key could not be found
	 */
	public static AnexosOutros remove(long anexosOutrosId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAnexosOutrosException {

		return getPersistence().remove(anexosOutrosId);
	}

	public static AnexosOutros updateImpl(AnexosOutros anexosOutros) {
		return getPersistence().updateImpl(anexosOutros);
	}

	/**
	 * Returns the anexos outros with the primary key or throws a <code>NoSuchAnexosOutrosException</code> if it could not be found.
	 *
	 * @param anexosOutrosId the primary key of the anexos outros
	 * @return the anexos outros
	 * @throws NoSuchAnexosOutrosException if a anexos outros with the primary key could not be found
	 */
	public static AnexosOutros findByPrimaryKey(long anexosOutrosId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAnexosOutrosException {

		return getPersistence().findByPrimaryKey(anexosOutrosId);
	}

	/**
	 * Returns the anexos outros with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param anexosOutrosId the primary key of the anexos outros
	 * @return the anexos outros, or <code>null</code> if a anexos outros with the primary key could not be found
	 */
	public static AnexosOutros fetchByPrimaryKey(long anexosOutrosId) {
		return getPersistence().fetchByPrimaryKey(anexosOutrosId);
	}

	/**
	 * Returns all the anexos outroses.
	 *
	 * @return the anexos outroses
	 */
	public static List<AnexosOutros> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the anexos outroses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @return the range of anexos outroses
	 */
	public static List<AnexosOutros> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the anexos outroses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of anexos outroses
	 */
	public static List<AnexosOutros> findAll(
		int start, int end, OrderByComparator<AnexosOutros> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the anexos outroses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of anexos outroses
	 */
	public static List<AnexosOutros> findAll(
		int start, int end, OrderByComparator<AnexosOutros> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the anexos outroses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of anexos outroses.
	 *
	 * @return the number of anexos outroses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AnexosOutrosPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(AnexosOutrosPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile AnexosOutrosPersistence _persistence;

}