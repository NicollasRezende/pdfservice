/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.Proposta;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Proposta. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.PropostaLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PropostaLocalService
 * @generated
 */
public class PropostaLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.PropostaLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the proposta to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param proposta the proposta
	 * @return the proposta that was added
	 */
	public static Proposta addProposta(Proposta proposta) {
		return getService().addProposta(proposta);
	}

	public static Proposta addProposta(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long editalId, String tipoProposta, String numeroProtocoloSei,
			long propostaPaiId, long procuracao, String cpfCnpj)
		throws br.com.seatecnologia.gdf.negocia.exception.
			BusinessLogicValidationException,
			   PortalException {

		return getService().addProposta(
			serviceContext, editalId, tipoProposta, numeroProtocoloSei,
			propostaPaiId, procuracao, cpfCnpj);
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
	 * Creates a new proposta with the primary key. Does not add the proposta to the database.
	 *
	 * @param propostaId the primary key for the new proposta
	 * @return the new proposta
	 */
	public static Proposta createProposta(long propostaId) {
		return getService().createProposta(propostaId);
	}

	public static Proposta createPropostaCompleteZip(
			long propostaId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws Exception {

		return getService().createPropostaCompleteZip(
			propostaId, serviceContext);
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
	 * Deletes the proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param propostaId the primary key of the proposta
	 * @return the proposta that was removed
	 * @throws PortalException if a proposta with the primary key could not be found
	 */
	public static Proposta deleteProposta(long propostaId)
		throws PortalException {

		return getService().deleteProposta(propostaId);
	}

	/**
	 * Deletes the proposta from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param proposta the proposta
	 * @return the proposta that was removed
	 */
	public static Proposta deleteProposta(Proposta proposta) {
		return getService().deleteProposta(proposta);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.PropostaModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.PropostaModelImpl</code>.
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

	public static Proposta fetchProposta(long propostaId) {
		return getService().fetchProposta(propostaId);
	}

	/**
	 * Returns the proposta matching the UUID and group.
	 *
	 * @param uuid the proposta's UUID
	 * @param groupId the primary key of the group
	 * @return the matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	public static Proposta fetchPropostaByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchPropostaByUuidAndGroupId(uuid, groupId);
	}

	public static List<Proposta> findByCpfCnpj(String cpfCnpj) {
		return getService().findByCpfCnpj(cpfCnpj);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
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
	 * Returns the proposta with the primary key.
	 *
	 * @param propostaId the primary key of the proposta
	 * @return the proposta
	 * @throws PortalException if a proposta with the primary key could not be found
	 */
	public static Proposta getProposta(long propostaId) throws PortalException {
		return getService().getProposta(propostaId);
	}

	/**
	 * Returns the proposta matching the UUID and group.
	 *
	 * @param uuid the proposta's UUID
	 * @param groupId the primary key of the group
	 * @return the matching proposta
	 * @throws PortalException if a matching proposta could not be found
	 */
	public static Proposta getPropostaByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getPropostaByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @return the range of propostas
	 */
	public static List<Proposta> getPropostas(int start, int end) {
		return getService().getPropostas(start, end);
	}

	/**
	 * Returns all the propostas matching the UUID and company.
	 *
	 * @param uuid the UUID of the propostas
	 * @param companyId the primary key of the company
	 * @return the matching propostas, or an empty list if no matches were found
	 */
	public static List<Proposta> getPropostasByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getPropostasByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of propostas matching the UUID and company.
	 *
	 * @param uuid the UUID of the propostas
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching propostas, or an empty list if no matches were found
	 */
	public static List<Proposta> getPropostasByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Proposta> orderByComparator) {

		return getService().getPropostasByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of propostas.
	 *
	 * @return the number of propostas
	 */
	public static int getPropostasCount() {
		return getService().getPropostasCount();
	}

	public static Proposta updateProposta(
			long propostaId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long dadosContribuinteId, long administradorJudicialId,
			long advogadoId, String fundamentacaoPedido,
			boolean cumpreCompromissos, boolean naoAlienacaoBensSemComunicacao,
			boolean reconheceGrupoOuSucessao, String status,
			String numeroProtocoloSei, String documentosCompletosURL,
			long propostaPaiId)
		throws PortalException {

		return getService().updateProposta(
			propostaId, serviceContext, dadosContribuinteId,
			administradorJudicialId, advogadoId, fundamentacaoPedido,
			cumpreCompromissos, naoAlienacaoBensSemComunicacao,
			reconheceGrupoOuSucessao, status, numeroProtocoloSei,
			documentosCompletosURL, propostaPaiId);
	}

	/**
	 * Updates the proposta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param proposta the proposta
	 * @return the proposta that was updated
	 */
	public static Proposta updateProposta(Proposta proposta) {
		return getService().updateProposta(proposta);
	}

	public static PropostaLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<PropostaLocalService> _serviceSnapshot =
		new Snapshot<>(
			PropostaLocalServiceUtil.class, PropostaLocalService.class);

}