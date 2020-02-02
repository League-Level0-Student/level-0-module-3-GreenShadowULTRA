
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "December 22th";
		String dadsBirthday = "September 10th";
		String myBirthday = "January 12th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String input =JOptionPane.showInputDialog("what birthday do u want ye");
		// 3. Print out what the user typed
		System.out.println(input);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (input.equalsIgnoreCase("mom")) {
			
			System.out.println(momsBirthday);
			
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (input.equalsIgnoreCase("dad")) {
			
			System.out.println(dadsBirthday);
			
		}
		// 6. if user asked for your name
			// print myBirthday
		else if (input.equalsIgnoreCase("me")) {
			
			System.out.println(myBirthday);
			
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
else {
	
	System.out.println("L kid");
	
}
		System.exit(0);
	} 
}
