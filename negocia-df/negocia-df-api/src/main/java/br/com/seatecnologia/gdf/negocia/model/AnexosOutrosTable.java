/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_AnexosOutros&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AnexosOutros
 * @generated
 */
public class AnexosOutrosTable extends BaseTable<AnexosOutrosTable> {

	public static final AnexosOutrosTable INSTANCE = new AnexosOutrosTable();

	public final Column<AnexosOutrosTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AnexosOutrosTable, Long> anexosOutrosId = createColumn(
		"anexosOutrosId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AnexosOutrosTable, Long> dadosRegistroId = createColumn(
		"dadosRegistroId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AnexosOutrosTable, Long> outrosAnexo = createColumn(
		"outrosAnexo", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AnexosOutrosTable() {
		super("GDF_AnexosOutros", AnexosOutrosTable::new);
	}

}