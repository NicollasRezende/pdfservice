/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDeclaracaoException;
import br.com.seatecnologia.gdf.negocia.model.Declaracao;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the declaracao service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeclaracaoUtil
 * @generated
 */
@ProviderType
public interface DeclaracaoPersistence extends BasePersistence<Declaracao> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DeclaracaoUtil} to access the declaracao persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the declaracaos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching declaracaos
	 */
	public java.util.List<Declaracao> findByUuid(String uuid);

	/**
	 * Returns a range of all the declaracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @return the range of matching declaracaos
	 */
	public java.util.List<Declaracao> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the declaracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching declaracaos
	 */
	public java.util.List<Declaracao> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Declaracao>
			orderByComparator);

	/**
	 * Returns an ordered range of all the declaracaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching declaracaos
	 */
	public java.util.List<Declaracao> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Declaracao>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first declaracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching declaracao
	 * @throws NoSuchDeclaracaoException if a matching declaracao could not be found
	 */
	public Declaracao findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Declaracao>
				orderByComparator)
		throws NoSuchDeclaracaoException;

	/**
	 * Returns the first declaracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching declaracao, or <code>null</code> if a matching declaracao could not be found
	 */
	public Declaracao fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Declaracao>
			orderByComparator);

	/**
	 * Returns the last declaracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching declaracao
	 * @throws NoSuchDeclaracaoException if a matching declaracao could not be found
	 */
	public Declaracao findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Declaracao>
				orderByComparator)
		throws NoSuchDeclaracaoException;

	/**
	 * Returns the last declaracao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching declaracao, or <code>null</code> if a matching declaracao could not be found
	 */
	public Declaracao fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Declaracao>
			orderByComparator);

	/**
	 * Returns the declaracaos before and after the current declaracao in the ordered set where uuid = &#63;.
	 *
	 * @param declaracaoId the primary key of the current declaracao
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next declaracao
	 * @throws NoSuchDeclaracaoException if a declaracao with the primary key could not be found
	 */
	public Declaracao[] findByUuid_PrevAndNext(
			long declaracaoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Declaracao>
				orderByComparator)
		throws NoSuchDeclaracaoException;

	/**
	 * Removes all the declaracaos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of declaracaos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching declaracaos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the declaracao where propostaId = &#63; or throws a <code>NoSuchDeclaracaoException</code> if it could not be found.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching declaracao
	 * @throws NoSuchDeclaracaoException if a matching declaracao could not be found
	 */
	public Declaracao findByPropostaId(long propostaId)
		throws NoSuchDeclaracaoException;

	/**
	 * Returns the declaracao where propostaId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param propostaId the proposta ID
	 * @return the matching declaracao, or <code>null</code> if a matching declaracao could not be found
	 */
	public Declaracao fetchByPropostaId(long propostaId);

	/**
	 * Returns the declaracao where propostaId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param propostaId the proposta ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching declaracao, or <code>null</code> if a matching declaracao could not be found
	 */
	public Declaracao fetchByPropostaId(
		long propostaId, boolean useFinderCache);

	/**
	 * Removes the declaracao where propostaId = &#63; from the database.
	 *
	 * @param propostaId the proposta ID
	 * @return the declaracao that was removed
	 */
	public Declaracao removeByPropostaId(long propostaId)
		throws NoSuchDeclaracaoException;

	/**
	 * Returns the number of declaracaos where propostaId = &#63;.
	 *
	 * @param propostaId the proposta ID
	 * @return the number of matching declaracaos
	 */
	public int countByPropostaId(long propostaId);

	/**
	 * Caches the declaracao in the entity cache if it is enabled.
	 *
	 * @param declaracao the declaracao
	 */
	public void cacheResult(Declaracao declaracao);

	/**
	 * Caches the declaracaos in the entity cache if it is enabled.
	 *
	 * @param declaracaos the declaracaos
	 */
	public void cacheResult(java.util.List<Declaracao> declaracaos);

	/**
	 * Creates a new declaracao with the primary key. Does not add the declaracao to the database.
	 *
	 * @param declaracaoId the primary key for the new declaracao
	 * @return the new declaracao
	 */
	public Declaracao create(long declaracaoId);

	/**
	 * Removes the declaracao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param declaracaoId the primary key of the declaracao
	 * @return the declaracao that was removed
	 * @throws NoSuchDeclaracaoException if a declaracao with the primary key could not be found
	 */
	public Declaracao remove(long declaracaoId)
		throws NoSuchDeclaracaoException;

	public Declaracao updateImpl(Declaracao declaracao);

	/**
	 * Returns the declaracao with the primary key or throws a <code>NoSuchDeclaracaoException</code> if it could not be found.
	 *
	 * @param declaracaoId the primary key of the declaracao
	 * @return the declaracao
	 * @throws NoSuchDeclaracaoException if a declaracao with the primary key could not be found
	 */
	public Declaracao findByPrimaryKey(long declaracaoId)
		throws NoSuchDeclaracaoException;

	/**
	 * Returns the declaracao with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param declaracaoId the primary key of the declaracao
	 * @return the declaracao, or <code>null</code> if a declaracao with the primary key could not be found
	 */
	public Declaracao fetchByPrimaryKey(long declaracaoId);

	/**
	 * Returns all the declaracaos.
	 *
	 * @return the declaracaos
	 */
	public java.util.List<Declaracao> findAll();

	/**
	 * Returns a range of all the declaracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @return the range of declaracaos
	 */
	public java.util.List<Declaracao> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the declaracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of declaracaos
	 */
	public java.util.List<Declaracao> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Declaracao>
			orderByComparator);

	/**
	 * Returns an ordered range of all the declaracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeclaracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of declaracaos
	 * @param end the upper bound of the range of declaracaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of declaracaos
	 */
	public java.util.List<Declaracao> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Declaracao>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the declaracaos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of declaracaos.
	 *
	 * @return the number of declaracaos
	 */
	public int countAll();

}