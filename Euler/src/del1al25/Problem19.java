package del1al25;

/*
 * You are given the following information, but you may prefer to do some research for yourself.
1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */

public class Problem19 {

	static int febDays;
	static int sundayCounter = 0;
	static int dayCounter = 1;
	static int counter = 1901;

	static String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

	public static void main(String[] args) {

		int leapCounter = 0;
		
		while (counter <= 2001) {
			for(int x = 1; x <= 12; x++) {
				if(x % 2 == 0 && x != 8) {
					if(x == 2) {
						if(counter % 4 == 0) {
							febDays = 29;
							leapCounter++;
						}
						else
							febDays = 28;
						for(int a = 1; a <= febDays; a++) {
							if(week[dayCounter % week.length].equals("Sunday") && a == 1) {
								sundayCounter++;
							}
							dayCounter++;
						}
					}
					else {
						for(int a = 1; a <= 30; a++) {
							if(week[dayCounter % week.length].equals("Sunday") && a == 1) {
								sundayCounter++;
							}
							dayCounter++;
						}
					}
				}
				if(x % 2 != 0 || x == 8) {
					for(int a = 1; a <= 31; a++) {
						if(week[dayCounter % week.length].equals("Sunday") && a == 1) {
							sundayCounter++;
						}
						dayCounter++;
					}
				}
			}
			counter++;
		}

		System.out.println("The number of sundays is: " + sundayCounter);
//		// -1 for the extra counter it takes to get out of the while loop, and 
//		// -1 for the extra year (in days) that is skipped when completely counting all days of the last year (2000)
//		System.out.println("The year is: " + (counter - 2)); 
		System.out.println("The number of leap years: " + leapCounter);
		
	}

}

