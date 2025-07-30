/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchAdvogadoException;
import br.com.seatecnologia.gdf.negocia.model.Advogado;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the advogado service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvogadoUtil
 * @generated
 */
@ProviderType
public interface AdvogadoPersistence extends BasePersistence<Advogado> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AdvogadoUtil} to access the advogado persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the advogados where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching advogados
	 */
	public java.util.List<Advogado> findByUuid(String uuid);

	/**
	 * Returns a range of all the advogados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdvogadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of advogados
	 * @param end the upper bound of the range of advogados (not inclusive)
	 * @return the range of matching advogados
	 */
	public java.util.List<Advogado> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the advogados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdvogadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of advogados
	 * @param end the upper bound of the range of advogados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching advogados
	 */
	public java.util.List<Advogado> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Advogado>
			orderByComparator);

	/**
	 * Returns an ordered range of all the advogados where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdvogadoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of advogados
	 * @param end the upper bound of the range of advogados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching advogados
	 */
	public java.util.List<Advogado> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Advogado>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first advogado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching advogado
	 * @throws NoSuchAdvogadoException if a matching advogado could not be found
	 */
	public Advogado findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Advogado>
				orderByComparator)
		throws NoSuchAdvogadoException;

	/**
	 * Returns the first advogado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching advogado, or <code>null</code> if a matching advogado could not be found
	 */
	public Advogado fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Advogado>
			orderByComparator);

	/**
	 * Returns the last advogado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching advogado
	 * @throws NoSuchAdvogadoException if a matching advogado could not be found
	 */
	public Advogado findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Advogado>
				orderByComparator)
		throws NoSuchAdvogadoException;

	/**
	 * Returns the last advogado in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching advogado, or <code>null</code> if a matching advogado could not be found
	 */
	public Advogado fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Advogado>
			orderByComparator);

	/**
	 * Returns the advogados before and after the current advogado in the ordered set where uuid = &#63;.
	 *
	 * @param advogadoId the primary key of the current advogado
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next advogado
	 * @throws NoSuchAdvogadoException if a advogado with the primary key could not be found
	 */
	public Advogado[] findByUuid_PrevAndNext(
			long advogadoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Advogado>
				orderByComparator)
		throws NoSuchAdvogadoException;

	/**
	 * Removes all the advogados where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of advogados where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching advogados
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the advogado in the entity cache if it is enabled.
	 *
	 * @param advogado the advogado
	 */
	public void cacheResult(Advogado advogado);

	/**
	 * Caches the advogados in the entity cache if it is enabled.
	 *
	 * @param advogados the advogados
	 */
	public void cacheResult(java.util.List<Advogado> advogados);

	/**
	 * Creates a new advogado with the primary key. Does not add the advogado to the database.
	 *
	 * @param advogadoId the primary key for the new advogado
	 * @return the new advogado
	 */
	public Advogado create(long advogadoId);

	/**
	 * Removes the advogado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param advogadoId the primary key of the advogado
	 * @return the advogado that was removed
	 * @throws NoSuchAdvogadoException if a advogado with the primary key could not be found
	 */
	public Advogado remove(long advogadoId) throws NoSuchAdvogadoException;

	public Advogado updateImpl(Advogado advogado);

	/**
	 * Returns the advogado with the primary key or throws a <code>NoSuchAdvogadoException</code> if it could not be found.
	 *
	 * @param advogadoId the primary key of the advogado
	 * @return the advogado
	 * @throws NoSuchAdvogadoException if a advogado with the primary key could not be found
	 */
	public Advogado findByPrimaryKey(long advogadoId)
		throws NoSuchAdvogadoException;

	/**
	 * Returns the advogado with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param advogadoId the primary key of the advogado
	 * @return the advogado, or <code>null</code> if a advogado with the primary key could not be found
	 */
	public Advogado fetchByPrimaryKey(long advogadoId);

	/**
	 * Returns all the advogados.
	 *
	 * @return the advogados
	 */
	public java.util.List<Advogado> findAll();

	/**
	 * Returns a range of all the advogados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdvogadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of advogados
	 * @param end the upper bound of the range of advogados (not inclusive)
	 * @return the range of advogados
	 */
	public java.util.List<Advogado> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the advogados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdvogadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of advogados
	 * @param end the upper bound of the range of advogados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of advogados
	 */
	public java.util.List<Advogado> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Advogado>
			orderByComparator);

	/**
	 * Returns an ordered range of all the advogados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AdvogadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of advogados
	 * @param end the upper bound of the range of advogados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of advogados
	 */
	public java.util.List<Advogado> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Advogado>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the advogados from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of advogados.
	 *
	 * @return the number of advogados
	 */
	public int countAll();

}