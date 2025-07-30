/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchRelacaoCredorException;
import br.com.seatecnologia.gdf.negocia.model.RelacaoCredor;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the relacao credor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RelacaoCredorUtil
 * @generated
 */
@ProviderType
public interface RelacaoCredorPersistence
	extends BasePersistence<RelacaoCredor> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RelacaoCredorUtil} to access the relacao credor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the relacao credors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching relacao credors
	 */
	public java.util.List<RelacaoCredor> findByUuid(String uuid);

	/**
	 * Returns a range of all the relacao credors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @return the range of matching relacao credors
	 */
	public java.util.List<RelacaoCredor> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the relacao credors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching relacao credors
	 */
	public java.util.List<RelacaoCredor> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RelacaoCredor>
			orderByComparator);

	/**
	 * Returns an ordered range of all the relacao credors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching relacao credors
	 */
	public java.util.List<RelacaoCredor> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RelacaoCredor>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first relacao credor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching relacao credor
	 * @throws NoSuchRelacaoCredorException if a matching relacao credor could not be found
	 */
	public RelacaoCredor findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<RelacaoCredor>
				orderByComparator)
		throws NoSuchRelacaoCredorException;

	/**
	 * Returns the first relacao credor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching relacao credor, or <code>null</code> if a matching relacao credor could not be found
	 */
	public RelacaoCredor fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<RelacaoCredor>
			orderByComparator);

	/**
	 * Returns the last relacao credor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching relacao credor
	 * @throws NoSuchRelacaoCredorException if a matching relacao credor could not be found
	 */
	public RelacaoCredor findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<RelacaoCredor>
				orderByComparator)
		throws NoSuchRelacaoCredorException;

	/**
	 * Returns the last relacao credor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching relacao credor, or <code>null</code> if a matching relacao credor could not be found
	 */
	public RelacaoCredor fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<RelacaoCredor>
			orderByComparator);

	/**
	 * Returns the relacao credors before and after the current relacao credor in the ordered set where uuid = &#63;.
	 *
	 * @param credorId the primary key of the current relacao credor
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next relacao credor
	 * @throws NoSuchRelacaoCredorException if a relacao credor with the primary key could not be found
	 */
	public RelacaoCredor[] findByUuid_PrevAndNext(
			long credorId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<RelacaoCredor>
				orderByComparator)
		throws NoSuchRelacaoCredorException;

	/**
	 * Removes all the relacao credors where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of relacao credors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching relacao credors
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the relacao credors where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching relacao credors
	 */
	public java.util.List<RelacaoCredor> findByPropostaId(long propostaId);

	/**
	 * Returns a range of all the relacao credors where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @return the range of matching relacao credors
	 */
	public java.util.List<RelacaoCredor> findByPropostaId(
		long propostaId, int start, int end);

	/**
	 * Returns an ordered range of all the relacao credors where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching relacao credors
	 */
	public java.util.List<RelacaoCredor> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RelacaoCredor>
			orderByComparator);

	/**
	 * Returns an ordered range of all the relacao credors where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching relacao credors
	 */
	public java.util.List<RelacaoCredor> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RelacaoCredor>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first relacao credor in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching relacao credor
	 * @throws NoSuchRelacaoCredorException if a matching relacao credor could not be found
	 */
	public RelacaoCredor findByPropostaId_First(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<RelacaoCredor>
				orderByComparator)
		throws NoSuchRelacaoCredorException;

	/**
	 * Returns the first relacao credor in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching relacao credor, or <code>null</code> if a matching relacao credor could not be found
	 */
	public RelacaoCredor fetchByPropostaId_First(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<RelacaoCredor>
			orderByComparator);

	/**
	 * Returns the last relacao credor in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching relacao credor
	 * @throws NoSuchRelacaoCredorException if a matching relacao credor could not be found
	 */
	public RelacaoCredor findByPropostaId_Last(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<RelacaoCredor>
				orderByComparator)
		throws NoSuchRelacaoCredorException;

	/**
	 * Returns the last relacao credor in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching relacao credor, or <code>null</code> if a matching relacao credor could not be found
	 */
	public RelacaoCredor fetchByPropostaId_Last(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<RelacaoCredor>
			orderByComparator);

	/**
	 * Returns the relacao credors before and after the current relacao credor in the ordered set where propostaId = &#63;.
	 *
	 * @param credorId the primary key of the current relacao credor
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next relacao credor
	 * @throws NoSuchRelacaoCredorException if a relacao credor with the primary key could not be found
	 */
	public RelacaoCredor[] findByPropostaId_PrevAndNext(
			long credorId, long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<RelacaoCredor>
				orderByComparator)
		throws NoSuchRelacaoCredorException;

	/**
	 * Removes all the relacao credors where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public void removeByPropostaId(long propostaId);

	/**
	 * Returns the number of relacao credors where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching relacao credors
	 */
	public int countByPropostaId(long propostaId);

	/**
	 * Caches the relacao credor in the entity cache if it is enabled.
	 *
	 * @param relacaoCredor the relacao credor
	 */
	public void cacheResult(RelacaoCredor relacaoCredor);

	/**
	 * Caches the relacao credors in the entity cache if it is enabled.
	 *
	 * @param relacaoCredors the relacao credors
	 */
	public void cacheResult(java.util.List<RelacaoCredor> relacaoCredors);

	/**
	 * Creates a new relacao credor with the primary key. Does not add the relacao credor to the database.
	 *
	 * @param credorId the primary key for the new relacao credor
	 * @return the new relacao credor
	 */
	public RelacaoCredor create(long credorId);

	/**
	 * Removes the relacao credor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param credorId the primary key of the relacao credor
	 * @return the relacao credor that was removed
	 * @throws NoSuchRelacaoCredorException if a relacao credor with the primary key could not be found
	 */
	public RelacaoCredor remove(long credorId)
		throws NoSuchRelacaoCredorException;

	public RelacaoCredor updateImpl(RelacaoCredor relacaoCredor);

	/**
	 * Returns the relacao credor with the primary key or throws a <code>NoSuchRelacaoCredorException</code> if it could not be found.
	 *
	 * @param credorId the primary key of the relacao credor
	 * @return the relacao credor
	 * @throws NoSuchRelacaoCredorException if a relacao credor with the primary key could not be found
	 */
	public RelacaoCredor findByPrimaryKey(long credorId)
		throws NoSuchRelacaoCredorException;

	/**
	 * Returns the relacao credor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param credorId the primary key of the relacao credor
	 * @return the relacao credor, or <code>null</code> if a relacao credor with the primary key could not be found
	 */
	public RelacaoCredor fetchByPrimaryKey(long credorId);

	/**
	 * Returns all the relacao credors.
	 *
	 * @return the relacao credors
	 */
	public java.util.List<RelacaoCredor> findAll();

	/**
	 * Returns a range of all the relacao credors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @return the range of relacao credors
	 */
	public java.util.List<RelacaoCredor> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the relacao credors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of relacao credors
	 */
	public java.util.List<RelacaoCredor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RelacaoCredor>
			orderByComparator);

	/**
	 * Returns an ordered range of all the relacao credors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of relacao credors
	 */
	public java.util.List<RelacaoCredor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RelacaoCredor>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the relacao credors from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of relacao credors.
	 *
	 * @return the number of relacao credors
	 */
	public int countAll();

}