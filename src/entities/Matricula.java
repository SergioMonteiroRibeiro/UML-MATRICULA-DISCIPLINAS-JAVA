package entities;

public class Matricula {

	private String materias;
	
	public Matricula() {
	}

	public Matricula(String materias) {
		super();
		this.materias = materias;
	}

	public String getMaterias() {
		return materias;
	}

	public void setMaterias(String materias) {
		this.materias = materias;
	}

	@Override
	public String toString() {
		return materias;
	}
	
	
}
