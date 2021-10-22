package ejercicios_libro;

import java.util.Scanner;

public class Cap2Ej2_6 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce tu nombre y apellido separado por un espacio;");
		String nombre = lector.next();
		String apellido = lector.next();
		System.out.println("Tu nombre es " + nombre + ", y tiene " + nombre.length() + " caractres.");
		System.out.println("Tu apellido es " + apellido + ", y tiene " + apellido.length() + " caractres.");
		System.out.println("Tus iniciales son: " + nombre.substring(0,1) + apellido.substring(0,1));
		lector.close();

	}

}
