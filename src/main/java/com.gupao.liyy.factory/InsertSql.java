package com.gupao.liyy.factory;

public class InsertSql implements ISql {

    @Override
    public void excute(String sql,Object[] params) {
        System.out.println("执行保存操作");
    }
}
