/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;GDF_Declaracao&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Declaracao
 * @generated
 */
public class DeclaracaoTable extends BaseTable<DeclaracaoTable> {

	public static final DeclaracaoTable INSTANCE = new DeclaracaoTable();

	public final Column<DeclaracaoTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DeclaracaoTable, Long> declaracaoId = createColumn(
		"declaracaoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DeclaracaoTable, Long> propostaId = createColumn(
		"propostaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DeclaracaoTable, Boolean> cumpreCompromissos =
		createColumn(
			"cumpreCompromissos", Boolean.class, Types.BOOLEAN,
			Column.FLAG_DEFAULT);
	public final Column<DeclaracaoTable, Boolean>
		naoAlienacaoBensSemComunicacao = createColumn(
			"naoAlienacaoBensSemComunicacao", Boolean.class, Types.BOOLEAN,
			Column.FLAG_DEFAULT);
	public final Column<DeclaracaoTable, Boolean> reconheceGrupoOuSucessao =
		createColumn(
			"reconheceGrupoOuSucessao", Boolean.class, Types.BOOLEAN,
			Column.FLAG_DEFAULT);
	public final Column<DeclaracaoTable, Boolean> compromissoConfidencialidade =
		createColumn(
			"compromissoConfidencialidade", Boolean.class, Types.BOOLEAN,
			Column.FLAG_DEFAULT);
	public final Column<DeclaracaoTable, Boolean> cienciaProcesso =
		createColumn(
			"cienciaProcesso", Boolean.class, Types.BOOLEAN,
			Column.FLAG_DEFAULT);
	public final Column<DeclaracaoTable, Boolean> abusoTransacao = createColumn(
		"abusoTransacao", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);
	public final Column<DeclaracaoTable, Boolean> impugnacaoRecursos =
		createColumn(
			"impugnacaoRecursos", Boolean.class, Types.BOOLEAN,
			Column.FLAG_DEFAULT);
	public final Column<DeclaracaoTable, Boolean> renunciaRecursos =
		createColumn(
			"renunciaRecursos", Boolean.class, Types.BOOLEAN,
			Column.FLAG_DEFAULT);
	public final Column<DeclaracaoTable, Boolean> peticionamentoProcessos =
		createColumn(
			"peticionamentoProcessos", Boolean.class, Types.BOOLEAN,
			Column.FLAG_DEFAULT);
	public final Column<DeclaracaoTable, Boolean> prestacaoInformacoes =
		createColumn(
			"prestacaoInformacoes", Boolean.class, Types.BOOLEAN,
			Column.FLAG_DEFAULT);
	public final Column<DeclaracaoTable, Boolean> omissaoInformacoes =
		createColumn(
			"omissaoInformacoes", Boolean.class, Types.BOOLEAN,
			Column.FLAG_DEFAULT);
	public final Column<DeclaracaoTable, Boolean> manutencaoGarantias =
		createColumn(
			"manutencaoGarantias", Boolean.class, Types.BOOLEAN,
			Column.FLAG_DEFAULT);

	private DeclaracaoTable() {
		super("GDF_Declaracao", DeclaracaoTable::new);
	}

}