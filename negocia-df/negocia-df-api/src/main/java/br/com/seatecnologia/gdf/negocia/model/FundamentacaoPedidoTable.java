/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_FundamentacaoPedido&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FundamentacaoPedido
 * @generated
 */
public class FundamentacaoPedidoTable
	extends BaseTable<FundamentacaoPedidoTable> {

	public static final FundamentacaoPedidoTable INSTANCE =
		new FundamentacaoPedidoTable();

	public final Column<FundamentacaoPedidoTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FundamentacaoPedidoTable, Long> fundamentacaoId =
		createColumn(
			"fundamentacaoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<FundamentacaoPedidoTable, Long> propostaId =
		createColumn(
			"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FundamentacaoPedidoTable, String> fundamentacaoPedido =
		createColumn(
			"fundamentacaoPedido", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private FundamentacaoPedidoTable() {
		super("GDF_FundamentacaoPedido", FundamentacaoPedidoTable::new);
	}

}