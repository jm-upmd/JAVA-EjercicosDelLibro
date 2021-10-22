package ejercicios_libro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cap2Ej2_7 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner lectorFichero = new Scanner(new File("f:\\Curso Java\\Bitacora\\testdata.txt"));
		System.out.println("Estudiante: " + lectorFichero.nextLine());
		int notaMedia = (Integer.valueOf(lectorFichero.nextLine()) + Integer.valueOf(lectorFichero.nextLine())
				+ Integer.valueOf(lectorFichero.nextLine())) / 3;
		System.out.println("Estudiante: " + notaMedia);

	}

}
