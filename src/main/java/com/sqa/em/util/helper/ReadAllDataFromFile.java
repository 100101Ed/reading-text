/**
 * File Name: ReadAllDataFromFile.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 5, 2016
 */
package com.sqa.em.util.helper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReadAllDataFromFile //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class ReadAllDataFromFile {

	public static List<String> getData(String fileNameLocation) {
		// The name of the file to open.
		String fileName = fileNameLocation;
		// ArrayList r = new ArrayList();
		List<String> readtext = new ArrayList();
		// This will reference one line at a time
		String line = null;
		try {
			// - FileReader for text files in your system's default encoding
			// (for example, files containing Western European characters on a
			// Western European computer).
			// - FileInputStream for binary files and text files that contain
			// 'weird' characters.
			FileReader fileReader = new FileReader(fileName);
			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int index = 0;
			while ((line = bufferedReader.readLine()) != null) {
				readtext.add(line);
				// System.out.println(line);
			}
			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
			// Or we could just do this: // ex.printStackTrace(); }
		}
		// System.out.println("Results after stored to array" +
		// readtext..toString());
		// for (String string : readtext) {
		// System.out.println(string);
		// }
		return readtext;
	}
}
