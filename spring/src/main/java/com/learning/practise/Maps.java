package com.learning.practise;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Maps {

    public static void main(String[] args) {
    System.out.println("Entered Main");

        Map<String, String> concMap = new ConcurrentHashMap<>();
        Map<String, String> syncMap = new ConcurrentHashMap<>();


    System.out.println("Exist Main");
    }
}
