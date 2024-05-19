import java.util.Iterator;
import java.util.Scanner;

public class Meteorologia {
	ColaCircularTemperatura temperatura = new ColaCircularTemperatura();
	String fecha;
	int humedad,viento;
	public Meteorologia() {
		
	}
	public Meteorologia(ColaCircularTemperatura temperatura, String fecha, int viento, int humedad) {
		super();
		this.temperatura = temperatura;
		this.fecha = fecha;
		this.viento = viento;
		this.humedad = humedad;
	}
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("INTRO FECHA; ");
		fecha=sc.next();
		System.out.println("INTRO VIENTO: ");
		viento=sc.nextInt();
		System.out.println("Intro humedad: ");
		humedad=sc.nextInt();
		System.out.println("****Intro TEMPERATURA a adicionar****");
		int x = sc.nextInt();
		temperatura.llenar(x);
	}
	void mostrar() {
		System.out.println("FECHA: "+fecha);
		System.out.println("Viento: "+viento+" Km/h");
		System.out.println("Humedad: "+humedad+"%");
		temperatura.mostrar();
	}
	public ColaCircularTemperatura getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(ColaCircularTemperatura temperatura) {
		this.temperatura = temperatura;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getViento() {
		return viento;
	}
	public void setViento(int viento) {
		this.viento = viento;
	}
	public int getHumedad() {
		return humedad;
	}
	public void setHumedad(int humedad) {
		this.humedad = humedad;
	}
	
}
