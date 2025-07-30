/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_BensDireitosRequerente&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see BensDireitosRequerente
 * @generated
 */
public class BensDireitosRequerenteTable
	extends BaseTable<BensDireitosRequerenteTable> {

	public static final BensDireitosRequerenteTable INSTANCE =
		new BensDireitosRequerenteTable();

	public final Column<BensDireitosRequerenteTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BensDireitosRequerenteTable, Long> bemId = createColumn(
		"bemId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<BensDireitosRequerenteTable, Long> propostaId =
		createColumn(
			"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BensDireitosRequerenteTable, String> descricao =
		createColumn(
			"descricao", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BensDireitosRequerenteTable, String>
		localizacaoDestinacao = createColumn(
			"localizacaoDestinacao", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private BensDireitosRequerenteTable() {
		super("GDF_BensDireitosRequerente", BensDireitosRequerenteTable::new);
	}

}