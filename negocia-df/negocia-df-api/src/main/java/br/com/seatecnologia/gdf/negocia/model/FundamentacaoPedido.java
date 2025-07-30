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
 * The extended model interface for the FundamentacaoPedido service. Represents a row in the &quot;GDF_FundamentacaoPedido&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FundamentacaoPedidoModel
 * @generated
 */
@ImplementationClassName(
	"br.com.seatecnologia.gdf.negocia.model.impl.FundamentacaoPedidoImpl"
)
@ProviderType
public interface FundamentacaoPedido
	extends FundamentacaoPedidoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>br.com.seatecnologia.gdf.negocia.model.impl.FundamentacaoPedidoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FundamentacaoPedido, Long>
		FUNDAMENTACAO_ID_ACCESSOR = new Accessor<FundamentacaoPedido, Long>() {

			@Override
			public Long get(FundamentacaoPedido fundamentacaoPedido) {
				return fundamentacaoPedido.getFundamentacaoId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<FundamentacaoPedido> getTypeClass() {
				return FundamentacaoPedido.class;
			}

		};

}