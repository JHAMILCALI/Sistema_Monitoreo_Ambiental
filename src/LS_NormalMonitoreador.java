package ProyectoSMA;

public class LS_NormalMonitoreador extends ListaSimpleMonitoreador{
	public LS_NormalMonitoreador() {
		super();
	}
	
	public boolean esVacia() {
		if(P == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void adiPrincipio(Monitoreador z) {
		NodoMonitoreador nuevo = new NodoMonitoreador();
		nuevo.setMonitoreador(z);
		nuevo.setSig(P); // el siguiente del nodo apunta a nodo raiz
		P = nuevo;		 // P apunta a nuevo
	}
	
	public void adiFinal(Monitoreador z) {
		NodoMonitoreador nuevo = new NodoMonitoreador();
		nuevo.setMonitoreador(z);
		
		if(esVacia()) {
			P = nuevo;     //p apunta a nuevo
		}
		else {
			NodoMonitoreador R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			
		}
	}
	
	public void mostrar() {
		NodoMonitoreador R = P;  //R apunta a la raiz P
		System.out.println("\t-* Monitoreador -*");
		while(R != null) {
			R.getMonitoreador().mostrar();
			R = R.getSig();
		}
	}
	
	public int nroNodos() {
		NodoMonitoreador R = P;
		int c = 0;
		if(this.esVacia()) {
			return 0;
		}
		else {
			while(R != null) {
				c++;
				R = R.getSig();
			}
		}
		return c;
	}
	
	public NodoMonitoreador eliPrincipio() {
		NodoMonitoreador x = new NodoMonitoreador();
		if(!esVacia()) {
			x = P;
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoMonitoreador eliFinal() {
		NodoMonitoreador x = new NodoMonitoreador();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}
			else {
				NodoMonitoreador R = P;
				NodoMonitoreador S = P;
				while(R.getSig() != null) {
					S = R;      //S apunta a R
					R = R.getSig();  //R apunta al siguiente de R
				}
				x = R;
				S.setSig(null);
			}
		}
		return x;
	}
	
	public void leer1(int n) {
		for(int i = 1; i <= n; i++) {
			Monitoreador z = new Monitoreador();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for(int i = 1; i <= n; i++) {
			Monitoreador z = new Monitoreador();
			z.leer();
			adiFinal(z);
		}
	}
}
