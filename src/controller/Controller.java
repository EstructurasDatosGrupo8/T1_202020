package controller;

import java.util.Scanner;

import model.logic.Modelo;
import view.View;

public class Controller {

	/* Instancia del Modelo*/
	private Modelo modelo;
	
	/* Instancia de la Vista*/
	private View view;
	
	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
	}
		
	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		Integer dato = 0;
		Integer respuesta = 0;

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			Scanner entradaEscaner = new Scanner (System.in);
			switch(option){
			
			
				case 1:
					view.printMessage("---------\nCargando...");
					long startTime =System.currentTimeMillis();
					modelo.cargaDatos();
					long endTime =System.currentTimeMillis();
					long delta = endTime-startTime;
					view.printMessage("---------\nArchivo Cargado tiempo de carga: " + delta + " milisegundo");
					break;
					
				case 2: 
					view.printMessage("diga nombre director"); 
					String nombreDirector=entradaEscaner.nextLine();
					view.printMessage(modelo.requerimiento1(nombreDirector));
					break;
					

				default: 
					view.printMessage("--------- \n Opcion Invalida !! \n---------");
					break;
			}
		}
		
	}	
}
