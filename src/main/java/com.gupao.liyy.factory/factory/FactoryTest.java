package com.gupao.liyy.factory.factory;

public class FactoryTest {
    public static void main(String[] args){
        DataBaseFactory.getDataBaseFactory("mysql").getISql("insert").excute();
        DataBaseFactory.getDataBaseFactory("mysql").getISql("update").excute();
        DataBaseFactory.getDataBaseFactory("oracle").getISql("insert").excute();
        DataBaseFactory.getDataBaseFactory("oracle").getISql("update").excute();


        IDataBase mysql = new MysqlFactory();
        mysql.getISql("insert").excute();
        mysql.getISql("insert").excute();
        IDataBase oracle = new OracleFactory();
    }



}
