/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_ConcessaoDf&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ConcessaoDf
 * @generated
 */
public class ConcessaoDfTable extends BaseTable<ConcessaoDfTable> {

	public static final ConcessaoDfTable INSTANCE = new ConcessaoDfTable();

	public final Column<ConcessaoDfTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ConcessaoDfTable, Long> concessaoId = createColumn(
		"concessaoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ConcessaoDfTable, Long> propostaId = createColumn(
		"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ConcessaoDfTable, Double> percentualDescontoJuros =
		createColumn(
			"percentualDescontoJuros", Double.class, Types.DOUBLE,
			Column.FLAG_DEFAULT);
	public final Column<ConcessaoDfTable, Double> percentualDescontoPrincipal =
		createColumn(
			"percentualDescontoPrincipal", Double.class, Types.DOUBLE,
			Column.FLAG_DEFAULT);
	public final Column<ConcessaoDfTable, String> observacoes = createColumn(
		"observacoes", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private ConcessaoDfTable() {
		super("GDF_ConcessaoDf", ConcessaoDfTable::new);
	}

}