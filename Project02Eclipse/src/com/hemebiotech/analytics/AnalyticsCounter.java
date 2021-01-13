package com.hemebiotech.analytics;

import java.util.TreeMap;

public class AnalyticsCounter {
	public static void main(String args[]) throws Exception {
		AppProperties appProps = new AppProperties();
		ISymptomReader symptom = new ReadSymptomDataFromFile(appProps.getPathInput());
		TreeMap<String, Integer> myMap = symptom.lectureMap();
		SaveFiles recupFiles = new SaveFiles();
		recupFiles.Sauvegardes(myMap, appProps.getPathOutput());
	}
}

