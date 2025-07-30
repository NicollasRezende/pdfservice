/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchQualificacaoCompletaException;
import br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the qualificacao completa service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualificacaoCompletaUtil
 * @generated
 */
@ProviderType
public interface QualificacaoCompletaPersistence
	extends BasePersistence<QualificacaoCompleta> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QualificacaoCompletaUtil} to access the qualificacao completa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the qualificacao completas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching qualificacao completas
	 */
	public java.util.List<QualificacaoCompleta> findByUuid(String uuid);

	/**
	 * Returns a range of all the qualificacao completas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @return the range of matching qualificacao completas
	 */
	public java.util.List<QualificacaoCompleta> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the qualificacao completas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qualificacao completas
	 */
	public java.util.List<QualificacaoCompleta> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QualificacaoCompleta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the qualificacao completas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching qualificacao completas
	 */
	public java.util.List<QualificacaoCompleta> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QualificacaoCompleta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first qualificacao completa in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualificacao completa
	 * @throws NoSuchQualificacaoCompletaException if a matching qualificacao completa could not be found
	 */
	public QualificacaoCompleta findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<QualificacaoCompleta> orderByComparator)
		throws NoSuchQualificacaoCompletaException;

	/**
	 * Returns the first qualificacao completa in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qualificacao completa, or <code>null</code> if a matching qualificacao completa could not be found
	 */
	public QualificacaoCompleta fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<QualificacaoCompleta>
			orderByComparator);

	/**
	 * Returns the last qualificacao completa in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualificacao completa
	 * @throws NoSuchQualificacaoCompletaException if a matching qualificacao completa could not be found
	 */
	public QualificacaoCompleta findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<QualificacaoCompleta> orderByComparator)
		throws NoSuchQualificacaoCompletaException;

	/**
	 * Returns the last qualificacao completa in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qualificacao completa, or <code>null</code> if a matching qualificacao completa could not be found
	 */
	public QualificacaoCompleta fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<QualificacaoCompleta>
			orderByComparator);

	/**
	 * Returns the qualificacao completas before and after the current qualificacao completa in the ordered set where uuid = &#63;.
	 *
	 * @param qualificacaoId the primary key of the current qualificacao completa
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qualificacao completa
	 * @throws NoSuchQualificacaoCompletaException if a qualificacao completa with the primary key could not be found
	 */
	public QualificacaoCompleta[] findByUuid_PrevAndNext(
			long qualificacaoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<QualificacaoCompleta> orderByComparator)
		throws NoSuchQualificacaoCompletaException;

	/**
	 * Removes all the qualificacao completas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of qualificacao completas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching qualificacao completas
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the qualificacao completa in the entity cache if it is enabled.
	 *
	 * @param qualificacaoCompleta the qualificacao completa
	 */
	public void cacheResult(QualificacaoCompleta qualificacaoCompleta);

	/**
	 * Caches the qualificacao completas in the entity cache if it is enabled.
	 *
	 * @param qualificacaoCompletas the qualificacao completas
	 */
	public void cacheResult(
		java.util.List<QualificacaoCompleta> qualificacaoCompletas);

	/**
	 * Creates a new qualificacao completa with the primary key. Does not add the qualificacao completa to the database.
	 *
	 * @param qualificacaoId the primary key for the new qualificacao completa
	 * @return the new qualificacao completa
	 */
	public QualificacaoCompleta create(long qualificacaoId);

	/**
	 * Removes the qualificacao completa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualificacaoId the primary key of the qualificacao completa
	 * @return the qualificacao completa that was removed
	 * @throws NoSuchQualificacaoCompletaException if a qualificacao completa with the primary key could not be found
	 */
	public QualificacaoCompleta remove(long qualificacaoId)
		throws NoSuchQualificacaoCompletaException;

	public QualificacaoCompleta updateImpl(
		QualificacaoCompleta qualificacaoCompleta);

	/**
	 * Returns the qualificacao completa with the primary key or throws a <code>NoSuchQualificacaoCompletaException</code> if it could not be found.
	 *
	 * @param qualificacaoId the primary key of the qualificacao completa
	 * @return the qualificacao completa
	 * @throws NoSuchQualificacaoCompletaException if a qualificacao completa with the primary key could not be found
	 */
	public QualificacaoCompleta findByPrimaryKey(long qualificacaoId)
		throws NoSuchQualificacaoCompletaException;

	/**
	 * Returns the qualificacao completa with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualificacaoId the primary key of the qualificacao completa
	 * @return the qualificacao completa, or <code>null</code> if a qualificacao completa with the primary key could not be found
	 */
	public QualificacaoCompleta fetchByPrimaryKey(long qualificacaoId);

	/**
	 * Returns all the qualificacao completas.
	 *
	 * @return the qualificacao completas
	 */
	public java.util.List<QualificacaoCompleta> findAll();

	/**
	 * Returns a range of all the qualificacao completas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @return the range of qualificacao completas
	 */
	public java.util.List<QualificacaoCompleta> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the qualificacao completas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qualificacao completas
	 */
	public java.util.List<QualificacaoCompleta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QualificacaoCompleta>
			orderByComparator);

	/**
	 * Returns an ordered range of all the qualificacao completas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of qualificacao completas
	 */
	public java.util.List<QualificacaoCompleta> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QualificacaoCompleta>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the qualificacao completas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of qualificacao completas.
	 *
	 * @return the number of qualificacao completas
	 */
	public int countAll();

}