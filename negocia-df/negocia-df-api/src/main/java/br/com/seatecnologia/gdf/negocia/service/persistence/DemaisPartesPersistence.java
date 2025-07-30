/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDemaisPartesException;
import br.com.seatecnologia.gdf.negocia.model.DemaisPartes;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the demais partes service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DemaisPartesUtil
 * @generated
 */
@ProviderType
public interface DemaisPartesPersistence extends BasePersistence<DemaisPartes> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DemaisPartesUtil} to access the demais partes persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the demais parteses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching demais parteses
	 */
	public java.util.List<DemaisPartes> findByUuid(String uuid);

	/**
	 * Returns a range of all the demais parteses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @return the range of matching demais parteses
	 */
	public java.util.List<DemaisPartes> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the demais parteses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demais parteses
	 */
	public java.util.List<DemaisPartes> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemaisPartes>
			orderByComparator);

	/**
	 * Returns an ordered range of all the demais parteses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demais parteses
	 */
	public java.util.List<DemaisPartes> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemaisPartes>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first demais partes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demais partes
	 * @throws NoSuchDemaisPartesException if a matching demais partes could not be found
	 */
	public DemaisPartes findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DemaisPartes>
				orderByComparator)
		throws NoSuchDemaisPartesException;

	/**
	 * Returns the first demais partes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demais partes, or <code>null</code> if a matching demais partes could not be found
	 */
	public DemaisPartes fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DemaisPartes>
			orderByComparator);

	/**
	 * Returns the last demais partes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demais partes
	 * @throws NoSuchDemaisPartesException if a matching demais partes could not be found
	 */
	public DemaisPartes findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DemaisPartes>
				orderByComparator)
		throws NoSuchDemaisPartesException;

	/**
	 * Returns the last demais partes in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demais partes, or <code>null</code> if a matching demais partes could not be found
	 */
	public DemaisPartes fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DemaisPartes>
			orderByComparator);

	/**
	 * Returns the demais parteses before and after the current demais partes in the ordered set where uuid = &#63;.
	 *
	 * @param demaisPartesId the primary key of the current demais partes
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demais partes
	 * @throws NoSuchDemaisPartesException if a demais partes with the primary key could not be found
	 */
	public DemaisPartes[] findByUuid_PrevAndNext(
			long demaisPartesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DemaisPartes>
				orderByComparator)
		throws NoSuchDemaisPartesException;

	/**
	 * Removes all the demais parteses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of demais parteses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching demais parteses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the demais parteses where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching demais parteses
	 */
	public java.util.List<DemaisPartes> findByPropostaId(long propostaId);

	/**
	 * Returns a range of all the demais parteses where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @return the range of matching demais parteses
	 */
	public java.util.List<DemaisPartes> findByPropostaId(
		long propostaId, int start, int end);

	/**
	 * Returns an ordered range of all the demais parteses where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demais parteses
	 */
	public java.util.List<DemaisPartes> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemaisPartes>
			orderByComparator);

	/**
	 * Returns an ordered range of all the demais parteses where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demais parteses
	 */
	public java.util.List<DemaisPartes> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemaisPartes>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first demais partes in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demais partes
	 * @throws NoSuchDemaisPartesException if a matching demais partes could not be found
	 */
	public DemaisPartes findByPropostaId_First(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<DemaisPartes>
				orderByComparator)
		throws NoSuchDemaisPartesException;

	/**
	 * Returns the first demais partes in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demais partes, or <code>null</code> if a matching demais partes could not be found
	 */
	public DemaisPartes fetchByPropostaId_First(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<DemaisPartes>
			orderByComparator);

	/**
	 * Returns the last demais partes in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demais partes
	 * @throws NoSuchDemaisPartesException if a matching demais partes could not be found
	 */
	public DemaisPartes findByPropostaId_Last(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<DemaisPartes>
				orderByComparator)
		throws NoSuchDemaisPartesException;

	/**
	 * Returns the last demais partes in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demais partes, or <code>null</code> if a matching demais partes could not be found
	 */
	public DemaisPartes fetchByPropostaId_Last(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<DemaisPartes>
			orderByComparator);

	/**
	 * Returns the demais parteses before and after the current demais partes in the ordered set where propostaId = &#63;.
	 *
	 * @param demaisPartesId the primary key of the current demais partes
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demais partes
	 * @throws NoSuchDemaisPartesException if a demais partes with the primary key could not be found
	 */
	public DemaisPartes[] findByPropostaId_PrevAndNext(
			long demaisPartesId, long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<DemaisPartes>
				orderByComparator)
		throws NoSuchDemaisPartesException;

	/**
	 * Removes all the demais parteses where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public void removeByPropostaId(long propostaId);

	/**
	 * Returns the number of demais parteses where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching demais parteses
	 */
	public int countByPropostaId(long propostaId);

	/**
	 * Caches the demais partes in the entity cache if it is enabled.
	 *
	 * @param demaisPartes the demais partes
	 */
	public void cacheResult(DemaisPartes demaisPartes);

	/**
	 * Caches the demais parteses in the entity cache if it is enabled.
	 *
	 * @param demaisParteses the demais parteses
	 */
	public void cacheResult(java.util.List<DemaisPartes> demaisParteses);

	/**
	 * Creates a new demais partes with the primary key. Does not add the demais partes to the database.
	 *
	 * @param demaisPartesId the primary key for the new demais partes
	 * @return the new demais partes
	 */
	public DemaisPartes create(long demaisPartesId);

	/**
	 * Removes the demais partes with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param demaisPartesId the primary key of the demais partes
	 * @return the demais partes that was removed
	 * @throws NoSuchDemaisPartesException if a demais partes with the primary key could not be found
	 */
	public DemaisPartes remove(long demaisPartesId)
		throws NoSuchDemaisPartesException;

	public DemaisPartes updateImpl(DemaisPartes demaisPartes);

	/**
	 * Returns the demais partes with the primary key or throws a <code>NoSuchDemaisPartesException</code> if it could not be found.
	 *
	 * @param demaisPartesId the primary key of the demais partes
	 * @return the demais partes
	 * @throws NoSuchDemaisPartesException if a demais partes with the primary key could not be found
	 */
	public DemaisPartes findByPrimaryKey(long demaisPartesId)
		throws NoSuchDemaisPartesException;

	/**
	 * Returns the demais partes with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param demaisPartesId the primary key of the demais partes
	 * @return the demais partes, or <code>null</code> if a demais partes with the primary key could not be found
	 */
	public DemaisPartes fetchByPrimaryKey(long demaisPartesId);

	/**
	 * Returns all the demais parteses.
	 *
	 * @return the demais parteses
	 */
	public java.util.List<DemaisPartes> findAll();

	/**
	 * Returns a range of all the demais parteses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @return the range of demais parteses
	 */
	public java.util.List<DemaisPartes> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the demais parteses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of demais parteses
	 */
	public java.util.List<DemaisPartes> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemaisPartes>
			orderByComparator);

	/**
	 * Returns an ordered range of all the demais parteses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemaisPartesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demais parteses
	 * @param end the upper bound of the range of demais parteses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of demais parteses
	 */
	public java.util.List<DemaisPartes> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemaisPartes>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the demais parteses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of demais parteses.
	 *
	 * @return the number of demais parteses
	 */
	public int countAll();

}