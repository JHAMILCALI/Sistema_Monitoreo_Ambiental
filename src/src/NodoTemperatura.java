package src;

public class NodoTemperatura {
	private Temperatura temperatura;
	private NodoTemperatura sig;
	
	public NodoTemperatura() {
		this.sig = null;
	}

	public Temperatura getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Temperatura temperatura) {
		this.temperatura = temperatura;
	}

	public NodoTemperatura getSig() {
		return sig;
	}

	public void setSig(NodoTemperatura sig) {
		this.sig = sig;
	}
	
	
}
