package com.haige.srevice;

import com.alibaba.druid.sql.ast.expr.SQLCaseExpr;
import com.haige.pojo.Items;

import java.util.List;

public interface Itemsservice {
    List<Items> fiadall();
    void add(Items items);
}
