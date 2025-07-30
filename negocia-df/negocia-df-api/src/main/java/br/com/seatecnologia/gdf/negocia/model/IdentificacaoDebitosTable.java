/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_IdentificacaoDebitos&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see IdentificacaoDebitos
 * @generated
 */
public class IdentificacaoDebitosTable
	extends BaseTable<IdentificacaoDebitosTable> {

	public static final IdentificacaoDebitosTable INSTANCE =
		new IdentificacaoDebitosTable();

	public final Column<IdentificacaoDebitosTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<IdentificacaoDebitosTable, Long>
		identificacaoDebitosId = createColumn(
			"identificacaoDebitosId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<IdentificacaoDebitosTable, Long> fundamentacaoId =
		createColumn(
			"fundamentacaoId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<IdentificacaoDebitosTable, String> natureza =
		createColumn(
			"natureza", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<IdentificacaoDebitosTable, String> situacao =
		createColumn(
			"situacao", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<IdentificacaoDebitosTable, String>
		inscricaoDividaAtiva = createColumn(
			"inscricaoDividaAtiva", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<IdentificacaoDebitosTable, String>
		garantidoJudicialmente = createColumn(
			"garantidoJudicialmente", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private IdentificacaoDebitosTable() {
		super("GDF_IdentificacaoDebitos", IdentificacaoDebitosTable::new);
	}

}