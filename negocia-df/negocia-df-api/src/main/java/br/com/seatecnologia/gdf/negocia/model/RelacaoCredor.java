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
 * The extended model interface for the RelacaoCredor service. Represents a row in the &quot;GDF_RelacaoCredor&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RelacaoCredorModel
 * @generated
 */
@ImplementationClassName(
	"br.com.seatecnologia.gdf.negocia.model.impl.RelacaoCredorImpl"
)
@ProviderType
public interface RelacaoCredor extends PersistedModel, RelacaoCredorModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>br.com.seatecnologia.gdf.negocia.model.impl.RelacaoCredorImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RelacaoCredor, Long> CREDOR_ID_ACCESSOR =
		new Accessor<RelacaoCredor, Long>() {

			@Override
			public Long get(RelacaoCredor relacaoCredor) {
				return relacaoCredor.getCredorId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<RelacaoCredor> getTypeClass() {
				return RelacaoCredor.class;
			}

		};

}