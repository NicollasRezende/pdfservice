/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchBensDireitosLaudoException;
import br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the bens direitos laudo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BensDireitosLaudoUtil
 * @generated
 */
@ProviderType
public interface BensDireitosLaudoPersistence
	extends BasePersistence<BensDireitosLaudo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BensDireitosLaudoUtil} to access the bens direitos laudo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the bens direitos laudos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching bens direitos laudos
	 */
	public java.util.List<BensDireitosLaudo> findByUuid(String uuid);

	/**
	 * Returns a range of all the bens direitos laudos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @return the range of matching bens direitos laudos
	 */
	public java.util.List<BensDireitosLaudo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the bens direitos laudos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bens direitos laudos
	 */
	public java.util.List<BensDireitosLaudo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BensDireitosLaudo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the bens direitos laudos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bens direitos laudos
	 */
	public java.util.List<BensDireitosLaudo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BensDireitosLaudo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first bens direitos laudo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos laudo
	 * @throws NoSuchBensDireitosLaudoException if a matching bens direitos laudo could not be found
	 */
	public BensDireitosLaudo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BensDireitosLaudo>
				orderByComparator)
		throws NoSuchBensDireitosLaudoException;

	/**
	 * Returns the first bens direitos laudo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos laudo, or <code>null</code> if a matching bens direitos laudo could not be found
	 */
	public BensDireitosLaudo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BensDireitosLaudo>
			orderByComparator);

	/**
	 * Returns the last bens direitos laudo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos laudo
	 * @throws NoSuchBensDireitosLaudoException if a matching bens direitos laudo could not be found
	 */
	public BensDireitosLaudo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BensDireitosLaudo>
				orderByComparator)
		throws NoSuchBensDireitosLaudoException;

	/**
	 * Returns the last bens direitos laudo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos laudo, or <code>null</code> if a matching bens direitos laudo could not be found
	 */
	public BensDireitosLaudo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BensDireitosLaudo>
			orderByComparator);

	/**
	 * Returns the bens direitos laudos before and after the current bens direitos laudo in the ordered set where uuid = &#63;.
	 *
	 * @param bensDireitosLaudoId the primary key of the current bens direitos laudo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bens direitos laudo
	 * @throws NoSuchBensDireitosLaudoException if a bens direitos laudo with the primary key could not be found
	 */
	public BensDireitosLaudo[] findByUuid_PrevAndNext(
			long bensDireitosLaudoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BensDireitosLaudo>
				orderByComparator)
		throws NoSuchBensDireitosLaudoException;

	/**
	 * Removes all the bens direitos laudos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of bens direitos laudos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching bens direitos laudos
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the bens direitos laudo in the entity cache if it is enabled.
	 *
	 * @param bensDireitosLaudo the bens direitos laudo
	 */
	public void cacheResult(BensDireitosLaudo bensDireitosLaudo);

	/**
	 * Caches the bens direitos laudos in the entity cache if it is enabled.
	 *
	 * @param bensDireitosLaudos the bens direitos laudos
	 */
	public void cacheResult(
		java.util.List<BensDireitosLaudo> bensDireitosLaudos);

	/**
	 * Creates a new bens direitos laudo with the primary key. Does not add the bens direitos laudo to the database.
	 *
	 * @param bensDireitosLaudoId the primary key for the new bens direitos laudo
	 * @return the new bens direitos laudo
	 */
	public BensDireitosLaudo create(long bensDireitosLaudoId);

	/**
	 * Removes the bens direitos laudo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bensDireitosLaudoId the primary key of the bens direitos laudo
	 * @return the bens direitos laudo that was removed
	 * @throws NoSuchBensDireitosLaudoException if a bens direitos laudo with the primary key could not be found
	 */
	public BensDireitosLaudo remove(long bensDireitosLaudoId)
		throws NoSuchBensDireitosLaudoException;

	public BensDireitosLaudo updateImpl(BensDireitosLaudo bensDireitosLaudo);

	/**
	 * Returns the bens direitos laudo with the primary key or throws a <code>NoSuchBensDireitosLaudoException</code> if it could not be found.
	 *
	 * @param bensDireitosLaudoId the primary key of the bens direitos laudo
	 * @return the bens direitos laudo
	 * @throws NoSuchBensDireitosLaudoException if a bens direitos laudo with the primary key could not be found
	 */
	public BensDireitosLaudo findByPrimaryKey(long bensDireitosLaudoId)
		throws NoSuchBensDireitosLaudoException;

	/**
	 * Returns the bens direitos laudo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bensDireitosLaudoId the primary key of the bens direitos laudo
	 * @return the bens direitos laudo, or <code>null</code> if a bens direitos laudo with the primary key could not be found
	 */
	public BensDireitosLaudo fetchByPrimaryKey(long bensDireitosLaudoId);

	/**
	 * Returns all the bens direitos laudos.
	 *
	 * @return the bens direitos laudos
	 */
	public java.util.List<BensDireitosLaudo> findAll();

	/**
	 * Returns a range of all the bens direitos laudos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @return the range of bens direitos laudos
	 */
	public java.util.List<BensDireitosLaudo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the bens direitos laudos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bens direitos laudos
	 */
	public java.util.List<BensDireitosLaudo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BensDireitosLaudo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the bens direitos laudos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosLaudoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos laudos
	 * @param end the upper bound of the range of bens direitos laudos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bens direitos laudos
	 */
	public java.util.List<BensDireitosLaudo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BensDireitosLaudo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the bens direitos laudos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of bens direitos laudos.
	 *
	 * @return the number of bens direitos laudos
	 */
	public int countAll();

}