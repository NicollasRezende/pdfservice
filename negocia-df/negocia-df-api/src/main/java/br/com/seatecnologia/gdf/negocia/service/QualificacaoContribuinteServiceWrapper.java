/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QualificacaoContribuinteService}.
 *
 * @author Brian Wing Shun Chan
 * @see QualificacaoContribuinteService
 * @generated
 */
public class QualificacaoContribuinteServiceWrapper
	implements QualificacaoContribuinteService,
			   ServiceWrapper<QualificacaoContribuinteService> {

	public QualificacaoContribuinteServiceWrapper() {
		this(null);
	}

	public QualificacaoContribuinteServiceWrapper(
		QualificacaoContribuinteService qualificacaoContribuinteService) {

		_qualificacaoContribuinteService = qualificacaoContribuinteService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _qualificacaoContribuinteService.getOSGiServiceIdentifier();
	}

	@Override
	public QualificacaoContribuinteService getWrappedService() {
		return _qualificacaoContribuinteService;
	}

	@Override
	public void setWrappedService(
		QualificacaoContribuinteService qualificacaoContribuinteService) {

		_qualificacaoContribuinteService = qualificacaoContribuinteService;
	}

	private QualificacaoContribuinteService _qualificacaoContribuinteService;

}