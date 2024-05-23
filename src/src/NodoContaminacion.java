package src;

public class NodoContaminacion {
	private Contaminacion contaminacion;
	private NodoContaminacion ant;
	private NodoContaminacion sig;
	
	public NodoContaminacion() {
		this.ant = null;
		this.sig = null;
	}

	public Contaminacion getContaminacion() {
		return contaminacion;
	}

	public void setContaminacion(Contaminacion contaminacion) {
		this.contaminacion = contaminacion;
	}

	public NodoContaminacion getAnt() {
		return ant;
	}

	public void setAnt(NodoContaminacion ant) {
		this.ant = ant;
	}

	public NodoContaminacion getSig() {
		return sig;
	}

	public void setSig(NodoContaminacion sig) {
		this.sig = sig;
	}
	
	
}
