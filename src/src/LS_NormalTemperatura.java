package src;
public class LS_NormalTemperatura extends ListaSimpleTemperatura{
	public LS_NormalTemperatura() {
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
	
	public void adiPrincipio(Temperatura z) {
		NodoTemperatura nuevo = new NodoTemperatura();
		nuevo.setTemperatura(z);
		nuevo.setSig(P); // el siguiente del nodo apunta a nodo raiz
		P = nuevo;		 // P apunta a nuevo
	}
	
	public void adiFinal(Temperatura z) {
		NodoTemperatura nuevo = new NodoTemperatura();
		nuevo.setTemperatura(z);
		
		if(esVacia()) {
			P = nuevo;     //p apunta a nuevo
		}
		else {
			NodoTemperatura R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			
		}
	}
	
	public void mostrar() {
		NodoTemperatura R = P;  //R apunta a la raiz P
		while(R != null) {
			R.getTemperatura().mostrar();
			R = R.getSig();
		}
	}
	
	public int nroNodos() {
		NodoTemperatura R = P;
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
	
	public NodoTemperatura eliPrincipio() {
		NodoTemperatura x = new NodoTemperatura();
		if(!esVacia()) {
			x = P;
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoTemperatura eliFinal() {
		NodoTemperatura x = new NodoTemperatura();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}
			else {
				NodoTemperatura R = P;
				NodoTemperatura S = P;
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
		System.out.println("Temperatura...");
		for(int i = 1; i <= n; i++) {
			Temperatura z = new Temperatura();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		System.out.println("Temperatura...");
		for(int i = 1; i <= n; i++) {
			Temperatura z = new Temperatura();
			z.leer();
			adiFinal(z);
		}
	}
}
