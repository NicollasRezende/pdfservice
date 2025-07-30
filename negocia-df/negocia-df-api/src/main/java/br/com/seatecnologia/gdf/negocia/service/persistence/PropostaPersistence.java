/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchPropostaException;
import br.com.seatecnologia.gdf.negocia.model.Proposta;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the proposta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PropostaUtil
 * @generated
 */
@ProviderType
public interface PropostaPersistence extends BasePersistence<Proposta> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PropostaUtil} to access the proposta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching propostas
	 */
	public java.util.List<Proposta> findByUuid(String uuid);

	/**
	 * Returns a range of all the propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @return the range of matching propostas
	 */
	public java.util.List<Proposta> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching propostas
	 */
	public java.util.List<Proposta> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Proposta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the propostas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching propostas
	 */
	public java.util.List<Proposta> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Proposta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proposta
	 * @throws NoSuchPropostaException if a matching proposta could not be found
	 */
	public Proposta findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Proposta>
				orderByComparator)
		throws NoSuchPropostaException;

	/**
	 * Returns the first proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	public Proposta fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Proposta>
			orderByComparator);

	/**
	 * Returns the last proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proposta
	 * @throws NoSuchPropostaException if a matching proposta could not be found
	 */
	public Proposta findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Proposta>
				orderByComparator)
		throws NoSuchPropostaException;

	/**
	 * Returns the last proposta in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	public Proposta fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Proposta>
			orderByComparator);

	/**
	 * Returns the propostas before and after the current proposta in the ordered set where uuid = &#63;.
	 *
	 * @param propostaId the primary key of the current proposta
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next proposta
	 * @throws NoSuchPropostaException if a proposta with the primary key could not be found
	 */
	public Proposta[] findByUuid_PrevAndNext(
			long propostaId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Proposta>
				orderByComparator)
		throws NoSuchPropostaException;

	/**
	 * Removes all the propostas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of propostas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching propostas
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the proposta where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchPropostaException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching proposta
	 * @throws NoSuchPropostaException if a matching proposta could not be found
	 */
	public Proposta findByUUID_G(String uuid, long groupId)
		throws NoSuchPropostaException;

	/**
	 * Returns the proposta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	public Proposta fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the proposta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	public Proposta fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the proposta where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the proposta that was removed
	 */
	public Proposta removeByUUID_G(String uuid, long groupId)
		throws NoSuchPropostaException;

	/**
	 * Returns the number of propostas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching propostas
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the propostas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching propostas
	 */
	public java.util.List<Proposta> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the propostas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @return the range of matching propostas
	 */
	public java.util.List<Proposta> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the propostas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching propostas
	 */
	public java.util.List<Proposta> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Proposta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the propostas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching propostas
	 */
	public java.util.List<Proposta> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Proposta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first proposta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proposta
	 * @throws NoSuchPropostaException if a matching proposta could not be found
	 */
	public Proposta findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Proposta>
				orderByComparator)
		throws NoSuchPropostaException;

	/**
	 * Returns the first proposta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	public Proposta fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Proposta>
			orderByComparator);

	/**
	 * Returns the last proposta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proposta
	 * @throws NoSuchPropostaException if a matching proposta could not be found
	 */
	public Proposta findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Proposta>
				orderByComparator)
		throws NoSuchPropostaException;

	/**
	 * Returns the last proposta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	public Proposta fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Proposta>
			orderByComparator);

	/**
	 * Returns the propostas before and after the current proposta in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param propostaId the primary key of the current proposta
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next proposta
	 * @throws NoSuchPropostaException if a proposta with the primary key could not be found
	 */
	public Proposta[] findByUuid_C_PrevAndNext(
			long propostaId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Proposta>
				orderByComparator)
		throws NoSuchPropostaException;

	/**
	 * Removes all the propostas where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of propostas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching propostas
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the propostas where cpfCnpj = &#63;.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @return the matching propostas
	 */
	public java.util.List<Proposta> findByCpfCnpj(String cpfCnpj);

	/**
	 * Returns a range of all the propostas where cpfCnpj = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @return the range of matching propostas
	 */
	public java.util.List<Proposta> findByCpfCnpj(
		String cpfCnpj, int start, int end);

	/**
	 * Returns an ordered range of all the propostas where cpfCnpj = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching propostas
	 */
	public java.util.List<Proposta> findByCpfCnpj(
		String cpfCnpj, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Proposta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the propostas where cpfCnpj = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching propostas
	 */
	public java.util.List<Proposta> findByCpfCnpj(
		String cpfCnpj, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Proposta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first proposta in the ordered set where cpfCnpj = &#63;.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proposta
	 * @throws NoSuchPropostaException if a matching proposta could not be found
	 */
	public Proposta findByCpfCnpj_First(
			String cpfCnpj,
			com.liferay.portal.kernel.util.OrderByComparator<Proposta>
				orderByComparator)
		throws NoSuchPropostaException;

	/**
	 * Returns the first proposta in the ordered set where cpfCnpj = &#63;.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	public Proposta fetchByCpfCnpj_First(
		String cpfCnpj,
		com.liferay.portal.kernel.util.OrderByComparator<Proposta>
			orderByComparator);

	/**
	 * Returns the last proposta in the ordered set where cpfCnpj = &#63;.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proposta
	 * @throws NoSuchPropostaException if a matching proposta could not be found
	 */
	public Proposta findByCpfCnpj_Last(
			String cpfCnpj,
			com.liferay.portal.kernel.util.OrderByComparator<Proposta>
				orderByComparator)
		throws NoSuchPropostaException;

	/**
	 * Returns the last proposta in the ordered set where cpfCnpj = &#63;.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	public Proposta fetchByCpfCnpj_Last(
		String cpfCnpj,
		com.liferay.portal.kernel.util.OrderByComparator<Proposta>
			orderByComparator);

	/**
	 * Returns the propostas before and after the current proposta in the ordered set where cpfCnpj = &#63;.
	 *
	 * @param propostaId the primary key of the current proposta
	 * @param cpfCnpj the cpf cnpj
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next proposta
	 * @throws NoSuchPropostaException if a proposta with the primary key could not be found
	 */
	public Proposta[] findByCpfCnpj_PrevAndNext(
			long propostaId, String cpfCnpj,
			com.liferay.portal.kernel.util.OrderByComparator<Proposta>
				orderByComparator)
		throws NoSuchPropostaException;

	/**
	 * Removes all the propostas where cpfCnpj = &#63; from the database.
	 *
	 * @param cpfCnpj the cpf cnpj
	 */
	public void removeByCpfCnpj(String cpfCnpj);

	/**
	 * Returns the number of propostas where cpfCnpj = &#63;.
	 *
	 * @param cpfCnpj the cpf cnpj
	 * @return the number of matching propostas
	 */
	public int countByCpfCnpj(String cpfCnpj);

	/**
	 * Caches the proposta in the entity cache if it is enabled.
	 *
	 * @param proposta the proposta
	 */
	public void cacheResult(Proposta proposta);

	/**
	 * Caches the propostas in the entity cache if it is enabled.
	 *
	 * @param propostas the propostas
	 */
	public void cacheResult(java.util.List<Proposta> propostas);

	/**
	 * Creates a new proposta with the primary key. Does not add the proposta to the database.
	 *
	 * @param propostaId the primary key for the new proposta
	 * @return the new proposta
	 */
	public Proposta create(long propostaId);

	/**
	 * Removes the proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param propostaId the primary key of the proposta
	 * @return the proposta that was removed
	 * @throws NoSuchPropostaException if a proposta with the primary key could not be found
	 */
	public Proposta remove(long propostaId) throws NoSuchPropostaException;

	public Proposta updateImpl(Proposta proposta);

	/**
	 * Returns the proposta with the primary key or throws a <code>NoSuchPropostaException</code> if it could not be found.
	 *
	 * @param propostaId the primary key of the proposta
	 * @return the proposta
	 * @throws NoSuchPropostaException if a proposta with the primary key could not be found
	 */
	public Proposta findByPrimaryKey(long propostaId)
		throws NoSuchPropostaException;

	/**
	 * Returns the proposta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param propostaId the primary key of the proposta
	 * @return the proposta, or <code>null</code> if a proposta with the primary key could not be found
	 */
	public Proposta fetchByPrimaryKey(long propostaId);

	/**
	 * Returns all the propostas.
	 *
	 * @return the propostas
	 */
	public java.util.List<Proposta> findAll();

	/**
	 * Returns a range of all the propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @return the range of propostas
	 */
	public java.util.List<Proposta> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of propostas
	 */
	public java.util.List<Proposta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Proposta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of propostas
	 */
	public java.util.List<Proposta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Proposta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the propostas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of propostas.
	 *
	 * @return the number of propostas
	 */
	public int countAll();

}