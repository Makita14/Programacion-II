package vectoresconobjetos;

public class Libreta {
	int cantidadRegistros;
	String nombres [];

	 public Libreta ( int  cantidadRegistros ) {
		System.out.println ("Se ha instanciado una Libreta " );
		System.out.println ("-------------------------------");
		this. cantidadRegistros = cantidadRegistros;
		nombres =  new String [cantidadRegistros];
	}

	public  boolean  quedaLugar () {
		System.out.println( " ¿--quedaLugar--? " );	
		boolean respuesta =  false;
		for ( int i = 0 ; i < this . cantidadRegistros; i ++ ) {
			if ( this . nombres [i] ==  null ) {
				respuesta = true;
			}
		}
		System.out.println( " respuesta " + respuesta + "  " );
		return respuesta;
	}
	
	public int posicionesLibres() {
		int libre1 = 0;
		for (int i = 0; i < nombres.length; i++) {
			if(nombres[i] == null|| nombres[i] == "") {
				libre1 ++ ;
			}
		}
		return (libre1);	
	}
	
	public  boolean  agregarAlibreta ( String  nom ) {
		System.out.println( " --agregarAlibreta--> " );
		boolean lugar=  this. quedaLugar ();
		System.out.println("lugar = "+lugar);
		if (lugar) {
			int i = 0 ;
			do {
				i ++ ;
			} while (nombres [i] !=  null );	
			this. nombres [i] = nom;			
		}
		System.out.println( " <- bool lugar -  " );		
		return lugar;
	}
	
	public  void  listarLibreta () {
		for (int i = 1 ; i < nombres.length ; i ++ ) { 
			if (nombres [i]!=null) { 
				System.out.println (i + " ) -> " + nombres [i]);	
			}else { 
				System.out.println (i + " ) -> ");
			}
		}
	}
	
	public void eliminarNombre(String nombreAEliminar) {
		for(int i=0; i<3; i++) {
			if(nombreAEliminar.equals(nombres[i])) {
				nombres[i]="";
			}
		}
	}
	
	public void eliminarPosicion (int posicionAEliminar) {
		for(int i=1; i<nombres.length; i++) {
			for(int p=0; p<nombres.length; p++) {
				if(p==posicionAEliminar) {
					nombres[p]="";
				}		
			}
		}
	}
}