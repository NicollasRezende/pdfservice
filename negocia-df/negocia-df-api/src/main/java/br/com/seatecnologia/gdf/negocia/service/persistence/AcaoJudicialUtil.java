/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.AcaoJudicial;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acao judicial service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.AcaoJudicialPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcaoJudicialPersistence
 * @generated
 */
public class AcaoJudicialUtil {

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
	public static void clearCache(AcaoJudicial acaoJudicial) {
		getPersistence().clearCache(acaoJudicial);
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
	public static Map<Serializable, AcaoJudicial> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcaoJudicial> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcaoJudicial> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcaoJudicial> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcaoJudicial> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcaoJudicial update(AcaoJudicial acaoJudicial) {
		return getPersistence().update(acaoJudicial);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcaoJudicial update(
		AcaoJudicial acaoJudicial, ServiceContext serviceContext) {

		return getPersistence().update(acaoJudicial, serviceContext);
	}

	/**
	 * Returns all the acao judicials where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acao judicials
	 */
	public static List<AcaoJudicial> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the acao judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @return the range of matching acao judicials
	 */
	public static List<AcaoJudicial> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the acao judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acao judicials
	 */
	public static List<AcaoJudicial> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AcaoJudicial> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acao judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acao judicials
	 */
	public static List<AcaoJudicial> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AcaoJudicial> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acao judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial
	 * @throws NoSuchAcaoJudicialException if a matching acao judicial could not be found
	 */
	public static AcaoJudicial findByUuid_First(
			String uuid, OrderByComparator<AcaoJudicial> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAcaoJudicialException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first acao judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial, or <code>null</code> if a matching acao judicial could not be found
	 */
	public static AcaoJudicial fetchByUuid_First(
		String uuid, OrderByComparator<AcaoJudicial> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last acao judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial
	 * @throws NoSuchAcaoJudicialException if a matching acao judicial could not be found
	 */
	public static AcaoJudicial findByUuid_Last(
			String uuid, OrderByComparator<AcaoJudicial> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAcaoJudicialException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last acao judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial, or <code>null</code> if a matching acao judicial could not be found
	 */
	public static AcaoJudicial fetchByUuid_Last(
		String uuid, OrderByComparator<AcaoJudicial> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the acao judicials before and after the current acao judicial in the ordered set where uuid = &#63;.
	 *
	 * @param acaoId the primary key of the current acao judicial
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acao judicial
	 * @throws NoSuchAcaoJudicialException if a acao judicial with the primary key could not be found
	 */
	public static AcaoJudicial[] findByUuid_PrevAndNext(
			long acaoId, String uuid,
			OrderByComparator<AcaoJudicial> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAcaoJudicialException {

		return getPersistence().findByUuid_PrevAndNext(
			acaoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the acao judicials where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of acao judicials where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acao judicials
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the acao judicials where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching acao judicials
	 */
	public static List<AcaoJudicial> findByPropostaId(long propostaId) {
		return getPersistence().findByPropostaId(propostaId);
	}

	/**
	 * Returns a range of all the acao judicials where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @return the range of matching acao judicials
	 */
	public static List<AcaoJudicial> findByPropostaId(
		long propostaId, int start, int end) {

		return getPersistence().findByPropostaId(propostaId, start, end);
	}

	/**
	 * Returns an ordered range of all the acao judicials where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acao judicials
	 */
	public static List<AcaoJudicial> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<AcaoJudicial> orderByComparator) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acao judicials where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acao judicials
	 */
	public static List<AcaoJudicial> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<AcaoJudicial> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acao judicial in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial
	 * @throws NoSuchAcaoJudicialException if a matching acao judicial could not be found
	 */
	public static AcaoJudicial findByPropostaId_First(
			long propostaId, OrderByComparator<AcaoJudicial> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAcaoJudicialException {

		return getPersistence().findByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the first acao judicial in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial, or <code>null</code> if a matching acao judicial could not be found
	 */
	public static AcaoJudicial fetchByPropostaId_First(
		long propostaId, OrderByComparator<AcaoJudicial> orderByComparator) {

		return getPersistence().fetchByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last acao judicial in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial
	 * @throws NoSuchAcaoJudicialException if a matching acao judicial could not be found
	 */
	public static AcaoJudicial findByPropostaId_Last(
			long propostaId, OrderByComparator<AcaoJudicial> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAcaoJudicialException {

		return getPersistence().findByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last acao judicial in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial, or <code>null</code> if a matching acao judicial could not be found
	 */
	public static AcaoJudicial fetchByPropostaId_Last(
		long propostaId, OrderByComparator<AcaoJudicial> orderByComparator) {

		return getPersistence().fetchByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the acao judicials before and after the current acao judicial in the ordered set where propostaId = &#63;.
	 *
	 * @param acaoId the primary key of the current acao judicial
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acao judicial
	 * @throws NoSuchAcaoJudicialException if a acao judicial with the primary key could not be found
	 */
	public static AcaoJudicial[] findByPropostaId_PrevAndNext(
			long acaoId, long propostaId,
			OrderByComparator<AcaoJudicial> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAcaoJudicialException {

		return getPersistence().findByPropostaId_PrevAndNext(
			acaoId, propostaId, orderByComparator);
	}

	/**
	 * Removes all the acao judicials where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public static void removeByPropostaId(long propostaId) {
		getPersistence().removeByPropostaId(propostaId);
	}

	/**
	 * Returns the number of acao judicials where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching acao judicials
	 */
	public static int countByPropostaId(long propostaId) {
		return getPersistence().countByPropostaId(propostaId);
	}

	/**
	 * Caches the acao judicial in the entity cache if it is enabled.
	 *
	 * @param acaoJudicial the acao judicial
	 */
	public static void cacheResult(AcaoJudicial acaoJudicial) {
		getPersistence().cacheResult(acaoJudicial);
	}

	/**
	 * Caches the acao judicials in the entity cache if it is enabled.
	 *
	 * @param acaoJudicials the acao judicials
	 */
	public static void cacheResult(List<AcaoJudicial> acaoJudicials) {
		getPersistence().cacheResult(acaoJudicials);
	}

	/**
	 * Creates a new acao judicial with the primary key. Does not add the acao judicial to the database.
	 *
	 * @param acaoId the primary key for the new acao judicial
	 * @return the new acao judicial
	 */
	public static AcaoJudicial create(long acaoId) {
		return getPersistence().create(acaoId);
	}

	/**
	 * Removes the acao judicial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acaoId the primary key of the acao judicial
	 * @return the acao judicial that was removed
	 * @throws NoSuchAcaoJudicialException if a acao judicial with the primary key could not be found
	 */
	public static AcaoJudicial remove(long acaoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAcaoJudicialException {

		return getPersistence().remove(acaoId);
	}

	public static AcaoJudicial updateImpl(AcaoJudicial acaoJudicial) {
		return getPersistence().updateImpl(acaoJudicial);
	}

	/**
	 * Returns the acao judicial with the primary key or throws a <code>NoSuchAcaoJudicialException</code> if it could not be found.
	 *
	 * @param acaoId the primary key of the acao judicial
	 * @return the acao judicial
	 * @throws NoSuchAcaoJudicialException if a acao judicial with the primary key could not be found
	 */
	public static AcaoJudicial findByPrimaryKey(long acaoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAcaoJudicialException {

		return getPersistence().findByPrimaryKey(acaoId);
	}

	/**
	 * Returns the acao judicial with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acaoId the primary key of the acao judicial
	 * @return the acao judicial, or <code>null</code> if a acao judicial with the primary key could not be found
	 */
	public static AcaoJudicial fetchByPrimaryKey(long acaoId) {
		return getPersistence().fetchByPrimaryKey(acaoId);
	}

	/**
	 * Returns all the acao judicials.
	 *
	 * @return the acao judicials
	 */
	public static List<AcaoJudicial> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acao judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @return the range of acao judicials
	 */
	public static List<AcaoJudicial> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acao judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acao judicials
	 */
	public static List<AcaoJudicial> findAll(
		int start, int end, OrderByComparator<AcaoJudicial> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acao judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acao judicials
	 */
	public static List<AcaoJudicial> findAll(
		int start, int end, OrderByComparator<AcaoJudicial> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acao judicials from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acao judicials.
	 *
	 * @return the number of acao judicials
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcaoJudicialPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(AcaoJudicialPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile AcaoJudicialPersistence _persistence;

}