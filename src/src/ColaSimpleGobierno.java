package src;

import java.util.Scanner;

public class ColaSimpleGobierno extends ColaGobierno{
	public ColaSimpleGobierno() {
		super();
	}
	public boolean esVacia() {
		if(fr == fi) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean esLlena() {
		if(fi == max-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public void adi(Gobierno elem) {
		if(esLlena()) {
			System.out.println("Cola simple llena!!!");
		}
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public Gobierno eli() {
		Gobierno elem = new Gobierno();
		if(esVacia()) {
			System.out.println("Cola simple vacia!!!");
		}
		else {
			fr++;
			elem = v[fr];
		}
		return elem;
	}
	public int nroElem() {
		return (fi-fr);
	}
	public void vaciar(ColaSimpleGobierno z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= n; i++) {
			Gobierno x = new Gobierno();
			x.leer();
			adi(x);
		}
	}
	public void mostrar() {
		ColaSimpleGobierno aux = new ColaSimpleGobierno();
		Gobierno x = new Gobierno() ;
		System.out.println("\t-* Gobierno -*");
		while(!esVacia()) {
			x = eli();
			x.mostrar();
			aux.adi(x);
		}
		vaciar(aux);
	}
}
