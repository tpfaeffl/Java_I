package Homework_5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TestOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String outputFileName = "output_final.txt";
		
		//testOutputStream(String outputFileName) {
			
				System.out.println("\n\nOutput from testOutputStream method\n");
				PrintWriter textPrintStream = null;
				
				try {
				textPrintStream = new PrintWriter(new FileOutputStream(outputFileName));
				textPrintStream.println("This output will go to the file " + outputFileName);
				textPrintStream.write("This is Final Grade\n");
				
				//new line does not work line separator for Windows
				//is different \r\n find line separator and use it
				//instead of using \n in print or printf. printline
				//just works fine
				//you can test out what is line
				//separator in this OS by
				//uncommenting these lines of code
				
				String newLine = System.getProperty("line.separator");
				textPrintStream.write("This is new line " + newLine + "What is this");
				
				
				} catch (FileNotFoundException e) {
				System.out.println("Error opening the file " + outputFileName + "\n" + e.getMessage());
				System.exit(0);
				}
				textPrintStream.close();
				System.out.println(outputFileName + " has been written and closed");
				}

	}

//}
