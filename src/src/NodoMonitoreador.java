package src;

public class NodoMonitoreador {
	private Monitoreador monitoreador;
	private NodoMonitoreador sig;
	
	public NodoMonitoreador() {
		this.sig = null;
	}

	public Monitoreador getMonitoreador() {
		return monitoreador;
	}

	public void setMonitoreador(Monitoreador monitoreador) {
		this.monitoreador = monitoreador;
	}

	public NodoMonitoreador getSig() {
		return sig;
	}

	public void setSig(NodoMonitoreador sig) {
		this.sig = sig;
	}
	
}
