/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.DadosContribuinte;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
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
 * Provides the local service interface for DadosContribuinte. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see DadosContribuinteLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface DadosContribuinteLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.DadosContribuinteLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the dados contribuinte local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link DadosContribuinteLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the dados contribuinte to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DadosContribuinteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dadosContribuinte the dados contribuinte
	 * @return the dados contribuinte that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DadosContribuinte addDadosContribuinte(
		DadosContribuinte dadosContribuinte);

	public DadosContribuinte addDadosContribuinte(
		ServiceContext serviceContext, long qualificacaoId, long propostaId);

	/**
	 * Creates a new dados contribuinte with the primary key. Does not add the dados contribuinte to the database.
	 *
	 * @param dadosContribuinteId the primary key for the new dados contribuinte
	 * @return the new dados contribuinte
	 */
	@Transactional(enabled = false)
	public DadosContribuinte createDadosContribuinte(long dadosContribuinteId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the dados contribuinte from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DadosContribuinteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dadosContribuinte the dados contribuinte
	 * @return the dados contribuinte that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public DadosContribuinte deleteDadosContribuinte(
		DadosContribuinte dadosContribuinte);

	/**
	 * Deletes the dados contribuinte with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DadosContribuinteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dadosContribuinteId the primary key of the dados contribuinte
	 * @return the dados contribuinte that was removed
	 * @throws PortalException if a dados contribuinte with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public DadosContribuinte deleteDadosContribuinte(long dadosContribuinteId)
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DadosContribuinteModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DadosContribuinteModelImpl</code>.
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
	public DadosContribuinte fetchDadosContribuinte(long dadosContribuinteId);

	/**
	 * Returns the dados contribuinte matching the UUID and group.
	 *
	 * @param uuid the dados contribuinte's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DadosContribuinte fetchDadosContribuinteByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	 * Returns the dados contribuinte with the primary key.
	 *
	 * @param dadosContribuinteId the primary key of the dados contribuinte
	 * @return the dados contribuinte
	 * @throws PortalException if a dados contribuinte with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DadosContribuinte getDadosContribuinte(long dadosContribuinteId)
		throws PortalException;

	/**
	 * Returns the dados contribuinte matching the UUID and group.
	 *
	 * @param uuid the dados contribuinte's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dados contribuinte
	 * @throws PortalException if a matching dados contribuinte could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DadosContribuinte getDadosContribuinteByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the dados contribuintes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DadosContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @return the range of dados contribuintes
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DadosContribuinte> getDadosContribuintes(int start, int end);

	/**
	 * Returns all the dados contribuintes matching the UUID and company.
	 *
	 * @param uuid the UUID of the dados contribuintes
	 * @param companyId the primary key of the company
	 * @return the matching dados contribuintes, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DadosContribuinte> getDadosContribuintesByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of dados contribuintes matching the UUID and company.
	 *
	 * @param uuid the UUID of the dados contribuintes
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of dados contribuintes
	 * @param end the upper bound of the range of dados contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching dados contribuintes, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DadosContribuinte> getDadosContribuintesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DadosContribuinte> orderByComparator);

	/**
	 * Returns the number of dados contribuintes.
	 *
	 * @return the number of dados contribuintes
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDadosContribuintesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

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
	 * Updates the dados contribuinte in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DadosContribuinteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dadosContribuinte the dados contribuinte
	 * @return the dados contribuinte that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DadosContribuinte updateDadosContribuinte(
		DadosContribuinte dadosContribuinte);

	public DadosContribuinte updateDadosContribuinte(
			long dadosContribuinteId, ServiceContext serviceContext,
			long qualificacaoId, long socios, long controladores,
			long administradores, long gestores, long empresasGrupo)
		throws PortalException;

}