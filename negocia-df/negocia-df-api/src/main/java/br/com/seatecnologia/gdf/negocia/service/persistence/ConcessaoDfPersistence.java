/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchConcessaoDfException;
import br.com.seatecnologia.gdf.negocia.model.ConcessaoDf;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the concessao df service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConcessaoDfUtil
 * @generated
 */
@ProviderType
public interface ConcessaoDfPersistence extends BasePersistence<ConcessaoDf> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ConcessaoDfUtil} to access the concessao df persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the concessao dfs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching concessao dfs
	 */
	public java.util.List<ConcessaoDf> findByUuid(String uuid);

	/**
	 * Returns a range of all the concessao dfs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @return the range of matching concessao dfs
	 */
	public java.util.List<ConcessaoDf> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the concessao dfs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching concessao dfs
	 */
	public java.util.List<ConcessaoDf> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConcessaoDf>
			orderByComparator);

	/**
	 * Returns an ordered range of all the concessao dfs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching concessao dfs
	 */
	public java.util.List<ConcessaoDf> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConcessaoDf>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first concessao df in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching concessao df
	 * @throws NoSuchConcessaoDfException if a matching concessao df could not be found
	 */
	public ConcessaoDf findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ConcessaoDf>
				orderByComparator)
		throws NoSuchConcessaoDfException;

	/**
	 * Returns the first concessao df in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching concessao df, or <code>null</code> if a matching concessao df could not be found
	 */
	public ConcessaoDf fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ConcessaoDf>
			orderByComparator);

	/**
	 * Returns the last concessao df in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching concessao df
	 * @throws NoSuchConcessaoDfException if a matching concessao df could not be found
	 */
	public ConcessaoDf findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ConcessaoDf>
				orderByComparator)
		throws NoSuchConcessaoDfException;

	/**
	 * Returns the last concessao df in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching concessao df, or <code>null</code> if a matching concessao df could not be found
	 */
	public ConcessaoDf fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ConcessaoDf>
			orderByComparator);

	/**
	 * Returns the concessao dfs before and after the current concessao df in the ordered set where uuid = &#63;.
	 *
	 * @param concessaoId the primary key of the current concessao df
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next concessao df
	 * @throws NoSuchConcessaoDfException if a concessao df with the primary key could not be found
	 */
	public ConcessaoDf[] findByUuid_PrevAndNext(
			long concessaoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ConcessaoDf>
				orderByComparator)
		throws NoSuchConcessaoDfException;

	/**
	 * Removes all the concessao dfs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of concessao dfs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching concessao dfs
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the concessao dfs where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching concessao dfs
	 */
	public java.util.List<ConcessaoDf> findByPropostaId(long propostaId);

	/**
	 * Returns a range of all the concessao dfs where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @return the range of matching concessao dfs
	 */
	public java.util.List<ConcessaoDf> findByPropostaId(
		long propostaId, int start, int end);

	/**
	 * Returns an ordered range of all the concessao dfs where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching concessao dfs
	 */
	public java.util.List<ConcessaoDf> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConcessaoDf>
			orderByComparator);

	/**
	 * Returns an ordered range of all the concessao dfs where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching concessao dfs
	 */
	public java.util.List<ConcessaoDf> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConcessaoDf>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first concessao df in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching concessao df
	 * @throws NoSuchConcessaoDfException if a matching concessao df could not be found
	 */
	public ConcessaoDf findByPropostaId_First(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<ConcessaoDf>
				orderByComparator)
		throws NoSuchConcessaoDfException;

	/**
	 * Returns the first concessao df in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching concessao df, or <code>null</code> if a matching concessao df could not be found
	 */
	public ConcessaoDf fetchByPropostaId_First(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<ConcessaoDf>
			orderByComparator);

	/**
	 * Returns the last concessao df in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching concessao df
	 * @throws NoSuchConcessaoDfException if a matching concessao df could not be found
	 */
	public ConcessaoDf findByPropostaId_Last(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<ConcessaoDf>
				orderByComparator)
		throws NoSuchConcessaoDfException;

	/**
	 * Returns the last concessao df in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching concessao df, or <code>null</code> if a matching concessao df could not be found
	 */
	public ConcessaoDf fetchByPropostaId_Last(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<ConcessaoDf>
			orderByComparator);

	/**
	 * Returns the concessao dfs before and after the current concessao df in the ordered set where propostaId = &#63;.
	 *
	 * @param concessaoId the primary key of the current concessao df
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next concessao df
	 * @throws NoSuchConcessaoDfException if a concessao df with the primary key could not be found
	 */
	public ConcessaoDf[] findByPropostaId_PrevAndNext(
			long concessaoId, long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<ConcessaoDf>
				orderByComparator)
		throws NoSuchConcessaoDfException;

	/**
	 * Removes all the concessao dfs where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public void removeByPropostaId(long propostaId);

	/**
	 * Returns the number of concessao dfs where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching concessao dfs
	 */
	public int countByPropostaId(long propostaId);

	/**
	 * Caches the concessao df in the entity cache if it is enabled.
	 *
	 * @param concessaoDf the concessao df
	 */
	public void cacheResult(ConcessaoDf concessaoDf);

	/**
	 * Caches the concessao dfs in the entity cache if it is enabled.
	 *
	 * @param concessaoDfs the concessao dfs
	 */
	public void cacheResult(java.util.List<ConcessaoDf> concessaoDfs);

	/**
	 * Creates a new concessao df with the primary key. Does not add the concessao df to the database.
	 *
	 * @param concessaoId the primary key for the new concessao df
	 * @return the new concessao df
	 */
	public ConcessaoDf create(long concessaoId);

	/**
	 * Removes the concessao df with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param concessaoId the primary key of the concessao df
	 * @return the concessao df that was removed
	 * @throws NoSuchConcessaoDfException if a concessao df with the primary key could not be found
	 */
	public ConcessaoDf remove(long concessaoId)
		throws NoSuchConcessaoDfException;

	public ConcessaoDf updateImpl(ConcessaoDf concessaoDf);

	/**
	 * Returns the concessao df with the primary key or throws a <code>NoSuchConcessaoDfException</code> if it could not be found.
	 *
	 * @param concessaoId the primary key of the concessao df
	 * @return the concessao df
	 * @throws NoSuchConcessaoDfException if a concessao df with the primary key could not be found
	 */
	public ConcessaoDf findByPrimaryKey(long concessaoId)
		throws NoSuchConcessaoDfException;

	/**
	 * Returns the concessao df with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param concessaoId the primary key of the concessao df
	 * @return the concessao df, or <code>null</code> if a concessao df with the primary key could not be found
	 */
	public ConcessaoDf fetchByPrimaryKey(long concessaoId);

	/**
	 * Returns all the concessao dfs.
	 *
	 * @return the concessao dfs
	 */
	public java.util.List<ConcessaoDf> findAll();

	/**
	 * Returns a range of all the concessao dfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @return the range of concessao dfs
	 */
	public java.util.List<ConcessaoDf> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the concessao dfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of concessao dfs
	 */
	public java.util.List<ConcessaoDf> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConcessaoDf>
			orderByComparator);

	/**
	 * Returns an ordered range of all the concessao dfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of concessao dfs
	 */
	public java.util.List<ConcessaoDf> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConcessaoDf>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the concessao dfs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of concessao dfs.
	 *
	 * @return the number of concessao dfs
	 */
	public int countAll();

}