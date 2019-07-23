package Banco;

public class Persona {

	private String nombre;
	private int edad;
	private Cuenta cuenta;
	
	
	
	public String getNombre() {
	 	return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}



	public void saludar(){
		String nombre;
		nombre = "Lorena";
		System.out.println(this.nombre + " " + this.edad);
	}
	
}
