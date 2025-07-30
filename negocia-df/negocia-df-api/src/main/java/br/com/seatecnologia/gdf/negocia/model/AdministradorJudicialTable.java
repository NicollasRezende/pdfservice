/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_AdministradorJudicial&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AdministradorJudicial
 * @generated
 */
public class AdministradorJudicialTable
	extends BaseTable<AdministradorJudicialTable> {

	public static final AdministradorJudicialTable INSTANCE =
		new AdministradorJudicialTable();

	public final Column<AdministradorJudicialTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AdministradorJudicialTable, Long>
		administradorJudicialId = createColumn(
			"administradorJudicialId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AdministradorJudicialTable, Long> qualificacaoId =
		createColumn(
			"qualificacaoId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AdministradorJudicialTable, Boolean> regimeFalencia =
		createColumn(
			"regimeFalencia", Boolean.class, Types.BOOLEAN,
			Column.FLAG_DEFAULT);
	public final Column<AdministradorJudicialTable, String> recuperacao =
		createColumn(
			"recuperacao", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AdministradorJudicialTable, String> numeroProcesso =
		createColumn(
			"numeroProcesso", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AdministradorJudicialTable, Long> anexoRecuperacao =
		createColumn(
			"anexoRecuperacao", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AdministradorJudicialTable() {
		super("GDF_AdministradorJudicial", AdministradorJudicialTable::new);
	}

}