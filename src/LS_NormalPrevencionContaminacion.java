package ProyectoSMA;

import java.util.Scanner;

public class LS_NormalPrevencionContaminacion extends ListaSimplePrevencionContaminacion{
	public LS_NormalPrevencionContaminacion() {
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
	
	public void adiPrincipio(LD_CircularContaminacion LDc, int x,String alerta) {
		NodoPrevencionContaminacion nuevo = new NodoPrevencionContaminacion();
		nuevo.setLDc(LDc);
		nuevo.setCantLugaresAfectados(x);
		nuevo.setAlerta(alerta);
		nuevo.setSig(P); // el siguiente del nodo apunta a nodo raiz
		P = nuevo;		 // P apunta a nuevo
	}
	
	public void adiFinal(LD_CircularContaminacion LDc, int x,String alerta) {
		NodoPrevencionContaminacion nuevo = new NodoPrevencionContaminacion();
		nuevo.setLDc(LDc);
		nuevo.setCantLugaresAfectados(x);
		nuevo.setAlerta(alerta);
		
		if(esVacia()) {
			P = nuevo;     //p apunta a nuevo
		}
		else {
			NodoPrevencionContaminacion R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			
		}
	}
	
	public void mostrar() {
		NodoPrevencionContaminacion R = P;  //R apunta a la raiz P
		System.out.println("\t-* Prevencion de Contaminacion -*");
		while(R != null) {
			System.out.println("\t-- Contaminaciones registradas en este mes --");
			R.getLDc().mostrar();
			System.out.println("Cantidad de lugares afectados: "+R.getCantLugaresAfectados());
			System.out.println("ALERTA!: "+R.getAlerta());
			System.out.println();
			R = R.getSig();
		}
	}
	
	public int nroNodos() {
		NodoPrevencionContaminacion R = P;
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
	
	public NodoPrevencionContaminacion eliPrincipio() {
		NodoPrevencionContaminacion x = new NodoPrevencionContaminacion();
		if(!esVacia()) {
			x = P;
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoPrevencionContaminacion eliFinal() {
		NodoPrevencionContaminacion x = new NodoPrevencionContaminacion();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}
			else {
				NodoPrevencionContaminacion R = P;
				NodoPrevencionContaminacion S = P;
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
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= n; i++) {
			System.out.println("Prevencion_Contaminacion...");
			System.out.println("Numero de nodos de la Lista Contaminacion: ");
			int g = sc.nextInt();
			LD_CircularContaminacion LDc = new LD_CircularContaminacion();
			LDc.leer1(g);
			System.out.println("Cantidad de lugares afectados: ");
			int cant = sc.nextInt();
			System.out.println("Mensaje de alerta?");
			String alert = sc.next();
			adiPrincipio(LDc, cant,alert);
		}
	}
	
	public void leer2(int n) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= n; i++) {
			System.out.println("Prevencion_Contaminacion...");
			System.out.println("Numero de nodos de la Lista Contaminacion: ");
			int g = sc.nextInt();
			LD_CircularContaminacion LDc = new LD_CircularContaminacion();
			LDc.leer2(g);
			System.out.println("Cantidad de lugares afectados: ");
			int cant = sc.nextInt();
			System.out.println("Mensaje de alerta?");
			String alert = sc.next();
			adiFinal(LDc, cant, alert);
		}
	}
}
