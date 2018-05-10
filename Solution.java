import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int columns;
		int rows;
		double squareRoot;

		squareRoot = Math.sqrt(s.length());

		rows = (int) Math.floor(squareRoot);
		columns = (int) Math.ceil(squareRoot);

		StringBuilder result = new StringBuilder();
				
		int remainder = columns * rows - s.length();
		int counter = 0;

		for (int i = 0; i < columns; i++) {
			int counterLettersInWord = 0;

			while (true) {
				if ((i + counterLettersInWord) <= s.length() - 1) {
					int x = i + counterLettersInWord;
					result.insert(counter, s.charAt(x));
					counter++;
				} else {
					break;
				}
				counterLettersInWord += columns;
			}
			if (i != columns - 1) {
				result.insert(counter, " ");
				counter++;
			}
		}

		System.out.println(result.toString());
	}

}
