package src;

public class NodoMetereologia {
	private Metereologia metereologia;
	private NodoMetereologia ant;
	private NodoMetereologia sig;
	
	public NodoMetereologia() {
		this.ant = null;
		this.sig = null;
	}

	public Metereologia getMetereologia() {
		return metereologia;
	}

	public void setMetereologia(Metereologia metereologia) {
		this.metereologia = metereologia;
	}

	public NodoMetereologia getAnt() {
		return ant;
	}

	public void setAnt(NodoMetereologia ant) {
		this.ant = ant;
	}

	public NodoMetereologia getSig() {
		return sig;
	}

	public void setSig(NodoMetereologia sig) {
		this.sig = sig;
	}

	


	
	
}
