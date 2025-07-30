/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchCreditoTransacionadoException;
import br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the credito transacionado service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreditoTransacionadoUtil
 * @generated
 */
@ProviderType
public interface CreditoTransacionadoPersistence
	extends BasePersistence<CreditoTransacionado> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreditoTransacionadoUtil} to access the credito transacionado persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the credito transacionados where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching credito transacionados
	 */
	public java.util.List<CreditoTransacionado> findByUuid(String uuid);

	/**
	 * Returns a range of all the credito transacionados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @return the range of matching credito transacionados
	 */
	public java.util.List<CreditoTransacionado> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the credito transacionados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching credito transacionados
	 */
	public java.util.List<CreditoTransacionado> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreditoTransacionado>
			orderByComparator);

	/**
	 * Returns an ordered range of all the credito transacionados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching credito transacionados
	 */
	public java.util.List<CreditoTransacionado> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreditoTransacionado>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first credito transacionado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a matching credito transacionado could not be found
	 */
	public CreditoTransacionado findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreditoTransacionado> orderByComparator)
		throws NoSuchCreditoTransacionadoException;

	/**
	 * Returns the first credito transacionado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credito transacionado, or <code>null</code> if a matching credito transacionado could not be found
	 */
	public CreditoTransacionado fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CreditoTransacionado>
			orderByComparator);

	/**
	 * Returns the last credito transacionado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a matching credito transacionado could not be found
	 */
	public CreditoTransacionado findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreditoTransacionado> orderByComparator)
		throws NoSuchCreditoTransacionadoException;

	/**
	 * Returns the last credito transacionado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credito transacionado, or <code>null</code> if a matching credito transacionado could not be found
	 */
	public CreditoTransacionado fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CreditoTransacionado>
			orderByComparator);

	/**
	 * Returns the credito transacionados before and after the current credito transacionado in the ordered set where uuid = &#63;.
	 *
	 * @param creditoId the primary key of the current credito transacionado
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a credito transacionado with the primary key could not be found
	 */
	public CreditoTransacionado[] findByUuid_PrevAndNext(
			long creditoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreditoTransacionado> orderByComparator)
		throws NoSuchCreditoTransacionadoException;

	/**
	 * Removes all the credito transacionados where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of credito transacionados where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching credito transacionados
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the credito transacionados where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching credito transacionados
	 */
	public java.util.List<CreditoTransacionado> findByPropostaId(
		long propostaId);

	/**
	 * Returns a range of all the credito transacionados where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @return the range of matching credito transacionados
	 */
	public java.util.List<CreditoTransacionado> findByPropostaId(
		long propostaId, int start, int end);

	/**
	 * Returns an ordered range of all the credito transacionados where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching credito transacionados
	 */
	public java.util.List<CreditoTransacionado> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreditoTransacionado>
			orderByComparator);

	/**
	 * Returns an ordered range of all the credito transacionados where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching credito transacionados
	 */
	public java.util.List<CreditoTransacionado> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreditoTransacionado>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first credito transacionado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a matching credito transacionado could not be found
	 */
	public CreditoTransacionado findByPropostaId_First(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreditoTransacionado> orderByComparator)
		throws NoSuchCreditoTransacionadoException;

	/**
	 * Returns the first credito transacionado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching credito transacionado, or <code>null</code> if a matching credito transacionado could not be found
	 */
	public CreditoTransacionado fetchByPropostaId_First(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<CreditoTransacionado>
			orderByComparator);

	/**
	 * Returns the last credito transacionado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a matching credito transacionado could not be found
	 */
	public CreditoTransacionado findByPropostaId_Last(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreditoTransacionado> orderByComparator)
		throws NoSuchCreditoTransacionadoException;

	/**
	 * Returns the last credito transacionado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching credito transacionado, or <code>null</code> if a matching credito transacionado could not be found
	 */
	public CreditoTransacionado fetchByPropostaId_Last(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<CreditoTransacionado>
			orderByComparator);

	/**
	 * Returns the credito transacionados before and after the current credito transacionado in the ordered set where propostaId = &#63;.
	 *
	 * @param creditoId the primary key of the current credito transacionado
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a credito transacionado with the primary key could not be found
	 */
	public CreditoTransacionado[] findByPropostaId_PrevAndNext(
			long creditoId, long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreditoTransacionado> orderByComparator)
		throws NoSuchCreditoTransacionadoException;

	/**
	 * Removes all the credito transacionados where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public void removeByPropostaId(long propostaId);

	/**
	 * Returns the number of credito transacionados where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching credito transacionados
	 */
	public int countByPropostaId(long propostaId);

	/**
	 * Caches the credito transacionado in the entity cache if it is enabled.
	 *
	 * @param creditoTransacionado the credito transacionado
	 */
	public void cacheResult(CreditoTransacionado creditoTransacionado);

	/**
	 * Caches the credito transacionados in the entity cache if it is enabled.
	 *
	 * @param creditoTransacionados the credito transacionados
	 */
	public void cacheResult(
		java.util.List<CreditoTransacionado> creditoTransacionados);

	/**
	 * Creates a new credito transacionado with the primary key. Does not add the credito transacionado to the database.
	 *
	 * @param creditoId the primary key for the new credito transacionado
	 * @return the new credito transacionado
	 */
	public CreditoTransacionado create(long creditoId);

	/**
	 * Removes the credito transacionado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creditoId the primary key of the credito transacionado
	 * @return the credito transacionado that was removed
	 * @throws NoSuchCreditoTransacionadoException if a credito transacionado with the primary key could not be found
	 */
	public CreditoTransacionado remove(long creditoId)
		throws NoSuchCreditoTransacionadoException;

	public CreditoTransacionado updateImpl(
		CreditoTransacionado creditoTransacionado);

	/**
	 * Returns the credito transacionado with the primary key or throws a <code>NoSuchCreditoTransacionadoException</code> if it could not be found.
	 *
	 * @param creditoId the primary key of the credito transacionado
	 * @return the credito transacionado
	 * @throws NoSuchCreditoTransacionadoException if a credito transacionado with the primary key could not be found
	 */
	public CreditoTransacionado findByPrimaryKey(long creditoId)
		throws NoSuchCreditoTransacionadoException;

	/**
	 * Returns the credito transacionado with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creditoId the primary key of the credito transacionado
	 * @return the credito transacionado, or <code>null</code> if a credito transacionado with the primary key could not be found
	 */
	public CreditoTransacionado fetchByPrimaryKey(long creditoId);

	/**
	 * Returns all the credito transacionados.
	 *
	 * @return the credito transacionados
	 */
	public java.util.List<CreditoTransacionado> findAll();

	/**
	 * Returns a range of all the credito transacionados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @return the range of credito transacionados
	 */
	public java.util.List<CreditoTransacionado> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the credito transacionados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of credito transacionados
	 */
	public java.util.List<CreditoTransacionado> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreditoTransacionado>
			orderByComparator);

	/**
	 * Returns an ordered range of all the credito transacionados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of credito transacionados
	 */
	public java.util.List<CreditoTransacionado> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreditoTransacionado>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the credito transacionados from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of credito transacionados.
	 *
	 * @return the number of credito transacionados
	 */
	public int countAll();

}