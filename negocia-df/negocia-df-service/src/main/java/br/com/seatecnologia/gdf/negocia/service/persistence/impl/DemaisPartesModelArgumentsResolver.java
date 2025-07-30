/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.model.DemaisPartesTable;
import br.com.seatecnologia.gdf.negocia.model.impl.DemaisPartesImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.DemaisPartesModelImpl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from DemaisPartes.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=br.com.seatecnologia.gdf.negocia.model.impl.DemaisPartesImpl",
		"table.name=GDF_DemaisPartes"
	},
	service = ArgumentsResolver.class
)
public class DemaisPartesModelArgumentsResolver implements ArgumentsResolver {

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

		DemaisPartesModelImpl demaisPartesModelImpl =
			(DemaisPartesModelImpl)baseModel;

		long columnBitmask = demaisPartesModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(demaisPartesModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					demaisPartesModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(demaisPartesModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return DemaisPartesImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return DemaisPartesTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		DemaisPartesModelImpl demaisPartesModelImpl, String[] columnNames,
		boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] = demaisPartesModelImpl.getColumnOriginalValue(
					columnName);
			}
			else {
				arguments[i] = demaisPartesModelImpl.getColumnValue(columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}