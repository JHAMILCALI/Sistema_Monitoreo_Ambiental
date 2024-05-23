package src;

public class NodoPrevencionContaminacion {
	private LD_CircularContaminacion LDc;
	private int cantLugaresAfectados;
	private String alerta;
	private NodoPrevencionContaminacion sig;
	
	public NodoPrevencionContaminacion() {
		this.sig = null;
	}
	
	
	
	
	public String getAlerta() {
		return alerta;
	}




	public void setAlerta(String alerta) {
		this.alerta = alerta;
	}




	public int getCantLugaresAfectados() {
		return cantLugaresAfectados;
	}



	public void setCantLugaresAfectados(int cantLugaresAfectados) {
		this.cantLugaresAfectados = cantLugaresAfectados;
	}



	public LD_CircularContaminacion getLDc() {
		return LDc;
	}

	public void setLDc(LD_CircularContaminacion lDc) {
		LDc = lDc;
	}

	public NodoPrevencionContaminacion getSig() {
		return sig;
	}

	public void setSig(NodoPrevencionContaminacion sig) {
		this.sig = sig;
	}
	
	
}
