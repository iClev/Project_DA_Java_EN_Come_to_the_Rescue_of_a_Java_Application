package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {
	private String filepath;
	/**
	 *
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}

	@Override

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
