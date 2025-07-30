/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchComprovanteHonorarioException;
import br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the comprovante honorario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ComprovanteHonorarioUtil
 * @generated
 */
@ProviderType
public interface ComprovanteHonorarioPersistence
	extends BasePersistence<ComprovanteHonorario> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ComprovanteHonorarioUtil} to access the comprovante honorario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the comprovante honorarios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching comprovante honorarios
	 */
	public java.util.List<ComprovanteHonorario> findByUuid(String uuid);

	/**
	 * Returns a range of all the comprovante honorarios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @return the range of matching comprovante honorarios
	 */
	public java.util.List<ComprovanteHonorario> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the comprovante honorarios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching comprovante honorarios
	 */
	public java.util.List<ComprovanteHonorario> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComprovanteHonorario>
			orderByComparator);

	/**
	 * Returns an ordered range of all the comprovante honorarios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching comprovante honorarios
	 */
	public java.util.List<ComprovanteHonorario> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComprovanteHonorario>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first comprovante honorario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a matching comprovante honorario could not be found
	 */
	public ComprovanteHonorario findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ComprovanteHonorario> orderByComparator)
		throws NoSuchComprovanteHonorarioException;

	/**
	 * Returns the first comprovante honorario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching comprovante honorario, or <code>null</code> if a matching comprovante honorario could not be found
	 */
	public ComprovanteHonorario fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ComprovanteHonorario>
			orderByComparator);

	/**
	 * Returns the last comprovante honorario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a matching comprovante honorario could not be found
	 */
	public ComprovanteHonorario findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ComprovanteHonorario> orderByComparator)
		throws NoSuchComprovanteHonorarioException;

	/**
	 * Returns the last comprovante honorario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching comprovante honorario, or <code>null</code> if a matching comprovante honorario could not be found
	 */
	public ComprovanteHonorario fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ComprovanteHonorario>
			orderByComparator);

	/**
	 * Returns the comprovante honorarios before and after the current comprovante honorario in the ordered set where uuid = &#63;.
	 *
	 * @param comprovanteId the primary key of the current comprovante honorario
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a comprovante honorario with the primary key could not be found
	 */
	public ComprovanteHonorario[] findByUuid_PrevAndNext(
			long comprovanteId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ComprovanteHonorario> orderByComparator)
		throws NoSuchComprovanteHonorarioException;

	/**
	 * Removes all the comprovante honorarios where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of comprovante honorarios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching comprovante honorarios
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the comprovante honorarios where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching comprovante honorarios
	 */
	public java.util.List<ComprovanteHonorario> findByPropostaId(
		long propostaId);

	/**
	 * Returns a range of all the comprovante honorarios where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @return the range of matching comprovante honorarios
	 */
	public java.util.List<ComprovanteHonorario> findByPropostaId(
		long propostaId, int start, int end);

	/**
	 * Returns an ordered range of all the comprovante honorarios where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching comprovante honorarios
	 */
	public java.util.List<ComprovanteHonorario> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComprovanteHonorario>
			orderByComparator);

	/**
	 * Returns an ordered range of all the comprovante honorarios where propostaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param propostaId the proposta ID
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching comprovante honorarios
	 */
	public java.util.List<ComprovanteHonorario> findByPropostaId(
		long propostaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComprovanteHonorario>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first comprovante honorario in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a matching comprovante honorario could not be found
	 */
	public ComprovanteHonorario findByPropostaId_First(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ComprovanteHonorario> orderByComparator)
		throws NoSuchComprovanteHonorarioException;

	/**
	 * Returns the first comprovante honorario in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching comprovante honorario, or <code>null</code> if a matching comprovante honorario could not be found
	 */
	public ComprovanteHonorario fetchByPropostaId_First(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<ComprovanteHonorario>
			orderByComparator);

	/**
	 * Returns the last comprovante honorario in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a matching comprovante honorario could not be found
	 */
	public ComprovanteHonorario findByPropostaId_Last(
			long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ComprovanteHonorario> orderByComparator)
		throws NoSuchComprovanteHonorarioException;

	/**
	 * Returns the last comprovante honorario in the ordered set where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching comprovante honorario, or <code>null</code> if a matching comprovante honorario could not be found
	 */
	public ComprovanteHonorario fetchByPropostaId_Last(
		long propostaId,
		com.liferay.portal.kernel.util.OrderByComparator<ComprovanteHonorario>
			orderByComparator);

	/**
	 * Returns the comprovante honorarios before and after the current comprovante honorario in the ordered set where propostaId = &#63;.
	 *
	 * @param comprovanteId the primary key of the current comprovante honorario
	 * @param propostaId the proposta ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a comprovante honorario with the primary key could not be found
	 */
	public ComprovanteHonorario[] findByPropostaId_PrevAndNext(
			long comprovanteId, long propostaId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ComprovanteHonorario> orderByComparator)
		throws NoSuchComprovanteHonorarioException;

	/**
	 * Removes all the comprovante honorarios where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 */
	public void removeByPropostaId(long propostaId);

	/**
	 * Returns the number of comprovante honorarios where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching comprovante honorarios
	 */
	public int countByPropostaId(long propostaId);

	/**
	 * Caches the comprovante honorario in the entity cache if it is enabled.
	 *
	 * @param comprovanteHonorario the comprovante honorario
	 */
	public void cacheResult(ComprovanteHonorario comprovanteHonorario);

	/**
	 * Caches the comprovante honorarios in the entity cache if it is enabled.
	 *
	 * @param comprovanteHonorarios the comprovante honorarios
	 */
	public void cacheResult(
		java.util.List<ComprovanteHonorario> comprovanteHonorarios);

	/**
	 * Creates a new comprovante honorario with the primary key. Does not add the comprovante honorario to the database.
	 *
	 * @param comprovanteId the primary key for the new comprovante honorario
	 * @return the new comprovante honorario
	 */
	public ComprovanteHonorario create(long comprovanteId);

	/**
	 * Removes the comprovante honorario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param comprovanteId the primary key of the comprovante honorario
	 * @return the comprovante honorario that was removed
	 * @throws NoSuchComprovanteHonorarioException if a comprovante honorario with the primary key could not be found
	 */
	public ComprovanteHonorario remove(long comprovanteId)
		throws NoSuchComprovanteHonorarioException;

	public ComprovanteHonorario updateImpl(
		ComprovanteHonorario comprovanteHonorario);

	/**
	 * Returns the comprovante honorario with the primary key or throws a <code>NoSuchComprovanteHonorarioException</code> if it could not be found.
	 *
	 * @param comprovanteId the primary key of the comprovante honorario
	 * @return the comprovante honorario
	 * @throws NoSuchComprovanteHonorarioException if a comprovante honorario with the primary key could not be found
	 */
	public ComprovanteHonorario findByPrimaryKey(long comprovanteId)
		throws NoSuchComprovanteHonorarioException;

	/**
	 * Returns the comprovante honorario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param comprovanteId the primary key of the comprovante honorario
	 * @return the comprovante honorario, or <code>null</code> if a comprovante honorario with the primary key could not be found
	 */
	public ComprovanteHonorario fetchByPrimaryKey(long comprovanteId);

	/**
	 * Returns all the comprovante honorarios.
	 *
	 * @return the comprovante honorarios
	 */
	public java.util.List<ComprovanteHonorario> findAll();

	/**
	 * Returns a range of all the comprovante honorarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @return the range of comprovante honorarios
	 */
	public java.util.List<ComprovanteHonorario> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the comprovante honorarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of comprovante honorarios
	 */
	public java.util.List<ComprovanteHonorario> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComprovanteHonorario>
			orderByComparator);

	/**
	 * Returns an ordered range of all the comprovante honorarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of comprovante honorarios
	 */
	public java.util.List<ComprovanteHonorario> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ComprovanteHonorario>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the comprovante honorarios from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of comprovante honorarios.
	 *
	 * @return the number of comprovante honorarios
	 */
	public int countAll();

}