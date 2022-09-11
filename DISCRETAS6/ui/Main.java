package ui;

import java.util.Scanner;

import model.Conjunto;

public class Main {

	public static Scanner lector=new Scanner(System.in);
	
	public static void main(String[] args) {

		String[] set= new String[4];
		

		Conjunto element=new Conjunto(set);
		
		int option=0;
		while (option!=6){
		option=menu();

		
		switch(option) {
		case 1:
			element.insertar();
			break;
		case 2:
			element.eliminar();
			break;
		case 3:
			element.union();
			break;
		case 4:
			element.interseccion();
			break;
        case 5:
            element.pertenece();
            break;

		case 6:
			System.out.println("See you later!!!");
			break;
		}
	}
		
	}
	//metodo para implementar un sistema de menu
	public static int menu() {
		int menu=0;
		System.out.println("\nMAIN  MENU  \n1) Create a set  \n2) To erase a set \n3) To perform a union of two sets Enter \n4) To perform an intersection of two sets \n5) To know if an object of the element belongs to the set. \n6) EXIT");
		menu=lector.nextInt();
		return menu;
	}
}