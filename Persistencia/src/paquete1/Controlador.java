package paquete1;

import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
	
	public static void main(String[] args) {
		
		/*String data = "No por mucho madrugar, etc. etc.";
		String nombre = "miRefran.txt";
		GestorArchivos.guardar(nombre, data);
		
		ArrayList<String> empa = new ArrayList<>();
		empa.add("Maca");
		//empa.add("Argentina");
		ArrayList<String> empa2 = new ArrayList<>();
		empa2.add("91218");
		//empa.add("no");
		
		String separador = "*";
		
		String paquete = GestorArchivos.empaquetador(empa, separador);
		
		System.out.println(paquete);
		
		GestorArchivos.guardar("login2.txt", paquete);
		
		
		String paquete = GestorArchivos.cargar("login2.txt");
		
		System.out.println(paquete);
		
		String separador2 = "*";
		
		ArrayList<String> login2 = GestorArchivos.desempaquetador(paquete, separador2);
		
		for(int j=0;j<login2.size();j++) {
			System.out.println("--> " + login2.get(j));
		}
		
		*/
		
		Scanner leer = new Scanner (System.in);
		
		//Instancio un objeto de la clase VistaLibreta
		//que implementa la interface iVista
				
		iVista miVistaLib = new VistaLibreta();
		int tmp_item;
		do {		
		//Instancio un menú
		ArrayList<String> miMenu = new ArrayList<>();
		miMenu.add("Listar Libreta");
		miMenu.add("Agregar Contacto");
		miMenu.add("Eliminar Contacto");
				
		//Instancio una lista de contactos
		ArrayList<String> miLibreta = new ArrayList<>();
		miLibreta.add("Enzo");
		miLibreta.add("Melina");
		miLibreta.add("Analía");
				
		tmp_item = miVistaLib.mostrarMenu(miMenu);		
		System.out.println("-controlador-> "+tmp_item);
		//
		//Muestra la lista
		//
		if(tmp_item==0) {			
		miVistaLib.mostrarLibreta(miLibreta);
		}		
		//
		//Agrega un nuevo contacto
		//
		else if(tmp_item==1) {		
			String tmp_nuevoContacto = miVistaLib.agregarContacto(miLibreta);
			System.out.println("-Nuevo contacto-> "+tmp_nuevoContacto);	
			miVistaLib.agregarContacto(miLibreta);
		}
		
		//
		//Elmina el contacto segun su posicion empezando de 0
		//
		else if(tmp_item==2) {
			int tmp_contacto = miVistaLib.eliminarContacto(miLibreta);
			System.out.println("-Contacto a eliminar-> "+tmp_contacto);
			miVistaLib.eliminarContacto(miLibreta);
		};
		
	}while(tmp_item != 3);
}
}