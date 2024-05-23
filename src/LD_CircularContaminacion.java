package ProyectoSMA;

import java.util.Scanner;
public class LD_CircularContaminacion extends ListaDobleContaminacion{
	public LD_CircularContaminacion() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoContaminacion R = P;
		if(!esVacia()) {
			while(R.getSig() != P) {
				c++;
				R = R.getSig();
			}
			c++;
		}
		return c;
	}
	void adiPrimero(Contaminacion z){
		NodoContaminacion nuevo = new NodoContaminacion();
		nuevo.setContaminacion(z);
		if(esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P);
		}
		else {
			NodoContaminacion R = P.getAnt();
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
			P.setAnt(R);
			R.setSig(P);
		}
	}
	void mostrar() {
		NodoContaminacion R = P;
		if(!esVacia()) {
			while(R.getSig() != P) {
				R.getContaminacion().mostrar();
				R = R.getSig();
			}
			R.getContaminacion().mostrar();
		}
		else
			System.out.println("Lista Vacia");
	}

	void adiFinal(Contaminacion z) {
		NodoContaminacion nuevo = new NodoContaminacion();
		nuevo.setContaminacion(z);
		if(esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P);
		}
		else {
			NodoContaminacion R = P.getAnt();
			R.setSig(nuevo);
			nuevo.setAnt(R);
			nuevo.setSig(P);
			P.setAnt(nuevo);
		}
	}

	NodoContaminacion eliPrimero() {
		NodoContaminacion x = new NodoContaminacion();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				NodoContaminacion R = P.getAnt();
				P = P.getSig();
				P.setAnt(R);
				R.setSig(P);
			}
			x.setSig(null);
			x.setAnt(null);
		}
		return x;
	}

	NodoContaminacion eliFinal() {
		NodoContaminacion x = new NodoContaminacion();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P.getAnt();
				NodoContaminacion R = x.getAnt();
				R.setSig(P);
				P.setAnt(R);
			}
			x.setSig(null);
			x.setAnt(null);
		}
		return x;
	}

	void leer1(int n) {
		Scanner lee =  new Scanner(System.in);
		System.out.println("Contaminacion...");
		for (int i = 1; i <= n; i++) {
			Contaminacion z = new Contaminacion();
			z.leer();
			adiPrimero(z);
		}
	}

	void leer2(int n) {
		Scanner lee =  new Scanner(System.in);
		System.out.println("Contaminacion...");
		for (int i = 1; i <= n; i++) {
			Contaminacion z = new Contaminacion();
			z.leer();
			adiFinal(z);
		}
	}
}
