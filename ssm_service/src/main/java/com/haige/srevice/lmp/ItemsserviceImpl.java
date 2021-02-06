package com.haige.srevice.lmp;

import com.haige.dao.ItemsDao;
import com.haige.pojo.Items;
import com.haige.srevice.Itemsservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemsserviceImpl implements Itemsservice {
    @Autowired
    private ItemsDao itemsDao;

    public List<Items> fiadall() {
        return itemsDao.fiadall();
    }

    public void add(Items items) {

       itemsDao.add(items);
    }
}
