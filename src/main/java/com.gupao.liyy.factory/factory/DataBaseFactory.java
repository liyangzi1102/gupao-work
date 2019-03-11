package com.gupao.liyy.factory.factory;

public class DataBaseFactory {

    public static IDataBase getDataBaseFactory(String dataBase){
        switch (dataBase){
            case "mysql" :
                return new MysqlFactory();
            case "oracle" :
                return new OracleFactory();
        }
        return null;
    }
}
