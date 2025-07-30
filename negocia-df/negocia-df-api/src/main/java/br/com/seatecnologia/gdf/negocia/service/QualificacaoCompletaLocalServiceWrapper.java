/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QualificacaoCompletaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QualificacaoCompletaLocalService
 * @generated
 */
public class QualificacaoCompletaLocalServiceWrapper
	implements QualificacaoCompletaLocalService,
			   ServiceWrapper<QualificacaoCompletaLocalService> {

	public QualificacaoCompletaLocalServiceWrapper() {
		this(null);
	}

	public QualificacaoCompletaLocalServiceWrapper(
		QualificacaoCompletaLocalService qualificacaoCompletaLocalService) {

		_qualificacaoCompletaLocalService = qualificacaoCompletaLocalService;
	}

	/**
	 * Adds the qualificacao completa to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualificacaoCompletaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualificacaoCompleta the qualificacao completa
	 * @return the qualificacao completa that was added
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta
		addQualificacaoCompleta(
			br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta
				qualificacaoCompleta) {

		return _qualificacaoCompletaLocalService.addQualificacaoCompleta(
			qualificacaoCompleta);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta
		addQualificacaoCompleta(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String tipoPessoa, String nomeRazaoSocial, String nomeFantasia,
			String representanteLegal, String cpfCnpj, String numeroCfdf,
			String email, String telefone, String whatsapp,
			long enderecoPostalId, String domicilioFiscal) {

		return _qualificacaoCompletaLocalService.addQualificacaoCompleta(
			serviceContext, tipoPessoa, nomeRazaoSocial, nomeFantasia,
			representanteLegal, cpfCnpj, numeroCfdf, email, telefone, whatsapp,
			enderecoPostalId, domicilioFiscal);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualificacaoCompletaLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new qualificacao completa with the primary key. Does not add the qualificacao completa to the database.
	 *
	 * @param qualificacaoId the primary key for the new qualificacao completa
	 * @return the new qualificacao completa
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta
		createQualificacaoCompleta(long qualificacaoId) {

		return _qualificacaoCompletaLocalService.createQualificacaoCompleta(
			qualificacaoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualificacaoCompletaLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the qualificacao completa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualificacaoCompletaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualificacaoId the primary key of the qualificacao completa
	 * @return the qualificacao completa that was removed
	 * @throws PortalException if a qualificacao completa with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta
			deleteQualificacaoCompleta(long qualificacaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualificacaoCompletaLocalService.deleteQualificacaoCompleta(
			qualificacaoId);
	}

	/**
	 * Deletes the qualificacao completa from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualificacaoCompletaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualificacaoCompleta the qualificacao completa
	 * @return the qualificacao completa that was removed
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta
		deleteQualificacaoCompleta(
			br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta
				qualificacaoCompleta) {

		return _qualificacaoCompletaLocalService.deleteQualificacaoCompleta(
			qualificacaoCompleta);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _qualificacaoCompletaLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _qualificacaoCompletaLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qualificacaoCompletaLocalService.dynamicQuery();
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

		return _qualificacaoCompletaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.QualificacaoCompletaModelImpl</code>.
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

		return _qualificacaoCompletaLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.QualificacaoCompletaModelImpl</code>.
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

		return _qualificacaoCompletaLocalService.dynamicQuery(
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

		return _qualificacaoCompletaLocalService.dynamicQueryCount(
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

		return _qualificacaoCompletaLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta
		fetchQualificacaoCompleta(long qualificacaoId) {

		return _qualificacaoCompletaLocalService.fetchQualificacaoCompleta(
			qualificacaoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _qualificacaoCompletaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _qualificacaoCompletaLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _qualificacaoCompletaLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualificacaoCompletaLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the qualificacao completa with the primary key.
	 *
	 * @param qualificacaoId the primary key of the qualificacao completa
	 * @return the qualificacao completa
	 * @throws PortalException if a qualificacao completa with the primary key could not be found
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta
			getQualificacaoCompleta(long qualificacaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualificacaoCompletaLocalService.getQualificacaoCompleta(
			qualificacaoId);
	}

	/**
	 * Returns a range of all the qualificacao completas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.QualificacaoCompletaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualificacao completas
	 * @param end the upper bound of the range of qualificacao completas (not inclusive)
	 * @return the range of qualificacao completas
	 */
	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta>
			getQualificacaoCompletas(int start, int end) {

		return _qualificacaoCompletaLocalService.getQualificacaoCompletas(
			start, end);
	}

	/**
	 * Returns the number of qualificacao completas.
	 *
	 * @return the number of qualificacao completas
	 */
	@Override
	public int getQualificacaoCompletasCount() {
		return _qualificacaoCompletaLocalService.
			getQualificacaoCompletasCount();
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta
			updateQualificacaoCompleta(
				long qualificacaoId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext,
				String tipoPessoa, String nomeRazaoSocial, String nomeFantasia,
				String representanteLegal, String cpfCnpj, String numeroCddf,
				String email, String telefone, String whatsapp,
				long enderecoPostalId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualificacaoCompletaLocalService.updateQualificacaoCompleta(
			qualificacaoId, serviceContext, tipoPessoa, nomeRazaoSocial,
			nomeFantasia, representanteLegal, cpfCnpj, numeroCddf, email,
			telefone, whatsapp, enderecoPostalId);
	}

	/**
	 * Updates the qualificacao completa in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualificacaoCompletaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualificacaoCompleta the qualificacao completa
	 * @return the qualificacao completa that was updated
	 */
	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta
		updateQualificacaoCompleta(
			br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta
				qualificacaoCompleta) {

		return _qualificacaoCompletaLocalService.updateQualificacaoCompleta(
			qualificacaoCompleta);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _qualificacaoCompletaLocalService.getBasePersistence();
	}

	@Override
	public QualificacaoCompletaLocalService getWrappedService() {
		return _qualificacaoCompletaLocalService;
	}

	@Override
	public void setWrappedService(
		QualificacaoCompletaLocalService qualificacaoCompletaLocalService) {

		_qualificacaoCompletaLocalService = qualificacaoCompletaLocalService;
	}

	private QualificacaoCompletaLocalService _qualificacaoCompletaLocalService;

}