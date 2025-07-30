/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDocumentoComprobatorioException;
import br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the documento comprobatorio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DocumentoComprobatorioUtil
 * @generated
 */
@ProviderType
public interface DocumentoComprobatorioPersistence
	extends BasePersistence<DocumentoComprobatorio> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DocumentoComprobatorioUtil} to access the documento comprobatorio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the documento comprobatorios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching documento comprobatorios
	 */
	public java.util.List<DocumentoComprobatorio> findByUuid(String uuid);

	/**
	 * Returns a range of all the documento comprobatorios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @return the range of matching documento comprobatorios
	 */
	public java.util.List<DocumentoComprobatorio> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the documento comprobatorios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching documento comprobatorios
	 */
	public java.util.List<DocumentoComprobatorio> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentoComprobatorio>
			orderByComparator);

	/**
	 * Returns an ordered range of all the documento comprobatorios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching documento comprobatorios
	 */
	public java.util.List<DocumentoComprobatorio> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentoComprobatorio>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first documento comprobatorio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a matching documento comprobatorio could not be found
	 */
	public DocumentoComprobatorio findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<DocumentoComprobatorio> orderByComparator)
		throws NoSuchDocumentoComprobatorioException;

	/**
	 * Returns the first documento comprobatorio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching documento comprobatorio, or <code>null</code> if a matching documento comprobatorio could not be found
	 */
	public DocumentoComprobatorio fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentoComprobatorio>
			orderByComparator);

	/**
	 * Returns the last documento comprobatorio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a matching documento comprobatorio could not be found
	 */
	public DocumentoComprobatorio findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<DocumentoComprobatorio> orderByComparator)
		throws NoSuchDocumentoComprobatorioException;

	/**
	 * Returns the last documento comprobatorio in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching documento comprobatorio, or <code>null</code> if a matching documento comprobatorio could not be found
	 */
	public DocumentoComprobatorio fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentoComprobatorio>
			orderByComparator);

	/**
	 * Returns the documento comprobatorios before and after the current documento comprobatorio in the ordered set where uuid = &#63;.
	 *
	 * @param documentoId the primary key of the current documento comprobatorio
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a documento comprobatorio with the primary key could not be found
	 */
	public DocumentoComprobatorio[] findByUuid_PrevAndNext(
			long documentoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<DocumentoComprobatorio> orderByComparator)
		throws NoSuchDocumentoComprobatorioException;

	/**
	 * Removes all the documento comprobatorios where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of documento comprobatorios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching documento comprobatorios
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the documento comprobatorios where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @return the matching documento comprobatorios
	 */
	public java.util.List<DocumentoComprobatorio> findByFundamentacaoId(
		long fundamentacaoId);

	/**
	 * Returns a range of all the documento comprobatorios where fundamentacaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @return the range of matching documento comprobatorios
	 */
	public java.util.List<DocumentoComprobatorio> findByFundamentacaoId(
		long fundamentacaoId, int start, int end);

	/**
	 * Returns an ordered range of all the documento comprobatorios where fundamentacaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching documento comprobatorios
	 */
	public java.util.List<DocumentoComprobatorio> findByFundamentacaoId(
		long fundamentacaoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentoComprobatorio>
			orderByComparator);

	/**
	 * Returns an ordered range of all the documento comprobatorios where fundamentacaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching documento comprobatorios
	 */
	public java.util.List<DocumentoComprobatorio> findByFundamentacaoId(
		long fundamentacaoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentoComprobatorio>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first documento comprobatorio in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a matching documento comprobatorio could not be found
	 */
	public DocumentoComprobatorio findByFundamentacaoId_First(
			long fundamentacaoId,
			com.liferay.portal.kernel.util.OrderByComparator
				<DocumentoComprobatorio> orderByComparator)
		throws NoSuchDocumentoComprobatorioException;

	/**
	 * Returns the first documento comprobatorio in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching documento comprobatorio, or <code>null</code> if a matching documento comprobatorio could not be found
	 */
	public DocumentoComprobatorio fetchByFundamentacaoId_First(
		long fundamentacaoId,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentoComprobatorio>
			orderByComparator);

	/**
	 * Returns the last documento comprobatorio in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a matching documento comprobatorio could not be found
	 */
	public DocumentoComprobatorio findByFundamentacaoId_Last(
			long fundamentacaoId,
			com.liferay.portal.kernel.util.OrderByComparator
				<DocumentoComprobatorio> orderByComparator)
		throws NoSuchDocumentoComprobatorioException;

	/**
	 * Returns the last documento comprobatorio in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching documento comprobatorio, or <code>null</code> if a matching documento comprobatorio could not be found
	 */
	public DocumentoComprobatorio fetchByFundamentacaoId_Last(
		long fundamentacaoId,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentoComprobatorio>
			orderByComparator);

	/**
	 * Returns the documento comprobatorios before and after the current documento comprobatorio in the ordered set where fundamentacaoId = &#63;.
	 *
	 * @param documentoId the primary key of the current documento comprobatorio
	 * @param fundamentacaoId the fundamentacao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a documento comprobatorio with the primary key could not be found
	 */
	public DocumentoComprobatorio[] findByFundamentacaoId_PrevAndNext(
			long documentoId, long fundamentacaoId,
			com.liferay.portal.kernel.util.OrderByComparator
				<DocumentoComprobatorio> orderByComparator)
		throws NoSuchDocumentoComprobatorioException;

	/**
	 * Removes all the documento comprobatorios where fundamentacaoId = &#63; from the database.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 */
	public void removeByFundamentacaoId(long fundamentacaoId);

	/**
	 * Returns the number of documento comprobatorios where fundamentacaoId = &#63;.
	 *
	 * @param fundamentacaoId the fundamentacao ID
	 * @return the number of matching documento comprobatorios
	 */
	public int countByFundamentacaoId(long fundamentacaoId);

	/**
	 * Caches the documento comprobatorio in the entity cache if it is enabled.
	 *
	 * @param documentoComprobatorio the documento comprobatorio
	 */
	public void cacheResult(DocumentoComprobatorio documentoComprobatorio);

	/**
	 * Caches the documento comprobatorios in the entity cache if it is enabled.
	 *
	 * @param documentoComprobatorios the documento comprobatorios
	 */
	public void cacheResult(
		java.util.List<DocumentoComprobatorio> documentoComprobatorios);

	/**
	 * Creates a new documento comprobatorio with the primary key. Does not add the documento comprobatorio to the database.
	 *
	 * @param documentoId the primary key for the new documento comprobatorio
	 * @return the new documento comprobatorio
	 */
	public DocumentoComprobatorio create(long documentoId);

	/**
	 * Removes the documento comprobatorio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param documentoId the primary key of the documento comprobatorio
	 * @return the documento comprobatorio that was removed
	 * @throws NoSuchDocumentoComprobatorioException if a documento comprobatorio with the primary key could not be found
	 */
	public DocumentoComprobatorio remove(long documentoId)
		throws NoSuchDocumentoComprobatorioException;

	public DocumentoComprobatorio updateImpl(
		DocumentoComprobatorio documentoComprobatorio);

	/**
	 * Returns the documento comprobatorio with the primary key or throws a <code>NoSuchDocumentoComprobatorioException</code> if it could not be found.
	 *
	 * @param documentoId the primary key of the documento comprobatorio
	 * @return the documento comprobatorio
	 * @throws NoSuchDocumentoComprobatorioException if a documento comprobatorio with the primary key could not be found
	 */
	public DocumentoComprobatorio findByPrimaryKey(long documentoId)
		throws NoSuchDocumentoComprobatorioException;

	/**
	 * Returns the documento comprobatorio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param documentoId the primary key of the documento comprobatorio
	 * @return the documento comprobatorio, or <code>null</code> if a documento comprobatorio with the primary key could not be found
	 */
	public DocumentoComprobatorio fetchByPrimaryKey(long documentoId);

	/**
	 * Returns all the documento comprobatorios.
	 *
	 * @return the documento comprobatorios
	 */
	public java.util.List<DocumentoComprobatorio> findAll();

	/**
	 * Returns a range of all the documento comprobatorios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @return the range of documento comprobatorios
	 */
	public java.util.List<DocumentoComprobatorio> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the documento comprobatorios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of documento comprobatorios
	 */
	public java.util.List<DocumentoComprobatorio> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentoComprobatorio>
			orderByComparator);

	/**
	 * Returns an ordered range of all the documento comprobatorios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of documento comprobatorios
	 */
	public java.util.List<DocumentoComprobatorio> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentoComprobatorio>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the documento comprobatorios from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of documento comprobatorios.
	 *
	 * @return the number of documento comprobatorios
	 */
	public int countAll();

}