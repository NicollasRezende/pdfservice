/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AdministradorJudicial service. Represents a row in the &quot;GDF_AdministradorJudicial&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AdministradorJudicialModel
 * @generated
 */
@ImplementationClassName(
	"br.com.seatecnologia.gdf.negocia.model.impl.AdministradorJudicialImpl"
)
@ProviderType
public interface AdministradorJudicial
	extends AdministradorJudicialModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>br.com.seatecnologia.gdf.negocia.model.impl.AdministradorJudicialImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AdministradorJudicial, Long>
		ADMINISTRADOR_JUDICIAL_ID_ACCESSOR =
			new Accessor<AdministradorJudicial, Long>() {

				@Override
				public Long get(AdministradorJudicial administradorJudicial) {
					return administradorJudicial.getAdministradorJudicialId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AdministradorJudicial> getTypeClass() {
					return AdministradorJudicial.class;
				}

			};

}