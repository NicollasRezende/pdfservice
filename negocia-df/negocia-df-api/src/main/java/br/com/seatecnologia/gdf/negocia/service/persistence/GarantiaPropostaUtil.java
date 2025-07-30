/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.GarantiaProposta;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the garantia proposta service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.GarantiaPropostaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GarantiaPropostaPersistence
 * @generated
 */
public class GarantiaPropostaUtil {

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
	public static void clearCache(GarantiaProposta garantiaProposta) {
		getPersistence().clearCache(garantiaProposta);
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
	public static Map<Serializable, GarantiaProposta> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<GarantiaProposta> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<GarantiaProposta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<GarantiaProposta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<GarantiaProposta> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static GarantiaProposta update(GarantiaProposta garantiaProposta) {
		return getPersistence().update(garantiaProposta);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static GarantiaProposta update(
		GarantiaProposta garantiaProposta, ServiceContext serviceContext) {

		return getPersistence().update(garantiaProposta, serviceContext);
	}

	/**
	 * Returns all the garantia propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching garantia propostas
	 */
	public static List<GarantiaProposta> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the garantia propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @return the range of matching garantia propostas
	 */
	public static List<GarantiaProposta> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the garantia propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching garantia propostas
	 */
	public static List<GarantiaProposta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<GarantiaProposta> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the garantia propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching garantia propostas
	 */
	public static List<GarantiaProposta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<GarantiaProposta> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first garantia proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching garantia proposta
	 * @throws NoSuchGarantiaPropostaException if a matching garantia proposta could not be found
	 */
	public static GarantiaProposta findByUuid_First(
			String uuid, OrderByComparator<GarantiaProposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchGarantiaPropostaException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first garantia proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching garantia proposta, or <code>null</code> if a matching garantia proposta could not be found
	 */
	public static GarantiaProposta fetchByUuid_First(
		String uuid, OrderByComparator<GarantiaProposta> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last garantia proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching garantia proposta
	 * @throws NoSuchGarantiaPropostaException if a matching garantia proposta could not be found
	 */
	public static GarantiaProposta findByUuid_Last(
			String uuid, OrderByComparator<GarantiaProposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchGarantiaPropostaException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last garantia proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching garantia proposta, or <code>null</code> if a matching garantia proposta could not be found
	 */
	public static GarantiaProposta fetchByUuid_Last(
		String uuid, OrderByComparator<GarantiaProposta> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the garantia propostas before and after the current garantia proposta in the ordered set where uuid = &#63;.
	 *
	 * @param garantiaPropostaId the primary key of the current garantia proposta
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next garantia proposta
	 * @throws NoSuchGarantiaPropostaException if a garantia proposta with the primary key could not be found
	 */
	public static GarantiaProposta[] findByUuid_PrevAndNext(
			long garantiaPropostaId, String uuid,
			OrderByComparator<GarantiaProposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchGarantiaPropostaException {

		return getPersistence().findByUuid_PrevAndNext(
			garantiaPropostaId, uuid, orderByComparator);
	}

	/**
	 * Removes all the garantia propostas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of garantia propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching garantia propostas
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the garantia proposta in the entity cache if it is enabled.
	 *
	 * @param garantiaProposta the garantia proposta
	 */
	public static void cacheResult(GarantiaProposta garantiaProposta) {
		getPersistence().cacheResult(garantiaProposta);
	}

	/**
	 * Caches the garantia propostas in the entity cache if it is enabled.
	 *
	 * @param garantiaPropostas the garantia propostas
	 */
	public static void cacheResult(List<GarantiaProposta> garantiaPropostas) {
		getPersistence().cacheResult(garantiaPropostas);
	}

	/**
	 * Creates a new garantia proposta with the primary key. Does not add the garantia proposta to the database.
	 *
	 * @param garantiaPropostaId the primary key for the new garantia proposta
	 * @return the new garantia proposta
	 */
	public static GarantiaProposta create(long garantiaPropostaId) {
		return getPersistence().create(garantiaPropostaId);
	}

	/**
	 * Removes the garantia proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param garantiaPropostaId the primary key of the garantia proposta
	 * @return the garantia proposta that was removed
	 * @throws NoSuchGarantiaPropostaException if a garantia proposta with the primary key could not be found
	 */
	public static GarantiaProposta remove(long garantiaPropostaId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchGarantiaPropostaException {

		return getPersistence().remove(garantiaPropostaId);
	}

	public static GarantiaProposta updateImpl(
		GarantiaProposta garantiaProposta) {

		return getPersistence().updateImpl(garantiaProposta);
	}

	/**
	 * Returns the garantia proposta with the primary key or throws a <code>NoSuchGarantiaPropostaException</code> if it could not be found.
	 *
	 * @param garantiaPropostaId the primary key of the garantia proposta
	 * @return the garantia proposta
	 * @throws NoSuchGarantiaPropostaException if a garantia proposta with the primary key could not be found
	 */
	public static GarantiaProposta findByPrimaryKey(long garantiaPropostaId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchGarantiaPropostaException {

		return getPersistence().findByPrimaryKey(garantiaPropostaId);
	}

	/**
	 * Returns the garantia proposta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param garantiaPropostaId the primary key of the garantia proposta
	 * @return the garantia proposta, or <code>null</code> if a garantia proposta with the primary key could not be found
	 */
	public static GarantiaProposta fetchByPrimaryKey(long garantiaPropostaId) {
		return getPersistence().fetchByPrimaryKey(garantiaPropostaId);
	}

	/**
	 * Returns all the garantia propostas.
	 *
	 * @return the garantia propostas
	 */
	public static List<GarantiaProposta> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the garantia propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @return the range of garantia propostas
	 */
	public static List<GarantiaProposta> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the garantia propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of garantia propostas
	 */
	public static List<GarantiaProposta> findAll(
		int start, int end,
		OrderByComparator<GarantiaProposta> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the garantia propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of garantia propostas
	 */
	public static List<GarantiaProposta> findAll(
		int start, int end,
		OrderByComparator<GarantiaProposta> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the garantia propostas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of garantia propostas.
	 *
	 * @return the number of garantia propostas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static GarantiaPropostaPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(GarantiaPropostaPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile GarantiaPropostaPersistence _persistence;

}