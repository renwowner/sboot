package com.ykf.test;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class Datasource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
