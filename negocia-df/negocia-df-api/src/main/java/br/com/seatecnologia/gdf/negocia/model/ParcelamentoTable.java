/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;GDF_Parcelamento&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Parcelamento
 * @generated
 */
public class ParcelamentoTable extends BaseTable<ParcelamentoTable> {

	public static final ParcelamentoTable INSTANCE = new ParcelamentoTable();

	public final Column<ParcelamentoTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ParcelamentoTable, Long> parcelamentoId = createColumn(
		"parcelamentoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ParcelamentoTable, Long> propostaId = createColumn(
		"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ParcelamentoTable, Integer> numeroParcelas =
		createColumn(
			"numeroParcelas", Integer.class, Types.INTEGER,
			Column.FLAG_DEFAULT);
	public final Column<ParcelamentoTable, Double> valorEntrada = createColumn(
		"valorEntrada", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<ParcelamentoTable, Date> dataPrimeiraParcela =
		createColumn(
			"dataPrimeiraParcela", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<ParcelamentoTable, Double> valorPrimeiraParcela =
		createColumn(
			"valorPrimeiraParcela", Double.class, Types.DOUBLE,
			Column.FLAG_DEFAULT);

	private ParcelamentoTable() {
		super("GDF_Parcelamento", ParcelamentoTable::new);
	}

}