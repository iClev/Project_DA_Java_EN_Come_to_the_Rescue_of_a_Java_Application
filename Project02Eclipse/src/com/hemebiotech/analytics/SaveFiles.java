package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class SaveFiles {

    public void Sauvegardes(Map<String, Integer> myMap, String fileNameInput) throws IOException {

        FileWriter writer = new FileWriter(fileNameInput);

        for (Map.Entry<String, Integer> lireSymptom : myMap.entrySet()) {
            writer.write(lireSymptom.getKey() + " = " + lireSymptom.getValue() + "\n");
        }   writer.close();
    }
}

