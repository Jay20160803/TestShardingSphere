package com.andy.datasourse;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author Andy
 * @date 2020/4/22 13:21
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceType.getDataBaseType();
    }
}
