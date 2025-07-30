/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TermoAssinadoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TermoAssinadoLocalService
 * @generated
 */
public class TermoAssinadoLocalServiceWrapper
	implements ServiceWrapper<TermoAssinadoLocalService>,
			   TermoAssinadoLocalService {

	public TermoAssinadoLocalServiceWrapper() {
		this(null);
	}

	public TermoAssinadoLocalServiceWrapper(
		TermoAssinadoLocalService termoAssinadoLocalService) {

		_termoAssinadoLocalService = termoAssinadoLocalService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.TermoAssinado
		addTermoAssinado(
			long termoId, long propostaId, String urlTermo, String arquivoPdf,
			String parte) {

		return _termoAssinadoLocalService.addTermoAssinado(
			termoId, propostaId, urlTermo, arquivoPdf, parte);
	}

	/**
	 * Adds the termo assinado to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TermoAssinadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param termoAssinado the termo assinado
	 * @return the termo assinado that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.TermoAssinado
		addTermoAssinado(
			br.com.seatecnologia.gdf.negocia.model.TermoAssinado
				termoAssinado) {

		return _termoAssinadoLocalService.addTermoAssinado(termoAssinado);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _termoAssinadoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new termo assinado with the primary key. Does not add the termo assinado to the database.
	 *
	 * @param termoId the primary key for the new termo assinado
	 * @return the new termo assinado
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.TermoAssinado
		createTermoAssinado(long termoId) {

		return _termoAssinadoLocalService.createTermoAssinado(termoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _termoAssinadoLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the termo assinado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TermoAssinadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param termoId the primary key of the termo assinado
	 * @return the termo assinado that was removed
	 * @throws PortalException if a termo assinado with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.TermoAssinado
			deleteTermoAssinado(long termoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _termoAssinadoLocalService.deleteTermoAssinado(termoId);
	}

	/**
	 * Deletes the termo assinado from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TermoAssinadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param termoAssinado the termo assinado
	 * @return the termo assinado that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.TermoAssinado
		deleteTermoAssinado(
			br.com.seatecnologia.gdf.negocia.model.TermoAssinado
				termoAssinado) {

		return _termoAssinadoLocalService.deleteTermoAssinado(termoAssinado);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _termoAssinadoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _termoAssinadoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _termoAssinadoLocalService.dynamicQuery();
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

		return _termoAssinadoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.TermoAssinadoModelImpl</code>.
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

		return _termoAssinadoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.TermoAssinadoModelImpl</code>.
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

		return _termoAssinadoLocalService.dynamicQuery(
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

		return _termoAssinadoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _termoAssinadoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.TermoAssinado
		fetchTermoAssinado(long termoId) {

		return _termoAssinadoLocalService.fetchTermoAssinado(termoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _termoAssinadoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _termoAssinadoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _termoAssinadoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _termoAssinadoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the termo assinado with the primary key.
	 *
	 * @param termoId the primary key of the termo assinado
	 * @return the termo assinado
	 * @throws PortalException if a termo assinado with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.TermoAssinado
			getTermoAssinado(long termoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _termoAssinadoLocalService.getTermoAssinado(termoId);
	}

	/**
	 * Returns a range of all the termo assinados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.TermoAssinadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of termo assinados
	 * @param end the upper bound of the range of termo assinados (not inclusive)
	 * @return the range of termo assinados
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.TermoAssinado>
		getTermoAssinados(int start, int end) {

		return _termoAssinadoLocalService.getTermoAssinados(start, end);
	}

	/**
	 * Returns the number of termo assinados.
	 *
	 * @return the number of termo assinados
	 */
	@Override
	public int getTermoAssinadosCount() {
		return _termoAssinadoLocalService.getTermoAssinadosCount();
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.TermoAssinado
			updateTermoAssinado(
				long termoId, long propostaId, String urlTermo,
				String arquivoPdf, String parte)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _termoAssinadoLocalService.updateTermoAssinado(
			termoId, propostaId, urlTermo, arquivoPdf, parte);
	}

	/**
	 * Updates the termo assinado in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TermoAssinadoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param termoAssinado the termo assinado
	 * @return the termo assinado that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.TermoAssinado
		updateTermoAssinado(
			br.com.seatecnologia.gdf.negocia.model.TermoAssinado
				termoAssinado) {

		return _termoAssinadoLocalService.updateTermoAssinado(termoAssinado);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _termoAssinadoLocalService.getBasePersistence();
	}

	@Override
	public TermoAssinadoLocalService getWrappedService() {
		return _termoAssinadoLocalService;
	}

	@Override
	public void setWrappedService(
		TermoAssinadoLocalService termoAssinadoLocalService) {

		_termoAssinadoLocalService = termoAssinadoLocalService;
	}

	private TermoAssinadoLocalService _termoAssinadoLocalService;

}