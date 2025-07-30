/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchAcaoJudicialPropostaException;
import br.com.seatecnologia.gdf.negocia.model.AcaoJudicialProposta;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acao judicial proposta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcaoJudicialPropostaUtil
 * @generated
 */
@ProviderType
public interface AcaoJudicialPropostaPersistence
	extends BasePersistence<AcaoJudicialProposta> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcaoJudicialPropostaUtil} to access the acao judicial proposta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acao judicial propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acao judicial propostas
	 */
	public java.util.List<AcaoJudicialProposta> findByUuid(String uuid);

	/**
	 * Returns a range of all the acao judicial propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @return the range of matching acao judicial propostas
	 */
	public java.util.List<AcaoJudicialProposta> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acao judicial propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acao judicial propostas
	 */
	public java.util.List<AcaoJudicialProposta> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicialProposta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acao judicial propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acao judicial propostas
	 */
	public java.util.List<AcaoJudicialProposta> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicialProposta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acao judicial proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a matching acao judicial proposta could not be found
	 */
	public AcaoJudicialProposta findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcaoJudicialProposta> orderByComparator)
		throws NoSuchAcaoJudicialPropostaException;

	/**
	 * Returns the first acao judicial proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial proposta, or <code>null</code> if a matching acao judicial proposta could not be found
	 */
	public AcaoJudicialProposta fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicialProposta>
			orderByComparator);

	/**
	 * Returns the last acao judicial proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a matching acao judicial proposta could not be found
	 */
	public AcaoJudicialProposta findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcaoJudicialProposta> orderByComparator)
		throws NoSuchAcaoJudicialPropostaException;

	/**
	 * Returns the last acao judicial proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial proposta, or <code>null</code> if a matching acao judicial proposta could not be found
	 */
	public AcaoJudicialProposta fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicialProposta>
			orderByComparator);

	/**
	 * Returns the acao judicial propostas before and after the current acao judicial proposta in the ordered set where uuid = &#63;.
	 *
	 * @param acaoPropostaId the primary key of the current acao judicial proposta
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a acao judicial proposta with the primary key could not be found
	 */
	public AcaoJudicialProposta[] findByUuid_PrevAndNext(
			long acaoPropostaId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcaoJudicialProposta> orderByComparator)
		throws NoSuchAcaoJudicialPropostaException;

	/**
	 * Removes all the acao judicial propostas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acao judicial propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acao judicial propostas
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the acao judicial propostas where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching acao judicial propostas
	 */
	public java.util.List<AcaoJudicialProposta> findByPropostaId(
		long propostaId);

	/**
	 * Returns a range of all the acao judicial propostas where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @return the range of matching acao judicial propostas
	 */
	public java.util.List<AcaoJudicialProposta> findByPropostaId(
		long propostaId, int start, int end);

	/**
	 * Returns an ordered range of all the acao judicial propostas where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acao judicial propostas
	 */
	public java.util.List<AcaoJudicialProposta> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicialProposta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acao judicial propostas where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acao judicial propostas
	 */
	public java.util.List<AcaoJudicialProposta> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicialProposta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acao judicial proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a matching acao judicial proposta could not be found
	 */
	public AcaoJudicialProposta findByPropostaId_First(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcaoJudicialProposta> orderByComparator)
		throws NoSuchAcaoJudicialPropostaException;

	/**
	 * Returns the first acao judicial proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial proposta, or <code>null</code> if a matching acao judicial proposta could not be found
	 */
	public AcaoJudicialProposta fetchByPropostaId_First(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicialProposta>
			orderByComparator);

	/**
	 * Returns the last acao judicial proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a matching acao judicial proposta could not be found
	 */
	public AcaoJudicialProposta findByPropostaId_Last(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcaoJudicialProposta> orderByComparator)
		throws NoSuchAcaoJudicialPropostaException;

	/**
	 * Returns the last acao judicial proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial proposta, or <code>null</code> if a matching acao judicial proposta could not be found
	 */
	public AcaoJudicialProposta fetchByPropostaId_Last(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicialProposta>
			orderByComparator);

	/**
	 * Returns the acao judicial propostas before and after the current acao judicial proposta in the ordered set where propostaId = &#63;.
	 *
	 * @param acaoPropostaId the primary key of the current acao judicial proposta
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a acao judicial proposta with the primary key could not be found
	 */
	public AcaoJudicialProposta[] findByPropostaId_PrevAndNext(
			long acaoPropostaId, long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcaoJudicialProposta> orderByComparator)
		throws NoSuchAcaoJudicialPropostaException;

	/**
	 * Removes all the acao judicial propostas where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public void removeByPropostaId(long propostaId);

	/**
	 * Returns the number of acao judicial propostas where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching acao judicial propostas
	 */
	public int countByPropostaId(long propostaId);

	/**
	 * Caches the acao judicial proposta in the entity cache if it is enabled.
	 *
	 * @param acaoJudicialProposta the acao judicial proposta
	 */
	public void cacheResult(AcaoJudicialProposta acaoJudicialProposta);

	/**
	 * Caches the acao judicial propostas in the entity cache if it is enabled.
	 *
	 * @param acaoJudicialPropostas the acao judicial propostas
	 */
	public void cacheResult(
		java.util.List<AcaoJudicialProposta> acaoJudicialPropostas);

	/**
	 * Creates a new acao judicial proposta with the primary key. Does not add the acao judicial proposta to the database.
	 *
	 * @param acaoPropostaId the primary key for the new acao judicial proposta
	 * @return the new acao judicial proposta
	 */
	public AcaoJudicialProposta create(long acaoPropostaId);

	/**
	 * Removes the acao judicial proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acaoPropostaId the primary key of the acao judicial proposta
	 * @return the acao judicial proposta that was removed
	 * @throws NoSuchAcaoJudicialPropostaException if a acao judicial proposta with the primary key could not be found
	 */
	public AcaoJudicialProposta remove(long acaoPropostaId)
		throws NoSuchAcaoJudicialPropostaException;

	public AcaoJudicialProposta updateImpl(
		AcaoJudicialProposta acaoJudicialProposta);

	/**
	 * Returns the acao judicial proposta with the primary key or throws a <code>NoSuchAcaoJudicialPropostaException</code> if it could not be found.
	 *
	 * @param acaoPropostaId the primary key of the acao judicial proposta
	 * @return the acao judicial proposta
	 * @throws NoSuchAcaoJudicialPropostaException if a acao judicial proposta with the primary key could not be found
	 */
	public AcaoJudicialProposta findByPrimaryKey(long acaoPropostaId)
		throws NoSuchAcaoJudicialPropostaException;

	/**
	 * Returns the acao judicial proposta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acaoPropostaId the primary key of the acao judicial proposta
	 * @return the acao judicial proposta, or <code>null</code> if a acao judicial proposta with the primary key could not be found
	 */
	public AcaoJudicialProposta fetchByPrimaryKey(long acaoPropostaId);

	/**
	 * Returns all the acao judicial propostas.
	 *
	 * @return the acao judicial propostas
	 */
	public java.util.List<AcaoJudicialProposta> findAll();

	/**
	 * Returns a range of all the acao judicial propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @return the range of acao judicial propostas
	 */
	public java.util.List<AcaoJudicialProposta> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acao judicial propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acao judicial propostas
	 */
	public java.util.List<AcaoJudicialProposta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicialProposta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acao judicial propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acao judicial propostas
	 */
	public java.util.List<AcaoJudicialProposta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicialProposta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acao judicial propostas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acao judicial propostas.
	 *
	 * @return the number of acao judicial propostas
	 */
	public int countAll();

}