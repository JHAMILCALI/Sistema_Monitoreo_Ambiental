
import java.util.Scanner;
public class ColaSimpleMeteorologia extends ColaMeteorologia{

	public ColaSimpleMeteorologia() {
		super();
	}
	public boolean esVacia() {
		if(fr == fi)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(fi == MAX-1)
			return true;
		return false;
	}
	public void adi(Meteorologia elem) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public Meteorologia eli() {
		Meteorologia elem = new Meteorologia();
		if(esVacia())
			System.out.println("Cola simple vacia!!");
		else {
			fr++;
			elem = v[fr];
		}
		return elem;
	}
	public int nroElem() {
		return (fi - fr);
	}
	public void vaciar(ColaSimpleMeteorologia z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Introduce datso de la Meteorologia");
			Meteorologia elem = new Meteorologia();
			elem.leer();
			adi(elem);
		}
	}
	public void mostrar() {
		ColaSimpleMeteorologia aux = new ColaSimpleMeteorologia();
		Meteorologia x;
		int cont =1;
		while(!esVacia()) {
			x = eli();
			System.out.println("\tMETOROLOGIA ["+cont+"]");
			x.mostrar();
			cont++;
			aux.adi(x);
		}
		vaciar(aux);
	}
}