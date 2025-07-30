/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CredorPropostaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CredorPropostaLocalService
 * @generated
 */
public class CredorPropostaLocalServiceWrapper
	implements CredorPropostaLocalService,
			   ServiceWrapper<CredorPropostaLocalService> {

	public CredorPropostaLocalServiceWrapper() {
		this(null);
	}

	public CredorPropostaLocalServiceWrapper(
		CredorPropostaLocalService credorPropostaLocalService) {

		_credorPropostaLocalService = credorPropostaLocalService;
	}

	/**
	 * Adds the credor proposta to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CredorPropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param credorProposta the credor proposta
	 * @return the credor proposta that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.CredorProposta
		addCredorProposta(
			br.com.seatecnologia.gdf.negocia.model.CredorProposta
				credorProposta) {

		return _credorPropostaLocalService.addCredorProposta(credorProposta);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.CredorProposta
		addCredorProposta(long credorId, long propostaId) {

		return _credorPropostaLocalService.addCredorProposta(
			credorId, propostaId);
	}

	/**
	 * Creates a new credor proposta with the primary key. Does not add the credor proposta to the database.
	 *
	 * @param credorPropostaId the primary key for the new credor proposta
	 * @return the new credor proposta
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.CredorProposta
		createCredorProposta(long credorPropostaId) {

		return _credorPropostaLocalService.createCredorProposta(
			credorPropostaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _credorPropostaLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the credor proposta from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CredorPropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param credorProposta the credor proposta
	 * @return the credor proposta that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.CredorProposta
		deleteCredorProposta(
			br.com.seatecnologia.gdf.negocia.model.CredorProposta
				credorProposta) {

		return _credorPropostaLocalService.deleteCredorProposta(credorProposta);
	}

	/**
	 * Deletes the credor proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CredorPropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param credorPropostaId the primary key of the credor proposta
	 * @return the credor proposta that was removed
	 * @throws PortalException if a credor proposta with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.CredorProposta
			deleteCredorProposta(long credorPropostaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _credorPropostaLocalService.deleteCredorProposta(
			credorPropostaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _credorPropostaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _credorPropostaLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _credorPropostaLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _credorPropostaLocalService.dynamicQuery();
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

		return _credorPropostaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.CredorPropostaModelImpl</code>.
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

		return _credorPropostaLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.CredorPropostaModelImpl</code>.
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

		return _credorPropostaLocalService.dynamicQuery(
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

		return _credorPropostaLocalService.dynamicQueryCount(dynamicQuery);
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

		return _credorPropostaLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.CredorProposta
		fetchCredorProposta(long credorPropostaId) {

		return _credorPropostaLocalService.fetchCredorProposta(
			credorPropostaId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _credorPropostaLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.CredorProposta>
		getCredoresPropostaByPropostaId(long propostaId) {

		return _credorPropostaLocalService.getCredoresPropostaByPropostaId(
			propostaId);
	}

	/**
	 * Returns the credor proposta with the primary key.
	 *
	 * @param credorPropostaId the primary key of the credor proposta
	 * @return the credor proposta
	 * @throws PortalException if a credor proposta with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.CredorProposta
			getCredorProposta(long credorPropostaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _credorPropostaLocalService.getCredorProposta(credorPropostaId);
	}

	/**
	 * Returns a range of all the credor propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.CredorPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of credor propostas
	 * @param end the upper bound of the range of credor propostas (not inclusive)
	 * @return the range of credor propostas
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.CredorProposta>
		getCredorPropostas(int start, int end) {

		return _credorPropostaLocalService.getCredorPropostas(start, end);
	}

	/**
	 * Returns the number of credor propostas.
	 *
	 * @return the number of credor propostas
	 */
	@Override
	public int getCredorPropostasCount() {
		return _credorPropostaLocalService.getCredorPropostasCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _credorPropostaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _credorPropostaLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _credorPropostaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the credor proposta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CredorPropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param credorProposta the credor proposta
	 * @return the credor proposta that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.CredorProposta
		updateCredorProposta(
			br.com.seatecnologia.gdf.negocia.model.CredorProposta
				credorProposta) {

		return _credorPropostaLocalService.updateCredorProposta(credorProposta);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _credorPropostaLocalService.getBasePersistence();
	}

	@Override
	public CredorPropostaLocalService getWrappedService() {
		return _credorPropostaLocalService;
	}

	@Override
	public void setWrappedService(
		CredorPropostaLocalService credorPropostaLocalService) {

		_credorPropostaLocalService = credorPropostaLocalService;
	}

	private CredorPropostaLocalService _credorPropostaLocalService;

}