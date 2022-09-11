package model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Conjunto<T> implements Operaciones<T>{
	
	public static Scanner lector=new Scanner(System.in);
	
	private T[] setP;
	
	
	public Conjunto(T[] conjunto) {
		this.setP=conjunto;
	}

	public void insertar() {
		System.out.println("¿How many objects has the set?");
		int cant1=lector.nextInt();
		lector.nextLine();

		
		Set<T> setA = new HashSet<T>() ;

		System.out.println("Enter the elements for create the set: ");

		for(int i=0;i<cant1;i++) {
			setP[i]= (T) lector.nextLine();
		}

		setA.addAll(Arrays.asList(setP));
		
	}

	public void union() {
		System.out.println("How many elements has the first set? : ");
		int cant1=lector.nextInt();
		lector.nextLine();

		
		Set<T> setA = new HashSet<T>() ;

		System.out.println("Enter the elements for create the set : ");

		for(int i=0;i<cant1;i++) {
			setP[i]= (T) lector.nextLine();
		}

		setA.addAll(Arrays.asList(setP));
		

		System.out.println("How many elements has the second set? : ");
		int cant2=lector.nextInt();
		lector.nextLine();

		
		Set<T> setB = new HashSet<>( ) ;

		System.out.println("Enter the elements for create the second set : ");

		for(int i=0;i<cant2;i++) {
			setP[i]=(T) lector.nextLine();
		}

		setB.addAll(Arrays.asList(setP));

		Set<T> setUnion = new HashSet<>(setA);
		setUnion.addAll (setB);

		System.out.println("Union of set A and B" );
		System.out.println( setUnion );

		
	}

	public void interseccion() {
		System.out.println("How many elements has the first set? : ");
		int cant1=lector.nextInt();
		lector.nextLine();

		
		Set<T> setA = new HashSet<T>() ;

		System.out.println("Enter the elements for create the first set : ");

		for(int i=0;i<cant1;i++) {
			setP[i]= (T) lector.nextLine();
		}

		setA.addAll(Arrays.asList(setP));
		

		System.out.println("How many elements has the second set?");
		int cant2=lector.nextInt();
		lector.nextLine();

		
		Set<T> setB = new HashSet<>( ) ;

		System.out.println("Enter the elements for create the second set");

		for(int i=0;i<cant2;i++) {
			setP[i]=(T) lector.nextLine();
		}

		setB.addAll(Arrays.asList(setP));


		Set<T> intersection = new HashSet<>(setA);
		intersection.retainAll(setB);

		System.out.println("intersection of set A and B" );
		System.out.println( intersection );
	}

    
    public void eliminar() {
        
  

		System.out.println("¿How many objects has the set to eliminate ?");
		int cant1=lector.nextInt();
		lector.nextLine();

		
		Set<T> setA = new HashSet<T>() ;

		System.out.println("Enter the elements for erase the set: ");
        int n = lector.nextInt();

		for(int i=0;i<cant1;i++) {      
			if(pertenece()) {
			setP[n].remove(n);
			size--;
		}
		}

		setA.removeAll(Arrays.asList(setP));
		
    }

    public boolean pertenece() {
    System.out.println("¿Which element do you want to search?:");
     String n = lector.nextLine();

    System.out.println("s: " + set);
    for (int i = 0; i < set; i++) {
       if(setP[i] == n) {
           return true;
       }
   }
   return false;
    }




}