package com.doudouhi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 */
public class DemoOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //顺序不能乱
        list.add(0,"string");
        list.add(1,"string");
        list.add(2,"string");
        list.add(3,"string");
        list.add(4,"string");
        list.add(5,"string");
        list.add(6,"string");
        list.add(7,"string");
        for (String s : list) {
            System.out.println(s);
        }

    }
}
