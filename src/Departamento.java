import java.util.Scanner;

public class Departamento {
	private
	String nombre, codID, nivelDeRiesgo,clima;
	ColaSimpleMeteorologia meteorologia = new ColaSimpleMeteorologia();
	PilaPrevencion Prevencion = new PilaPrevencion();
	PilaDesastresNaturales DesastresNaturales = new PilaDesastresNaturales();
	int poblacion;
	
	public Departamento() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Departamento(String nombre, String codID, String nivelDeRiesgo, String clima,
			ColaSimpleMeteorologia meteorologia, PilaPrevencion prevencion, PilaDesastresNaturales desastresNaturales,
			int poblacion) {
		super();
		this.nombre = nombre;
		this.codID = codID;
		this.nivelDeRiesgo = nivelDeRiesgo;
		this.clima = clima;
		this.meteorologia = meteorologia;
		Prevencion = prevencion;
		DesastresNaturales = desastresNaturales;
		this.poblacion = poblacion;
	}



	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nombre del departamento: ");
		nombre=sc.next();
		System.out.println("Intor codID :");
		codID=sc.next();
		System.out.println("Intro Poblacion: ");
		poblacion=sc.nextInt();
		System.out.println("Intro Clima: ");
		clima=sc.next();
		System.out.println("Intro la cantidad de Meteorologia: ");
		int a =sc.nextInt();
		meteorologia.llenar(a);
		System.out.println("intor la cantidad de Prevenciones: ");
		int b = sc.nextInt();
		Prevencion.llenar(b);
		System.out.println("Intro la cantidad de Desatres Natuurales: ");
		int c =sc.nextInt();
		DesastresNaturales.llenar(c);
		System.out.println("Nivel de Riesgo [bajo] [medio] [alto]");
		nivelDeRiesgo = sc.next();
		
	}
	void mostrar() {
		System.out.println("NOMBRE: "+nombre);
		System.out.println("COD-ID: "+codID);
		System.out.println("POBLACIO: "+poblacion);
		System.out.println("CLIMA: "+clima);
		meteorologia.mostrar();
		Prevencion.mostrar();
		DesastresNaturales.mostrar();
		System.out.println("Nivel de Riesgo :"+nivelDeRiesgo);
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodID() {
		return codID;
	}
	public void setCodID(String codID) {
		this.codID = codID;
	}
	public String getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}
	public void setNivelDeRiesgo(String nivelDeRiesgo) {
		this.nivelDeRiesgo = nivelDeRiesgo;
	}
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	public ColaSimpleMeteorologia getMeteorologia() {
		return meteorologia;
	}
	public void setMeteorologia(ColaSimpleMeteorologia meteorologia) {
		this.meteorologia = meteorologia;
	}
	public PilaPrevencion getPrevencion() {
		return Prevencion;
	}
	public void setPrevencion(PilaPrevencion prevencion) {
		Prevencion = prevencion;
	}
	public PilaDesastresNaturales getDesastresNaturales() {
		return DesastresNaturales;
	}
	public void setDesastresNaturales(PilaDesastresNaturales desastresNaturales) {
		DesastresNaturales = desastresNaturales;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}


	

}
