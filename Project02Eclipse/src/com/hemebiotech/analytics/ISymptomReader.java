package com.hemebiotech.analytics;

import java.io.FileNotFoundException;
import java.util.TreeMap;


/**
 *
 */
public interface ISymptomReader {

	/**
	 * @return
	 * @throws FileNotFoundException
	 */
	TreeMap<String, Integer> lectureMap () throws FileNotFoundException;
}
