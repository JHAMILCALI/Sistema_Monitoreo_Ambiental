package src;

import java.util.Scanner;

public class Contaminacion {
	private String tipoContaminacion;
	
	public Contaminacion() {
		tipoContaminacion = "";
	}

	public Contaminacion(String tipoContaminacion) {
		super();
		this.tipoContaminacion = tipoContaminacion;
	}
	
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el tipo de contaminacion: ");
		tipoContaminacion = sc.next();
	}
	public void mostrar() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Contaminacion [tipoContaminacion=" + tipoContaminacion + "]";
	}

	public String getTipoContaminacion() {
		return tipoContaminacion;
	}

	public void setTipoContaminacion(String tipoContaminacion) {
		this.tipoContaminacion = tipoContaminacion;
	}
}
