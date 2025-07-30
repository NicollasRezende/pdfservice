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
 * The table class for the &quot;GDF_ComprovanteHonorario&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ComprovanteHonorario
 * @generated
 */
public class ComprovanteHonorarioTable
	extends BaseTable<ComprovanteHonorarioTable> {

	public static final ComprovanteHonorarioTable INSTANCE =
		new ComprovanteHonorarioTable();

	public final Column<ComprovanteHonorarioTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ComprovanteHonorarioTable, Long> comprovanteId =
		createColumn(
			"comprovanteId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ComprovanteHonorarioTable, Long> propostaId =
		createColumn(
			"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ComprovanteHonorarioTable, Double> valorPago =
		createColumn(
			"valorPago", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<ComprovanteHonorarioTable, Date> dataPagamento =
		createColumn(
			"dataPagamento", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ComprovanteHonorarioTable, Long> fileEntryId =
		createColumn(
			"fileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private ComprovanteHonorarioTable() {
		super("GDF_ComprovanteHonorario", ComprovanteHonorarioTable::new);
	}

}