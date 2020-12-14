public class Grado extends Escuela {
	private String nom;
	private int cantAlum;
	
	public Grado(String nombre, String nivel, String nom, int cantAlum) {
		super (nombre, nivel);
		this.nom=nom;
		this.cantAlum=cantAlum;
	}
	public String getNom() {
		return this.nom;
	}
	public int getCantalumn() {
		return this.cantAlum;
	}
	public String toString() {
		return super.getNombre()+" -- "+super.getNivel()+" -- "+this.nom+" -- "+this.cantAlum;
	}
}
