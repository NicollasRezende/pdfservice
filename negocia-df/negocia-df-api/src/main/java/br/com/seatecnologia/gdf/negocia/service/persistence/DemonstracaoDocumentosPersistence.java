/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDemonstracaoDocumentosException;
import br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the demonstracao documentos service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DemonstracaoDocumentosUtil
 * @generated
 */
@ProviderType
public interface DemonstracaoDocumentosPersistence
	extends BasePersistence<DemonstracaoDocumentos> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DemonstracaoDocumentosUtil} to access the demonstracao documentos persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the demonstracao documentoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching demonstracao documentoses
	 */
	public java.util.List<DemonstracaoDocumentos> findByUuid(String uuid);

	/**
	 * Returns a range of all the demonstracao documentoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @return the range of matching demonstracao documentoses
	 */
	public java.util.List<DemonstracaoDocumentos> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the demonstracao documentoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demonstracao documentoses
	 */
	public java.util.List<DemonstracaoDocumentos> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemonstracaoDocumentos>
			orderByComparator);

	/**
	 * Returns an ordered range of all the demonstracao documentoses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demonstracao documentoses
	 */
	public java.util.List<DemonstracaoDocumentos> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemonstracaoDocumentos>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first demonstracao documentos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a matching demonstracao documentos could not be found
	 */
	public DemonstracaoDocumentos findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<DemonstracaoDocumentos> orderByComparator)
		throws NoSuchDemonstracaoDocumentosException;

	/**
	 * Returns the first demonstracao documentos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao documentos, or <code>null</code> if a matching demonstracao documentos could not be found
	 */
	public DemonstracaoDocumentos fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DemonstracaoDocumentos>
			orderByComparator);

	/**
	 * Returns the last demonstracao documentos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a matching demonstracao documentos could not be found
	 */
	public DemonstracaoDocumentos findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<DemonstracaoDocumentos> orderByComparator)
		throws NoSuchDemonstracaoDocumentosException;

	/**
	 * Returns the last demonstracao documentos in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao documentos, or <code>null</code> if a matching demonstracao documentos could not be found
	 */
	public DemonstracaoDocumentos fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DemonstracaoDocumentos>
			orderByComparator);

	/**
	 * Returns the demonstracao documentoses before and after the current demonstracao documentos in the ordered set where uuid = &#63;.
	 *
	 * @param demonstracaoDocumentosId the primary key of the current demonstracao documentos
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a demonstracao documentos with the primary key could not be found
	 */
	public DemonstracaoDocumentos[] findByUuid_PrevAndNext(
			long demonstracaoDocumentosId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<DemonstracaoDocumentos> orderByComparator)
		throws NoSuchDemonstracaoDocumentosException;

	/**
	 * Removes all the demonstracao documentoses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of demonstracao documentoses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching demonstracao documentoses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the demonstracao documentoses where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @return the matching demonstracao documentoses
	 */
	public java.util.List<DemonstracaoDocumentos> findByDemonstracaoId(
		long demonstracaoId);

	/**
	 * Returns a range of all the demonstracao documentoses where demonstracaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @return the range of matching demonstracao documentoses
	 */
	public java.util.List<DemonstracaoDocumentos> findByDemonstracaoId(
		long demonstracaoId, int start, int end);

	/**
	 * Returns an ordered range of all the demonstracao documentoses where demonstracaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demonstracao documentoses
	 */
	public java.util.List<DemonstracaoDocumentos> findByDemonstracaoId(
		long demonstracaoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemonstracaoDocumentos>
			orderByComparator);

	/**
	 * Returns an ordered range of all the demonstracao documentoses where demonstracaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demonstracao documentoses
	 */
	public java.util.List<DemonstracaoDocumentos> findByDemonstracaoId(
		long demonstracaoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemonstracaoDocumentos>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first demonstracao documentos in the ordered set where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a matching demonstracao documentos could not be found
	 */
	public DemonstracaoDocumentos findByDemonstracaoId_First(
			long demonstracaoId,
			com.liferay.portal.kernel.util.OrderByComparator
				<DemonstracaoDocumentos> orderByComparator)
		throws NoSuchDemonstracaoDocumentosException;

	/**
	 * Returns the first demonstracao documentos in the ordered set where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demonstracao documentos, or <code>null</code> if a matching demonstracao documentos could not be found
	 */
	public DemonstracaoDocumentos fetchByDemonstracaoId_First(
		long demonstracaoId,
		com.liferay.portal.kernel.util.OrderByComparator<DemonstracaoDocumentos>
			orderByComparator);

	/**
	 * Returns the last demonstracao documentos in the ordered set where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a matching demonstracao documentos could not be found
	 */
	public DemonstracaoDocumentos findByDemonstracaoId_Last(
			long demonstracaoId,
			com.liferay.portal.kernel.util.OrderByComparator
				<DemonstracaoDocumentos> orderByComparator)
		throws NoSuchDemonstracaoDocumentosException;

	/**
	 * Returns the last demonstracao documentos in the ordered set where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demonstracao documentos, or <code>null</code> if a matching demonstracao documentos could not be found
	 */
	public DemonstracaoDocumentos fetchByDemonstracaoId_Last(
		long demonstracaoId,
		com.liferay.portal.kernel.util.OrderByComparator<DemonstracaoDocumentos>
			orderByComparator);

	/**
	 * Returns the demonstracao documentoses before and after the current demonstracao documentos in the ordered set where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoDocumentosId the primary key of the current demonstracao documentos
	 * @param demonstracaoId the demonstracao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a demonstracao documentos with the primary key could not be found
	 */
	public DemonstracaoDocumentos[] findByDemonstracaoId_PrevAndNext(
			long demonstracaoDocumentosId, long demonstracaoId,
			com.liferay.portal.kernel.util.OrderByComparator
				<DemonstracaoDocumentos> orderByComparator)
		throws NoSuchDemonstracaoDocumentosException;

	/**
	 * Removes all the demonstracao documentoses where demonstracaoId = &#63; from the database.
	 *
	 * @param demonstracaoId the demonstracao ID
	 */
	public void removeByDemonstracaoId(long demonstracaoId);

	/**
	 * Returns the number of demonstracao documentoses where demonstracaoId = &#63;.
	 *
	 * @param demonstracaoId the demonstracao ID
	 * @return the number of matching demonstracao documentoses
	 */
	public int countByDemonstracaoId(long demonstracaoId);

	/**
	 * Caches the demonstracao documentos in the entity cache if it is enabled.
	 *
	 * @param demonstracaoDocumentos the demonstracao documentos
	 */
	public void cacheResult(DemonstracaoDocumentos demonstracaoDocumentos);

	/**
	 * Caches the demonstracao documentoses in the entity cache if it is enabled.
	 *
	 * @param demonstracaoDocumentoses the demonstracao documentoses
	 */
	public void cacheResult(
		java.util.List<DemonstracaoDocumentos> demonstracaoDocumentoses);

	/**
	 * Creates a new demonstracao documentos with the primary key. Does not add the demonstracao documentos to the database.
	 *
	 * @param demonstracaoDocumentosId the primary key for the new demonstracao documentos
	 * @return the new demonstracao documentos
	 */
	public DemonstracaoDocumentos create(long demonstracaoDocumentosId);

	/**
	 * Removes the demonstracao documentos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param demonstracaoDocumentosId the primary key of the demonstracao documentos
	 * @return the demonstracao documentos that was removed
	 * @throws NoSuchDemonstracaoDocumentosException if a demonstracao documentos with the primary key could not be found
	 */
	public DemonstracaoDocumentos remove(long demonstracaoDocumentosId)
		throws NoSuchDemonstracaoDocumentosException;

	public DemonstracaoDocumentos updateImpl(
		DemonstracaoDocumentos demonstracaoDocumentos);

	/**
	 * Returns the demonstracao documentos with the primary key or throws a <code>NoSuchDemonstracaoDocumentosException</code> if it could not be found.
	 *
	 * @param demonstracaoDocumentosId the primary key of the demonstracao documentos
	 * @return the demonstracao documentos
	 * @throws NoSuchDemonstracaoDocumentosException if a demonstracao documentos with the primary key could not be found
	 */
	public DemonstracaoDocumentos findByPrimaryKey(
			long demonstracaoDocumentosId)
		throws NoSuchDemonstracaoDocumentosException;

	/**
	 * Returns the demonstracao documentos with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param demonstracaoDocumentosId the primary key of the demonstracao documentos
	 * @return the demonstracao documentos, or <code>null</code> if a demonstracao documentos with the primary key could not be found
	 */
	public DemonstracaoDocumentos fetchByPrimaryKey(
		long demonstracaoDocumentosId);

	/**
	 * Returns all the demonstracao documentoses.
	 *
	 * @return the demonstracao documentoses
	 */
	public java.util.List<DemonstracaoDocumentos> findAll();

	/**
	 * Returns a range of all the demonstracao documentoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @return the range of demonstracao documentoses
	 */
	public java.util.List<DemonstracaoDocumentos> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the demonstracao documentoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of demonstracao documentoses
	 */
	public java.util.List<DemonstracaoDocumentos> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemonstracaoDocumentos>
			orderByComparator);

	/**
	 * Returns an ordered range of all the demonstracao documentoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of demonstracao documentoses
	 */
	public java.util.List<DemonstracaoDocumentos> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemonstracaoDocumentos>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the demonstracao documentoses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of demonstracao documentoses.
	 *
	 * @return the number of demonstracao documentoses
	 */
	public int countAll();

}