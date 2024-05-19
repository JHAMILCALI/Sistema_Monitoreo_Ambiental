
import java.util.Scanner;

public class ColaCircularDepartamento extends ColaDepartamento{
	ColaCircularDepartamento() {
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
	
	
	public void adicionar(Departamento elem) {
		if(!esLlena()) {
			fi = (fi + 1) % MAX;
			v[fi] = elem;
		}else {
			System.out.println("cola circular llena!!!");
		}
	}
	public Departamento eliminar() {
		Departamento elem=new Departamento();
		if(!esVacia()) {
			fr = (fr + 1) % MAX;
			elem = v[fr];
		}else {
			System.out.println("Cola circular vacia!!");
		}
		return elem;
	}
	
	public void vaciar(ColaCircularDepartamento z) {
		while(!z.esVacia()) {
			adicionar(z.eliminar());
		}
	}
	public void llenar(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			Departamento x=new Departamento();
			x.leer();
			adicionar(x);
		}
	}
	public void mostrar() {
		ColaCircularDepartamento aux = new ColaCircularDepartamento();
		int cont = 1;
		while(!esVacia()) {
			System.out.println("\n\tDEPARTAMENTO ["+cont+"]");
			Departamento elem = eliminar();
			elem.mostrar();
			cont++;
			aux.adicionar(elem);
		}
		vaciar(aux);
	}
	
}
