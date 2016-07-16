package com.chenhao.jim;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pingapple on 2016/7/16.
 */
public class Test {

    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("a","chenhao");
        map.put("b","lini");
        System.out.println(map.size());
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
