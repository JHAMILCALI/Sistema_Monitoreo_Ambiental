package ProyectoSMA;

public class NodoDepartamento {
	private Departamento departamento;
	private NodoDepartamento sig;
	
	public NodoDepartamento() {
		this.sig = null;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public NodoDepartamento getSig() {
		return sig;
	}

	public void setSig(NodoDepartamento sig) {
		this.sig = sig;
	}
	
}
