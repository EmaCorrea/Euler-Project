package del1al25;

/*
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) 
contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 */

public class Problem17 {

	static String[] ones = {"one","two","three","four","five","six","seven","eight","nine","ten"};
	static int count = 0, digit = 0;
	static boolean no = false;
	static StringBuilder str = new StringBuilder();

	public static void main(String[] args) {

		for(int i = 1; i <= 1000; i++) {
			str.setLength(0);
			if(i > 10) {
				if(Integer.toString(i).length() == 3)
					countHundreds(i);
				else if(Integer.toString(i).length() == 2)
					countTens(i);
			}
			else {
				count+= ones[i-1].length();
				str.append(ones[i-1] + " ");
			}

			if(i == 1000) {
				count+= "onethousand".length();
				str.append("onethousand ");
			}

			System.out.println(i + " - " + str.toString());
		}

		System.out.println("Total: " + count);
		System.out.println(str.toString());

	}

	public static void countHundreds(int x) {
		char[] digits = String.valueOf(x).toCharArray();
		digit = x/100;

		switch(digit) {
		case 1:
			count+= "onehundred".length();
			str.append("onehundred ");
			break;
		case 2:
			count+= "twohundred".length();
			str.append("twohundred ");
			break;
		case 3:
			count+= "threehundred".length();
			str.append("threehundred ");
			break;
		case 4:
			count+= "fourhundred".length();
			str.append("fourhundred ");
			break;
		case 5:
			count+= "fivehundred".length();
			str.append("fivehundred ");
			break;
		case 6:
			count+= "sixhundred".length();
			str.append("sixhundred ");
			break;
		case 7:
			count+= "sevenhundred".length();
			str.append("sevenhundred ");
			break;
		case 8:
			count+= "eighthundred".length();
			str.append("eighthundred ");
			break;
		case 9:
			count+= "ninehundred".length();
			str.append("ninehundred ");
			break;
		}
		if(digits[1] == '0' && digits[2] != '0') {
			count+= "and".length();
			str.append("and ");
			countTens(x);
		}
		else if(digits[1] != '0' && digits[2] == '0') {
			count+= "and".length();
			str.append("and ");
			countTens(x);
		}
		else if(digits[1] != '0' && digits[2] != '0') {
			count+= "and".length();
			str.append("and ");
			countTens(x);
		}
		//		if(digits[1] != '0' && digits[2] != '0') {
		//			count+= "and".length();
		//			countTens(x);
		//		}
		//		else if(digits[1] != '0') {
		//			count+= "and".length();
		//			countTens(x);
		//		}
		//		else if(digits[1] == '0' && digits[2] != '0') {
		//			count+= "and".length();
		//			countTens(x);
		//		}

	}

	public static void countTens(int x) {
		char[] digits = String.valueOf(x).toCharArray();
		int a, b;
		no = false;

		if(digits.length == 3) {
			digit = Character.getNumericValue(digits[1]);
			a = Character.getNumericValue(digits[2]);
			b = 2;
		}
		else {
			digit = Character.getNumericValue(digits[0]);
			a = Character.getNumericValue(digits[1]);
			b = 1;
		}

		switch(digit) {
		case 1:
			if(digits[b] != '0') {
				no = true;
				if(a == 1) {
					count+= "eleven".length();
					str.append("eleven ");
				}
				else if(a == 2) {
					count+= "twelve".length();
					str.append("twelve ");
				}
				else if(a == 3) {
					count+= "thirteen".length();
					str.append("thirteen ");
				}
				else if(a == 4) {
					count+= "fourteen".length();
					str.append("fourteen ");
				}
				else if(a == 5) {
					count+= "fifteen".length();
					str.append("fifteen ");
				}
				else if(a == 6) {
					count+= "sixteen".length();
					str.append("sixteen ");
				}
				else if(a == 7) {
					count+= "seventeen".length();
					str.append("seventeen ");
				}
				else if(a == 8) {
					count+= "eighteen".length();
					str.append("eighteen ");
				}
				else if(a == 9) {
					count+= "nineteen".length();
					str.append("nineteen ");
				}
			}
			else {
				count+= "ten".length();
				str.append("ten ");
			}
			break;
		case 2:
			count+= "twenty".length();
			str.append("twenty ");
			break;
		case 3:
			count+= "thirty".length();
			str.append("thirty ");
			break;
		case 4:
			count+= "forty".length();
			str.append("forty ");
			break;
		case 5:
			count+= "fifty".length();
			str.append("fifty ");
			break;
		case 6:
			count+= "sixty".length();
			str.append("sixty ");
			break;
		case 7:
			count+= "seventy".length();
			str.append("seventy ");
			break;
		case 8:
			count+= "eighty".length();
			str.append("eighty ");
			break;
		case 9:
			count+= "ninety".length();
			str.append("ninety ");
			break;
		}
		if(digits[b] != 0 && no != true) {
			digit =  Character.getNumericValue(digits[b]);
			if(digit != 0) {
				count+= ones[digit - 1].length();
				str.append(ones[digit -1] + " ");
			}
		}

		//		System.out.println("AAAAAAAAA " + count);

	}

}
