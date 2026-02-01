package week2;

import java.util.Scanner;
public class EncouragementAPP {
	
	// This program inputs a user's full name and uses it in encouraging text.
	
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		// Declare the string variables for the user's name:
		String firstName;
		String middleName;
		String lastName;
		
		// Declare and initialize the characters that will be used:
		char smile = '☺';
		char sparkle = '✨';
		char heart = '❤';
		
		// Ask the user to input each part of their name (first, middle, and last)
		// and assign a separate variable to each:
		System.out.println("Input your name.");
		System.out.print("First: ");
		firstName = userinput.nextLine();
		System.out.print("Middle: ");
		middleName = userinput.nextLine();
		System.out.print("Last: ");
		lastName = userinput.nextLine();
		
		// Display encouraging text that addresses the user by name and includes 
		// the characters defined above:
		System.out.format("\n%s %s %s, you are amazing! %c You can do anything"
				+ "\nyou put your mind to, so keep striving to reach your goals and"
				+ "\nmake your dreams become reality! %c Your hard work will pay off! %c",
				firstName, middleName, lastName, smile, sparkle, heart);
		System.out.format("\n\nAlso, %s, remember Philippians 4:13:", firstName);
		System.out.println("\n\"I can do all things through Christ which strengtheneth me.\"");
			
	}

}