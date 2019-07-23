package Practico5.Ejercicio1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {


	public static void main(String[] args) throws Exception {
		/*Persona p1; //referencia
		p1 = new Persona(); //objeto
		p1.setNombre("Pepita Rodriguez");
		p1.setEdad(19);
		p1.setSexo(true);
		p1.setCi("242348234823");
		p1.imprimirPersona();*/
		
		//p1.edad = -3; //esto esta mal
		boolean salir = false;
		List<Persona> lista = new ArrayList();
		while(!salir) {
			
			System.out.println("MENU PRINCIPAL");
			System.out.println("1- Ingresar nueva persona");
			System.out.println("2- Buscar persona");
			System.out.println("3- Imprimir todas");
			System.out.println("4- Salir");
			
			Scanner entrada = new Scanner(System.in);
			String op = entrada.nextLine();
			
			switch (op) {
			case "1":   //Agregar Persona
				Persona p;
				Persona p3;
				p = agregarPersona();
				p3 = BuscarPersona(lista, p.getCi());
				if (p3 == null) {
					lista.add(p);
				}
				else {
					System.out.println("*** La persona ya existe ***");
				}
				
				break;

			case "2":   // Buscar Personas
				
				Scanner entrada2 = new Scanner(System.in);
				String ci = solicitarCi();
				Persona p2;
				System.out.println("*** Ingrese CI de persona a buscar ***");
				
				p2 = BuscarPersona(lista,ci);
				if (p2 == null) {
					System.out.println("*** No se encontro la persona ***");
				}
				else {
					System.out.println("*** La CI ingresada pertenece a: ***");
					System.out.println("*** CI: " + p2.getCi() + " Nombre: " +  p2.getNombre() + " Edad: " + p2.getEdad() + " ***");
				}
				
				break;
			case "3":
				//imprimir personas
				/*for (int i=0; i<lista.size(); i++) {
					lista.get(i).imprimirPersona();
				}*/
				if (lista.size() == 0) {
					System.out.println("No hay personas en la lista");
				}
				else {
					for(Persona pe:lista) {
						pe.imprimirPersona();
					}
				}
				entrada.nextLine();
				break;
			case "4":
				System.out.println("Chau!");
				salir = true;
				break;
			default:
				System.out.println("No es una opcion correcta");
				break;
			}
			//entrada.close();
		}
		
		
	}// fin del main
	
	
	public static String solicitarCi() {
		boolean correcta = false;
		while(!correcta) {
			System.out.println("*** Por favor ingrese la CI ***");
			Scanner e = new Scanner(System.in);
			String ci = e.nextLine();
			if (Persona.validarCi(ci) && !ci.equals("")) {
				//1e.close();
				return ci;
			} else {
				System.out.println("La ci no es correcta");
			}
			//e.close();
		}
		
		return null;
	}
	
	public static String solicitarNombre() {
		System.out.println("Por favor ingresar un nombre:");
		Scanner e = new Scanner(System.in);
		String nombre = e.nextLine();
		//e.close();
		return nombre;
		
		//ejercsicio
		
	}
	
	
	public static int solicitarEdad() {
		boolean correcta = false;
		String error = "";
		int edad = 0;
		while (!correcta) {
			System.out.println("Por favor ingrese edad:");
			try {
				Scanner e = new Scanner(System.in);
				edad = e.nextInt();
				//e.close();
			} catch (Exception e2) {
				error = "La edad no es correcta " + e2;
			}
			if (error == "") {
				correcta = true;
			}else {
				System.out.println(error);
				error = "";
			}			
		}
		return edad;		
	}
	
	public static boolean solicitarSexo() {
		boolean incorrecta = true;
		boolean sexo = false;
		while(incorrecta) {
			System.out.println("Digite la opcion deseada");
			System.out.println("1 - Femenino");
			System.out.println("2 - Masculino");
			Scanner dato = new Scanner(System.in);
			String op = dato.nextLine();
			switch (op) {
			case "1":
				sexo = true;     
				incorrecta = false;
				break;
			case "2":
				incorrecta = false;
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}

		return sexo;
	}
	
	public static Persona agregarPersona() throws Exception {
		//System.out.println("entra1");
		String ci = solicitarCi();		
		boolean sexo = solicitarSexo();
		int edad = solicitarEdad();
		String nombre = solicitarNombre();
		Persona p = new Persona(nombre,edad,sexo,ci);

		return p;
	}
	public static Persona BuscarPersona(List<Persona> lista, String Ci) {
		
		for(Persona pe:lista) {
			if (pe.getCi().equals(Ci)) {
				return pe;
			}		
		}
		return null;		
	}
}