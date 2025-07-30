/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.RelacaoCredor;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for RelacaoCredor. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.RelacaoCredorLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RelacaoCredorLocalService
 * @generated
 */
public class RelacaoCredorLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.RelacaoCredorLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the relacao credor to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RelacaoCredorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param relacaoCredor the relacao credor
	 * @return the relacao credor that was added
	 */
	public static RelacaoCredor addRelacaoCredor(RelacaoCredor relacaoCredor) {
		return getService().addRelacaoCredor(relacaoCredor);
	}

	public static RelacaoCredor addRelacaoCredor(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long propostaId, String nomeCredor, String naturezaCredito,
		String classificacaoCredito, double valorAtualizado,
		String referenciaContabil) {

		return getService().addRelacaoCredor(
			serviceContext, propostaId, nomeCredor, naturezaCredito,
			classificacaoCredito, valorAtualizado, referenciaContabil);
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
	 * Creates a new relacao credor with the primary key. Does not add the relacao credor to the database.
	 *
	 * @param credorId the primary key for the new relacao credor
	 * @return the new relacao credor
	 */
	public static RelacaoCredor createRelacaoCredor(long credorId) {
		return getService().createRelacaoCredor(credorId);
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
	 * Deletes the relacao credor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RelacaoCredorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param credorId the primary key of the relacao credor
	 * @return the relacao credor that was removed
	 * @throws PortalException if a relacao credor with the primary key could not be found
	 */
	public static RelacaoCredor deleteRelacaoCredor(long credorId)
		throws PortalException {

		return getService().deleteRelacaoCredor(credorId);
	}

	/**
	 * Deletes the relacao credor from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RelacaoCredorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param relacaoCredor the relacao credor
	 * @return the relacao credor that was removed
	 */
	public static RelacaoCredor deleteRelacaoCredor(
		RelacaoCredor relacaoCredor) {

		return getService().deleteRelacaoCredor(relacaoCredor);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.RelacaoCredorModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.RelacaoCredorModelImpl</code>.
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

	public static RelacaoCredor fetchRelacaoCredor(long credorId) {
		return getService().fetchRelacaoCredor(credorId);
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
	 * Returns the relacao credor with the primary key.
	 *
	 * @param credorId the primary key of the relacao credor
	 * @return the relacao credor
	 * @throws PortalException if a relacao credor with the primary key could not be found
	 */
	public static RelacaoCredor getRelacaoCredor(long credorId)
		throws PortalException {

		return getService().getRelacaoCredor(credorId);
	}

	/**
	 * Returns a range of all the relacao credors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.RelacaoCredorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of relacao credors
	 * @param end the upper bound of the range of relacao credors (not inclusive)
	 * @return the range of relacao credors
	 */
	public static List<RelacaoCredor> getRelacaoCredors(int start, int end) {
		return getService().getRelacaoCredors(start, end);
	}

	/**
	 * Returns the number of relacao credors.
	 *
	 * @return the number of relacao credors
	 */
	public static int getRelacaoCredorsCount() {
		return getService().getRelacaoCredorsCount();
	}

	public static List<RelacaoCredor> getRelacoesCredorByPropostaId(
		long propostaId) {

		return getService().getRelacoesCredorByPropostaId(propostaId);
	}

	public static RelacaoCredor updateRelacaoCredor(
		long credorId, long propostaId, String nomeCredor,
		String naturezaCredito, String classificacaoCredito,
		double valorAtualizado, String referenciaRegistro) {

		return getService().updateRelacaoCredor(
			credorId, propostaId, nomeCredor, naturezaCredito,
			classificacaoCredito, valorAtualizado, referenciaRegistro);
	}

	/**
	 * Updates the relacao credor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RelacaoCredorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param relacaoCredor the relacao credor
	 * @return the relacao credor that was updated
	 */
	public static RelacaoCredor updateRelacaoCredor(
		RelacaoCredor relacaoCredor) {

		return getService().updateRelacaoCredor(relacaoCredor);
	}

	public static RelacaoCredorLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<RelacaoCredorLocalService> _serviceSnapshot =
		new Snapshot<>(
			RelacaoCredorLocalServiceUtil.class,
			RelacaoCredorLocalService.class);

}