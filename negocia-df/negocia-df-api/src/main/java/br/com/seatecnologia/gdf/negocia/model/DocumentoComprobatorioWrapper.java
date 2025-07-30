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
 * This class is a wrapper for {@link DocumentoComprobatorio}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DocumentoComprobatorio
 * @generated
 */
public class DocumentoComprobatorioWrapper
	extends BaseModelWrapper<DocumentoComprobatorio>
	implements DocumentoComprobatorio, ModelWrapper<DocumentoComprobatorio> {

	public DocumentoComprobatorioWrapper(
		DocumentoComprobatorio documentoComprobatorio) {

		super(documentoComprobatorio);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("documentoId", getDocumentoId());
		attributes.put("fundamentacaoId", getFundamentacaoId());
		attributes.put("fileEntryId", getFileEntryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long documentoId = (Long)attributes.get("documentoId");

		if (documentoId != null) {
			setDocumentoId(documentoId);
		}

		Long fundamentacaoId = (Long)attributes.get("fundamentacaoId");

		if (fundamentacaoId != null) {
			setFundamentacaoId(fundamentacaoId);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}
	}

	@Override
	public DocumentoComprobatorio cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the documento ID of this documento comprobatorio.
	 *
	 * @return the documento ID of this documento comprobatorio
	 */
	@Override
	public long getDocumentoId() {
		return model.getDocumentoId();
	}

	/**
	 * Returns the file entry ID of this documento comprobatorio.
	 *
	 * @return the file entry ID of this documento comprobatorio
	 */
	@Override
	public long getFileEntryId() {
		return model.getFileEntryId();
	}

	/**
	 * Returns the fundamentacao ID of this documento comprobatorio.
	 *
	 * @return the fundamentacao ID of this documento comprobatorio
	 */
	@Override
	public long getFundamentacaoId() {
		return model.getFundamentacaoId();
	}

	/**
	 * Returns the primary key of this documento comprobatorio.
	 *
	 * @return the primary key of this documento comprobatorio
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this documento comprobatorio.
	 *
	 * @return the uuid of this documento comprobatorio
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
	 * Sets the documento ID of this documento comprobatorio.
	 *
	 * @param documentoId the documento ID of this documento comprobatorio
	 */
	@Override
	public void setDocumentoId(long documentoId) {
		model.setDocumentoId(documentoId);
	}

	/**
	 * Sets the file entry ID of this documento comprobatorio.
	 *
	 * @param fileEntryId the file entry ID of this documento comprobatorio
	 */
	@Override
	public void setFileEntryId(long fileEntryId) {
		model.setFileEntryId(fileEntryId);
	}

	/**
	 * Sets the fundamentacao ID of this documento comprobatorio.
	 *
	 * @param fundamentacaoId the fundamentacao ID of this documento comprobatorio
	 */
	@Override
	public void setFundamentacaoId(long fundamentacaoId) {
		model.setFundamentacaoId(fundamentacaoId);
	}

	/**
	 * Sets the primary key of this documento comprobatorio.
	 *
	 * @param primaryKey the primary key of this documento comprobatorio
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this documento comprobatorio.
	 *
	 * @param uuid the uuid of this documento comprobatorio
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
	protected DocumentoComprobatorioWrapper wrap(
		DocumentoComprobatorio documentoComprobatorio) {

		return new DocumentoComprobatorioWrapper(documentoComprobatorio);
	}

}