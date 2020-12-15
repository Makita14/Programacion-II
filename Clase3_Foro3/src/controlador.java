import java.util.Scanner;

public class controlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libreta unaLibreta = new Libreta();
		
		/*unaLibreta.agregarContacto("Enzo");
		unaLibreta.agregarContacto("Gonzalo");
		unaLibreta.agregarContacto("Milton");
		unaLibreta.agregarContacto("Leonardo");
		unaLibreta.agregarContacto("Robert");
		*/
		int opci;
		do {
			System.out.println("**BIENVENIDO AL MENU PRINCIPAL**");
			System.out.println("--------------------------------");
			System.out.println("1-Agregar nombre ");
			System.out.println("2-Mostrar lista");
			System.out.println("3-Eliminar registro por la posicion");
			System.out.println("4-Eliminar registro por nombre");
			System.out.println("5-Salir");
			
			Scanner leer = new Scanner (System.in);
			opci=leer.nextInt();
		
		if(opci==1) {
			System.out.println("Intruduzca un nombre");
			String nom=leer.next();
			unaLibreta.agregarContacto(nom);
		}
		
		if(opci==2) {
			unaLibreta.listarLibreta();
		}
		
		if(opci==3) {
			System.out.println("Ingrese la posicion que desea borrar");
			int eliminarPorIndice=leer.nextInt();
			unaLibreta.borrarPorIndice(eliminarPorIndice);
		}
		
		if(opci==4) {
			System.out.println("Ingrese el nombre que desea eliminar");
			String eliminarPorNombre=leer.next();
			unaLibreta.borrarPorNombre(eliminarPorNombre);
		};
		
	}while(opci !=5);
		
	}
}