import java.util.Scanner;

public class quinto {
public  static  void  main ( String [] args ) {
	
	Scanner leer = new Scanner ( System . in );
       System.out.println ( " Ingrese un numero " );
       int num1 = leer . nextInt ();
       System.out.println ( " Ingrese otro numero " );
       int num2 = leer . nextInt ();
       System.out.println( " Ingrese el número de los múltiples que desee que no aparezcan: " );
       int mul = leer . nextInt ();
       if (num1 > num2) {
           for( int i = num2; i <= num1; i ++ ) {
        	   if (i % mul !=  0 ) {
        		   System.out.println (i);
           }
        } 
        } else {
        	for ( int i = num1; i <= num2; i ++ ) {
        		if (i % mul !=  0 ) {
        			System.out.println(i);
        		}   
        	}
        }
	}
}
    
