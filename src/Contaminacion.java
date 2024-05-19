import java.util.Scanner;

public class Contaminacion {
	private
	String tipo_Contaminacion;
	public
	Contaminacion() {
		
	}
	public Contaminacion(String tipo_Contaminacion) {
		super();
		this.tipo_Contaminacion = tipo_Contaminacion;
	}
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro el tipo de contaminacion; ");
		tipo_Contaminacion=sc.next();
	}
	public void mostrar() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Contaminacion [tipo_Contaminacion=" + tipo_Contaminacion + "]";
	}
	public String getTipo_Contaminacion() {
		return tipo_Contaminacion;
	}
	public void setTipo_Contaminacion(String tipo_Contaminacion) {
		this.tipo_Contaminacion = tipo_Contaminacion;
	}
	

}
