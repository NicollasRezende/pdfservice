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
 * The extended model interface for the Edital service. Represents a row in the &quot;GDF_Edital&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see EditalModel
 * @generated
 */
@ImplementationClassName(
	"br.com.seatecnologia.gdf.negocia.model.impl.EditalImpl"
)
@ProviderType
public interface Edital extends EditalModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>br.com.seatecnologia.gdf.negocia.model.impl.EditalImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Edital, Long> EDITAL_ID_ACCESSOR =
		new Accessor<Edital, Long>() {

			@Override
			public Long get(Edital edital) {
				return edital.getEditalId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Edital> getTypeClass() {
				return Edital.class;
			}

		};

	public String getArquivoURL();

}