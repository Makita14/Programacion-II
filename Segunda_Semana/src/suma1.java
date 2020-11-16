import  java.util.Scanner;

public class suma1 {

	public  static  void  main ( String [] args ) {
		
		int suma;
		Scanner reander = new Scanner ( System.in );
		System.out.println ( " Proyecto suma " );
		System.out.println  ( " Ingrese el primer valor: " );
		int a = reander.nextInt ();
		System.out.println ( " Ingrese el segundo valor: " );
		int b = reander.nextInt ();
		
		suma = a + b;
		
		System.out.println ( " La suma es: " + suma);
	}
}