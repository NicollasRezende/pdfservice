/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AdvogadoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AdvogadoLocalService
 * @generated
 */
public class AdvogadoLocalServiceWrapper
	implements AdvogadoLocalService, ServiceWrapper<AdvogadoLocalService> {

	public AdvogadoLocalServiceWrapper() {
		this(null);
	}

	public AdvogadoLocalServiceWrapper(
		AdvogadoLocalService advogadoLocalService) {

		_advogadoLocalService = advogadoLocalService;
	}

	/**
	 * Adds the advogado to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AdvogadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param advogado the advogado
	 * @return the advogado that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Advogado addAdvogado(
		br.com.seatecnologia.gdf.negocia.model.Advogado advogado) {

		return _advogadoLocalService.addAdvogado(advogado);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Advogado addAdvogado(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long qualificacaoId, String numeroOab, String seccional,
		long carteirinhaOAB) {

		return _advogadoLocalService.addAdvogado(
			serviceContext, qualificacaoId, numeroOab, seccional,
			carteirinhaOAB);
	}

	/**
	 * Creates a new advogado with the primary key. Does not add the advogado to the database.
	 *
	 * @param advogadoId the primary key for the new advogado
	 * @return the new advogado
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Advogado createAdvogado(
		long advogadoId) {

		return _advogadoLocalService.createAdvogado(advogadoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _advogadoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the advogado from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AdvogadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param advogado the advogado
	 * @return the advogado that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Advogado deleteAdvogado(
		br.com.seatecnologia.gdf.negocia.model.Advogado advogado) {

		return _advogadoLocalService.deleteAdvogado(advogado);
	}

	/**
	 * Deletes the advogado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AdvogadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param advogadoId the primary key of the advogado
	 * @return the advogado that was removed
	 * @throws PortalException if a advogado with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Advogado deleteAdvogado(
			long advogadoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _advogadoLocalService.deleteAdvogado(advogadoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _advogadoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _advogadoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _advogadoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _advogadoLocalService.dynamicQuery();
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

		return _advogadoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AdvogadoModelImpl</code>.
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

		return _advogadoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AdvogadoModelImpl</code>.
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

		return _advogadoLocalService.dynamicQuery(
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

		return _advogadoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _advogadoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Advogado fetchAdvogado(
		long advogadoId) {

		return _advogadoLocalService.fetchAdvogado(advogadoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _advogadoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the advogado with the primary key.
	 *
	 * @param advogadoId the primary key of the advogado
	 * @return the advogado
	 * @throws PortalException if a advogado with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Advogado getAdvogado(
			long advogadoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _advogadoLocalService.getAdvogado(advogadoId);
	}

	/**
	 * Returns a range of all the advogados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AdvogadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of advogados
	 * @param end the upper bound of the range of advogados (not inclusive)
	 * @return the range of advogados
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Advogado>
		getAdvogados(int start, int end) {

		return _advogadoLocalService.getAdvogados(start, end);
	}

	/**
	 * Returns the number of advogados.
	 *
	 * @return the number of advogados
	 */
	@Override
	public int getAdvogadosCount() {
		return _advogadoLocalService.getAdvogadosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _advogadoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _advogadoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _advogadoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the advogado in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AdvogadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param advogado the advogado
	 * @return the advogado that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Advogado updateAdvogado(
		br.com.seatecnologia.gdf.negocia.model.Advogado advogado) {

		return _advogadoLocalService.updateAdvogado(advogado);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Advogado updateAdvogado(
			long advogadoId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long qualificacaoId, String numeroOab, String ufOab)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _advogadoLocalService.updateAdvogado(
			advogadoId, serviceContext, qualificacaoId, numeroOab, ufOab);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _advogadoLocalService.getBasePersistence();
	}

	@Override
	public AdvogadoLocalService getWrappedService() {
		return _advogadoLocalService;
	}

	@Override
	public void setWrappedService(AdvogadoLocalService advogadoLocalService) {
		_advogadoLocalService = advogadoLocalService;
	}

	private AdvogadoLocalService _advogadoLocalService;

}