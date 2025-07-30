/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchQualificacaoContribuinteException;
import br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the qualificacao contribuinte service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualificacaoContribuinteUtil
 * @generated
 */
@ProviderType
public interface QualificacaoContribuintePersistence
	extends BasePersistence<QualificacaoContribuinte> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QualificacaoContribuinteUtil} to access the qualificacao contribuinte persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the qualificacao contribuintes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching qualificacao contribuintes
	 */
	public java.util.List<QualificacaoContribuinte> findByUuid(String uuid);

	/**
	 * Returns a range of all the qualificacao contribuintes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of qualificacao contribuintes
	 * @param end the upper bound of the range of qualificacao contribuintes (not inclusive)
	 * @return the range of matching qualificacao contribuintes
	 */
	public java.util.List<QualificacaoContribuinte> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the qualificacao contribuintes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of qualificacao contribuintes
	 * @param end the upper bound of the range of qualificacao contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qualificacao contribuintes
	 */
	public java.util.List<QualificacaoContribuinte> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QualificacaoContribuinte> orderByComparator);

	/**
	 * Returns an ordered range of all the qualificacao contribuintes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of qualificacao contribuintes
	 * @param end the upper bound of the range of qualificacao contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching qualificacao contribuintes
	 */
	public java.util.List<QualificacaoContribuinte> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QualificacaoContribuinte> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first qualificacao contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualificacao contribuinte
	 * @throws NoSuchQualificacaoContribuinteException if a matching qualificacao contribuinte could not be found
	 */
	public QualificacaoContribuinte findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<QualificacaoContribuinte> orderByComparator)
		throws NoSuchQualificacaoContribuinteException;

	/**
	 * Returns the first qualificacao contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualificacao contribuinte, or <code>null</code> if a matching qualificacao contribuinte could not be found
	 */
	public QualificacaoContribuinte fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<QualificacaoContribuinte> orderByComparator);

	/**
	 * Returns the last qualificacao contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualificacao contribuinte
	 * @throws NoSuchQualificacaoContribuinteException if a matching qualificacao contribuinte could not be found
	 */
	public QualificacaoContribuinte findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<QualificacaoContribuinte> orderByComparator)
		throws NoSuchQualificacaoContribuinteException;

	/**
	 * Returns the last qualificacao contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualificacao contribuinte, or <code>null</code> if a matching qualificacao contribuinte could not be found
	 */
	public QualificacaoContribuinte fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<QualificacaoContribuinte> orderByComparator);

	/**
	 * Returns the qualificacao contribuintes before and after the current qualificacao contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param qualificacaoContribuinteId the primary key of the current qualificacao contribuinte
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qualificacao contribuinte
	 * @throws NoSuchQualificacaoContribuinteException if a qualificacao contribuinte with the primary key could not be found
	 */
	public QualificacaoContribuinte[] findByUuid_PrevAndNext(
			long qualificacaoContribuinteId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<QualificacaoContribuinte> orderByComparator)
		throws NoSuchQualificacaoContribuinteException;

	/**
	 * Removes all the qualificacao contribuintes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of qualificacao contribuintes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching qualificacao contribuintes
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the qualificacao contribuinte where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQualificacaoContribuinteException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching qualificacao contribuinte
	 * @throws NoSuchQualificacaoContribuinteException if a matching qualificacao contribuinte could not be found
	 */
	public QualificacaoContribuinte findByUUID_G(String uuid, long groupId)
		throws NoSuchQualificacaoContribuinteException;

	/**
	 * Returns the qualificacao contribuinte where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching qualificacao contribuinte, or <code>null</code> if a matching qualificacao contribuinte could not be found
	 */
	public QualificacaoContribuinte fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the qualificacao contribuinte where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching qualificacao contribuinte, or <code>null</code> if a matching qualificacao contribuinte could not be found
	 */
	public QualificacaoContribuinte fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the qualificacao contribuinte where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the qualificacao contribuinte that was removed
	 */
	public QualificacaoContribuinte removeByUUID_G(String uuid, long groupId)
		throws NoSuchQualificacaoContribuinteException;

	/**
	 * Returns the number of qualificacao contribuintes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching qualificacao contribuintes
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the qualificacao contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching qualificacao contribuintes
	 */
	public java.util.List<QualificacaoContribuinte> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the qualificacao contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of qualificacao contribuintes
	 * @param end the upper bound of the range of qualificacao contribuintes (not inclusive)
	 * @return the range of matching qualificacao contribuintes
	 */
	public java.util.List<QualificacaoContribuinte> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the qualificacao contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of qualificacao contribuintes
	 * @param end the upper bound of the range of qualificacao contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qualificacao contribuintes
	 */
	public java.util.List<QualificacaoContribuinte> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QualificacaoContribuinte> orderByComparator);

	/**
	 * Returns an ordered range of all the qualificacao contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of qualificacao contribuintes
	 * @param end the upper bound of the range of qualificacao contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching qualificacao contribuintes
	 */
	public java.util.List<QualificacaoContribuinte> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QualificacaoContribuinte> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first qualificacao contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualificacao contribuinte
	 * @throws NoSuchQualificacaoContribuinteException if a matching qualificacao contribuinte could not be found
	 */
	public QualificacaoContribuinte findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QualificacaoContribuinte> orderByComparator)
		throws NoSuchQualificacaoContribuinteException;

	/**
	 * Returns the first qualificacao contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualificacao contribuinte, or <code>null</code> if a matching qualificacao contribuinte could not be found
	 */
	public QualificacaoContribuinte fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<QualificacaoContribuinte> orderByComparator);

	/**
	 * Returns the last qualificacao contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualificacao contribuinte
	 * @throws NoSuchQualificacaoContribuinteException if a matching qualificacao contribuinte could not be found
	 */
	public QualificacaoContribuinte findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QualificacaoContribuinte> orderByComparator)
		throws NoSuchQualificacaoContribuinteException;

	/**
	 * Returns the last qualificacao contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualificacao contribuinte, or <code>null</code> if a matching qualificacao contribuinte could not be found
	 */
	public QualificacaoContribuinte fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<QualificacaoContribuinte> orderByComparator);

	/**
	 * Returns the qualificacao contribuintes before and after the current qualificacao contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param qualificacaoContribuinteId the primary key of the current qualificacao contribuinte
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qualificacao contribuinte
	 * @throws NoSuchQualificacaoContribuinteException if a qualificacao contribuinte with the primary key could not be found
	 */
	public QualificacaoContribuinte[] findByUuid_C_PrevAndNext(
			long qualificacaoContribuinteId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QualificacaoContribuinte> orderByComparator)
		throws NoSuchQualificacaoContribuinteException;

	/**
	 * Removes all the qualificacao contribuintes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of qualificacao contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching qualificacao contribuintes
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the qualificacao contribuinte in the entity cache if it is enabled.
	 *
	 * @param qualificacaoContribuinte the qualificacao contribuinte
	 */
	public void cacheResult(QualificacaoContribuinte qualificacaoContribuinte);

	/**
	 * Caches the qualificacao contribuintes in the entity cache if it is enabled.
	 *
	 * @param qualificacaoContribuintes the qualificacao contribuintes
	 */
	public void cacheResult(
		java.util.List<QualificacaoContribuinte> qualificacaoContribuintes);

	/**
	 * Creates a new qualificacao contribuinte with the primary key. Does not add the qualificacao contribuinte to the database.
	 *
	 * @param qualificacaoContribuinteId the primary key for the new qualificacao contribuinte
	 * @return the new qualificacao contribuinte
	 */
	public QualificacaoContribuinte create(long qualificacaoContribuinteId);

	/**
	 * Removes the qualificacao contribuinte with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualificacaoContribuinteId the primary key of the qualificacao contribuinte
	 * @return the qualificacao contribuinte that was removed
	 * @throws NoSuchQualificacaoContribuinteException if a qualificacao contribuinte with the primary key could not be found
	 */
	public QualificacaoContribuinte remove(long qualificacaoContribuinteId)
		throws NoSuchQualificacaoContribuinteException;

	public QualificacaoContribuinte updateImpl(
		QualificacaoContribuinte qualificacaoContribuinte);

	/**
	 * Returns the qualificacao contribuinte with the primary key or throws a <code>NoSuchQualificacaoContribuinteException</code> if it could not be found.
	 *
	 * @param qualificacaoContribuinteId the primary key of the qualificacao contribuinte
	 * @return the qualificacao contribuinte
	 * @throws NoSuchQualificacaoContribuinteException if a qualificacao contribuinte with the primary key could not be found
	 */
	public QualificacaoContribuinte findByPrimaryKey(
			long qualificacaoContribuinteId)
		throws NoSuchQualificacaoContribuinteException;

	/**
	 * Returns the qualificacao contribuinte with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualificacaoContribuinteId the primary key of the qualificacao contribuinte
	 * @return the qualificacao contribuinte, or <code>null</code> if a qualificacao contribuinte with the primary key could not be found
	 */
	public QualificacaoContribuinte fetchByPrimaryKey(
		long qualificacaoContribuinteId);

	/**
	 * Returns all the qualificacao contribuintes.
	 *
	 * @return the qualificacao contribuintes
	 */
	public java.util.List<QualificacaoContribuinte> findAll();

	/**
	 * Returns a range of all the qualificacao contribuintes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualificacao contribuintes
	 * @param end the upper bound of the range of qualificacao contribuintes (not inclusive)
	 * @return the range of qualificacao contribuintes
	 */
	public java.util.List<QualificacaoContribuinte> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the qualificacao contribuintes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualificacao contribuintes
	 * @param end the upper bound of the range of qualificacao contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qualificacao contribuintes
	 */
	public java.util.List<QualificacaoContribuinte> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QualificacaoContribuinte> orderByComparator);

	/**
	 * Returns an ordered range of all the qualificacao contribuintes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualificacao contribuintes
	 * @param end the upper bound of the range of qualificacao contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of qualificacao contribuintes
	 */
	public java.util.List<QualificacaoContribuinte> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QualificacaoContribuinte> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the qualificacao contribuintes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of qualificacao contribuintes.
	 *
	 * @return the number of qualificacao contribuintes
	 */
	public int countAll();

}