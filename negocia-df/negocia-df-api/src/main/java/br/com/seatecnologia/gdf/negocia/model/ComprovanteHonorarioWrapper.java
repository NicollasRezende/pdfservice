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
 * This class is a wrapper for {@link ComprovanteHonorario}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ComprovanteHonorario
 * @generated
 */
public class ComprovanteHonorarioWrapper
	extends BaseModelWrapper<ComprovanteHonorario>
	implements ComprovanteHonorario, ModelWrapper<ComprovanteHonorario> {

	public ComprovanteHonorarioWrapper(
		ComprovanteHonorario comprovanteHonorario) {

		super(comprovanteHonorario);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("comprovanteId", getComprovanteId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("valorPago", getValorPago());
		attributes.put("dataPagamento", getDataPagamento());
		attributes.put("fileEntryId", getFileEntryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long comprovanteId = (Long)attributes.get("comprovanteId");

		if (comprovanteId != null) {
			setComprovanteId(comprovanteId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		Double valorPago = (Double)attributes.get("valorPago");

		if (valorPago != null) {
			setValorPago(valorPago);
		}

		Date dataPagamento = (Date)attributes.get("dataPagamento");

		if (dataPagamento != null) {
			setDataPagamento(dataPagamento);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}
	}

	@Override
	public ComprovanteHonorario cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the comprovante ID of this comprovante honorario.
	 *
	 * @return the comprovante ID of this comprovante honorario
	 */
	@Override
	public long getComprovanteId() {
		return model.getComprovanteId();
	}

	/**
	 * Returns the data pagamento of this comprovante honorario.
	 *
	 * @return the data pagamento of this comprovante honorario
	 */
	@Override
	public Date getDataPagamento() {
		return model.getDataPagamento();
	}

	/**
	 * Returns the file entry ID of this comprovante honorario.
	 *
	 * @return the file entry ID of this comprovante honorario
	 */
	@Override
	public long getFileEntryId() {
		return model.getFileEntryId();
	}

	/**
	 * Returns the primary key of this comprovante honorario.
	 *
	 * @return the primary key of this comprovante honorario
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this comprovante honorario.
	 *
	 * @return the proposta ID of this comprovante honorario
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the uuid of this comprovante honorario.
	 *
	 * @return the uuid of this comprovante honorario
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the valor pago of this comprovante honorario.
	 *
	 * @return the valor pago of this comprovante honorario
	 */
	@Override
	public double getValorPago() {
		return model.getValorPago();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the comprovante ID of this comprovante honorario.
	 *
	 * @param comprovanteId the comprovante ID of this comprovante honorario
	 */
	@Override
	public void setComprovanteId(long comprovanteId) {
		model.setComprovanteId(comprovanteId);
	}

	/**
	 * Sets the data pagamento of this comprovante honorario.
	 *
	 * @param dataPagamento the data pagamento of this comprovante honorario
	 */
	@Override
	public void setDataPagamento(Date dataPagamento) {
		model.setDataPagamento(dataPagamento);
	}

	/**
	 * Sets the file entry ID of this comprovante honorario.
	 *
	 * @param fileEntryId the file entry ID of this comprovante honorario
	 */
	@Override
	public void setFileEntryId(long fileEntryId) {
		model.setFileEntryId(fileEntryId);
	}

	/**
	 * Sets the primary key of this comprovante honorario.
	 *
	 * @param primaryKey the primary key of this comprovante honorario
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this comprovante honorario.
	 *
	 * @param propostaId the proposta ID of this comprovante honorario
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the uuid of this comprovante honorario.
	 *
	 * @param uuid the uuid of this comprovante honorario
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the valor pago of this comprovante honorario.
	 *
	 * @param valorPago the valor pago of this comprovante honorario
	 */
	@Override
	public void setValorPago(double valorPago) {
		model.setValorPago(valorPago);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected ComprovanteHonorarioWrapper wrap(
		ComprovanteHonorario comprovanteHonorario) {

		return new ComprovanteHonorarioWrapper(comprovanteHonorario);
	}

}