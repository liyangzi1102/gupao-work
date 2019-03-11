package com.gupao.liyy.factory.factory;

public class MysqlFactory implements IDataBase {
    @Override
    public ISql getISql(String excute){
        switch (excute) {
            case "insert" :
                return new MysqlInsertSql();
            case "update" :
                return new MysqlUpdateSql();
        }
        return null;
    }

}
