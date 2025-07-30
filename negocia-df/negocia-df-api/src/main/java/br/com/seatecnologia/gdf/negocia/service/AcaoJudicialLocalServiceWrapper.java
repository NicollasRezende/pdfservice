/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcaoJudicialLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcaoJudicialLocalService
 * @generated
 */
public class AcaoJudicialLocalServiceWrapper
	implements AcaoJudicialLocalService,
			   ServiceWrapper<AcaoJudicialLocalService> {

	public AcaoJudicialLocalServiceWrapper() {
		this(null);
	}

	public AcaoJudicialLocalServiceWrapper(
		AcaoJudicialLocalService acaoJudicialLocalService) {

		_acaoJudicialLocalService = acaoJudicialLocalService;
	}

	/**
	 * Adds the acao judicial to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcaoJudicialLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acaoJudicial the acao judicial
	 * @return the acao judicial that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicial addAcaoJudicial(
		br.com.seatecnologia.gdf.negocia.model.AcaoJudicial acaoJudicial) {

		return _acaoJudicialLocalService.addAcaoJudicial(acaoJudicial);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicial addAcaoJudicial(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		String orgaoTribunal, String numeroProcesso, String unidadeVara,
		String parteAutora, String parteRe, String observacoes,
		long propostaId) {

		return _acaoJudicialLocalService.addAcaoJudicial(
			serviceContext, orgaoTribunal, numeroProcesso, unidadeVara,
			parteAutora, parteRe, observacoes, propostaId);
	}

	/**
	 * Creates a new acao judicial with the primary key. Does not add the acao judicial to the database.
	 *
	 * @param acaoId the primary key for the new acao judicial
	 * @return the new acao judicial
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicial
		createAcaoJudicial(long acaoId) {

		return _acaoJudicialLocalService.createAcaoJudicial(acaoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acaoJudicialLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the acao judicial from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcaoJudicialLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acaoJudicial the acao judicial
	 * @return the acao judicial that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicial
		deleteAcaoJudicial(
			br.com.seatecnologia.gdf.negocia.model.AcaoJudicial acaoJudicial) {

		return _acaoJudicialLocalService.deleteAcaoJudicial(acaoJudicial);
	}

	/**
	 * Deletes the acao judicial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcaoJudicialLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acaoId the primary key of the acao judicial
	 * @return the acao judicial that was removed
	 * @throws PortalException if a acao judicial with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicial
			deleteAcaoJudicial(long acaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acaoJudicialLocalService.deleteAcaoJudicial(acaoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acaoJudicialLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acaoJudicialLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acaoJudicialLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acaoJudicialLocalService.dynamicQuery();
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

		return _acaoJudicialLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AcaoJudicialModelImpl</code>.
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

		return _acaoJudicialLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AcaoJudicialModelImpl</code>.
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

		return _acaoJudicialLocalService.dynamicQuery(
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

		return _acaoJudicialLocalService.dynamicQueryCount(dynamicQuery);
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

		return _acaoJudicialLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicial
		fetchAcaoJudicial(long acaoId) {

		return _acaoJudicialLocalService.fetchAcaoJudicial(acaoId);
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.AcaoJudicial>
		findByPropostaId(long propostaId) {

		return _acaoJudicialLocalService.findByPropostaId(propostaId);
	}

	/**
	 * Returns the acao judicial with the primary key.
	 *
	 * @param acaoId the primary key of the acao judicial
	 * @return the acao judicial
	 * @throws PortalException if a acao judicial with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicial getAcaoJudicial(
			long acaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acaoJudicialLocalService.getAcaoJudicial(acaoId);
	}

	/**
	 * Returns a range of all the acao judicials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AcaoJudicialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicials
	 * @param end the upper bound of the range of acao judicials (not inclusive)
	 * @return the range of acao judicials
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.AcaoJudicial>
		getAcaoJudicials(int start, int end) {

		return _acaoJudicialLocalService.getAcaoJudicials(start, end);
	}

	/**
	 * Returns the number of acao judicials.
	 *
	 * @return the number of acao judicials
	 */
	@Override
	public int getAcaoJudicialsCount() {
		return _acaoJudicialLocalService.getAcaoJudicialsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acaoJudicialLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acaoJudicialLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acaoJudicialLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acaoJudicialLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the acao judicial in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcaoJudicialLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acaoJudicial the acao judicial
	 * @return the acao judicial that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicial
		updateAcaoJudicial(
			br.com.seatecnologia.gdf.negocia.model.AcaoJudicial acaoJudicial) {

		return _acaoJudicialLocalService.updateAcaoJudicial(acaoJudicial);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicial
		updateAcaoJudicial(
			long acaoId, long propostaId, String numeroProcesso,
			String varaLocal) {

		return _acaoJudicialLocalService.updateAcaoJudicial(
			acaoId, propostaId, numeroProcesso, varaLocal);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acaoJudicialLocalService.getBasePersistence();
	}

	@Override
	public AcaoJudicialLocalService getWrappedService() {
		return _acaoJudicialLocalService;
	}

	@Override
	public void setWrappedService(
		AcaoJudicialLocalService acaoJudicialLocalService) {

		_acaoJudicialLocalService = acaoJudicialLocalService;
	}

	private AcaoJudicialLocalService _acaoJudicialLocalService;

}