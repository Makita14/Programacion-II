
public class Principal {
	public static void main (String[] args) {
		Escuela unaEscuela = new Escuela ("Instituto River Plate","Secundaria");
		System.out.println(unaEscuela);
		System.out.println("-------------------------------------------------");
		
		Grado unGrado = new Grado ("Angel Labruna","Secundaria","3ro",31);
		System.out.println(unGrado);
		System.out.println("-------------------------------------------------");
		
		Escuela otraEscuela = (Escuela) unGrado;
		System.out.println (otraEscuela);
		System.out.println("-------------------------------------------------");
		
		Grado otroGrado = (Grado) unaEscuela;
		System.out.println (otroGrado);
	}
}
