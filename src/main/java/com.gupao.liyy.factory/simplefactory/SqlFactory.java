package com.gupao.liyy.factory.simplefactory;

import com.gupao.liyy.factory.ISql;
import com.gupao.liyy.factory.InsertSql;
import com.gupao.liyy.factory.UpdateSql;

public class SqlFactory {


    static ISql getSql(String excute){
        switch(excute){
            case "insert" :
                return new InsertSql();
            case "update":
                return new UpdateSql();
        }
        return null;
    }


}
