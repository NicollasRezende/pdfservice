/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_Procuracao&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Procuracao
 * @generated
 */
public class ProcuracaoTable extends BaseTable<ProcuracaoTable> {

	public static final ProcuracaoTable INSTANCE = new ProcuracaoTable();

	public final Column<ProcuracaoTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProcuracaoTable, Long> procuracaoId = createColumn(
		"procuracaoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ProcuracaoTable, Long> propostaId = createColumn(
		"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProcuracaoTable, Long> procuracao = createColumn(
		"procuracao", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private ProcuracaoTable() {
		super("GDF_Procuracao", ProcuracaoTable::new);
	}

}