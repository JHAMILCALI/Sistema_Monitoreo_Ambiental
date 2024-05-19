
import java.util.Scanner;

public class Mp_PilaPais {
	PilaPais mp[] = new PilaPais[20];
	int n = 0;
	Mp_PilaPais(int n) {
		int i;
		this.n=n;
		for (i = 0; i < n; i++)
			mp[i] = new PilaPais();
	}

	int Nropilas() {
		return (n);
	}

	int nroelem(int i) {
		return (mp[i].nroElem());
	}

	boolean esvacia(int i) {
		if (mp[i].esVacia())
			return true;
		return false;
	}

	boolean esllena(int i) {
		if (mp[i].esLlena())
			return true;
		return false;
	}

	void adicionar(int i, Pais L) {
		if (!mp[i].esLlena())
			mp[i].adi(L);
		else
			System.out.print("pila " + i + " esta llena");
	}

	Pais eliminar(int i) {
		Pais e = new Pais();
		if (!mp[i].esVacia())
			e = mp[i].eli();
		else
			System.out.print("pila " + i + " esta vacia");
		return e;
	}
	public void llenar(int i, int n) {
		mp[i].llenar(n);
	}
	public void llenar(int n) {
		this.n = n;
		Scanner lee = new Scanner(System.in);
		for (int i = 0; i < this.n; i++) {
			System.out.println("------NRO de Paises a adicionar-------");
			int nroMesa = lee.nextInt();
			mp[i].llenar(nroMesa);
		}
	}

	void mostrar(int i) {
		mp[i].mostrar();
	}

	void mostrar() {
		int i;
		for (i = 0; i < n; i++) {
			mp[i].mostrar();
		}
	}

	void vaciar(int i, PilaPais z) {
		mp[i].vaciar(z);
	}

	public PilaPais[] getMp() {
		return mp;
	}

	public void setMp(PilaPais[] mp) {
		this.mp = mp;
	}

	

	public int getNp() {
		return n;
	}

	public void setNp(int np) {
		this.n = np;
	}
	
}