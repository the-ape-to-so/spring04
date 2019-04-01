package com.hr.controller;

import com.hr.pojo.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {
    @GetMapping("/item/list")
    public List<Item> cookie(){
        final List<Item> list = getList();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("你好");
            }
        });
        return list;
    }
    public List<Item> getList(){
        List<Item> list=new ArrayList<Item>();
        Item item1=new Item();
        item1.setId(1);
        item1.setName("湾仔码头水饺");
        item1.setNum(1);
        item1.setPrice(15);
        list.add(item1);
        return  list;
    }
    public Cookie getCookie(String value){
        Cookie cookie =new Cookie("list",value);
        return cookie;
    }
   /* public List<Item> meget(List<Item> list){
        for (Item:item:list) {

        }
    }
    public  List<Item> addCart(List<Item> list){

    }*/
}
