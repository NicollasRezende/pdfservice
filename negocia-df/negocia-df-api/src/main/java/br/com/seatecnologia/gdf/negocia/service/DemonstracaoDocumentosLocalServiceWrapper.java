/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link DemonstracaoDocumentosLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DemonstracaoDocumentosLocalService
 * @generated
 */
public class DemonstracaoDocumentosLocalServiceWrapper
	implements DemonstracaoDocumentosLocalService,
			   ServiceWrapper<DemonstracaoDocumentosLocalService> {

	public DemonstracaoDocumentosLocalServiceWrapper() {
		this(null);
	}

	public DemonstracaoDocumentosLocalServiceWrapper(
		DemonstracaoDocumentosLocalService demonstracaoDocumentosLocalService) {

		_demonstracaoDocumentosLocalService =
			demonstracaoDocumentosLocalService;
	}

	/**
	 * Adds the demonstracao documentos to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemonstracaoDocumentosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demonstracaoDocumentos the demonstracao documentos
	 * @return the demonstracao documentos that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos
		addDemonstracaoDocumentos(
			br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos
				demonstracaoDocumentos) {

		return _demonstracaoDocumentosLocalService.addDemonstracaoDocumentos(
			demonstracaoDocumentos);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos
		addDemonstracaoDocumentos(
			long demonstracaoId, int tipoDocumento, long fileEntryId) {

		return _demonstracaoDocumentosLocalService.addDemonstracaoDocumentos(
			demonstracaoId, tipoDocumento, fileEntryId);
	}

	/**
	 * Creates a new demonstracao documentos with the primary key. Does not add the demonstracao documentos to the database.
	 *
	 * @param demonstracaoDocumentosId the primary key for the new demonstracao documentos
	 * @return the new demonstracao documentos
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos
		createDemonstracaoDocumentos(long demonstracaoDocumentosId) {

		return _demonstracaoDocumentosLocalService.createDemonstracaoDocumentos(
			demonstracaoDocumentosId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demonstracaoDocumentosLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the demonstracao documentos from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemonstracaoDocumentosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demonstracaoDocumentos the demonstracao documentos
	 * @return the demonstracao documentos that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos
		deleteDemonstracaoDocumentos(
			br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos
				demonstracaoDocumentos) {

		return _demonstracaoDocumentosLocalService.deleteDemonstracaoDocumentos(
			demonstracaoDocumentos);
	}

	/**
	 * Deletes the demonstracao documentos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemonstracaoDocumentosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demonstracaoDocumentosId the primary key of the demonstracao documentos
	 * @return the demonstracao documentos that was removed
	 * @throws PortalException if a demonstracao documentos with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos
			deleteDemonstracaoDocumentos(long demonstracaoDocumentosId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demonstracaoDocumentosLocalService.deleteDemonstracaoDocumentos(
			demonstracaoDocumentosId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demonstracaoDocumentosLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _demonstracaoDocumentosLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _demonstracaoDocumentosLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _demonstracaoDocumentosLocalService.dynamicQuery();
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

		return _demonstracaoDocumentosLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DemonstracaoDocumentosModelImpl</code>.
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

		return _demonstracaoDocumentosLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DemonstracaoDocumentosModelImpl</code>.
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

		return _demonstracaoDocumentosLocalService.dynamicQuery(
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

		return _demonstracaoDocumentosLocalService.dynamicQueryCount(
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

		return _demonstracaoDocumentosLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos
		fetchDemonstracaoDocumentos(long demonstracaoDocumentosId) {

		return _demonstracaoDocumentosLocalService.fetchDemonstracaoDocumentos(
			demonstracaoDocumentosId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _demonstracaoDocumentosLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the demonstracao documentos with the primary key.
	 *
	 * @param demonstracaoDocumentosId the primary key of the demonstracao documentos
	 * @return the demonstracao documentos
	 * @throws PortalException if a demonstracao documentos with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos
			getDemonstracaoDocumentos(long demonstracaoDocumentosId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demonstracaoDocumentosLocalService.getDemonstracaoDocumentos(
			demonstracaoDocumentosId);
	}

	/**
	 * Returns a range of all the demonstracao documentoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DemonstracaoDocumentosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demonstracao documentoses
	 * @param end the upper bound of the range of demonstracao documentoses (not inclusive)
	 * @return the range of demonstracao documentoses
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos>
			getDemonstracaoDocumentoses(int start, int end) {

		return _demonstracaoDocumentosLocalService.getDemonstracaoDocumentoses(
			start, end);
	}

	/**
	 * Returns the number of demonstracao documentoses.
	 *
	 * @return the number of demonstracao documentoses
	 */
	@Override
	public int getDemonstracaoDocumentosesCount() {
		return _demonstracaoDocumentosLocalService.
			getDemonstracaoDocumentosesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _demonstracaoDocumentosLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _demonstracaoDocumentosLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demonstracaoDocumentosLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the demonstracao documentos in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemonstracaoDocumentosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demonstracaoDocumentos the demonstracao documentos
	 * @return the demonstracao documentos that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos
		updateDemonstracaoDocumentos(
			br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos
				demonstracaoDocumentos) {

		return _demonstracaoDocumentosLocalService.updateDemonstracaoDocumentos(
			demonstracaoDocumentos);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _demonstracaoDocumentosLocalService.getBasePersistence();
	}

	@Override
	public DemonstracaoDocumentosLocalService getWrappedService() {
		return _demonstracaoDocumentosLocalService;
	}

	@Override
	public void setWrappedService(
		DemonstracaoDocumentosLocalService demonstracaoDocumentosLocalService) {

		_demonstracaoDocumentosLocalService =
			demonstracaoDocumentosLocalService;
	}

	private DemonstracaoDocumentosLocalService
		_demonstracaoDocumentosLocalService;

}