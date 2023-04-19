package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for (Integer key : functionMap.keySet()){
            if (functionMap.get(key) == requiredValue) {
                return true;
            }
        }
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> calculated = new HashMap<>();
        for (Integer number : sourceList){
            calculated.put(number, 5 * number + 2);
        }
        return calculated;
    }
}
