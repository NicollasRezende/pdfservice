/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.repository.model.FileEntry;

/**
 * @author Brian Wing Shun Chan
 */
public class EditalImpl extends EditalBaseImpl {
    public String getArquivoURL() {
        try {
            FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(this.getArquivo());
            return DLURLHelperUtil.getDownloadURL(
                fileEntry, fileEntry.getFileVersion(), null, StringPool.BLANK);
        } catch (PortalException e) {
            return "";
        }
    }
}