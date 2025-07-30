/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link IdentificacaoDebitosLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see IdentificacaoDebitosLocalService
 * @generated
 */
public class IdentificacaoDebitosLocalServiceWrapper
	implements IdentificacaoDebitosLocalService,
			   ServiceWrapper<IdentificacaoDebitosLocalService> {

	public IdentificacaoDebitosLocalServiceWrapper() {
		this(null);
	}

	public IdentificacaoDebitosLocalServiceWrapper(
		IdentificacaoDebitosLocalService identificacaoDebitosLocalService) {

		_identificacaoDebitosLocalService = identificacaoDebitosLocalService;
	}

	/**
	 * Adds the identificacao debitos to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect IdentificacaoDebitosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param identificacaoDebitos the identificacao debitos
	 * @return the identificacao debitos that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos
		addIdentificacaoDebitos(
			br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos
				identificacaoDebitos) {

		return _identificacaoDebitosLocalService.addIdentificacaoDebitos(
			identificacaoDebitos);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos
		addIdentificacaoDebitos(
			long fundamentacaoId, String natureza, String situacao,
			String inscricaoDividaAtiva, String garantidoJudicialmente) {

		return _identificacaoDebitosLocalService.addIdentificacaoDebitos(
			fundamentacaoId, natureza, situacao, inscricaoDividaAtiva,
			garantidoJudicialmente);
	}

	/**
	 * Creates a new identificacao debitos with the primary key. Does not add the identificacao debitos to the database.
	 *
	 * @param identificacaoDebitosId the primary key for the new identificacao debitos
	 * @return the new identificacao debitos
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos
		createIdentificacaoDebitos(long identificacaoDebitosId) {

		return _identificacaoDebitosLocalService.createIdentificacaoDebitos(
			identificacaoDebitosId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _identificacaoDebitosLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the identificacao debitos from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect IdentificacaoDebitosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param identificacaoDebitos the identificacao debitos
	 * @return the identificacao debitos that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos
		deleteIdentificacaoDebitos(
			br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos
				identificacaoDebitos) {

		return _identificacaoDebitosLocalService.deleteIdentificacaoDebitos(
			identificacaoDebitos);
	}

	/**
	 * Deletes the identificacao debitos with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect IdentificacaoDebitosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param identificacaoDebitosId the primary key of the identificacao debitos
	 * @return the identificacao debitos that was removed
	 * @throws PortalException if a identificacao debitos with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos
			deleteIdentificacaoDebitos(long identificacaoDebitosId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _identificacaoDebitosLocalService.deleteIdentificacaoDebitos(
			identificacaoDebitosId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _identificacaoDebitosLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _identificacaoDebitosLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _identificacaoDebitosLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _identificacaoDebitosLocalService.dynamicQuery();
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

		return _identificacaoDebitosLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.IdentificacaoDebitosModelImpl</code>.
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

		return _identificacaoDebitosLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.IdentificacaoDebitosModelImpl</code>.
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

		return _identificacaoDebitosLocalService.dynamicQuery(
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

		return _identificacaoDebitosLocalService.dynamicQueryCount(
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

		return _identificacaoDebitosLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos
		fetchIdentificacaoDebitos(long identificacaoDebitosId) {

		return _identificacaoDebitosLocalService.fetchIdentificacaoDebitos(
			identificacaoDebitosId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _identificacaoDebitosLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the identificacao debitos with the primary key.
	 *
	 * @param identificacaoDebitosId the primary key of the identificacao debitos
	 * @return the identificacao debitos
	 * @throws PortalException if a identificacao debitos with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos
			getIdentificacaoDebitos(long identificacaoDebitosId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _identificacaoDebitosLocalService.getIdentificacaoDebitos(
			identificacaoDebitosId);
	}

	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos>
			getIdentificacaoDebitosByFundamentacaoId(long fundamentacaoId) {

		return _identificacaoDebitosLocalService.
			getIdentificacaoDebitosByFundamentacaoId(fundamentacaoId);
	}

	/**
	 * Returns a range of all the identificacao debitoses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.IdentificacaoDebitosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of identificacao debitoses
	 * @param end the upper bound of the range of identificacao debitoses (not inclusive)
	 * @return the range of identificacao debitoses
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos>
			getIdentificacaoDebitoses(int start, int end) {

		return _identificacaoDebitosLocalService.getIdentificacaoDebitoses(
			start, end);
	}

	/**
	 * Returns the number of identificacao debitoses.
	 *
	 * @return the number of identificacao debitoses
	 */
	@Override
	public int getIdentificacaoDebitosesCount() {
		return _identificacaoDebitosLocalService.
			getIdentificacaoDebitosesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _identificacaoDebitosLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _identificacaoDebitosLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _identificacaoDebitosLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the identificacao debitos in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect IdentificacaoDebitosLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param identificacaoDebitos the identificacao debitos
	 * @return the identificacao debitos that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos
		updateIdentificacaoDebitos(
			br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos
				identificacaoDebitos) {

		return _identificacaoDebitosLocalService.updateIdentificacaoDebitos(
			identificacaoDebitos);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _identificacaoDebitosLocalService.getBasePersistence();
	}

	@Override
	public IdentificacaoDebitosLocalService getWrappedService() {
		return _identificacaoDebitosLocalService;
	}

	@Override
	public void setWrappedService(
		IdentificacaoDebitosLocalService identificacaoDebitosLocalService) {

		_identificacaoDebitosLocalService = identificacaoDebitosLocalService;
	}

	private IdentificacaoDebitosLocalService _identificacaoDebitosLocalService;

}