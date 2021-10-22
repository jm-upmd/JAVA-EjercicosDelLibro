package ejercicios_libro;

import java.util.Scanner;

public class Cap2_Ej2_5 {

	public static void main(String[] args) {
		// gross es una medida anglosajona que equivale a doce docenas (144 unidades).
		int total, gross, docenas, unidades;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.print("Dime cuantos huevos tienes: ");
		
		total = 0; 
		
		if(lector.hasNextInt())
			total = lector.nextInt();
		else {
			System.out.println("No es una entrada correcta");
			System.out.println("Programa finalizado");
			System.exit(0);
		}
		
		gross = total / 144;
		int temp = total % 144;  //resto de dividir total entre 144
		docenas = temp / 12;         
		unidades = temp % 12;
		
		System.out.println("\nTu número de huevos es " + gross + " gross, " + docenas + " docenas, " + unidades + " huevos" );
		System.out.println("\nNota: 1 gross son doce docenas (144 unidades)");

	}

}
