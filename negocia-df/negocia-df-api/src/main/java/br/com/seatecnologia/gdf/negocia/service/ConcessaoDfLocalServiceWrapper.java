/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ConcessaoDfLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ConcessaoDfLocalService
 * @generated
 */
public class ConcessaoDfLocalServiceWrapper
	implements ConcessaoDfLocalService,
			   ServiceWrapper<ConcessaoDfLocalService> {

	public ConcessaoDfLocalServiceWrapper() {
		this(null);
	}

	public ConcessaoDfLocalServiceWrapper(
		ConcessaoDfLocalService concessaoDfLocalService) {

		_concessaoDfLocalService = concessaoDfLocalService;
	}

	/**
	 * Adds the concessao df to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ConcessaoDfLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param concessaoDf the concessao df
	 * @return the concessao df that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.ConcessaoDf addConcessaoDf(
		br.com.seatecnologia.gdf.negocia.model.ConcessaoDf concessaoDf) {

		return _concessaoDfLocalService.addConcessaoDf(concessaoDf);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.ConcessaoDf addConcessaoDf(
		long concessaoId, long propostaId, double percentualDescontoJuros,
		double percentualDescontoPrincipal, String observacoes) {

		return _concessaoDfLocalService.addConcessaoDf(
			concessaoId, propostaId, percentualDescontoJuros,
			percentualDescontoPrincipal, observacoes);
	}

	/**
	 * Creates a new concessao df with the primary key. Does not add the concessao df to the database.
	 *
	 * @param concessaoId the primary key for the new concessao df
	 * @return the new concessao df
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.ConcessaoDf createConcessaoDf(
		long concessaoId) {

		return _concessaoDfLocalService.createConcessaoDf(concessaoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _concessaoDfLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the concessao df from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ConcessaoDfLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param concessaoDf the concessao df
	 * @return the concessao df that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.ConcessaoDf deleteConcessaoDf(
		br.com.seatecnologia.gdf.negocia.model.ConcessaoDf concessaoDf) {

		return _concessaoDfLocalService.deleteConcessaoDf(concessaoDf);
	}

	/**
	 * Deletes the concessao df with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ConcessaoDfLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param concessaoId the primary key of the concessao df
	 * @return the concessao df that was removed
	 * @throws PortalException if a concessao df with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.ConcessaoDf deleteConcessaoDf(
			long concessaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _concessaoDfLocalService.deleteConcessaoDf(concessaoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _concessaoDfLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _concessaoDfLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _concessaoDfLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _concessaoDfLocalService.dynamicQuery();
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

		return _concessaoDfLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ConcessaoDfModelImpl</code>.
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

		return _concessaoDfLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ConcessaoDfModelImpl</code>.
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

		return _concessaoDfLocalService.dynamicQuery(
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

		return _concessaoDfLocalService.dynamicQueryCount(dynamicQuery);
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

		return _concessaoDfLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.ConcessaoDf fetchConcessaoDf(
		long concessaoId) {

		return _concessaoDfLocalService.fetchConcessaoDf(concessaoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _concessaoDfLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the concessao df with the primary key.
	 *
	 * @param concessaoId the primary key of the concessao df
	 * @return the concessao df
	 * @throws PortalException if a concessao df with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.ConcessaoDf getConcessaoDf(
			long concessaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _concessaoDfLocalService.getConcessaoDf(concessaoId);
	}

	/**
	 * Returns a range of all the concessao dfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ConcessaoDfModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of concessao dfs
	 * @param end the upper bound of the range of concessao dfs (not inclusive)
	 * @return the range of concessao dfs
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.ConcessaoDf>
		getConcessaoDfs(int start, int end) {

		return _concessaoDfLocalService.getConcessaoDfs(start, end);
	}

	/**
	 * Returns the number of concessao dfs.
	 *
	 * @return the number of concessao dfs
	 */
	@Override
	public int getConcessaoDfsCount() {
		return _concessaoDfLocalService.getConcessaoDfsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _concessaoDfLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _concessaoDfLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _concessaoDfLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the concessao df in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ConcessaoDfLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param concessaoDf the concessao df
	 * @return the concessao df that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.ConcessaoDf updateConcessaoDf(
		br.com.seatecnologia.gdf.negocia.model.ConcessaoDf concessaoDf) {

		return _concessaoDfLocalService.updateConcessaoDf(concessaoDf);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.ConcessaoDf updateConcessaoDf(
			long concessaoId, long propostaId, double percentualDescontoJuros,
			double percentualDescontoPrincipal, String observacoes)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _concessaoDfLocalService.updateConcessaoDf(
			concessaoId, propostaId, percentualDescontoJuros,
			percentualDescontoPrincipal, observacoes);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _concessaoDfLocalService.getBasePersistence();
	}

	@Override
	public ConcessaoDfLocalService getWrappedService() {
		return _concessaoDfLocalService;
	}

	@Override
	public void setWrappedService(
		ConcessaoDfLocalService concessaoDfLocalService) {

		_concessaoDfLocalService = concessaoDfLocalService;
	}

	private ConcessaoDfLocalService _concessaoDfLocalService;

}