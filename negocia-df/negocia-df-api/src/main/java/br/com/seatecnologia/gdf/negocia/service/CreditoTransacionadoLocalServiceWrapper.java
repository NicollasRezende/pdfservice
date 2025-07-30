/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreditoTransacionadoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreditoTransacionadoLocalService
 * @generated
 */
public class CreditoTransacionadoLocalServiceWrapper
	implements CreditoTransacionadoLocalService,
			   ServiceWrapper<CreditoTransacionadoLocalService> {

	public CreditoTransacionadoLocalServiceWrapper() {
		this(null);
	}

	public CreditoTransacionadoLocalServiceWrapper(
		CreditoTransacionadoLocalService creditoTransacionadoLocalService) {

		_creditoTransacionadoLocalService = creditoTransacionadoLocalService;
	}

	/**
	 * Adds the credito transacionado to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreditoTransacionadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creditoTransacionado the credito transacionado
	 * @return the credito transacionado that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado
		addCreditoTransacionado(
			br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado
				creditoTransacionado) {

		return _creditoTransacionadoLocalService.addCreditoTransacionado(
			creditoTransacionado);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado
		addCreditoTransacionado(
			long creditoId, long propostaId, String numeroInscricao,
			String codigoReceita, java.util.Date dataInscricao,
			double valorAtualizado) {

		return _creditoTransacionadoLocalService.addCreditoTransacionado(
			creditoId, propostaId, numeroInscricao, codigoReceita,
			dataInscricao, valorAtualizado);
	}

	/**
	 * Creates a new credito transacionado with the primary key. Does not add the credito transacionado to the database.
	 *
	 * @param creditoId the primary key for the new credito transacionado
	 * @return the new credito transacionado
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado
		createCreditoTransacionado(long creditoId) {

		return _creditoTransacionadoLocalService.createCreditoTransacionado(
			creditoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creditoTransacionadoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the credito transacionado from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreditoTransacionadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creditoTransacionado the credito transacionado
	 * @return the credito transacionado that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado
		deleteCreditoTransacionado(
			br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado
				creditoTransacionado) {

		return _creditoTransacionadoLocalService.deleteCreditoTransacionado(
			creditoTransacionado);
	}

	/**
	 * Deletes the credito transacionado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreditoTransacionadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creditoId the primary key of the credito transacionado
	 * @return the credito transacionado that was removed
	 * @throws PortalException if a credito transacionado with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado
			deleteCreditoTransacionado(long creditoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creditoTransacionadoLocalService.deleteCreditoTransacionado(
			creditoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creditoTransacionadoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creditoTransacionadoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creditoTransacionadoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creditoTransacionadoLocalService.dynamicQuery();
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

		return _creditoTransacionadoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.CreditoTransacionadoModelImpl</code>.
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

		return _creditoTransacionadoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.CreditoTransacionadoModelImpl</code>.
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

		return _creditoTransacionadoLocalService.dynamicQuery(
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

		return _creditoTransacionadoLocalService.dynamicQueryCount(
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

		return _creditoTransacionadoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado
		fetchCreditoTransacionado(long creditoId) {

		return _creditoTransacionadoLocalService.fetchCreditoTransacionado(
			creditoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creditoTransacionadoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the credito transacionado with the primary key.
	 *
	 * @param creditoId the primary key of the credito transacionado
	 * @return the credito transacionado
	 * @throws PortalException if a credito transacionado with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado
			getCreditoTransacionado(long creditoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creditoTransacionadoLocalService.getCreditoTransacionado(
			creditoId);
	}

	/**
	 * Returns a range of all the credito transacionados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.CreditoTransacionadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credito transacionados
	 * @param end the upper bound of the range of credito transacionados (not inclusive)
	 * @return the range of credito transacionados
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado>
			getCreditoTransacionados(int start, int end) {

		return _creditoTransacionadoLocalService.getCreditoTransacionados(
			start, end);
	}

	/**
	 * Returns the number of credito transacionados.
	 *
	 * @return the number of credito transacionados
	 */
	@Override
	public int getCreditoTransacionadosCount() {
		return _creditoTransacionadoLocalService.
			getCreditoTransacionadosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creditoTransacionadoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creditoTransacionadoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creditoTransacionadoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the credito transacionado in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreditoTransacionadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creditoTransacionado the credito transacionado
	 * @return the credito transacionado that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado
		updateCreditoTransacionado(
			br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado
				creditoTransacionado) {

		return _creditoTransacionadoLocalService.updateCreditoTransacionado(
			creditoTransacionado);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado
			updateCreditoTransacionado(
				long creditoId, long propostaId, String numeroInscricao,
				String codigoReceita, java.util.Date dataInscricao,
				double valorAtualizado)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creditoTransacionadoLocalService.updateCreditoTransacionado(
			creditoId, propostaId, numeroInscricao, codigoReceita,
			dataInscricao, valorAtualizado);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creditoTransacionadoLocalService.getBasePersistence();
	}

	@Override
	public CreditoTransacionadoLocalService getWrappedService() {
		return _creditoTransacionadoLocalService;
	}

	@Override
	public void setWrappedService(
		CreditoTransacionadoLocalService creditoTransacionadoLocalService) {

		_creditoTransacionadoLocalService = creditoTransacionadoLocalService;
	}

	private CreditoTransacionadoLocalService _creditoTransacionadoLocalService;

}