package com.gupao.liyy.factory.abstractfactory;

public class MysqlFactory implements ISqlFactory{

    @Override
    public IInsert createInsert() {
        return new MysqlInsertInsert();
    }

    @Override
    public IUpdate createUpdate() {
        return new MysqlUpdateInsert();
    }
}
