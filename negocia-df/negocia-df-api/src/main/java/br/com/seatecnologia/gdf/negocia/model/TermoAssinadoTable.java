/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_TermoAssinado&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TermoAssinado
 * @generated
 */
public class TermoAssinadoTable extends BaseTable<TermoAssinadoTable> {

	public static final TermoAssinadoTable INSTANCE = new TermoAssinadoTable();

	public final Column<TermoAssinadoTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TermoAssinadoTable, Long> termoId = createColumn(
		"termoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<TermoAssinadoTable, Long> propostaId = createColumn(
		"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TermoAssinadoTable, String> urlTermo = createColumn(
		"urlTermo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TermoAssinadoTable, String> arquivoPdf = createColumn(
		"arquivoPdf", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TermoAssinadoTable, String> parte = createColumn(
		"parte", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private TermoAssinadoTable() {
		super("GDF_TermoAssinado", TermoAssinadoTable::new);
	}

}