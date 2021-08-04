package ejercicios.vario.vectores.matriz;

import java.util.Scanner;

public class Mainvector2 {

	public static void main(String[] args) {
		// declare un vector x culla longitud se solicite al usuario de tipo int y
		// construlla un programa q ingrese valores a cada poscion
		int N = 0;
		int x[] = new int[N];
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese que longitud quiera");
		N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.println("ingrese valor de la posicion: " + i);
			N = sc.nextInt();

		}
	
	}

}
