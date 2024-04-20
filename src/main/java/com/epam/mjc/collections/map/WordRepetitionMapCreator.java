package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        if (sentence.isEmpty()) {
            return result;
        }

        List<String> words = List.of(sentence
                .replaceAll("[,|.]","")
                .split(" "));

            words.forEach(word -> {
                int count = result.getOrDefault(word.toLowerCase(), 0);
                result.put(word.toLowerCase(),++count);
            });

        return result;
    }
}
