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
 * The extended model interface for the DemaisPartes service. Represents a row in the &quot;GDF_DemaisPartes&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DemaisPartesModel
 * @generated
 */
@ImplementationClassName(
	"br.com.seatecnologia.gdf.negocia.model.impl.DemaisPartesImpl"
)
@ProviderType
public interface DemaisPartes extends DemaisPartesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>br.com.seatecnologia.gdf.negocia.model.impl.DemaisPartesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<DemaisPartes, Long> DEMAIS_PARTES_ID_ACCESSOR =
		new Accessor<DemaisPartes, Long>() {

			@Override
			public Long get(DemaisPartes demaisPartes) {
				return demaisPartes.getDemaisPartesId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<DemaisPartes> getTypeClass() {
				return DemaisPartes.class;
			}

		};

}