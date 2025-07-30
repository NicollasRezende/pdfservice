/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_QualificacaoCompleta&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QualificacaoCompleta
 * @generated
 */
public class QualificacaoCompletaTable
	extends BaseTable<QualificacaoCompletaTable> {

	public static final QualificacaoCompletaTable INSTANCE =
		new QualificacaoCompletaTable();

	public final Column<QualificacaoCompletaTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualificacaoCompletaTable, Long> qualificacaoId =
		createColumn(
			"qualificacaoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<QualificacaoCompletaTable, String> tipoPessoa =
		createColumn(
			"tipoPessoa", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualificacaoCompletaTable, String> nomeRazaoSocial =
		createColumn(
			"nomeRazaoSocial", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualificacaoCompletaTable, String> nomeFantasia =
		createColumn(
			"nomeFantasia", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualificacaoCompletaTable, String> representanteLegal =
		createColumn(
			"representanteLegal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualificacaoCompletaTable, String> cpfCnpj =
		createColumn(
			"cpfCnpj", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualificacaoCompletaTable, String> domicilioFiscal =
		createColumn(
			"domicilioFiscal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualificacaoCompletaTable, String> numeroCfdf =
		createColumn(
			"numeroCfdf", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualificacaoCompletaTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualificacaoCompletaTable, String> telefone =
		createColumn(
			"telefone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualificacaoCompletaTable, String> whatsapp =
		createColumn(
			"whatsapp", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualificacaoCompletaTable, Long> enderecoPostalId =
		createColumn(
			"enderecoPostalId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private QualificacaoCompletaTable() {
		super("GDF_QualificacaoCompleta", QualificacaoCompletaTable::new);
	}

}