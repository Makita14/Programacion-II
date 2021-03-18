package paquete1;

import java.util.ArrayList;

public class Controlador {
	
	public static void main(String[] args) {
		
		/*String data = "No por mucho madrugar, etc. etc.";
		String nombre = "miRefran.txt";
		GestorArchivos.guardar(nombre, data);*/
		
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
		/*
		
		String paquete = GestorArchivos.cargar("login2.txt");
		
		System.out.println(paquete);
		
		String separador2 = "*";
		
		ArrayList<String> login2 = GestorArchivos.desempaquetador(paquete, separador2);
		
		for(int j=0;j<login2.size();j++) {
			System.out.println("--> " + login2.get(j));
		}
		*/
		
		
		/*
		//Instancio un objeto de la clase VistaLibreta
		//que implementa la interface iVista
				
		iVista miVistaLib = new VistaLibreta();
				
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
				
		int tmp_item = miVistaLib.mostrarMenu(miMenu);		
		System.out.println("-controlador-> "+tmp_item);
				
		miVistaLib.mostrarLibreta(miLibreta);
				
		int tmp_contacto = miVistaLib.eliminarContacto(miLibreta);
		System.out.println("-controlador-> "+tmp_contacto);
				
		String nuevoContacto = miVistaLib.agregarContacto();
		System.out.println("-controlador-> (nuevo contacto) "+nuevoContacto);
		*/				
	}
}