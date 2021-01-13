package com.hemebiotech.analytics;

import java.util.TreeMap;
/**
 * class Analytics Counter,
 * il s'agit d'une simple application permettant
 * d'analyser puis compter le nombre d'occurrences
 * des symptômes énumérés dans un fichier.
 *
 * @author Clévyd M.
 * @version 15.0.1
 */
public class AnalyticsCounter {
	/**
	 * Méthode Main de l'application
	 * nous permet de définir les liens ou repertoires
	 * des fichiers de lecture et de sauvegarde de notre application
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

