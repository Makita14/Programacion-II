package paquete1;

import java.util.ArrayList;
import java.util.Scanner;

public class VistaLibreta implements iVista {
	
	Scanner Leer=new Scanner(System.in);
	Scanner LeerString=new Scanner(System.in);
	
		public int mostrarMenu(ArrayList<String> menu) {
			System.out.println("---------- Menú ------------");
			
			for(int i=0;i<menu.size();i++) {
				System.out.println(i+" - "+menu.get(i));
			}
			System.out.println("Seleccione una opción:");
			int tmp_op = Leer.nextInt();
			return tmp_op;
		}
	
		
		public void mostrarLibreta(ArrayList<String> libreta) {
			
			System.out.println("---------- Libreta ------------");
			for(int i=0; i<libreta.size(); i++) {
				System.out.println(libreta.get(i));
			}	
		}
	
	
		public int eliminarContacto(ArrayList<String> cont) {
			
			System.out.println("---------- Eliminar Contacto ------------");
			for(int i=0; i<cont.size(); i++) {
				System.out.println(cont.get(i));
			}
			int tmp_op = Leer.nextInt();
			return tmp_op;
		}
	
		
		public String agregarContacto() {
			// TODO Auto-generated method stub
			System.out.println("---------- Agregar Contacto------------");
			System.out.println();
			String tmp_nuevoContacto = LeerString.nextLine();
			return tmp_nuevoContacto;
		}

}
