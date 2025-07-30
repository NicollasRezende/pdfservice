/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the bens direitos requerente service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.BensDireitosRequerentePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BensDireitosRequerentePersistence
 * @generated
 */
public class BensDireitosRequerenteUtil {

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
	public static void clearCache(
		BensDireitosRequerente bensDireitosRequerente) {

		getPersistence().clearCache(bensDireitosRequerente);
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
	public static Map<Serializable, BensDireitosRequerente> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<BensDireitosRequerente> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BensDireitosRequerente> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BensDireitosRequerente> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BensDireitosRequerente> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BensDireitosRequerente update(
		BensDireitosRequerente bensDireitosRequerente) {

		return getPersistence().update(bensDireitosRequerente);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BensDireitosRequerente update(
		BensDireitosRequerente bensDireitosRequerente,
		ServiceContext serviceContext) {

		return getPersistence().update(bensDireitosRequerente, serviceContext);
	}

	/**
	 * Returns all the bens direitos requerentes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching bens direitos requerentes
	 */
	public static List<BensDireitosRequerente> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the bens direitos requerentes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @return the range of matching bens direitos requerentes
	 */
	public static List<BensDireitosRequerente> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the bens direitos requerentes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bens direitos requerentes
	 */
	public static List<BensDireitosRequerente> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BensDireitosRequerente> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bens direitos requerentes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bens direitos requerentes
	 */
	public static List<BensDireitosRequerente> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<BensDireitosRequerente> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first bens direitos requerente in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a matching bens direitos requerente could not be found
	 */
	public static BensDireitosRequerente findByUuid_First(
			String uuid,
			OrderByComparator<BensDireitosRequerente> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBensDireitosRequerenteException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first bens direitos requerente in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos requerente, or <code>null</code> if a matching bens direitos requerente could not be found
	 */
	public static BensDireitosRequerente fetchByUuid_First(
		String uuid,
		OrderByComparator<BensDireitosRequerente> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last bens direitos requerente in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a matching bens direitos requerente could not be found
	 */
	public static BensDireitosRequerente findByUuid_Last(
			String uuid,
			OrderByComparator<BensDireitosRequerente> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBensDireitosRequerenteException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last bens direitos requerente in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos requerente, or <code>null</code> if a matching bens direitos requerente could not be found
	 */
	public static BensDireitosRequerente fetchByUuid_Last(
		String uuid,
		OrderByComparator<BensDireitosRequerente> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the bens direitos requerentes before and after the current bens direitos requerente in the ordered set where uuid = &#63;.
	 *
	 * @param bemId the primary key of the current bens direitos requerente
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a bens direitos requerente with the primary key could not be found
	 */
	public static BensDireitosRequerente[] findByUuid_PrevAndNext(
			long bemId, String uuid,
			OrderByComparator<BensDireitosRequerente> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBensDireitosRequerenteException {

		return getPersistence().findByUuid_PrevAndNext(
			bemId, uuid, orderByComparator);
	}

	/**
	 * Removes all the bens direitos requerentes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of bens direitos requerentes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching bens direitos requerentes
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the bens direitos requerentes where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching bens direitos requerentes
	 */
	public static List<BensDireitosRequerente> findByPropostaId(
		long propostaId) {

		return getPersistence().findByPropostaId(propostaId);
	}

	/**
	 * Returns a range of all the bens direitos requerentes where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @return the range of matching bens direitos requerentes
	 */
	public static List<BensDireitosRequerente> findByPropostaId(
		long propostaId, int start, int end) {

		return getPersistence().findByPropostaId(propostaId, start, end);
	}

	/**
	 * Returns an ordered range of all the bens direitos requerentes where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bens direitos requerentes
	 */
	public static List<BensDireitosRequerente> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<BensDireitosRequerente> orderByComparator) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bens direitos requerentes where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bens direitos requerentes
	 */
	public static List<BensDireitosRequerente> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<BensDireitosRequerente> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first bens direitos requerente in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a matching bens direitos requerente could not be found
	 */
	public static BensDireitosRequerente findByPropostaId_First(
			long propostaId,
			OrderByComparator<BensDireitosRequerente> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBensDireitosRequerenteException {

		return getPersistence().findByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the first bens direitos requerente in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos requerente, or <code>null</code> if a matching bens direitos requerente could not be found
	 */
	public static BensDireitosRequerente fetchByPropostaId_First(
		long propostaId,
		OrderByComparator<BensDireitosRequerente> orderByComparator) {

		return getPersistence().fetchByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last bens direitos requerente in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a matching bens direitos requerente could not be found
	 */
	public static BensDireitosRequerente findByPropostaId_Last(
			long propostaId,
			OrderByComparator<BensDireitosRequerente> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBensDireitosRequerenteException {

		return getPersistence().findByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last bens direitos requerente in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos requerente, or <code>null</code> if a matching bens direitos requerente could not be found
	 */
	public static BensDireitosRequerente fetchByPropostaId_Last(
		long propostaId,
		OrderByComparator<BensDireitosRequerente> orderByComparator) {

		return getPersistence().fetchByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the bens direitos requerentes before and after the current bens direitos requerente in the ordered set where propostaId = &#63;.
	 *
	 * @param bemId the primary key of the current bens direitos requerente
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a bens direitos requerente with the primary key could not be found
	 */
	public static BensDireitosRequerente[] findByPropostaId_PrevAndNext(
			long bemId, long propostaId,
			OrderByComparator<BensDireitosRequerente> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBensDireitosRequerenteException {

		return getPersistence().findByPropostaId_PrevAndNext(
			bemId, propostaId, orderByComparator);
	}

	/**
	 * Removes all the bens direitos requerentes where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public static void removeByPropostaId(long propostaId) {
		getPersistence().removeByPropostaId(propostaId);
	}

	/**
	 * Returns the number of bens direitos requerentes where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching bens direitos requerentes
	 */
	public static int countByPropostaId(long propostaId) {
		return getPersistence().countByPropostaId(propostaId);
	}

	/**
	 * Caches the bens direitos requerente in the entity cache if it is enabled.
	 *
	 * @param bensDireitosRequerente the bens direitos requerente
	 */
	public static void cacheResult(
		BensDireitosRequerente bensDireitosRequerente) {

		getPersistence().cacheResult(bensDireitosRequerente);
	}

	/**
	 * Caches the bens direitos requerentes in the entity cache if it is enabled.
	 *
	 * @param bensDireitosRequerentes the bens direitos requerentes
	 */
	public static void cacheResult(
		List<BensDireitosRequerente> bensDireitosRequerentes) {

		getPersistence().cacheResult(bensDireitosRequerentes);
	}

	/**
	 * Creates a new bens direitos requerente with the primary key. Does not add the bens direitos requerente to the database.
	 *
	 * @param bemId the primary key for the new bens direitos requerente
	 * @return the new bens direitos requerente
	 */
	public static BensDireitosRequerente create(long bemId) {
		return getPersistence().create(bemId);
	}

	/**
	 * Removes the bens direitos requerente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bemId the primary key of the bens direitos requerente
	 * @return the bens direitos requerente that was removed
	 * @throws NoSuchBensDireitosRequerenteException if a bens direitos requerente with the primary key could not be found
	 */
	public static BensDireitosRequerente remove(long bemId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBensDireitosRequerenteException {

		return getPersistence().remove(bemId);
	}

	public static BensDireitosRequerente updateImpl(
		BensDireitosRequerente bensDireitosRequerente) {

		return getPersistence().updateImpl(bensDireitosRequerente);
	}

	/**
	 * Returns the bens direitos requerente with the primary key or throws a <code>NoSuchBensDireitosRequerenteException</code> if it could not be found.
	 *
	 * @param bemId the primary key of the bens direitos requerente
	 * @return the bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a bens direitos requerente with the primary key could not be found
	 */
	public static BensDireitosRequerente findByPrimaryKey(long bemId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchBensDireitosRequerenteException {

		return getPersistence().findByPrimaryKey(bemId);
	}

	/**
	 * Returns the bens direitos requerente with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bemId the primary key of the bens direitos requerente
	 * @return the bens direitos requerente, or <code>null</code> if a bens direitos requerente with the primary key could not be found
	 */
	public static BensDireitosRequerente fetchByPrimaryKey(long bemId) {
		return getPersistence().fetchByPrimaryKey(bemId);
	}

	/**
	 * Returns all the bens direitos requerentes.
	 *
	 * @return the bens direitos requerentes
	 */
	public static List<BensDireitosRequerente> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the bens direitos requerentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @return the range of bens direitos requerentes
	 */
	public static List<BensDireitosRequerente> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the bens direitos requerentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bens direitos requerentes
	 */
	public static List<BensDireitosRequerente> findAll(
		int start, int end,
		OrderByComparator<BensDireitosRequerente> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bens direitos requerentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bens direitos requerentes
	 */
	public static List<BensDireitosRequerente> findAll(
		int start, int end,
		OrderByComparator<BensDireitosRequerente> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the bens direitos requerentes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of bens direitos requerentes.
	 *
	 * @return the number of bens direitos requerentes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BensDireitosRequerentePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		BensDireitosRequerentePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile BensDireitosRequerentePersistence _persistence;

}