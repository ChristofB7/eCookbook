package eCookbook;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class List<E> {
	//private variables
	protected ArrayList<E> list_Entries; // generic type because the entries for an ingredient list will be different than the directions.
	private String list_Name;			//the list name is currently not used at all.
	
	//constructor when you already have the required variables
	public List(ArrayList<E> list, String name) {
		this.list_Entries = list;
		this.list_Name = name;
	}
	// default constructor should be a part of all other lists where it gets user input to fill out the list
	public List() {};
	
	//assuming that all new classes (Ingredients) have their own toStrings
	public String toString() {
		return this.getList().toString(); // use the toString of the ArrayList
	}
	
	
	public static <T> T getElement(T element, ArrayList<T> list) {		//pretty inefficient to use ArrayList<T> list
		int i = list.indexOf(element);									// because we are trying to find the element in the list we are calling
		return list.get(i);												// the function from
																		//Room to optimize here.
	}
	
	public abstract void addList(ArrayList<E> i);
	
	//getters
	public String getName() {
		return this.getName();
		}
	public ArrayList<E> getList() {
		return this.list_Entries;
	}
}
