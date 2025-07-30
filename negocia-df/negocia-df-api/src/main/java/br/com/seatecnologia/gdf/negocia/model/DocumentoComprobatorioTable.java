/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_DocumentoComprobatorio&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see DocumentoComprobatorio
 * @generated
 */
public class DocumentoComprobatorioTable
	extends BaseTable<DocumentoComprobatorioTable> {

	public static final DocumentoComprobatorioTable INSTANCE =
		new DocumentoComprobatorioTable();

	public final Column<DocumentoComprobatorioTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DocumentoComprobatorioTable, Long> documentoId =
		createColumn(
			"documentoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DocumentoComprobatorioTable, Long> fundamentacaoId =
		createColumn(
			"fundamentacaoId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DocumentoComprobatorioTable, Long> fileEntryId =
		createColumn(
			"fileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private DocumentoComprobatorioTable() {
		super("GDF_DocumentoComprobatorio", DocumentoComprobatorioTable::new);
	}

}