package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swapMap = new HashMap<>();
        for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {
            int sourceKey = e.getKey();
            String sourceValue = e.getValue();
            Integer swapMapValue = swapMap.get(sourceValue);
            int swapMapNewVal = (swapMapValue == null) ? sourceKey : swapMapValue;
            swapMap.put(sourceValue, Math.min(swapMapNewVal, sourceKey));
        }

        return swapMap;
    }
}
