package src;

public class NodoMeteorologia {
	private Meteorologia meteorologia;
	private NodoMeteorologia ant;
	private NodoMeteorologia sig;
	
	public NodoMeteorologia() {
		this.ant = null;
		this.sig = null;
	}

	public Meteorologia getMetereologia() {
		return meteorologia;
	}

	public void setMetereologia(Meteorologia meteorologia) {
		this.meteorologia = meteorologia;
	}

	public NodoMeteorologia getAnt() {
		return ant;
	}

	public void setAnt(NodoMeteorologia ant) {
		this.ant = ant;
	}

	public NodoMeteorologia getSig() {
		return sig;
	}

	public void setSig(NodoMeteorologia sig) {
		this.sig = sig;
	}

	


	
	
}
