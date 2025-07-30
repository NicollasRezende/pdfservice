/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchBemDireitoAdicionalException;
import br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the bem direito adicional service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BemDireitoAdicionalUtil
 * @generated
 */
@ProviderType
public interface BemDireitoAdicionalPersistence
	extends BasePersistence<BemDireitoAdicional> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BemDireitoAdicionalUtil} to access the bem direito adicional persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the bem direito adicionals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching bem direito adicionals
	 */
	public java.util.List<BemDireitoAdicional> findByUuid(String uuid);

	/**
	 * Returns a range of all the bem direito adicionals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @return the range of matching bem direito adicionals
	 */
	public java.util.List<BemDireitoAdicional> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the bem direito adicionals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bem direito adicionals
	 */
	public java.util.List<BemDireitoAdicional> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BemDireitoAdicional>
			orderByComparator);

	/**
	 * Returns an ordered range of all the bem direito adicionals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bem direito adicionals
	 */
	public java.util.List<BemDireitoAdicional> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BemDireitoAdicional>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first bem direito adicional in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a matching bem direito adicional could not be found
	 */
	public BemDireitoAdicional findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<BemDireitoAdicional> orderByComparator)
		throws NoSuchBemDireitoAdicionalException;

	/**
	 * Returns the first bem direito adicional in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bem direito adicional, or <code>null</code> if a matching bem direito adicional could not be found
	 */
	public BemDireitoAdicional fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BemDireitoAdicional>
			orderByComparator);

	/**
	 * Returns the last bem direito adicional in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a matching bem direito adicional could not be found
	 */
	public BemDireitoAdicional findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<BemDireitoAdicional> orderByComparator)
		throws NoSuchBemDireitoAdicionalException;

	/**
	 * Returns the last bem direito adicional in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bem direito adicional, or <code>null</code> if a matching bem direito adicional could not be found
	 */
	public BemDireitoAdicional fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BemDireitoAdicional>
			orderByComparator);

	/**
	 * Returns the bem direito adicionals before and after the current bem direito adicional in the ordered set where uuid = &#63;.
	 *
	 * @param bemId the primary key of the current bem direito adicional
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a bem direito adicional with the primary key could not be found
	 */
	public BemDireitoAdicional[] findByUuid_PrevAndNext(
			long bemId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<BemDireitoAdicional> orderByComparator)
		throws NoSuchBemDireitoAdicionalException;

	/**
	 * Removes all the bem direito adicionals where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of bem direito adicionals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching bem direito adicionals
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the bem direito adicionals where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching bem direito adicionals
	 */
	public java.util.List<BemDireitoAdicional> findByPropostaId(
		long propostaId);

	/**
	 * Returns a range of all the bem direito adicionals where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @return the range of matching bem direito adicionals
	 */
	public java.util.List<BemDireitoAdicional> findByPropostaId(
		long propostaId, int start, int end);

	/**
	 * Returns an ordered range of all the bem direito adicionals where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bem direito adicionals
	 */
	public java.util.List<BemDireitoAdicional> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BemDireitoAdicional>
			orderByComparator);

	/**
	 * Returns an ordered range of all the bem direito adicionals where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bem direito adicionals
	 */
	public java.util.List<BemDireitoAdicional> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BemDireitoAdicional>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first bem direito adicional in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a matching bem direito adicional could not be found
	 */
	public BemDireitoAdicional findByPropostaId_First(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<BemDireitoAdicional> orderByComparator)
		throws NoSuchBemDireitoAdicionalException;

	/**
	 * Returns the first bem direito adicional in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bem direito adicional, or <code>null</code> if a matching bem direito adicional could not be found
	 */
	public BemDireitoAdicional fetchByPropostaId_First(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<BemDireitoAdicional>
			orderByComparator);

	/**
	 * Returns the last bem direito adicional in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a matching bem direito adicional could not be found
	 */
	public BemDireitoAdicional findByPropostaId_Last(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<BemDireitoAdicional> orderByComparator)
		throws NoSuchBemDireitoAdicionalException;

	/**
	 * Returns the last bem direito adicional in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bem direito adicional, or <code>null</code> if a matching bem direito adicional could not be found
	 */
	public BemDireitoAdicional fetchByPropostaId_Last(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<BemDireitoAdicional>
			orderByComparator);

	/**
	 * Returns the bem direito adicionals before and after the current bem direito adicional in the ordered set where propostaId = &#63;.
	 *
	 * @param bemId the primary key of the current bem direito adicional
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a bem direito adicional with the primary key could not be found
	 */
	public BemDireitoAdicional[] findByPropostaId_PrevAndNext(
			long bemId, long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<BemDireitoAdicional> orderByComparator)
		throws NoSuchBemDireitoAdicionalException;

	/**
	 * Removes all the bem direito adicionals where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public void removeByPropostaId(long propostaId);

	/**
	 * Returns the number of bem direito adicionals where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching bem direito adicionals
	 */
	public int countByPropostaId(long propostaId);

	/**
	 * Caches the bem direito adicional in the entity cache if it is enabled.
	 *
	 * @param bemDireitoAdicional the bem direito adicional
	 */
	public void cacheResult(BemDireitoAdicional bemDireitoAdicional);

	/**
	 * Caches the bem direito adicionals in the entity cache if it is enabled.
	 *
	 * @param bemDireitoAdicionals the bem direito adicionals
	 */
	public void cacheResult(
		java.util.List<BemDireitoAdicional> bemDireitoAdicionals);

	/**
	 * Creates a new bem direito adicional with the primary key. Does not add the bem direito adicional to the database.
	 *
	 * @param bemId the primary key for the new bem direito adicional
	 * @return the new bem direito adicional
	 */
	public BemDireitoAdicional create(long bemId);

	/**
	 * Removes the bem direito adicional with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bemId the primary key of the bem direito adicional
	 * @return the bem direito adicional that was removed
	 * @throws NoSuchBemDireitoAdicionalException if a bem direito adicional with the primary key could not be found
	 */
	public BemDireitoAdicional remove(long bemId)
		throws NoSuchBemDireitoAdicionalException;

	public BemDireitoAdicional updateImpl(
		BemDireitoAdicional bemDireitoAdicional);

	/**
	 * Returns the bem direito adicional with the primary key or throws a <code>NoSuchBemDireitoAdicionalException</code> if it could not be found.
	 *
	 * @param bemId the primary key of the bem direito adicional
	 * @return the bem direito adicional
	 * @throws NoSuchBemDireitoAdicionalException if a bem direito adicional with the primary key could not be found
	 */
	public BemDireitoAdicional findByPrimaryKey(long bemId)
		throws NoSuchBemDireitoAdicionalException;

	/**
	 * Returns the bem direito adicional with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bemId the primary key of the bem direito adicional
	 * @return the bem direito adicional, or <code>null</code> if a bem direito adicional with the primary key could not be found
	 */
	public BemDireitoAdicional fetchByPrimaryKey(long bemId);

	/**
	 * Returns all the bem direito adicionals.
	 *
	 * @return the bem direito adicionals
	 */
	public java.util.List<BemDireitoAdicional> findAll();

	/**
	 * Returns a range of all the bem direito adicionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @return the range of bem direito adicionals
	 */
	public java.util.List<BemDireitoAdicional> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the bem direito adicionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bem direito adicionals
	 */
	public java.util.List<BemDireitoAdicional> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BemDireitoAdicional>
			orderByComparator);

	/**
	 * Returns an ordered range of all the bem direito adicionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BemDireitoAdicionalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bem direito adicionals
	 * @param end the upper bound of the range of bem direito adicionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bem direito adicionals
	 */
	public java.util.List<BemDireitoAdicional> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BemDireitoAdicional>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the bem direito adicionals from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of bem direito adicionals.
	 *
	 * @return the number of bem direito adicionals
	 */
	public int countAll();

}