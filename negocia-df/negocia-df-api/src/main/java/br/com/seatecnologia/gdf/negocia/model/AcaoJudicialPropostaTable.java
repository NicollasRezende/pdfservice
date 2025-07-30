/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_AcaoJudicialProposta&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcaoJudicialProposta
 * @generated
 */
public class AcaoJudicialPropostaTable
	extends BaseTable<AcaoJudicialPropostaTable> {

	public static final AcaoJudicialPropostaTable INSTANCE =
		new AcaoJudicialPropostaTable();

	public final Column<AcaoJudicialPropostaTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcaoJudicialPropostaTable, Long> acaoPropostaId =
		createColumn(
			"acaoPropostaId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AcaoJudicialPropostaTable, Long> propostaId =
		createColumn(
			"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcaoJudicialPropostaTable, Long> acaoId = createColumn(
		"acaoId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AcaoJudicialPropostaTable() {
		super("GDF_AcaoJudicialProposta", AcaoJudicialPropostaTable::new);
	}

}