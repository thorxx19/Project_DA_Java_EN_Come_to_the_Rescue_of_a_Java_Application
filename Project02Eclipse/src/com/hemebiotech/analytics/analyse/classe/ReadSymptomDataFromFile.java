package com.hemebiotech.analytics.analyse.classe;

import com.hemebiotech.analytics.analyse.ISymptomReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private final String filePath;

	/**
	 * construct
	 *
	 * @param filePath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * method (getSymptoms) for read symptom in file
	 *
	 * @return string array of symptoms read from the file symptoms
	 */
	@Override
	public ArrayList<String> getSymptoms() {

		ArrayList<String> result = new ArrayList<String>();
		//line-by-line reading of the file and integration in the array result
		if (filePath != null) {
			try {

				File file = new File(filePath);
				Scanner scanner = new Scanner(file);

				while (scanner.hasNextLine()) {
					result.add(scanner.nextLine());
				}
			} catch (FileNotFoundException e) {
				System.out.println("file not found Exception");
			}
		}
		return result;
	}
}
