package ejercixio.vectores;

public class MainVec {

	public static void main(String[] args) {
		// 1)declarar un vector A[10] tipo int//
		int A[] = new int[10];
		
		// 2)DECLARAR UN VECTOR C  [5] TIPO CHAR //
		char C[]= new char[5];
		
		// 3)DECLARAR UN VECTOR   [4] TIPO CHAR y asignamos letra A la posicion [0] y [2]//
		char vector[]= new char[4];
		vector[0]='A';
		vector [2]='A';
		
		
		// 3.1)DECLARAR UN VECTOR1   [3] TIPO byte y asignamos numero 0 la posiciones [0] y [1],[2],[3]//
		byte vector1[]= new byte[3];
		//vector1[0]=0; esta es una mala asignacion esta fuera de rango la posicion [3] NO EXISTE//
		vector1[1]=0;
		vector1[2]=0;
		//vector1[3]=0;//
		
		
		// 4)DECLARAR UN VECTOR2   [3] TIPO CHAR y asignamos letra A la posicion [0] y [1] posicion [2] letra b//
		//finalmente imprimir las posiciones [0] y [2]//
		char vector2[]= new char[3];
		vector2[0]='A';
		vector2[1]='A';
		vector2[2]='B';
		System.out.println("imprecion1: " + vector2[0]);//primero se imprime esta[A]//
		vector2[0]='Z';
		System.out.println("imprecion1: " + vector2[0]);//despues esta[Z]//
		System.out.println("imprecion2: " + vector2[2]);
		System.out.println( vector2); // TODAS las posiciones //
		
		
	}

}
