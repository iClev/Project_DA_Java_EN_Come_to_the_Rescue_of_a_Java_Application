package com.hemebiotech.analytics;

import java.util.TreeMap;
/**
 * @param
 */
public class AnalyticsCounter {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		AppProperties appProps = new AppProperties();
		ISymptomReader symptom = new ReadSymptomDataFromFile(appProps.getPathInput());
		TreeMap<String, Integer> myMap = symptom.lectureMap();
		SaveFiles recupFiles = new SaveFiles();
		recupFiles.Sauvegardes(myMap, appProps.getPathOutput());
	}
}

