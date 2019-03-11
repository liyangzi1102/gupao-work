package com.gupao.liyy.factory.factory;

public class OracleFactory implements IDataBase {
    @Override
    public ISql getISql(String excute){
        switch (excute) {
            case "insert" :
                return new OracleInsertSql();
            case "update" :
                return new OracleUpdateSql();
        }
        return null;
    }


}
