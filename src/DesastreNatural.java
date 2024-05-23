package ProyectoSMA;

import java.util.Scanner;

public class DesastreNatural {
	private String tipoDesastre;
	private LS_CircularRescate csr ;
	
	public DesastreNatural() {
		tipoDesastre = "";
		csr = new LS_CircularRescate();
	}

	public DesastreNatural(String tipoDesastre, LS_CircularRescate csr) {
		super();
		this.tipoDesastre = tipoDesastre;
		this.csr = csr;
	}
	
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el tipo de desastre: ");
		tipoDesastre = sc.next();
		System.out.println("Ingresa la cantidad de rescates: ");
		int n = sc.nextInt();
		csr.llenar1(n);
	}
	
	public void mostrar() {
		System.out.println("\t-* Desastres Naturales -*");
		System.out.println("Tipo de Desastre Natural: "+tipoDesastre);
		System.out.println("\t-- Rescates necesarios para el desastre de ["+tipoDesastre+"] --");
		csr.mostrar();
		System.out.println();
	}

	public String getTipoDesastre() {
		return tipoDesastre;
	}

	public void setTipoDesastre(String tipoDesastre) {
		this.tipoDesastre = tipoDesastre;
	}

	public LS_CircularRescate getCsr() {
		return csr;
	}

	public void setCsr(LS_CircularRescate csr) {
		this.csr = csr;
	}
}
