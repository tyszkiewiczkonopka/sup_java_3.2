package org.example;


import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> properties = Properties.initializeProperties();
        Set<String> sensitiveKeys = Properties.initializeSensitiveKeys();

        Masker.printMaskedProperties(properties,sensitiveKeys);

    }
}
