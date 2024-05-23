package ProyectoSMA;

public class LD_NormalMetereologia extends ListaDobleMetereologia{
	public LD_NormalMetereologia() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoMetereologia R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Metereologia z){
		NodoMetereologia nuevo = new NodoMetereologia();
		nuevo.setMetereologia(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoMetereologia R = P;
		while(R != null) {
			R.getMetereologia().mostrar();
			System.out.println("");
			R = R.getSig();
		}
	}
	void adiFinal(Metereologia z) {
		NodoMetereologia nuevo =  new NodoMetereologia();
		nuevo.setMetereologia(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoMetereologia R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoMetereologia eliPrimero() {
		NodoMetereologia x = new NodoMetereologia();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				P = P.getSig();
				P.setAnt(null);
				x.setSig(null);
			}
		}
		return x;
	}
	
	NodoMetereologia eliFinal() {
		NodoMetereologia x = new NodoMetereologia();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoMetereologia R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoMetereologia aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		System.out.println("Metereologia...");
		for (int i = 1; i <= n; i++) {
			Metereologia z = new Metereologia();
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		System.out.println("Metereologia...");
		for (int i = 1; i <= n; i++) {
			Metereologia z = new Metereologia();
			z.leer();
			adiFinal(z);
		}
	}
}
