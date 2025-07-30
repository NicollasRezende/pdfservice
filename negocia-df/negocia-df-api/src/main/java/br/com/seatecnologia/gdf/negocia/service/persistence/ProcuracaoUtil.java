/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.Procuracao;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the procuracao service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.ProcuracaoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProcuracaoPersistence
 * @generated
 */
public class ProcuracaoUtil {

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
	public static void clearCache(Procuracao procuracao) {
		getPersistence().clearCache(procuracao);
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
	public static Map<Serializable, Procuracao> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Procuracao> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Procuracao> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Procuracao> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Procuracao> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Procuracao update(Procuracao procuracao) {
		return getPersistence().update(procuracao);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Procuracao update(
		Procuracao procuracao, ServiceContext serviceContext) {

		return getPersistence().update(procuracao, serviceContext);
	}

	/**
	 * Returns all the procuracaos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching procuracaos
	 */
	public static List<Procuracao> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the procuracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @return the range of matching procuracaos
	 */
	public static List<Procuracao> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the procuracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching procuracaos
	 */
	public static List<Procuracao> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Procuracao> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the procuracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching procuracaos
	 */
	public static List<Procuracao> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Procuracao> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first procuracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching procuracao
	 * @throws NoSuchProcuracaoException if a matching procuracao could not be found
	 */
	public static Procuracao findByUuid_First(
			String uuid, OrderByComparator<Procuracao> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchProcuracaoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first procuracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching procuracao, or <code>null</code> if a matching procuracao could not be found
	 */
	public static Procuracao fetchByUuid_First(
		String uuid, OrderByComparator<Procuracao> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last procuracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching procuracao
	 * @throws NoSuchProcuracaoException if a matching procuracao could not be found
	 */
	public static Procuracao findByUuid_Last(
			String uuid, OrderByComparator<Procuracao> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchProcuracaoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last procuracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching procuracao, or <code>null</code> if a matching procuracao could not be found
	 */
	public static Procuracao fetchByUuid_Last(
		String uuid, OrderByComparator<Procuracao> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the procuracaos before and after the current procuracao in the ordered set where uuid = &#63;.
	 *
	 * @param procuracaoId the primary key of the current procuracao
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next procuracao
	 * @throws NoSuchProcuracaoException if a procuracao with the primary key could not be found
	 */
	public static Procuracao[] findByUuid_PrevAndNext(
			long procuracaoId, String uuid,
			OrderByComparator<Procuracao> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchProcuracaoException {

		return getPersistence().findByUuid_PrevAndNext(
			procuracaoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the procuracaos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of procuracaos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching procuracaos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the procuracaos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching procuracaos
	 */
	public static List<Procuracao> findByPropostaId(long propostaId) {
		return getPersistence().findByPropostaId(propostaId);
	}

	/**
	 * Returns a range of all the procuracaos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @return the range of matching procuracaos
	 */
	public static List<Procuracao> findByPropostaId(
		long propostaId, int start, int end) {

		return getPersistence().findByPropostaId(propostaId, start, end);
	}

	/**
	 * Returns an ordered range of all the procuracaos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching procuracaos
	 */
	public static List<Procuracao> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<Procuracao> orderByComparator) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the procuracaos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching procuracaos
	 */
	public static List<Procuracao> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<Procuracao> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first procuracao in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching procuracao
	 * @throws NoSuchProcuracaoException if a matching procuracao could not be found
	 */
	public static Procuracao findByPropostaId_First(
			long propostaId, OrderByComparator<Procuracao> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchProcuracaoException {

		return getPersistence().findByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the first procuracao in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching procuracao, or <code>null</code> if a matching procuracao could not be found
	 */
	public static Procuracao fetchByPropostaId_First(
		long propostaId, OrderByComparator<Procuracao> orderByComparator) {

		return getPersistence().fetchByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last procuracao in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching procuracao
	 * @throws NoSuchProcuracaoException if a matching procuracao could not be found
	 */
	public static Procuracao findByPropostaId_Last(
			long propostaId, OrderByComparator<Procuracao> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchProcuracaoException {

		return getPersistence().findByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last procuracao in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching procuracao, or <code>null</code> if a matching procuracao could not be found
	 */
	public static Procuracao fetchByPropostaId_Last(
		long propostaId, OrderByComparator<Procuracao> orderByComparator) {

		return getPersistence().fetchByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the procuracaos before and after the current procuracao in the ordered set where propostaId = &#63;.
	 *
	 * @param procuracaoId the primary key of the current procuracao
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next procuracao
	 * @throws NoSuchProcuracaoException if a procuracao with the primary key could not be found
	 */
	public static Procuracao[] findByPropostaId_PrevAndNext(
			long procuracaoId, long propostaId,
			OrderByComparator<Procuracao> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchProcuracaoException {

		return getPersistence().findByPropostaId_PrevAndNext(
			procuracaoId, propostaId, orderByComparator);
	}

	/**
	 * Removes all the procuracaos where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public static void removeByPropostaId(long propostaId) {
		getPersistence().removeByPropostaId(propostaId);
	}

	/**
	 * Returns the number of procuracaos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching procuracaos
	 */
	public static int countByPropostaId(long propostaId) {
		return getPersistence().countByPropostaId(propostaId);
	}

	/**
	 * Caches the procuracao in the entity cache if it is enabled.
	 *
	 * @param procuracao the procuracao
	 */
	public static void cacheResult(Procuracao procuracao) {
		getPersistence().cacheResult(procuracao);
	}

	/**
	 * Caches the procuracaos in the entity cache if it is enabled.
	 *
	 * @param procuracaos the procuracaos
	 */
	public static void cacheResult(List<Procuracao> procuracaos) {
		getPersistence().cacheResult(procuracaos);
	}

	/**
	 * Creates a new procuracao with the primary key. Does not add the procuracao to the database.
	 *
	 * @param procuracaoId the primary key for the new procuracao
	 * @return the new procuracao
	 */
	public static Procuracao create(long procuracaoId) {
		return getPersistence().create(procuracaoId);
	}

	/**
	 * Removes the procuracao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param procuracaoId the primary key of the procuracao
	 * @return the procuracao that was removed
	 * @throws NoSuchProcuracaoException if a procuracao with the primary key could not be found
	 */
	public static Procuracao remove(long procuracaoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchProcuracaoException {

		return getPersistence().remove(procuracaoId);
	}

	public static Procuracao updateImpl(Procuracao procuracao) {
		return getPersistence().updateImpl(procuracao);
	}

	/**
	 * Returns the procuracao with the primary key or throws a <code>NoSuchProcuracaoException</code> if it could not be found.
	 *
	 * @param procuracaoId the primary key of the procuracao
	 * @return the procuracao
	 * @throws NoSuchProcuracaoException if a procuracao with the primary key could not be found
	 */
	public static Procuracao findByPrimaryKey(long procuracaoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchProcuracaoException {

		return getPersistence().findByPrimaryKey(procuracaoId);
	}

	/**
	 * Returns the procuracao with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param procuracaoId the primary key of the procuracao
	 * @return the procuracao, or <code>null</code> if a procuracao with the primary key could not be found
	 */
	public static Procuracao fetchByPrimaryKey(long procuracaoId) {
		return getPersistence().fetchByPrimaryKey(procuracaoId);
	}

	/**
	 * Returns all the procuracaos.
	 *
	 * @return the procuracaos
	 */
	public static List<Procuracao> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the procuracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @return the range of procuracaos
	 */
	public static List<Procuracao> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the procuracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of procuracaos
	 */
	public static List<Procuracao> findAll(
		int start, int end, OrderByComparator<Procuracao> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the procuracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of procuracaos
	 */
	public static List<Procuracao> findAll(
		int start, int end, OrderByComparator<Procuracao> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the procuracaos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of procuracaos.
	 *
	 * @return the number of procuracaos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProcuracaoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(ProcuracaoPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile ProcuracaoPersistence _persistence;

}