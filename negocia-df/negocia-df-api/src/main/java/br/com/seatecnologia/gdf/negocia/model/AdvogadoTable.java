/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_Advogado&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Advogado
 * @generated
 */
public class AdvogadoTable extends BaseTable<AdvogadoTable> {

	public static final AdvogadoTable INSTANCE = new AdvogadoTable();

	public final Column<AdvogadoTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AdvogadoTable, Long> advogadoId = createColumn(
		"advogadoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AdvogadoTable, Long> qualificacaoId = createColumn(
		"qualificacaoId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AdvogadoTable, String> numeroOab = createColumn(
		"numeroOab", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AdvogadoTable, String> seccional = createColumn(
		"seccional", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AdvogadoTable, Long> carteirinhaOAB = createColumn(
		"carteirinhaOAB", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AdvogadoTable() {
		super("GDF_Advogado", AdvogadoTable::new);
	}

}