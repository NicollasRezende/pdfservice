/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchEditalException;
import br.com.seatecnologia.gdf.negocia.model.Edital;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the edital service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EditalUtil
 * @generated
 */
@ProviderType
public interface EditalPersistence extends BasePersistence<Edital> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EditalUtil} to access the edital persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the editals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching editals
	 */
	public java.util.List<Edital> findByUuid(String uuid);

	/**
	 * Returns a range of all the editals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EditalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of editals
	 * @param end the upper bound of the range of editals (not inclusive)
	 * @return the range of matching editals
	 */
	public java.util.List<Edital> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the editals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EditalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of editals
	 * @param end the upper bound of the range of editals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching editals
	 */
	public java.util.List<Edital> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Edital>
			orderByComparator);

	/**
	 * Returns an ordered range of all the editals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EditalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of editals
	 * @param end the upper bound of the range of editals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching editals
	 */
	public java.util.List<Edital> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Edital>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first edital in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edital
	 * @throws NoSuchEditalException if a matching edital could not be found
	 */
	public Edital findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Edital>
				orderByComparator)
		throws NoSuchEditalException;

	/**
	 * Returns the first edital in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching edital, or <code>null</code> if a matching edital could not be found
	 */
	public Edital fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Edital>
			orderByComparator);

	/**
	 * Returns the last edital in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edital
	 * @throws NoSuchEditalException if a matching edital could not be found
	 */
	public Edital findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Edital>
				orderByComparator)
		throws NoSuchEditalException;

	/**
	 * Returns the last edital in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching edital, or <code>null</code> if a matching edital could not be found
	 */
	public Edital fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Edital>
			orderByComparator);

	/**
	 * Returns the editals before and after the current edital in the ordered set where uuid = &#63;.
	 *
	 * @param editalId the primary key of the current edital
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next edital
	 * @throws NoSuchEditalException if a edital with the primary key could not be found
	 */
	public Edital[] findByUuid_PrevAndNext(
			long editalId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Edital>
				orderByComparator)
		throws NoSuchEditalException;

	/**
	 * Removes all the editals where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of editals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching editals
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the edital in the entity cache if it is enabled.
	 *
	 * @param edital the edital
	 */
	public void cacheResult(Edital edital);

	/**
	 * Caches the editals in the entity cache if it is enabled.
	 *
	 * @param editals the editals
	 */
	public void cacheResult(java.util.List<Edital> editals);

	/**
	 * Creates a new edital with the primary key. Does not add the edital to the database.
	 *
	 * @param editalId the primary key for the new edital
	 * @return the new edital
	 */
	public Edital create(long editalId);

	/**
	 * Removes the edital with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param editalId the primary key of the edital
	 * @return the edital that was removed
	 * @throws NoSuchEditalException if a edital with the primary key could not be found
	 */
	public Edital remove(long editalId) throws NoSuchEditalException;

	public Edital updateImpl(Edital edital);

	/**
	 * Returns the edital with the primary key or throws a <code>NoSuchEditalException</code> if it could not be found.
	 *
	 * @param editalId the primary key of the edital
	 * @return the edital
	 * @throws NoSuchEditalException if a edital with the primary key could not be found
	 */
	public Edital findByPrimaryKey(long editalId) throws NoSuchEditalException;

	/**
	 * Returns the edital with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param editalId the primary key of the edital
	 * @return the edital, or <code>null</code> if a edital with the primary key could not be found
	 */
	public Edital fetchByPrimaryKey(long editalId);

	/**
	 * Returns all the editals.
	 *
	 * @return the editals
	 */
	public java.util.List<Edital> findAll();

	/**
	 * Returns a range of all the editals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EditalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of editals
	 * @param end the upper bound of the range of editals (not inclusive)
	 * @return the range of editals
	 */
	public java.util.List<Edital> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the editals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EditalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of editals
	 * @param end the upper bound of the range of editals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of editals
	 */
	public java.util.List<Edital> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Edital>
			orderByComparator);

	/**
	 * Returns an ordered range of all the editals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EditalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of editals
	 * @param end the upper bound of the range of editals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of editals
	 */
	public java.util.List<Edital> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Edital>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the editals from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of editals.
	 *
	 * @return the number of editals
	 */
	public int countAll();

}