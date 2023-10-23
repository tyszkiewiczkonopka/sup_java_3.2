package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Map<String, String> properties = new HashMap<>();
        properties.put("login", "Angelina");
        properties.put("password", "angelinaInHollywood123");
        properties.put("title", "Salt");
        properties.put("url", "www.angelina.hollywood");
        properties.put("errorMessage", "file has not been found");

        String[] sensitiveKeys = {"login", "password", "url"};
        Set<String> sensitiveKeysSet = new HashSet<>(List.of(sensitiveKeys));

        properties.entrySet().stream()
                .map(entry -> sensitiveKeysSet.contains(entry.getKey()) ? "**********" : entry.getKey())
                .forEach(System.out::println);

    }
}
