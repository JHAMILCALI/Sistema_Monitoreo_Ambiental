package ProyectoSMA;

import java.util.Scanner;
public class Metereologia {
	private LS_NormalTemperatura temp;
	private String fecha;
	private int humedad;
	private String viento;

	
	public Metereologia() {
		temp = new LS_NormalTemperatura();
		fecha = "";
		humedad = 0;
		viento = "";
	}

	public Metereologia(LS_NormalTemperatura temp, String fecha, int humedad, String viento) {
		super();
		this.temp = temp;
		this.fecha = fecha;
		this.humedad = humedad;
		this.viento = viento;
	}
	
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa la fecha: ");
		fecha = sc.next();
		System.out.println("Ingresa la cantidad de temperaturas de la cola: ");
		int n = sc.nextInt();
		temp.leer2(n);
		System.out.println("Ingresa la humedad: ");
		humedad = sc.nextInt();
		System.out.println("Ingresa el viento: ");
		viento = sc.next();
	}
	
	public void mostrar() {
		System.out.println("\t-* DATOS METEREOLOGICOS -*");
		System.out.println("Fecha: "+fecha);
		System.out.println("\t-- Temperaturas registradas en este mes --");
		temp.mostrar();
		System.out.println("Humedad: "+humedad+"%");
		System.out.println("Viento: "+viento);
	}

	public LS_NormalTemperatura getTemp() {
		return temp;
	}

	public void setTemp(LS_NormalTemperatura temp) {
		this.temp = temp;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getHumedad() {
		return humedad;
	}

	public void setHumedad(int humedad) {
		this.humedad = humedad;
	}

	public String getViento() {
		return viento;
	}

	public void setViento(String viento) {
		this.viento = viento;
	}
}
