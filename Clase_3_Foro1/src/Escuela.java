
public class Escuela {
	private String nombre;
	private String nivel;
	
	public Escuela(String nombre,String nivel) {
		this.nombre=nombre;
		this.nivel=nivel;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getNivel() {
		return this.nivel;
	}
	public String toString() {
		return "Nombre: "+nombre +" Nivel: "+nivel;
	}
}
