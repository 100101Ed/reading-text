/**
 * File Name: ReadingText.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 5, 2016
 */
package com.sqa.em.read.text;

import java.util.List;

import com.sqa.em.util.helper.ReadAllDataFromFile;

/**
 * ReadingText //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class ReadingText {

	// static String fl = "src/main/java/com/sqa/em/read/text/temp.txt";
	// static String fl = "src/main/java/com/sqa/em/read/text/json-temp.txt";
	static String fl = "src/main/java/com/sqa/em/read/text/2numbsAndExpectedValue.txt";

	// static String fl = "src/main/java/com/sqa/em/read/text/xml-temp.txt";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> hi = ReadAllDataFromFile.getData(fl);
		System.out.println(hi.toString());
		// // The name of the file to open.
		// String fileName = fl;
		// List<String> readtext = new ArrayList();
		// // This will reference one line at a time
		// String line = null;
		// try {
		// // - FileReader for text files in your system's default encoding
		// // (for example, files containing Western European characters on a
		// // Western European computer).
		// // - FileInputStream for binary files and text files that contain
		// // 'weird' characters.
		// FileReader fileReader = new FileReader(fileName);
		// // Always wrap FileReader in BufferedReader.
		// BufferedReader bufferedReader = new BufferedReader(fileReader);
		// int index = 0;
		// while ((line = bufferedReader.readLine()) != null) {
		// readtext.add(line);
		// readtext.add("\n");
		// // System.out.println(line);
		// }
		// // Always close files.
		// bufferedReader.close();
		// } catch (FileNotFoundException ex) {
		// System.out.println("Unable to open file '" + fileName + "'");
		// } catch (IOException ex) {
		// System.out.println("Error reading file '" + fileName + "'");
		// // Or we could just do this: // ex.printStackTrace(); }
		// }
		// // System.out.println("Results after stored to array" +
		// // readtext..toString());
		// for (String string : readtext) {
		// System.out.println(string);
		// }
	}
}
