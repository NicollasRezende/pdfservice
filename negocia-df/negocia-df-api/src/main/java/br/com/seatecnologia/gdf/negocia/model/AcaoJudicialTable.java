/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_AcaoJudicial&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcaoJudicial
 * @generated
 */
public class AcaoJudicialTable extends BaseTable<AcaoJudicialTable> {

	public static final AcaoJudicialTable INSTANCE = new AcaoJudicialTable();

	public final Column<AcaoJudicialTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcaoJudicialTable, Long> acaoId = createColumn(
		"acaoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AcaoJudicialTable, String> orgaoTribunal = createColumn(
		"orgaoTribunal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcaoJudicialTable, String> numeroProcesso =
		createColumn(
			"numeroProcesso", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcaoJudicialTable, String> unidadeVara = createColumn(
		"unidadeVara", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcaoJudicialTable, String> parteAutora = createColumn(
		"parteAutora", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcaoJudicialTable, String> parteRe = createColumn(
		"parteRe", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcaoJudicialTable, String> observacoes = createColumn(
		"observacoes", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcaoJudicialTable, Long> propostaId = createColumn(
		"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AcaoJudicialTable() {
		super("GDF_AcaoJudicial", AcaoJudicialTable::new);
	}

}