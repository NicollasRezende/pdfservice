/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.model.RelacaoCredorTable;
import br.com.seatecnologia.gdf.negocia.model.impl.RelacaoCredorImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.RelacaoCredorModelImpl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from RelacaoCredor.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=br.com.seatecnologia.gdf.negocia.model.impl.RelacaoCredorImpl",
		"table.name=GDF_RelacaoCredor"
	},
	service = ArgumentsResolver.class
)
public class RelacaoCredorModelArgumentsResolver implements ArgumentsResolver {

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

		RelacaoCredorModelImpl relacaoCredorModelImpl =
			(RelacaoCredorModelImpl)baseModel;

		long columnBitmask = relacaoCredorModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(relacaoCredorModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					relacaoCredorModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(relacaoCredorModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return RelacaoCredorImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return RelacaoCredorTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		RelacaoCredorModelImpl relacaoCredorModelImpl, String[] columnNames,
		boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] = relacaoCredorModelImpl.getColumnOriginalValue(
					columnName);
			}
			else {
				arguments[i] = relacaoCredorModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}