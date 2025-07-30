/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_DadosRegistro&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see DadosRegistro
 * @generated
 */
public class DadosRegistroTable extends BaseTable<DadosRegistroTable> {

	public static final DadosRegistroTable INSTANCE = new DadosRegistroTable();

	public final Column<DadosRegistroTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DadosRegistroTable, Long> dadosRegistroId =
		createColumn(
			"dadosRegistroId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DadosRegistroTable, Long> garantiaId = createColumn(
		"garantiaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DadosRegistroTable, String> matriculaImovel =
		createColumn(
			"matriculaImovel", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DadosRegistroTable, String> cartorioRegistro =
		createColumn(
			"cartorioRegistro", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DadosRegistroTable, String> renavam = createColumn(
		"renavam", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DadosRegistroTable, String> localizacao = createColumn(
		"localizacao", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private DadosRegistroTable() {
		super("GDF_DadosRegistro", DadosRegistroTable::new);
	}

}