package com.haige.controller;

import com.haige.pojo.Items;
import com.haige.srevice.Itemsservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items")
public class Itemscontroller {
    @Autowired
    private Itemsservice itemsservice;

    @RequestMapping("fiadall")
    public String fiadall(Model model) {
        List<Items> list = itemsservice.fiadall();
        System.out.println(list);
        model.addAttribute("list", list);
        return "items";
    }

    @RequestMapping("/add")
    public String add(Items items) {
        System.out.println(items);
        itemsservice.add(items);
        return "redirect:/items/fiadall";
    }
}
