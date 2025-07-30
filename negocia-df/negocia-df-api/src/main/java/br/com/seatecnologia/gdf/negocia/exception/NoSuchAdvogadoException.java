/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package br.com.seatecnologia.gdf.negocia.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchAdvogadoException extends NoSuchModelException {

	public NoSuchAdvogadoException() {
	}

	public NoSuchAdvogadoException(String msg) {
		super(msg);
	}

	public NoSuchAdvogadoException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchAdvogadoException(Throwable throwable) {
		super(throwable);
	}

}