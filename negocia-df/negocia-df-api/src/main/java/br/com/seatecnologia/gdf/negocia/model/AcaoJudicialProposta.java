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
 * The extended model interface for the AcaoJudicialProposta service. Represents a row in the &quot;GDF_AcaoJudicialProposta&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AcaoJudicialPropostaModel
 * @generated
 */
@ImplementationClassName(
	"br.com.seatecnologia.gdf.negocia.model.impl.AcaoJudicialPropostaImpl"
)
@ProviderType
public interface AcaoJudicialProposta
	extends AcaoJudicialPropostaModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>br.com.seatecnologia.gdf.negocia.model.impl.AcaoJudicialPropostaImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AcaoJudicialProposta, Long>
		ACAO_PROPOSTA_ID_ACCESSOR = new Accessor<AcaoJudicialProposta, Long>() {

			@Override
			public Long get(AcaoJudicialProposta acaoJudicialProposta) {
				return acaoJudicialProposta.getAcaoPropostaId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AcaoJudicialProposta> getTypeClass() {
				return AcaoJudicialProposta.class;
			}

		};

}