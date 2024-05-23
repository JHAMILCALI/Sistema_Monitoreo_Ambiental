package src;

public class NodoRescate {
	private Rescate rescate;
	private NodoRescate sig;
	
	public NodoRescate() {
		this.sig = null;
	}

	public Rescate getRescate() {
		return rescate;
	}

	public void setRescate(Rescate rescate) {
		this.rescate = rescate;
	}

	public NodoRescate getSig() {
		return sig;
	}

	public void setSig(NodoRescate sig) {
		this.sig = sig;
	}
	
}
