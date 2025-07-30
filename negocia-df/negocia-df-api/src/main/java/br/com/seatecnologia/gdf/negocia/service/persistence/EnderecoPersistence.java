/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchEnderecoException;
import br.com.seatecnologia.gdf.negocia.model.Endereco;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the endereco service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EnderecoUtil
 * @generated
 */
@ProviderType
public interface EnderecoPersistence extends BasePersistence<Endereco> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EnderecoUtil} to access the endereco persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the enderecos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching enderecos
	 */
	public java.util.List<Endereco> findByUuid(String uuid);

	/**
	 * Returns a range of all the enderecos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @return the range of matching enderecos
	 */
	public java.util.List<Endereco> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the enderecos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching enderecos
	 */
	public java.util.List<Endereco> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Endereco>
			orderByComparator);

	/**
	 * Returns an ordered range of all the enderecos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching enderecos
	 */
	public java.util.List<Endereco> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Endereco>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first endereco in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching endereco
	 * @throws NoSuchEnderecoException if a matching endereco could not be found
	 */
	public Endereco findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Endereco>
				orderByComparator)
		throws NoSuchEnderecoException;

	/**
	 * Returns the first endereco in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching endereco, or <code>null</code> if a matching endereco could not be found
	 */
	public Endereco fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Endereco>
			orderByComparator);

	/**
	 * Returns the last endereco in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching endereco
	 * @throws NoSuchEnderecoException if a matching endereco could not be found
	 */
	public Endereco findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Endereco>
				orderByComparator)
		throws NoSuchEnderecoException;

	/**
	 * Returns the last endereco in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching endereco, or <code>null</code> if a matching endereco could not be found
	 */
	public Endereco fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Endereco>
			orderByComparator);

	/**
	 * Returns the enderecos before and after the current endereco in the ordered set where uuid = &#63;.
	 *
	 * @param enderecoId the primary key of the current endereco
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next endereco
	 * @throws NoSuchEnderecoException if a endereco with the primary key could not be found
	 */
	public Endereco[] findByUuid_PrevAndNext(
			long enderecoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Endereco>
				orderByComparator)
		throws NoSuchEnderecoException;

	/**
	 * Removes all the enderecos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of enderecos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching enderecos
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the endereco in the entity cache if it is enabled.
	 *
	 * @param endereco the endereco
	 */
	public void cacheResult(Endereco endereco);

	/**
	 * Caches the enderecos in the entity cache if it is enabled.
	 *
	 * @param enderecos the enderecos
	 */
	public void cacheResult(java.util.List<Endereco> enderecos);

	/**
	 * Creates a new endereco with the primary key. Does not add the endereco to the database.
	 *
	 * @param enderecoId the primary key for the new endereco
	 * @return the new endereco
	 */
	public Endereco create(long enderecoId);

	/**
	 * Removes the endereco with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param enderecoId the primary key of the endereco
	 * @return the endereco that was removed
	 * @throws NoSuchEnderecoException if a endereco with the primary key could not be found
	 */
	public Endereco remove(long enderecoId) throws NoSuchEnderecoException;

	public Endereco updateImpl(Endereco endereco);

	/**
	 * Returns the endereco with the primary key or throws a <code>NoSuchEnderecoException</code> if it could not be found.
	 *
	 * @param enderecoId the primary key of the endereco
	 * @return the endereco
	 * @throws NoSuchEnderecoException if a endereco with the primary key could not be found
	 */
	public Endereco findByPrimaryKey(long enderecoId)
		throws NoSuchEnderecoException;

	/**
	 * Returns the endereco with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param enderecoId the primary key of the endereco
	 * @return the endereco, or <code>null</code> if a endereco with the primary key could not be found
	 */
	public Endereco fetchByPrimaryKey(long enderecoId);

	/**
	 * Returns all the enderecos.
	 *
	 * @return the enderecos
	 */
	public java.util.List<Endereco> findAll();

	/**
	 * Returns a range of all the enderecos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @return the range of enderecos
	 */
	public java.util.List<Endereco> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the enderecos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of enderecos
	 */
	public java.util.List<Endereco> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Endereco>
			orderByComparator);

	/**
	 * Returns an ordered range of all the enderecos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of enderecos
	 */
	public java.util.List<Endereco> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Endereco>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the enderecos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of enderecos.
	 *
	 * @return the number of enderecos
	 */
	public int countAll();

}