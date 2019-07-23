package Unidad2;

import java.util.Scanner;

public class Teorico2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] ar1 = new int[3];
		ar1[0] = 1;
		ar1[1] = 2;
		ar1[2] = 3;
		//ar1[3] = 4;
		int[] ar2 = new int[3];
		ar2[0] = 1;
		ar2[1] = 2;
		ar2[2] = 3;
		*/
		//System.out.println("Los arreglos son iguales?: " + sonIguales(ar1,ar2));
		cargarArrays();
		/*
		int[] arNumeros = new int[6];
		arNumeros[0] = 1;
		arNumeros[1] = 2;
		arNumeros[2] = 3;
		arNumeros[3] = 4;
		arNumeros[4] = 5;
		arNumeros[5] = 6;
		
		
		for (int i = 0; i<arNumeros.length ; i++) {
			System.out.println(arNumeros[i]);
		}*/
	
	}
	
	public static void cargarArrays() {
		Scanner dato = new Scanner(System.in);
		System.out.println("Favor ingresar el largo del arreglo 1:");
		int[] ar1 = new int[dato.nextInt()];
		System.out.println("Favor ingresar el largo del arreglo 2:");
		int[] ar2 = new int[dato.nextInt()];
		if(ar1.length != ar2.length) {
			System.out.println("Los arreglos tienen diferente largo");
		}
		else {
			for (int i = 0; i<ar1.length ; i++) {
				System.out.println("Ingresar un valor del array 1");
				ar1[i]=dato.nextInt();
			}
			for (int i = 0; i<ar1.length ; i++) {
				System.out.println("Ingresar un valor del array 2");
				ar2[i]=dato.nextInt();
			}
			System.out.println("Los arreglos son iguales?: " + sonIgualesV2(ar1,ar2));
		}
		dato.close();
				
	}
	
	public static boolean sonIguales(int[]ar1, int[]ar2) {
		boolean resultado = false;
		if(ar1.length != ar2.length) {
			return false;
		}	
		else {
			for (int i = 0; i<ar1.length ; i++) {
				if (ar1[i] == ar2[i]) {
					resultado = true;
				}else {
					return false;
				}		
			}
			
		}	
		return resultado;
	}
	public static boolean sonIgualesV2(int[]ar1, int[]ar2) {
		if(ar1.length != ar2.length) {
			return false;
		}	
		else {
			for (int i = 0; i<ar1.length ; i++) {
				if (ar1[i] != ar2[i]) {
					return false;
				}		
			}
			
		}	
		return true;
	}
}


