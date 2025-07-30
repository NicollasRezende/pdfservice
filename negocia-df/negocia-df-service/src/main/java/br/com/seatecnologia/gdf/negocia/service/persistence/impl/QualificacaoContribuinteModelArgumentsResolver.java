/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinteTable;
import br.com.seatecnologia.gdf.negocia.model.impl.QualificacaoContribuinteImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.QualificacaoContribuinteModelImpl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from QualificacaoContribuinte.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=br.com.seatecnologia.gdf.negocia.model.impl.QualificacaoContribuinteImpl",
		"table.name=GDF_QualificacaoContribuinte"
	},
	service = ArgumentsResolver.class
)
public class QualificacaoContribuinteModelArgumentsResolver
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

		QualificacaoContribuinteModelImpl qualificacaoContribuinteModelImpl =
			(QualificacaoContribuinteModelImpl)baseModel;

		long columnBitmask =
			qualificacaoContribuinteModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				qualificacaoContribuinteModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					qualificacaoContribuinteModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				qualificacaoContribuinteModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return QualificacaoContribuinteImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return QualificacaoContribuinteTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		QualificacaoContribuinteModelImpl qualificacaoContribuinteModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					qualificacaoContribuinteModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = qualificacaoContribuinteModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}