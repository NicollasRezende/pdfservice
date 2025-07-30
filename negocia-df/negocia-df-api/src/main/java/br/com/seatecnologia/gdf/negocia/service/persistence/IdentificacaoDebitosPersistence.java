/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchIdentificacaoDebitosException;
import br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the identificacao debitos service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IdentificacaoDebitosUtil
 * @generated
 */
@ProviderType
public interface IdentificacaoDebitosPersistence
	extends BasePersistence<IdentificacaoDebitos> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link IdentificacaoDebitosUtil} to access the identificacao debitos persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the identificacao debitoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching identificacao debitoses
	 */
	public java.util.List<IdentificacaoDebitos> findByUuid(String uuid);

	/**
	 * Returns a range of all the identificacao debitoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @return the range of matching identificacao debitoses
	 */
	public java.util.List<IdentificacaoDebitos> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the identificacao debitoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching identificacao debitoses
	 */
	public java.util.List<IdentificacaoDebitos> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<IdentificacaoDebitos>
			orderByComparator);

	/**
	 * Returns an ordered range of all the identificacao debitoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching identificacao debitoses
	 */
	public java.util.List<IdentificacaoDebitos> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<IdentificacaoDebitos>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first identificacao debitos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a matching identificacao debitos could not be found
	 */
	public IdentificacaoDebitos findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<IdentificacaoDebitos> orderByComparator)
		throws NoSuchIdentificacaoDebitosException;

	/**
	 * Returns the first identificacao debitos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching identificacao debitos, or <code>null</code> if a matching identificacao debitos could not be found
	 */
	public IdentificacaoDebitos fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<IdentificacaoDebitos>
			orderByComparator);

	/**
	 * Returns the last identificacao debitos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a matching identificacao debitos could not be found
	 */
	public IdentificacaoDebitos findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<IdentificacaoDebitos> orderByComparator)
		throws NoSuchIdentificacaoDebitosException;

	/**
	 * Returns the last identificacao debitos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching identificacao debitos, or <code>null</code> if a matching identificacao debitos could not be found
	 */
	public IdentificacaoDebitos fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<IdentificacaoDebitos>
			orderByComparator);

	/**
	 * Returns the identificacao debitoses before and after the current identificacao debitos in the ordered set where uuid = &#63;.
	 *
	 * @param identificacaoDebitosId the primary key of the current identificacao debitos
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a identificacao debitos with the primary key could not be found
	 */
	public IdentificacaoDebitos[] findByUuid_PrevAndNext(
			long identificacaoDebitosId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<IdentificacaoDebitos> orderByComparator)
		throws NoSuchIdentificacaoDebitosException;

	/**
	 * Removes all the identificacao debitoses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of identificacao debitoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching identificacao debitoses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the identificacao debitoses where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @return the matching identificacao debitoses
	 */
	public java.util.List<IdentificacaoDebitos> findByFundamentacaoId(
		long fundamentacaoId);

	/**
	 * Returns a range of all the identificacao debitoses where fundamentacaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @return the range of matching identificacao debitoses
	 */
	public java.util.List<IdentificacaoDebitos> findByFundamentacaoId(
		long fundamentacaoId, int start, int end);

	/**
	 * Returns an ordered range of all the identificacao debitoses where fundamentacaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching identificacao debitoses
	 */
	public java.util.List<IdentificacaoDebitos> findByFundamentacaoId(
		long fundamentacaoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<IdentificacaoDebitos>
			orderByComparator);

	/**
	 * Returns an ordered range of all the identificacao debitoses where fundamentacaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching identificacao debitoses
	 */
	public java.util.List<IdentificacaoDebitos> findByFundamentacaoId(
		long fundamentacaoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<IdentificacaoDebitos>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first identificacao debitos in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a matching identificacao debitos could not be found
	 */
	public IdentificacaoDebitos findByFundamentacaoId_First(
			long fundamentacaoId,
			com.liferay.portal.kernel.util.OrderByComparator
				<IdentificacaoDebitos> orderByComparator)
		throws NoSuchIdentificacaoDebitosException;

	/**
	 * Returns the first identificacao debitos in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching identificacao debitos, or <code>null</code> if a matching identificacao debitos could not be found
	 */
	public IdentificacaoDebitos fetchByFundamentacaoId_First(
		long fundamentacaoId,
		com.liferay.portal.kernel.util.OrderByComparator<IdentificacaoDebitos>
			orderByComparator);

	/**
	 * Returns the last identificacao debitos in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a matching identificacao debitos could not be found
	 */
	public IdentificacaoDebitos findByFundamentacaoId_Last(
			long fundamentacaoId,
			com.liferay.portal.kernel.util.OrderByComparator
				<IdentificacaoDebitos> orderByComparator)
		throws NoSuchIdentificacaoDebitosException;

	/**
	 * Returns the last identificacao debitos in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching identificacao debitos, or <code>null</code> if a matching identificacao debitos could not be found
	 */
	public IdentificacaoDebitos fetchByFundamentacaoId_Last(
		long fundamentacaoId,
		com.liferay.portal.kernel.util.OrderByComparator<IdentificacaoDebitos>
			orderByComparator);

	/**
	 * Returns the identificacao debitoses before and after the current identificacao debitos in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param identificacaoDebitosId the primary key of the current identificacao debitos
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a identificacao debitos with the primary key could not be found
	 */
	public IdentificacaoDebitos[] findByFundamentacaoId_PrevAndNext(
			long identificacaoDebitosId, long fundamentacaoId,
			com.liferay.portal.kernel.util.OrderByComparator
				<IdentificacaoDebitos> orderByComparator)
		throws NoSuchIdentificacaoDebitosException;

	/**
	 * Removes all the identificacao debitoses where fundamentacaoId = &#63; from the database.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 */
	public void removeByFundamentacaoId(long fundamentacaoId);

	/**
	 * Returns the number of identificacao debitoses where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @return the number of matching identificacao debitoses
	 */
	public int countByFundamentacaoId(long fundamentacaoId);

	/**
	 * Caches the identificacao debitos in the entity cache if it is enabled.
	 *
	 * @param identificacaoDebitos the identificacao debitos
	 */
	public void cacheResult(IdentificacaoDebitos identificacaoDebitos);

	/**
	 * Caches the identificacao debitoses in the entity cache if it is enabled.
	 *
	 * @param identificacaoDebitoses the identificacao debitoses
	 */
	public void cacheResult(
		java.util.List<IdentificacaoDebitos> identificacaoDebitoses);

	/**
	 * Creates a new identificacao debitos with the primary key. Does not add the identificacao debitos to the database.
	 *
	 * @param identificacaoDebitosId the primary key for the new identificacao debitos
	 * @return the new identificacao debitos
	 */
	public IdentificacaoDebitos create(long identificacaoDebitosId);

	/**
	 * Removes the identificacao debitos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param identificacaoDebitosId the primary key of the identificacao debitos
	 * @return the identificacao debitos that was removed
	 * @throws NoSuchIdentificacaoDebitosException if a identificacao debitos with the primary key could not be found
	 */
	public IdentificacaoDebitos remove(long identificacaoDebitosId)
		throws NoSuchIdentificacaoDebitosException;

	public IdentificacaoDebitos updateImpl(
		IdentificacaoDebitos identificacaoDebitos);

	/**
	 * Returns the identificacao debitos with the primary key or throws a <code>NoSuchIdentificacaoDebitosException</code> if it could not be found.
	 *
	 * @param identificacaoDebitosId the primary key of the identificacao debitos
	 * @return the identificacao debitos
	 * @throws NoSuchIdentificacaoDebitosException if a identificacao debitos with the primary key could not be found
	 */
	public IdentificacaoDebitos findByPrimaryKey(long identificacaoDebitosId)
		throws NoSuchIdentificacaoDebitosException;

	/**
	 * Returns the identificacao debitos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param identificacaoDebitosId the primary key of the identificacao debitos
	 * @return the identificacao debitos, or <code>null</code> if a identificacao debitos with the primary key could not be found
	 */
	public IdentificacaoDebitos fetchByPrimaryKey(long identificacaoDebitosId);

	/**
	 * Returns all the identificacao debitoses.
	 *
	 * @return the identificacao debitoses
	 */
	public java.util.List<IdentificacaoDebitos> findAll();

	/**
	 * Returns a range of all the identificacao debitoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @return the range of identificacao debitoses
	 */
	public java.util.List<IdentificacaoDebitos> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the identificacao debitoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of identificacao debitoses
	 */
	public java.util.List<IdentificacaoDebitos> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<IdentificacaoDebitos>
			orderByComparator);

	/**
	 * Returns an ordered range of all the identificacao debitoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of identificacao debitoses
	 */
	public java.util.List<IdentificacaoDebitos> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<IdentificacaoDebitos>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the identificacao debitoses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of identificacao debitoses.
	 *
	 * @return the number of identificacao debitoses
	 */
	public int countAll();

}