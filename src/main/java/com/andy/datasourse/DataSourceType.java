package com.andy.datasourse;

/**
 * @author Andy
 * @date 2020/4/22 13:22
 */
public class DataSourceType {

    public enum DataBaseType{

        SHARDING_JDBC_SHARDING("分片数据库"),
        SHARDING_JDBC_READ_WRITER("读写分离数据库");

        private String dec;
        DataBaseType(String dec){
            this.dec = dec;
        }

    }

    private static final ThreadLocal<DataBaseType> TYPE = new ThreadLocal<>();

    public static void setDataBaseType(DataBaseType dataBaseType){
        if(null == dataBaseType){
            throw new NullPointerException();
        }
        TYPE.set(dataBaseType);
    }

    public static DataBaseType getDataBaseType(){
        return TYPE.get();
    }
}
