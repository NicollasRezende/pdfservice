/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_CredorProposta&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CredorProposta
 * @generated
 */
public class CredorPropostaTable extends BaseTable<CredorPropostaTable> {

	public static final CredorPropostaTable INSTANCE =
		new CredorPropostaTable();

	public final Column<CredorPropostaTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CredorPropostaTable, Long> credorPropostaId =
		createColumn(
			"credorPropostaId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<CredorPropostaTable, Long> propostaId = createColumn(
		"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CredorPropostaTable, Long> credorId = createColumn(
		"credorId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private CredorPropostaTable() {
		super("GDF_CredorProposta", CredorPropostaTable::new);
	}

}