package org.example;

import java.util.Map;
import java.util.Set;

public class Mask {
    public static void mask(){
        Map<String, String> properties = Properties.initializeProperties();
        Set<String> sensitiveKeys = Properties.initializeSensitiveKeys();

        Masker.printMaskedProperties(properties,sensitiveKeys);
    }
}
