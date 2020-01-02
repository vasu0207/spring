package com.learning.interview;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedMapClass {
    
    public static void main(String[] args) {
    System.out.println("Entered Main");
        Map<String, String> map = new HashMap<>();
        map.put("Z","zzz");
        map.put("A","aaa");
        map.put("C","ccc");
        map.put("B","bbb");
        map.put("Y","yyy");


        for (String str :map.keySet()) {
            System.out.println("str = " + str);
        }

        Map<String, String> stringStringMap = Collections.synchronizedMap(map);

        for (String str :stringStringMap.keySet()) {
            System.out.println("str = " + str);
        }
        System.out.println("Exist Main");

        List<String> list = Arrays.asList("c", "e","d","a","a");
        for (String ls:  list) {
            if(ls=="c"){
                list.add("v");
            }

        }
        new HashSet<>(list).forEach(str-> System.out.println(str));
    }
}
