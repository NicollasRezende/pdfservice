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
 * The table class for the &quot;GDF_QualificacaoContribuinte&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QualificacaoContribuinte
 * @generated
 */
public class QualificacaoContribuinteTable
	extends BaseTable<QualificacaoContribuinteTable> {

	public static final QualificacaoContribuinteTable INSTANCE =
		new QualificacaoContribuinteTable();

	public final Column<QualificacaoContribuinteTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualificacaoContribuinteTable, Long>
		qualificacaoContribuinteId = createColumn(
			"qualificacaoContribuinteId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<QualificacaoContribuinteTable, Long>
		dadosContribuinteId = createColumn(
			"dadosContribuinteId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<QualificacaoContribuinteTable, Long> qualificacaoId =
		createColumn(
			"qualificacaoId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualificacaoContribuinteTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QualificacaoContribuinteTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QualificacaoContribuinteTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualificacaoContribuinteTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualificacaoContribuinteTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualificacaoContribuinteTable, String>
		tipoQualificacao = createColumn(
			"tipoQualificacao", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private QualificacaoContribuinteTable() {
		super(
			"GDF_QualificacaoContribuinte", QualificacaoContribuinteTable::new);
	}

}