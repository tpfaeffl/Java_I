package utility;

import java.io.PrintWriter;

public interface ILetterGrader {
		
	public String[] readScore(String string);
	
	public String[] calcLetterGrade(String[] s, int count, String string, String string2);
		
	public PrintWriter displayAverages(String[] s, int COUNT);
		
	public void doCleanup(PrintWriter textPrintStream, String outputFile);
	
}
