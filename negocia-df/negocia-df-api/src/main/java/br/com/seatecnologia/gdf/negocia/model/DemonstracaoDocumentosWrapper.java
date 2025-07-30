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
 * This class is a wrapper for {@link DemonstracaoDocumentos}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DemonstracaoDocumentos
 * @generated
 */
public class DemonstracaoDocumentosWrapper
	extends BaseModelWrapper<DemonstracaoDocumentos>
	implements DemonstracaoDocumentos, ModelWrapper<DemonstracaoDocumentos> {

	public DemonstracaoDocumentosWrapper(
		DemonstracaoDocumentos demonstracaoDocumentos) {

		super(demonstracaoDocumentos);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"demonstracaoDocumentosId", getDemonstracaoDocumentosId());
		attributes.put("demonstracaoId", getDemonstracaoId());
		attributes.put("tipoDocumento", getTipoDocumento());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long demonstracaoDocumentosId = (Long)attributes.get(
			"demonstracaoDocumentosId");

		if (demonstracaoDocumentosId != null) {
			setDemonstracaoDocumentosId(demonstracaoDocumentosId);
		}

		Long demonstracaoId = (Long)attributes.get("demonstracaoId");

		if (demonstracaoId != null) {
			setDemonstracaoId(demonstracaoId);
		}

		Integer tipoDocumento = (Integer)attributes.get("tipoDocumento");

		if (tipoDocumento != null) {
			setTipoDocumento(tipoDocumento);
		}
	}

	@Override
	public DemonstracaoDocumentos cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the demonstracao documentos ID of this demonstracao documentos.
	 *
	 * @return the demonstracao documentos ID of this demonstracao documentos
	 */
	@Override
	public long getDemonstracaoDocumentosId() {
		return model.getDemonstracaoDocumentosId();
	}

	/**
	 * Returns the demonstracao ID of this demonstracao documentos.
	 *
	 * @return the demonstracao ID of this demonstracao documentos
	 */
	@Override
	public long getDemonstracaoId() {
		return model.getDemonstracaoId();
	}

	/**
	 * Returns the primary key of this demonstracao documentos.
	 *
	 * @return the primary key of this demonstracao documentos
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tipo documento of this demonstracao documentos.
	 *
	 * @return the tipo documento of this demonstracao documentos
	 */
	@Override
	public int getTipoDocumento() {
		return model.getTipoDocumento();
	}

	/**
	 * Returns the uuid of this demonstracao documentos.
	 *
	 * @return the uuid of this demonstracao documentos
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
	 * Sets the demonstracao documentos ID of this demonstracao documentos.
	 *
	 * @param demonstracaoDocumentosId the demonstracao documentos ID of this demonstracao documentos
	 */
	@Override
	public void setDemonstracaoDocumentosId(long demonstracaoDocumentosId) {
		model.setDemonstracaoDocumentosId(demonstracaoDocumentosId);
	}

	/**
	 * Sets the demonstracao ID of this demonstracao documentos.
	 *
	 * @param demonstracaoId the demonstracao ID of this demonstracao documentos
	 */
	@Override
	public void setDemonstracaoId(long demonstracaoId) {
		model.setDemonstracaoId(demonstracaoId);
	}

	/**
	 * Sets the primary key of this demonstracao documentos.
	 *
	 * @param primaryKey the primary key of this demonstracao documentos
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tipo documento of this demonstracao documentos.
	 *
	 * @param tipoDocumento the tipo documento of this demonstracao documentos
	 */
	@Override
	public void setTipoDocumento(int tipoDocumento) {
		model.setTipoDocumento(tipoDocumento);
	}

	/**
	 * Sets the uuid of this demonstracao documentos.
	 *
	 * @param uuid the uuid of this demonstracao documentos
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
	protected DemonstracaoDocumentosWrapper wrap(
		DemonstracaoDocumentos demonstracaoDocumentos) {

		return new DemonstracaoDocumentosWrapper(demonstracaoDocumentos);
	}

}