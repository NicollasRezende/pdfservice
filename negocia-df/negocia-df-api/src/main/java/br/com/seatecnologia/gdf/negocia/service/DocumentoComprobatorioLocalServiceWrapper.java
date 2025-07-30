/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link DocumentoComprobatorioLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DocumentoComprobatorioLocalService
 * @generated
 */
public class DocumentoComprobatorioLocalServiceWrapper
	implements DocumentoComprobatorioLocalService,
			   ServiceWrapper<DocumentoComprobatorioLocalService> {

	public DocumentoComprobatorioLocalServiceWrapper() {
		this(null);
	}

	public DocumentoComprobatorioLocalServiceWrapper(
		DocumentoComprobatorioLocalService documentoComprobatorioLocalService) {

		_documentoComprobatorioLocalService =
			documentoComprobatorioLocalService;
	}

	/**
	 * Adds the documento comprobatorio to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DocumentoComprobatorioLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param documentoComprobatorio the documento comprobatorio
	 * @return the documento comprobatorio that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio
		addDocumentoComprobatorio(
			br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio
				documentoComprobatorio) {

		return _documentoComprobatorioLocalService.addDocumentoComprobatorio(
			documentoComprobatorio);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio
		addDocumentoComprobatorio(long fileEntryId, long fundamentacaoId) {

		return _documentoComprobatorioLocalService.addDocumentoComprobatorio(
			fileEntryId, fundamentacaoId);
	}

	/**
	 * Creates a new documento comprobatorio with the primary key. Does not add the documento comprobatorio to the database.
	 *
	 * @param documentoId the primary key for the new documento comprobatorio
	 * @return the new documento comprobatorio
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio
		createDocumentoComprobatorio(long documentoId) {

		return _documentoComprobatorioLocalService.createDocumentoComprobatorio(
			documentoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentoComprobatorioLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the documento comprobatorio from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DocumentoComprobatorioLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param documentoComprobatorio the documento comprobatorio
	 * @return the documento comprobatorio that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio
		deleteDocumentoComprobatorio(
			br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio
				documentoComprobatorio) {

		return _documentoComprobatorioLocalService.deleteDocumentoComprobatorio(
			documentoComprobatorio);
	}

	/**
	 * Deletes the documento comprobatorio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DocumentoComprobatorioLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param documentoId the primary key of the documento comprobatorio
	 * @return the documento comprobatorio that was removed
	 * @throws PortalException if a documento comprobatorio with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio
			deleteDocumentoComprobatorio(long documentoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentoComprobatorioLocalService.deleteDocumentoComprobatorio(
			documentoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentoComprobatorioLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _documentoComprobatorioLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _documentoComprobatorioLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _documentoComprobatorioLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _documentoComprobatorioLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _documentoComprobatorioLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _documentoComprobatorioLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _documentoComprobatorioLocalService.dynamicQueryCount(
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
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _documentoComprobatorioLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio
		fetchDocumentoComprobatorio(long documentoId) {

		return _documentoComprobatorioLocalService.fetchDocumentoComprobatorio(
			documentoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _documentoComprobatorioLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the documento comprobatorio with the primary key.
	 *
	 * @param documentoId the primary key of the documento comprobatorio
	 * @return the documento comprobatorio
	 * @throws PortalException if a documento comprobatorio with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio
			getDocumentoComprobatorio(long documentoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentoComprobatorioLocalService.getDocumentoComprobatorio(
			documentoId);
	}

	/**
	 * Returns a range of all the documento comprobatorios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DocumentoComprobatorioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of documento comprobatorios
	 * @param end the upper bound of the range of documento comprobatorios (not inclusive)
	 * @return the range of documento comprobatorios
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio>
			getDocumentoComprobatorios(int start, int end) {

		return _documentoComprobatorioLocalService.getDocumentoComprobatorios(
			start, end);
	}

	/**
	 * Returns the number of documento comprobatorios.
	 *
	 * @return the number of documento comprobatorios
	 */
	@Override
	public int getDocumentoComprobatoriosCount() {
		return _documentoComprobatorioLocalService.
			getDocumentoComprobatoriosCount();
	}

	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio>
			getDocumentosComprobatoriosByFundamentacaoId(long fundamentacaoId) {

		return _documentoComprobatorioLocalService.
			getDocumentosComprobatoriosByFundamentacaoId(fundamentacaoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _documentoComprobatorioLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _documentoComprobatorioLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentoComprobatorioLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the documento comprobatorio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DocumentoComprobatorioLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param documentoComprobatorio the documento comprobatorio
	 * @return the documento comprobatorio that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio
		updateDocumentoComprobatorio(
			br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio
				documentoComprobatorio) {

		return _documentoComprobatorioLocalService.updateDocumentoComprobatorio(
			documentoComprobatorio);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio
			updateDocumentoComprobatorio(
				long documentoId, long propostaId, String tipoDocumento,
				long fileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentoComprobatorioLocalService.updateDocumentoComprobatorio(
			documentoId, propostaId, tipoDocumento, fileEntryId);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _documentoComprobatorioLocalService.getBasePersistence();
	}

	@Override
	public DocumentoComprobatorioLocalService getWrappedService() {
		return _documentoComprobatorioLocalService;
	}

	@Override
	public void setWrappedService(
		DocumentoComprobatorioLocalService documentoComprobatorioLocalService) {

		_documentoComprobatorioLocalService =
			documentoComprobatorioLocalService;
	}

	private DocumentoComprobatorioLocalService
		_documentoComprobatorioLocalService;

}