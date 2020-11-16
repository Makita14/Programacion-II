import java.util.Scanner;

public class septimo {
public  static  void  main ( String [] args ) {
		
		Scanner leer = new Scanner( System  . in);
		
	    String usuarioA = " Enzo " ;
        int contraseñaA = 4321 ;
        	        
        System.out.println  ( " Ingrese un Usuario: " );		
        String usuario = leer . next();		
		
        System.out.println  ( " Ingrese una contraseña: " );		
        int contraseña = leer . nextInt ();
		
		if ((usuario != usuarioA) && (contraseña != contraseñaA)) {
			System.out.println ( " Ud. no es Enzo " );
		} else{
			System.out.println  ( " Bienvenido Enzo " );
		}
	}
}