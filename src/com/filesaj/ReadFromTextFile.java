package com.filesaj;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class ReadFromTextFile {

	public static void main(String[] args) throws Exception {

		// File reader, fileinputstream

		String filePath = "C:\\Users\\ajayj\\eclipse-workspace\\Voltas\\com.resources\\login.txt";

		File file = new File(filePath);

		/*
		 * FileInputStream fip = new FileInputStream(file);
		 * 
		 * BufferedInputStream bis = new BufferedInputStream(fip);
		 */
		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr);

		String text = br.readLine();
		System.out.println(text);
		
		
		// 

	}

}
