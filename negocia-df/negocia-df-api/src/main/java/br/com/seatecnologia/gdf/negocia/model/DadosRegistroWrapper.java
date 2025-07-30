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
 * This class is a wrapper for {@link DadosRegistro}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DadosRegistro
 * @generated
 */
public class DadosRegistroWrapper
	extends BaseModelWrapper<DadosRegistro>
	implements DadosRegistro, ModelWrapper<DadosRegistro> {

	public DadosRegistroWrapper(DadosRegistro dadosRegistro) {
		super(dadosRegistro);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("dadosRegistroId", getDadosRegistroId());
		attributes.put("garantiaId", getGarantiaId());
		attributes.put("matriculaImovel", getMatriculaImovel());
		attributes.put("cartorioRegistro", getCartorioRegistro());
		attributes.put("renavam", getRenavam());
		attributes.put("localizacao", getLocalizacao());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long dadosRegistroId = (Long)attributes.get("dadosRegistroId");

		if (dadosRegistroId != null) {
			setDadosRegistroId(dadosRegistroId);
		}

		Long garantiaId = (Long)attributes.get("garantiaId");

		if (garantiaId != null) {
			setGarantiaId(garantiaId);
		}

		String matriculaImovel = (String)attributes.get("matriculaImovel");

		if (matriculaImovel != null) {
			setMatriculaImovel(matriculaImovel);
		}

		String cartorioRegistro = (String)attributes.get("cartorioRegistro");

		if (cartorioRegistro != null) {
			setCartorioRegistro(cartorioRegistro);
		}

		String renavam = (String)attributes.get("renavam");

		if (renavam != null) {
			setRenavam(renavam);
		}

		String localizacao = (String)attributes.get("localizacao");

		if (localizacao != null) {
			setLocalizacao(localizacao);
		}
	}

	@Override
	public DadosRegistro cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cartorio registro of this dados registro.
	 *
	 * @return the cartorio registro of this dados registro
	 */
	@Override
	public String getCartorioRegistro() {
		return model.getCartorioRegistro();
	}

	/**
	 * Returns the dados registro ID of this dados registro.
	 *
	 * @return the dados registro ID of this dados registro
	 */
	@Override
	public long getDadosRegistroId() {
		return model.getDadosRegistroId();
	}

	/**
	 * Returns the garantia ID of this dados registro.
	 *
	 * @return the garantia ID of this dados registro
	 */
	@Override
	public long getGarantiaId() {
		return model.getGarantiaId();
	}

	/**
	 * Returns the localizacao of this dados registro.
	 *
	 * @return the localizacao of this dados registro
	 */
	@Override
	public String getLocalizacao() {
		return model.getLocalizacao();
	}

	/**
	 * Returns the matricula imovel of this dados registro.
	 *
	 * @return the matricula imovel of this dados registro
	 */
	@Override
	public String getMatriculaImovel() {
		return model.getMatriculaImovel();
	}

	/**
	 * Returns the primary key of this dados registro.
	 *
	 * @return the primary key of this dados registro
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the renavam of this dados registro.
	 *
	 * @return the renavam of this dados registro
	 */
	@Override
	public String getRenavam() {
		return model.getRenavam();
	}

	/**
	 * Returns the uuid of this dados registro.
	 *
	 * @return the uuid of this dados registro
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
	 * Sets the cartorio registro of this dados registro.
	 *
	 * @param cartorioRegistro the cartorio registro of this dados registro
	 */
	@Override
	public void setCartorioRegistro(String cartorioRegistro) {
		model.setCartorioRegistro(cartorioRegistro);
	}

	/**
	 * Sets the dados registro ID of this dados registro.
	 *
	 * @param dadosRegistroId the dados registro ID of this dados registro
	 */
	@Override
	public void setDadosRegistroId(long dadosRegistroId) {
		model.setDadosRegistroId(dadosRegistroId);
	}

	/**
	 * Sets the garantia ID of this dados registro.
	 *
	 * @param garantiaId the garantia ID of this dados registro
	 */
	@Override
	public void setGarantiaId(long garantiaId) {
		model.setGarantiaId(garantiaId);
	}

	/**
	 * Sets the localizacao of this dados registro.
	 *
	 * @param localizacao the localizacao of this dados registro
	 */
	@Override
	public void setLocalizacao(String localizacao) {
		model.setLocalizacao(localizacao);
	}

	/**
	 * Sets the matricula imovel of this dados registro.
	 *
	 * @param matriculaImovel the matricula imovel of this dados registro
	 */
	@Override
	public void setMatriculaImovel(String matriculaImovel) {
		model.setMatriculaImovel(matriculaImovel);
	}

	/**
	 * Sets the primary key of this dados registro.
	 *
	 * @param primaryKey the primary key of this dados registro
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the renavam of this dados registro.
	 *
	 * @param renavam the renavam of this dados registro
	 */
	@Override
	public void setRenavam(String renavam) {
		model.setRenavam(renavam);
	}

	/**
	 * Sets the uuid of this dados registro.
	 *
	 * @param uuid the uuid of this dados registro
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
	protected DadosRegistroWrapper wrap(DadosRegistro dadosRegistro) {
		return new DadosRegistroWrapper(dadosRegistro);
	}

}