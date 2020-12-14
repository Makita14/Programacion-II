public class Principal {
	public static void main (String[] args) {
		
		boolean M;
		
		Escuela unaEscuela = new Escuela ("Instituto River Plate","Secundaria");
		System.out.println(unaEscuela);
		System.out.println("-------------------------------------------------");
		
		Grado unGrado = new Grado ("Angel Labruna","Secundaria","3ro",31);
		System.out.println(unGrado);
		System.out.println("-------------------------------------------------");
		
		//Casting escuela
		Escuela otraEscuela = (Escuela) unGrado;
		System.out.println (otraEscuela);
		System.out.println("-------------------------------------------------");
		
		//Casting grado
		//Grado otroGrado = (Grado) unaEscuela;
		//System.out.println (otroGrado);
		
		//Equals
        Escuela escuela_1 = new Escuela("Alicia Moreau de Justo", "Secundaria");
        Escuela escuela_2 = new Escuela("Alicia Moreau de Justo", "Secundaria");
        
        M = escuela_1.equals(escuela_2);
        System.out.println(M);
	}
}
