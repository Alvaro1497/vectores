package ejercicios.vario.vectores.matriz;

import java.util.Scanner;

public class MainVector1 {

	public static void main(String[] args) {
		// declare un vector x[3] y construya un programa que pidal usuario ingrese los
		// valores para cada posicion
		// IMPRIMA TODOS LOS VALORES INGRESADOS

		char x[] = new char[3];
		//bucle para q se repita 
		//inicia desde 0 OJO VECTOR
		for (int i = 0; i < 3; i++) {
			System.out.println("ingrese valor de la posicion: " + i);
			Scanner sc = new Scanner(System.in);
			// next().charAt(0); para leer tipo char (0)la posicion del vector 
			char n = sc.next().charAt(0);
			x[i] = n;
		}
		//lo isimos para que imprima los valores de las posciones SOLO HACE FALTA PONER UN SOLO SYSOUT CADENADO +i
		for (int i = 0; i < 3; i++) {
			System.out.println("El valor de la posicion: " + i);
			System.out.println(x[i]);

		}
	}

}
