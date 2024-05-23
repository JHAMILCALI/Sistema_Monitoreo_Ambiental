package src;

import java.util.Scanner;

public class Temperatura {
	private double grado;
	public Temperatura() {
		grado = 0;
	}
	public Temperatura(double grado) {
		super();
		this.grado = grado;
	}
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa la temperatura en grados: ");
		grado = sc.nextDouble();
	}
	public void mostrar() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Temperatura [" + grado + " grados]";
	}
	public double getGrado() {
		return grado;
	}
	public void setGrado(Double grado) {
		this.grado = grado;
	}
}
