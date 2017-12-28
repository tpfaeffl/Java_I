package Homework_6;

public class TestWithDelimiters {

	public static void main(String[] args) {

		String[] temp1 = WithDelimiters.split("a?b?gf#e", "#?");
		for (String s : temp1) {
			System.out.print(s);
		}
	}

}
