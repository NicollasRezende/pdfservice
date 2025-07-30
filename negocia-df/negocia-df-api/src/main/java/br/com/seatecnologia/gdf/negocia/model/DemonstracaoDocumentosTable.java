/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_DemonstracaoDocumentos&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see DemonstracaoDocumentos
 * @generated
 */
public class DemonstracaoDocumentosTable
	extends BaseTable<DemonstracaoDocumentosTable> {

	public static final DemonstracaoDocumentosTable INSTANCE =
		new DemonstracaoDocumentosTable();

	public final Column<DemonstracaoDocumentosTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DemonstracaoDocumentosTable, Long>
		demonstracaoDocumentosId = createColumn(
			"demonstracaoDocumentosId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<DemonstracaoDocumentosTable, Long> demonstracaoId =
		createColumn(
			"demonstracaoId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DemonstracaoDocumentosTable, Integer> tipoDocumento =
		createColumn(
			"tipoDocumento", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);

	private DemonstracaoDocumentosTable() {
		super("GDF_DemonstracaoDocumentos", DemonstracaoDocumentosTable::new);
	}

}