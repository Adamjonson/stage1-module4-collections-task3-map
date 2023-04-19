package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> repetition = new HashMap<>();
        String[] words = sentence.split(" ");
        for (String word : words){
            if (word.equals("")){
                break;
            }
            word = word.toLowerCase();
            if (word.contains(",") || word.contains(".")){
                word = word.substring(0, word.length()-1);
            }
            if (repetition.containsKey(word)){
                repetition.put(word, repetition.get(word) + 1);
            }else{
                repetition.put(word, 1);
            }
        }
        return repetition;
    }
}
