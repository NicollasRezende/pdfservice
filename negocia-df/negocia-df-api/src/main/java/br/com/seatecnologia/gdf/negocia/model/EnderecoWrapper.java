/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Endereco}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Endereco
 * @generated
 */
public class EnderecoWrapper
	extends BaseModelWrapper<Endereco>
	implements Endereco, ModelWrapper<Endereco> {

	public EnderecoWrapper(Endereco endereco) {
		super(endereco);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("enderecoId", getEnderecoId());
		attributes.put("cep", getCep());
		attributes.put("endereco", getEndereco());
		attributes.put("numero", getNumero());
		attributes.put("estado", getEstado());
		attributes.put("municipio", getMunicipio());
		attributes.put("bairro", getBairro());
		attributes.put("complemento", getComplemento());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long enderecoId = (Long)attributes.get("enderecoId");

		if (enderecoId != null) {
			setEnderecoId(enderecoId);
		}

		String cep = (String)attributes.get("cep");

		if (cep != null) {
			setCep(cep);
		}

		String endereco = (String)attributes.get("endereco");

		if (endereco != null) {
			setEndereco(endereco);
		}

		String numero = (String)attributes.get("numero");

		if (numero != null) {
			setNumero(numero);
		}

		String estado = (String)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		String municipio = (String)attributes.get("municipio");

		if (municipio != null) {
			setMunicipio(municipio);
		}

		String bairro = (String)attributes.get("bairro");

		if (bairro != null) {
			setBairro(bairro);
		}

		String complemento = (String)attributes.get("complemento");

		if (complemento != null) {
			setComplemento(complemento);
		}
	}

	@Override
	public Endereco cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bairro of this endereco.
	 *
	 * @return the bairro of this endereco
	 */
	@Override
	public String getBairro() {
		return model.getBairro();
	}

	/**
	 * Returns the cep of this endereco.
	 *
	 * @return the cep of this endereco
	 */
	@Override
	public String getCep() {
		return model.getCep();
	}

	/**
	 * Returns the complemento of this endereco.
	 *
	 * @return the complemento of this endereco
	 */
	@Override
	public String getComplemento() {
		return model.getComplemento();
	}

	/**
	 * Returns the endereco of this endereco.
	 *
	 * @return the endereco of this endereco
	 */
	@Override
	public String getEndereco() {
		return model.getEndereco();
	}

	/**
	 * Returns the endereco ID of this endereco.
	 *
	 * @return the endereco ID of this endereco
	 */
	@Override
	public long getEnderecoId() {
		return model.getEnderecoId();
	}

	/**
	 * Returns the estado of this endereco.
	 *
	 * @return the estado of this endereco
	 */
	@Override
	public String getEstado() {
		return model.getEstado();
	}

	/**
	 * Returns the municipio of this endereco.
	 *
	 * @return the municipio of this endereco
	 */
	@Override
	public String getMunicipio() {
		return model.getMunicipio();
	}

	/**
	 * Returns the numero of this endereco.
	 *
	 * @return the numero of this endereco
	 */
	@Override
	public String getNumero() {
		return model.getNumero();
	}

	/**
	 * Returns the primary key of this endereco.
	 *
	 * @return the primary key of this endereco
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this endereco.
	 *
	 * @return the uuid of this endereco
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
	 * Sets the bairro of this endereco.
	 *
	 * @param bairro the bairro of this endereco
	 */
	@Override
	public void setBairro(String bairro) {
		model.setBairro(bairro);
	}

	/**
	 * Sets the cep of this endereco.
	 *
	 * @param cep the cep of this endereco
	 */
	@Override
	public void setCep(String cep) {
		model.setCep(cep);
	}

	/**
	 * Sets the complemento of this endereco.
	 *
	 * @param complemento the complemento of this endereco
	 */
	@Override
	public void setComplemento(String complemento) {
		model.setComplemento(complemento);
	}

	/**
	 * Sets the endereco of this endereco.
	 *
	 * @param endereco the endereco of this endereco
	 */
	@Override
	public void setEndereco(String endereco) {
		model.setEndereco(endereco);
	}

	/**
	 * Sets the endereco ID of this endereco.
	 *
	 * @param enderecoId the endereco ID of this endereco
	 */
	@Override
	public void setEnderecoId(long enderecoId) {
		model.setEnderecoId(enderecoId);
	}

	/**
	 * Sets the estado of this endereco.
	 *
	 * @param estado the estado of this endereco
	 */
	@Override
	public void setEstado(String estado) {
		model.setEstado(estado);
	}

	/**
	 * Sets the municipio of this endereco.
	 *
	 * @param municipio the municipio of this endereco
	 */
	@Override
	public void setMunicipio(String municipio) {
		model.setMunicipio(municipio);
	}

	/**
	 * Sets the numero of this endereco.
	 *
	 * @param numero the numero of this endereco
	 */
	@Override
	public void setNumero(String numero) {
		model.setNumero(numero);
	}

	/**
	 * Sets the primary key of this endereco.
	 *
	 * @param primaryKey the primary key of this endereco
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this endereco.
	 *
	 * @param uuid the uuid of this endereco
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
	protected EnderecoWrapper wrap(Endereco endereco) {
		return new EnderecoWrapper(endereco);
	}

}