package Vectores_y_Matrices;

import java.util.Scanner;

public class trabajo1 {
public  static  void  main ( String [] args ) {
		
		Scanner entrada = new Scanner ( System . in);
		
		String frase [] = new  String [ 4 ];
		
		System.out.println( " Ingrese las oraciones que desea guardar " );
		
		for ( int i = 0 ; i < 4 ; i ++ ) {
			System.out.println ( " Ingrese una oracion: " );
			frase [i] = entrada .next ();
		}
		
		System.out.println ( " Las frases ingresadas son: " );
		System.out.println ( " Frase guardada en el índice 0: " + frase [ 0 ]);
		System.out.println ( " Frase guardada en el índice 1: " + frase [ 1 ]);
		System.out.println ( " Frase guardada en el índice 2: " + frase [ 2 ]);		
		System.out.println ( " Frase guardada en el índice 3: " + frase [ 3 ]);
		}
}