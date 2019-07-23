package Unidad1;
import java.util.Scanner;

public class Repartido1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ejercicio8();	 
		// ejercicio2();
		// ejercicio10();
		ejercicio11();
	}
	
	
	public static void ejercicio8 () {
		//8 - Solicitar al usuario dos números y decirle si son iguales y si son distintos decirle cual es mayor.
		Scanner dato = new Scanner(System.in);
		System.out.println("Favor ingresar primer número:");
		int numero1 = dato.nextInt();
		System.out.println("Favor ingresar segundo número:");
		int numero2 = dato.nextInt();
		
        if (numero1 == numero2) {
        	System.out.println("Los números ingresados son iguales: " + numero1);
        }else if (numero1 < numero2) {
        	System.out.println("El primer numero ingresado (" + numero1 + ") " + "es menor que el segundo numero ingresado (" + numero2 + ")");
        	
        }else {
        	System.out.println("El primer numero ingresado (" + numero1 + ") " + "es mayor que el segundo numero ingresado (" + numero2 + ")");
        }
				
	} // Fin Ejercicio 8
	
	public static void ejercicio2 () {
		Scanner dato = new Scanner(System.in); 
		System.out.println("Ingrese por favor su nombre:");
	    String nombre = dato.nextLine();
		System.out.println("Ingrese por favor su apellido:");
	    String apellido = dato.nextLine();
		System.out.println("Ingrese por favor su CI:");
	    String ci = dato.nextLine();
		System.out.println("Ingrese por favor su telefono:");
	    String telefono = dato.nextLine();
		System.out.println("Ingrese por favor su direccion:");
	    String direccion = dato.nextLine();
		System.out.println("Ingrese por favor su edad:");
	    byte edad = dato.nextByte();
		System.out.println("Ingrese por favor su altura:");
        int altura = dato.nextInt();
		System.out.println("Ingrese por favor su peso:");
		byte peso = dato.nextByte();
		System.out.println("Ingrese por favor su dia de nacimiento:");
		byte dia = dato.nextByte();
		System.out.println("Ingrese por favor su mes de nacimiento:");
		byte mes = dato.nextByte();
		System.out.println("Ingrese por favor su anio de nacimiento:");
		short anio = dato.nextShort();
		
		System.out.println("#########################################");
		System.out.println("Nombre Completo: " + nombre + " " + apellido);
		System.out.println("Edad: " + edad);
		System.out.println("Fecha de nacimiento: " + dia + "/" + mes + "/" + anio);
		System.out.println("Celular: " + telefono);
		System.out.println("Dirección: " + direccion);
		System.out.println("#########################################");
		dato.close();
	} // Fin Ejercicio 2
	
	public static void ejercicio10 () {
		Scanner dato = new Scanner(System.in); 
		System.out.println("Ingrese su nota: ");
	    byte nota = dato.nextByte();
	    
	    
	    
	    if (nota >=0 && nota <= 4) {
	    	System.out.println("Su nota es insuficiente");
	    } else if (nota == 5) {
	    	System.out.println("Su nota es Aceptable");
	    	
	    }else if (nota >=6 && nota <= 7) {
	    	System.out.println("Su nota es Bueno");
	    	
	    } else if (nota >=8 && nota <= 9) {
	    	System.out.println("Su nota es Muy bueno");
	    	
	    } else if (nota >=10 && nota <= 11) {
	    	System.out.println("Su nota es Muy bueno sobresaliente");
	    	
	    } else if (nota == 12) {
	    	System.out.println("Su nota es Sobresaliente");
	    } else  {
	    	System.out.println("Favor ingresar una nota del 0 al 12");
	    }
	    dato.close();
	  			
	} // Fin Ejercicio 10
	
	public static void ejercicio11 () {
		Scanner dato = new Scanner(System.in); 
		boolean continuar = true;
		while (continuar) {
			System.out.println("1 - ingresar nota");
            System.out.println("2- Salir");
            byte opcion = dato.nextByte();
            if(opcion == 1) {
                System.out.println("Por favor ingrese una nota");
                byte nota = dato.nextByte();
                switch (nota) {
                	case 0:
                	case 1:
                	case 2:
                	case 3:
                	case 4:
                		System.out.println("Su nota es insuficiente");
                		break;
                	case 5:
                		System.out.println("Su nota es Aceptable");
                		break;
                	case 6:
                	case 7:
                		System.out.println("Su nota es Bueno");
                		break;
                	case 8:
                	case 9:
                		System.out.println("Su nota es Muy bueno");
                		break;
                	case 10:
                	case 11:
                		System.out.println("Su nota es Muy bueno sobresaliente");
                		break;
                	case 12:
                		System.out.println("Su nota es Sobresaliente");
                		break;
                	default:
                		System.out.println("Favor ingresar una nota del 0 al 12");
                		break;
				
                }
            }else if(opcion == 2){
                System.out.println("Chau!");
                continuar = false;
            } else {
                System.out.println("Opcion incorrecta");
            }
        }
        dato.close();
        	
	} // Fin Ejercicio 11

}
