package vectoresbasico;

public class LibretaBasico {
	
	String nombres [] = new String [11];

		public void agregarAlibreta(String nom,int lugar){
			int cont=1;
			
			for(int i = 1;i<this.nombres.length;i++) {
				if (nombres [i]!=null) {
					cont ++;
				}
			}
			 if (cont >  this . nombres . length) {
		            System.out.println( " ¡¡¡¡¡¡¡¡No se pueden cargar mas datos !!!!!!!!!! " );
		            System.out.println( " Libreta completa " );
		        } else {
		            if (lugar >  this . nombres . length) {
		            	System.out.println( " ¡¡¡¡¡¡¡¡¡¡la posición "  + lugar +  " no existe !!!!!!!!!!! " );
		            } else if ( !nom . equals( " " )) {
		            
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
	                	System.out.println("-----Este nombre ya ha sido registrado--- ");
	                }
		         }
		    }
		}
	                
	                     			
		public void listarLibreta() {
			for (int i = 1 ; i < nombres.length ; i ++ ) { 
				if (nombres [i]!=null) { 
					System.out.println (i + " ) -> " + nombres [i]);
				}else { 
					System.out.println (i + " ) -> ");
				}
			}
		}

		public void eliminarNombre(String nombreAEliminar) {
			for(int i=0; i<10; i++) {
				if(nombreAEliminar.equals(nombres[i])) {
					nombres[i]="";
					System.out.println("Nombre " +nombreAEliminar+" eliminado correctamente");
				}
			}
		}

		public void eliminarPosicion (int lugar) {
			boolean bande=true;
			for(int i=1; i<nombres.length; i++) {
				if(i==lugar) {
					this.nombres[i]= null;
					bande=true;
					break;
				}else {
					bande=false;
				}
		}
			if(bande==true) {
				System.out.println("Posicion "+lugar+ " eliminada correctamnte");
			}
	}

}