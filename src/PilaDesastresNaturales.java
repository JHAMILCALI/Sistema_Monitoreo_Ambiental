

import java.util.Scanner;


public class PilaDesastresNaturales extends VectorDesastresNaturales{
	private int tope;

	public PilaDesastresNaturales() {
		this.tope = -1;
	}
	
	public boolean esVacia(){
		if(this.tope == -1)
			return true;  //pila vacia
		else
			return false; //pila no es vacia
	}
	public boolean esLlena(){
		if(this.tope == max-1)
			return true;  //pila llena
		else 
			return false; //pila no es llena
	}
	public void adi(DesastresNaturales elem){
		if(!esLlena()){ //si la pila no es llena
			this.tope++;  //incrementa en una unidad  tope = tope + 1
			this.v[this.tope] = elem;
		}
		else
			System.out.println("Pila Llena!!!");
	}
	public DesastresNaturales eli(){
		DesastresNaturales elem = new DesastresNaturales();
		if(!esVacia()){ //si la pila no es vacia
			elem = this.v[this.tope];
			this.tope--; //decrementamos en una unidad
		}
		else
			System.out.println("Pila es vacia!!!!");
		return elem;
	}
	
	public void mostrar(){
		PilaDesastresNaturales aux = new PilaDesastresNaturales();
		System.out.println("\tDESASTRE NAURAL");
		while(!esVacia()){
			DesastresNaturales elem = new DesastresNaturales();
			 elem = eli();
			//System.out.println(elem);
			elem.mostrar();
			aux.adi(elem);
		} 
		vaciar(aux);
	}
	public void vaciar(PilaDesastresNaturales p){
		while(!p.esVacia()){  //mientras la pila p NO es vacia
			this.adi(p.eli());
		}
	}
	public void llenar(int n){
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr datos: CODL, MODELO, MARCA, PRECIO ");
		for (int i = 1; i <= n; i++) {
			DesastresNaturales elem = new DesastresNaturales();
			elem.leer();
			this.adi(elem);
		}
	}
	public int nroElem(){
		return tope + 1;
	}
	public int NroElem(){
		PilaDesastresNaturales aux = new PilaDesastresNaturales();
		int c = 0;
		while(!esVacia()){
			DesastresNaturales elem = eli();
			aux.adi(elem);
			c++;
		} 
		vaciar(aux);
		return c;
	}
}
