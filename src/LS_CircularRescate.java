package ProyectoSMA;

public class LS_CircularRescate extends ListaSimpleRescate{
	public LS_CircularRescate() {
		super();  //constructor de la clase padre ListaSimpleRescate
	}
	public boolean esVacia() {
		if(P == null) {
			return true;//Lista vacia
		}
		else {
			return false; //Lista NO vacia
		}
	}
	public int nroNodos() {
		int c = 0;
		if(P != null) {
			NodoRescate R = P;
			while(R.getSig() != P) {
				c++;
				R = R.getSig();
			}
			c++;  //para contar el ultimo nodo
		}
		return c;
	}
	public void adiFinal(Rescate z) {
		NodoRescate nuevo = new NodoRescate();
		nuevo.setRescate(z);
		if(P == null) {
			P = nuevo;  //P apunta a nuevo
			P.setSig(P); 
		}
		else {
			NodoRescate R = P;
			while(R.getSig() != P) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setSig(P);
		}
	}
	public void adiPrincipio(Rescate z) {
		NodoRescate nuevo = new NodoRescate();
		nuevo.setRescate(z);
		if(P == null) {
			P = nuevo;
			P.setSig(P);
		}
		else {
			NodoRescate R = P;
			while(R.getSig() != P) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setSig(P);
			P = nuevo;
		}
	}
	public void mostrar() {
		NodoRescate R = P;
		while(R.getSig() != P) {
			R.getRescate().mostrar();
			R = R.getSig();
		}
		R.getRescate().mostrar();
	}
	public NodoRescate eliPrincipio() {
		NodoRescate x = null;
		if(!esVacia()) {
			if(P.getSig() == P) {
				x = P;
				x.setSig(null);
			}
			else {
				x = P;
				NodoRescate R = P;
				while(R.getSig() != P) {
					R = R.getSig();
				}
				P = P.getSig();
				R.setSig(P);
				x.setSig(null);
			}
		}
		return x;
		
	}
	public NodoRescate eliFinal() {
		NodoRescate x = new NodoRescate();
		if(P != null) {
			if(P.getSig() == P) {
				x = P;
				x.setSig(null);
				P = null;
			}
			else {
				NodoRescate S = new NodoRescate();
				NodoRescate R = P;
				while(R.getSig() != P) {
					S = R; // S apunta a R
					R = R.getSig(); //R apunta al siguiente de R
				}
				x = R;
				x.setSig(null);
				S.setSig(P);
			}
		}
		return x;
	}
	public void llenar1(int n) {
		System.out.println("Rescate...");
		for(int i = 1; i <= n; i++) {
			Rescate x =new Rescate();
			x.leer();
			adiFinal(x);
		}
	}
	public void llenar2(int n) {
		System.out.println("Rescate...");
		for(int i = 1; i <= n; i++) {
			Rescate x =new Rescate();
			x.leer();
			adiPrincipio(x);
		}
	}
}
