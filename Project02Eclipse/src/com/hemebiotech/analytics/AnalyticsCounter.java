package com.hemebiotech.analytics;

import com.hemebiotech.analytics.analyse.classe.CountSymptomDataFromFile;
import com.hemebiotech.analytics.analyse.classe.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.analyse.classe.SortSymptomDataFromFile;
import com.hemebiotech.analytics.analyse.classe.WriteSymptomDataFromFile;

import java.util.ArrayList;
import java.util.TreeMap;


/**
 * class principal
 *
 * @author o.froidefond
 */
public class AnalyticsCounter {
	public AnalyticsCounter() {
	}

	/**
	 * fonction main
	 *
	 * @param args not used
	 */
	public static void main(String[] args) {
		try {
			ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse/src/com/hemebiotech/analytics/resources/symptoms.txt");
			SortSymptomDataFromFile sortSymptomDataFromFile = new SortSymptomDataFromFile();
			CountSymptomDataFromFile countSymptomDataFromFile = new CountSymptomDataFromFile();
			WriteSymptomDataFromFile writeSymptomDataFromFile = new WriteSymptomDataFromFile();

			//read symptoms.txt
			ArrayList<String> listSymptomsRaw = readSymptomDataFromFile.getSymptoms();
			//sort sympoms in ArrayList listSymptoms
			ArrayList<String> listSymptomsSort = sortSymptomDataFromFile.sortSymptoms(listSymptomsRaw);
			//count symptom
			TreeMap<String, Integer> mapSymptomCount = countSymptomDataFromFile.countSymptom(listSymptomsSort);
			//write symptom
			writeSymptomDataFromFile.writeSymptom(mapSymptomCount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
