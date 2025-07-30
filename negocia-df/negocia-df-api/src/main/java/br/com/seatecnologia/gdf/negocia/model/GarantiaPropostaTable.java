/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_GarantiaProposta&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see GarantiaProposta
 * @generated
 */
public class GarantiaPropostaTable extends BaseTable<GarantiaPropostaTable> {

	public static final GarantiaPropostaTable INSTANCE =
		new GarantiaPropostaTable();

	public final Column<GarantiaPropostaTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GarantiaPropostaTable, Long> garantiaPropostaId =
		createColumn(
			"garantiaPropostaId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<GarantiaPropostaTable, Long> propostaId = createColumn(
		"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<GarantiaPropostaTable, Long> garantiaId = createColumn(
		"garantiaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private GarantiaPropostaTable() {
		super("GDF_GarantiaProposta", GarantiaPropostaTable::new);
	}

}