/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link RelacaoCredorLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RelacaoCredorLocalService
 * @generated
 */
public class RelacaoCredorLocalServiceWrapper
	implements RelacaoCredorLocalService,
			   ServiceWrapper<RelacaoCredorLocalService> {

	public RelacaoCredorLocalServiceWrapper() {
		this(null);
	}

	public RelacaoCredorLocalServiceWrapper(
		RelacaoCredorLocalService relacaoCredorLocalService) {

		_relacaoCredorLocalService = relacaoCredorLocalService;
	}

	/**
	 * Adds the relacao credor to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RelacaoCredorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param relacaoCredor the relacao credor
	 * @return the relacao credor that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.RelacaoCredor
		addRelacaoCredor(
			br.com.seatecnologia.gdf.negocia.model.RelacaoCredor
				relacaoCredor) {

		return _relacaoCredorLocalService.addRelacaoCredor(relacaoCredor);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.RelacaoCredor
		addRelacaoCredor(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long propostaId, String nomeCredor, String naturezaCredito,
			String classificacaoCredito, double valorAtualizado,
			String referenciaContabil) {

		return _relacaoCredorLocalService.addRelacaoCredor(
			serviceContext, propostaId, nomeCredor, naturezaCredito,
			classificacaoCredito, valorAtualizado, referenciaContabil);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _relacaoCredorLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new relacao credor with the primary key. Does not add the relacao credor to the database.
	 *
	 * @param credorId the primary key for the new relacao credor
	 * @return the new relacao credor
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.RelacaoCredor
		createRelacaoCredor(long credorId) {

		return _relacaoCredorLocalService.createRelacaoCredor(credorId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _relacaoCredorLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the relacao credor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RelacaoCredorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param credorId the primary key of the relacao credor
	 * @return the relacao credor that was removed
	 * @throws PortalException if a relacao credor with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.RelacaoCredor
			deleteRelacaoCredor(long credorId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _relacaoCredorLocalService.deleteRelacaoCredor(credorId);
	}

	/**
	 * Deletes the relacao credor from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RelacaoCredorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param relacaoCredor the relacao credor
	 * @return the relacao credor that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.RelacaoCredor
		deleteRelacaoCredor(
			br.com.seatecnologia.gdf.negocia.model.RelacaoCredor
				relacaoCredor) {

		return _relacaoCredorLocalService.deleteRelacaoCredor(relacaoCredor);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _relacaoCredorLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _relacaoCredorLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _relacaoCredorLocalService.dynamicQuery();
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

		return _relacaoCredorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.RelacaoCredorModelImpl</code>.
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

		return _relacaoCredorLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.RelacaoCredorModelImpl</code>.
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

		return _relacaoCredorLocalService.dynamicQuery(
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

		return _relacaoCredorLocalService.dynamicQueryCount(dynamicQuery);
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

		return _relacaoCredorLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.RelacaoCredor
		fetchRelacaoCredor(long credorId) {

		return _relacaoCredorLocalService.fetchRelacaoCredor(credorId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _relacaoCredorLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _relacaoCredorLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _relacaoCredorLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _relacaoCredorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the relacao credor with the primary key.
	 *
	 * @param credorId the primary key of the relacao credor
	 * @return the relacao credor
	 * @throws PortalException if a relacao credor with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.RelacaoCredor
			getRelacaoCredor(long credorId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _relacaoCredorLocalService.getRelacaoCredor(credorId);
	}

	/**
	 * Returns a range of all the relacao credors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @return the range of relacao credors
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.RelacaoCredor>
		getRelacaoCredors(int start, int end) {

		return _relacaoCredorLocalService.getRelacaoCredors(start, end);
	}

	/**
	 * Returns the number of relacao credors.
	 *
	 * @return the number of relacao credors
	 */
	@Override
	public int getRelacaoCredorsCount() {
		return _relacaoCredorLocalService.getRelacaoCredorsCount();
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.RelacaoCredor>
		getRelacoesCredorByPropostaId(long propostaId) {

		return _relacaoCredorLocalService.getRelacoesCredorByPropostaId(
			propostaId);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.RelacaoCredor
		updateRelacaoCredor(
			long credorId, long propostaId, String nomeCredor,
			String naturezaCredito, String classificacaoCredito,
			double valorAtualizado, String referenciaRegistro) {

		return _relacaoCredorLocalService.updateRelacaoCredor(
			credorId, propostaId, nomeCredor, naturezaCredito,
			classificacaoCredito, valorAtualizado, referenciaRegistro);
	}

	/**
	 * Updates the relacao credor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RelacaoCredorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param relacaoCredor the relacao credor
	 * @return the relacao credor that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.RelacaoCredor
		updateRelacaoCredor(
			br.com.seatecnologia.gdf.negocia.model.RelacaoCredor
				relacaoCredor) {

		return _relacaoCredorLocalService.updateRelacaoCredor(relacaoCredor);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _relacaoCredorLocalService.getBasePersistence();
	}

	@Override
	public RelacaoCredorLocalService getWrappedService() {
		return _relacaoCredorLocalService;
	}

	@Override
	public void setWrappedService(
		RelacaoCredorLocalService relacaoCredorLocalService) {

		_relacaoCredorLocalService = relacaoCredorLocalService;
	}

	private RelacaoCredorLocalService _relacaoCredorLocalService;

}