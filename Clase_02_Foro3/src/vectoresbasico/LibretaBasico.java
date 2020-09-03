package vectoresbasico;

public class LibretaBasico {
	
	String nombres [] = new String [10];

		public void agregarAlibreta(String nom,int lugar){
			int cont=1;
			for(int i = 1;i<this.nombres.length;i++) {
				if (nombres [i]!=null) {
					cont ++;
				}
			}
	                String nombre = nom;
	                boolean bandera =  true ;
	                for ( int i =  1 ; i <  this . nombres . length; i ++ ) {
	                    if (nombre .equals (nombres [i])) {
	                        bandera =  false ;
	                        break ;
	                    }else {
	                        bandera =  true;
	                    }
	               }
	                if (bandera ==  true ) {
	                    System .out. println ( "---Datos cargados---" );
	                    this. nombres [lugar] = nom;
	                } else {
	                    System .out . println ( "---Este nombre ya ha sido registrado---" );
	                }
	            }
	     
		public void listarLibreta() {
			for (int i = 0 ; i < nombres.length ; i ++ ) { 
				if (nombres [i]!=null) { 
					System.out.println ((i+1) + " ) -> " + nombres [i]);
				}else { 
					System.out.println ((i+1) + " ) -> ");
				}
			}
		}

		public void eliminarNombre(String nombreAEliminar) {
			for(int i=0; i<10; i++) {
				if(nombreAEliminar.equals(nombres[i])) {
					nombres[i]="";
				}
			}
		}

		public void eliminarPosicion (int posicionAEliminar) {
			for(int i=0; i<nombres.length; i++) {
				for(int p=0; p<nombres.length; p++) {
					if(p==posicionAEliminar) {
						nombres[p]="";
				}		
			}
		}
	}
}
