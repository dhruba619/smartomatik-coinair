package com.smartomatik.coinaircron;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CoinCubeToAirTableMapper implements Function<List<Balance>, List<AirTableData>> {

	@Override
	public List<AirTableData> apply(List<Balance> t) {
		return t.stream().map(this::convert).collect(Collectors.toList());
	}

	private AirTableData convert(Balance b) {
		AirTableData data = new AirTableData();
		AirTableFields fields = new AirTableFields();
		
		fields.setBTCRate(String.valueOf(b.getBTCRate()));
		fields.setBTCValue(String.valueOf(b.getBTCValue()));
		fields.setName(b.getName());
		fields.setDateTime(OffsetDateTime.now().toString());
		fields.set1dBTCChange(String.valueOf(b.get1dBTCChange()));
		fields.set1mBTCChange(String.valueOf(b.get1mBTCChange()));
		fields.set1wBTCChange(String.valueOf(b.get1wBTCChange()));
		fields.setFiatValue(String.valueOf(b.getFiatValue()));
		fields.setPercentOffGoal(String.valueOf(b.getPercentOffGoal()));
		fields.setPercentOfPortfolio(String.valueOf(b.getPercentOfPortfolio()));
		fields.setTotal(String.valueOf(b.getTotal()));

		data.setFields(fields);

		return data;

	}
}