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
 * The table class for the &quot;GDF_DadosContribuinte&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see DadosContribuinte
 * @generated
 */
public class DadosContribuinteTable extends BaseTable<DadosContribuinteTable> {

	public static final DadosContribuinteTable INSTANCE =
		new DadosContribuinteTable();

	public final Column<DadosContribuinteTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DadosContribuinteTable, Long> dadosContribuinteId =
		createColumn(
			"dadosContribuinteId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<DadosContribuinteTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DadosContribuinteTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DadosContribuinteTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DadosContribuinteTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DadosContribuinteTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DadosContribuinteTable, Long> qualificacaoId =
		createColumn(
			"qualificacaoId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DadosContribuinteTable, Long> propostaId = createColumn(
		"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private DadosContribuinteTable() {
		super("GDF_DadosContribuinte", DadosContribuinteTable::new);
	}

}