import java.util.Scanner;

public class Pais {
	String nombrePais;
	ColaCircularDepartamento Departamentos = new ColaCircularDepartamento();
	public Pais() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Pais(String nombrePais, ColaCircularDepartamento departamentos) {
		super();
		this.nombrePais = nombrePais;
		Departamentos = departamentos;
	}
	public String getNombrePais() {
		return nombrePais;
	}
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	public ColaCircularDepartamento getDepartamentos() {
		return Departamentos;
	}
	public void setDepartamentos(ColaCircularDepartamento departamentos) {
		Departamentos = departamentos;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro el nombre del PAIS: ");
		nombrePais=sc.next();
		System.out.println("intro la cantidad de DEPARTAMNTOS del pais:  ");
		int x = sc.nextInt();
		Departamentos.llenar(x);
	}
	void mostrar() {
		System.out.println("NOMBRE DEL PAIS: "+nombrePais);
		Departamentos.mostrar();
	}
}
