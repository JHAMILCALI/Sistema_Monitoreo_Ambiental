import java.util.Scanner;

public class Prevencion {
	private
	PilaContaminacion Contaminacion = new PilaContaminacion();
	public Prevencion() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Prevencion(PilaContaminacion contaminacion) {
		super();
		Contaminacion = contaminacion;
	}
	public void leer() {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Intro la cantidad de Prevencion");
		int x = sc.nextInt();
		System.out.println();
		Contaminacion.llenar(x);
	}
	public void mostrar() {
		Contaminacion.mostrar();
	}
	
	public PilaContaminacion getContaminacion() {
		return Contaminacion;
	}
	public void setContaminacion(PilaContaminacion contaminacion) {
		Contaminacion = contaminacion;
	}
	
	

}
