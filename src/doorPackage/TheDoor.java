package doorPackage;

/*
 * Author: Andrew Roney
 */
import java.util.Scanner;


public class TheDoor {
	private String knob;
	private String hingeColor;
	private String material;
	private int height;
	
	//Constructor: setting up the door
	public TheDoor(String knob, String hingeColor, int height, String material) {
		this.knob = knob;
		this.hingeColor = hingeColor;
		this.height = height;
		this.material = material;
	}
	
//Method: Gather user input for the door.
	public TheDoor(Scanner userInput) {
		System.out.println("Follow the instructions to setup the new door:\n");
		
		System.out.println("Enter the door knob type: ");
			setKnob(userInput.nextLine());
			
		System.out.println("Enter the door hinge color: ");
			setHingeColor(userInput.nextLine());
		
		System.out.println("Enter the door height in feet (rounded to nearest whole number): ");
			setHeight(userInput.nextInt());
			
		System.out.println("Enter the door material: ");
			setMaterial(userInput.nextLine());
	}
	
	
//Method: Set the door's knob type.
	public TheDoor setKnob(String knob) {
		this.knob = knob;
		return this;
	}
	
//Method: Set the door's hinge color.
	public TheDoor setHingeColor(String hingeColor) {
		this.hingeColor = hingeColor;
		return this;
	}

//Method: Set the door's height.
	public TheDoor setHeight(int height) {
		this.height = height;
		return this;
	}

//Method: Set the door's material type.
	public TheDoor setMaterial(String material) {
		this.material = material;
		return this;
	}
	
	
//Method: Called to retrieve current value of the knob type.
	public String getKnob() {
		return this.knob;
	}
	
//Method: Called to retrieve current value of the height.
	public int getHeight() {
		return this.height;
	}
	
//Method: Called to retrieve the current value of the hinge color.
	public String getHingeColor() {
		return this.hingeColor;
	}

//Method: Called to retrieve the current value of the material.
	public String getMaterial() {
		return this.material;
	}
	
//Method: Called to print out statement.
	public String doorSetup() {
		
		return "The Current door setup: \n"+"\tKnob: "+ getKnob() +"\n\tHinge Color: "+ getHingeColor() +"\n\tHeight: "+ getHeight() +"ft";
	}
}

	
