package del1al25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand 
 * first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each 
 * name, multiply this value by its alphabetical position in the list to obtain a name score.
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, 
 * is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
 * What is the total of all the name scores in the file?
 */

public class Problem22 {

	static String alphabet = "abcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) throws FileNotFoundException {

		int counter = 0, totalSum = 0;
		
		Scanner file = new Scanner(new File("names.txt"));
		String[] arr = file.next().split(",");

		Arrays.sort(arr);

		for(String name : arr) {
			counter++;
			totalSum+= counter*(calculateScore(name));
		}
		file.close();
		System.out.println("The total sum is: " + totalSum);
	}

	public static int calculateScore(String name) {
		int sum = 0;
		for(int i = 0; i < name.length(); i++)
			sum+= alphabet.indexOf(name.substring(i, i + 1).toLowerCase()) + 1;
		return sum;
	}

}
