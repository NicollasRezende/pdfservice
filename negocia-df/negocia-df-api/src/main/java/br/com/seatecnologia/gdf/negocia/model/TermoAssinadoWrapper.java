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
 * This class is a wrapper for {@link TermoAssinado}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TermoAssinado
 * @generated
 */
public class TermoAssinadoWrapper
	extends BaseModelWrapper<TermoAssinado>
	implements ModelWrapper<TermoAssinado>, TermoAssinado {

	public TermoAssinadoWrapper(TermoAssinado termoAssinado) {
		super(termoAssinado);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("termoId", getTermoId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("urlTermo", getUrlTermo());
		attributes.put("arquivoPdf", getArquivoPdf());
		attributes.put("parte", getParte());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long termoId = (Long)attributes.get("termoId");

		if (termoId != null) {
			setTermoId(termoId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		String urlTermo = (String)attributes.get("urlTermo");

		if (urlTermo != null) {
			setUrlTermo(urlTermo);
		}

		String arquivoPdf = (String)attributes.get("arquivoPdf");

		if (arquivoPdf != null) {
			setArquivoPdf(arquivoPdf);
		}

		String parte = (String)attributes.get("parte");

		if (parte != null) {
			setParte(parte);
		}
	}

	@Override
	public TermoAssinado cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the arquivo pdf of this termo assinado.
	 *
	 * @return the arquivo pdf of this termo assinado
	 */
	@Override
	public String getArquivoPdf() {
		return model.getArquivoPdf();
	}

	/**
	 * Returns the parte of this termo assinado.
	 *
	 * @return the parte of this termo assinado
	 */
	@Override
	public String getParte() {
		return model.getParte();
	}

	/**
	 * Returns the primary key of this termo assinado.
	 *
	 * @return the primary key of this termo assinado
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this termo assinado.
	 *
	 * @return the proposta ID of this termo assinado
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the termo ID of this termo assinado.
	 *
	 * @return the termo ID of this termo assinado
	 */
	@Override
	public long getTermoId() {
		return model.getTermoId();
	}

	/**
	 * Returns the url termo of this termo assinado.
	 *
	 * @return the url termo of this termo assinado
	 */
	@Override
	public String getUrlTermo() {
		return model.getUrlTermo();
	}

	/**
	 * Returns the uuid of this termo assinado.
	 *
	 * @return the uuid of this termo assinado
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
	 * Sets the arquivo pdf of this termo assinado.
	 *
	 * @param arquivoPdf the arquivo pdf of this termo assinado
	 */
	@Override
	public void setArquivoPdf(String arquivoPdf) {
		model.setArquivoPdf(arquivoPdf);
	}

	/**
	 * Sets the parte of this termo assinado.
	 *
	 * @param parte the parte of this termo assinado
	 */
	@Override
	public void setParte(String parte) {
		model.setParte(parte);
	}

	/**
	 * Sets the primary key of this termo assinado.
	 *
	 * @param primaryKey the primary key of this termo assinado
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this termo assinado.
	 *
	 * @param propostaId the proposta ID of this termo assinado
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the termo ID of this termo assinado.
	 *
	 * @param termoId the termo ID of this termo assinado
	 */
	@Override
	public void setTermoId(long termoId) {
		model.setTermoId(termoId);
	}

	/**
	 * Sets the url termo of this termo assinado.
	 *
	 * @param urlTermo the url termo of this termo assinado
	 */
	@Override
	public void setUrlTermo(String urlTermo) {
		model.setUrlTermo(urlTermo);
	}

	/**
	 * Sets the uuid of this termo assinado.
	 *
	 * @param uuid the uuid of this termo assinado
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
	protected TermoAssinadoWrapper wrap(TermoAssinado termoAssinado) {
		return new TermoAssinadoWrapper(termoAssinado);
	}

}