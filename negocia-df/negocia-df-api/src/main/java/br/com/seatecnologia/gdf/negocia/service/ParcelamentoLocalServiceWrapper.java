/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ParcelamentoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ParcelamentoLocalService
 * @generated
 */
public class ParcelamentoLocalServiceWrapper
	implements ParcelamentoLocalService,
			   ServiceWrapper<ParcelamentoLocalService> {

	public ParcelamentoLocalServiceWrapper() {
		this(null);
	}

	public ParcelamentoLocalServiceWrapper(
		ParcelamentoLocalService parcelamentoLocalService) {

		_parcelamentoLocalService = parcelamentoLocalService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Parcelamento addParcelamento(
		long parcelamentoId, long propostaId, int numeroParcelas,
		double valorEntrada, java.util.Date dataPrimeiraParcela,
		double valorPrimeiraParcela) {

		return _parcelamentoLocalService.addParcelamento(
			parcelamentoId, propostaId, numeroParcelas, valorEntrada,
			dataPrimeiraParcela, valorPrimeiraParcela);
	}

	/**
	 * Adds the parcelamento to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParcelamentoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param parcelamento the parcelamento
	 * @return the parcelamento that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Parcelamento addParcelamento(
		br.com.seatecnologia.gdf.negocia.model.Parcelamento parcelamento) {

		return _parcelamentoLocalService.addParcelamento(parcelamento);
	}

	/**
	 * Creates a new parcelamento with the primary key. Does not add the parcelamento to the database.
	 *
	 * @param parcelamentoId the primary key for the new parcelamento
	 * @return the new parcelamento
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Parcelamento
		createParcelamento(long parcelamentoId) {

		return _parcelamentoLocalService.createParcelamento(parcelamentoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _parcelamentoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the parcelamento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParcelamentoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param parcelamentoId the primary key of the parcelamento
	 * @return the parcelamento that was removed
	 * @throws PortalException if a parcelamento with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Parcelamento
			deleteParcelamento(long parcelamentoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _parcelamentoLocalService.deleteParcelamento(parcelamentoId);
	}

	/**
	 * Deletes the parcelamento from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParcelamentoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param parcelamento the parcelamento
	 * @return the parcelamento that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Parcelamento
		deleteParcelamento(
			br.com.seatecnologia.gdf.negocia.model.Parcelamento parcelamento) {

		return _parcelamentoLocalService.deleteParcelamento(parcelamento);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _parcelamentoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _parcelamentoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _parcelamentoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _parcelamentoLocalService.dynamicQuery();
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

		return _parcelamentoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ParcelamentoModelImpl</code>.
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

		return _parcelamentoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ParcelamentoModelImpl</code>.
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

		return _parcelamentoLocalService.dynamicQuery(
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

		return _parcelamentoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _parcelamentoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Parcelamento
		fetchParcelamento(long parcelamentoId) {

		return _parcelamentoLocalService.fetchParcelamento(parcelamentoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _parcelamentoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _parcelamentoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _parcelamentoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the parcelamento with the primary key.
	 *
	 * @param parcelamentoId the primary key of the parcelamento
	 * @return the parcelamento
	 * @throws PortalException if a parcelamento with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Parcelamento getParcelamento(
			long parcelamentoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _parcelamentoLocalService.getParcelamento(parcelamentoId);
	}

	/**
	 * Returns a range of all the parcelamentos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ParcelamentoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of parcelamentos
	 * @param end the upper bound of the range of parcelamentos (not inclusive)
	 * @return the range of parcelamentos
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Parcelamento>
		getParcelamentos(int start, int end) {

		return _parcelamentoLocalService.getParcelamentos(start, end);
	}

	/**
	 * Returns the number of parcelamentos.
	 *
	 * @return the number of parcelamentos
	 */
	@Override
	public int getParcelamentosCount() {
		return _parcelamentoLocalService.getParcelamentosCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _parcelamentoLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Parcelamento
			updateParcelamento(
				long parcelamentoId, long propostaId, int numeroParcelas,
				double valorEntrada, java.util.Date dataPrimeiraParcela,
				double valorPrimeiraParcela)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _parcelamentoLocalService.updateParcelamento(
			parcelamentoId, propostaId, numeroParcelas, valorEntrada,
			dataPrimeiraParcela, valorPrimeiraParcela);
	}

	/**
	 * Updates the parcelamento in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParcelamentoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param parcelamento the parcelamento
	 * @return the parcelamento that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Parcelamento
		updateParcelamento(
			br.com.seatecnologia.gdf.negocia.model.Parcelamento parcelamento) {

		return _parcelamentoLocalService.updateParcelamento(parcelamento);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _parcelamentoLocalService.getBasePersistence();
	}

	@Override
	public ParcelamentoLocalService getWrappedService() {
		return _parcelamentoLocalService;
	}

	@Override
	public void setWrappedService(
		ParcelamentoLocalService parcelamentoLocalService) {

		_parcelamentoLocalService = parcelamentoLocalService;
	}

	private ParcelamentoLocalService _parcelamentoLocalService;

}