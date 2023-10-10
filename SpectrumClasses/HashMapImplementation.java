package SpectrumClasses;

import java.util.*;

public class HashMapImplementation {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("India", 2.31);
        map.put("China", 2.15);
        map.put("USA", 1.15);
        map.put("Turkey", 0.75);
        System.out.println(map);

        for(Map.Entry<String, Double> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
