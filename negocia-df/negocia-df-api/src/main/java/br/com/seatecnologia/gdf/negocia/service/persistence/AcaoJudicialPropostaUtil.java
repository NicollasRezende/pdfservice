/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.AcaoJudicialProposta;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acao judicial proposta service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.AcaoJudicialPropostaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcaoJudicialPropostaPersistence
 * @generated
 */
public class AcaoJudicialPropostaUtil {

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
	public static void clearCache(AcaoJudicialProposta acaoJudicialProposta) {
		getPersistence().clearCache(acaoJudicialProposta);
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
	public static Map<Serializable, AcaoJudicialProposta> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcaoJudicialProposta> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcaoJudicialProposta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcaoJudicialProposta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcaoJudicialProposta> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcaoJudicialProposta update(
		AcaoJudicialProposta acaoJudicialProposta) {

		return getPersistence().update(acaoJudicialProposta);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcaoJudicialProposta update(
		AcaoJudicialProposta acaoJudicialProposta,
		ServiceContext serviceContext) {

		return getPersistence().update(acaoJudicialProposta, serviceContext);
	}

	/**
	 * Returns all the acao judicial propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acao judicial propostas
	 */
	public static List<AcaoJudicialProposta> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the acao judicial propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @return the range of matching acao judicial propostas
	 */
	public static List<AcaoJudicialProposta> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the acao judicial propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acao judicial propostas
	 */
	public static List<AcaoJudicialProposta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AcaoJudicialProposta> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acao judicial propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acao judicial propostas
	 */
	public static List<AcaoJudicialProposta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AcaoJudicialProposta> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acao judicial proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a matching acao judicial proposta could not be found
	 */
	public static AcaoJudicialProposta findByUuid_First(
			String uuid,
			OrderByComparator<AcaoJudicialProposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAcaoJudicialPropostaException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first acao judicial proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial proposta, or <code>null</code> if a matching acao judicial proposta could not be found
	 */
	public static AcaoJudicialProposta fetchByUuid_First(
		String uuid,
		OrderByComparator<AcaoJudicialProposta> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last acao judicial proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a matching acao judicial proposta could not be found
	 */
	public static AcaoJudicialProposta findByUuid_Last(
			String uuid,
			OrderByComparator<AcaoJudicialProposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAcaoJudicialPropostaException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last acao judicial proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial proposta, or <code>null</code> if a matching acao judicial proposta could not be found
	 */
	public static AcaoJudicialProposta fetchByUuid_Last(
		String uuid,
		OrderByComparator<AcaoJudicialProposta> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the acao judicial propostas before and after the current acao judicial proposta in the ordered set where uuid = &#63;.
	 *
	 * @param acaoPropostaId the primary key of the current acao judicial proposta
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a acao judicial proposta with the primary key could not be found
	 */
	public static AcaoJudicialProposta[] findByUuid_PrevAndNext(
			long acaoPropostaId, String uuid,
			OrderByComparator<AcaoJudicialProposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAcaoJudicialPropostaException {

		return getPersistence().findByUuid_PrevAndNext(
			acaoPropostaId, uuid, orderByComparator);
	}

	/**
	 * Removes all the acao judicial propostas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of acao judicial propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acao judicial propostas
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the acao judicial propostas where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching acao judicial propostas
	 */
	public static List<AcaoJudicialProposta> findByPropostaId(long propostaId) {
		return getPersistence().findByPropostaId(propostaId);
	}

	/**
	 * Returns a range of all the acao judicial propostas where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @return the range of matching acao judicial propostas
	 */
	public static List<AcaoJudicialProposta> findByPropostaId(
		long propostaId, int start, int end) {

		return getPersistence().findByPropostaId(propostaId, start, end);
	}

	/**
	 * Returns an ordered range of all the acao judicial propostas where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acao judicial propostas
	 */
	public static List<AcaoJudicialProposta> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<AcaoJudicialProposta> orderByComparator) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acao judicial propostas where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acao judicial propostas
	 */
	public static List<AcaoJudicialProposta> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<AcaoJudicialProposta> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acao judicial proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a matching acao judicial proposta could not be found
	 */
	public static AcaoJudicialProposta findByPropostaId_First(
			long propostaId,
			OrderByComparator<AcaoJudicialProposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAcaoJudicialPropostaException {

		return getPersistence().findByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the first acao judicial proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial proposta, or <code>null</code> if a matching acao judicial proposta could not be found
	 */
	public static AcaoJudicialProposta fetchByPropostaId_First(
		long propostaId,
		OrderByComparator<AcaoJudicialProposta> orderByComparator) {

		return getPersistence().fetchByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last acao judicial proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a matching acao judicial proposta could not be found
	 */
	public static AcaoJudicialProposta findByPropostaId_Last(
			long propostaId,
			OrderByComparator<AcaoJudicialProposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAcaoJudicialPropostaException {

		return getPersistence().findByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last acao judicial proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial proposta, or <code>null</code> if a matching acao judicial proposta could not be found
	 */
	public static AcaoJudicialProposta fetchByPropostaId_Last(
		long propostaId,
		OrderByComparator<AcaoJudicialProposta> orderByComparator) {

		return getPersistence().fetchByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the acao judicial propostas before and after the current acao judicial proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param acaoPropostaId the primary key of the current acao judicial proposta
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a acao judicial proposta with the primary key could not be found
	 */
	public static AcaoJudicialProposta[] findByPropostaId_PrevAndNext(
			long acaoPropostaId, long propostaId,
			OrderByComparator<AcaoJudicialProposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAcaoJudicialPropostaException {

		return getPersistence().findByPropostaId_PrevAndNext(
			acaoPropostaId, propostaId, orderByComparator);
	}

	/**
	 * Removes all the acao judicial propostas where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public static void removeByPropostaId(long propostaId) {
		getPersistence().removeByPropostaId(propostaId);
	}

	/**
	 * Returns the number of acao judicial propostas where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching acao judicial propostas
	 */
	public static int countByPropostaId(long propostaId) {
		return getPersistence().countByPropostaId(propostaId);
	}

	/**
	 * Caches the acao judicial proposta in the entity cache if it is enabled.
	 *
	 * @param acaoJudicialProposta the acao judicial proposta
	 */
	public static void cacheResult(AcaoJudicialProposta acaoJudicialProposta) {
		getPersistence().cacheResult(acaoJudicialProposta);
	}

	/**
	 * Caches the acao judicial propostas in the entity cache if it is enabled.
	 *
	 * @param acaoJudicialPropostas the acao judicial propostas
	 */
	public static void cacheResult(
		List<AcaoJudicialProposta> acaoJudicialPropostas) {

		getPersistence().cacheResult(acaoJudicialPropostas);
	}

	/**
	 * Creates a new acao judicial proposta with the primary key. Does not add the acao judicial proposta to the database.
	 *
	 * @param acaoPropostaId the primary key for the new acao judicial proposta
	 * @return the new acao judicial proposta
	 */
	public static AcaoJudicialProposta create(long acaoPropostaId) {
		return getPersistence().create(acaoPropostaId);
	}

	/**
	 * Removes the acao judicial proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acaoPropostaId the primary key of the acao judicial proposta
	 * @return the acao judicial proposta that was removed
	 * @throws NoSuchAcaoJudicialPropostaException if a acao judicial proposta with the primary key could not be found
	 */
	public static AcaoJudicialProposta remove(long acaoPropostaId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAcaoJudicialPropostaException {

		return getPersistence().remove(acaoPropostaId);
	}

	public static AcaoJudicialProposta updateImpl(
		AcaoJudicialProposta acaoJudicialProposta) {

		return getPersistence().updateImpl(acaoJudicialProposta);
	}

	/**
	 * Returns the acao judicial proposta with the primary key or throws a <code>NoSuchAcaoJudicialPropostaException</code> if it could not be found.
	 *
	 * @param acaoPropostaId the primary key of the acao judicial proposta
	 * @return the acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a acao judicial proposta with the primary key could not be found
	 */
	public static AcaoJudicialProposta findByPrimaryKey(long acaoPropostaId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchAcaoJudicialPropostaException {

		return getPersistence().findByPrimaryKey(acaoPropostaId);
	}

	/**
	 * Returns the acao judicial proposta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acaoPropostaId the primary key of the acao judicial proposta
	 * @return the acao judicial proposta, or <code>null</code> if a acao judicial proposta with the primary key could not be found
	 */
	public static AcaoJudicialProposta fetchByPrimaryKey(long acaoPropostaId) {
		return getPersistence().fetchByPrimaryKey(acaoPropostaId);
	}

	/**
	 * Returns all the acao judicial propostas.
	 *
	 * @return the acao judicial propostas
	 */
	public static List<AcaoJudicialProposta> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acao judicial propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @return the range of acao judicial propostas
	 */
	public static List<AcaoJudicialProposta> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acao judicial propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acao judicial propostas
	 */
	public static List<AcaoJudicialProposta> findAll(
		int start, int end,
		OrderByComparator<AcaoJudicialProposta> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acao judicial propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acao judicial propostas
	 */
	public static List<AcaoJudicialProposta> findAll(
		int start, int end,
		OrderByComparator<AcaoJudicialProposta> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acao judicial propostas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acao judicial propostas.
	 *
	 * @return the number of acao judicial propostas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcaoJudicialPropostaPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcaoJudicialPropostaPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcaoJudicialPropostaPersistence _persistence;

}