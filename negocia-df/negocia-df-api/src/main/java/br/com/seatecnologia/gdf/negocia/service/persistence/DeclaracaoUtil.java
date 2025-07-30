/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.model.Declaracao;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the declaracao service. This utility wraps <code>br.com.seatecnologia.gdf.negocia.service.persistence.impl.DeclaracaoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeclaracaoPersistence
 * @generated
 */
public class DeclaracaoUtil {

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
	public static void clearCache(Declaracao declaracao) {
		getPersistence().clearCache(declaracao);
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
	public static Map<Serializable, Declaracao> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Declaracao> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Declaracao> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Declaracao> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Declaracao> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Declaracao update(Declaracao declaracao) {
		return getPersistence().update(declaracao);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Declaracao update(
		Declaracao declaracao, ServiceContext serviceContext) {

		return getPersistence().update(declaracao, serviceContext);
	}

	/**
	 * Returns all the declaracaos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching declaracaos
	 */
	public static List<Declaracao> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the declaracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @return the range of matching declaracaos
	 */
	public static List<Declaracao> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the declaracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching declaracaos
	 */
	public static List<Declaracao> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Declaracao> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the declaracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching declaracaos
	 */
	public static List<Declaracao> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Declaracao> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first declaracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching declaracao
	 * @throws NoSuchDeclaracaoException if a matching declaracao could not be found
	 */
	public static Declaracao findByUuid_First(
			String uuid, OrderByComparator<Declaracao> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDeclaracaoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first declaracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching declaracao, or <code>null</code> if a matching declaracao could not be found
	 */
	public static Declaracao fetchByUuid_First(
		String uuid, OrderByComparator<Declaracao> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last declaracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching declaracao
	 * @throws NoSuchDeclaracaoException if a matching declaracao could not be found
	 */
	public static Declaracao findByUuid_Last(
			String uuid, OrderByComparator<Declaracao> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDeclaracaoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last declaracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching declaracao, or <code>null</code> if a matching declaracao could not be found
	 */
	public static Declaracao fetchByUuid_Last(
		String uuid, OrderByComparator<Declaracao> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the declaracaos before and after the current declaracao in the ordered set where uuid = &#63;.
	 *
	 * @param declaracaoId the primary key of the current declaracao
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next declaracao
	 * @throws NoSuchDeclaracaoException if a declaracao with the primary key could not be found
	 */
	public static Declaracao[] findByUuid_PrevAndNext(
			long declaracaoId, String uuid,
			OrderByComparator<Declaracao> orderByComparator)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDeclaracaoException {

		return getPersistence().findByUuid_PrevAndNext(
			declaracaoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the declaracaos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of declaracaos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching declaracaos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the declaracao where propostaId = &#63; or throws a <code>NoSuchDeclaracaoException</code> if it could not be found.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching declaracao
	 * @throws NoSuchDeclaracaoException if a matching declaracao could not be found
	 */
	public static Declaracao findByPropostaId(long propostaId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDeclaracaoException {

		return getPersistence().findByPropostaId(propostaId);
	}

	/**
	 * Returns the declaracao where propostaId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching declaracao, or <code>null</code> if a matching declaracao could not be found
	 */
	public static Declaracao fetchByPropostaId(long propostaId) {
		return getPersistence().fetchByPropostaId(propostaId);
	}

	/**
	 * Returns the declaracao where propostaId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param propostaId the proposta ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching declaracao, or <code>null</code> if a matching declaracao could not be found
	 */
	public static Declaracao fetchByPropostaId(
		long propostaId, boolean useFinderCache) {

		return getPersistence().fetchByPropostaId(propostaId, useFinderCache);
	}

	/**
	 * Removes the declaracao where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 * @return the declaracao that was removed
	 */
	public static Declaracao removeByPropostaId(long propostaId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDeclaracaoException {

		return getPersistence().removeByPropostaId(propostaId);
	}

	/**
	 * Returns the number of declaracaos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching declaracaos
	 */
	public static int countByPropostaId(long propostaId) {
		return getPersistence().countByPropostaId(propostaId);
	}

	/**
	 * Caches the declaracao in the entity cache if it is enabled.
	 *
	 * @param declaracao the declaracao
	 */
	public static void cacheResult(Declaracao declaracao) {
		getPersistence().cacheResult(declaracao);
	}

	/**
	 * Caches the declaracaos in the entity cache if it is enabled.
	 *
	 * @param declaracaos the declaracaos
	 */
	public static void cacheResult(List<Declaracao> declaracaos) {
		getPersistence().cacheResult(declaracaos);
	}

	/**
	 * Creates a new declaracao with the primary key. Does not add the declaracao to the database.
	 *
	 * @param declaracaoId the primary key for the new declaracao
	 * @return the new declaracao
	 */
	public static Declaracao create(long declaracaoId) {
		return getPersistence().create(declaracaoId);
	}

	/**
	 * Removes the declaracao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param declaracaoId the primary key of the declaracao
	 * @return the declaracao that was removed
	 * @throws NoSuchDeclaracaoException if a declaracao with the primary key could not be found
	 */
	public static Declaracao remove(long declaracaoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDeclaracaoException {

		return getPersistence().remove(declaracaoId);
	}

	public static Declaracao updateImpl(Declaracao declaracao) {
		return getPersistence().updateImpl(declaracao);
	}

	/**
	 * Returns the declaracao with the primary key or throws a <code>NoSuchDeclaracaoException</code> if it could not be found.
	 *
	 * @param declaracaoId the primary key of the declaracao
	 * @return the declaracao
	 * @throws NoSuchDeclaracaoException if a declaracao with the primary key could not be found
	 */
	public static Declaracao findByPrimaryKey(long declaracaoId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDeclaracaoException {

		return getPersistence().findByPrimaryKey(declaracaoId);
	}

	/**
	 * Returns the declaracao with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param declaracaoId the primary key of the declaracao
	 * @return the declaracao, or <code>null</code> if a declaracao with the primary key could not be found
	 */
	public static Declaracao fetchByPrimaryKey(long declaracaoId) {
		return getPersistence().fetchByPrimaryKey(declaracaoId);
	}

	/**
	 * Returns all the declaracaos.
	 *
	 * @return the declaracaos
	 */
	public static List<Declaracao> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the declaracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @return the range of declaracaos
	 */
	public static List<Declaracao> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the declaracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of declaracaos
	 */
	public static List<Declaracao> findAll(
		int start, int end, OrderByComparator<Declaracao> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the declaracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of declaracaos
	 */
	public static List<Declaracao> findAll(
		int start, int end, OrderByComparator<Declaracao> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the declaracaos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of declaracaos.
	 *
	 * @return the number of declaracaos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DeclaracaoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(DeclaracaoPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile DeclaracaoPersistence _persistence;

}