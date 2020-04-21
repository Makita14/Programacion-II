import java.util.Scanner;

public class octavo {

	public static void main(String[] args) {
		
		Scanner reader =  new Scanner ( System . in);
	    String usuarioA ="Enzo";
        int contraseñaA =4321 ;
        	        
        System.out.print ( " Ingrese un Usuario: " );		
        String usuario = reader . next();		
        System.out.print ( " Ingrese una contraseña: " );		
        int contraseña = reader . nextInt ();
		
		if((usuario != usuarioA)&&(contraseña != contraseñaA)){
			System.out.println("Ud. no es Enzo");
		}else{
			System.out.println("Bienvenido Enzo");
			
			System.out.println ( "Desea actualizar su contraseña?" );
			System.out.println(" 1- Nueva contraseña");
			System.out.println(" 2- Salir");
			String opcion=reader.next();
			
			if (opcion==("1-Nueva contraseña"));{
				System.out.println ( "Ingrese una contraseña: " );		
		        int con = reader . nextInt ();
		        System.out.println ( " Su contraseña ha sido cambiada ");
		        System.out.println ( " Su nueva contraseña es: "+con);
			}
			
			if(opcion==("2-Salir")){
				System.out.println ( "  Bienvenido, usted se ha registrado correctamente " );	
			}
		}			
	}
}