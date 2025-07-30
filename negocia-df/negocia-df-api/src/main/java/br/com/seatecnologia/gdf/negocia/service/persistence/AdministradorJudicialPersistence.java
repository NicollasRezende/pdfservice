/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchAdministradorJudicialException;
import br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the administrador judicial service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdministradorJudicialUtil
 * @generated
 */
@ProviderType
public interface AdministradorJudicialPersistence
	extends BasePersistence<AdministradorJudicial> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AdministradorJudicialUtil} to access the administrador judicial persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the administrador judicials where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching administrador judicials
	 */
	public java.util.List<AdministradorJudicial> findByUuid(String uuid);

	/**
	 * Returns a range of all the administrador judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @return the range of matching administrador judicials
	 */
	public java.util.List<AdministradorJudicial> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the administrador judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching administrador judicials
	 */
	public java.util.List<AdministradorJudicial> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdministradorJudicial>
			orderByComparator);

	/**
	 * Returns an ordered range of all the administrador judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching administrador judicials
	 */
	public java.util.List<AdministradorJudicial> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdministradorJudicial>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first administrador judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching administrador judicial
	 * @throws NoSuchAdministradorJudicialException if a matching administrador judicial could not be found
	 */
	public AdministradorJudicial findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AdministradorJudicial> orderByComparator)
		throws NoSuchAdministradorJudicialException;

	/**
	 * Returns the first administrador judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching administrador judicial, or <code>null</code> if a matching administrador judicial could not be found
	 */
	public AdministradorJudicial fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AdministradorJudicial>
			orderByComparator);

	/**
	 * Returns the last administrador judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching administrador judicial
	 * @throws NoSuchAdministradorJudicialException if a matching administrador judicial could not be found
	 */
	public AdministradorJudicial findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AdministradorJudicial> orderByComparator)
		throws NoSuchAdministradorJudicialException;

	/**
	 * Returns the last administrador judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching administrador judicial, or <code>null</code> if a matching administrador judicial could not be found
	 */
	public AdministradorJudicial fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AdministradorJudicial>
			orderByComparator);

	/**
	 * Returns the administrador judicials before and after the current administrador judicial in the ordered set where uuid = &#63;.
	 *
	 * @param administradorJudicialId the primary key of the current administrador judicial
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next administrador judicial
	 * @throws NoSuchAdministradorJudicialException if a administrador judicial with the primary key could not be found
	 */
	public AdministradorJudicial[] findByUuid_PrevAndNext(
			long administradorJudicialId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AdministradorJudicial> orderByComparator)
		throws NoSuchAdministradorJudicialException;

	/**
	 * Removes all the administrador judicials where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of administrador judicials where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching administrador judicials
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the administrador judicial in the entity cache if it is enabled.
	 *
	 * @param administradorJudicial the administrador judicial
	 */
	public void cacheResult(AdministradorJudicial administradorJudicial);

	/**
	 * Caches the administrador judicials in the entity cache if it is enabled.
	 *
	 * @param administradorJudicials the administrador judicials
	 */
	public void cacheResult(
		java.util.List<AdministradorJudicial> administradorJudicials);

	/**
	 * Creates a new administrador judicial with the primary key. Does not add the administrador judicial to the database.
	 *
	 * @param administradorJudicialId the primary key for the new administrador judicial
	 * @return the new administrador judicial
	 */
	public AdministradorJudicial create(long administradorJudicialId);

	/**
	 * Removes the administrador judicial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param administradorJudicialId the primary key of the administrador judicial
	 * @return the administrador judicial that was removed
	 * @throws NoSuchAdministradorJudicialException if a administrador judicial with the primary key could not be found
	 */
	public AdministradorJudicial remove(long administradorJudicialId)
		throws NoSuchAdministradorJudicialException;

	public AdministradorJudicial updateImpl(
		AdministradorJudicial administradorJudicial);

	/**
	 * Returns the administrador judicial with the primary key or throws a <code>NoSuchAdministradorJudicialException</code> if it could not be found.
	 *
	 * @param administradorJudicialId the primary key of the administrador judicial
	 * @return the administrador judicial
	 * @throws NoSuchAdministradorJudicialException if a administrador judicial with the primary key could not be found
	 */
	public AdministradorJudicial findByPrimaryKey(long administradorJudicialId)
		throws NoSuchAdministradorJudicialException;

	/**
	 * Returns the administrador judicial with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param administradorJudicialId the primary key of the administrador judicial
	 * @return the administrador judicial, or <code>null</code> if a administrador judicial with the primary key could not be found
	 */
	public AdministradorJudicial fetchByPrimaryKey(
		long administradorJudicialId);

	/**
	 * Returns all the administrador judicials.
	 *
	 * @return the administrador judicials
	 */
	public java.util.List<AdministradorJudicial> findAll();

	/**
	 * Returns a range of all the administrador judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @return the range of administrador judicials
	 */
	public java.util.List<AdministradorJudicial> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the administrador judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of administrador judicials
	 */
	public java.util.List<AdministradorJudicial> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdministradorJudicial>
			orderByComparator);

	/**
	 * Returns an ordered range of all the administrador judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdministradorJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of administrador judicials
	 * @param end the upper bound of the range of administrador judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of administrador judicials
	 */
	public java.util.List<AdministradorJudicial> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AdministradorJudicial>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the administrador judicials from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of administrador judicials.
	 *
	 * @return the number of administrador judicials
	 */
	public int countAll();

}