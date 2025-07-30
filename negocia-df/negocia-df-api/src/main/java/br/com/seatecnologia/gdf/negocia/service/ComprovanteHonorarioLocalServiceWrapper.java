/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ComprovanteHonorarioLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ComprovanteHonorarioLocalService
 * @generated
 */
public class ComprovanteHonorarioLocalServiceWrapper
	implements ComprovanteHonorarioLocalService,
			   ServiceWrapper<ComprovanteHonorarioLocalService> {

	public ComprovanteHonorarioLocalServiceWrapper() {
		this(null);
	}

	public ComprovanteHonorarioLocalServiceWrapper(
		ComprovanteHonorarioLocalService comprovanteHonorarioLocalService) {

		_comprovanteHonorarioLocalService = comprovanteHonorarioLocalService;
	}

	/**
	 * Adds the comprovante honorario to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ComprovanteHonorarioLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param comprovanteHonorario the comprovante honorario
	 * @return the comprovante honorario that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario
		addComprovanteHonorario(
			br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario
				comprovanteHonorario) {

		return _comprovanteHonorarioLocalService.addComprovanteHonorario(
			comprovanteHonorario);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario
		addComprovanteHonorario(
			long comprovanteId, long propostaId, double valorPago,
			java.util.Date dataPagamento, long fileEntryId) {

		return _comprovanteHonorarioLocalService.addComprovanteHonorario(
			comprovanteId, propostaId, valorPago, dataPagamento, fileEntryId);
	}

	/**
	 * Creates a new comprovante honorario with the primary key. Does not add the comprovante honorario to the database.
	 *
	 * @param comprovanteId the primary key for the new comprovante honorario
	 * @return the new comprovante honorario
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario
		createComprovanteHonorario(long comprovanteId) {

		return _comprovanteHonorarioLocalService.createComprovanteHonorario(
			comprovanteId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _comprovanteHonorarioLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the comprovante honorario from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ComprovanteHonorarioLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param comprovanteHonorario the comprovante honorario
	 * @return the comprovante honorario that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario
		deleteComprovanteHonorario(
			br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario
				comprovanteHonorario) {

		return _comprovanteHonorarioLocalService.deleteComprovanteHonorario(
			comprovanteHonorario);
	}

	/**
	 * Deletes the comprovante honorario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ComprovanteHonorarioLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param comprovanteId the primary key of the comprovante honorario
	 * @return the comprovante honorario that was removed
	 * @throws PortalException if a comprovante honorario with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario
			deleteComprovanteHonorario(long comprovanteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _comprovanteHonorarioLocalService.deleteComprovanteHonorario(
			comprovanteId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _comprovanteHonorarioLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _comprovanteHonorarioLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _comprovanteHonorarioLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _comprovanteHonorarioLocalService.dynamicQuery();
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

		return _comprovanteHonorarioLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ComprovanteHonorarioModelImpl</code>.
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

		return _comprovanteHonorarioLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ComprovanteHonorarioModelImpl</code>.
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

		return _comprovanteHonorarioLocalService.dynamicQuery(
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

		return _comprovanteHonorarioLocalService.dynamicQueryCount(
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

		return _comprovanteHonorarioLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario
		fetchComprovanteHonorario(long comprovanteId) {

		return _comprovanteHonorarioLocalService.fetchComprovanteHonorario(
			comprovanteId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _comprovanteHonorarioLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the comprovante honorario with the primary key.
	 *
	 * @param comprovanteId the primary key of the comprovante honorario
	 * @return the comprovante honorario
	 * @throws PortalException if a comprovante honorario with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario
			getComprovanteHonorario(long comprovanteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _comprovanteHonorarioLocalService.getComprovanteHonorario(
			comprovanteId);
	}

	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario>
			getComprovanteHonorarioByPropostaId(long propostaId) {

		return _comprovanteHonorarioLocalService.
			getComprovanteHonorarioByPropostaId(propostaId);
	}

	/**
	 * Returns a range of all the comprovante honorarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ComprovanteHonorarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of comprovante honorarios
	 * @param end the upper bound of the range of comprovante honorarios (not inclusive)
	 * @return the range of comprovante honorarios
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario>
			getComprovanteHonorarios(int start, int end) {

		return _comprovanteHonorarioLocalService.getComprovanteHonorarios(
			start, end);
	}

	/**
	 * Returns the number of comprovante honorarios.
	 *
	 * @return the number of comprovante honorarios
	 */
	@Override
	public int getComprovanteHonorariosCount() {
		return _comprovanteHonorarioLocalService.
			getComprovanteHonorariosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _comprovanteHonorarioLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _comprovanteHonorarioLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _comprovanteHonorarioLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the comprovante honorario in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ComprovanteHonorarioLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param comprovanteHonorario the comprovante honorario
	 * @return the comprovante honorario that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario
		updateComprovanteHonorario(
			br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario
				comprovanteHonorario) {

		return _comprovanteHonorarioLocalService.updateComprovanteHonorario(
			comprovanteHonorario);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario
			updateComprovanteHonorario(
				long comprovanteId, long propostaId, double valorPago,
				java.util.Date dataPagamento, long fileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _comprovanteHonorarioLocalService.updateComprovanteHonorario(
			comprovanteId, propostaId, valorPago, dataPagamento, fileEntryId);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _comprovanteHonorarioLocalService.getBasePersistence();
	}

	@Override
	public ComprovanteHonorarioLocalService getWrappedService() {
		return _comprovanteHonorarioLocalService;
	}

	@Override
	public void setWrappedService(
		ComprovanteHonorarioLocalService comprovanteHonorarioLocalService) {

		_comprovanteHonorarioLocalService = comprovanteHonorarioLocalService;
	}

	private ComprovanteHonorarioLocalService _comprovanteHonorarioLocalService;

}