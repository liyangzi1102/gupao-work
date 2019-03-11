package com.gupao.liyy.factory.abstractfactory;

public class OracleFactory implements ISqlFactory{



    @Override
    public IInsert createInsert() {
        return new OracleInsertInsert();
    }

    @Override
    public IUpdate createUpdate() {
        return new OracleUpdateInsert();
    }
}
