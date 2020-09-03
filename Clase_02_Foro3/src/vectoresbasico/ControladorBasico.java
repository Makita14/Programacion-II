package vectoresbasico;

import java.util.Scanner;

public class ControladorBasico {
	public  static  void  main ( String [] args ) {

		Scanner leer=new Scanner(System.in);
		LibretaBasico miLibreta = new LibretaBasico ();
		
		/*miLibreta.agregarAlibreta("Enzo",3);
		miLibreta.listarLibreta();
		miLibreta.agregarAlibreta("Jerónimo",5);
		miLibreta.listarLibreta();
		miLibreta.agregarAlibreta ("Pedro", 12);
		miLibreta.listarLibreta (); */
		
		int opci;
		do {
			System.out.println("MENU PRINCIPAL Y OBLIGATORIO");
			System.out.println("----------------------------");
			System.out.println("1-Agregar nombre y posicion ");
			System.out.println("2-Mostrar lista");
			System.out.println("3-Eliminar registro por la posicion");
			System.out.println("4-Eliminar registro por nombre");
			System.out.println("5-Salir");
			
			opci=leer.nextInt();
			
			if(opci==1) {
				System.out.println("Intruduzca un nombre");
				String nomb=leer.next();
				System.out.println("Ingrece una posicion");
				int pos=leer.nextInt();
				miLibreta.agregarAlibreta(nomb,pos);
			}
			
			if(opci==2) {
				miLibreta.listarLibreta();
			}
			
			if(opci==3) {
				System.out.println("Ingrese la posicion que desea borrar");
				int posicionAEliminar=leer.nextInt();
				miLibreta.eliminarPosicion(posicionAEliminar);
			}
			
			if(opci==4) {
				System.out.println("Ingrese el nombre que desea eliminar");
				String nombreAEliminar=leer.next();
				miLibreta.eliminarNombre(nombreAEliminar);
			};
		}while(opci !=5);
		
		leer.close();	
	}
}