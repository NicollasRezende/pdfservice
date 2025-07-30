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
 * The table class for the &quot;GDF_Edital&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Edital
 * @generated
 */
public class EditalTable extends BaseTable<EditalTable> {

	public static final EditalTable INSTANCE = new EditalTable();

	public final Column<EditalTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EditalTable, Long> editalId = createColumn(
		"editalId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<EditalTable, String> titulo = createColumn(
		"titulo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EditalTable, String> descricao = createColumn(
		"descricao", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EditalTable, Long> arquivo = createColumn(
		"arquivo", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EditalTable, Date> dataInicio = createColumn(
		"dataInicio", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<EditalTable, Date> dataFim = createColumn(
		"dataFim", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private EditalTable() {
		super("GDF_Edital", EditalTable::new);
	}

}