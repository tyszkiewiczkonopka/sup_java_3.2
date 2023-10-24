package org.example;

import java.util.*;

public class Properties {
    public static Map<String, String> initializeProperties() {
        Map<String, String> properties = new HashMap<>();
        properties.put("login", "Angelina");
        properties.put("password", "angelinaInHollywood123");
        properties.put("title", "Salt");
        properties.put("url", "www.angelina.hollywood");
        properties.put("errorMessage", "file has not been found");
        return properties;
    }

    public static Set<String> initializeSensitiveKeys() {
        String[] sensitiveKeys = {"login", "password", "url"};
        return new HashSet<>(List.of(sensitiveKeys));
    }
}
