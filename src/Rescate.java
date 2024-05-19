import java.util.Scanner;

public class Rescate {
	String tipoRescate;
	public Rescate() {
		// TODO Esbozo de constructor generado automáticamente
	}
	
	public Rescate(String tipoRescate) {
		this.tipoRescate = tipoRescate;
	}

	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir tipoRescate: ");
		tipoRescate = sc.next();
	}
		
	@Override
	public String toString() {
		return "Rescate [tipoRescate=" + tipoRescate + "]";
	}

	public void mostrar() {
		System.out.println(toString());
	}

	public String getTipoRescate() {
		return tipoRescate;
	}

	public void setTipoRescate(String tipoRescate) {
		this.tipoRescate = tipoRescate;
	}
}
