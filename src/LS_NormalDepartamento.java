package ProyectoSMA;

public class LS_NormalDepartamento extends ListaSimpleDepartamento{
	public LS_NormalDepartamento() {
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
	
	public void adiPrincipio(Departamento z) {
		NodoDepartamento nuevo = new NodoDepartamento();
		nuevo.setDepartamento(z);
		nuevo.setSig(P); // el siguiente del nodo apunta a nodo raiz
		P = nuevo;		 // P apunta a nuevo
	}
	
	public void adiFinal(Departamento z) {
		NodoDepartamento nuevo = new NodoDepartamento();
		nuevo.setDepartamento(z);
		
		if(esVacia()) {
			P = nuevo;     //p apunta a nuevo
		}
		else {
			NodoDepartamento R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			
		}
	}
	
	public void mostrar() {
		NodoDepartamento R = P;  //R apunta a la raiz P
		while(R != null) {
			R.getDepartamento().mostrar();
			System.out.println("*************************************************************************************");
			R = R.getSig();
		}
	}
	
	public int nroNodos() {
		NodoDepartamento R = P;
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
	
	public NodoDepartamento eliPrincipio() {
		NodoDepartamento x = new NodoDepartamento();
		if(!esVacia()) {
			x = P;
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoDepartamento eliFinal() {
		NodoDepartamento x = new NodoDepartamento();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}
			else {
				NodoDepartamento R = P;
				NodoDepartamento S = P;
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
			Departamento z = new Departamento();
			z.leer();
			adiPrincipio(z);
		}
	}
	
	public void leer2(int n) {
		for(int i = 1; i <= n; i++) {
			Departamento z = new Departamento();
			z.leer();
			adiFinal(z);
		}
	}
}
