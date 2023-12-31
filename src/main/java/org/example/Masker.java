package org.example;

import java.util.Map;
import java.util.Set;


public class Masker {
    private static final String MASKING_SYMBOL = "**********";
    public void printMaskedProperties(Map<String, String> properties, Set<String> sensitiveKeysSet){
        properties.entrySet().stream()
                .map(entry -> sensitiveKeysSet.contains(entry.getKey()) ? entry.getKey() + ": " + MASKING_SYMBOL : (entry.getKey() + ": " + entry.getValue()))
                .forEach(System.out::println);
    }

}
