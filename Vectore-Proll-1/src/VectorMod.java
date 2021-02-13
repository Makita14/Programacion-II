import java.util.Scanner;
public class VectorMod {
	public  static  void  main ( String [] args ) {
		
		Scanner entrada=new Scanner ( System . in);
		int numeros [] = new  int [ 5 ];
		int i;
		System.out.println ( " Los numeros seran guardados en un Vector " );
		for(i = 0 ; i < 5 ; i ++ ) {
			System.out.println ( " Ingrese un numero " );
			numeros [i] = entrada . nextInt ();
		}
		for( int  A = 0 ; A <4; A ++ ) {
			for(i = 0 ; i < 4 - A ; i ++ ) {
				if (numeros [i] > numeros [i + 1 ]) {
					int aux;
					aux = numeros [i];
					numeros [i] = numeros [i + 1 ];
					numeros [i + 1 ] = aux;
				}		
			}
		}
		for (i = 0 ; i < numeros . length; i ++ )
			if (numeros [i] % 7 != 0 )
		System.out.println( " Los numeros guardados en el vector son "  + i +  " valor "  + numeros [i]);
		}
	}	