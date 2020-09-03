package vectoresconobjetos;
import java.util.Scanner;
import vectoresconobjetos.Libreta;
public class Controlador {
	public  static  void  main ( String [] args ) {
		Scanner leer = new Scanner (System.in);
		Libreta miLibretita =  new  Libreta ( 3 );
		/*miLibretita . agregarAlibreta ( " Francisco " );
		miLibretita . listarLibreta ();
		miLibretita . agregarAlibreta ( " Fernando " );
		miLibretita . listarLibreta ();		
		miLibretita . agregarAlibreta ( " Macarena " );
		miLibretita . listarLibreta ();
		miLibretita . agregarAlibreta ( " Pedro " );
		miLibretita . listarLibreta (); */
		int opci;
		do {
			System.out.println("**BIENVENIDO AL MENU PRINCIPAL**");
			System.out.println("--------------------------------");
			System.out.println("1-Agregar nombre ");
			System.out.println("2-Mostrar lista");
			System.out.println("3-Eliminar registro por la posicion");
			System.out.println("4-Eliminar registro por nombre");
			System.out.println("5-Espacios libres");
			System.out.println("6-Salir");
			
			opci=leer.nextInt();
		
		if(opci==1) {
			System.out.println("Intruduzca un nombre");
			String nomb=leer.next();
			miLibretita.agregarAlibreta(nomb);
		}
		
		if(opci==2) {
			miLibretita.listarLibreta();
		}
		
		if(opci==3) {
			System.out.println("Ingrese la posicion que desea borrar");
			int posicionAEliminar=leer.nextInt();
			miLibretita.eliminarPosicion(posicionAEliminar);
		}
		
		if(opci==4) {
			System.out.println("Ingrese el nombre que desea eliminar");
			String nombreAEliminar=leer.next();
			miLibretita.eliminarNombre(nombreAEliminar);
		}
		if(opci==5) {
			System.out.println("Los lugares disponibles son: " +miLibretita.posicionesLibres());
			System.out.println("--------------------------------");
			
		};
	}while(opci !=6);
	
	leer.close();		
	}
}