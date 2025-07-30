/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the credito transacionado service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.CreditoTransacionadoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreditoTransacionadoPersistence
 * @generated
 */
public class CreditoTransacionadoUtil {

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
	public static void clearCache(CreditoTransacionado creditoTransacionado) {
		getPersistence().clearCache(creditoTransacionado);
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
	public static Map<Serializable, CreditoTransacionado> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CreditoTransacionado> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CreditoTransacionado> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CreditoTransacionado> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CreditoTransacionado> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CreditoTransacionado update(
		CreditoTransacionado creditoTransacionado) {

		return getPersistence().update(creditoTransacionado);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CreditoTransacionado update(
		CreditoTransacionado creditoTransacionado,
		ServiceContext serviceContext) {

		return getPersistence().update(creditoTransacionado, serviceContext);
	}

	/**
	 * Returns all the credito transacionados where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching credito transacionados
	 */
	public static List<CreditoTransacionado> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the credito transacionados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @return the range of matching credito transacionados
	 */
	public static List<CreditoTransacionado> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the credito transacionados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching credito transacionados
	 */
	public static List<CreditoTransacionado> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CreditoTransacionado> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the credito transacionados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching credito transacionados
	 */
	public static List<CreditoTransacionado> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CreditoTransacionado> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first credito transacionado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a matching credito transacionado could not be found
	 */
	public static CreditoTransacionado findByUuid_First(
			String uuid,
			OrderByComparator<CreditoTransacionado> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchCreditoTransacionadoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first credito transacionado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credito transacionado, or <code>null</code> if a matching credito transacionado could not be found
	 */
	public static CreditoTransacionado fetchByUuid_First(
		String uuid,
		OrderByComparator<CreditoTransacionado> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last credito transacionado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a matching credito transacionado could not be found
	 */
	public static CreditoTransacionado findByUuid_Last(
			String uuid,
			OrderByComparator<CreditoTransacionado> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchCreditoTransacionadoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last credito transacionado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credito transacionado, or <code>null</code> if a matching credito transacionado could not be found
	 */
	public static CreditoTransacionado fetchByUuid_Last(
		String uuid,
		OrderByComparator<CreditoTransacionado> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the credito transacionados before and after the current credito transacionado in the ordered set where uuid = &#63;.
	 *
	 * @param creditoId the primary key of the current credito transacionado
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a credito transacionado with the primary key could not be found
	 */
	public static CreditoTransacionado[] findByUuid_PrevAndNext(
			long creditoId, String uuid,
			OrderByComparator<CreditoTransacionado> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchCreditoTransacionadoException {

		return getPersistence().findByUuid_PrevAndNext(
			creditoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the credito transacionados where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of credito transacionados where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching credito transacionados
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the credito transacionados where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching credito transacionados
	 */
	public static List<CreditoTransacionado> findByPropostaId(long propostaId) {
		return getPersistence().findByPropostaId(propostaId);
	}

	/**
	 * Returns a range of all the credito transacionados where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @return the range of matching credito transacionados
	 */
	public static List<CreditoTransacionado> findByPropostaId(
		long propostaId, int start, int end) {

		return getPersistence().findByPropostaId(propostaId, start, end);
	}

	/**
	 * Returns an ordered range of all the credito transacionados where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching credito transacionados
	 */
	public static List<CreditoTransacionado> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<CreditoTransacionado> orderByComparator) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the credito transacionados where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching credito transacionados
	 */
	public static List<CreditoTransacionado> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<CreditoTransacionado> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first credito transacionado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a matching credito transacionado could not be found
	 */
	public static CreditoTransacionado findByPropostaId_First(
			long propostaId,
			OrderByComparator<CreditoTransacionado> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchCreditoTransacionadoException {

		return getPersistence().findByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the first credito transacionado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credito transacionado, or <code>null</code> if a matching credito transacionado could not be found
	 */
	public static CreditoTransacionado fetchByPropostaId_First(
		long propostaId,
		OrderByComparator<CreditoTransacionado> orderByComparator) {

		return getPersistence().fetchByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last credito transacionado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a matching credito transacionado could not be found
	 */
	public static CreditoTransacionado findByPropostaId_Last(
			long propostaId,
			OrderByComparator<CreditoTransacionado> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchCreditoTransacionadoException {

		return getPersistence().findByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last credito transacionado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credito transacionado, or <code>null</code> if a matching credito transacionado could not be found
	 */
	public static CreditoTransacionado fetchByPropostaId_Last(
		long propostaId,
		OrderByComparator<CreditoTransacionado> orderByComparator) {

		return getPersistence().fetchByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the credito transacionados before and after the current credito transacionado in the ordered set where propostaId = &#63;.
	 *
	 * @param creditoId the primary key of the current credito transacionado
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a credito transacionado with the primary key could not be found
	 */
	public static CreditoTransacionado[] findByPropostaId_PrevAndNext(
			long creditoId, long propostaId,
			OrderByComparator<CreditoTransacionado> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchCreditoTransacionadoException {

		return getPersistence().findByPropostaId_PrevAndNext(
			creditoId, propostaId, orderByComparator);
	}

	/**
	 * Removes all the credito transacionados where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public static void removeByPropostaId(long propostaId) {
		getPersistence().removeByPropostaId(propostaId);
	}

	/**
	 * Returns the number of credito transacionados where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching credito transacionados
	 */
	public static int countByPropostaId(long propostaId) {
		return getPersistence().countByPropostaId(propostaId);
	}

	/**
	 * Caches the credito transacionado in the entity cache if it is enabled.
	 *
	 * @param creditoTransacionado the credito transacionado
	 */
	public static void cacheResult(CreditoTransacionado creditoTransacionado) {
		getPersistence().cacheResult(creditoTransacionado);
	}

	/**
	 * Caches the credito transacionados in the entity cache if it is enabled.
	 *
	 * @param creditoTransacionados the credito transacionados
	 */
	public static void cacheResult(
		List<CreditoTransacionado> creditoTransacionados) {

		getPersistence().cacheResult(creditoTransacionados);
	}

	/**
	 * Creates a new credito transacionado with the primary key. Does not add the credito transacionado to the database.
	 *
	 * @param creditoId the primary key for the new credito transacionado
	 * @return the new credito transacionado
	 */
	public static CreditoTransacionado create(long creditoId) {
		return getPersistence().create(creditoId);
	}

	/**
	 * Removes the credito transacionado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creditoId the primary key of the credito transacionado
	 * @return the credito transacionado that was removed
	 * @throws NoSuchCreditoTransacionadoException if a credito transacionado with the primary key could not be found
	 */
	public static CreditoTransacionado remove(long creditoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchCreditoTransacionadoException {

		return getPersistence().remove(creditoId);
	}

	public static CreditoTransacionado updateImpl(
		CreditoTransacionado creditoTransacionado) {

		return getPersistence().updateImpl(creditoTransacionado);
	}

	/**
	 * Returns the credito transacionado with the primary key or throws a <code>NoSuchCreditoTransacionadoException</code> if it could not be found.
	 *
	 * @param creditoId the primary key of the credito transacionado
	 * @return the credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a credito transacionado with the primary key could not be found
	 */
	public static CreditoTransacionado findByPrimaryKey(long creditoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchCreditoTransacionadoException {

		return getPersistence().findByPrimaryKey(creditoId);
	}

	/**
	 * Returns the credito transacionado with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creditoId the primary key of the credito transacionado
	 * @return the credito transacionado, or <code>null</code> if a credito transacionado with the primary key could not be found
	 */
	public static CreditoTransacionado fetchByPrimaryKey(long creditoId) {
		return getPersistence().fetchByPrimaryKey(creditoId);
	}

	/**
	 * Returns all the credito transacionados.
	 *
	 * @return the credito transacionados
	 */
	public static List<CreditoTransacionado> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the credito transacionados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @return the range of credito transacionados
	 */
	public static List<CreditoTransacionado> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the credito transacionados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of credito transacionados
	 */
	public static List<CreditoTransacionado> findAll(
		int start, int end,
		OrderByComparator<CreditoTransacionado> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the credito transacionados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of credito transacionados
	 */
	public static List<CreditoTransacionado> findAll(
		int start, int end,
		OrderByComparator<CreditoTransacionado> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the credito transacionados from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of credito transacionados.
	 *
	 * @return the number of credito transacionados
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CreditoTransacionadoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CreditoTransacionadoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CreditoTransacionadoPersistence _persistence;

}