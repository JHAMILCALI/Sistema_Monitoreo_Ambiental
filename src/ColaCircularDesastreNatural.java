package ProyectoSMA;

import java.util.Scanner;

public class ColaCircularDesastreNatural extends ColaDesastreNatural{
	public ColaCircularDesastreNatural() {
		super();
	}
	public int nroElem() {
		return (fi - fr + max) % max;
	}
	public boolean esVacia() {
		if(nroElem() == 0)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(nroElem() == max-1)
			return true;
		return false;
	}
	public void adi(DesastreNatural elem) {
		if(!esLlena()) {
			fi = (fi + 1) % max;
			v[fi] = elem;
		}else
			System.out.println("cola circular llena!!!");
	}
	public DesastreNatural eli() {
		DesastreNatural elem = new DesastreNatural();
		if(!esVacia()) {
			fr = (fr + 1) % max;
			elem = v[fr];
		}else
			System.out.println("Cola circular vacia!!");
		return elem;
	}
	
	public void vaciar(ColaCircularDesastreNatural z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		System.out.println("Desastres Naturales...");
		for (int i = 1; i <= n; i++) {
			DesastreNatural elem = new DesastreNatural();
			elem.leer();
			adi(elem);
		}
	}
	public void mostrar() {
		ColaCircularDesastreNatural aux = new ColaCircularDesastreNatural();
		while(!esVacia()) {
			DesastreNatural elem = eli();
			elem.mostrar();
			aux.adi(elem);
		}
		vaciar(aux);
	}
}
