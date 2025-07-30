/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_DemaisPartes&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see DemaisPartes
 * @generated
 */
public class DemaisPartesTable extends BaseTable<DemaisPartesTable> {

	public static final DemaisPartesTable INSTANCE = new DemaisPartesTable();

	public final Column<DemaisPartesTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DemaisPartesTable, Long> demaisPartesId = createColumn(
		"demaisPartesId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DemaisPartesTable, Long> qualificacaoId = createColumn(
		"qualificacaoId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DemaisPartesTable, Long> propostaId = createColumn(
		"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DemaisPartesTable, String> tipoParte = createColumn(
		"tipoParte", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private DemaisPartesTable() {
		super("GDF_DemaisPartes", DemaisPartesTable::new);
	}

}