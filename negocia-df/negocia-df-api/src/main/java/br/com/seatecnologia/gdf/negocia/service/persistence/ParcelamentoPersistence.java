/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchParcelamentoException;
import br.com.seatecnologia.gdf.negocia.model.Parcelamento;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the parcelamento service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ParcelamentoUtil
 * @generated
 */
@ProviderType
public interface ParcelamentoPersistence extends BasePersistence<Parcelamento> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ParcelamentoUtil} to access the parcelamento persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the parcelamentos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching parcelamentos
	 */
	public java.util.List<Parcelamento> findByUuid(String uuid);

	/**
	 * Returns a range of all the parcelamentos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @return the range of matching parcelamentos
	 */
	public java.util.List<Parcelamento> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the parcelamentos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching parcelamentos
	 */
	public java.util.List<Parcelamento> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Parcelamento>
			orderByComparator);

	/**
	 * Returns an ordered range of all the parcelamentos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching parcelamentos
	 */
	public java.util.List<Parcelamento> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Parcelamento>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first parcelamento in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parcelamento
	 * @throws NoSuchParcelamentoException if a matching parcelamento could not be found
	 */
	public Parcelamento findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Parcelamento>
				orderByComparator)
		throws NoSuchParcelamentoException;

	/**
	 * Returns the first parcelamento in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parcelamento, or <code>null</code> if a matching parcelamento could not be found
	 */
	public Parcelamento fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Parcelamento>
			orderByComparator);

	/**
	 * Returns the last parcelamento in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parcelamento
	 * @throws NoSuchParcelamentoException if a matching parcelamento could not be found
	 */
	public Parcelamento findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Parcelamento>
				orderByComparator)
		throws NoSuchParcelamentoException;

	/**
	 * Returns the last parcelamento in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parcelamento, or <code>null</code> if a matching parcelamento could not be found
	 */
	public Parcelamento fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Parcelamento>
			orderByComparator);

	/**
	 * Returns the parcelamentos before and after the current parcelamento in the ordered set where uuid = &#63;.
	 *
	 * @param parcelamentoId the primary key of the current parcelamento
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next parcelamento
	 * @throws NoSuchParcelamentoException if a parcelamento with the primary key could not be found
	 */
	public Parcelamento[] findByUuid_PrevAndNext(
			long parcelamentoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Parcelamento>
				orderByComparator)
		throws NoSuchParcelamentoException;

	/**
	 * Removes all the parcelamentos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of parcelamentos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching parcelamentos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the parcelamentos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching parcelamentos
	 */
	public java.util.List<Parcelamento> findByPropostaId(long propostaId);

	/**
	 * Returns a range of all the parcelamentos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @return the range of matching parcelamentos
	 */
	public java.util.List<Parcelamento> findByPropostaId(
		long propostaId, int start, int end);

	/**
	 * Returns an ordered range of all the parcelamentos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching parcelamentos
	 */
	public java.util.List<Parcelamento> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Parcelamento>
			orderByComparator);

	/**
	 * Returns an ordered range of all the parcelamentos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching parcelamentos
	 */
	public java.util.List<Parcelamento> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Parcelamento>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first parcelamento in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parcelamento
	 * @throws NoSuchParcelamentoException if a matching parcelamento could not be found
	 */
	public Parcelamento findByPropostaId_First(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<Parcelamento>
				orderByComparator)
		throws NoSuchParcelamentoException;

	/**
	 * Returns the first parcelamento in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching parcelamento, or <code>null</code> if a matching parcelamento could not be found
	 */
	public Parcelamento fetchByPropostaId_First(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<Parcelamento>
			orderByComparator);

	/**
	 * Returns the last parcelamento in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parcelamento
	 * @throws NoSuchParcelamentoException if a matching parcelamento could not be found
	 */
	public Parcelamento findByPropostaId_Last(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<Parcelamento>
				orderByComparator)
		throws NoSuchParcelamentoException;

	/**
	 * Returns the last parcelamento in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching parcelamento, or <code>null</code> if a matching parcelamento could not be found
	 */
	public Parcelamento fetchByPropostaId_Last(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<Parcelamento>
			orderByComparator);

	/**
	 * Returns the parcelamentos before and after the current parcelamento in the ordered set where propostaId = &#63;.
	 *
	 * @param parcelamentoId the primary key of the current parcelamento
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next parcelamento
	 * @throws NoSuchParcelamentoException if a parcelamento with the primary key could not be found
	 */
	public Parcelamento[] findByPropostaId_PrevAndNext(
			long parcelamentoId, long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<Parcelamento>
				orderByComparator)
		throws NoSuchParcelamentoException;

	/**
	 * Removes all the parcelamentos where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public void removeByPropostaId(long propostaId);

	/**
	 * Returns the number of parcelamentos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching parcelamentos
	 */
	public int countByPropostaId(long propostaId);

	/**
	 * Caches the parcelamento in the entity cache if it is enabled.
	 *
	 * @param parcelamento the parcelamento
	 */
	public void cacheResult(Parcelamento parcelamento);

	/**
	 * Caches the parcelamentos in the entity cache if it is enabled.
	 *
	 * @param parcelamentos the parcelamentos
	 */
	public void cacheResult(java.util.List<Parcelamento> parcelamentos);

	/**
	 * Creates a new parcelamento with the primary key. Does not add the parcelamento to the database.
	 *
	 * @param parcelamentoId the primary key for the new parcelamento
	 * @return the new parcelamento
	 */
	public Parcelamento create(long parcelamentoId);

	/**
	 * Removes the parcelamento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param parcelamentoId the primary key of the parcelamento
	 * @return the parcelamento that was removed
	 * @throws NoSuchParcelamentoException if a parcelamento with the primary key could not be found
	 */
	public Parcelamento remove(long parcelamentoId)
		throws NoSuchParcelamentoException;

	public Parcelamento updateImpl(Parcelamento parcelamento);

	/**
	 * Returns the parcelamento with the primary key or throws a <code>NoSuchParcelamentoException</code> if it could not be found.
	 *
	 * @param parcelamentoId the primary key of the parcelamento
	 * @return the parcelamento
	 * @throws NoSuchParcelamentoException if a parcelamento with the primary key could not be found
	 */
	public Parcelamento findByPrimaryKey(long parcelamentoId)
		throws NoSuchParcelamentoException;

	/**
	 * Returns the parcelamento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param parcelamentoId the primary key of the parcelamento
	 * @return the parcelamento, or <code>null</code> if a parcelamento with the primary key could not be found
	 */
	public Parcelamento fetchByPrimaryKey(long parcelamentoId);

	/**
	 * Returns all the parcelamentos.
	 *
	 * @return the parcelamentos
	 */
	public java.util.List<Parcelamento> findAll();

	/**
	 * Returns a range of all the parcelamentos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @return the range of parcelamentos
	 */
	public java.util.List<Parcelamento> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the parcelamentos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of parcelamentos
	 */
	public java.util.List<Parcelamento> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Parcelamento>
			orderByComparator);

	/**
	 * Returns an ordered range of all the parcelamentos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of parcelamentos
	 */
	public java.util.List<Parcelamento> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Parcelamento>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the parcelamentos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of parcelamentos.
	 *
	 * @return the number of parcelamentos
	 */
	public int countAll();

}