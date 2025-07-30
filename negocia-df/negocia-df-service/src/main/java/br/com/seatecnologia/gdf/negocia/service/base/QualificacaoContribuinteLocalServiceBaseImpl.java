/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.base;

import br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte;
import br.com.seatecnologia.gdf.negocia.service.QualificacaoContribuinteLocalService;
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
 * Provides the base implementation for the qualificacao contribuinte local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link br.com.seatecnologia.gdf.negocia.service.impl.QualificacaoContribuinteLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see br.com.seatecnologia.gdf.negocia.service.impl.QualificacaoContribuinteLocalServiceImpl
 * @generated
 */
public abstract class QualificacaoContribuinteLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   QualificacaoContribuinteLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>QualificacaoContribuinteLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>br.com.seatecnologia.gdf.negocia.service.QualificacaoContribuinteLocalServiceUtil</code>.
	 */

	/**
	 * Adds the qualificacao contribuinte to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualificacaoContribuinteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualificacaoContribuinte the qualificacao contribuinte
	 * @return the qualificacao contribuinte that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public QualificacaoContribuinte addQualificacaoContribuinte(
		QualificacaoContribuinte qualificacaoContribuinte) {

		qualificacaoContribuinte.setNew(true);

		return qualificacaoContribuintePersistence.update(
			qualificacaoContribuinte);
	}

	/**
	 * Creates a new qualificacao contribuinte with the primary key. Does not add the qualificacao contribuinte to the database.
	 *
	 * @param qualificacaoContribuinteId the primary key for the new qualificacao contribuinte
	 * @return the new qualificacao contribuinte
	 */
	@Override
	@Transactional(enabled = false)
	public QualificacaoContribuinte createQualificacaoContribuinte(
		long qualificacaoContribuinteId) {

		return qualificacaoContribuintePersistence.create(
			qualificacaoContribuinteId);
	}

	/**
	 * Deletes the qualificacao contribuinte with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualificacaoContribuinteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualificacaoContribuinteId the primary key of the qualificacao contribuinte
	 * @return the qualificacao contribuinte that was removed
	 * @throws PortalException if a qualificacao contribuinte with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public QualificacaoContribuinte deleteQualificacaoContribuinte(
			long qualificacaoContribuinteId)
		throws PortalException {

		return qualificacaoContribuintePersistence.remove(
			qualificacaoContribuinteId);
	}

	/**
	 * Deletes the qualificacao contribuinte from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualificacaoContribuinteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualificacaoContribuinte the qualificacao contribuinte
	 * @return the qualificacao contribuinte that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public QualificacaoContribuinte deleteQualificacaoContribuinte(
		QualificacaoContribuinte qualificacaoContribuinte) {

		return qualificacaoContribuintePersistence.remove(
			qualificacaoContribuinte);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return qualificacaoContribuintePersistence.dslQuery(dslQuery);
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
			QualificacaoContribuinte.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return qualificacaoContribuintePersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.QualificacaoContribuinteModelImpl</code>.
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

		return qualificacaoContribuintePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.QualificacaoContribuinteModelImpl</code>.
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

		return qualificacaoContribuintePersistence.findWithDynamicQuery(
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
		return qualificacaoContribuintePersistence.countWithDynamicQuery(
			dynamicQuery);
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

		return qualificacaoContribuintePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public QualificacaoContribuinte fetchQualificacaoContribuinte(
		long qualificacaoContribuinteId) {

		return qualificacaoContribuintePersistence.fetchByPrimaryKey(
			qualificacaoContribuinteId);
	}

	/**
	 * Returns the qualificacao contribuinte matching the UUID and group.
	 *
	 * @param uuid the qualificacao contribuinte's UUID
	 * @param groupId the primary key of the group
	 * @return the matching qualificacao contribuinte, or <code>null</code> if a matching qualificacao contribuinte could not be found
	 */
	@Override
	public QualificacaoContribuinte
		fetchQualificacaoContribuinteByUuidAndGroupId(
			String uuid, long groupId) {

		return qualificacaoContribuintePersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the qualificacao contribuinte with the primary key.
	 *
	 * @param qualificacaoContribuinteId the primary key of the qualificacao contribuinte
	 * @return the qualificacao contribuinte
	 * @throws PortalException if a qualificacao contribuinte with the primary key could not be found
	 */
	@Override
	public QualificacaoContribuinte getQualificacaoContribuinte(
			long qualificacaoContribuinteId)
		throws PortalException {

		return qualificacaoContribuintePersistence.findByPrimaryKey(
			qualificacaoContribuinteId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			qualificacaoContribuinteLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(QualificacaoContribuinte.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"qualificacaoContribuinteId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			qualificacaoContribuinteLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			QualificacaoContribuinte.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"qualificacaoContribuinteId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			qualificacaoContribuinteLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(QualificacaoContribuinte.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"qualificacaoContribuinteId");
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
				<QualificacaoContribuinte>() {

				@Override
				public void performAction(
						QualificacaoContribuinte qualificacaoContribuinte)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, qualificacaoContribuinte);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(
					QualificacaoContribuinte.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return qualificacaoContribuintePersistence.create(
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
				"Implement QualificacaoContribuinteLocalServiceImpl#deleteQualificacaoContribuinte(QualificacaoContribuinte) to avoid orphaned data");
		}

		return qualificacaoContribuinteLocalService.
			deleteQualificacaoContribuinte(
				(QualificacaoContribuinte)persistedModel);
	}

	@Override
	public BasePersistence<QualificacaoContribuinte> getBasePersistence() {
		return qualificacaoContribuintePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return qualificacaoContribuintePersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns all the qualificacao contribuintes matching the UUID and company.
	 *
	 * @param uuid the UUID of the qualificacao contribuintes
	 * @param companyId the primary key of the company
	 * @return the matching qualificacao contribuintes, or an empty list if no matches were found
	 */
	@Override
	public List<QualificacaoContribuinte>
		getQualificacaoContribuintesByUuidAndCompanyId(
			String uuid, long companyId) {

		return qualificacaoContribuintePersistence.findByUuid_C(
			uuid, companyId);
	}

	/**
	 * Returns a range of qualificacao contribuintes matching the UUID and company.
	 *
	 * @param uuid the UUID of the qualificacao contribuintes
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of qualificacao contribuintes
	 * @param end the upper bound of the range of qualificacao contribuintes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching qualificacao contribuintes, or an empty list if no matches were found
	 */
	@Override
	public List<QualificacaoContribuinte>
		getQualificacaoContribuintesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<QualificacaoContribuinte> orderByComparator) {

		return qualificacaoContribuintePersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the qualificacao contribuinte matching the UUID and group.
	 *
	 * @param uuid the qualificacao contribuinte's UUID
	 * @param groupId the primary key of the group
	 * @return the matching qualificacao contribuinte
	 * @throws PortalException if a matching qualificacao contribuinte could not be found
	 */
	@Override
	public QualificacaoContribuinte getQualificacaoContribuinteByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return qualificacaoContribuintePersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the qualificacao contribuintes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.QualificacaoContribuinteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualificacao contribuintes
	 * @param end the upper bound of the range of qualificacao contribuintes (not inclusive)
	 * @return the range of qualificacao contribuintes
	 */
	@Override
	public List<QualificacaoContribuinte> getQualificacaoContribuintes(
		int start, int end) {

		return qualificacaoContribuintePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of qualificacao contribuintes.
	 *
	 * @return the number of qualificacao contribuintes
	 */
	@Override
	public int getQualificacaoContribuintesCount() {
		return qualificacaoContribuintePersistence.countAll();
	}

	/**
	 * Updates the qualificacao contribuinte in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualificacaoContribuinteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualificacaoContribuinte the qualificacao contribuinte
	 * @return the qualificacao contribuinte that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public QualificacaoContribuinte updateQualificacaoContribuinte(
		QualificacaoContribuinte qualificacaoContribuinte) {

		return qualificacaoContribuintePersistence.update(
			qualificacaoContribuinte);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			QualificacaoContribuinteLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		qualificacaoContribuinteLocalService =
			(QualificacaoContribuinteLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return QualificacaoContribuinteLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return QualificacaoContribuinte.class;
	}

	protected String getModelClassName() {
		return QualificacaoContribuinte.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		DataSource dataSource =
			qualificacaoContribuintePersistence.getDataSource();

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

	protected QualificacaoContribuinteLocalService
		qualificacaoContribuinteLocalService;

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
		QualificacaoContribuinteLocalServiceBaseImpl.class);

}