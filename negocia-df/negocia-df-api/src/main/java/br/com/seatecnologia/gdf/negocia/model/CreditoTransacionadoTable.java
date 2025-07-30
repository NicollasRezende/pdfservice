/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;GDF_CreditoTransacionado&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreditoTransacionado
 * @generated
 */
public class CreditoTransacionadoTable
	extends BaseTable<CreditoTransacionadoTable> {

	public static final CreditoTransacionadoTable INSTANCE =
		new CreditoTransacionadoTable();

	public final Column<CreditoTransacionadoTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreditoTransacionadoTable, Long> creditoId =
		createColumn(
			"creditoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<CreditoTransacionadoTable, Long> propostaId =
		createColumn(
			"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreditoTransacionadoTable, String> numeroInscricao =
		createColumn(
			"numeroInscricao", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreditoTransacionadoTable, String> codigoReceita =
		createColumn(
			"codigoReceita", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreditoTransacionadoTable, Date> dataInscricao =
		createColumn(
			"dataInscricao", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreditoTransacionadoTable, Double> valorAtualizado =
		createColumn(
			"valorAtualizado", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);

	private CreditoTransacionadoTable() {
		super("GDF_CreditoTransacionado", CreditoTransacionadoTable::new);
	}

}