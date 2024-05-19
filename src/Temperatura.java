import java.util.Scanner;

public class Temperatura {
	private
	double grados;

	public Temperatura(double grados) {
		super();
		this.grados = grados;
	}
	public Temperatura() {
		
	}
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intor gardod: ");
		grados=sc.nextDouble();
	}
	public void mostrar() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Temperatura [grados=" + grados + "]";
	}
	public double getGrados() {
		return grados;
	}
	public void setGrados(double grados) {
		this.grados = grados;
	}
	
	
	
}
