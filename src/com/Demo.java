package com;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        strings.stream().forEach(s -> {
            stringList.add(s);
        });
        System.out.println(stringList);
    }
}
