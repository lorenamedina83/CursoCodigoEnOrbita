package Unidad2;

import java.util.Scanner;

public class Repartido2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ejercicio2();
		//ejercicio2V2();
		//ejercicio3();
		ejercicio3V2();
		
		
	}
	public static void ejercicio2() {
		Scanner dato = new Scanner(System.in);
		int[] arNumeros = new int[5];
		System.out.println("Favor ingrese 5 numeros:");
		for (int i = 0; i<arNumeros.length ; i++) {
			System.out.println("Favor ingrese el numero: " + (i+1));
			arNumeros[i] = dato.nextInt();
		}
		System.out.println("Los numeros que usted ingreso son:");
		for (int i = 0; i<arNumeros.length ; i++) {
			System.out.println(arNumeros[i]);
		}
		dato.close();
	}
	public static void ejercicio2V2() {
		Scanner dato = new Scanner(System.in);
		int[] arNumeros = new int[5];
		System.out.println("Favor ingrese 5 numeros:");
		for (int i = 1; i<=arNumeros.length ; i++) {
			System.out.println("Favor ingrese el numero: " + i);
			arNumeros[i-1] = dato.nextInt();
		}
		System.out.println("Los numeros que usted ingreso son:");
		for (int i = 0; i<arNumeros.length ; i++) {
			System.out.println(arNumeros[i]);
		}
		dato.close();
	}
	public static void ejercicio3() {
		Scanner dato = new Scanner(System.in);
		int[] arNumeros = new int[5];
		System.out.println("Favor ingrese 5 numeros:");
		for (int i = 1; i<=arNumeros.length ; i++) {
			System.out.println("Favor ingrese el numero: " + i);
			arNumeros[i-1] = dato.nextInt();
		}
		System.out.println("Los numeros que usted ingreso son:");
		for (int i = 0; i<arNumeros.length ; i++) {
			if (i==4) {
			System.out.print(arNumeros[i]);
			} else {
				System.out.print(arNumeros[i] + ",");
				}
			}
		dato.close();
	}
	public static void ejercicio3V2() {
		Scanner dato = new Scanner(System.in);
		int[] arNumeros = new int[5];
		System.out.println("Favor ingrese 5 numeros:");
		for (int i = 1; i<=arNumeros.length ; i++) {
			System.out.println("Favor ingrese el numero: " + i);
			arNumeros[i-1] = dato.nextInt();
		}
		System.out.println("Los numeros que usted ingreso son:");
		for (int i = 0; i<arNumeros.length ; i++) {
			
			System.out.print(arNumeros[i]);
			if (i!=4) {
				System.out.print(",");
			} 
		}
		dato.close();
	}
	
	
}
