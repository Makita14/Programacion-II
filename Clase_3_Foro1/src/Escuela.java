
public class Escuela {
	private String nombre;
	private String nivel;
	
	public Escuela(String nombre,String nivel) {
		this.nombre=nombre;
		this.nivel=nivel;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setNivel(String nivel) {
		this.nivel=nivel;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getNivel() {
		return this.nivel;
	}
	
	public boolean equals(Object o){
        Escuela escuela = (Escuela) o;
        return (escuela.nombre == nombre) && (escuela.nivel == nivel);
    }
	
	public String toString() {
		return "Nombre: "+nombre +" Nivel: "+nivel;
	}
}
