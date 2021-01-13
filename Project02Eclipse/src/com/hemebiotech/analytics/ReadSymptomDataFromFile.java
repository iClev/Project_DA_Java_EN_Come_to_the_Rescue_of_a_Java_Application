package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/**
 * Simple implementation
 *
 * @author Clévyd M.
 * @version 15.0.1
 */
public class ReadSymptomDataFromFile implements ISymptomReader {
	private String filepath;
	/**
	 *
	 * @param filepath un chemin d'accès complet ou partiel au fichier symptômes une par ligne
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}

	/**
	 * @return
	 * @throws FileNotFoundException
	 */
	@Override
	/**
	 * Procedure sans type de retour
	 *
	 *
	 * Count the occurrences of symptoms from a List, then add them in a tree map
	 *
	 * @return myMap, parcourrir une TreeMap contenant les occurences associées à chaque symptômes
	 *
	 * @throws FileNotFoundException  Le fichier n'existe pas.
	 */
	public TreeMap<String, Integer> lectureMap () throws FileNotFoundException {
		BufferedReader reader = new BufferedReader(new FileReader(this.filepath));
		TreeMap<String, Integer> myMap = new TreeMap<>();
		String line ;
		try {
			line = reader.readLine();
			int countSymptom;
			System.out.println(line);
			while (line != null) {
				countSymptom = myMap.get(line) == null ? 0 : myMap.get(line);
				countSymptom += 1;
				myMap.put(line, countSymptom);
				System.out.println("" + line);
				line = reader.readLine();
			}
			System.out.println();
		}catch (IOException e) {
			e.printStackTrace();
		}return myMap;
	}
}
