package Practico5.Ejercicio1;

public class Persona {
	//atributos o campos o variables de instancia
	private String nombre;
	private int edad;
	private boolean sexo;
	private String ci;
	private int edadMinima;
	
	//encapsulamiento (doy acceso con get y set)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception {
		if (edad < 0) {
			//System.out.println("La edad no puede ser negativa");
			throw new Exception("La edad no puede ser negativa");
		} else {
			this.edad = edad;
		}
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}
	
	
	//contructor
	public Persona(String unNombre, int unaEdad, boolean unSexo, String unaCi) {
		this.nombre = unNombre;
		this.edad = unaEdad;
		this.sexo = unSexo;
		this.ci = unaCi;		
	}
	
	/*
	public static boolean validarCi(String unaCi) {
		//algoritmo de validar CI
		return true;
	}*/
	
	
	public static boolean validarCi(String CI){
        String clave = "8123476"; //6199015 1 -> (6*8) + (1*1) + (9 * 2) 

        if(CI.length() < 7 || CI.length() > 8) {
            return false;
        } else if(CI.length() == 7) {
            CI = "0" + CI;
        }

        String partialCi = CI.substring(0,7);

        int res = 0;
        for (int i = 0; i < partialCi.length(); i++){
            String num1 = String.valueOf(clave.charAt(i));
            String num2 = String.valueOf(partialCi.charAt(i));
            res += (Integer.parseInt(num1) * Integer.parseInt(num2));
        }

        int  digVerificador = res % 10;
        if (digVerificador == Integer.parseInt(String.valueOf(CI.charAt(7)))) {
            return true;
        }

        return false;
    }
	
	public void imprimirPersona() {
		/*********** DATOS DE Nombre Apellido *********************************
		sexo: hombre o mujer
		CI: xxxxxxx-x
		edad: #edad [menor de edad / mayor de edad]
		*****************************************************************************/
		
		System.out.println("************** DATOS DE " + this.nombre + " ****************");
		if (this.sexo == true) {
			System.out.println("Sexo: Femenino");
		} else {
			System.out.println("Sexo: Masculino");
		}
		System.out.println("CI: " + this.ci);
		System.out.print("edad: ");
		if (this.edad < 18) {
			System.out.println(this.edad + " [menor de edad]");
		} else {
			System.out.println(this.edad + " [mayor de edad]");
		}
		System.out.println("**************************************************************");
		
	}
	

}