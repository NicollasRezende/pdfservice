/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ProcuracaoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProcuracaoLocalService
 * @generated
 */
public class ProcuracaoLocalServiceWrapper
	implements ProcuracaoLocalService, ServiceWrapper<ProcuracaoLocalService> {

	public ProcuracaoLocalServiceWrapper() {
		this(null);
	}

	public ProcuracaoLocalServiceWrapper(
		ProcuracaoLocalService procuracaoLocalService) {

		_procuracaoLocalService = procuracaoLocalService;
	}

	/**
	 * Adds the procuracao to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProcuracaoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param procuracao the procuracao
	 * @return the procuracao that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Procuracao addProcuracao(
		br.com.seatecnologia.gdf.negocia.model.Procuracao procuracao) {

		return _procuracaoLocalService.addProcuracao(procuracao);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _procuracaoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new procuracao with the primary key. Does not add the procuracao to the database.
	 *
	 * @param procuracaoId the primary key for the new procuracao
	 * @return the new procuracao
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Procuracao createProcuracao(
		long procuracaoId) {

		return _procuracaoLocalService.createProcuracao(procuracaoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _procuracaoLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the procuracao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProcuracaoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param procuracaoId the primary key of the procuracao
	 * @return the procuracao that was removed
	 * @throws PortalException if a procuracao with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Procuracao deleteProcuracao(
			long procuracaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _procuracaoLocalService.deleteProcuracao(procuracaoId);
	}

	/**
	 * Deletes the procuracao from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProcuracaoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param procuracao the procuracao
	 * @return the procuracao that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Procuracao deleteProcuracao(
		br.com.seatecnologia.gdf.negocia.model.Procuracao procuracao) {

		return _procuracaoLocalService.deleteProcuracao(procuracao);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _procuracaoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _procuracaoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _procuracaoLocalService.dynamicQuery();
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

		return _procuracaoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ProcuracaoModelImpl</code>.
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

		return _procuracaoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ProcuracaoModelImpl</code>.
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

		return _procuracaoLocalService.dynamicQuery(
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

		return _procuracaoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _procuracaoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Procuracao fetchProcuracao(
		long procuracaoId) {

		return _procuracaoLocalService.fetchProcuracao(procuracaoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _procuracaoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _procuracaoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _procuracaoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _procuracaoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the procuracao with the primary key.
	 *
	 * @param procuracaoId the primary key of the procuracao
	 * @return the procuracao
	 * @throws PortalException if a procuracao with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Procuracao getProcuracao(
			long procuracaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _procuracaoLocalService.getProcuracao(procuracaoId);
	}

	/**
	 * Returns a range of all the procuracaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.ProcuracaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of procuracaos
	 * @param end the upper bound of the range of procuracaos (not inclusive)
	 * @return the range of procuracaos
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Procuracao>
		getProcuracaos(int start, int end) {

		return _procuracaoLocalService.getProcuracaos(start, end);
	}

	/**
	 * Returns the number of procuracaos.
	 *
	 * @return the number of procuracaos
	 */
	@Override
	public int getProcuracaosCount() {
		return _procuracaoLocalService.getProcuracaosCount();
	}

	/**
	 * Updates the procuracao in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProcuracaoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param procuracao the procuracao
	 * @return the procuracao that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Procuracao updateProcuracao(
		br.com.seatecnologia.gdf.negocia.model.Procuracao procuracao) {

		return _procuracaoLocalService.updateProcuracao(procuracao);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _procuracaoLocalService.getBasePersistence();
	}

	@Override
	public ProcuracaoLocalService getWrappedService() {
		return _procuracaoLocalService;
	}

	@Override
	public void setWrappedService(
		ProcuracaoLocalService procuracaoLocalService) {

		_procuracaoLocalService = procuracaoLocalService;
	}

	private ProcuracaoLocalService _procuracaoLocalService;

}