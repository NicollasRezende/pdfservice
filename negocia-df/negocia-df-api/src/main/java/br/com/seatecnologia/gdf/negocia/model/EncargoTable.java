/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_Encargo&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Encargo
 * @generated
 */
public class EncargoTable extends BaseTable<EncargoTable> {

	public static final EncargoTable INSTANCE = new EncargoTable();

	public final Column<EncargoTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EncargoTable, Long> encargoId = createColumn(
		"encargoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<EncargoTable, Long> propostaId = createColumn(
		"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EncargoTable, Double> valorEncargos = createColumn(
		"valorEncargos", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<EncargoTable, String> descricaoEncargos = createColumn(
		"descricaoEncargos", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private EncargoTable() {
		super("GDF_Encargo", EncargoTable::new);
	}

}