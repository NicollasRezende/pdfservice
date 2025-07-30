/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchGarantiaException;
import br.com.seatecnologia.gdf.negocia.model.Garantia;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the garantia service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GarantiaUtil
 * @generated
 */
@ProviderType
public interface GarantiaPersistence extends BasePersistence<Garantia> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GarantiaUtil} to access the garantia persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the garantias where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching garantias
	 */
	public java.util.List<Garantia> findByUuid(String uuid);

	/**
	 * Returns a range of all the garantias where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @return the range of matching garantias
	 */
	public java.util.List<Garantia> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the garantias where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching garantias
	 */
	public java.util.List<Garantia> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Garantia>
			orderByComparator);

	/**
	 * Returns an ordered range of all the garantias where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching garantias
	 */
	public java.util.List<Garantia> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Garantia>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first garantia in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching garantia
	 * @throws NoSuchGarantiaException if a matching garantia could not be found
	 */
	public Garantia findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Garantia>
				orderByComparator)
		throws NoSuchGarantiaException;

	/**
	 * Returns the first garantia in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching garantia, or <code>null</code> if a matching garantia could not be found
	 */
	public Garantia fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Garantia>
			orderByComparator);

	/**
	 * Returns the last garantia in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching garantia
	 * @throws NoSuchGarantiaException if a matching garantia could not be found
	 */
	public Garantia findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Garantia>
				orderByComparator)
		throws NoSuchGarantiaException;

	/**
	 * Returns the last garantia in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching garantia, or <code>null</code> if a matching garantia could not be found
	 */
	public Garantia fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Garantia>
			orderByComparator);

	/**
	 * Returns the garantias before and after the current garantia in the ordered set where uuid = &#63;.
	 *
	 * @param garantiaId the primary key of the current garantia
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next garantia
	 * @throws NoSuchGarantiaException if a garantia with the primary key could not be found
	 */
	public Garantia[] findByUuid_PrevAndNext(
			long garantiaId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Garantia>
				orderByComparator)
		throws NoSuchGarantiaException;

	/**
	 * Removes all the garantias where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of garantias where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching garantias
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the garantias where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching garantias
	 */
	public java.util.List<Garantia> findByPropostaId(long propostaId);

	/**
	 * Returns a range of all the garantias where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @return the range of matching garantias
	 */
	public java.util.List<Garantia> findByPropostaId(
		long propostaId, int start, int end);

	/**
	 * Returns an ordered range of all the garantias where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching garantias
	 */
	public java.util.List<Garantia> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Garantia>
			orderByComparator);

	/**
	 * Returns an ordered range of all the garantias where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching garantias
	 */
	public java.util.List<Garantia> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Garantia>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first garantia in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching garantia
	 * @throws NoSuchGarantiaException if a matching garantia could not be found
	 */
	public Garantia findByPropostaId_First(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<Garantia>
				orderByComparator)
		throws NoSuchGarantiaException;

	/**
	 * Returns the first garantia in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching garantia, or <code>null</code> if a matching garantia could not be found
	 */
	public Garantia fetchByPropostaId_First(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<Garantia>
			orderByComparator);

	/**
	 * Returns the last garantia in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching garantia
	 * @throws NoSuchGarantiaException if a matching garantia could not be found
	 */
	public Garantia findByPropostaId_Last(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<Garantia>
				orderByComparator)
		throws NoSuchGarantiaException;

	/**
	 * Returns the last garantia in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching garantia, or <code>null</code> if a matching garantia could not be found
	 */
	public Garantia fetchByPropostaId_Last(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<Garantia>
			orderByComparator);

	/**
	 * Returns the garantias before and after the current garantia in the ordered set where propostaId = &#63;.
	 *
	 * @param garantiaId the primary key of the current garantia
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next garantia
	 * @throws NoSuchGarantiaException if a garantia with the primary key could not be found
	 */
	public Garantia[] findByPropostaId_PrevAndNext(
			long garantiaId, long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<Garantia>
				orderByComparator)
		throws NoSuchGarantiaException;

	/**
	 * Removes all the garantias where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public void removeByPropostaId(long propostaId);

	/**
	 * Returns the number of garantias where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching garantias
	 */
	public int countByPropostaId(long propostaId);

	/**
	 * Caches the garantia in the entity cache if it is enabled.
	 *
	 * @param garantia the garantia
	 */
	public void cacheResult(Garantia garantia);

	/**
	 * Caches the garantias in the entity cache if it is enabled.
	 *
	 * @param garantias the garantias
	 */
	public void cacheResult(java.util.List<Garantia> garantias);

	/**
	 * Creates a new garantia with the primary key. Does not add the garantia to the database.
	 *
	 * @param garantiaId the primary key for the new garantia
	 * @return the new garantia
	 */
	public Garantia create(long garantiaId);

	/**
	 * Removes the garantia with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param garantiaId the primary key of the garantia
	 * @return the garantia that was removed
	 * @throws NoSuchGarantiaException if a garantia with the primary key could not be found
	 */
	public Garantia remove(long garantiaId) throws NoSuchGarantiaException;

	public Garantia updateImpl(Garantia garantia);

	/**
	 * Returns the garantia with the primary key or throws a <code>NoSuchGarantiaException</code> if it could not be found.
	 *
	 * @param garantiaId the primary key of the garantia
	 * @return the garantia
	 * @throws NoSuchGarantiaException if a garantia with the primary key could not be found
	 */
	public Garantia findByPrimaryKey(long garantiaId)
		throws NoSuchGarantiaException;

	/**
	 * Returns the garantia with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param garantiaId the primary key of the garantia
	 * @return the garantia, or <code>null</code> if a garantia with the primary key could not be found
	 */
	public Garantia fetchByPrimaryKey(long garantiaId);

	/**
	 * Returns all the garantias.
	 *
	 * @return the garantias
	 */
	public java.util.List<Garantia> findAll();

	/**
	 * Returns a range of all the garantias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @return the range of garantias
	 */
	public java.util.List<Garantia> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the garantias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of garantias
	 */
	public java.util.List<Garantia> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Garantia>
			orderByComparator);

	/**
	 * Returns an ordered range of all the garantias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of garantias
	 */
	public java.util.List<Garantia> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Garantia>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the garantias from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of garantias.
	 *
	 * @return the number of garantias
	 */
	public int countAll();

}