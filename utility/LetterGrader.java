package utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class LetterGrader implements ILetterGrader {
	// Since we know there are 8 columns ...
	int length = 8;
	PrintWriter textPrintStream = null;
	
  public LetterGrader(String string, String string2) {
		
	}
	
  public String[] readScore(String string)	{
	  
	 // read names and scores from input file
 	 FileReader fileReader = null;
	try {
		fileReader = new FileReader(string);
	} catch (FileNotFoundException e1) {	
		System.out.println("The file name you entered: " + string + " was not found");
		System.exit(1);
	}
	
	BufferedReader finalInStream = new BufferedReader(fileReader);
	
	// read each line of the file and store each line in newArray
	String [] newArray = new String[length];
	String s;
	int stringLength =  0;
	int i = 0;
	try {
		while ((s=finalInStream.readLine()) != null ) {
			stringLength = stringLength + 1;
		    newArray[i] = s;	
			i = i+1;			
		}
	} catch (IOException e) {
		System.out.println("Error reading from file: " + string + e.getMessage());
		e.printStackTrace();
	}
	try {
		finalInStream.close();
	} catch (IOException e) {
		System.out.println("Error reading from file: " + string + e.getMessage());
		e.printStackTrace();
	}
	
	return newArray;
  }
  
public String[] calcLetterGrade(String[] s, int count, String string, String string2) {
		// input the string array, length of rows, and the input and output files.
		// calculate the letter grade, assign the letter grade to the score, then print to file
	
        // create arrays for student and letter. 
        String [] stud = new String [count];
        char [] letter = new char [count];
     
        
     // loop over array and calculate weighted final score. I know, this anonymous array y[] and 
     // the hard coding is not great. 
	for (int k = 0; k<= count -1; k++) {		  
		String y[] = s[k].split(",");
	
		double final_score = (Double.parseDouble(y[1]) * .10) + (Double.parseDouble(y[2]) * .10) + (Double.parseDouble(y[3]) * .10) + (Double.parseDouble(y[4]) * .10) + (Double.parseDouble(y[5]) * .20) + (Double.parseDouble(y[6]) * .15) + (Double.parseDouble(y[7]) * .25);
        final_score = (double)Math.round(final_score * 100.00d)/100.00d; 
		String student = y[0];
		
		// assign a letter grade to the score
		char letterGrade = getLetterGrade(final_score);

		// fill student and letter grade arrays
		stud[k] = student;
		letter[k] = letterGrade;
	}  
		// print the grade
		printGrade(string, string2, count, stud, letter);
		
		// return the string array
		return s;
}

private char getLetterGrade(double score) {
	
	// take value of "score" and get the letter grade via if/else
	if (score >=90.0)
		return 'A';
	else if (score >=80.0)
		return 'B';
	else if (score >= 70)
		return 'C';
	else if (score >= 60)
		return 'D';
	else
		return 'F';
	
	}

 private void printGrade(String string, String string2, int count, String[] name, char [] letter) {
	
	// take the input file, output file, number of rows, 
	// name array, and letter grade array, then print  
	
	this.textPrintStream = null;
	
	// find the longest name in array. We'll need it to calculate formating
	int  spacing = getLongestName(name);
	
	// 	create a PrintWriter object from a FileOutputStream
	try {
	this.textPrintStream = new PrintWriter(new FileOutputStream(string2));
	this.textPrintStream.append("Letter grade for " + count + " students given in input file " + string + " is: \n\n");
	
	// print the name and grade	
	for (int i = name.length-1; i >=0 ; i--) {			
	this.textPrintStream.print(String.format("%-" + spacing + "s%-" + spacing + "s\n", name[i], letter[i]));
	}
	//new line does not work line separator for Windows
	//is different \r\n find line separator and use it
	//instead of using \n in print or printf. printline
	//just works fine
	//you can test out what is line
	//separator in this OS by
	//uncommenting these lines of code
	
	//String newLine = System.getProperty("line.separator");
	//textPrintStream.write("This is new line " + newLine + "What is this");
	
	} catch (FileNotFoundException e) {
	System.out.println("Error opening the file " + string2 + "\n" + e.getMessage());
	System.exit(0);
	}
	
	this.textPrintStream.close();
	System.out.println("Letter grade has been calculated for " + name.length + " students listed in input file " + string + " and written to \noutput file " +  string2 + "\n");	
 }
 
  
 private  int getLongestName(String[] nameArray) {
		int spacingSeparation = 10;
		String currentMax = nameArray[0];
		int currentMaxIndex = 0;
		
		for (int j = 0; j < nameArray.length - 1; j++) {
			currentMax = nameArray[j];
			currentMaxIndex = j;
			
			for (int k = 1; k < nameArray.length; k++) {
				if (currentMax.length() < nameArray[k].length()) {
					currentMaxIndex = k;
				}
			}
		}
		int spacing = nameArray[currentMaxIndex].length() + spacingSeparation;
		return spacing;
 }
 
public PrintWriter displayAverages(String[] s, int COUNT) {
	// set up theArrayList of strings. Set up output. Get tokens from the strings
	// from the tokenizer, then call getColumns to get column data 
 
    ArrayList<String[]> token_Array = new ArrayList<String[]>();
    System.out.println("Here are the class averages: \n");
    System.out.println("\t\tQ1\tQ2\tQ3\tQ4\tMidI\tMidII\tFinal");
    token_Array= getTokens(s); 
    getColumns(token_Array);
    return textPrintStream;
    
}

private ArrayList<String[]> getTokens(String[] t) {
	
		// tokenize the elements in each string row 
    	int rows = t.length;
		ArrayList<String[]> scores = new ArrayList<String[]>();
			for (int j = 0; j< rows; j++) {
				StringTokenizer parsewords = new StringTokenizer(t[j], ",");
				String [] tokens = new String[parsewords.countTokens()];
				int k = 0;
		
				while(parsewords.hasMoreTokens()) {
					tokens[k++] = parsewords.nextToken().trim();
				}
				
				// add rows as tokens to array scores
				scores.add(tokens);
						
			}
			// return tokenized array
			return scores;		
	}

private void getColumns(ArrayList<String[]> values) {
    //	for each type (average, min, max), get a column, get average, get max, get min 
	
	// create arraylist for each	
	ArrayList<Double> averages = new ArrayList<Double>();
	ArrayList<Integer> mins = new ArrayList<Integer>();
	ArrayList<Integer> maxs = new ArrayList<Integer>();
	
	
	// for each column i, 
	for (int i = 1; i< values.get(0).length; i++ ) {
		
		// collect row values for the column
		ArrayList <Integer> temp = new ArrayList<Integer>();
		for (int j = 0; j< values.size() ; j++ ) {
			
			// use (j) because it's a token position (i.e., column) in a string array; [i] because it's a row 
			// in the ArrayList
		temp.add(Integer.valueOf(values.get(j)[i])); 
		
		}
		
		// call get functions for averages, mins, maxes, and add values to arraylists
		averages.add(getAverage(temp));
		mins.add(getMin(temp));
		maxs.add(getMax(temp));
				
	}
	
	// print averages, mins, maxes
	System.out.print("Average:");
	for (int k = 0; k < values.size()-1; k++) {
		System.out.printf("\t%5.2f", averages.get(k));
		
	}
	System.out.println();
	System.out.print("Minimums:");
	for (int k = 0; k < values.size()-1; k++) {
		
		System.out.printf("\t%d", mins.get(k));
		
	}
	System.out.println();
	System.out.print("Maximums:");
	for (int k = 0; k < values.size()-1; k++) {
		
		System.out.printf("\t%d", maxs.get(k));
	}
	System.out.println();
	
	pressEnterKeyToContinue();

	}
	
	private double getAverage(ArrayList<Integer> colVals ) {
		
		// calculate averages from column values (colVals) ArrayList
		double temp = 0;
		for (int i = 0; i < colVals.size(); i++) {
			 temp += colVals.get(i);
	}
		temp = temp/colVals.size();
		
		return temp;
	}
	
	private int getMin(ArrayList<Integer> colVals) {
		// calculate minimums from column values ArrayList
		int minTemp = Collections.min(colVals);
		return minTemp;
		} 
	
	private int getMax(ArrayList<Integer> colVals) {
		// calculate maximums from column values ArrayList
		int maxTemp = Collections.max(colVals);
		return maxTemp;
		} 

	
	private void pressEnterKeyToContinue() {
		
		System.out.println("\nPress Enter key to continue...\n");
	        try
	        {
	       System.in.read();
	    	 
	        }
	        catch(Exception e)
	        {System.out.println("You must press Enter key to continue");}  
		
}
	
 public void doCleanup(PrintWriter textPrintStream, String outputFile) {
	 // why do I have to close the PrintWriter twice?
		this.textPrintStream.close();
		}
}

	


