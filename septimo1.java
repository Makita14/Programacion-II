import java.util.Scanner;

public class septimo1 {

	public static void main(String[] args) {
		
		Scanner reader =  new Scanner ( System . in);
		
	    String usuarioA ="Enzo";
        int contrase�aA =4321 ;
        	        
        System.out.println ( " Ingrese un Usuario: " );		
        String usuario = reader . next();		
		
        System.out.println ( " Ingrese una contrase�a: " );		
        int contrase�a = reader . nextInt ();
		
		if((usuario != usuarioA)&&(contrase�a != contrase�aA)){
			System.out.println("Ud. no es Enzo");
		}else{
			System.out.println("Bienvenido Enzo");
		}

	}
}