package Unidad2;

import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class Repartido3 {
	
	//static String[] ar1;
	//static String[] ar2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cargarArrays();
		//nombresNoArr1 (ar1,ar2);
		
		/*
		List <String> lista = nombresNoArr1 (ar1,ar2);
		System.out.println("Los nombres no existentes en el array 2 son:");
		for (int i = 0; i<lista.size() ; i++) {
			System.out.println(lista.get(i));
		}
        */
	}
	
	/*
	public static List<String> nombresNoArr1 (String[]ar1,String[]ar2) {
		boolean encontre;
		List <String> aux = new ArrayList();
		for (int i = 0; i<ar1.length ; i++) {
			encontre = false;
			for (int j = 0; j<ar2.length ; j++) {
				if (ar1[i].equals(ar2[j])) {
					encontre = true;
					break;
				}				
			}
			if (!encontre) {
				aux.add(ar1[i]);				
			}	
		}
		return aux;
	}*/
			
	
	public static void cargarArrays() {
		Scanner dato = new Scanner(System.in);
		System.out.println("Favor ingresar el largo del arreglo 1:");
		String[] ar1 = new String[dato.nextInt()];
		System.out.println("Favor ingresar el largo del arreglo 2:");
		String[] ar2 = new String[dato.nextInt()];
		for (int i = 0; i<ar1.length ; i++) {
			System.out.println("Ingresar un valor del array 1");
			ar1[i]=dato.next();
		}	
		for (int i = 0; i<ar2.length ; i++) {
			System.out.println("Ingresar un valor del array 2");
			ar2[i]=dato.next();
		}	
		
		/*
		
		// System.out.println("Favor ingresar el largo del arreglo 2:");
		// String[] ar2 = new String[dato.nextInt()];
		System.out.println(ar1.length);
		for (int i = 0; i<ar1.length ; i++) {
			System.out.println("Ingresar un valor del array 1");
			ar1[i]=dato.nextLine();
		}
		// System.out.println(ar1[0] + ar1[1] + 3ar1[2]);
		
		for (int i = 0; i<ar2.length ; i++) {
			System.out.println("Ingresar un valor del array 2");
			ar2[i]=dato.nextLine();
		}		
		dato.close();
		
		// Imprimo
		
		for (int i = 0; i<ar1.length ; i++) {
			System.out.println(ar1[i]);
		}
		for (int i = 0; i<ar2.length ; i++) {
			System.out.println(ar2[i]);
			ar2[i]=dato.nextLine();
		}		
		*/
		dato.close();		
	}

}
