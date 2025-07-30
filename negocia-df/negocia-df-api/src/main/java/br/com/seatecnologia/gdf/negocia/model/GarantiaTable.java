/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_Garantia&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Garantia
 * @generated
 */
public class GarantiaTable extends BaseTable<GarantiaTable> {

	public static final GarantiaTable INSTANCE = new GarantiaTable();

	public final Column<GarantiaTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GarantiaTable, Long> garantiaId = createColumn(
		"garantiaId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<GarantiaTable, Long> propostaId = createColumn(
		"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<GarantiaTable, String> tipoGarantia = createColumn(
		"tipoGarantia", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GarantiaTable, String> tipoDevedor = createColumn(
		"tipoDevedor", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GarantiaTable, String> outras = createColumn(
		"outras", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GarantiaTable, String> descricaoBem = createColumn(
		"descricaoBem", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GarantiaTable, Long> proprietarioQualificacao =
		createColumn(
			"proprietarioQualificacao", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<GarantiaTable, Double> valorEstimado = createColumn(
		"valorEstimado", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<GarantiaTable, Long> dadosRegistroId = createColumn(
		"dadosRegistroId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<GarantiaTable, String> localizacao = createColumn(
		"localizacao", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GarantiaTable, Boolean> declaracaoAnuencia =
		createColumn(
			"declaracaoAnuencia", Boolean.class, Types.BOOLEAN,
			Column.FLAG_DEFAULT);
	public final Column<GarantiaTable, Long> declaracao = createColumn(
		"declaracao", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private GarantiaTable() {
		super("GDF_Garantia", GarantiaTable::new);
	}

}