package Vectores_y_Matrices;

import java.util.Scanner;

public class trabajo2 {
public  static  void  main ( String [] args ) {
	
		Scanner leer = new Scanner ( System . in);
		String nombreArch= "[i] user + [i] pass";
		String nombreTrab = "Loginusua.txt";
		gestorArchivoTrab2.guardar(nombreTrab,nombreArch);
		
		String [] user = new String [ 4 ];
				user [ 0 ] =  " Daiana " ;
				user [ 1 ] =  " Facundo" ;
				user [ 2 ] =  " Osvaldo " ;
				user [ 3 ] =  " Melina " ;
				
		        int [] pass =  new int [ 4 ];
		        pass [ 0 ] =  1234 ;
		        pass [ 1 ] =  4321 ;
		   		pass [ 2 ] =  1122 ;
		        pass [ 3 ] =  3344 ;
		
        System.out.println  ( " Ingrese su nombre de usuario: " );		
        String usuario = leer .next();		
        System.out.println ( " Ingrese su contraseņa: " );		
        int contrasena = leer . nextInt ();
        
        boolean bandera = false ;
        for ( int i = 0 ; i < 4 ; i ++ ) {
        	if (usuario . equals (user [i]) && (contrasena == pass [i])) {
        		bandera =  true ;
        	}
        }
        if (bandera) {
        	System.out.println ( " Bienvenido/a" );
        } else {
        	System.out.println( " Usuario y/o contraseņa incorrecta " );
        }
        System.out.println ( " Debe actualizar su contraseņa " );
        System.out.println( " Ingrese una nueva contraseņa: " );		
	        int con = leer . nextInt ();
	        System.out.println( " Su contraseņa ha sido cambiada con exito " );
	        System.out.println( " Su nueva contraseņa es: "  + con);
	        System.out.println ( "    Bienvenido/a, usted se ha registrado correctamente " );
		}
}