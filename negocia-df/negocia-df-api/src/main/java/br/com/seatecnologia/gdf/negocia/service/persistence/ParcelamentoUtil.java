/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.Parcelamento;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the parcelamento service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.ParcelamentoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ParcelamentoPersistence
 * @generated
 */
public class ParcelamentoUtil {

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
	public static void clearCache(Parcelamento parcelamento) {
		getPersistence().clearCache(parcelamento);
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
	public static Map<Serializable, Parcelamento> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Parcelamento> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Parcelamento> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Parcelamento> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Parcelamento> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Parcelamento update(Parcelamento parcelamento) {
		return getPersistence().update(parcelamento);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Parcelamento update(
		Parcelamento parcelamento, ServiceContext serviceContext) {

		return getPersistence().update(parcelamento, serviceContext);
	}

	/**
	 * Returns all the parcelamentos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching parcelamentos
	 */
	public static List<Parcelamento> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the parcelamentos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @return the range of matching parcelamentos
	 */
	public static List<Parcelamento> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the parcelamentos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching parcelamentos
	 */
	public static List<Parcelamento> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Parcelamento> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the parcelamentos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching parcelamentos
	 */
	public static List<Parcelamento> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Parcelamento> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first parcelamento in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parcelamento
	 * @throws NoSuchParcelamentoException if a matching parcelamento could not be found
	 */
	public static Parcelamento findByUuid_First(
			String uuid, OrderByComparator<Parcelamento> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchParcelamentoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first parcelamento in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parcelamento, or <code>null</code> if a matching parcelamento could not be found
	 */
	public static Parcelamento fetchByUuid_First(
		String uuid, OrderByComparator<Parcelamento> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last parcelamento in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parcelamento
	 * @throws NoSuchParcelamentoException if a matching parcelamento could not be found
	 */
	public static Parcelamento findByUuid_Last(
			String uuid, OrderByComparator<Parcelamento> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchParcelamentoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last parcelamento in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parcelamento, or <code>null</code> if a matching parcelamento could not be found
	 */
	public static Parcelamento fetchByUuid_Last(
		String uuid, OrderByComparator<Parcelamento> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the parcelamentos before and after the current parcelamento in the ordered set where uuid = &#63;.
	 *
	 * @param parcelamentoId the primary key of the current parcelamento
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next parcelamento
	 * @throws NoSuchParcelamentoException if a parcelamento with the primary key could not be found
	 */
	public static Parcelamento[] findByUuid_PrevAndNext(
			long parcelamentoId, String uuid,
			OrderByComparator<Parcelamento> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchParcelamentoException {

		return getPersistence().findByUuid_PrevAndNext(
			parcelamentoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the parcelamentos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of parcelamentos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching parcelamentos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the parcelamentos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching parcelamentos
	 */
	public static List<Parcelamento> findByPropostaId(long propostaId) {
		return getPersistence().findByPropostaId(propostaId);
	}

	/**
	 * Returns a range of all the parcelamentos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @return the range of matching parcelamentos
	 */
	public static List<Parcelamento> findByPropostaId(
		long propostaId, int start, int end) {

		return getPersistence().findByPropostaId(propostaId, start, end);
	}

	/**
	 * Returns an ordered range of all the parcelamentos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching parcelamentos
	 */
	public static List<Parcelamento> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<Parcelamento> orderByComparator) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the parcelamentos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching parcelamentos
	 */
	public static List<Parcelamento> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<Parcelamento> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first parcelamento in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parcelamento
	 * @throws NoSuchParcelamentoException if a matching parcelamento could not be found
	 */
	public static Parcelamento findByPropostaId_First(
			long propostaId, OrderByComparator<Parcelamento> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchParcelamentoException {

		return getPersistence().findByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the first parcelamento in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parcelamento, or <code>null</code> if a matching parcelamento could not be found
	 */
	public static Parcelamento fetchByPropostaId_First(
		long propostaId, OrderByComparator<Parcelamento> orderByComparator) {

		return getPersistence().fetchByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last parcelamento in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parcelamento
	 * @throws NoSuchParcelamentoException if a matching parcelamento could not be found
	 */
	public static Parcelamento findByPropostaId_Last(
			long propostaId, OrderByComparator<Parcelamento> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchParcelamentoException {

		return getPersistence().findByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last parcelamento in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parcelamento, or <code>null</code> if a matching parcelamento could not be found
	 */
	public static Parcelamento fetchByPropostaId_Last(
		long propostaId, OrderByComparator<Parcelamento> orderByComparator) {

		return getPersistence().fetchByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the parcelamentos before and after the current parcelamento in the ordered set where propostaId = &#63;.
	 *
	 * @param parcelamentoId the primary key of the current parcelamento
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next parcelamento
	 * @throws NoSuchParcelamentoException if a parcelamento with the primary key could not be found
	 */
	public static Parcelamento[] findByPropostaId_PrevAndNext(
			long parcelamentoId, long propostaId,
			OrderByComparator<Parcelamento> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchParcelamentoException {

		return getPersistence().findByPropostaId_PrevAndNext(
			parcelamentoId, propostaId, orderByComparator);
	}

	/**
	 * Removes all the parcelamentos where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public static void removeByPropostaId(long propostaId) {
		getPersistence().removeByPropostaId(propostaId);
	}

	/**
	 * Returns the number of parcelamentos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching parcelamentos
	 */
	public static int countByPropostaId(long propostaId) {
		return getPersistence().countByPropostaId(propostaId);
	}

	/**
	 * Caches the parcelamento in the entity cache if it is enabled.
	 *
	 * @param parcelamento the parcelamento
	 */
	public static void cacheResult(Parcelamento parcelamento) {
		getPersistence().cacheResult(parcelamento);
	}

	/**
	 * Caches the parcelamentos in the entity cache if it is enabled.
	 *
	 * @param parcelamentos the parcelamentos
	 */
	public static void cacheResult(List<Parcelamento> parcelamentos) {
		getPersistence().cacheResult(parcelamentos);
	}

	/**
	 * Creates a new parcelamento with the primary key. Does not add the parcelamento to the database.
	 *
	 * @param parcelamentoId the primary key for the new parcelamento
	 * @return the new parcelamento
	 */
	public static Parcelamento create(long parcelamentoId) {
		return getPersistence().create(parcelamentoId);
	}

	/**
	 * Removes the parcelamento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param parcelamentoId the primary key of the parcelamento
	 * @return the parcelamento that was removed
	 * @throws NoSuchParcelamentoException if a parcelamento with the primary key could not be found
	 */
	public static Parcelamento remove(long parcelamentoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchParcelamentoException {

		return getPersistence().remove(parcelamentoId);
	}

	public static Parcelamento updateImpl(Parcelamento parcelamento) {
		return getPersistence().updateImpl(parcelamento);
	}

	/**
	 * Returns the parcelamento with the primary key or throws a <code>NoSuchParcelamentoException</code> if it could not be found.
	 *
	 * @param parcelamentoId the primary key of the parcelamento
	 * @return the parcelamento
	 * @throws NoSuchParcelamentoException if a parcelamento with the primary key could not be found
	 */
	public static Parcelamento findByPrimaryKey(long parcelamentoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchParcelamentoException {

		return getPersistence().findByPrimaryKey(parcelamentoId);
	}

	/**
	 * Returns the parcelamento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param parcelamentoId the primary key of the parcelamento
	 * @return the parcelamento, or <code>null</code> if a parcelamento with the primary key could not be found
	 */
	public static Parcelamento fetchByPrimaryKey(long parcelamentoId) {
		return getPersistence().fetchByPrimaryKey(parcelamentoId);
	}

	/**
	 * Returns all the parcelamentos.
	 *
	 * @return the parcelamentos
	 */
	public static List<Parcelamento> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the parcelamentos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @return the range of parcelamentos
	 */
	public static List<Parcelamento> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the parcelamentos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of parcelamentos
	 */
	public static List<Parcelamento> findAll(
		int start, int end, OrderByComparator<Parcelamento> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the parcelamentos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of parcelamentos
	 */
	public static List<Parcelamento> findAll(
		int start, int end, OrderByComparator<Parcelamento> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the parcelamentos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of parcelamentos.
	 *
	 * @return the number of parcelamentos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ParcelamentoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(ParcelamentoPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile ParcelamentoPersistence _persistence;

}