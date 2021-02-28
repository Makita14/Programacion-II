
public abstract class Ave {
	
	private String nombre;
	private String caract;
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre(String nombre) {
		return this.nombre;
	}
	
	public void setCaract (String caract) {
		this.caract = caract;
	}
	
	public String getCaract(String caract) {
		return this.caract;
	}
	
	public abstract String andar();
	
	public void mostrar() {
		System.out.println("Soy "+this.nombre+", "+this.caract+" y "+andar());
		System.out.println("----------------------------------------------------------------");
	}

}