/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchAcaoJudicialException;
import br.com.seatecnologia.gdf.negocia.model.AcaoJudicial;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acao judicial service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcaoJudicialUtil
 * @generated
 */
@ProviderType
public interface AcaoJudicialPersistence extends BasePersistence<AcaoJudicial> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcaoJudicialUtil} to access the acao judicial persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acao judicials where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acao judicials
	 */
	public java.util.List<AcaoJudicial> findByUuid(String uuid);

	/**
	 * Returns a range of all the acao judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @return the range of matching acao judicials
	 */
	public java.util.List<AcaoJudicial> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acao judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acao judicials
	 */
	public java.util.List<AcaoJudicial> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicial>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acao judicials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acao judicials
	 */
	public java.util.List<AcaoJudicial> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicial>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acao judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial
	 * @throws NoSuchAcaoJudicialException if a matching acao judicial could not be found
	 */
	public AcaoJudicial findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicial>
				orderByComparator)
		throws NoSuchAcaoJudicialException;

	/**
	 * Returns the first acao judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial, or <code>null</code> if a matching acao judicial could not be found
	 */
	public AcaoJudicial fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicial>
			orderByComparator);

	/**
	 * Returns the last acao judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial
	 * @throws NoSuchAcaoJudicialException if a matching acao judicial could not be found
	 */
	public AcaoJudicial findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicial>
				orderByComparator)
		throws NoSuchAcaoJudicialException;

	/**
	 * Returns the last acao judicial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial, or <code>null</code> if a matching acao judicial could not be found
	 */
	public AcaoJudicial fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicial>
			orderByComparator);

	/**
	 * Returns the acao judicials before and after the current acao judicial in the ordered set where uuid = &#63;.
	 *
	 * @param acaoId the primary key of the current acao judicial
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acao judicial
	 * @throws NoSuchAcaoJudicialException if a acao judicial with the primary key could not be found
	 */
	public AcaoJudicial[] findByUuid_PrevAndNext(
			long acaoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicial>
				orderByComparator)
		throws NoSuchAcaoJudicialException;

	/**
	 * Removes all the acao judicials where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acao judicials where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acao judicials
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the acao judicials where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching acao judicials
	 */
	public java.util.List<AcaoJudicial> findByPropostaId(long propostaId);

	/**
	 * Returns a range of all the acao judicials where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @return the range of matching acao judicials
	 */
	public java.util.List<AcaoJudicial> findByPropostaId(
		long propostaId, int start, int end);

	/**
	 * Returns an ordered range of all the acao judicials where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acao judicials
	 */
	public java.util.List<AcaoJudicial> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicial>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acao judicials where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acao judicials
	 */
	public java.util.List<AcaoJudicial> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicial>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acao judicial in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial
	 * @throws NoSuchAcaoJudicialException if a matching acao judicial could not be found
	 */
	public AcaoJudicial findByPropostaId_First(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicial>
				orderByComparator)
		throws NoSuchAcaoJudicialException;

	/**
	 * Returns the first acao judicial in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acao judicial, or <code>null</code> if a matching acao judicial could not be found
	 */
	public AcaoJudicial fetchByPropostaId_First(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicial>
			orderByComparator);

	/**
	 * Returns the last acao judicial in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial
	 * @throws NoSuchAcaoJudicialException if a matching acao judicial could not be found
	 */
	public AcaoJudicial findByPropostaId_Last(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicial>
				orderByComparator)
		throws NoSuchAcaoJudicialException;

	/**
	 * Returns the last acao judicial in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acao judicial, or <code>null</code> if a matching acao judicial could not be found
	 */
	public AcaoJudicial fetchByPropostaId_Last(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicial>
			orderByComparator);

	/**
	 * Returns the acao judicials before and after the current acao judicial in the ordered set where propostaId = &#63;.
	 *
	 * @param acaoId the primary key of the current acao judicial
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acao judicial
	 * @throws NoSuchAcaoJudicialException if a acao judicial with the primary key could not be found
	 */
	public AcaoJudicial[] findByPropostaId_PrevAndNext(
			long acaoId, long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicial>
				orderByComparator)
		throws NoSuchAcaoJudicialException;

	/**
	 * Removes all the acao judicials where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public void removeByPropostaId(long propostaId);

	/**
	 * Returns the number of acao judicials where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching acao judicials
	 */
	public int countByPropostaId(long propostaId);

	/**
	 * Caches the acao judicial in the entity cache if it is enabled.
	 *
	 * @param acaoJudicial the acao judicial
	 */
	public void cacheResult(AcaoJudicial acaoJudicial);

	/**
	 * Caches the acao judicials in the entity cache if it is enabled.
	 *
	 * @param acaoJudicials the acao judicials
	 */
	public void cacheResult(java.util.List<AcaoJudicial> acaoJudicials);

	/**
	 * Creates a new acao judicial with the primary key. Does not add the acao judicial to the database.
	 *
	 * @param acaoId the primary key for the new acao judicial
	 * @return the new acao judicial
	 */
	public AcaoJudicial create(long acaoId);

	/**
	 * Removes the acao judicial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acaoId the primary key of the acao judicial
	 * @return the acao judicial that was removed
	 * @throws NoSuchAcaoJudicialException if a acao judicial with the primary key could not be found
	 */
	public AcaoJudicial remove(long acaoId) throws NoSuchAcaoJudicialException;

	public AcaoJudicial updateImpl(AcaoJudicial acaoJudicial);

	/**
	 * Returns the acao judicial with the primary key or throws a <code>NoSuchAcaoJudicialException</code> if it could not be found.
	 *
	 * @param acaoId the primary key of the acao judicial
	 * @return the acao judicial
	 * @throws NoSuchAcaoJudicialException if a acao judicial with the primary key could not be found
	 */
	public AcaoJudicial findByPrimaryKey(long acaoId)
		throws NoSuchAcaoJudicialException;

	/**
	 * Returns the acao judicial with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acaoId the primary key of the acao judicial
	 * @return the acao judicial, or <code>null</code> if a acao judicial with the primary key could not be found
	 */
	public AcaoJudicial fetchByPrimaryKey(long acaoId);

	/**
	 * Returns all the acao judicials.
	 *
	 * @return the acao judicials
	 */
	public java.util.List<AcaoJudicial> findAll();

	/**
	 * Returns a range of all the acao judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @return the range of acao judicials
	 */
	public java.util.List<AcaoJudicial> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acao judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acao judicials
	 */
	public java.util.List<AcaoJudicial> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicial>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acao judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acao judicials
	 */
	public java.util.List<AcaoJudicial> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcaoJudicial>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acao judicials from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acao judicials.
	 *
	 * @return the number of acao judicials
	 */
	public int countAll();

}