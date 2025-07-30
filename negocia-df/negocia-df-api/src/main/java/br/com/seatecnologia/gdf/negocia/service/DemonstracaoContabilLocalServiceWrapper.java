/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link DemonstracaoContabilLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DemonstracaoContabilLocalService
 * @generated
 */
public class DemonstracaoContabilLocalServiceWrapper
	implements DemonstracaoContabilLocalService,
			   ServiceWrapper<DemonstracaoContabilLocalService> {

	public DemonstracaoContabilLocalServiceWrapper() {
		this(null);
	}

	public DemonstracaoContabilLocalServiceWrapper(
		DemonstracaoContabilLocalService demonstracaoContabilLocalService) {

		_demonstracaoContabilLocalService = demonstracaoContabilLocalService;
	}

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
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil
		addDemonstracaoContabil(
			br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil
				demonstracaoContabil) {

		return _demonstracaoContabilLocalService.addDemonstracaoContabil(
			demonstracaoContabil);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil
		addDemonstracaoContabil(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long propostaId, long fileEntryId, int tipoDocumento) {

		return _demonstracaoContabilLocalService.addDemonstracaoContabil(
			serviceContext, propostaId, fileEntryId, tipoDocumento);
	}

	/**
	 * Creates a new demonstracao contabil with the primary key. Does not add the demonstracao contabil to the database.
	 *
	 * @param demonstracaoId the primary key for the new demonstracao contabil
	 * @return the new demonstracao contabil
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil
		createDemonstracaoContabil(long demonstracaoId) {

		return _demonstracaoContabilLocalService.createDemonstracaoContabil(
			demonstracaoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demonstracaoContabilLocalService.createPersistedModel(
			primaryKeyObj);
	}

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
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil
		deleteDemonstracaoContabil(
			br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil
				demonstracaoContabil) {

		return _demonstracaoContabilLocalService.deleteDemonstracaoContabil(
			demonstracaoContabil);
	}

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
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil
			deleteDemonstracaoContabil(long demonstracaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demonstracaoContabilLocalService.deleteDemonstracaoContabil(
			demonstracaoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demonstracaoContabilLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _demonstracaoContabilLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _demonstracaoContabilLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _demonstracaoContabilLocalService.dynamicQuery();
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

		return _demonstracaoContabilLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _demonstracaoContabilLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _demonstracaoContabilLocalService.dynamicQuery(
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

		return _demonstracaoContabilLocalService.dynamicQueryCount(
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

		return _demonstracaoContabilLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil
		fetchDemonstracaoContabil(long demonstracaoId) {

		return _demonstracaoContabilLocalService.fetchDemonstracaoContabil(
			demonstracaoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _demonstracaoContabilLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the demonstracao contabil with the primary key.
	 *
	 * @param demonstracaoId the primary key of the demonstracao contabil
	 * @return the demonstracao contabil
	 * @throws PortalException if a demonstracao contabil with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil
			getDemonstracaoContabil(long demonstracaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demonstracaoContabilLocalService.getDemonstracaoContabil(
			demonstracaoId);
	}

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
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil>
			getDemonstracaoContabils(int start, int end) {

		return _demonstracaoContabilLocalService.getDemonstracaoContabils(
			start, end);
	}

	/**
	 * Returns the number of demonstracao contabils.
	 *
	 * @return the number of demonstracao contabils
	 */
	@Override
	public int getDemonstracaoContabilsCount() {
		return _demonstracaoContabilLocalService.
			getDemonstracaoContabilsCount();
	}

	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil>
			getDemonstracoesContabilByPropostaId(long propostaId) {

		return _demonstracaoContabilLocalService.
			getDemonstracoesContabilByPropostaId(propostaId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _demonstracaoContabilLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _demonstracaoContabilLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demonstracaoContabilLocalService.getPersistedModel(
			primaryKeyObj);
	}

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
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil
		updateDemonstracaoContabil(
			br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil
				demonstracaoContabil) {

		return _demonstracaoContabilLocalService.updateDemonstracaoContabil(
			demonstracaoContabil);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil
			updateDemonstracaoContabil(
				long demonstracaoId, long propostaId, String tipoDemonstracao,
				long fileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demonstracaoContabilLocalService.updateDemonstracaoContabil(
			demonstracaoId, propostaId, tipoDemonstracao, fileEntryId);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _demonstracaoContabilLocalService.getBasePersistence();
	}

	@Override
	public DemonstracaoContabilLocalService getWrappedService() {
		return _demonstracaoContabilLocalService;
	}

	@Override
	public void setWrappedService(
		DemonstracaoContabilLocalService demonstracaoContabilLocalService) {

		_demonstracaoContabilLocalService = demonstracaoContabilLocalService;
	}

	private DemonstracaoContabilLocalService _demonstracaoContabilLocalService;

}