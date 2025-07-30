/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for QualificacaoCompleta. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.QualificacaoCompletaLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see QualificacaoCompletaLocalService
 * @generated
 */
public class QualificacaoCompletaLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.QualificacaoCompletaLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static QualificacaoCompleta addQualificacaoCompleta(
		QualificacaoCompleta qualificacaoCompleta) {

		return getService().addQualificacaoCompleta(qualificacaoCompleta);
	}

	public static QualificacaoCompleta addQualificacaoCompleta(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		String tipoPessoa, String nomeRazaoSocial, String nomeFantasia,
		String representanteLegal, String cpfCnpj, String numeroCfdf,
		String email, String telefone, String whatsapp, long enderecoPostalId,
		String domicilioFiscal) {

		return getService().addQualificacaoCompleta(
			serviceContext, tipoPessoa, nomeRazaoSocial, nomeFantasia,
			representanteLegal, cpfCnpj, numeroCfdf, email, telefone, whatsapp,
			enderecoPostalId, domicilioFiscal);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new qualificacao completa with the primary key. Does not add the qualificacao completa to the database.
	 *
	 * @param qualificacaoId the primary key for the new qualificacao completa
	 * @return the new qualificacao completa
	 */
	public static QualificacaoCompleta createQualificacaoCompleta(
		long qualificacaoId) {

		return getService().createQualificacaoCompleta(qualificacaoId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	public static QualificacaoCompleta deleteQualificacaoCompleta(
			long qualificacaoId)
		throws PortalException {

		return getService().deleteQualificacaoCompleta(qualificacaoId);
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
	public static QualificacaoCompleta deleteQualificacaoCompleta(
		QualificacaoCompleta qualificacaoCompleta) {

		return getService().deleteQualificacaoCompleta(qualificacaoCompleta);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static QualificacaoCompleta fetchQualificacaoCompleta(
		long qualificacaoId) {

		return getService().fetchQualificacaoCompleta(qualificacaoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the qualificacao completa with the primary key.
	 *
	 * @param qualificacaoId the primary key of the qualificacao completa
	 * @return the qualificacao completa
	 * @throws PortalException if a qualificacao completa with the primary key could not be found
	 */
	public static QualificacaoCompleta getQualificacaoCompleta(
			long qualificacaoId)
		throws PortalException {

		return getService().getQualificacaoCompleta(qualificacaoId);
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
	public static List<QualificacaoCompleta> getQualificacaoCompletas(
		int start, int end) {

		return getService().getQualificacaoCompletas(start, end);
	}

	/**
	 * Returns the number of qualificacao completas.
	 *
	 * @return the number of qualificacao completas
	 */
	public static int getQualificacaoCompletasCount() {
		return getService().getQualificacaoCompletasCount();
	}

	public static QualificacaoCompleta updateQualificacaoCompleta(
			long qualificacaoId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String tipoPessoa, String nomeRazaoSocial, String nomeFantasia,
			String representanteLegal, String cpfCnpj, String numeroCddf,
			String email, String telefone, String whatsapp,
			long enderecoPostalId)
		throws PortalException {

		return getService().updateQualificacaoCompleta(
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
	public static QualificacaoCompleta updateQualificacaoCompleta(
		QualificacaoCompleta qualificacaoCompleta) {

		return getService().updateQualificacaoCompleta(qualificacaoCompleta);
	}

	public static QualificacaoCompletaLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<QualificacaoCompletaLocalService>
		_serviceSnapshot = new Snapshot<>(
			QualificacaoCompletaLocalServiceUtil.class,
			QualificacaoCompletaLocalService.class);

}