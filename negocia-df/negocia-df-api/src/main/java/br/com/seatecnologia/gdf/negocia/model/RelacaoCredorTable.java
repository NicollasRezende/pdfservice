/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_RelacaoCredor&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see RelacaoCredor
 * @generated
 */
public class RelacaoCredorTable extends BaseTable<RelacaoCredorTable> {

	public static final RelacaoCredorTable INSTANCE = new RelacaoCredorTable();

	public final Column<RelacaoCredorTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RelacaoCredorTable, Long> credorId = createColumn(
		"credorId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<RelacaoCredorTable, Long> propostaId = createColumn(
		"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RelacaoCredorTable, String> nomeCredor = createColumn(
		"nomeCredor", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RelacaoCredorTable, String> naturezaCredito =
		createColumn(
			"naturezaCredito", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RelacaoCredorTable, String> classificacaoCredito =
		createColumn(
			"classificacaoCredito", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RelacaoCredorTable, Double> valorAtualizado =
		createColumn(
			"valorAtualizado", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<RelacaoCredorTable, String> referenciaContabil =
		createColumn(
			"referenciaContabil", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private RelacaoCredorTable() {
		super("GDF_RelacaoCredor", RelacaoCredorTable::new);
	}

}