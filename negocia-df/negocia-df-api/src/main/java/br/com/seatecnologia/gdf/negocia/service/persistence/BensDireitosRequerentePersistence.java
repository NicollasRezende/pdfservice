/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchBensDireitosRequerenteException;
import br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the bens direitos requerente service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BensDireitosRequerenteUtil
 * @generated
 */
@ProviderType
public interface BensDireitosRequerentePersistence
	extends BasePersistence<BensDireitosRequerente> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BensDireitosRequerenteUtil} to access the bens direitos requerente persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the bens direitos requerentes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching bens direitos requerentes
	 */
	public java.util.List<BensDireitosRequerente> findByUuid(String uuid);

	/**
	 * Returns a range of all the bens direitos requerentes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @return the range of matching bens direitos requerentes
	 */
	public java.util.List<BensDireitosRequerente> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the bens direitos requerentes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bens direitos requerentes
	 */
	public java.util.List<BensDireitosRequerente> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BensDireitosRequerente>
			orderByComparator);

	/**
	 * Returns an ordered range of all the bens direitos requerentes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bens direitos requerentes
	 */
	public java.util.List<BensDireitosRequerente> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BensDireitosRequerente>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first bens direitos requerente in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a matching bens direitos requerente could not be found
	 */
	public BensDireitosRequerente findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<BensDireitosRequerente> orderByComparator)
		throws NoSuchBensDireitosRequerenteException;

	/**
	 * Returns the first bens direitos requerente in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos requerente, or <code>null</code> if a matching bens direitos requerente could not be found
	 */
	public BensDireitosRequerente fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BensDireitosRequerente>
			orderByComparator);

	/**
	 * Returns the last bens direitos requerente in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a matching bens direitos requerente could not be found
	 */
	public BensDireitosRequerente findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<BensDireitosRequerente> orderByComparator)
		throws NoSuchBensDireitosRequerenteException;

	/**
	 * Returns the last bens direitos requerente in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos requerente, or <code>null</code> if a matching bens direitos requerente could not be found
	 */
	public BensDireitosRequerente fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BensDireitosRequerente>
			orderByComparator);

	/**
	 * Returns the bens direitos requerentes before and after the current bens direitos requerente in the ordered set where uuid = &#63;.
	 *
	 * @param bemId the primary key of the current bens direitos requerente
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a bens direitos requerente with the primary key could not be found
	 */
	public BensDireitosRequerente[] findByUuid_PrevAndNext(
			long bemId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<BensDireitosRequerente> orderByComparator)
		throws NoSuchBensDireitosRequerenteException;

	/**
	 * Removes all the bens direitos requerentes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of bens direitos requerentes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching bens direitos requerentes
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the bens direitos requerentes where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching bens direitos requerentes
	 */
	public java.util.List<BensDireitosRequerente> findByPropostaId(
		long propostaId);

	/**
	 * Returns a range of all the bens direitos requerentes where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @return the range of matching bens direitos requerentes
	 */
	public java.util.List<BensDireitosRequerente> findByPropostaId(
		long propostaId, int start, int end);

	/**
	 * Returns an ordered range of all the bens direitos requerentes where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bens direitos requerentes
	 */
	public java.util.List<BensDireitosRequerente> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BensDireitosRequerente>
			orderByComparator);

	/**
	 * Returns an ordered range of all the bens direitos requerentes where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bens direitos requerentes
	 */
	public java.util.List<BensDireitosRequerente> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BensDireitosRequerente>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first bens direitos requerente in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a matching bens direitos requerente could not be found
	 */
	public BensDireitosRequerente findByPropostaId_First(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<BensDireitosRequerente> orderByComparator)
		throws NoSuchBensDireitosRequerenteException;

	/**
	 * Returns the first bens direitos requerente in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bens direitos requerente, or <code>null</code> if a matching bens direitos requerente could not be found
	 */
	public BensDireitosRequerente fetchByPropostaId_First(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<BensDireitosRequerente>
			orderByComparator);

	/**
	 * Returns the last bens direitos requerente in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a matching bens direitos requerente could not be found
	 */
	public BensDireitosRequerente findByPropostaId_Last(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<BensDireitosRequerente> orderByComparator)
		throws NoSuchBensDireitosRequerenteException;

	/**
	 * Returns the last bens direitos requerente in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bens direitos requerente, or <code>null</code> if a matching bens direitos requerente could not be found
	 */
	public BensDireitosRequerente fetchByPropostaId_Last(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<BensDireitosRequerente>
			orderByComparator);

	/**
	 * Returns the bens direitos requerentes before and after the current bens direitos requerente in the ordered set where propostaId = &#63;.
	 *
	 * @param bemId the primary key of the current bens direitos requerente
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a bens direitos requerente with the primary key could not be found
	 */
	public BensDireitosRequerente[] findByPropostaId_PrevAndNext(
			long bemId, long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<BensDireitosRequerente> orderByComparator)
		throws NoSuchBensDireitosRequerenteException;

	/**
	 * Removes all the bens direitos requerentes where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public void removeByPropostaId(long propostaId);

	/**
	 * Returns the number of bens direitos requerentes where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching bens direitos requerentes
	 */
	public int countByPropostaId(long propostaId);

	/**
	 * Caches the bens direitos requerente in the entity cache if it is enabled.
	 *
	 * @param bensDireitosRequerente the bens direitos requerente
	 */
	public void cacheResult(BensDireitosRequerente bensDireitosRequerente);

	/**
	 * Caches the bens direitos requerentes in the entity cache if it is enabled.
	 *
	 * @param bensDireitosRequerentes the bens direitos requerentes
	 */
	public void cacheResult(
		java.util.List<BensDireitosRequerente> bensDireitosRequerentes);

	/**
	 * Creates a new bens direitos requerente with the primary key. Does not add the bens direitos requerente to the database.
	 *
	 * @param bemId the primary key for the new bens direitos requerente
	 * @return the new bens direitos requerente
	 */
	public BensDireitosRequerente create(long bemId);

	/**
	 * Removes the bens direitos requerente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bemId the primary key of the bens direitos requerente
	 * @return the bens direitos requerente that was removed
	 * @throws NoSuchBensDireitosRequerenteException if a bens direitos requerente with the primary key could not be found
	 */
	public BensDireitosRequerente remove(long bemId)
		throws NoSuchBensDireitosRequerenteException;

	public BensDireitosRequerente updateImpl(
		BensDireitosRequerente bensDireitosRequerente);

	/**
	 * Returns the bens direitos requerente with the primary key or throws a <code>NoSuchBensDireitosRequerenteException</code> if it could not be found.
	 *
	 * @param bemId the primary key of the bens direitos requerente
	 * @return the bens direitos requerente
	 * @throws NoSuchBensDireitosRequerenteException if a bens direitos requerente with the primary key could not be found
	 */
	public BensDireitosRequerente findByPrimaryKey(long bemId)
		throws NoSuchBensDireitosRequerenteException;

	/**
	 * Returns the bens direitos requerente with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bemId the primary key of the bens direitos requerente
	 * @return the bens direitos requerente, or <code>null</code> if a bens direitos requerente with the primary key could not be found
	 */
	public BensDireitosRequerente fetchByPrimaryKey(long bemId);

	/**
	 * Returns all the bens direitos requerentes.
	 *
	 * @return the bens direitos requerentes
	 */
	public java.util.List<BensDireitosRequerente> findAll();

	/**
	 * Returns a range of all the bens direitos requerentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @return the range of bens direitos requerentes
	 */
	public java.util.List<BensDireitosRequerente> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the bens direitos requerentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bens direitos requerentes
	 */
	public java.util.List<BensDireitosRequerente> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BensDireitosRequerente>
			orderByComparator);

	/**
	 * Returns an ordered range of all the bens direitos requerentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bens direitos requerentes
	 */
	public java.util.List<BensDireitosRequerente> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BensDireitosRequerente>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the bens direitos requerentes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of bens direitos requerentes.
	 *
	 * @return the number of bens direitos requerentes
	 */
	public int countAll();

}