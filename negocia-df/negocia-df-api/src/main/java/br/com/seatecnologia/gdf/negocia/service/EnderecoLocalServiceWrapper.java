/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link EnderecoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EnderecoLocalService
 * @generated
 */
public class EnderecoLocalServiceWrapper
	implements EnderecoLocalService, ServiceWrapper<EnderecoLocalService> {

	public EnderecoLocalServiceWrapper() {
		this(null);
	}

	public EnderecoLocalServiceWrapper(
		EnderecoLocalService enderecoLocalService) {

		_enderecoLocalService = enderecoLocalService;
	}

	/**
	 * Adds the endereco to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EnderecoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param endereco the endereco
	 * @return the endereco that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Endereco addEndereco(
		br.com.seatecnologia.gdf.negocia.model.Endereco endereco) {

		return _enderecoLocalService.addEndereco(endereco);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Endereco addEndereco(
		String cep, String endereco, String numero, String estado,
		String municipio, String bairro, String complemento) {

		return _enderecoLocalService.addEndereco(
			cep, endereco, numero, estado, municipio, bairro, complemento);
	}

	/**
	 * Creates a new endereco with the primary key. Does not add the endereco to the database.
	 *
	 * @param enderecoId the primary key for the new endereco
	 * @return the new endereco
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Endereco createEndereco(
		long enderecoId) {

		return _enderecoLocalService.createEndereco(enderecoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _enderecoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the endereco from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EnderecoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param endereco the endereco
	 * @return the endereco that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Endereco deleteEndereco(
		br.com.seatecnologia.gdf.negocia.model.Endereco endereco) {

		return _enderecoLocalService.deleteEndereco(endereco);
	}

	/**
	 * Deletes the endereco with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EnderecoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param enderecoId the primary key of the endereco
	 * @return the endereco that was removed
	 * @throws PortalException if a endereco with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Endereco deleteEndereco(
			long enderecoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _enderecoLocalService.deleteEndereco(enderecoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _enderecoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _enderecoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _enderecoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _enderecoLocalService.dynamicQuery();
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

		return _enderecoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.EnderecoModelImpl</code>.
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

		return _enderecoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.EnderecoModelImpl</code>.
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

		return _enderecoLocalService.dynamicQuery(
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

		return _enderecoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _enderecoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Endereco fetchEndereco(
		long enderecoId) {

		return _enderecoLocalService.fetchEndereco(enderecoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _enderecoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the endereco with the primary key.
	 *
	 * @param enderecoId the primary key of the endereco
	 * @return the endereco
	 * @throws PortalException if a endereco with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Endereco getEndereco(
			long enderecoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _enderecoLocalService.getEndereco(enderecoId);
	}

	/**
	 * Returns a range of all the enderecos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.EnderecoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of enderecos
	 * @param end the upper bound of the range of enderecos (not inclusive)
	 * @return the range of enderecos
	 */
	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Endereco>
		getEnderecos(int start, int end) {

		return _enderecoLocalService.getEnderecos(start, end);
	}

	/**
	 * Returns the number of enderecos.
	 *
	 * @return the number of enderecos
	 */
	@Override
	public int getEnderecosCount() {
		return _enderecoLocalService.getEnderecosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _enderecoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _enderecoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _enderecoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the endereco in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EnderecoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param endereco the endereco
	 * @return the endereco that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.Endereco updateEndereco(
		br.com.seatecnologia.gdf.negocia.model.Endereco endereco) {

		return _enderecoLocalService.updateEndereco(endereco);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Endereco updateEndereco(
			long enderecoId,
			com.liferay.portal.kernel.service.ServiceContext sc, String cep,
			String logradouro, String complemento, String bairro,
			String localidade, String uf)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _enderecoLocalService.updateEndereco(
			enderecoId, sc, cep, logradouro, complemento, bairro, localidade,
			uf);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _enderecoLocalService.getBasePersistence();
	}

	@Override
	public EnderecoLocalService getWrappedService() {
		return _enderecoLocalService;
	}

	@Override
	public void setWrappedService(EnderecoLocalService enderecoLocalService) {
		_enderecoLocalService = enderecoLocalService;
	}

	private EnderecoLocalService _enderecoLocalService;

}