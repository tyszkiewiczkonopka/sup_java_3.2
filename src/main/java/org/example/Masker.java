package org.example;

import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Masker {
    private static final String MASKING_SYMBOL = "**********";
    public static Stream<String> maskSensitiveKeys(Map<String, String> properties, Set<String> sensitiveKeysSet){
        return properties.entrySet().stream()
                .map(entry -> sensitiveKeysSet.contains(entry.getKey()) ? entry.getKey() + ": " + MASKING_SYMBOL : (entry.getKey() + ": " + entry.getValue()));
    }

}
