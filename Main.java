package Shapes;
/*
File name: Main.java
Date: 30 Jun 20
Author: Shaun Reid
Purpose: The Main class drives the menu and prompts the user for information.  
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	//Variable used to run the menu.
	static double firstDim;
	static double secondDim;
	static String inputDim1;
	static String inputDim2;
	static String response;
	static boolean exitPrgm = false;
	
	
	public static void main(String[] args) {
		//Print this statement only at the beginning of the program. 
		System.out.println("*********Welcome to the Java OO Shapes Program*********");
		
		Scanner reader = new Scanner(System.in);
		
		//Loop that controls the menu.
		while(exitPrgm == false) {
			printMenu();
			
			String input = reader.next();
			
			//Massive if-else structure that controls all of the prompts and creates the shape objects
			try {
				//Circle prompts.
				if (Integer.parseInt(input) == 1) {
					System.out.println("You have selected a Circle.\n");
					System.out.println("What is the radius?\n");
					inputDim1 = reader.next();
					firstDim = Double.parseDouble(inputDim1);
					Circle circle = new Circle(firstDim);
					System.out.println("The area of the Circle is " + circle.area() + ".\n");
				
				//Rectangle prompts.	
				} else if (Integer.parseInt(input) == 2) {
					System.out.println("You have selected a Rectangle.\n");
					System.out.println("What is the length?\n");
					inputDim1 = reader.next();
					firstDim = Double.parseDouble(inputDim1);
					System.out.println("What is the width?\n");
					inputDim2 = reader.next();
					secondDim = Double.parseDouble(inputDim2);
					Rectangle rectangle = new Rectangle(firstDim, secondDim);
					System.out.println("The area of the Rectangle is " + rectangle.area() + ".\n");
					
				//Square prompts.	
				} else if (Integer.parseInt(input) == 3) {
					System.out.println("You have selected a Square.\n");
					System.out.println("What is the side length?\n");
					inputDim1 = reader.next();
					firstDim = Double.parseDouble(inputDim1);
					Square square = new Square(firstDim);
					System.out.println("The area of the Square is " + square.area() + ".\n");
					
				//Triangle prompts	
				} else if (Integer.parseInt(input) == 4) {
					System.out.println("You have selected a Triangle.\n");
					System.out.println("What is the base?\n");
					inputDim1 = reader.next();
					firstDim = Double.parseDouble(inputDim1);
					System.out.println("What is the height?\n");
					inputDim2 = reader.next();
					secondDim = Double.parseDouble(inputDim2);
					Triangle triangle = new Triangle(firstDim, secondDim);
					System.out.println("The area of the Triangle is " + triangle.area() + ".\n");
					
				//Sphere prompts	
				} else if (Integer.parseInt(input) == 5) {
					System.out.println("You have selected a Sphere.\n");
					System.out.println("What is the radius?\n");
					inputDim1 = reader.next();
					firstDim = Double.parseDouble(inputDim1);
					Sphere sphere = new Sphere(firstDim);
					System.out.println("The volume of the sphere is " + sphere.volume() + ".\n");
					
				//Cube prompts	
				} else if (Integer.parseInt(input) == 6) {
					System.out.println("You have selected a Cube.\n");
					System.out.println("What is the side length?\n");
					inputDim1 = reader.next();
					firstDim = Double.parseDouble(inputDim1);
					Cube cube = new Cube(firstDim);
					System.out.println("The volume of the Cube is " + cube.volume() + ".\n");
					
				//Cone prompts	
				} else if (Integer.parseInt(input) == 7) {
					System.out.println("You have selected a Cone.\n");
					System.out.println("What is the radius?\n");
					inputDim1 = reader.next();
					firstDim = Double.parseDouble(inputDim1);
					System.out.println("What is the height?\n");
					inputDim2 = reader.next();
					secondDim = Double.parseDouble(inputDim2);
					Cone cone = new Cone(firstDim, secondDim);
					System.out.println("The volume of the cone is " + cone.volume() + ".\n");
					
				//Cylinder prompts	
				} else if (Integer.parseInt(input) == 8) {
					System.out.println("You have selected a Cylinder.\n");
					System.out.println("What is the radius?\n");
					inputDim1 = reader.next();
					firstDim = Double.parseDouble(inputDim1);
					System.out.println("What is the height?\n");
					inputDim2 = reader.next();
					secondDim = Double.parseDouble(inputDim2);
					Cylinder cylinder = new Cylinder(firstDim, secondDim);
					System.out.println("The volume of the cyliner is " + cylinder.volume() + ".\n");
					
				//Torus prompts	
				} else if (Integer.parseInt(input) == 9) {
					System.out.println("You have selected a Torus.\n");
					System.out.println("What is the major radius?\n");
					inputDim1 = reader.next();
					firstDim = Double.parseDouble(inputDim1);
					System.out.println("What is the minor radius?\n");
					inputDim2 = reader.next();
					secondDim = Double.parseDouble(inputDim2);
					Torus torus = new Torus(firstDim, secondDim);
					System.out.println("The volume of the torus is " + torus.volume() + ".\n");
					
				//Prints the exit message	
				} else if (Integer.parseInt(input) == 10) {
					exitMessage();
					exitPrgm = true;
					break;
				} else {
					while(testMenu(input) == false) {
						System.out.println("That was not part of the menu. Please try again:");
						break;
						
					}
					continue;
				}
			
			} catch (NumberFormatException e) {
				System.out.println("Incorrect input type.\n");
			}
			
			//Selection for if the user would like to continue.  Also, checks for a valid input. 
			System.out.println("Would you like to continue? (Y or N)\n");
			response = reader.next();
			if (response.equals("N")) {
				exitMessage();
				exitPrgm = true;
				break;
			} else if (response.equals("Y")) {
				
			} else {
				while(response.equals("N") == false && response.equals("Y") == false) {
					System.out.println("Sorry I do not understand. Enter Y or N\n");
					response = reader.next();
					if (response.equals("N")) {
						exitMessage();
						exitPrgm = true;
						break;
					} else if (response.equals("Y")) {
					
					}
				}
			}
			
		}
		
		
		reader.close();

	}
	
	//Prints the whole menu. 
	public static void printMenu() {
		
		System.out.println("Select from the menu below: ");
		System.out.println("   1. Construct a Circle");
		System.out.println("   2. Construct a Rectangle");
		System.out.println("   3. Construct a Square");
		System.out.println("   4. Construct a Triangle");
		System.out.println("   5. Construct a Sphere");
		System.out.println("   6. Construct a Cube");
		System.out.println("   7. Construct a Cone");
		System.out.println("   8. Construct a Cylinder");
		System.out.println("   9. Construct a Torus");
		System.out.println("   10. Exit the program\n");
	}

	//Prints the exit message.
	public static void exitMessage() {
		SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM dd");
		SimpleDateFormat timeFormatter = new SimpleDateFormat("hh:mm aaa");
		Date date = new Date();
		System.out.println("Thanks for using the program. Today is " + dateFormatter.format(date) + " at " + timeFormatter.format(date) + ".");
	}
	
	//Tests the range of menu inputs for validity.
	public static boolean testMenu(String inResp) {
		if(Integer.parseInt(inResp) >= 1 && Integer.parseInt(inResp) <= 10) {
			return true;
		} else {
			return false;
		}
	}
}
