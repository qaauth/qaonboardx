package com.onboardx.utilities;

import java.io.File;
import java.io.FileWriter;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStrings {
	// Generated Random First,Middle,Last Name and Email Id
	public static String randomeStringVendorFullName() {
		String generateString = RandomStringUtils.randomAlphabetic(4);
		return (generateString);
	}

	// Initiate Via Candidate SME Extended
	public static String randomeStringEmailAddress() {
		String generateString = RandomStringUtils.randomAlphabetic(6);
		try {

			File output = new File("RandomMail.txt");
			FileWriter writer = new FileWriter(output);
			writer.write(generateString);
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (generateString);
	}
	
	// Cases Pending Initiation--
	public static String randomeStringCandidateEmail() {
		String generateString = RandomStringUtils.randomAlphabetic(6);
		/*try {

			File output = new File("RandomMail.txt");
			FileWriter writer = new FileWriter(output);

			writer.write(generateString);
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		return (generateString);
	}
	
	// Update the value of cell of the Bulk upload format XLS Email
	public static String randomeStringUpdateCandidateEmail() {
		String generateString = RandomStringUtils.randomAlphabetic(4);
		try {

			File output = new File("RandomBulkMail.txt");
			FileWriter writer = new FileWriter(output);

			writer.write(generateString);
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (generateString);
	}
}
