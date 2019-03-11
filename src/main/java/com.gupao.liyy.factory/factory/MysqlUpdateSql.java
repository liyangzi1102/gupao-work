package com.gupao.liyy.factory.factory;

public class MysqlUpdateSql implements ISql {
    @Override
    public void excute() {
        System.out.println("mysql-update");
    }
}
