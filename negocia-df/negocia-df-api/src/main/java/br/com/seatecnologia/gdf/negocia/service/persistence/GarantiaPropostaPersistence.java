/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchGarantiaPropostaException;
import br.com.seatecnologia.gdf.negocia.model.GarantiaProposta;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the garantia proposta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GarantiaPropostaUtil
 * @generated
 */
@ProviderType
public interface GarantiaPropostaPersistence
	extends BasePersistence<GarantiaProposta> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GarantiaPropostaUtil} to access the garantia proposta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the garantia propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching garantia propostas
	 */
	public java.util.List<GarantiaProposta> findByUuid(String uuid);

	/**
	 * Returns a range of all the garantia propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @return the range of matching garantia propostas
	 */
	public java.util.List<GarantiaProposta> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the garantia propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching garantia propostas
	 */
	public java.util.List<GarantiaProposta> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GarantiaProposta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the garantia propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching garantia propostas
	 */
	public java.util.List<GarantiaProposta> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GarantiaProposta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first garantia proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching garantia proposta
	 * @throws NoSuchGarantiaPropostaException if a matching garantia proposta could not be found
	 */
	public GarantiaProposta findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GarantiaProposta>
				orderByComparator)
		throws NoSuchGarantiaPropostaException;

	/**
	 * Returns the first garantia proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching garantia proposta, or <code>null</code> if a matching garantia proposta could not be found
	 */
	public GarantiaProposta fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<GarantiaProposta>
			orderByComparator);

	/**
	 * Returns the last garantia proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching garantia proposta
	 * @throws NoSuchGarantiaPropostaException if a matching garantia proposta could not be found
	 */
	public GarantiaProposta findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GarantiaProposta>
				orderByComparator)
		throws NoSuchGarantiaPropostaException;

	/**
	 * Returns the last garantia proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching garantia proposta, or <code>null</code> if a matching garantia proposta could not be found
	 */
	public GarantiaProposta fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<GarantiaProposta>
			orderByComparator);

	/**
	 * Returns the garantia propostas before and after the current garantia proposta in the ordered set where uuid = &#63;.
	 *
	 * @param garantiaPropostaId the primary key of the current garantia proposta
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next garantia proposta
	 * @throws NoSuchGarantiaPropostaException if a garantia proposta with the primary key could not be found
	 */
	public GarantiaProposta[] findByUuid_PrevAndNext(
			long garantiaPropostaId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GarantiaProposta>
				orderByComparator)
		throws NoSuchGarantiaPropostaException;

	/**
	 * Removes all the garantia propostas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of garantia propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching garantia propostas
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the garantia proposta in the entity cache if it is enabled.
	 *
	 * @param garantiaProposta the garantia proposta
	 */
	public void cacheResult(GarantiaProposta garantiaProposta);

	/**
	 * Caches the garantia propostas in the entity cache if it is enabled.
	 *
	 * @param garantiaPropostas the garantia propostas
	 */
	public void cacheResult(java.util.List<GarantiaProposta> garantiaPropostas);

	/**
	 * Creates a new garantia proposta with the primary key. Does not add the garantia proposta to the database.
	 *
	 * @param garantiaPropostaId the primary key for the new garantia proposta
	 * @return the new garantia proposta
	 */
	public GarantiaProposta create(long garantiaPropostaId);

	/**
	 * Removes the garantia proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param garantiaPropostaId the primary key of the garantia proposta
	 * @return the garantia proposta that was removed
	 * @throws NoSuchGarantiaPropostaException if a garantia proposta with the primary key could not be found
	 */
	public GarantiaProposta remove(long garantiaPropostaId)
		throws NoSuchGarantiaPropostaException;

	public GarantiaProposta updateImpl(GarantiaProposta garantiaProposta);

	/**
	 * Returns the garantia proposta with the primary key or throws a <code>NoSuchGarantiaPropostaException</code> if it could not be found.
	 *
	 * @param garantiaPropostaId the primary key of the garantia proposta
	 * @return the garantia proposta
	 * @throws NoSuchGarantiaPropostaException if a garantia proposta with the primary key could not be found
	 */
	public GarantiaProposta findByPrimaryKey(long garantiaPropostaId)
		throws NoSuchGarantiaPropostaException;

	/**
	 * Returns the garantia proposta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param garantiaPropostaId the primary key of the garantia proposta
	 * @return the garantia proposta, or <code>null</code> if a garantia proposta with the primary key could not be found
	 */
	public GarantiaProposta fetchByPrimaryKey(long garantiaPropostaId);

	/**
	 * Returns all the garantia propostas.
	 *
	 * @return the garantia propostas
	 */
	public java.util.List<GarantiaProposta> findAll();

	/**
	 * Returns a range of all the garantia propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @return the range of garantia propostas
	 */
	public java.util.List<GarantiaProposta> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the garantia propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of garantia propostas
	 */
	public java.util.List<GarantiaProposta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GarantiaProposta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the garantia propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GarantiaPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantia propostas
	 * @param end the upper bound of the range of garantia propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of garantia propostas
	 */
	public java.util.List<GarantiaProposta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GarantiaProposta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the garantia propostas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of garantia propostas.
	 *
	 * @return the number of garantia propostas
	 */
	public int countAll();

}