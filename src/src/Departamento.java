package src;
import java.util.*;
public class Departamento {
	private String nombre;
	private String capital;
	private double poblacion;
	private  String codID;
	private String clima;
	private String nivelRiesgo;
	private LD_NormalMetereologia met;
	private LS_NormalPrevencionContaminacion LSprev;
	private ColaCircularDesastreNatural DesastreNatural;

	
	public Departamento() {
		nombre = "";
		capital = "";
		poblacion = 0;
		codID = "";
		clima = "";
		nivelRiesgo = "";
		met = new LD_NormalMetereologia();
		LSprev = new LS_NormalPrevencionContaminacion();
		DesastreNatural = new ColaCircularDesastreNatural();
		
	}

	


	public Departamento(String nombre, String capital, double poblacion, String codID, String clima,
			String nivelRiesgo, LD_NormalMetereologia met, LS_NormalPrevencionContaminacion lSprev, ColaCircularDesastreNatural desastreNatural) {
		super();
		this.nombre = nombre;
		this.capital = capital;
		this.poblacion = poblacion;
		this.codID = codID;
		this.clima = clima;
		this.nivelRiesgo = nivelRiesgo;
		this.met = met;
		LSprev = lSprev;
		DesastreNatural = desastreNatural;
	}




	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Departamento...");
		System.out.println("Nombre departamento?");
		nombre = sc.next();
		System.out.println("Capital?");
		capital = sc.next();
		System.out.println("Cantidad de Poblacion?");
		poblacion = sc.nextDouble();
		System.out.println("Codigo ID?");
		codID = sc.next();
		System.out.println("Clima?");
		clima = sc.next();
		System.out.println("Nivel de Riesgo?");
		nivelRiesgo = sc.next();
		System.out.println("Cantidad de datos Metereologicos?");
		int a = sc.nextInt();
		met.leer2(a);
		System.out.println("Cantidad de datos Prevencion?");
		int b = sc.nextInt();
		LSprev.leer2(b);
		System.out.println("Cantidad de datos Desastre Natural?");
		int d = sc.nextInt();
		DesastreNatural.llenar(d);
		
	}
	public void mostrar() {
		System.out.println("\t*-*-*-*-*-*-* DEPARTAMENTO ("+nombre+") *-*-*-*-*-*-*");
		System.out.println("Nombre: "+nombre);
		System.out.println("Capital: "+capital);
		System.out.println("Cantidad de Poblacion: "+poblacion);
		System.out.println("CodID: "+codID);
		System.out.println("Clima: "+clima);
		System.out.println("Nivel de Riesgo de un Desastre Natural: "+nivelRiesgo);
		System.out.println("---------------------------------------------------------------------------------");
		met.mostrar();
		System.out.println("---------------------------------------------------------------------------------");
		LSprev.mostrar();
		System.out.println("---------------------------------------------------------------------------------");
		DesastreNatural.mostrar();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println();
		
	}


	public String getcapital() {
		return capital;
	}

	public void setcapital(String capital) {
		this.capital = capital;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(double poblacion) {
		this.poblacion = poblacion;
	}


	public String getCodID() {
		return codID;
	}


	public void setCodID(String codID) {
		this.codID = codID;
	}


	public String getClima() {
		return clima;
	}


	public void setClima(String clima) {
		this.clima = clima;
	}


	public String getNivelRiesgo() {
		return nivelRiesgo;
	}


	public void setNivelRiesgo(String nivelRiesgo) {
		this.nivelRiesgo = nivelRiesgo;
	}


	public LD_NormalMetereologia getMet() {
		return met;
	}


	public void setMet(LD_NormalMetereologia met) {
		this.met = met;
	}


	public LS_NormalPrevencionContaminacion getLSprev() {
		return LSprev;
	}




	public void setLSprev(LS_NormalPrevencionContaminacion lSprev) {
		LSprev = lSprev;
	}


	public ColaCircularDesastreNatural getDesastreNatural() {
		return DesastreNatural;
	}


	public void setDesastreNatural(ColaCircularDesastreNatural desastreNatural) {
		DesastreNatural = desastreNatural;
	}
	
	
}
