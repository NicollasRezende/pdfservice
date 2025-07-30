/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_BemDireitoAdicional&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see BemDireitoAdicional
 * @generated
 */
public class BemDireitoAdicionalTable
	extends BaseTable<BemDireitoAdicionalTable> {

	public static final BemDireitoAdicionalTable INSTANCE =
		new BemDireitoAdicionalTable();

	public final Column<BemDireitoAdicionalTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BemDireitoAdicionalTable, Long> bemId = createColumn(
		"bemId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<BemDireitoAdicionalTable, Long> propostaId =
		createColumn(
			"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BemDireitoAdicionalTable, String> descricao =
		createColumn(
			"descricao", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BemDireitoAdicionalTable, String> localizacao =
		createColumn(
			"localizacao", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BemDireitoAdicionalTable, String> destinacao =
		createColumn(
			"destinacao", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BemDireitoAdicionalTable, String> laudoAvaliacao =
		createColumn(
			"laudoAvaliacao", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private BemDireitoAdicionalTable() {
		super("GDF_BemDireitoAdicional", BemDireitoAdicionalTable::new);
	}

}