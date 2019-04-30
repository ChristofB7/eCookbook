package eCookbook;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Ingredient first = new Ingredient(1,"package","Macaroni"); // create an Ingredient
		ArrayList<Ingredient> i = new ArrayList<Ingredient>(); // create an ArrayList of Ingredients
		i.add(first); // add first(Ingredient) to the ArrayList
		i.add(new Ingredient(1, "cup","flower")); //add a newly created Ingredient to the ArrayList
		ArrayList<Double> j = new ArrayList<Double>();
		Double h = (double) 3;
		j.add(h);
		
		
		System.out.println(first);	// print out the Ingredient to try the toString();
		
		IngredientList Macaroni = new IngredientList(i, "mac"); // create a new Ingredient List named mac using the ArrayList above
		//Macaroni.printList(); // print out the Ingredient List
		System.out.println(Macaroni);
		Macaroni.addList(j);
		System.out.println("\n" + Macaroni.getElement(first, Macaroni.getList()));    // test out the get a specific ingredient from the list 
		
		IngredientList userRecipe = new IngredientList();
		System.out.println(userRecipe);
	}
}

//THINGS THAT WORK
//filling an Ingredient List, by getting user input, through the IngredientList() default constructor, in the console
//creating an Ingredient, by getting user input, through the Ingredient() default constructor, in the console
//finding a specific element in any list


// THINGS LEFT TO DO
// Need to create a directions List class
// Need to create the recipe class
// Need to find a way to fix add one list to another so that it only adds the same type of list together
// Optimize getElement

// IDEAS
// type the Ingredients that you have at your house and it finds good recipes with a database
// Create a grocery list
// Add a recipes Ingredients list to your groceries list (MAYBE EVEN A FUNCTION MINUS THE INGREDIENTS YOU ALREADY HAVE)
// Add the function to fill the list with user input
// 
