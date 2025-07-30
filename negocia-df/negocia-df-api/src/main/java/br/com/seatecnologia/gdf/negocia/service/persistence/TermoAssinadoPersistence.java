/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchTermoAssinadoException;
import br.com.seatecnologia.gdf.negocia.model.TermoAssinado;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the termo assinado service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TermoAssinadoUtil
 * @generated
 */
@ProviderType
public interface TermoAssinadoPersistence
	extends BasePersistence<TermoAssinado> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TermoAssinadoUtil} to access the termo assinado persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the termo assinados where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching termo assinados
	 */
	public java.util.List<TermoAssinado> findByUuid(String uuid);

	/**
	 * Returns a range of all the termo assinados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @return the range of matching termo assinados
	 */
	public java.util.List<TermoAssinado> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the termo assinados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching termo assinados
	 */
	public java.util.List<TermoAssinado> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TermoAssinado>
			orderByComparator);

	/**
	 * Returns an ordered range of all the termo assinados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching termo assinados
	 */
	public java.util.List<TermoAssinado> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TermoAssinado>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first termo assinado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching termo assinado
	 * @throws NoSuchTermoAssinadoException if a matching termo assinado could not be found
	 */
	public TermoAssinado findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<TermoAssinado>
				orderByComparator)
		throws NoSuchTermoAssinadoException;

	/**
	 * Returns the first termo assinado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching termo assinado, or <code>null</code> if a matching termo assinado could not be found
	 */
	public TermoAssinado fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TermoAssinado>
			orderByComparator);

	/**
	 * Returns the last termo assinado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching termo assinado
	 * @throws NoSuchTermoAssinadoException if a matching termo assinado could not be found
	 */
	public TermoAssinado findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<TermoAssinado>
				orderByComparator)
		throws NoSuchTermoAssinadoException;

	/**
	 * Returns the last termo assinado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching termo assinado, or <code>null</code> if a matching termo assinado could not be found
	 */
	public TermoAssinado fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TermoAssinado>
			orderByComparator);

	/**
	 * Returns the termo assinados before and after the current termo assinado in the ordered set where uuid = &#63;.
	 *
	 * @param termoId the primary key of the current termo assinado
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next termo assinado
	 * @throws NoSuchTermoAssinadoException if a termo assinado with the primary key could not be found
	 */
	public TermoAssinado[] findByUuid_PrevAndNext(
			long termoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<TermoAssinado>
				orderByComparator)
		throws NoSuchTermoAssinadoException;

	/**
	 * Removes all the termo assinados where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of termo assinados where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching termo assinados
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the termo assinados where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching termo assinados
	 */
	public java.util.List<TermoAssinado> findByPropostaId(long propostaId);

	/**
	 * Returns a range of all the termo assinados where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @return the range of matching termo assinados
	 */
	public java.util.List<TermoAssinado> findByPropostaId(
		long propostaId, int start, int end);

	/**
	 * Returns an ordered range of all the termo assinados where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching termo assinados
	 */
	public java.util.List<TermoAssinado> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TermoAssinado>
			orderByComparator);

	/**
	 * Returns an ordered range of all the termo assinados where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching termo assinados
	 */
	public java.util.List<TermoAssinado> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TermoAssinado>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first termo assinado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching termo assinado
	 * @throws NoSuchTermoAssinadoException if a matching termo assinado could not be found
	 */
	public TermoAssinado findByPropostaId_First(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<TermoAssinado>
				orderByComparator)
		throws NoSuchTermoAssinadoException;

	/**
	 * Returns the first termo assinado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching termo assinado, or <code>null</code> if a matching termo assinado could not be found
	 */
	public TermoAssinado fetchByPropostaId_First(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<TermoAssinado>
			orderByComparator);

	/**
	 * Returns the last termo assinado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching termo assinado
	 * @throws NoSuchTermoAssinadoException if a matching termo assinado could not be found
	 */
	public TermoAssinado findByPropostaId_Last(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<TermoAssinado>
				orderByComparator)
		throws NoSuchTermoAssinadoException;

	/**
	 * Returns the last termo assinado in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching termo assinado, or <code>null</code> if a matching termo assinado could not be found
	 */
	public TermoAssinado fetchByPropostaId_Last(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<TermoAssinado>
			orderByComparator);

	/**
	 * Returns the termo assinados before and after the current termo assinado in the ordered set where propostaId = &#63;.
	 *
	 * @param termoId the primary key of the current termo assinado
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next termo assinado
	 * @throws NoSuchTermoAssinadoException if a termo assinado with the primary key could not be found
	 */
	public TermoAssinado[] findByPropostaId_PrevAndNext(
			long termoId, long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator<TermoAssinado>
				orderByComparator)
		throws NoSuchTermoAssinadoException;

	/**
	 * Removes all the termo assinados where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public void removeByPropostaId(long propostaId);

	/**
	 * Returns the number of termo assinados where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching termo assinados
	 */
	public int countByPropostaId(long propostaId);

	/**
	 * Caches the termo assinado in the entity cache if it is enabled.
	 *
	 * @param termoAssinado the termo assinado
	 */
	public void cacheResult(TermoAssinado termoAssinado);

	/**
	 * Caches the termo assinados in the entity cache if it is enabled.
	 *
	 * @param termoAssinados the termo assinados
	 */
	public void cacheResult(java.util.List<TermoAssinado> termoAssinados);

	/**
	 * Creates a new termo assinado with the primary key. Does not add the termo assinado to the database.
	 *
	 * @param termoId the primary key for the new termo assinado
	 * @return the new termo assinado
	 */
	public TermoAssinado create(long termoId);

	/**
	 * Removes the termo assinado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param termoId the primary key of the termo assinado
	 * @return the termo assinado that was removed
	 * @throws NoSuchTermoAssinadoException if a termo assinado with the primary key could not be found
	 */
	public TermoAssinado remove(long termoId)
		throws NoSuchTermoAssinadoException;

	public TermoAssinado updateImpl(TermoAssinado termoAssinado);

	/**
	 * Returns the termo assinado with the primary key or throws a <code>NoSuchTermoAssinadoException</code> if it could not be found.
	 *
	 * @param termoId the primary key of the termo assinado
	 * @return the termo assinado
	 * @throws NoSuchTermoAssinadoException if a termo assinado with the primary key could not be found
	 */
	public TermoAssinado findByPrimaryKey(long termoId)
		throws NoSuchTermoAssinadoException;

	/**
	 * Returns the termo assinado with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param termoId the primary key of the termo assinado
	 * @return the termo assinado, or <code>null</code> if a termo assinado with the primary key could not be found
	 */
	public TermoAssinado fetchByPrimaryKey(long termoId);

	/**
	 * Returns all the termo assinados.
	 *
	 * @return the termo assinados
	 */
	public java.util.List<TermoAssinado> findAll();

	/**
	 * Returns a range of all the termo assinados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @return the range of termo assinados
	 */
	public java.util.List<TermoAssinado> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the termo assinados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of termo assinados
	 */
	public java.util.List<TermoAssinado> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TermoAssinado>
			orderByComparator);

	/**
	 * Returns an ordered range of all the termo assinados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of termo assinados
	 */
	public java.util.List<TermoAssinado> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TermoAssinado>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the termo assinados from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of termo assinados.
	 *
	 * @return the number of termo assinados
	 */
	public int countAll();

}