package com.gupao.liyy.factory.abstractfactory;

import com.gupao.liyy.factory.ISql;

public class AbstractFactoryTest {
    public static void main(String[] args){
        ISqlFactory mysql = new MysqlFactory();
        mysql.createInsert().insert();
        mysql.createUpdate().update();

        ISqlFactory oracle = new OracleFactory();
        oracle.createInsert().insert();
        oracle.createUpdate().update();

    }



}
