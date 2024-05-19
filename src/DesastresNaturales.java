import java.util.Scanner;

public class DesastresNaturales {
	String tipoDesastre;
	ColaSimpleRescate Rescate = new ColaSimpleRescate();
	
	public DesastresNaturales(String tipoDesastre, ColaSimpleRescate rescate) {
		super();
		this.tipoDesastre = tipoDesastre;
		Rescate = rescate;
	}
	public DesastresNaturales() {
		
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro el tipo de desastre: ");
		tipoDesastre=sc.next();
		System.out.println("intor el nro de Rescate: ");
		int x =sc.nextInt();
		Rescate.llenar(x);
	}
	void mostrar() {
		System.out.println("TIPO DE DESASTRE: "+tipoDesastre);
		Rescate.mostrar();
	}
	
	public String getTipoDesastre() {
		return tipoDesastre;
	}
	public void setTipoDesastre(String tipoDesastre) {
		this.tipoDesastre = tipoDesastre;
	}
	public ColaSimpleRescate getRescate() {
		return Rescate;
	}
	public void setRescate(ColaSimpleRescate rescate) {
		Rescate = rescate;
	}
	
	
	
	
}
