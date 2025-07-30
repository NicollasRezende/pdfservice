/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.AcaoJudicialProposta;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AcaoJudicialProposta. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.AcaoJudicialPropostaLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AcaoJudicialPropostaLocalService
 * @generated
 */
public class AcaoJudicialPropostaLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.AcaoJudicialPropostaLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acao judicial proposta to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcaoJudicialPropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acaoJudicialProposta the acao judicial proposta
	 * @return the acao judicial proposta that was added
	 */
	public static AcaoJudicialProposta addAcaoJudicialProposta(
		AcaoJudicialProposta acaoJudicialProposta) {

		return getService().addAcaoJudicialProposta(acaoJudicialProposta);
	}

	/**
	 * Creates a new acao judicial proposta with the primary key. Does not add the acao judicial proposta to the database.
	 *
	 * @param acaoPropostaId the primary key for the new acao judicial proposta
	 * @return the new acao judicial proposta
	 */
	public static AcaoJudicialProposta createAcaoJudicialProposta(
		long acaoPropostaId) {

		return getService().createAcaoJudicialProposta(acaoPropostaId);
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
	 * Deletes the acao judicial proposta from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcaoJudicialPropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acaoJudicialProposta the acao judicial proposta
	 * @return the acao judicial proposta that was removed
	 */
	public static AcaoJudicialProposta deleteAcaoJudicialProposta(
		AcaoJudicialProposta acaoJudicialProposta) {

		return getService().deleteAcaoJudicialProposta(acaoJudicialProposta);
	}

	/**
	 * Deletes the acao judicial proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcaoJudicialPropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acaoPropostaId the primary key of the acao judicial proposta
	 * @return the acao judicial proposta that was removed
	 * @throws PortalException if a acao judicial proposta with the primary key could not be found
	 */
	public static AcaoJudicialProposta deleteAcaoJudicialProposta(
			long acaoPropostaId)
		throws PortalException {

		return getService().deleteAcaoJudicialProposta(acaoPropostaId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AcaoJudicialPropostaModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AcaoJudicialPropostaModelImpl</code>.
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

	public static AcaoJudicialProposta fetchAcaoJudicialProposta(
		long acaoPropostaId) {

		return getService().fetchAcaoJudicialProposta(acaoPropostaId);
	}

	/**
	 * Returns the acao judicial proposta with the primary key.
	 *
	 * @param acaoPropostaId the primary key of the acao judicial proposta
	 * @return the acao judicial proposta
	 * @throws PortalException if a acao judicial proposta with the primary key could not be found
	 */
	public static AcaoJudicialProposta getAcaoJudicialProposta(
			long acaoPropostaId)
		throws PortalException {

		return getService().getAcaoJudicialProposta(acaoPropostaId);
	}

	/**
	 * Returns a range of all the acao judicial propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.AcaoJudicialPropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acao judicial propostas
	 * @param end the upper bound of the range of acao judicial propostas (not inclusive)
	 * @return the range of acao judicial propostas
	 */
	public static List<AcaoJudicialProposta> getAcaoJudicialPropostas(
		int start, int end) {

		return getService().getAcaoJudicialPropostas(start, end);
	}

	/**
	 * Returns the number of acao judicial propostas.
	 *
	 * @return the number of acao judicial propostas
	 */
	public static int getAcaoJudicialPropostasCount() {
		return getService().getAcaoJudicialPropostasCount();
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
	 * Updates the acao judicial proposta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcaoJudicialPropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acaoJudicialProposta the acao judicial proposta
	 * @return the acao judicial proposta that was updated
	 */
	public static AcaoJudicialProposta updateAcaoJudicialProposta(
		AcaoJudicialProposta acaoJudicialProposta) {

		return getService().updateAcaoJudicialProposta(acaoJudicialProposta);
	}

	public static AcaoJudicialPropostaLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AcaoJudicialPropostaLocalService>
		_serviceSnapshot = new Snapshot<>(
			AcaoJudicialPropostaLocalServiceUtil.class,
			AcaoJudicialPropostaLocalService.class);

}