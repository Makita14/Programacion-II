import java.util.Scanner;

public class controlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libreta unaLibreta = new Libreta();
		Scanner leer = new Scanner (System.in);
		int opci;
		do {
			System.out.println("**BIENVENIDO AL MENU PRINCIPAL**");
			System.out.println("--------------------------------");
			System.out.println("1-Agregar nombre ");
			System.out.println("2-Mostrar lista");
			System.out.println("3-Eliminar registro por la posicion");
			System.out.println("4-Eliminar registro por nombre");
			System.out.println("5-Salir");
				
			opci=leer.nextInt();
		
		if(opci==1) {
			System.out.println("Intruduzca un nombre");
			String nom=leer.next();
			if(!nom.equals(""))
			unaLibreta.agregarContacto(nom);
		}
		
		if(opci==2) {
			unaLibreta.listarLibreta();
		}
		
		if(opci==3) {
			System.out.println("Ingrese la posicion que desea borrar");
			int eliminarPosition=leer.nextInt();
			unaLibreta.borrarPorIndice(eliminarPosition);
		}
		
		if(opci==4) {
			System.out.println("Ingrese el nombre que desea eliminar");
			String eliminarPorNombre=leer.next();
			unaLibreta.borrarPorNombre(eliminarPorNombre);
		};
		
	}while(opci !=5);
		
	}
}