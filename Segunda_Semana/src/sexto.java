import java.util.Scanner;

public class sexto {
public  static  void  main ( String [] args ) {
	Scanner reander = new Scanner ( System  . in );
	System.out.println ( " Ingrese un numero ");
    int a = reander . nextInt ();
    System.out.println ( " Ingrese otro numero " );
    int b = reander . nextInt ();
    System.out.println ( " Ingrese nuevamente un numero " );
    int d = reander . nextInt ();
    int resta;
    resta = a - b;
    if (a > b) {
          d = a - b;
         if (d <= resta) {
        	 System.out.println  ( " Numero permitido " );
            
        } else{
        	d = b - a;
        	if (d <= resta) {
	        	   System.out.println ( " Numero permitido " );
            }   
        }
    }
}
}