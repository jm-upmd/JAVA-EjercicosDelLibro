package ejercicios_libro;


public class Ej_3_2 {

	public static void main(String[] args) {
		
		int numeroConMasDivisores = 1;
		int mayorNumDeDivisores = 1;
		int divisores;
		
		for (int i = 2; i <= 10_000; i++) {
			divisores = 0;
			for (int j = 1; j <= i; j++) {
				if(i%j == 0) {
					divisores++;
				}
			}
			if(divisores > mayorNumDeDivisores) {
				mayorNumDeDivisores = divisores;
				numeroConMasDivisores = i;
			}
			
		}
		System.out.println("Número con más divisores entre 1 y 10000: " + numeroConMasDivisores);
		System.out.println("Número de divisores: " + mayorNumDeDivisores);

	}

}
