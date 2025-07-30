/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchEncargoException;
import br.com.seatecnologia.gdf.negocia.model.Encargo;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the encargo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EncargoUtil
 * @generated
 */
@ProviderType
public interface EncargoPersistence extends BasePersistence<Encargo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EncargoUtil} to access the encargo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the encargos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching encargos
	 */
	public java.util.List<Encargo> findByUuid(String uuid);

	/**
	 * Returns a range of all the encargos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @return the range of matching encargos
	 */
	public java.util.List<Encargo> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the encargos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching encargos
	 */
	public java.util.List<Encargo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Encargo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the encargos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching encargos
	 */
	public java.util.List<Encargo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Encargo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first encargo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching encargo
	 * @throws NoSuchEncargoException if a matching encargo could not be found
	 */
	public Encargo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Encargo>
				orderByComparator)
		throws NoSuchEncargoException;

	/**
	 * Returns the first encargo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching encargo, or <code>null</code> if a matching encargo could not be found
	 */
	public Encargo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Encargo>
			orderByComparator);

	/**
	 * Returns the last encargo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching encargo
	 * @throws NoSuchEncargoException if a matching encargo could not be found
	 */
	public Encargo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Encargo>
				orderByComparator)
		throws NoSuchEncargoException;

	/**
	 * Returns the last encargo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching encargo, or <code>null</code> if a matching encargo could not be found
	 */
	public Encargo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Encargo>
			orderByComparator);

	/**
	 * Returns the encargos before and after the current encargo in the ordered set where uuid = &#63;.
	 *
	 * @param encargoId the primary key of the current encargo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next encargo
	 * @throws NoSuchEncargoException if a encargo with the primary key could not be found
	 */
	public Encargo[] findByUuid_PrevAndNext(
			long encargoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Encargo>
				orderByComparator)
		throws NoSuchEncargoException;

	/**
	 * Removes all the encargos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of encargos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching encargos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the encargos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching encargos
	 */
	public java.util.List<Encargo> findByPropostaId(long propostaId);

	/**
	 * Returns a range of all the encargos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @return the range of matching encargos
	 */
	public java.util.List<Encargo> findByPropostaId(
		long propostaId, int start, int end);

	/**
	 * Returns an ordered range of all the encargos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching encargos
	 */
	public java.util.List<Encargo> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Encargo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the encargos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching encargos
	 */
	public java.util.List<Encargo> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Encargo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first encargo in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching encargo
	 * @throws NoSuchEncargoException if a matching encargo could not be found
	 */
	public Encargo findByPropostaId_First(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<Encargo>
				orderByComparator)
		throws NoSuchEncargoException;

	/**
	 * Returns the first encargo in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching encargo, or <code>null</code> if a matching encargo could not be found
	 */
	public Encargo fetchByPropostaId_First(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<Encargo>
			orderByComparator);

	/**
	 * Returns the last encargo in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching encargo
	 * @throws NoSuchEncargoException if a matching encargo could not be found
	 */
	public Encargo findByPropostaId_Last(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<Encargo>
				orderByComparator)
		throws NoSuchEncargoException;

	/**
	 * Returns the last encargo in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching encargo, or <code>null</code> if a matching encargo could not be found
	 */
	public Encargo fetchByPropostaId_Last(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<Encargo>
			orderByComparator);

	/**
	 * Returns the encargos before and after the current encargo in the ordered set where propostaId = &#63;.
	 *
	 * @param encargoId the primary key of the current encargo
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next encargo
	 * @throws NoSuchEncargoException if a encargo with the primary key could not be found
	 */
	public Encargo[] findByPropostaId_PrevAndNext(
			long encargoId, long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<Encargo>
				orderByComparator)
		throws NoSuchEncargoException;

	/**
	 * Removes all the encargos where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public void removeByPropostaId(long propostaId);

	/**
	 * Returns the number of encargos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching encargos
	 */
	public int countByPropostaId(long propostaId);

	/**
	 * Caches the encargo in the entity cache if it is enabled.
	 *
	 * @param encargo the encargo
	 */
	public void cacheResult(Encargo encargo);

	/**
	 * Caches the encargos in the entity cache if it is enabled.
	 *
	 * @param encargos the encargos
	 */
	public void cacheResult(java.util.List<Encargo> encargos);

	/**
	 * Creates a new encargo with the primary key. Does not add the encargo to the database.
	 *
	 * @param encargoId the primary key for the new encargo
	 * @return the new encargo
	 */
	public Encargo create(long encargoId);

	/**
	 * Removes the encargo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param encargoId the primary key of the encargo
	 * @return the encargo that was removed
	 * @throws NoSuchEncargoException if a encargo with the primary key could not be found
	 */
	public Encargo remove(long encargoId) throws NoSuchEncargoException;

	public Encargo updateImpl(Encargo encargo);

	/**
	 * Returns the encargo with the primary key or throws a <code>NoSuchEncargoException</code> if it could not be found.
	 *
	 * @param encargoId the primary key of the encargo
	 * @return the encargo
	 * @throws NoSuchEncargoException if a encargo with the primary key could not be found
	 */
	public Encargo findByPrimaryKey(long encargoId)
		throws NoSuchEncargoException;

	/**
	 * Returns the encargo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param encargoId the primary key of the encargo
	 * @return the encargo, or <code>null</code> if a encargo with the primary key could not be found
	 */
	public Encargo fetchByPrimaryKey(long encargoId);

	/**
	 * Returns all the encargos.
	 *
	 * @return the encargos
	 */
	public java.util.List<Encargo> findAll();

	/**
	 * Returns a range of all the encargos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @return the range of encargos
	 */
	public java.util.List<Encargo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the encargos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of encargos
	 */
	public java.util.List<Encargo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Encargo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the encargos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EncargoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of encargos
	 * @param end the upper bound of the range of encargos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of encargos
	 */
	public java.util.List<Encargo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Encargo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the encargos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of encargos.
	 *
	 * @return the number of encargos
	 */
	public int countAll();

}