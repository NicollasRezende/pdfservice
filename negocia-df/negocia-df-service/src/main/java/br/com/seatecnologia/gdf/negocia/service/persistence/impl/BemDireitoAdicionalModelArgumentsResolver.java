/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicionalTable;
import br.com.seatecnologia.gdf.negocia.model.impl.BemDireitoAdicionalImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.BemDireitoAdicionalModelImpl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from BemDireitoAdicional.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=br.com.seatecnologia.gdf.negocia.model.impl.BemDireitoAdicionalImpl",
		"table.name=GDF_BemDireitoAdicional"
	},
	service = ArgumentsResolver.class
)
public class BemDireitoAdicionalModelArgumentsResolver
	implements ArgumentsResolver {

	@Override
	public Object[] getArguments(
		FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
		boolean original) {

		String[] columnNames = finderPath.getColumnNames();

		if ((columnNames == null) || (columnNames.length == 0)) {
			if (baseModel.isNew()) {
				return new Object[0];
			}

			return null;
		}

		BemDireitoAdicionalModelImpl bemDireitoAdicionalModelImpl =
			(BemDireitoAdicionalModelImpl)baseModel;

		long columnBitmask = bemDireitoAdicionalModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				bemDireitoAdicionalModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					bemDireitoAdicionalModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				bemDireitoAdicionalModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return BemDireitoAdicionalImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return BemDireitoAdicionalTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		BemDireitoAdicionalModelImpl bemDireitoAdicionalModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					bemDireitoAdicionalModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = bemDireitoAdicionalModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}