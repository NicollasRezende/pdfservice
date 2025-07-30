/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchProcuracaoException;
import br.com.seatecnologia.gdf.negocia.model.Procuracao;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the procuracao service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProcuracaoUtil
 * @generated
 */
@ProviderType
public interface ProcuracaoPersistence extends BasePersistence<Procuracao> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProcuracaoUtil} to access the procuracao persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the procuracaos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching procuracaos
	 */
	public java.util.List<Procuracao> findByUuid(String uuid);

	/**
	 * Returns a range of all the procuracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @return the range of matching procuracaos
	 */
	public java.util.List<Procuracao> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the procuracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching procuracaos
	 */
	public java.util.List<Procuracao> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Procuracao>
			orderByComparator);

	/**
	 * Returns an ordered range of all the procuracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching procuracaos
	 */
	public java.util.List<Procuracao> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Procuracao>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first procuracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching procuracao
	 * @throws NoSuchProcuracaoException if a matching procuracao could not be found
	 */
	public Procuracao findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Procuracao>
				orderByComparator)
		throws NoSuchProcuracaoException;

	/**
	 * Returns the first procuracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching procuracao, or <code>null</code> if a matching procuracao could not be found
	 */
	public Procuracao fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Procuracao>
			orderByComparator);

	/**
	 * Returns the last procuracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching procuracao
	 * @throws NoSuchProcuracaoException if a matching procuracao could not be found
	 */
	public Procuracao findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Procuracao>
				orderByComparator)
		throws NoSuchProcuracaoException;

	/**
	 * Returns the last procuracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching procuracao, or <code>null</code> if a matching procuracao could not be found
	 */
	public Procuracao fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Procuracao>
			orderByComparator);

	/**
	 * Returns the procuracaos before and after the current procuracao in the ordered set where uuid = &#63;.
	 *
	 * @param procuracaoId the primary key of the current procuracao
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next procuracao
	 * @throws NoSuchProcuracaoException if a procuracao with the primary key could not be found
	 */
	public Procuracao[] findByUuid_PrevAndNext(
			long procuracaoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Procuracao>
				orderByComparator)
		throws NoSuchProcuracaoException;

	/**
	 * Removes all the procuracaos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of procuracaos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching procuracaos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the procuracaos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching procuracaos
	 */
	public java.util.List<Procuracao> findByPropostaId(long propostaId);

	/**
	 * Returns a range of all the procuracaos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @return the range of matching procuracaos
	 */
	public java.util.List<Procuracao> findByPropostaId(
		long propostaId, int start, int end);

	/**
	 * Returns an ordered range of all the procuracaos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching procuracaos
	 */
	public java.util.List<Procuracao> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Procuracao>
			orderByComparator);

	/**
	 * Returns an ordered range of all the procuracaos where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching procuracaos
	 */
	public java.util.List<Procuracao> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Procuracao>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first procuracao in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching procuracao
	 * @throws NoSuchProcuracaoException if a matching procuracao could not be found
	 */
	public Procuracao findByPropostaId_First(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<Procuracao>
				orderByComparator)
		throws NoSuchProcuracaoException;

	/**
	 * Returns the first procuracao in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching procuracao, or <code>null</code> if a matching procuracao could not be found
	 */
	public Procuracao fetchByPropostaId_First(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<Procuracao>
			orderByComparator);

	/**
	 * Returns the last procuracao in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching procuracao
	 * @throws NoSuchProcuracaoException if a matching procuracao could not be found
	 */
	public Procuracao findByPropostaId_Last(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<Procuracao>
				orderByComparator)
		throws NoSuchProcuracaoException;

	/**
	 * Returns the last procuracao in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching procuracao, or <code>null</code> if a matching procuracao could not be found
	 */
	public Procuracao fetchByPropostaId_Last(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<Procuracao>
			orderByComparator);

	/**
	 * Returns the procuracaos before and after the current procuracao in the ordered set where propostaId = &#63;.
	 *
	 * @param procuracaoId the primary key of the current procuracao
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next procuracao
	 * @throws NoSuchProcuracaoException if a procuracao with the primary key could not be found
	 */
	public Procuracao[] findByPropostaId_PrevAndNext(
			long procuracaoId, long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<Procuracao>
				orderByComparator)
		throws NoSuchProcuracaoException;

	/**
	 * Removes all the procuracaos where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public void removeByPropostaId(long propostaId);

	/**
	 * Returns the number of procuracaos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching procuracaos
	 */
	public int countByPropostaId(long propostaId);

	/**
	 * Caches the procuracao in the entity cache if it is enabled.
	 *
	 * @param procuracao the procuracao
	 */
	public void cacheResult(Procuracao procuracao);

	/**
	 * Caches the procuracaos in the entity cache if it is enabled.
	 *
	 * @param procuracaos the procuracaos
	 */
	public void cacheResult(java.util.List<Procuracao> procuracaos);

	/**
	 * Creates a new procuracao with the primary key. Does not add the procuracao to the database.
	 *
	 * @param procuracaoId the primary key for the new procuracao
	 * @return the new procuracao
	 */
	public Procuracao create(long procuracaoId);

	/**
	 * Removes the procuracao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param procuracaoId the primary key of the procuracao
	 * @return the procuracao that was removed
	 * @throws NoSuchProcuracaoException if a procuracao with the primary key could not be found
	 */
	public Procuracao remove(long procuracaoId)
		throws NoSuchProcuracaoException;

	public Procuracao updateImpl(Procuracao procuracao);

	/**
	 * Returns the procuracao with the primary key or throws a <code>NoSuchProcuracaoException</code> if it could not be found.
	 *
	 * @param procuracaoId the primary key of the procuracao
	 * @return the procuracao
	 * @throws NoSuchProcuracaoException if a procuracao with the primary key could not be found
	 */
	public Procuracao findByPrimaryKey(long procuracaoId)
		throws NoSuchProcuracaoException;

	/**
	 * Returns the procuracao with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param procuracaoId the primary key of the procuracao
	 * @return the procuracao, or <code>null</code> if a procuracao with the primary key could not be found
	 */
	public Procuracao fetchByPrimaryKey(long procuracaoId);

	/**
	 * Returns all the procuracaos.
	 *
	 * @return the procuracaos
	 */
	public java.util.List<Procuracao> findAll();

	/**
	 * Returns a range of all the procuracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @return the range of procuracaos
	 */
	public java.util.List<Procuracao> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the procuracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of procuracaos
	 */
	public java.util.List<Procuracao> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Procuracao>
			orderByComparator);

	/**
	 * Returns an ordered range of all the procuracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of procuracaos
	 */
	public java.util.List<Procuracao> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Procuracao>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the procuracaos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of procuracaos.
	 *
	 * @return the number of procuracaos
	 */
	public int countAll();

}