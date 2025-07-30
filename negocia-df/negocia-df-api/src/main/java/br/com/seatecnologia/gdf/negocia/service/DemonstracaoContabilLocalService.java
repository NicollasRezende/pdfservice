/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for DemonstracaoContabil. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see DemonstracaoContabilLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface DemonstracaoContabilLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.DemonstracaoContabilLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the demonstracao contabil local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link DemonstracaoContabilLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the demonstracao contabil to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemonstracaoContabilLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demonstracaoContabil the demonstracao contabil
	 * @return the demonstracao contabil that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DemonstracaoContabil addDemonstracaoContabil(
		DemonstracaoContabil demonstracaoContabil);

	public DemonstracaoContabil addDemonstracaoContabil(
		ServiceContext serviceContext, long propostaId, long fileEntryId,
		int tipoDocumento);

	/**
	 * Creates a new demonstracao contabil with the primary key. Does not add the demonstracao contabil to the database.
	 *
	 * @param demonstracaoId the primary key for the new demonstracao contabil
	 * @return the new demonstracao contabil
	 */
	@Transactional(enabled = false)
	public DemonstracaoContabil createDemonstracaoContabil(long demonstracaoId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the demonstracao contabil from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemonstracaoContabilLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demonstracaoContabil the demonstracao contabil
	 * @return the demonstracao contabil that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public DemonstracaoContabil deleteDemonstracaoContabil(
		DemonstracaoContabil demonstracaoContabil);

	/**
	 * Deletes the demonstracao contabil with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemonstracaoContabilLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demonstracaoId the primary key of the demonstracao contabil
	 * @return the demonstracao contabil that was removed
	 * @throws PortalException if a demonstracao contabil with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public DemonstracaoContabil deleteDemonstracaoContabil(long demonstracaoId)
		throws PortalException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> T dslQuery(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int dslQueryCount(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DemonstracaoContabil fetchDemonstracaoContabil(long demonstracaoId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	 * Returns the demonstracao contabil with the primary key.
	 *
	 * @param demonstracaoId the primary key of the demonstracao contabil
	 * @return the demonstracao contabil
	 * @throws PortalException if a demonstracao contabil with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DemonstracaoContabil getDemonstracaoContabil(long demonstracaoId)
		throws PortalException;

	/**
	 * Returns a range of all the demonstracao contabils.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DemonstracaoContabilModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demonstracao contabils
	 * @param end the upper bound of the range of demonstracao contabils (not inclusive)
	 * @return the range of demonstracao contabils
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DemonstracaoContabil> getDemonstracaoContabils(
		int start, int end);

	/**
	 * Returns the number of demonstracao contabils.
	 *
	 * @return the number of demonstracao contabils
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDemonstracaoContabilsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DemonstracaoContabil> getDemonstracoesContabilByPropostaId(
		long propostaId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the demonstracao contabil in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemonstracaoContabilLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demonstracaoContabil the demonstracao contabil
	 * @return the demonstracao contabil that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DemonstracaoContabil updateDemonstracaoContabil(
		DemonstracaoContabil demonstracaoContabil);

	public DemonstracaoContabil updateDemonstracaoContabil(
			long demonstracaoId, long propostaId, String tipoDemonstracao,
			long fileEntryId)
		throws PortalException;

}