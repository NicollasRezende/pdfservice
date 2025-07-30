/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.base;

import br.com.seatecnologia.gdf.negocia.model.DadosContribuinte;
import br.com.seatecnologia.gdf.negocia.service.DadosContribuinteLocalService;
import br.com.seatecnologia.gdf.negocia.service.persistence.AcaoJudicialPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AcaoJudicialPropostaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AdministradorJudicialPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AdvogadoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AnexosOutrosPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.BemDireitoAdicionalPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.BensDireitosLaudoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.BensDireitosRequerentePersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.ComprovanteHonorarioPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.ConcessaoDfPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.CreditoTransacionadoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.CredorPropostaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DadosContribuintePersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DadosRegistroPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DeclaracaoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DemonstracaoContabilPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DemonstracaoDocumentosPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DocumentoComprobatorioPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.EditalPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.EncargoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.EnderecoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.FundamentacaoPedidoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.GarantiaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.GarantiaPropostaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.IdentificacaoDebitosPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.ParcelamentoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.ProcuracaoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.PropostaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.QualificacaoCompletaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.QualificacaoContribuintePersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.RelacaoCredorPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.TermoAssinadoPersistence;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.CurrentConnectionUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.sql.Connection;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the dados contribuinte local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link br.com.seatecnologia.gdf.negocia.service.impl.DadosContribuinteLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see br.com.seatecnologia.gdf.negocia.service.impl.DadosContribuinteLocalServiceImpl
 * @generated
 */
public abstract class DadosContribuinteLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, DadosContribuinteLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>DadosContribuinteLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>br.com.seatecnologia.gdf.negocia.service.DadosContribuinteLocalServiceUtil</code>.
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
	@Override
	public DadosContribuinte addDadosContribuinte(
		DadosContribuinte dadosContribuinte) {

		dadosContribuinte.setNew(true);

		return dadosContribuintePersistence.update(dadosContribuinte);
	}

	/**
	 * Creates a new dados contribuinte with the primary key. Does not add the dados contribuinte to the database.
	 *
	 * @param dadosContribuinteId the primary key for the new dados contribuinte
	 * @return the new dados contribuinte
	 */
	@Override
	@Transactional(enabled = false)
	public DadosContribuinte createDadosContribuinte(long dadosContribuinteId) {
		return dadosContribuintePersistence.create(dadosContribuinteId);
	}

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
	@Override
	public DadosContribuinte deleteDadosContribuinte(long dadosContribuinteId)
		throws PortalException {

		return dadosContribuintePersistence.remove(dadosContribuinteId);
	}

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
	@Override
	public DadosContribuinte deleteDadosContribuinte(
		DadosContribuinte dadosContribuinte) {

		return dadosContribuintePersistence.remove(dadosContribuinte);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return dadosContribuintePersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			DadosContribuinte.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return dadosContribuintePersistence.findWithDynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return dadosContribuintePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

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
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return dadosContribuintePersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return dadosContribuintePersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return dadosContribuintePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public DadosContribuinte fetchDadosContribuinte(long dadosContribuinteId) {
		return dadosContribuintePersistence.fetchByPrimaryKey(
			dadosContribuinteId);
	}

	/**
	 * Returns the dados contribuinte matching the UUID and group.
	 *
	 * @param uuid the dados contribuinte's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dados contribuinte, or <code>null</code> if a matching dados contribuinte could not be found
	 */
	@Override
	public DadosContribuinte fetchDadosContribuinteByUuidAndGroupId(
		String uuid, long groupId) {

		return dadosContribuintePersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the dados contribuinte with the primary key.
	 *
	 * @param dadosContribuinteId the primary key of the dados contribuinte
	 * @return the dados contribuinte
	 * @throws PortalException if a dados contribuinte with the primary key could not be found
	 */
	@Override
	public DadosContribuinte getDadosContribuinte(long dadosContribuinteId)
		throws PortalException {

		return dadosContribuintePersistence.findByPrimaryKey(
			dadosContribuinteId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			dadosContribuinteLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(DadosContribuinte.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("dadosContribuinteId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			dadosContribuinteLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(DadosContribuinte.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"dadosContribuinteId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			dadosContribuinteLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(DadosContribuinte.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("dadosContribuinteId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<DadosContribuinte>() {

				@Override
				public void performAction(DadosContribuinte dadosContribuinte)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, dadosContribuinte);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(DadosContribuinte.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return dadosContribuintePersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		if (_log.isWarnEnabled()) {
			_log.warn(
				"Implement DadosContribuinteLocalServiceImpl#deleteDadosContribuinte(DadosContribuinte) to avoid orphaned data");
		}

		return dadosContribuinteLocalService.deleteDadosContribuinte(
			(DadosContribuinte)persistedModel);
	}

	@Override
	public BasePersistence<DadosContribuinte> getBasePersistence() {
		return dadosContribuintePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return dadosContribuintePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the dados contribuintes matching the UUID and company.
	 *
	 * @param uuid the UUID of the dados contribuintes
	 * @param companyId the primary key of the company
	 * @return the matching dados contribuintes, or an empty list if no matches were found
	 */
	@Override
	public List<DadosContribuinte> getDadosContribuintesByUuidAndCompanyId(
		String uuid, long companyId) {

		return dadosContribuintePersistence.findByUuid_C(uuid, companyId);
	}

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
	@Override
	public List<DadosContribuinte> getDadosContribuintesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DadosContribuinte> orderByComparator) {

		return dadosContribuintePersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the dados contribuinte matching the UUID and group.
	 *
	 * @param uuid the dados contribuinte's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dados contribuinte
	 * @throws PortalException if a matching dados contribuinte could not be found
	 */
	@Override
	public DadosContribuinte getDadosContribuinteByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return dadosContribuintePersistence.findByUUID_G(uuid, groupId);
	}

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
	@Override
	public List<DadosContribuinte> getDadosContribuintes(int start, int end) {
		return dadosContribuintePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of dados contribuintes.
	 *
	 * @return the number of dados contribuintes
	 */
	@Override
	public int getDadosContribuintesCount() {
		return dadosContribuintePersistence.countAll();
	}

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
	@Override
	public DadosContribuinte updateDadosContribuinte(
		DadosContribuinte dadosContribuinte) {

		return dadosContribuintePersistence.update(dadosContribuinte);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			DadosContribuinteLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		dadosContribuinteLocalService = (DadosContribuinteLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return DadosContribuinteLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return DadosContribuinte.class;
	}

	protected String getModelClassName() {
		return DadosContribuinte.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		DataSource dataSource = dadosContribuintePersistence.getDataSource();

		DB db = DBManagerUtil.getDB();

		Connection currentConnection = CurrentConnectionUtil.getConnection(
			dataSource);

		try {
			if (currentConnection != null) {
				db.runSQL(currentConnection, new String[] {sql});

				return;
			}

			try (Connection connection = dataSource.getConnection()) {
				db.runSQL(connection, new String[] {sql});
			}
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	@Reference
	protected AcaoJudicialPersistence acaoJudicialPersistence;

	@Reference
	protected AcaoJudicialPropostaPersistence acaoJudicialPropostaPersistence;

	@Reference
	protected AdministradorJudicialPersistence administradorJudicialPersistence;

	@Reference
	protected AdvogadoPersistence advogadoPersistence;

	@Reference
	protected AnexosOutrosPersistence anexosOutrosPersistence;

	@Reference
	protected BemDireitoAdicionalPersistence bemDireitoAdicionalPersistence;

	@Reference
	protected BensDireitosLaudoPersistence bensDireitosLaudoPersistence;

	@Reference
	protected BensDireitosRequerentePersistence
		bensDireitosRequerentePersistence;

	@Reference
	protected ComprovanteHonorarioPersistence comprovanteHonorarioPersistence;

	@Reference
	protected ConcessaoDfPersistence concessaoDfPersistence;

	@Reference
	protected CreditoTransacionadoPersistence creditoTransacionadoPersistence;

	@Reference
	protected CredorPropostaPersistence credorPropostaPersistence;

	protected DadosContribuinteLocalService dadosContribuinteLocalService;

	@Reference
	protected DadosContribuintePersistence dadosContribuintePersistence;

	@Reference
	protected DadosRegistroPersistence dadosRegistroPersistence;

	@Reference
	protected DeclaracaoPersistence declaracaoPersistence;

	@Reference
	protected DemonstracaoContabilPersistence demonstracaoContabilPersistence;

	@Reference
	protected DemonstracaoDocumentosPersistence
		demonstracaoDocumentosPersistence;

	@Reference
	protected DocumentoComprobatorioPersistence
		documentoComprobatorioPersistence;

	@Reference
	protected EditalPersistence editalPersistence;

	@Reference
	protected EncargoPersistence encargoPersistence;

	@Reference
	protected EnderecoPersistence enderecoPersistence;

	@Reference
	protected FundamentacaoPedidoPersistence fundamentacaoPedidoPersistence;

	@Reference
	protected GarantiaPersistence garantiaPersistence;

	@Reference
	protected GarantiaPropostaPersistence garantiaPropostaPersistence;

	@Reference
	protected IdentificacaoDebitosPersistence identificacaoDebitosPersistence;

	@Reference
	protected ParcelamentoPersistence parcelamentoPersistence;

	@Reference
	protected ProcuracaoPersistence procuracaoPersistence;

	@Reference
	protected PropostaPersistence propostaPersistence;

	@Reference
	protected QualificacaoCompletaPersistence qualificacaoCompletaPersistence;

	@Reference
	protected QualificacaoContribuintePersistence
		qualificacaoContribuintePersistence;

	@Reference
	protected RelacaoCredorPersistence relacaoCredorPersistence;

	@Reference
	protected TermoAssinadoPersistence termoAssinadoPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	private static final Log _log = LogFactoryUtil.getLog(
		DadosContribuinteLocalServiceBaseImpl.class);

}