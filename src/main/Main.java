package main;
import controller.Controller;
import model.data_structures.ArregloDinamico;

public class Main {
	
	public static void main(String[] args) 
	{
		Controller controler = new Controller();
		controler.run();
		
		ArregloDinamico<Integer> intArray = new ArregloDinamico<>();
		
		intArray.agregar(2);
		intArray.agregar(5);
		intArray.agregar(8);
		intArray.agregar(10);
		intArray.agregar(15);
		intArray.agregar(21);
		intArray.agregar(25);
		intArray.agregar(35);
		intArray.agregar(48);
		
	for (int i= 0; i < intArray.darCapacidad(); i++) {
		System.out.println(intArray.darElemento(i));
		
		
	}
				
			
		
	
		
		
	}
}
