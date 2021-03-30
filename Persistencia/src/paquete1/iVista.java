package paquete1;

import java.util.ArrayList;

public interface iVista {
	
String Separador = "#";
	
	int mostrarMenu(ArrayList<String> menu);
	
	void mostrarLibreta(ArrayList<String> libreta);
	
	ArrayList<String> eliminarContacto(ArrayList<String> cont);
	
	ArrayList<String> agregarContacto(ArrayList<String> miLibreta);

}
