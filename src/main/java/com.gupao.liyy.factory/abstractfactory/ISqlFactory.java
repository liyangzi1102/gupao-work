package com.gupao.liyy.factory.abstractfactory;

public interface ISqlFactory {
    public IInsert createInsert();
    public IUpdate createUpdate();
}
