package ProyectoSMA;

import java.util.Scanner;

public class Monitoreador {
	private String nombreM;
	private String idDep;
	
	public Monitoreador() {
		nombreM = "";
		idDep = "";
	}

	public Monitoreador(String nombreM, String idDep) {
		super();
		this.nombreM = nombreM;
		this.idDep = idDep;
	}
	
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Monitoreador...");
		System.out.println("Nombre?");
		nombreM = sc.next();
		System.out.println("ID del Departamento?");
		idDep = sc.next();
	}
	
	public void mostrar() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Monitoreador [nombreM=" + nombreM + ", idDep=" + idDep + "]";
	}

	public String getNombreM() {
		return nombreM;
	}

	public void setNombreM(String nombreM) {
		this.nombreM = nombreM;
	}

	public String getIdDep() {
		return idDep;
	}

	public void setIdDep(String idDep) {
		this.idDep = idDep;
	}
	
	
	
}
