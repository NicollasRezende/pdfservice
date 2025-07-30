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
 * This class is a wrapper for {@link DemonstracaoContabil}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DemonstracaoContabil
 * @generated
 */
public class DemonstracaoContabilWrapper
	extends BaseModelWrapper<DemonstracaoContabil>
	implements DemonstracaoContabil, ModelWrapper<DemonstracaoContabil> {

	public DemonstracaoContabilWrapper(
		DemonstracaoContabil demonstracaoContabil) {

		super(demonstracaoContabil);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("demonstracaoId", getDemonstracaoId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("tipoDocumento", getTipoDocumento());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long demonstracaoId = (Long)attributes.get("demonstracaoId");

		if (demonstracaoId != null) {
			setDemonstracaoId(demonstracaoId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		Integer tipoDocumento = (Integer)attributes.get("tipoDocumento");

		if (tipoDocumento != null) {
			setTipoDocumento(tipoDocumento);
		}
	}

	@Override
	public DemonstracaoContabil cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the demonstracao ID of this demonstracao contabil.
	 *
	 * @return the demonstracao ID of this demonstracao contabil
	 */
	@Override
	public long getDemonstracaoId() {
		return model.getDemonstracaoId();
	}

	/**
	 * Returns the file entry ID of this demonstracao contabil.
	 *
	 * @return the file entry ID of this demonstracao contabil
	 */
	@Override
	public long getFileEntryId() {
		return model.getFileEntryId();
	}

	/**
	 * Returns the primary key of this demonstracao contabil.
	 *
	 * @return the primary key of this demonstracao contabil
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this demonstracao contabil.
	 *
	 * @return the proposta ID of this demonstracao contabil
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the tipo documento of this demonstracao contabil.
	 *
	 * @return the tipo documento of this demonstracao contabil
	 */
	@Override
	public int getTipoDocumento() {
		return model.getTipoDocumento();
	}

	/**
	 * Returns the uuid of this demonstracao contabil.
	 *
	 * @return the uuid of this demonstracao contabil
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
	 * Sets the demonstracao ID of this demonstracao contabil.
	 *
	 * @param demonstracaoId the demonstracao ID of this demonstracao contabil
	 */
	@Override
	public void setDemonstracaoId(long demonstracaoId) {
		model.setDemonstracaoId(demonstracaoId);
	}

	/**
	 * Sets the file entry ID of this demonstracao contabil.
	 *
	 * @param fileEntryId the file entry ID of this demonstracao contabil
	 */
	@Override
	public void setFileEntryId(long fileEntryId) {
		model.setFileEntryId(fileEntryId);
	}

	/**
	 * Sets the primary key of this demonstracao contabil.
	 *
	 * @param primaryKey the primary key of this demonstracao contabil
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this demonstracao contabil.
	 *
	 * @param propostaId the proposta ID of this demonstracao contabil
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the tipo documento of this demonstracao contabil.
	 *
	 * @param tipoDocumento the tipo documento of this demonstracao contabil
	 */
	@Override
	public void setTipoDocumento(int tipoDocumento) {
		model.setTipoDocumento(tipoDocumento);
	}

	/**
	 * Sets the uuid of this demonstracao contabil.
	 *
	 * @param uuid the uuid of this demonstracao contabil
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
	protected DemonstracaoContabilWrapper wrap(
		DemonstracaoContabil demonstracaoContabil) {

		return new DemonstracaoContabilWrapper(demonstracaoContabil);
	}

}