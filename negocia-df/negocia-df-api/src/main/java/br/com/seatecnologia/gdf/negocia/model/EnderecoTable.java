/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_Endereco&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Endereco
 * @generated
 */
public class EnderecoTable extends BaseTable<EnderecoTable> {

	public static final EnderecoTable INSTANCE = new EnderecoTable();

	public final Column<EnderecoTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EnderecoTable, Long> enderecoId = createColumn(
		"enderecoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<EnderecoTable, String> cep = createColumn(
		"cep", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EnderecoTable, String> endereco = createColumn(
		"endereco", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EnderecoTable, String> numero = createColumn(
		"numero", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EnderecoTable, String> estado = createColumn(
		"estado", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EnderecoTable, String> municipio = createColumn(
		"municipio", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EnderecoTable, String> bairro = createColumn(
		"bairro", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EnderecoTable, String> complemento = createColumn(
		"complemento", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private EnderecoTable() {
		super("GDF_Endereco", EnderecoTable::new);
	}

}