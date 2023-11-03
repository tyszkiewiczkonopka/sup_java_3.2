package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mask {

    private final Set<String> sensitiveKeys = new HashSet<>(List.of("login", "password", "url"));

    public void mask() {

        PropertiesReader properties = new PropertiesReader();
        Masker masker = new Masker();

        Map<String, String> propertiesAngelina = properties.initializeProperties();
        masker.printMaskedProperties(propertiesAngelina, sensitiveKeys);
    }
}
