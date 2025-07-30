/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link DadosRegistroLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DadosRegistroLocalService
 * @generated
 */
public class DadosRegistroLocalServiceWrapper
	implements DadosRegistroLocalService,
			   ServiceWrapper<DadosRegistroLocalService> {

	public DadosRegistroLocalServiceWrapper() {
		this(null);
	}

	public DadosRegistroLocalServiceWrapper(
		DadosRegistroLocalService dadosRegistroLocalService) {

		_dadosRegistroLocalService = dadosRegistroLocalService;
	}

	/**
	 * Adds the dados registro to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DadosRegistroLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dadosRegistro the dados registro
	 * @return the dados registro that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosRegistro
		addDadosRegistro(
			br.com.seatecnologia.gdf.negocia.model.DadosRegistro
				dadosRegistro) {

		return _dadosRegistroLocalService.addDadosRegistro(dadosRegistro);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosRegistro
		addDadosRegistro(
			String matriculaImovel, String cartorioRegistro, String renavam) {

		return _dadosRegistroLocalService.addDadosRegistro(
			matriculaImovel, cartorioRegistro, renavam);
	}

	/**
	 * Creates a new dados registro with the primary key. Does not add the dados registro to the database.
	 *
	 * @param dadosRegistroId the primary key for the new dados registro
	 * @return the new dados registro
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosRegistro
		createDadosRegistro(long dadosRegistroId) {

		return _dadosRegistroLocalService.createDadosRegistro(dadosRegistroId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dadosRegistroLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the dados registro from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DadosRegistroLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dadosRegistro the dados registro
	 * @return the dados registro that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosRegistro
		deleteDadosRegistro(
			br.com.seatecnologia.gdf.negocia.model.DadosRegistro
				dadosRegistro) {

		return _dadosRegistroLocalService.deleteDadosRegistro(dadosRegistro);
	}

	/**
	 * Deletes the dados registro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DadosRegistroLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dadosRegistroId the primary key of the dados registro
	 * @return the dados registro that was removed
	 * @throws PortalException if a dados registro with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosRegistro
			deleteDadosRegistro(long dadosRegistroId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dadosRegistroLocalService.deleteDadosRegistro(dadosRegistroId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dadosRegistroLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _dadosRegistroLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _dadosRegistroLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dadosRegistroLocalService.dynamicQuery();
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

		return _dadosRegistroLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DadosRegistroModelImpl</code>.
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

		return _dadosRegistroLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DadosRegistroModelImpl</code>.
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

		return _dadosRegistroLocalService.dynamicQuery(
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

		return _dadosRegistroLocalService.dynamicQueryCount(dynamicQuery);
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

		return _dadosRegistroLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosRegistro
		fetchDadosRegistro(long dadosRegistroId) {

		return _dadosRegistroLocalService.fetchDadosRegistro(dadosRegistroId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _dadosRegistroLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the dados registro with the primary key.
	 *
	 * @param dadosRegistroId the primary key of the dados registro
	 * @return the dados registro
	 * @throws PortalException if a dados registro with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosRegistro
			getDadosRegistro(long dadosRegistroId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dadosRegistroLocalService.getDadosRegistro(dadosRegistroId);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosRegistro
			getDadosRegistroByGarantiaId(long garantiaId)
		throws br.com.seatecnologia.gdf.negocia.exception.
			NoSuchDadosRegistroException {

		return _dadosRegistroLocalService.getDadosRegistroByGarantiaId(
			garantiaId);
	}

	/**
	 * Returns a range of all the dados registros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.DadosRegistroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dados registros
	 * @param end the upper bound of the range of dados registros (not inclusive)
	 * @return the range of dados registros
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.DadosRegistro>
		getDadosRegistros(int start, int end) {

		return _dadosRegistroLocalService.getDadosRegistros(start, end);
	}

	/**
	 * Returns the number of dados registros.
	 *
	 * @return the number of dados registros
	 */
	@Override
	public int getDadosRegistrosCount() {
		return _dadosRegistroLocalService.getDadosRegistrosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _dadosRegistroLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _dadosRegistroLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dadosRegistroLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the dados registro in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DadosRegistroLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dadosRegistro the dados registro
	 * @return the dados registro that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosRegistro
		updateDadosRegistro(
			br.com.seatecnologia.gdf.negocia.model.DadosRegistro
				dadosRegistro) {

		return _dadosRegistroLocalService.updateDadosRegistro(dadosRegistro);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _dadosRegistroLocalService.getBasePersistence();
	}

	@Override
	public DadosRegistroLocalService getWrappedService() {
		return _dadosRegistroLocalService;
	}

	@Override
	public void setWrappedService(
		DadosRegistroLocalService dadosRegistroLocalService) {

		_dadosRegistroLocalService = dadosRegistroLocalService;
	}

	private DadosRegistroLocalService _dadosRegistroLocalService;

}