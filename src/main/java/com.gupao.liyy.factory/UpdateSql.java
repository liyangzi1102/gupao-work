package com.gupao.liyy.factory;

public class UpdateSql implements ISql {


    @Override
    public void excute(String sql,Object[] params) {
        System.out.println("执行修改操作");
    }
}
