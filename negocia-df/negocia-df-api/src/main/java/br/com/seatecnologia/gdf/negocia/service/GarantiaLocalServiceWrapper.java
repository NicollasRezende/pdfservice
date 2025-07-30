/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link GarantiaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see GarantiaLocalService
 * @generated
 */
public class GarantiaLocalServiceWrapper
	implements GarantiaLocalService, ServiceWrapper<GarantiaLocalService> {

	public GarantiaLocalServiceWrapper() {
		this(null);
	}

	public GarantiaLocalServiceWrapper(
		GarantiaLocalService garantiaLocalService) {

		_garantiaLocalService = garantiaLocalService;
	}

	/**
	 * Adds the garantia to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GarantiaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param garantia the garantia
	 * @return the garantia that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Garantia addGarantia(
		br.com.seatecnologia.gdf.negocia.model.Garantia garantia) {

		return _garantiaLocalService.addGarantia(garantia);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Garantia addGarantia(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		String tipoGarantia, String tipoDevedor, String outras,
		long proprietarioQualificacaoId, double valorEstimado,
		long dadosRegistroId, String localizacao, boolean declaracaoAnuencia,
		long declaracao, String descricaoBem, long propostaId) {

		return _garantiaLocalService.addGarantia(
			serviceContext, tipoGarantia, tipoDevedor, outras,
			proprietarioQualificacaoId, valorEstimado, dadosRegistroId,
			localizacao, declaracaoAnuencia, declaracao, descricaoBem,
			propostaId);
	}

	/**
	 * Creates a new garantia with the primary key. Does not add the garantia to the database.
	 *
	 * @param garantiaId the primary key for the new garantia
	 * @return the new garantia
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Garantia createGarantia(
		long garantiaId) {

		return _garantiaLocalService.createGarantia(garantiaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _garantiaLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the garantia from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GarantiaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param garantia the garantia
	 * @return the garantia that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Garantia deleteGarantia(
		br.com.seatecnologia.gdf.negocia.model.Garantia garantia) {

		return _garantiaLocalService.deleteGarantia(garantia);
	}

	/**
	 * Deletes the garantia with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GarantiaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param garantiaId the primary key of the garantia
	 * @return the garantia that was removed
	 * @throws PortalException if a garantia with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Garantia deleteGarantia(
			long garantiaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _garantiaLocalService.deleteGarantia(garantiaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _garantiaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _garantiaLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _garantiaLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _garantiaLocalService.dynamicQuery();
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

		return _garantiaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.GarantiaModelImpl</code>.
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

		return _garantiaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.GarantiaModelImpl</code>.
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

		return _garantiaLocalService.dynamicQuery(
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

		return _garantiaLocalService.dynamicQueryCount(dynamicQuery);
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

		return _garantiaLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Garantia fetchGarantia(
		long garantiaId) {

		return _garantiaLocalService.fetchGarantia(garantiaId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _garantiaLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the garantia with the primary key.
	 *
	 * @param garantiaId the primary key of the garantia
	 * @return the garantia
	 * @throws PortalException if a garantia with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Garantia getGarantia(
			long garantiaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _garantiaLocalService.getGarantia(garantiaId);
	}

	/**
	 * Returns a range of all the garantias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.GarantiaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of garantias
	 * @param end the upper bound of the range of garantias (not inclusive)
	 * @return the range of garantias
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Garantia>
		getGarantias(int start, int end) {

		return _garantiaLocalService.getGarantias(start, end);
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Garantia>
		getGarantiasByPropostaId(long propostaId) {

		return _garantiaLocalService.getGarantiasByPropostaId(propostaId);
	}

	/**
	 * Returns the number of garantias.
	 *
	 * @return the number of garantias
	 */
	@Override
	public int getGarantiasCount() {
		return _garantiaLocalService.getGarantiasCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _garantiaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _garantiaLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _garantiaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the garantia in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GarantiaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param garantia the garantia
	 * @return the garantia that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Garantia updateGarantia(
		br.com.seatecnologia.gdf.negocia.model.Garantia garantia) {

		return _garantiaLocalService.updateGarantia(garantia);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Garantia updateGarantia(
			long garantiaId, long propostaId, String tipoGarantia,
			String descricaoBem, String proprietario, double valorEstimado,
			String dadosRegistro, String localizacao, boolean anuenciaTerceiro,
			long documentoAnuencia)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _garantiaLocalService.updateGarantia(
			garantiaId, propostaId, tipoGarantia, descricaoBem, proprietario,
			valorEstimado, dadosRegistro, localizacao, anuenciaTerceiro,
			documentoAnuencia);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _garantiaLocalService.getBasePersistence();
	}

	@Override
	public GarantiaLocalService getWrappedService() {
		return _garantiaLocalService;
	}

	@Override
	public void setWrappedService(GarantiaLocalService garantiaLocalService) {
		_garantiaLocalService = garantiaLocalService;
	}

	private GarantiaLocalService _garantiaLocalService;

}