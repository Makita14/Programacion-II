package Vectores_y_Matrices;

import java.util.ArrayList;
import java.util.Scanner;

public class trabajo2 {
public  static  void  main ( String [] args ) {
	
		//Scanner leer = new Scanner ( System . in);
		
	/*String nombreArch= "[i] user + [i] pass";
		String nombreTrab = "LoginYsua.txt";
		gestorArchivoTrab2.guardar(nombreTrab,nombreArch);*/
		
		
		ArrayList<String> empausua = new ArrayList<>();
		empausua.add("Maca");
		empausua.add("Makarenita");
		empausua.add("Yael");
		empausua.add("Macarena");
		
		ArrayList<String> empapass = new ArrayList<>();
		empapass.add("91218");
		empapass.add("91216");
		empapass.add("91215");
		empapass.add("91214");
		
		String separador = "*";
		
		String paquete = gestorArchivoTrab2.empaquetador(empausua, separador);
		
		System.out.println(paquete);
		
		gestorArchivoTrab2.guardar("loginusua.txt", paquete);
		
		
		String separa="*";
		
		String paquetepass = gestorArchivoTrab2.empaquetador(empapass, separa);
		
		System.out.println(paquetepass);
		
		gestorArchivoTrab2.guardar("loginpass.txt", paquetepass);
		
		/*
		
		String paquete = gestorArchivoTrab2.cargar("loginusua.txt");
		
		System.out.println(paquete);
		
		String separador2 = "*";
		
		ArrayList<String> loginusua = gestorArchivoTrab2.desempaquetador(paquete, separador2);
		
		for(int j=0;j<loginusua.size();j++) {
			System.out.println("--> " + loginusua.get(j));
		}
		
		
		/*String [] user = new String [ 4 ];
				user [ 0 ] =  " Daiana " ;
				user [ 1 ] =  " Facundo" ;
				user [ 2 ] =  " Osvaldo " ;
				user [ 3 ] =  " Melina " ;
				
		        int [] pass =  new int [ 4 ];
		        pass [ 0 ] =  1234 ;
		        pass [ 1 ] =  4321 ;
		   		pass [ 2 ] =  1122 ;
		        pass [ 3 ] =  3344 ;
		
		        
		        
      /*  System.out.println  ( " Ingrese su nombre de usuario: " );		
        String usuario = leer .next();		
        System.out.println ( " Ingrese su contraseña: " );		
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
        	System.out.println( " Usuario y/o contraseña incorrecta " );
        }
        System.out.println ( " Debe actualizar su contraseña " );
        System.out.println( " Ingrese una nueva contraseña: " );		
	        int con = leer . nextInt ();
	        System.out.println( " Su contraseña ha sido cambiada con exito " );
	        System.out.println( " Su nueva contraseña es: "  + con);
	        System.out.println ( "    Bienvenido/a, usted se ha registrado correctamente " );
		*/}
}