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
 * The table class for the &quot;GDF_Proposta&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Proposta
 * @generated
 */
public class PropostaTable extends BaseTable<PropostaTable> {

	public static final PropostaTable INSTANCE = new PropostaTable();

	public final Column<PropostaTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PropostaTable, Long> propostaId = createColumn(
		"propostaId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PropostaTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PropostaTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PropostaTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PropostaTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PropostaTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PropostaTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PropostaTable, String> tipoProposta = createColumn(
		"tipoProposta", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PropostaTable, Long> editalId = createColumn(
		"editalId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PropostaTable, Long> qualificacaoId = createColumn(
		"qualificacaoId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PropostaTable, Long> administradorJudicialId =
		createColumn(
			"administradorJudicialId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<PropostaTable, Long> advogadoId = createColumn(
		"advogadoId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PropostaTable, Long> fundamentacaoPedidoId =
		createColumn(
			"fundamentacaoPedidoId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<PropostaTable, Long> procuracao = createColumn(
		"procuracao", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PropostaTable, String> cpfCnpj = createColumn(
		"cpfCnpj", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PropostaTable, String> status = createColumn(
		"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PropostaTable, String> numeroProtocoloSei =
		createColumn(
			"numeroProtocoloSei", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PropostaTable, String> protocolo = createColumn(
		"protocolo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PropostaTable, String> documentosCompletosURL =
		createColumn(
			"documentosCompletosURL", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PropostaTable, Long> propostaPaiId = createColumn(
		"propostaPaiId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private PropostaTable() {
		super("GDF_Proposta", PropostaTable::new);
	}

}