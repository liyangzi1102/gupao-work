package com.gupao.liyy.factory.abstractfactory;

public class MysqlUpdateInsert implements IUpdate {
    @Override
    public void update() {
        System.out.println("mysql-update");
    }
}
