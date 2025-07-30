/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the qualificacao completa service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.QualificacaoCompletaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualificacaoCompletaPersistence
 * @generated
 */
public class QualificacaoCompletaUtil {

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
	public static void clearCache(QualificacaoCompleta qualificacaoCompleta) {
		getPersistence().clearCache(qualificacaoCompleta);
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
	public static Map<Serializable, QualificacaoCompleta> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QualificacaoCompleta> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QualificacaoCompleta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QualificacaoCompleta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QualificacaoCompleta> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QualificacaoCompleta update(
		QualificacaoCompleta qualificacaoCompleta) {

		return getPersistence().update(qualificacaoCompleta);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QualificacaoCompleta update(
		QualificacaoCompleta qualificacaoCompleta,
		ServiceContext serviceContext) {

		return getPersistence().update(qualificacaoCompleta, serviceContext);
	}

	/**
	 * Returns all the qualificacao completas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching qualificacao completas
	 */
	public static List<QualificacaoCompleta> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the qualificacao completas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @return the range of matching qualificacao completas
	 */
	public static List<QualificacaoCompleta> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the qualificacao completas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qualificacao completas
	 */
	public static List<QualificacaoCompleta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QualificacaoCompleta> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the qualificacao completas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching qualificacao completas
	 */
	public static List<QualificacaoCompleta> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QualificacaoCompleta> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first qualificacao completa in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualificacao completa
	 * @throws NoSuchQualificacaoCompletaException if a matching qualificacao completa could not be found
	 */
	public static QualificacaoCompleta findByUuid_First(
			String uuid,
			OrderByComparator<QualificacaoCompleta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchQualificacaoCompletaException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first qualificacao completa in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualificacao completa, or <code>null</code> if a matching qualificacao completa could not be found
	 */
	public static QualificacaoCompleta fetchByUuid_First(
		String uuid,
		OrderByComparator<QualificacaoCompleta> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last qualificacao completa in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualificacao completa
	 * @throws NoSuchQualificacaoCompletaException if a matching qualificacao completa could not be found
	 */
	public static QualificacaoCompleta findByUuid_Last(
			String uuid,
			OrderByComparator<QualificacaoCompleta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchQualificacaoCompletaException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last qualificacao completa in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualificacao completa, or <code>null</code> if a matching qualificacao completa could not be found
	 */
	public static QualificacaoCompleta fetchByUuid_Last(
		String uuid,
		OrderByComparator<QualificacaoCompleta> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the qualificacao completas before and after the current qualificacao completa in the ordered set where uuid = &#63;.
	 *
	 * @param qualificacaoId the primary key of the current qualificacao completa
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qualificacao completa
	 * @throws NoSuchQualificacaoCompletaException if a qualificacao completa with the primary key could not be found
	 */
	public static QualificacaoCompleta[] findByUuid_PrevAndNext(
			long qualificacaoId, String uuid,
			OrderByComparator<QualificacaoCompleta> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchQualificacaoCompletaException {

		return getPersistence().findByUuid_PrevAndNext(
			qualificacaoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the qualificacao completas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of qualificacao completas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching qualificacao completas
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the qualificacao completa in the entity cache if it is enabled.
	 *
	 * @param qualificacaoCompleta the qualificacao completa
	 */
	public static void cacheResult(QualificacaoCompleta qualificacaoCompleta) {
		getPersistence().cacheResult(qualificacaoCompleta);
	}

	/**
	 * Caches the qualificacao completas in the entity cache if it is enabled.
	 *
	 * @param qualificacaoCompletas the qualificacao completas
	 */
	public static void cacheResult(
		List<QualificacaoCompleta> qualificacaoCompletas) {

		getPersistence().cacheResult(qualificacaoCompletas);
	}

	/**
	 * Creates a new qualificacao completa with the primary key. Does not add the qualificacao completa to the database.
	 *
	 * @param qualificacaoId the primary key for the new qualificacao completa
	 * @return the new qualificacao completa
	 */
	public static QualificacaoCompleta create(long qualificacaoId) {
		return getPersistence().create(qualificacaoId);
	}

	/**
	 * Removes the qualificacao completa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualificacaoId the primary key of the qualificacao completa
	 * @return the qualificacao completa that was removed
	 * @throws NoSuchQualificacaoCompletaException if a qualificacao completa with the primary key could not be found
	 */
	public static QualificacaoCompleta remove(long qualificacaoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchQualificacaoCompletaException {

		return getPersistence().remove(qualificacaoId);
	}

	public static QualificacaoCompleta updateImpl(
		QualificacaoCompleta qualificacaoCompleta) {

		return getPersistence().updateImpl(qualificacaoCompleta);
	}

	/**
	 * Returns the qualificacao completa with the primary key or throws a <code>NoSuchQualificacaoCompletaException</code> if it could not be found.
	 *
	 * @param qualificacaoId the primary key of the qualificacao completa
	 * @return the qualificacao completa
	 * @throws NoSuchQualificacaoCompletaException if a qualificacao completa with the primary key could not be found
	 */
	public static QualificacaoCompleta findByPrimaryKey(long qualificacaoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchQualificacaoCompletaException {

		return getPersistence().findByPrimaryKey(qualificacaoId);
	}

	/**
	 * Returns the qualificacao completa with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualificacaoId the primary key of the qualificacao completa
	 * @return the qualificacao completa, or <code>null</code> if a qualificacao completa with the primary key could not be found
	 */
	public static QualificacaoCompleta fetchByPrimaryKey(long qualificacaoId) {
		return getPersistence().fetchByPrimaryKey(qualificacaoId);
	}

	/**
	 * Returns all the qualificacao completas.
	 *
	 * @return the qualificacao completas
	 */
	public static List<QualificacaoCompleta> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the qualificacao completas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @return the range of qualificacao completas
	 */
	public static List<QualificacaoCompleta> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the qualificacao completas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qualificacao completas
	 */
	public static List<QualificacaoCompleta> findAll(
		int start, int end,
		OrderByComparator<QualificacaoCompleta> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the qualificacao completas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of qualificacao completas
	 */
	public static List<QualificacaoCompleta> findAll(
		int start, int end,
		OrderByComparator<QualificacaoCompleta> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the qualificacao completas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of qualificacao completas.
	 *
	 * @return the number of qualificacao completas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QualificacaoCompletaPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		QualificacaoCompletaPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QualificacaoCompletaPersistence _persistence;

}