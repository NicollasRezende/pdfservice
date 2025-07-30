/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_DemonstracaoContabil&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see DemonstracaoContabil
 * @generated
 */
public class DemonstracaoContabilTable
	extends BaseTable<DemonstracaoContabilTable> {

	public static final DemonstracaoContabilTable INSTANCE =
		new DemonstracaoContabilTable();

	public final Column<DemonstracaoContabilTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DemonstracaoContabilTable, Long> demonstracaoId =
		createColumn(
			"demonstracaoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DemonstracaoContabilTable, Long> propostaId =
		createColumn(
			"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DemonstracaoContabilTable, Long> fileEntryId =
		createColumn(
			"fileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DemonstracaoContabilTable, Integer> tipoDocumento =
		createColumn(
			"tipoDocumento", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);

	private DemonstracaoContabilTable() {
		super("GDF_DemonstracaoContabil", DemonstracaoContabilTable::new);
	}

}