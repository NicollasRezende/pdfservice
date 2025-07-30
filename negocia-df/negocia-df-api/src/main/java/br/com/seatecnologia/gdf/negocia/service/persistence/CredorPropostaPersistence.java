/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchCredorPropostaException;
import br.com.seatecnologia.gdf.negocia.model.CredorProposta;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the credor proposta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CredorPropostaUtil
 * @generated
 */
@ProviderType
public interface CredorPropostaPersistence
	extends BasePersistence<CredorProposta> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CredorPropostaUtil} to access the credor proposta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the credor propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching credor propostas
	 */
	public java.util.List<CredorProposta> findByUuid(String uuid);

	/**
	 * Returns a range of all the credor propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @return the range of matching credor propostas
	 */
	public java.util.List<CredorProposta> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the credor propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching credor propostas
	 */
	public java.util.List<CredorProposta> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CredorProposta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the credor propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching credor propostas
	 */
	public java.util.List<CredorProposta> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CredorProposta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first credor proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credor proposta
	 * @throws NoSuchCredorPropostaException if a matching credor proposta could not be found
	 */
	public CredorProposta findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<CredorProposta>
				orderByComparator)
		throws NoSuchCredorPropostaException;

	/**
	 * Returns the first credor proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credor proposta, or <code>null</code> if a matching credor proposta could not be found
	 */
	public CredorProposta fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CredorProposta>
			orderByComparator);

	/**
	 * Returns the last credor proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credor proposta
	 * @throws NoSuchCredorPropostaException if a matching credor proposta could not be found
	 */
	public CredorProposta findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<CredorProposta>
				orderByComparator)
		throws NoSuchCredorPropostaException;

	/**
	 * Returns the last credor proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credor proposta, or <code>null</code> if a matching credor proposta could not be found
	 */
	public CredorProposta fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CredorProposta>
			orderByComparator);

	/**
	 * Returns the credor propostas before and after the current credor proposta in the ordered set where uuid = &#63;.
	 *
	 * @param credorPropostaId the primary key of the current credor proposta
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next credor proposta
	 * @throws NoSuchCredorPropostaException if a credor proposta with the primary key could not be found
	 */
	public CredorProposta[] findByUuid_PrevAndNext(
			long credorPropostaId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<CredorProposta>
				orderByComparator)
		throws NoSuchCredorPropostaException;

	/**
	 * Removes all the credor propostas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of credor propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching credor propostas
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the credor propostas where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching credor propostas
	 */
	public java.util.List<CredorProposta> findByPropostaId(long propostaId);

	/**
	 * Returns a range of all the credor propostas where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @return the range of matching credor propostas
	 */
	public java.util.List<CredorProposta> findByPropostaId(
		long propostaId, int start, int end);

	/**
	 * Returns an ordered range of all the credor propostas where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching credor propostas
	 */
	public java.util.List<CredorProposta> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CredorProposta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the credor propostas where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching credor propostas
	 */
	public java.util.List<CredorProposta> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CredorProposta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first credor proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credor proposta
	 * @throws NoSuchCredorPropostaException if a matching credor proposta could not be found
	 */
	public CredorProposta findByPropostaId_First(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<CredorProposta>
				orderByComparator)
		throws NoSuchCredorPropostaException;

	/**
	 * Returns the first credor proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credor proposta, or <code>null</code> if a matching credor proposta could not be found
	 */
	public CredorProposta fetchByPropostaId_First(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<CredorProposta>
			orderByComparator);

	/**
	 * Returns the last credor proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credor proposta
	 * @throws NoSuchCredorPropostaException if a matching credor proposta could not be found
	 */
	public CredorProposta findByPropostaId_Last(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<CredorProposta>
				orderByComparator)
		throws NoSuchCredorPropostaException;

	/**
	 * Returns the last credor proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credor proposta, or <code>null</code> if a matching credor proposta could not be found
	 */
	public CredorProposta fetchByPropostaId_Last(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<CredorProposta>
			orderByComparator);

	/**
	 * Returns the credor propostas before and after the current credor proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param credorPropostaId the primary key of the current credor proposta
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next credor proposta
	 * @throws NoSuchCredorPropostaException if a credor proposta with the primary key could not be found
	 */
	public CredorProposta[] findByPropostaId_PrevAndNext(
			long credorPropostaId, long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<CredorProposta>
				orderByComparator)
		throws NoSuchCredorPropostaException;

	/**
	 * Removes all the credor propostas where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public void removeByPropostaId(long propostaId);

	/**
	 * Returns the number of credor propostas where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching credor propostas
	 */
	public int countByPropostaId(long propostaId);

	/**
	 * Caches the credor proposta in the entity cache if it is enabled.
	 *
	 * @param credorProposta the credor proposta
	 */
	public void cacheResult(CredorProposta credorProposta);

	/**
	 * Caches the credor propostas in the entity cache if it is enabled.
	 *
	 * @param credorPropostas the credor propostas
	 */
	public void cacheResult(java.util.List<CredorProposta> credorPropostas);

	/**
	 * Creates a new credor proposta with the primary key. Does not add the credor proposta to the database.
	 *
	 * @param credorPropostaId the primary key for the new credor proposta
	 * @return the new credor proposta
	 */
	public CredorProposta create(long credorPropostaId);

	/**
	 * Removes the credor proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param credorPropostaId the primary key of the credor proposta
	 * @return the credor proposta that was removed
	 * @throws NoSuchCredorPropostaException if a credor proposta with the primary key could not be found
	 */
	public CredorProposta remove(long credorPropostaId)
		throws NoSuchCredorPropostaException;

	public CredorProposta updateImpl(CredorProposta credorProposta);

	/**
	 * Returns the credor proposta with the primary key or throws a <code>NoSuchCredorPropostaException</code> if it could not be found.
	 *
	 * @param credorPropostaId the primary key of the credor proposta
	 * @return the credor proposta
	 * @throws NoSuchCredorPropostaException if a credor proposta with the primary key could not be found
	 */
	public CredorProposta findByPrimaryKey(long credorPropostaId)
		throws NoSuchCredorPropostaException;

	/**
	 * Returns the credor proposta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param credorPropostaId the primary key of the credor proposta
	 * @return the credor proposta, or <code>null</code> if a credor proposta with the primary key could not be found
	 */
	public CredorProposta fetchByPrimaryKey(long credorPropostaId);

	/**
	 * Returns all the credor propostas.
	 *
	 * @return the credor propostas
	 */
	public java.util.List<CredorProposta> findAll();

	/**
	 * Returns a range of all the credor propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @return the range of credor propostas
	 */
	public java.util.List<CredorProposta> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the credor propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of credor propostas
	 */
	public java.util.List<CredorProposta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CredorProposta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the credor propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of credor propostas
	 */
	public java.util.List<CredorProposta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CredorProposta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the credor propostas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of credor propostas.
	 *
	 * @return the number of credor propostas
	 */
	public int countAll();

}