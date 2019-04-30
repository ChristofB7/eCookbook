package eCookbook;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ingredient {
	/* This class contains 3 variables, an amount, the measurement, and the name of the product
	   The purpose of this class is to be able to print out the ingredients of a recipe easily
	   so the main function in this class is it's toString().
	   i.e. 1 cup flower.
	*/
	
	
	//private variables
	private int amount_Needed;
	private String name_Of_Measurement;
	private String name_Of_Ingredient;
	
	
	
	//constructors
	public Ingredient(int amount, String measurement, String name) { // constructor using the private variables
		this.amount_Needed = amount;
		this.name_Of_Measurement = measurement;
		this.name_Of_Ingredient = name;
	}
	
	public Ingredient() {  				// default constructor takes in user input to fill in the variables
		
		try { 																	//NAME OF MEASUREMENT
			Scanner input1 = new Scanner(System.in);								//using a scanner to gather input
		
			System.out.println("What do you use to measure this ingredient?");
			String measureName = input1.nextLine();								//store the user input in this variable
			this.name_Of_Measurement = measureName;								//set the Ingredient name of measurement to the user input
		}catch (InputMismatchException e) {
            System.out.println("Invalid input!");									// if they didn't give the right input, quit 
            return;
        }
		try {																	//MEASUREMENT AMOUNT
			Scanner input2 = new Scanner(System.in);								//use a new scanner to gather input (for some reason didn't work when i used one, could optimize?)_
		
			System.out.println("How many " + this.name_Of_Measurement + " do you need?");
			int amt = input2.nextInt();											//store the user input in the int called amt
			this.amount_Needed = amt;											// set the Ingredient amount to the user input
		}catch (InputMismatchException e) {
            System.out.println("Invalid input!");									// if they didn't give the right input, quit
            return;
        }
		try {																	//INGREDIENT NAME
			Scanner input3 = new Scanner(System.in);
			System.out.println("What is the name of the ingredient?");
			String ingredientName = input3.nextLine();							//same exact thing as the two above
			this.name_Of_Ingredient = ingredientName;
		}catch (InputMismatchException e) {
            System.out.println("Invalid input!");									// if they didn't give the right input, quit
            return;
        }
	}
	
	
	
	//to string to help printing
	public String toString() { 
		return this.getAmount() +" "+ this.getMeasure() +" "+ this.getName();
	}
	
	//getters
	public int getAmount() {
		return this.amount_Needed;
	}
	public String getName() {
		return this.name_Of_Ingredient;
	}
	public String getMeasure() {
		return this.name_Of_Measurement;
	}
}
