package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class AnalyticsCounter {
	static ArrayList<String> result = new ArrayList<>();

	public static void lectureMap() {

		try {
			BufferedReader reader = new BufferedReader(new FileReader("Project02Eclipse\\symptoms.txt"));
			String line = reader.readLine();
			while (line != null) {
				result.add(line);
				line = reader.readLine();
			}
			reader.close();
			Collections.sort(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void ecritureMap() throws IOException {
		String  lectureSymptom = "";
		int countSymptom = 0;
		FileWriter writer = new FileWriter("results.out");

		for (int i=0;i< result.size();i++){
			String newLine = result.get(i);
			countSymptom++;

			if (! newLine.equals(lectureSymptom))
			{
				if (! lectureSymptom.equals(""))
				{
					System.out.println(lectureSymptom + " = " + countSymptom);
					writer.write(lectureSymptom + " = " + countSymptom + "\n");
				}
				countSymptom = 0;
				lectureSymptom = newLine;
			}
		}	writer.close();
	}

	public static void main(String args[]) throws Exception {

		lectureMap();
		ecritureMap();

	}
}
