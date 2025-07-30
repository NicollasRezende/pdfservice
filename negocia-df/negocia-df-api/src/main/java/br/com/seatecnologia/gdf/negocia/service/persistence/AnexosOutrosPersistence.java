/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchAnexosOutrosException;
import br.com.seatecnologia.gdf.negocia.model.AnexosOutros;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the anexos outros service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AnexosOutrosUtil
 * @generated
 */
@ProviderType
public interface AnexosOutrosPersistence extends BasePersistence<AnexosOutros> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AnexosOutrosUtil} to access the anexos outros persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the anexos outroses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching anexos outroses
	 */
	public java.util.List<AnexosOutros> findByUuid(String uuid);

	/**
	 * Returns a range of all the anexos outroses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @return the range of matching anexos outroses
	 */
	public java.util.List<AnexosOutros> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the anexos outroses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching anexos outroses
	 */
	public java.util.List<AnexosOutros> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AnexosOutros>
			orderByComparator);

	/**
	 * Returns an ordered range of all the anexos outroses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching anexos outroses
	 */
	public java.util.List<AnexosOutros> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AnexosOutros>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first anexos outros in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching anexos outros
	 * @throws NoSuchAnexosOutrosException if a matching anexos outros could not be found
	 */
	public AnexosOutros findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AnexosOutros>
				orderByComparator)
		throws NoSuchAnexosOutrosException;

	/**
	 * Returns the first anexos outros in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching anexos outros, or <code>null</code> if a matching anexos outros could not be found
	 */
	public AnexosOutros fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AnexosOutros>
			orderByComparator);

	/**
	 * Returns the last anexos outros in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching anexos outros
	 * @throws NoSuchAnexosOutrosException if a matching anexos outros could not be found
	 */
	public AnexosOutros findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AnexosOutros>
				orderByComparator)
		throws NoSuchAnexosOutrosException;

	/**
	 * Returns the last anexos outros in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching anexos outros, or <code>null</code> if a matching anexos outros could not be found
	 */
	public AnexosOutros fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AnexosOutros>
			orderByComparator);

	/**
	 * Returns the anexos outroses before and after the current anexos outros in the ordered set where uuid = &#63;.
	 *
	 * @param anexosOutrosId the primary key of the current anexos outros
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next anexos outros
	 * @throws NoSuchAnexosOutrosException if a anexos outros with the primary key could not be found
	 */
	public AnexosOutros[] findByUuid_PrevAndNext(
			long anexosOutrosId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AnexosOutros>
				orderByComparator)
		throws NoSuchAnexosOutrosException;

	/**
	 * Removes all the anexos outroses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of anexos outroses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching anexos outroses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the anexos outroses where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @return the matching anexos outroses
	 */
	public java.util.List<AnexosOutros> findByDadosRegistroId(
		long dadosRegistroId);

	/**
	 * Returns a range of all the anexos outroses where dadosRegistroId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @return the range of matching anexos outroses
	 */
	public java.util.List<AnexosOutros> findByDadosRegistroId(
		long dadosRegistroId, int start, int end);

	/**
	 * Returns an ordered range of all the anexos outroses where dadosRegistroId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching anexos outroses
	 */
	public java.util.List<AnexosOutros> findByDadosRegistroId(
		long dadosRegistroId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AnexosOutros>
			orderByComparator);

	/**
	 * Returns an ordered range of all the anexos outroses where dadosRegistroId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching anexos outroses
	 */
	public java.util.List<AnexosOutros> findByDadosRegistroId(
		long dadosRegistroId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AnexosOutros>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first anexos outros in the ordered set where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching anexos outros
	 * @throws NoSuchAnexosOutrosException if a matching anexos outros could not be found
	 */
	public AnexosOutros findByDadosRegistroId_First(
			long dadosRegistroId,
			com.liferay.portal.kernel.util.OrderByComparator<AnexosOutros>
				orderByComparator)
		throws NoSuchAnexosOutrosException;

	/**
	 * Returns the first anexos outros in the ordered set where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching anexos outros, or <code>null</code> if a matching anexos outros could not be found
	 */
	public AnexosOutros fetchByDadosRegistroId_First(
		long dadosRegistroId,
		com.liferay.portal.kernel.util.OrderByComparator<AnexosOutros>
			orderByComparator);

	/**
	 * Returns the last anexos outros in the ordered set where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching anexos outros
	 * @throws NoSuchAnexosOutrosException if a matching anexos outros could not be found
	 */
	public AnexosOutros findByDadosRegistroId_Last(
			long dadosRegistroId,
			com.liferay.portal.kernel.util.OrderByComparator<AnexosOutros>
				orderByComparator)
		throws NoSuchAnexosOutrosException;

	/**
	 * Returns the last anexos outros in the ordered set where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching anexos outros, or <code>null</code> if a matching anexos outros could not be found
	 */
	public AnexosOutros fetchByDadosRegistroId_Last(
		long dadosRegistroId,
		com.liferay.portal.kernel.util.OrderByComparator<AnexosOutros>
			orderByComparator);

	/**
	 * Returns the anexos outroses before and after the current anexos outros in the ordered set where dadosRegistroId = &#63;.
	 *
	 * @param anexosOutrosId the primary key of the current anexos outros
	 * @param dadosRegistroId the dados registro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next anexos outros
	 * @throws NoSuchAnexosOutrosException if a anexos outros with the primary key could not be found
	 */
	public AnexosOutros[] findByDadosRegistroId_PrevAndNext(
			long anexosOutrosId, long dadosRegistroId,
			com.liferay.portal.kernel.util.OrderByComparator<AnexosOutros>
				orderByComparator)
		throws NoSuchAnexosOutrosException;

	/**
	 * Removes all the anexos outroses where dadosRegistroId = &#63; from the database.
	 *
	 * @param dadosRegistroId the dados registro ID
	 */
	public void removeByDadosRegistroId(long dadosRegistroId);

	/**
	 * Returns the number of anexos outroses where dadosRegistroId = &#63;.
	 *
	 * @param dadosRegistroId the dados registro ID
	 * @return the number of matching anexos outroses
	 */
	public int countByDadosRegistroId(long dadosRegistroId);

	/**
	 * Caches the anexos outros in the entity cache if it is enabled.
	 *
	 * @param anexosOutros the anexos outros
	 */
	public void cacheResult(AnexosOutros anexosOutros);

	/**
	 * Caches the anexos outroses in the entity cache if it is enabled.
	 *
	 * @param anexosOutroses the anexos outroses
	 */
	public void cacheResult(java.util.List<AnexosOutros> anexosOutroses);

	/**
	 * Creates a new anexos outros with the primary key. Does not add the anexos outros to the database.
	 *
	 * @param anexosOutrosId the primary key for the new anexos outros
	 * @return the new anexos outros
	 */
	public AnexosOutros create(long anexosOutrosId);

	/**
	 * Removes the anexos outros with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param anexosOutrosId the primary key of the anexos outros
	 * @return the anexos outros that was removed
	 * @throws NoSuchAnexosOutrosException if a anexos outros with the primary key could not be found
	 */
	public AnexosOutros remove(long anexosOutrosId)
		throws NoSuchAnexosOutrosException;

	public AnexosOutros updateImpl(AnexosOutros anexosOutros);

	/**
	 * Returns the anexos outros with the primary key or throws a <code>NoSuchAnexosOutrosException</code> if it could not be found.
	 *
	 * @param anexosOutrosId the primary key of the anexos outros
	 * @return the anexos outros
	 * @throws NoSuchAnexosOutrosException if a anexos outros with the primary key could not be found
	 */
	public AnexosOutros findByPrimaryKey(long anexosOutrosId)
		throws NoSuchAnexosOutrosException;

	/**
	 * Returns the anexos outros with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param anexosOutrosId the primary key of the anexos outros
	 * @return the anexos outros, or <code>null</code> if a anexos outros with the primary key could not be found
	 */
	public AnexosOutros fetchByPrimaryKey(long anexosOutrosId);

	/**
	 * Returns all the anexos outroses.
	 *
	 * @return the anexos outroses
	 */
	public java.util.List<AnexosOutros> findAll();

	/**
	 * Returns a range of all the anexos outroses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @return the range of anexos outroses
	 */
	public java.util.List<AnexosOutros> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the anexos outroses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of anexos outroses
	 */
	public java.util.List<AnexosOutros> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AnexosOutros>
			orderByComparator);

	/**
	 * Returns an ordered range of all the anexos outroses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnexosOutrosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of anexos outroses
	 * @param end the upper bound of the range of anexos outroses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of anexos outroses
	 */
	public java.util.List<AnexosOutros> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AnexosOutros>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the anexos outroses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of anexos outroses.
	 *
	 * @return the number of anexos outroses
	 */
	public int countAll();

}