package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * la class SavesFiles,
 * écrit les nombres d'occurrences des symptômes dans un fichier.
 *
 *@author Clévyd M.
 *@version 15.0.1
 */
public class SaveFiles {

    /**
     * @param myMap
     * @param fileNameInput
     * @throws IOException
     */
    public void Sauvegardes(Map<String, Integer> myMap, String fileNameInput) throws IOException {

        FileWriter writer = new FileWriter(fileNameInput);

        for (Map.Entry<String, Integer> lireSymptom : myMap.entrySet()) {
            writer.write(lireSymptom.getKey() + " = " + lireSymptom.getValue() + "\n");
        }   writer.close();
    }
}

