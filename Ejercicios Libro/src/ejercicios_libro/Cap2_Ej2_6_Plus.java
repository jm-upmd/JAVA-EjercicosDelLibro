/* Lee por teclado el apellidos y nombre separados por una coma
 * y escribe el nombre y número de letras y los apellidos y número de letras.
 */

package ejercicios_libro;

import java.util.Scanner;

public class Cap2_Ej2_6_Plus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tus apellidos y nombre separados por una coma");
		System.out.println("Ejemplo: Domínguez Hernández, José Manuel");
		String linea = sc.nextLine();
		int posComa = linea.indexOf(",");
		String apellidos = linea.substring(0, posComa).trim();
		String nombre = linea.substring(posComa+1).trim();
		
		// Tenemos que contar el número de letras sin incluir los espacios en blanco
		// Ej. "Jose Manuel"  tiene 10 letras
		// Sustituimos los espacios por cadena vacía (los borra) y luego tomamos la longitud
		int letrasApellidos = apellidos.replaceAll(" ", "").length();
		int letrasNombre = nombre.replaceAll(" ", "").length();
			
		System.out.println("Tu nombre es: " + nombre + " (" + letrasNombre + " letras)");
		System.out.println("Tu apellido es: " + apellidos + " (" + letrasApellidos + " letras)");
		System.out.println("Tus iniciales son: " + nombre.substring(0,1) + apellidos.substring(0,1));

	}

}
