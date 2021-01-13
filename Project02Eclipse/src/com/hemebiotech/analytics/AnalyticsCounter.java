package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeMap;

public class AnalyticsCounter {
	public static void main(String args[]) throws Exception {
		System.out.println("rootPath");
		BufferedReader reader = new BufferedReader(new FileReader("Project02Eclipse\\symptoms.txt"));
		ISymptomReader symptom = new ReadSymptomDataFromFile("Project02Eclipse\\symptoms.txt");
		TreeMap<String, Integer> myMap = symptom.lectureMap(reader);
		SaveFiles recupFiles = new SaveFiles();
		recupFiles.Sauvegardes(myMap, "result.out.txt");
	}
}

