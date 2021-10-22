package ejercicios_libro;


public class Ej_3_1 {

	public static void main(String[] args) {
		
		// Genera aleatorios entre 1 y 6
		final int max = 6; final int min = 1;
		int dado1,dado2,tiradas=0;

		
		System.out.println("Haciendo tiradas...");
		
		do {
			dado1 = (int) ((Math.random() * max ) + min);
			dado2 = (int) ((Math.random() * max ) + min);
			tiradas++;
		} while( dado1 != 1 || dado2 != 1);
			
		System.out.println("Tiradas hasta sacar doble 1: " + tiradas);	
		

	}

}
