/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the comprovante honorario service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.ComprovanteHonorarioPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ComprovanteHonorarioPersistence
 * @generated
 */
public class ComprovanteHonorarioUtil {

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
	public static void clearCache(ComprovanteHonorario comprovanteHonorario) {
		getPersistence().clearCache(comprovanteHonorario);
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
	public static Map<Serializable, ComprovanteHonorario> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ComprovanteHonorario> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ComprovanteHonorario> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ComprovanteHonorario> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ComprovanteHonorario> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ComprovanteHonorario update(
		ComprovanteHonorario comprovanteHonorario) {

		return getPersistence().update(comprovanteHonorario);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ComprovanteHonorario update(
		ComprovanteHonorario comprovanteHonorario,
		ServiceContext serviceContext) {

		return getPersistence().update(comprovanteHonorario, serviceContext);
	}

	/**
	 * Returns all the comprovante honorarios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching comprovante honorarios
	 */
	public static List<ComprovanteHonorario> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the comprovante honorarios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @return the range of matching comprovante honorarios
	 */
	public static List<ComprovanteHonorario> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the comprovante honorarios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching comprovante honorarios
	 */
	public static List<ComprovanteHonorario> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ComprovanteHonorario> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the comprovante honorarios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching comprovante honorarios
	 */
	public static List<ComprovanteHonorario> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ComprovanteHonorario> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first comprovante honorario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a matching comprovante honorario could not be found
	 */
	public static ComprovanteHonorario findByUuid_First(
			String uuid,
			OrderByComparator<ComprovanteHonorario> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchComprovanteHonorarioException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first comprovante honorario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching comprovante honorario, or <code>null</code> if a matching comprovante honorario could not be found
	 */
	public static ComprovanteHonorario fetchByUuid_First(
		String uuid,
		OrderByComparator<ComprovanteHonorario> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last comprovante honorario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a matching comprovante honorario could not be found
	 */
	public static ComprovanteHonorario findByUuid_Last(
			String uuid,
			OrderByComparator<ComprovanteHonorario> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchComprovanteHonorarioException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last comprovante honorario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching comprovante honorario, or <code>null</code> if a matching comprovante honorario could not be found
	 */
	public static ComprovanteHonorario fetchByUuid_Last(
		String uuid,
		OrderByComparator<ComprovanteHonorario> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the comprovante honorarios before and after the current comprovante honorario in the ordered set where uuid = &#63;.
	 *
	 * @param comprovanteId the primary key of the current comprovante honorario
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a comprovante honorario with the primary key could not be found
	 */
	public static ComprovanteHonorario[] findByUuid_PrevAndNext(
			long comprovanteId, String uuid,
			OrderByComparator<ComprovanteHonorario> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchComprovanteHonorarioException {

		return getPersistence().findByUuid_PrevAndNext(
			comprovanteId, uuid, orderByComparator);
	}

	/**
	 * Removes all the comprovante honorarios where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of comprovante honorarios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching comprovante honorarios
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the comprovante honorarios where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching comprovante honorarios
	 */
	public static List<ComprovanteHonorario> findByPropostaId(long propostaId) {
		return getPersistence().findByPropostaId(propostaId);
	}

	/**
	 * Returns a range of all the comprovante honorarios where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @return the range of matching comprovante honorarios
	 */
	public static List<ComprovanteHonorario> findByPropostaId(
		long propostaId, int start, int end) {

		return getPersistence().findByPropostaId(propostaId, start, end);
	}

	/**
	 * Returns an ordered range of all the comprovante honorarios where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching comprovante honorarios
	 */
	public static List<ComprovanteHonorario> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<ComprovanteHonorario> orderByComparator) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the comprovante honorarios where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching comprovante honorarios
	 */
	public static List<ComprovanteHonorario> findByPropostaId(
		long propostaId, int start, int end,
		OrderByComparator<ComprovanteHonorario> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPropostaId(
			propostaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first comprovante honorario in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a matching comprovante honorario could not be found
	 */
	public static ComprovanteHonorario findByPropostaId_First(
			long propostaId,
			OrderByComparator<ComprovanteHonorario> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchComprovanteHonorarioException {

		return getPersistence().findByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the first comprovante honorario in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching comprovante honorario, or <code>null</code> if a matching comprovante honorario could not be found
	 */
	public static ComprovanteHonorario fetchByPropostaId_First(
		long propostaId,
		OrderByComparator<ComprovanteHonorario> orderByComparator) {

		return getPersistence().fetchByPropostaId_First(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last comprovante honorario in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a matching comprovante honorario could not be found
	 */
	public static ComprovanteHonorario findByPropostaId_Last(
			long propostaId,
			OrderByComparator<ComprovanteHonorario> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchComprovanteHonorarioException {

		return getPersistence().findByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the last comprovante honorario in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching comprovante honorario, or <code>null</code> if a matching comprovante honorario could not be found
	 */
	public static ComprovanteHonorario fetchByPropostaId_Last(
		long propostaId,
		OrderByComparator<ComprovanteHonorario> orderByComparator) {

		return getPersistence().fetchByPropostaId_Last(
			propostaId, orderByComparator);
	}

	/**
	 * Returns the comprovante honorarios before and after the current comprovante honorario in the ordered set where propostaId = &#63;.
	 *
	 * @param comprovanteId the primary key of the current comprovante honorario
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a comprovante honorario with the primary key could not be found
	 */
	public static ComprovanteHonorario[] findByPropostaId_PrevAndNext(
			long comprovanteId, long propostaId,
			OrderByComparator<ComprovanteHonorario> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchComprovanteHonorarioException {

		return getPersistence().findByPropostaId_PrevAndNext(
			comprovanteId, propostaId, orderByComparator);
	}

	/**
	 * Removes all the comprovante honorarios where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public static void removeByPropostaId(long propostaId) {
		getPersistence().removeByPropostaId(propostaId);
	}

	/**
	 * Returns the number of comprovante honorarios where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching comprovante honorarios
	 */
	public static int countByPropostaId(long propostaId) {
		return getPersistence().countByPropostaId(propostaId);
	}

	/**
	 * Caches the comprovante honorario in the entity cache if it is enabled.
	 *
	 * @param comprovanteHonorario the comprovante honorario
	 */
	public static void cacheResult(ComprovanteHonorario comprovanteHonorario) {
		getPersistence().cacheResult(comprovanteHonorario);
	}

	/**
	 * Caches the comprovante honorarios in the entity cache if it is enabled.
	 *
	 * @param comprovanteHonorarios the comprovante honorarios
	 */
	public static void cacheResult(
		List<ComprovanteHonorario> comprovanteHonorarios) {

		getPersistence().cacheResult(comprovanteHonorarios);
	}

	/**
	 * Creates a new comprovante honorario with the primary key. Does not add the comprovante honorario to the database.
	 *
	 * @param comprovanteId the primary key for the new comprovante honorario
	 * @return the new comprovante honorario
	 */
	public static ComprovanteHonorario create(long comprovanteId) {
		return getPersistence().create(comprovanteId);
	}

	/**
	 * Removes the comprovante honorario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param comprovanteId the primary key of the comprovante honorario
	 * @return the comprovante honorario that was removed
	 * @throws NoSuchComprovanteHonorarioException if a comprovante honorario with the primary key could not be found
	 */
	public static ComprovanteHonorario remove(long comprovanteId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchComprovanteHonorarioException {

		return getPersistence().remove(comprovanteId);
	}

	public static ComprovanteHonorario updateImpl(
		ComprovanteHonorario comprovanteHonorario) {

		return getPersistence().updateImpl(comprovanteHonorario);
	}

	/**
	 * Returns the comprovante honorario with the primary key or throws a <code>NoSuchComprovanteHonorarioException</code> if it could not be found.
	 *
	 * @param comprovanteId the primary key of the comprovante honorario
	 * @return the comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a comprovante honorario with the primary key could not be found
	 */
	public static ComprovanteHonorario findByPrimaryKey(long comprovanteId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchComprovanteHonorarioException {

		return getPersistence().findByPrimaryKey(comprovanteId);
	}

	/**
	 * Returns the comprovante honorario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param comprovanteId the primary key of the comprovante honorario
	 * @return the comprovante honorario, or <code>null</code> if a comprovante honorario with the primary key could not be found
	 */
	public static ComprovanteHonorario fetchByPrimaryKey(long comprovanteId) {
		return getPersistence().fetchByPrimaryKey(comprovanteId);
	}

	/**
	 * Returns all the comprovante honorarios.
	 *
	 * @return the comprovante honorarios
	 */
	public static List<ComprovanteHonorario> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the comprovante honorarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @return the range of comprovante honorarios
	 */
	public static List<ComprovanteHonorario> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the comprovante honorarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of comprovante honorarios
	 */
	public static List<ComprovanteHonorario> findAll(
		int start, int end,
		OrderByComparator<ComprovanteHonorario> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the comprovante honorarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of comprovante honorarios
	 */
	public static List<ComprovanteHonorario> findAll(
		int start, int end,
		OrderByComparator<ComprovanteHonorario> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the comprovante honorarios from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of comprovante honorarios.
	 *
	 * @return the number of comprovante honorarios
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ComprovanteHonorarioPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ComprovanteHonorarioPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ComprovanteHonorarioPersistence _persistence;

}