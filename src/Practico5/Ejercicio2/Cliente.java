package Practico5.Ejercicio2;

import java.util.Scanner;

public class Cliente {
	//atributos
    private int id;
    private String nombre;
    private String ci;
    private int edad;
    private Cuenta[] arrCuentas;

    private int tope= -1;

    public int getTope() {
        return tope;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("No puede haber menores de edad como clientes");
        } else {
            this.edad = edad;
        }

    }

    public Cuenta[] getArrCuentas() {
        return arrCuentas;
    }


    //contructor
    public Cliente(String nombre, String ci, int edad, int cantCuentas){
        this.setNombre(nombre);
        this.id++;
        this.setEdad(edad);
        this.setCi(ci);

        this.setArrCuentas(new Cuenta[cantCuentas]);
        this.setTope(this.getTope() + 1);
    }

    public void imprimirCliente(){
        System.out.println("---------------------------------------");
        System.out.println("Datos de " + this.getNombre());
        System.out.println("Cliente numero " + this.getCi());
        System.out.println("Edad: " + this.getCi());
        System.out.println("Numero de CI: " + this.getCi());
        System.out.println("---------------------------------------");
    }

    public static boolean validarCi(String ci) {
        return true;
    }

    public static String solicitarNombre() {
        Scanner dato = new Scanner(System.in);
        boolean valido=false;
        while (!valido) {
            System.out.println("Ingrese el nombre completo");
            String nombre = dato.nextLine();
            if (!nombre.equals("")) {
                valido = true;
            } else {
                System.out.println("El nombre no puede ser vacio");
            }
        }


        return nombre;
    }

    public static String solicitarCi() {
        Scanner dato = new Scanner(System.in);
        String ci = "";
        boolean valida = false;
        while(!valida) {
            System.out.println("Ingrese la CI");
            ci = dato.nextLine();
            if(Persona.validarCi(ci) && !ci.equals("")) {
                valida = true;
            } else {
                System.out.println("La CI no es valida");
            }
        }

        return ci;
    }

    public static int solicitarEdad() {
        int edad = 0;
        boolean valida = false;
        String error = "";
        while(!valida) {
            System.out.println("Ingrese una edad");
            try {
                Scanner dato = new Scanner(System.in);
                edad = dato.nextInt();
            } catch (Exception e) {
                error= "La edad ingresada debe ser un numero";
                System.out.println(e);
            }

            if(error == "") {
                valida = true;
            } else {
                System.out.println(error);
                error = "";
            }
        }
        return edad;
    }

    public void agregarCuenta(Cuenta c) {
        if (this.arrCuentas.length >= this.getTope()) {
            this.arrCuentas[this.getTope()] = c;
            System.out.println("Se agrego la cuenta correctamente");
        } else {
            System.out.println("Se alcanzo el maximo de cuentas");
        }
    }
	
}