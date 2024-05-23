package ProyectoSMA;

import java.util.Scanner;

public class Gobierno {
	private String nombreAlcalde;
	private String nombreDepart;
	private double presupuesto;
	
	public Gobierno() {
		nombreAlcalde = "";
		nombreDepart = "";
		presupuesto = 0;
	}

	public Gobierno(String nombreAlcalde, String nombreDepart, double presupuesto) {
		super();
		this.nombreAlcalde = nombreAlcalde;
		this.nombreDepart = nombreDepart;
		this.presupuesto = presupuesto;
	}
	
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gobierno...");
		System.out.println("Nombre del Alcalde?");
		nombreAlcalde = sc.next();
		System.out.println("Nombre del departamento?");
		nombreDepart = sc.next();
		System.out.println("Presupuesto?");
		presupuesto = sc.nextDouble();
	}
	public void mostrar() {
		System.out.println(toString());
	}
	

	@Override
	public String toString() {
		return "Gobierno [nombreAlcalde=" + nombreAlcalde + ", nombreDepart=" + nombreDepart + ", presupuesto="
				+ presupuesto + "]";
	}

	public String getNombreAlcalde() {
		return nombreAlcalde;
	}

	public void setNombreAlcalde(String nombreAlcalde) {
		this.nombreAlcalde = nombreAlcalde;
	}

	public String getNombreDepart() {
		return nombreDepart;
	}

	public void setNombreDepart(String nombreDepart) {
		this.nombreDepart = nombreDepart;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
}
