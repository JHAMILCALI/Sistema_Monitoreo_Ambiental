
import java.util.Scanner;

public class ColaCircularTemperatura extends ColaTemperatura{
	ColaCircularTemperatura() {
		super();
	}
	
	public int nroElem() {
		return (fi - fr + MAX) % MAX;
	}
	
	
	public boolean esVacia() {
		if(nroElem() == 0)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(nroElem() == MAX-1)
			return true;
		return false;
	}
	
	
	public void adicionar(Temperatura elem) {
		if(!esLlena()) {
			fi = (fi + 1) % MAX;
			v[fi] = elem;
		}else {
			System.out.println("cola circular llena!!!");
		}
	}
	public Temperatura eliminar() {
		Temperatura elem=new Temperatura();
		if(!esVacia()) {
			fr = (fr + 1) % MAX;
			elem = v[fr];
		}else {
			System.out.println("Cola circular vacia!!");
		}
		return elem;
	}
	
	public void vaciar(ColaCircularTemperatura z) {
		while(!z.esVacia()) {
			adicionar(z.eliminar());
		}
	}
	public void llenar(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			Temperatura x=new Temperatura();
			x.leer();
			adicionar(x);
		}
	}
	public void mostrar() {
		ColaCircularTemperatura aux = new ColaCircularTemperatura();
		System.out.println("\tTEMPERATURA");
		while(!esVacia()) {
			Temperatura elem = eliminar();
			elem.mostrar();
			aux.adicionar(elem);
		}
		vaciar(aux);
	}
	
}