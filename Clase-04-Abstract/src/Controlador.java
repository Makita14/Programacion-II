
public class Controlador {
	
	public static void main (String[] args) {
		
		Ave miGallinita = new Gallina();
		miGallinita.setNombre("EnzoPe, una linda gallinita");
		miGallinita.setCaract("Me cruza una banda roja por el alma");
		miGallinita.mostrar();
		
		Pato unPatito = new Pato();
		unPatito.setNombre("Cuak");
		unPatito.setCaract("un pato muy listo");
		unPatito.mostrar();
		
		Avestruz miAvestruz = new Avestruz();
		miAvestruz.setNombre("Pepe");
		miAvestruz.setCaract("un gran avestruz");
		miAvestruz.mostrar();
	}

}
