package src;

import java.util.Scanner;

public class Rescate {
private String tipoRescate;
	
	public Rescate() {
		tipoRescate = "";
	}

	public Rescate(String tipoRescate) {
		super();
		this.tipoRescate = tipoRescate;
	}
	
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el tipo de rescate: ");
		tipoRescate = sc.next();
	}
	
	public void mostrar() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Rescate [tipoRescate=" + tipoRescate + "]";
	}

	public String getTipoRescate() {
		return tipoRescate;
	}

	public void setTipoRescate(String tipoRescate) {
		this.tipoRescate = tipoRescate;
	}
}
