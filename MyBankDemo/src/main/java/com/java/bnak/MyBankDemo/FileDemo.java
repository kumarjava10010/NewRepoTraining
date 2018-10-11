package com.java.bnak.MyBankDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C://Users//cragh//Desktop//AddressVerificationtxt.txt");
		FileInputStream inputStream =null;
			if(file.exists()) {	
				inputStream = new FileInputStream(file);
				
				int i = 0;
				
				String str = "";
				
				while( (i=inputStream.read())!=-1) {
					//System.out.println((char)i);
					
					str = str+(char)i;
				}
				System.out.println(str);
			}
			
			//DB 
			//Need Acct Number, CuN,
		
	}

}
