package com.bijo.learning.utilpackage.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lab645 {
    public static void main(String[] args) {
        System.out.println("HashMap()");
        Map map=new HashMap();
        map.put("sid","JLC-99");
        map.put("name","Bijo");
        map.put("email","b@gmail.com");
        map.put("phone","988765766");
        map.put("add","mathikere");
        Set set=map.entrySet();
        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
