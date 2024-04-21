package com.pointels.quizz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;
import java.util.stream.Collectors;

class Encrypt {


	public static boolean checkProperty(String userName, String password) {

		String LOCATIONprop = "F://Outliers/eclipse-workspace/QuizApplication/src/main/webapp/credentials.properties";
		File file = new File(LOCATIONprop);
		try {
			FileInputStream fileInput = new FileInputStream(file);
			Properties props = new Properties();
			props.load(fileInput);

			@SuppressWarnings("rawtypes")
			Enumeration enuKeys = props.keys();
			while (enuKeys.hasMoreElements()) {
				String keypropety = (String) enuKeys.nextElement();
				String value = props.getProperty(keypropety);
				String decryptedPassword;

				char[] valuechar = value.toCharArray();
				ArrayList<Character> decryptedPassList = new ArrayList<Character>();
				int key = 3;

				for (char c : valuechar) {
					c -= key;
					decryptedPassList.add(c);
				}

				decryptedPassword = decryptedPassList.stream().map(Object::toString).collect(Collectors.joining());
				System.out.println(password + " --> encrypt");

				if ((keypropety.equals(userName)) && (decryptedPassword.equals(password))) {
					return true;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}