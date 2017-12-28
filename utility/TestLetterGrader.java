package utility;

import java.io.PrintWriter;

public class TestLetterGrader {

	public static void main(String[] args) {
		
   LetterGrader letterGrader = new LetterGrader(args[0], args[1]);
   String [] newArray= letterGrader.readScore(args[0]);
   
   // Get the number of rows in the array
   final int COUNT = newArray.length;

   String [] s = letterGrader.calcLetterGrade(newArray, COUNT, args[0], args[1]);
   PrintWriter textPrintStream=  letterGrader.displayAverages(s, COUNT);
   letterGrader.doCleanup(textPrintStream, args[1]);
	}
		

}
