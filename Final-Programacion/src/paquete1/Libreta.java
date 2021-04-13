package paquete1;

import java.util.ArrayList;
import java.util.Scanner;

public class Libreta {
	
	ArrayList<Contacto> contacto = new ArrayList<>();
	
	public String nombre;
	
	public Libreta(String nombre) {
		this.nombre = nombre;
	}
	
	public static void agregarContacto(ArrayList<Contacto> contacto) {
		System.out.println("Ingrese un nuevo contacto: ");
	}
	
	public static void eliminarContacto(ArrayList<Contacto> contacto) {
		System.out.println("Ingrese contacto a eliminar: ");
	}
	
	public String listarLibreta() {
		System.out.println("------ Libreta ------");
		return nombre;
		
	}
}

	
	
	
	
	
	
	
	/*public int mostrarMenu(ArrayList<Contacto> menu) {
		System.out.println("------ Menú ------");
		
		for(int i=0;i<menu.size();i++) {
			System.out.println(i+" - "+menu.get(i));
		}
		Scanner Leer=new Scanner(System.in);
		System.out.println("Seleccione una opción:");
		int opci = Leer.nextInt();
		return opci;
	}
	

	public static void mostrarLibreta (ArrayList<Contacto> Libreta ){
		System.out.println("------ Libreta ------");
		for(int i=0; i<Libreta.size(); i++) {
			System.out.println(Libreta.get(i));
		}
	}
	
	public static ArrayList<Contacto> eliminarContacto (ArrayList<Contacto> cont) {
		System.out.println("------ Eliminar Contacto ------");
		for(int i=0; i<cont.size(); i++) {
			System.out.println(cont.get(i));
		}
		Scanner leer=new Scanner(System.in);
		int tmp_op = leer.nextInt();
		cont.remove(tmp_op);
		return cont;
	}

	public static ArrayList<Contacto> agregarContacto(ArrayList<Contacto> miLibreta) {
		// TODO Auto-generated method stub
		System.out.println("------ Agregar Contacto ------");
		for(int i=0; i<miLibreta.size(); i++) {
			System.out.println(miLibreta.get(i));
		}
		Scanner LeerString=new Scanner(System.in);
		String tmp_nuevoContacto = LeerString.next();
		miLibreta.add(tmp_nuevoContacto);
		return miLibreta;
	}*/