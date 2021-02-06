package com.haige.dao;

import com.haige.pojo.Items;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ItemsDao {
    List<Items> fiadall();
    void add(Items items);
}
