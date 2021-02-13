import java.util.InputMismatchException;
import java.util.Scanner;
public class vector1 {
	public  static  void  main ( String [] args ) {
		
		Scanner Entrada = new Scanner ( System . in);
		
		
		System.out.println ( " Ingrese los numeros del vector " );
		try {
			int [] numeros = new  int [ 5 ];
		for( int i = 0 ; i < 5 ; i ++ ) {
			System.out.println ( " Digite un numero: " );
			numeros [i] = Entrada . nextInt ();
		}
		
		System.out.println ( " Los numeros guardados en el vector son .. " );
		for ( int i : numeros) {
			System.out.println(i);
		}
		}catch(InputMismatchException m){
			System.out.println("Error!! A ingresado un dato invalido..");
		}
	}
}