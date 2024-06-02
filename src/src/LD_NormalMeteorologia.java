package src;

public class LD_NormalMeteorologia extends ListaDobleMeteorologia{
	public LD_NormalMeteorologia() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoMeteorologia R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Meteorologia z){
		NodoMeteorologia nuevo = new NodoMeteorologia();
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
		NodoMeteorologia R = P;
		while(R != null) {
			R.getMetereologia().mostrar();
			System.out.println("");
			R = R.getSig();
		}
	}
	void adiFinal(Meteorologia z) {
		NodoMeteorologia nuevo =  new NodoMeteorologia();
		nuevo.setMetereologia(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoMeteorologia R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoMeteorologia eliPrimero() {
		NodoMeteorologia x = new NodoMeteorologia();
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
	
	NodoMeteorologia eliFinal() {
		NodoMeteorologia x = new NodoMeteorologia();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoMeteorologia R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoMeteorologia aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		System.out.println("Metereologia...");
		for (int i = 1; i <= n; i++) {
			Meteorologia z = new Meteorologia();
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		System.out.println("Metereologia...");
		for (int i = 1; i <= n; i++) {
			Meteorologia z = new Meteorologia();
			z.leer();
			adiFinal(z);
		}
	}
}
