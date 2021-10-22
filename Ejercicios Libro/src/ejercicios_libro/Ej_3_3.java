package ejercicios_libro;

import java.util.Scanner;

public class Ej_3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String expresion; 
		String[] ops = new String[2];;

		while (true) {
			
			System.out.println("Escribe una expresión: ");
			
			expresion = sc.nextLine();
			
			if (expresion.charAt(0)=='0')
				break;
					
			if (expresion.indexOf("+") != -1) {
				ops = expresion.split("\\+");
				System.out.println("Resultado: " + (Integer.parseInt(ops[0]) + Integer.parseInt(ops[1])));
			} else if (expresion.indexOf("-") != -1) {
				ops = expresion.split("-");
				System.out.println("Resultado: " + (Integer.parseInt(ops[0]) - Integer.parseInt(ops[1])));
			} else if (expresion.indexOf("*") != -1) {
				ops = expresion.split("\\*");
				System.out.println("Resultado: " + (Integer.parseInt(ops[0]) * Integer.parseInt(ops[1])));
			} else if (expresion.indexOf("/") != -1) {
				ops = expresion.split("/");
				System.out.println("Resultado: " + (Integer.parseInt(ops[0]) / Integer.parseInt(ops[1])));
			} else {
				System.out.println("Operador incorrecto");
			}			
		}
		System.out.println("Programa finalizado");

	}

}
