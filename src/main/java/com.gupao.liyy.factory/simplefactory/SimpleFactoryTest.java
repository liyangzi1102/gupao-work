package com.gupao.liyy.factory.simplefactory;

public class SimpleFactoryTest {
    public static void main(String[] args){
        SqlFactory.getSql("insert").excute("insertSql",new Object[]{});
        SqlFactory.getSql("update").excute("insertSql",new Object[]{});
    }
}
