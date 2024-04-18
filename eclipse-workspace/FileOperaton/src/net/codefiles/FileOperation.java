package net.codefiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
	public static void main(String[] args) {
		try {
			BufferedWriter writer = new  BufferedWriter(new FileWriter("file.txt"));
			writer.append("poda\n");
			System.out.println("Done!");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
