/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.Proposta;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the proposta service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.PropostaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PropostaPersistence
 * @generated
 */
public class PropostaUtil {

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
	public static void clearCache(Proposta proposta) {
		getPersistence().clearCache(proposta);
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
	public static Map<Serializable, Proposta> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Proposta> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Proposta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Proposta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Proposta> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Proposta update(Proposta proposta) {
		return getPersistence().update(proposta);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Proposta update(
		Proposta proposta, ServiceContext serviceContext) {

		return getPersistence().update(proposta, serviceContext);
	}

	/**
	 * Returns all the propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching propostas
	 */
	public static List<Proposta> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @return the range of matching propostas
	 */
	public static List<Proposta> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching propostas
	 */
	public static List<Proposta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Proposta> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching propostas
	 */
	public static List<Proposta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Proposta> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proposta
	 * @throws NoSuchPropostaException if a matching proposta could not be found
	 */
	public static Proposta findByUuid_First(
			String uuid, OrderByComparator<Proposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchPropostaException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	public static Proposta fetchByUuid_First(
		String uuid, OrderByComparator<Proposta> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proposta
	 * @throws NoSuchPropostaException if a matching proposta could not be found
	 */
	public static Proposta findByUuid_Last(
			String uuid, OrderByComparator<Proposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchPropostaException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	public static Proposta fetchByUuid_Last(
		String uuid, OrderByComparator<Proposta> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the propostas before and after the current proposta in the ordered set where uuid = &#63;.
	 *
	 * @param propostaId the primary key of the current proposta
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next proposta
	 * @throws NoSuchPropostaException if a proposta with the primary key could not be found
	 */
	public static Proposta[] findByUuid_PrevAndNext(
			long propostaId, String uuid,
			OrderByComparator<Proposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchPropostaException {

		return getPersistence().findByUuid_PrevAndNext(
			propostaId, uuid, orderByComparator);
	}

	/**
	 * Removes all the propostas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching propostas
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the proposta where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchPropostaException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching proposta
	 * @throws NoSuchPropostaException if a matching proposta could not be found
	 */
	public static Proposta findByUUID_G(String uuid, long groupId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchPropostaException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the proposta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	public static Proposta fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the proposta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	public static Proposta fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the proposta where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the proposta that was removed
	 */
	public static Proposta removeByUUID_G(String uuid, long groupId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchPropostaException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of propostas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching propostas
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the propostas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching propostas
	 */
	public static List<Proposta> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the propostas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @return the range of matching propostas
	 */
	public static List<Proposta> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the propostas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching propostas
	 */
	public static List<Proposta> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Proposta> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the propostas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching propostas
	 */
	public static List<Proposta> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Proposta> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first proposta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proposta
	 * @throws NoSuchPropostaException if a matching proposta could not be found
	 */
	public static Proposta findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Proposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchPropostaException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first proposta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	public static Proposta fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Proposta> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last proposta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proposta
	 * @throws NoSuchPropostaException if a matching proposta could not be found
	 */
	public static Proposta findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Proposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchPropostaException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last proposta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	public static Proposta fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Proposta> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the propostas before and after the current proposta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param propostaId the primary key of the current proposta
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next proposta
	 * @throws NoSuchPropostaException if a proposta with the primary key could not be found
	 */
	public static Proposta[] findByUuid_C_PrevAndNext(
			long propostaId, String uuid, long companyId,
			OrderByComparator<Proposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchPropostaException {

		return getPersistence().findByUuid_C_PrevAndNext(
			propostaId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the propostas where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of propostas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching propostas
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the propostas where cpfCnpj = &#63;.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @return the matching propostas
	 */
	public static List<Proposta> findByCpfCnpj(String cpfCnpj) {
		return getPersistence().findByCpfCnpj(cpfCnpj);
	}

	/**
	 * Returns a range of all the propostas where cpfCnpj = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @return the range of matching propostas
	 */
	public static List<Proposta> findByCpfCnpj(
		String cpfCnpj, int start, int end) {

		return getPersistence().findByCpfCnpj(cpfCnpj, start, end);
	}

	/**
	 * Returns an ordered range of all the propostas where cpfCnpj = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching propostas
	 */
	public static List<Proposta> findByCpfCnpj(
		String cpfCnpj, int start, int end,
		OrderByComparator<Proposta> orderByComparator) {

		return getPersistence().findByCpfCnpj(
			cpfCnpj, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the propostas where cpfCnpj = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching propostas
	 */
	public static List<Proposta> findByCpfCnpj(
		String cpfCnpj, int start, int end,
		OrderByComparator<Proposta> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByCpfCnpj(
			cpfCnpj, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first proposta in the ordered set where cpfCnpj = &#63;.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proposta
	 * @throws NoSuchPropostaException if a matching proposta could not be found
	 */
	public static Proposta findByCpfCnpj_First(
			String cpfCnpj, OrderByComparator<Proposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchPropostaException {

		return getPersistence().findByCpfCnpj_First(cpfCnpj, orderByComparator);
	}

	/**
	 * Returns the first proposta in the ordered set where cpfCnpj = &#63;.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	public static Proposta fetchByCpfCnpj_First(
		String cpfCnpj, OrderByComparator<Proposta> orderByComparator) {

		return getPersistence().fetchByCpfCnpj_First(
			cpfCnpj, orderByComparator);
	}

	/**
	 * Returns the last proposta in the ordered set where cpfCnpj = &#63;.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proposta
	 * @throws NoSuchPropostaException if a matching proposta could not be found
	 */
	public static Proposta findByCpfCnpj_Last(
			String cpfCnpj, OrderByComparator<Proposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchPropostaException {

		return getPersistence().findByCpfCnpj_Last(cpfCnpj, orderByComparator);
	}

	/**
	 * Returns the last proposta in the ordered set where cpfCnpj = &#63;.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	public static Proposta fetchByCpfCnpj_Last(
		String cpfCnpj, OrderByComparator<Proposta> orderByComparator) {

		return getPersistence().fetchByCpfCnpj_Last(cpfCnpj, orderByComparator);
	}

	/**
	 * Returns the propostas before and after the current proposta in the ordered set where cpfCnpj = &#63;.
	 *
	 * @param propostaId the primary key of the current proposta
	 * @param cpfCnpj the cpf cnpj
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next proposta
	 * @throws NoSuchPropostaException if a proposta with the primary key could not be found
	 */
	public static Proposta[] findByCpfCnpj_PrevAndNext(
			long propostaId, String cpfCnpj,
			OrderByComparator<Proposta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchPropostaException {

		return getPersistence().findByCpfCnpj_PrevAndNext(
			propostaId, cpfCnpj, orderByComparator);
	}

	/**
	 * Removes all the propostas where cpfCnpj = &#63; from the database.
	 *
	 * @param cpfCnpj the cpf cnpj
	 */
	public static void removeByCpfCnpj(String cpfCnpj) {
		getPersistence().removeByCpfCnpj(cpfCnpj);
	}

	/**
	 * Returns the number of propostas where cpfCnpj = &#63;.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @return the number of matching propostas
	 */
	public static int countByCpfCnpj(String cpfCnpj) {
		return getPersistence().countByCpfCnpj(cpfCnpj);
	}

	/**
	 * Caches the proposta in the entity cache if it is enabled.
	 *
	 * @param proposta the proposta
	 */
	public static void cacheResult(Proposta proposta) {
		getPersistence().cacheResult(proposta);
	}

	/**
	 * Caches the propostas in the entity cache if it is enabled.
	 *
	 * @param propostas the propostas
	 */
	public static void cacheResult(List<Proposta> propostas) {
		getPersistence().cacheResult(propostas);
	}

	/**
	 * Creates a new proposta with the primary key. Does not add the proposta to the database.
	 *
	 * @param propostaId the primary key for the new proposta
	 * @return the new proposta
	 */
	public static Proposta create(long propostaId) {
		return getPersistence().create(propostaId);
	}

	/**
	 * Removes the proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param propostaId the primary key of the proposta
	 * @return the proposta that was removed
	 * @throws NoSuchPropostaException if a proposta with the primary key could not be found
	 */
	public static Proposta remove(long propostaId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchPropostaException {

		return getPersistence().remove(propostaId);
	}

	public static Proposta updateImpl(Proposta proposta) {
		return getPersistence().updateImpl(proposta);
	}

	/**
	 * Returns the proposta with the primary key or throws a <code>NoSuchPropostaException</code> if it could not be found.
	 *
	 * @param propostaId the primary key of the proposta
	 * @return the proposta
	 * @throws NoSuchPropostaException if a proposta with the primary key could not be found
	 */
	public static Proposta findByPrimaryKey(long propostaId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchPropostaException {

		return getPersistence().findByPrimaryKey(propostaId);
	}

	/**
	 * Returns the proposta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param propostaId the primary key of the proposta
	 * @return the proposta, or <code>null</code> if a proposta with the primary key could not be found
	 */
	public static Proposta fetchByPrimaryKey(long propostaId) {
		return getPersistence().fetchByPrimaryKey(propostaId);
	}

	/**
	 * Returns all the propostas.
	 *
	 * @return the propostas
	 */
	public static List<Proposta> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @return the range of propostas
	 */
	public static List<Proposta> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of propostas
	 */
	public static List<Proposta> findAll(
		int start, int end, OrderByComparator<Proposta> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of propostas
	 */
	public static List<Proposta> findAll(
		int start, int end, OrderByComparator<Proposta> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the propostas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of propostas.
	 *
	 * @return the number of propostas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PropostaPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(PropostaPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile PropostaPersistence _persistence;

}