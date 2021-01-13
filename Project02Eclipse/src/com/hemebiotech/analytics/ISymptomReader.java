package com.hemebiotech.analytics;

import java.io.FileNotFoundException;
import java.util.TreeMap;
/**
 *Tout ce qui permet de lire les données sur les symptômes
 * à partir d'un fichier source.
 * La partie importante est la valeur de retour de l'opération,
 * qui est une liste de chaînes de caractères,
 * qui contient de nombreux doublons.
 * Il n'est pas nécessaire d'ordonner
 * la liste de départ pour la mise en œuvre
 */
public interface ISymptomReader {

	/**
	 * @return
	 * @throws FileNotFoundException
	 */
	TreeMap<String, Integer> lectureMap () throws FileNotFoundException;
}
