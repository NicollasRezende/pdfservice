/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDadosContribuinteException;
import br.com.seatecnologia.gdf.negocia.model.DadosContribuinte;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the dados contribuinte service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DadosContribuinteUtil
 * @generated
 */
@ProviderType
public interface DadosContribuintePersistence
	extends BasePersistence<DadosContribuinte> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DadosContribuinteUtil} to access the dados contribuinte persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the dados contribuintes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching dados contribuintes
	 */
	public java.util.List<DadosContribuinte> findByUuid(String uuid);

	/**
	 * Returns a range of all the dados contribuintes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @return the range of matching dados contribuintes
	 */
	public java.util.List<DadosContribuinte> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the dados contribuintes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dados contribuintes
	 */
	public java.util.List<DadosContribuinte> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DadosContribuinte>
			orderByComparator);

	/**
	 * Returns an ordered range of all the dados contribuintes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dados contribuintes
	 */
	public java.util.List<DadosContribuinte> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DadosContribuinte>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dados contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a matching dados contribuinte could not be found
	 */
	public DadosContribuinte findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DadosContribuinte>
				orderByComparator)
		throws NoSuchDadosContribuinteException;

	/**
	 * Returns the first dados contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	public DadosContribuinte fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DadosContribuinte>
			orderByComparator);

	/**
	 * Returns the last dados contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a matching dados contribuinte could not be found
	 */
	public DadosContribuinte findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DadosContribuinte>
				orderByComparator)
		throws NoSuchDadosContribuinteException;

	/**
	 * Returns the last dados contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	public DadosContribuinte fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DadosContribuinte>
			orderByComparator);

	/**
	 * Returns the dados contribuintes before and after the current dados contribuinte in the ordered set where uuid = &#63;.
	 *
	 * @param dadosContribuinteId the primary key of the current dados contribuinte
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a dados contribuinte with the primary key could not be found
	 */
	public DadosContribuinte[] findByUuid_PrevAndNext(
			long dadosContribuinteId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DadosContribuinte>
				orderByComparator)
		throws NoSuchDadosContribuinteException;

	/**
	 * Removes all the dados contribuintes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of dados contribuintes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching dados contribuintes
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the dados contribuinte where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDadosContribuinteException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a matching dados contribuinte could not be found
	 */
	public DadosContribuinte findByUUID_G(String uuid, long groupId)
		throws NoSuchDadosContribuinteException;

	/**
	 * Returns the dados contribuinte where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	public DadosContribuinte fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the dados contribuinte where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	public DadosContribuinte fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the dados contribuinte where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the dados contribuinte that was removed
	 */
	public DadosContribuinte removeByUUID_G(String uuid, long groupId)
		throws NoSuchDadosContribuinteException;

	/**
	 * Returns the number of dados contribuintes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching dados contribuintes
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the dados contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching dados contribuintes
	 */
	public java.util.List<DadosContribuinte> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the dados contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @return the range of matching dados contribuintes
	 */
	public java.util.List<DadosContribuinte> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the dados contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dados contribuintes
	 */
	public java.util.List<DadosContribuinte> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DadosContribuinte>
			orderByComparator);

	/**
	 * Returns an ordered range of all the dados contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dados contribuintes
	 */
	public java.util.List<DadosContribuinte> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DadosContribuinte>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dados contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a matching dados contribuinte could not be found
	 */
	public DadosContribuinte findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<DadosContribuinte>
				orderByComparator)
		throws NoSuchDadosContribuinteException;

	/**
	 * Returns the first dados contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	public DadosContribuinte fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DadosContribuinte>
			orderByComparator);

	/**
	 * Returns the last dados contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a matching dados contribuinte could not be found
	 */
	public DadosContribuinte findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<DadosContribuinte>
				orderByComparator)
		throws NoSuchDadosContribuinteException;

	/**
	 * Returns the last dados contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	public DadosContribuinte fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DadosContribuinte>
			orderByComparator);

	/**
	 * Returns the dados contribuintes before and after the current dados contribuinte in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param dadosContribuinteId the primary key of the current dados contribuinte
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a dados contribuinte with the primary key could not be found
	 */
	public DadosContribuinte[] findByUuid_C_PrevAndNext(
			long dadosContribuinteId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<DadosContribuinte>
				orderByComparator)
		throws NoSuchDadosContribuinteException;

	/**
	 * Removes all the dados contribuintes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of dados contribuintes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching dados contribuintes
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the dados contribuinte in the entity cache if it is enabled.
	 *
	 * @param dadosContribuinte the dados contribuinte
	 */
	public void cacheResult(DadosContribuinte dadosContribuinte);

	/**
	 * Caches the dados contribuintes in the entity cache if it is enabled.
	 *
	 * @param dadosContribuintes the dados contribuintes
	 */
	public void cacheResult(
		java.util.List<DadosContribuinte> dadosContribuintes);

	/**
	 * Creates a new dados contribuinte with the primary key. Does not add the dados contribuinte to the database.
	 *
	 * @param dadosContribuinteId the primary key for the new dados contribuinte
	 * @return the new dados contribuinte
	 */
	public DadosContribuinte create(long dadosContribuinteId);

	/**
	 * Removes the dados contribuinte with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dadosContribuinteId the primary key of the dados contribuinte
	 * @return the dados contribuinte that was removed
	 * @throws NoSuchDadosContribuinteException if a dados contribuinte with the primary key could not be found
	 */
	public DadosContribuinte remove(long dadosContribuinteId)
		throws NoSuchDadosContribuinteException;

	public DadosContribuinte updateImpl(DadosContribuinte dadosContribuinte);

	/**
	 * Returns the dados contribuinte with the primary key or throws a <code>NoSuchDadosContribuinteException</code> if it could not be found.
	 *
	 * @param dadosContribuinteId the primary key of the dados contribuinte
	 * @return the dados contribuinte
	 * @throws NoSuchDadosContribuinteException if a dados contribuinte with the primary key could not be found
	 */
	public DadosContribuinte findByPrimaryKey(long dadosContribuinteId)
		throws NoSuchDadosContribuinteException;

	/**
	 * Returns the dados contribuinte with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dadosContribuinteId the primary key of the dados contribuinte
	 * @return the dados contribuinte, or <code>null</code> if a dados contribuinte with the primary key could not be found
	 */
	public DadosContribuinte fetchByPrimaryKey(long dadosContribuinteId);

	/**
	 * Returns all the dados contribuintes.
	 *
	 * @return the dados contribuintes
	 */
	public java.util.List<DadosContribuinte> findAll();

	/**
	 * Returns a range of all the dados contribuintes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @return the range of dados contribuintes
	 */
	public java.util.List<DadosContribuinte> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the dados contribuintes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dados contribuintes
	 */
	public java.util.List<DadosContribuinte> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DadosContribuinte>
			orderByComparator);

	/**
	 * Returns an ordered range of all the dados contribuintes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dados contribuintes
	 */
	public java.util.List<DadosContribuinte> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DadosContribuinte>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the dados contribuintes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of dados contribuintes.
	 *
	 * @return the number of dados contribuintes
	 */
	public int countAll();

}