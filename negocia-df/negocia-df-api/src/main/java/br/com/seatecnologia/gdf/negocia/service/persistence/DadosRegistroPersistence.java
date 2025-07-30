/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDadosRegistroException;
import br.com.seatecnologia.gdf.negocia.model.DadosRegistro;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the dados registro service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DadosRegistroUtil
 * @generated
 */
@ProviderType
public interface DadosRegistroPersistence
	extends BasePersistence<DadosRegistro> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DadosRegistroUtil} to access the dados registro persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the dados registros where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching dados registros
	 */
	public java.util.List<DadosRegistro> findByUuid(String uuid);

	/**
	 * Returns a range of all the dados registros where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @return the range of matching dados registros
	 */
	public java.util.List<DadosRegistro> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the dados registros where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dados registros
	 */
	public java.util.List<DadosRegistro> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DadosRegistro>
			orderByComparator);

	/**
	 * Returns an ordered range of all the dados registros where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dados registros
	 */
	public java.util.List<DadosRegistro> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DadosRegistro>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dados registro in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados registro
	 * @throws NoSuchDadosRegistroException if a matching dados registro could not be found
	 */
	public DadosRegistro findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DadosRegistro>
				orderByComparator)
		throws NoSuchDadosRegistroException;

	/**
	 * Returns the first dados registro in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dados registro, or <code>null</code> if a matching dados registro could not be found
	 */
	public DadosRegistro fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DadosRegistro>
			orderByComparator);

	/**
	 * Returns the last dados registro in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados registro
	 * @throws NoSuchDadosRegistroException if a matching dados registro could not be found
	 */
	public DadosRegistro findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DadosRegistro>
				orderByComparator)
		throws NoSuchDadosRegistroException;

	/**
	 * Returns the last dados registro in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dados registro, or <code>null</code> if a matching dados registro could not be found
	 */
	public DadosRegistro fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DadosRegistro>
			orderByComparator);

	/**
	 * Returns the dados registros before and after the current dados registro in the ordered set where uuid = &#63;.
	 *
	 * @param dadosRegistroId the primary key of the current dados registro
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dados registro
	 * @throws NoSuchDadosRegistroException if a dados registro with the primary key could not be found
	 */
	public DadosRegistro[] findByUuid_PrevAndNext(
			long dadosRegistroId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DadosRegistro>
				orderByComparator)
		throws NoSuchDadosRegistroException;

	/**
	 * Removes all the dados registros where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of dados registros where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching dados registros
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the dados registro where garantiaId = &#63; or throws a <code>NoSuchDadosRegistroException</code> if it could not be found.
	 *
	 * @param garantiaId the garantia ID
	 * @return the matching dados registro
	 * @throws NoSuchDadosRegistroException if a matching dados registro could not be found
	 */
	public DadosRegistro findByGarantiaId(long garantiaId)
		throws NoSuchDadosRegistroException;

	/**
	 * Returns the dados registro where garantiaId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param garantiaId the garantia ID
	 * @return the matching dados registro, or <code>null</code> if a matching dados registro could not be found
	 */
	public DadosRegistro fetchByGarantiaId(long garantiaId);

	/**
	 * Returns the dados registro where garantiaId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param garantiaId the garantia ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dados registro, or <code>null</code> if a matching dados registro could not be found
	 */
	public DadosRegistro fetchByGarantiaId(
		long garantiaId, boolean useFinderCache);

	/**
	 * Removes the dados registro where garantiaId = &#63; from the database.
	 *
	 * @param garantiaId the garantia ID
	 * @return the dados registro that was removed
	 */
	public DadosRegistro removeByGarantiaId(long garantiaId)
		throws NoSuchDadosRegistroException;

	/**
	 * Returns the number of dados registros where garantiaId = &#63;.
	 *
	 * @param garantiaId the garantia ID
	 * @return the number of matching dados registros
	 */
	public int countByGarantiaId(long garantiaId);

	/**
	 * Caches the dados registro in the entity cache if it is enabled.
	 *
	 * @param dadosRegistro the dados registro
	 */
	public void cacheResult(DadosRegistro dadosRegistro);

	/**
	 * Caches the dados registros in the entity cache if it is enabled.
	 *
	 * @param dadosRegistros the dados registros
	 */
	public void cacheResult(java.util.List<DadosRegistro> dadosRegistros);

	/**
	 * Creates a new dados registro with the primary key. Does not add the dados registro to the database.
	 *
	 * @param dadosRegistroId the primary key for the new dados registro
	 * @return the new dados registro
	 */
	public DadosRegistro create(long dadosRegistroId);

	/**
	 * Removes the dados registro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dadosRegistroId the primary key of the dados registro
	 * @return the dados registro that was removed
	 * @throws NoSuchDadosRegistroException if a dados registro with the primary key could not be found
	 */
	public DadosRegistro remove(long dadosRegistroId)
		throws NoSuchDadosRegistroException;

	public DadosRegistro updateImpl(DadosRegistro dadosRegistro);

	/**
	 * Returns the dados registro with the primary key or throws a <code>NoSuchDadosRegistroException</code> if it could not be found.
	 *
	 * @param dadosRegistroId the primary key of the dados registro
	 * @return the dados registro
	 * @throws NoSuchDadosRegistroException if a dados registro with the primary key could not be found
	 */
	public DadosRegistro findByPrimaryKey(long dadosRegistroId)
		throws NoSuchDadosRegistroException;

	/**
	 * Returns the dados registro with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dadosRegistroId the primary key of the dados registro
	 * @return the dados registro, or <code>null</code> if a dados registro with the primary key could not be found
	 */
	public DadosRegistro fetchByPrimaryKey(long dadosRegistroId);

	/**
	 * Returns all the dados registros.
	 *
	 * @return the dados registros
	 */
	public java.util.List<DadosRegistro> findAll();

	/**
	 * Returns a range of all the dados registros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @return the range of dados registros
	 */
	public java.util.List<DadosRegistro> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the dados registros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dados registros
	 */
	public java.util.List<DadosRegistro> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DadosRegistro>
			orderByComparator);

	/**
	 * Returns an ordered range of all the dados registros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dados registros
	 */
	public java.util.List<DadosRegistro> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DadosRegistro>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the dados registros from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of dados registros.
	 *
	 * @return the number of dados registros
	 */
	public int countAll();

}