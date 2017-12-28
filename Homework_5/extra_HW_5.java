package Homework_5;

import java.io.BufferedReader;
// import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
// import java.util.Scanner;


public class extra_HW_5 {

	public static void main(String[] args) {
//	String fileName = null;
//	int i = 0;
//	try {
		
//		Scanner sc = new Scanner(new File(fileName));
//		while (sc.hasNext()) {
//			args [i]= sc.next();
//			i = i+ 1;
//		}
		
//	}
//	 catch (FileNotFoundException e) {
//		System.out.println("Can't file the file");
//		e.printStackTrace();
//	}	
		
		processCLArguments(args);
		processInputOutputFiles(args);
		
	}
	public static void processCLArguments(String[] args) {
		if (args.length !=2) {
			System.out.println("Usage: Java Exercise 5 inputFile, outputfile");}
		else {
			System.out.println("Input will be read from: " + args[0] + "\n" + "output will be written to " + args[1]);
		}
		
	}
	public static void processInputOutputFiles(String[] args) {
		String outputFile = args[1];
		String inputFile = args[0];
		FileReader fileReader = null;
		PrintWriter textPrintStream = null;
		try {
			textPrintStream = new PrintWriter (new FileOutputStream(outputFile));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			fileReader = new FileReader(inputFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int length = inputFile.length();
		
		// start reading one line at a time
		BufferedReader finalInStream = new BufferedReader(fileReader);
		
		
		// read each line of the file and store each line in newArray
		String [] newArray = new String[length];
		String s;
		int stringLength =  0;
		int i = 0;
		try {
			while ((s=finalInStream.readLine()) != null ) {
				//s.split(",");
				stringLength = stringLength + 1;
			    newArray[i] = s;	
				i = i+1;
				System.out.println("Student #" + i + ": " + s);
//				textPrintStream.println("Student #" + i + ": " + s);
				textPrintStream.append("Student #" + i + ": " + s + "\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		try {
			finalInStream.close();
			textPrintStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
