package eCookbook;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



// this is one half of a recipe, I am using inhertance from the abstract class List, that uses a generic ArrayList to allow 
// me to use the List abstract class for both Ingredients and Directions. Where one is of type Ingredients and one is Strings or Sentences, haven't decided yet...
public class IngredientList<Ingredients> extends List {

	
	public IngredientList(ArrayList<Ingredient> ingredientList,String name) {
		super(ingredientList,name);
	}
	public IngredientList() {
		this.list_Entries = new ArrayList<Ingredient>();
		
		
		Boolean addElement = true;  // Boolean to keep adding
		while (addElement) {

			try {
				this.list_Entries.add(new Ingredient());										// add a new ingredient
    				System.out.print("element added\n");	
    				
                System.out.print("Would you like to add an element to your list? Type true or false"); 
                Scanner n = new Scanner(System.in);											// using Scanner to get user input
                addElement = n.nextBoolean();												// store the next boolean that appears
                																				// if false the loop will stop.
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");											// if they didn't give a string loop again
            }
		}
	}
	



	
	public void addList(ArrayList secondList) {
		try {
		ArrayList<Ingredients> i = secondList;
		System.out.println("List Added");					// First Attempt at adding a list to another
		this.list_Entries.add(secondList);					// current issue is that it doesn't regulate what variable you can add
		System.out.print(this.list_Entries);					// can add a Double to an Ingredient list....
		
		}
		catch(Exception e){
			System.out.println("You are trying to add two different types of lists together!");
			return;
		}
		
		
		
	}

}
