/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link BensDireitosRequerenteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BensDireitosRequerenteLocalService
 * @generated
 */
public class BensDireitosRequerenteLocalServiceWrapper
	implements BensDireitosRequerenteLocalService,
			   ServiceWrapper<BensDireitosRequerenteLocalService> {

	public BensDireitosRequerenteLocalServiceWrapper() {
		this(null);
	}

	public BensDireitosRequerenteLocalServiceWrapper(
		BensDireitosRequerenteLocalService bensDireitosRequerenteLocalService) {

		_bensDireitosRequerenteLocalService =
			bensDireitosRequerenteLocalService;
	}

	/**
	 * Adds the bens direitos requerente to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BensDireitosRequerenteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bensDireitosRequerente the bens direitos requerente
	 * @return the bens direitos requerente that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente
		addBensDireitosRequerente(
			br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente
				bensDireitosRequerente) {

		return _bensDireitosRequerenteLocalService.addBensDireitosRequerente(
			bensDireitosRequerente);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente
		addBensDireitosRequerente(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long propostaId, String descricao, String localizacaoDestinacao) {

		return _bensDireitosRequerenteLocalService.addBensDireitosRequerente(
			serviceContext, propostaId, descricao, localizacaoDestinacao);
	}

	/**
	 * Creates a new bens direitos requerente with the primary key. Does not add the bens direitos requerente to the database.
	 *
	 * @param bemId the primary key for the new bens direitos requerente
	 * @return the new bens direitos requerente
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente
		createBensDireitosRequerente(long bemId) {

		return _bensDireitosRequerenteLocalService.createBensDireitosRequerente(
			bemId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bensDireitosRequerenteLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the bens direitos requerente from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BensDireitosRequerenteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bensDireitosRequerente the bens direitos requerente
	 * @return the bens direitos requerente that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente
		deleteBensDireitosRequerente(
			br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente
				bensDireitosRequerente) {

		return _bensDireitosRequerenteLocalService.deleteBensDireitosRequerente(
			bensDireitosRequerente);
	}

	/**
	 * Deletes the bens direitos requerente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BensDireitosRequerenteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bemId the primary key of the bens direitos requerente
	 * @return the bens direitos requerente that was removed
	 * @throws PortalException if a bens direitos requerente with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente
			deleteBensDireitosRequerente(long bemId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bensDireitosRequerenteLocalService.deleteBensDireitosRequerente(
			bemId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bensDireitosRequerenteLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _bensDireitosRequerenteLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _bensDireitosRequerenteLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bensDireitosRequerenteLocalService.dynamicQuery();
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

		return _bensDireitosRequerenteLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BensDireitosRequerenteModelImpl</code>.
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

		return _bensDireitosRequerenteLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BensDireitosRequerenteModelImpl</code>.
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

		return _bensDireitosRequerenteLocalService.dynamicQuery(
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

		return _bensDireitosRequerenteLocalService.dynamicQueryCount(
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

		return _bensDireitosRequerenteLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente
		fetchBensDireitosRequerente(long bemId) {

		return _bensDireitosRequerenteLocalService.fetchBensDireitosRequerente(
			bemId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _bensDireitosRequerenteLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the bens direitos requerente with the primary key.
	 *
	 * @param bemId the primary key of the bens direitos requerente
	 * @return the bens direitos requerente
	 * @throws PortalException if a bens direitos requerente with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente
			getBensDireitosRequerente(long bemId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bensDireitosRequerenteLocalService.getBensDireitosRequerente(
			bemId);
	}

	/**
	 * Returns a range of all the bens direitos requerentes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.BensDireitosRequerenteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bens direitos requerentes
	 * @param end the upper bound of the range of bens direitos requerentes (not inclusive)
	 * @return the range of bens direitos requerentes
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente>
			getBensDireitosRequerentes(int start, int end) {

		return _bensDireitosRequerenteLocalService.getBensDireitosRequerentes(
			start, end);
	}

	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente>
			getBensDireitosRequerentesByPropostaId(long propostaId) {

		return _bensDireitosRequerenteLocalService.
			getBensDireitosRequerentesByPropostaId(propostaId);
	}

	/**
	 * Returns the number of bens direitos requerentes.
	 *
	 * @return the number of bens direitos requerentes
	 */
	@Override
	public int getBensDireitosRequerentesCount() {
		return _bensDireitosRequerenteLocalService.
			getBensDireitosRequerentesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _bensDireitosRequerenteLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _bensDireitosRequerenteLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bensDireitosRequerenteLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the bens direitos requerente in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BensDireitosRequerenteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bensDireitosRequerente the bens direitos requerente
	 * @return the bens direitos requerente that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente
		updateBensDireitosRequerente(
			br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente
				bensDireitosRequerente) {

		return _bensDireitosRequerenteLocalService.updateBensDireitosRequerente(
			bensDireitosRequerente);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _bensDireitosRequerenteLocalService.getBasePersistence();
	}

	@Override
	public BensDireitosRequerenteLocalService getWrappedService() {
		return _bensDireitosRequerenteLocalService;
	}

	@Override
	public void setWrappedService(
		BensDireitosRequerenteLocalService bensDireitosRequerenteLocalService) {

		_bensDireitosRequerenteLocalService =
			bensDireitosRequerenteLocalService;
	}

	private BensDireitosRequerenteLocalService
		_bensDireitosRequerenteLocalService;

}