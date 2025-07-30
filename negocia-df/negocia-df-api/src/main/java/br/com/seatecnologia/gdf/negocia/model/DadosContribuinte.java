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
 * The extended model interface for the DadosContribuinte service. Represents a row in the &quot;GDF_DadosContribuinte&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DadosContribuinteModel
 * @generated
 */
@ImplementationClassName(
	"br.com.seatecnologia.gdf.negocia.model.impl.DadosContribuinteImpl"
)
@ProviderType
public interface DadosContribuinte
	extends DadosContribuinteModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>br.com.seatecnologia.gdf.negocia.model.impl.DadosContribuinteImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<DadosContribuinte, Long>
		DADOS_CONTRIBUINTE_ID_ACCESSOR =
			new Accessor<DadosContribuinte, Long>() {

				@Override
				public Long get(DadosContribuinte dadosContribuinte) {
					return dadosContribuinte.getDadosContribuinteId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<DadosContribuinte> getTypeClass() {
					return DadosContribuinte.class;
				}

			};

}