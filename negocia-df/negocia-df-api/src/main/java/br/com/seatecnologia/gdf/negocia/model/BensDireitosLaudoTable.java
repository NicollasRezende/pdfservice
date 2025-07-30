/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_BensDireitosLaudo&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see BensDireitosLaudo
 * @generated
 */
public class BensDireitosLaudoTable extends BaseTable<BensDireitosLaudoTable> {

	public static final BensDireitosLaudoTable INSTANCE =
		new BensDireitosLaudoTable();

	public final Column<BensDireitosLaudoTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BensDireitosLaudoTable, Long> bensDireitosLaudoId =
		createColumn(
			"bensDireitosLaudoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<BensDireitosLaudoTable, Long> bemId = createColumn(
		"bemId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BensDireitosLaudoTable, Long> laudoAvaliacao =
		createColumn(
			"laudoAvaliacao", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private BensDireitosLaudoTable() {
		super("GDF_BensDireitosLaudo", BensDireitosLaudoTable::new);
	}

}