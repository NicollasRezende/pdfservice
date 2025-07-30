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
 * The extended model interface for the DemonstracaoContabil service. Represents a row in the &quot;GDF_DemonstracaoContabil&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DemonstracaoContabilModel
 * @generated
 */
@ImplementationClassName(
	"br.com.seatecnologia.gdf.negocia.model.impl.DemonstracaoContabilImpl"
)
@ProviderType
public interface DemonstracaoContabil
	extends DemonstracaoContabilModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>br.com.seatecnologia.gdf.negocia.model.impl.DemonstracaoContabilImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<DemonstracaoContabil, Long>
		DEMONSTRACAO_ID_ACCESSOR = new Accessor<DemonstracaoContabil, Long>() {

			@Override
			public Long get(DemonstracaoContabil demonstracaoContabil) {
				return demonstracaoContabil.getDemonstracaoId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<DemonstracaoContabil> getTypeClass() {
				return DemonstracaoContabil.class;
			}

		};

}