/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Edital}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Edital
 * @generated
 */
public class EditalWrapper
	extends BaseModelWrapper<Edital> implements Edital, ModelWrapper<Edital> {

	public EditalWrapper(Edital edital) {
		super(edital);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("editalId", getEditalId());
		attributes.put("titulo", getTitulo());
		attributes.put("descricao", getDescricao());
		attributes.put("arquivo", getArquivo());
		attributes.put("dataInicio", getDataInicio());
		attributes.put("dataFim", getDataFim());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long editalId = (Long)attributes.get("editalId");

		if (editalId != null) {
			setEditalId(editalId);
		}

		String titulo = (String)attributes.get("titulo");

		if (titulo != null) {
			setTitulo(titulo);
		}

		String descricao = (String)attributes.get("descricao");

		if (descricao != null) {
			setDescricao(descricao);
		}

		Long arquivo = (Long)attributes.get("arquivo");

		if (arquivo != null) {
			setArquivo(arquivo);
		}

		Date dataInicio = (Date)attributes.get("dataInicio");

		if (dataInicio != null) {
			setDataInicio(dataInicio);
		}

		Date dataFim = (Date)attributes.get("dataFim");

		if (dataFim != null) {
			setDataFim(dataFim);
		}
	}

	@Override
	public Edital cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the arquivo of this edital.
	 *
	 * @return the arquivo of this edital
	 */
	@Override
	public long getArquivo() {
		return model.getArquivo();
	}

	@Override
	public String getArquivoURL() {
		return model.getArquivoURL();
	}

	/**
	 * Returns the data fim of this edital.
	 *
	 * @return the data fim of this edital
	 */
	@Override
	public Date getDataFim() {
		return model.getDataFim();
	}

	/**
	 * Returns the data inicio of this edital.
	 *
	 * @return the data inicio of this edital
	 */
	@Override
	public Date getDataInicio() {
		return model.getDataInicio();
	}

	/**
	 * Returns the descricao of this edital.
	 *
	 * @return the descricao of this edital
	 */
	@Override
	public String getDescricao() {
		return model.getDescricao();
	}

	/**
	 * Returns the edital ID of this edital.
	 *
	 * @return the edital ID of this edital
	 */
	@Override
	public long getEditalId() {
		return model.getEditalId();
	}

	/**
	 * Returns the primary key of this edital.
	 *
	 * @return the primary key of this edital
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the titulo of this edital.
	 *
	 * @return the titulo of this edital
	 */
	@Override
	public String getTitulo() {
		return model.getTitulo();
	}

	/**
	 * Returns the uuid of this edital.
	 *
	 * @return the uuid of this edital
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the arquivo of this edital.
	 *
	 * @param arquivo the arquivo of this edital
	 */
	@Override
	public void setArquivo(long arquivo) {
		model.setArquivo(arquivo);
	}

	/**
	 * Sets the data fim of this edital.
	 *
	 * @param dataFim the data fim of this edital
	 */
	@Override
	public void setDataFim(Date dataFim) {
		model.setDataFim(dataFim);
	}

	/**
	 * Sets the data inicio of this edital.
	 *
	 * @param dataInicio the data inicio of this edital
	 */
	@Override
	public void setDataInicio(Date dataInicio) {
		model.setDataInicio(dataInicio);
	}

	/**
	 * Sets the descricao of this edital.
	 *
	 * @param descricao the descricao of this edital
	 */
	@Override
	public void setDescricao(String descricao) {
		model.setDescricao(descricao);
	}

	/**
	 * Sets the edital ID of this edital.
	 *
	 * @param editalId the edital ID of this edital
	 */
	@Override
	public void setEditalId(long editalId) {
		model.setEditalId(editalId);
	}

	/**
	 * Sets the primary key of this edital.
	 *
	 * @param primaryKey the primary key of this edital
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the titulo of this edital.
	 *
	 * @param titulo the titulo of this edital
	 */
	@Override
	public void setTitulo(String titulo) {
		model.setTitulo(titulo);
	}

	/**
	 * Sets the uuid of this edital.
	 *
	 * @param uuid the uuid of this edital
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected EditalWrapper wrap(Edital edital) {
		return new EditalWrapper(edital);
	}

}