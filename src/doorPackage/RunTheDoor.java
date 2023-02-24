package doorPackage;
/*
 * Author: Andrew Roney
 */

import java.util.Scanner;


public class RunTheDoor {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		TheDoor defaultDoor = new TheDoor("handle", "silver", 6, "wood");
		
		System.out.print("The default door setup: \n\n"+ defaultDoor.doorSetup() +"\n\n");
		
		TheDoor door1 =new TheDoor(userInput);//New instance of TheDoor created by the user based on their input.
		
		userInput.close();//Stop user control after finished with scanner method.
		
		System.out.print("The new door setup: \n"+ door1.doorSetup());//Print out the door setup from the user created instance.
		
		
	}
}
