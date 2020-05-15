public class Ciudadano extends Persona{
	private String provincia;
	private long dni;
	
	public Ciudadano(String apellido, String nombre, String provincia, long dni){
		super(apellido,nombre);
		this.provincia=provincia;
		this.dni=dni;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getProvincia() {
		return provincia;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}
	public long getDni() {
		return dni;
	}
}