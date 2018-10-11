package com.java.bnak.MyBankDemo;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutStream {

	public static void main(String[] args) throws IOException {
		BufferedWriter output = null;
		try {
			String str = "This is from Buffered Reader Class";
			
			//Get all the data from DB
			
			//java method to sonvert some object in to string 

			 output = new BufferedWriter(new FileWriter("C:\\Users\\cragh\\mySampleFile.txt"));

			//byte b[] = str.getBytes();// converting string into byte array

			output.write(str);;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			output.close();
		}

	}

}
