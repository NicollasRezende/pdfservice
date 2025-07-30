/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.impl;

import br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedidoTable;
import br.com.seatecnologia.gdf.negocia.model.impl.FundamentacaoPedidoImpl;
import br.com.seatecnologia.gdf.negocia.model.impl.FundamentacaoPedidoModelImpl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from FundamentacaoPedido.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=br.com.seatecnologia.gdf.negocia.model.impl.FundamentacaoPedidoImpl",
		"table.name=GDF_FundamentacaoPedido"
	},
	service = ArgumentsResolver.class
)
public class FundamentacaoPedidoModelArgumentsResolver
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

		FundamentacaoPedidoModelImpl fundamentacaoPedidoModelImpl =
			(FundamentacaoPedidoModelImpl)baseModel;

		long columnBitmask = fundamentacaoPedidoModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				fundamentacaoPedidoModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					fundamentacaoPedidoModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				fundamentacaoPedidoModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return FundamentacaoPedidoImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return FundamentacaoPedidoTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		FundamentacaoPedidoModelImpl fundamentacaoPedidoModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					fundamentacaoPedidoModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = fundamentacaoPedidoModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}