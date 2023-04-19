package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swapped = new HashMap<>();
        for (Integer key : sourceMap.keySet()){
            String value = sourceMap.get(key);
            if (swapped.containsKey(value)){
                int containedValue = swapped.get(value);
                System.out.println(key);
                System.out.println("cont " + containedValue);
                System.out.println("val " + value);
                if (key < containedValue){
                    swapped.put(value, key);
                }
            }else {
                swapped.put(value,key);
            }
        }
        return swapped;
    }
}
