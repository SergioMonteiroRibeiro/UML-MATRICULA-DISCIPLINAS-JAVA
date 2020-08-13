package entities;

import entities.enums.MatriculaStatus;

public class Matricula {

	private String materias;
	private MatriculaStatus status;
	
	public Matricula() {
	}

	public Matricula(String materias, MatriculaStatus status) {
		super();
		this.materias = materias;
		this.status = status;
	}

	public String getMaterias() {
		return materias;
	}

	public void setMaterias(String materias) {
		this.materias = materias;
	}
	
	public MatriculaStatus getStatus() {
		return status;
	}

	public void setStatus(MatriculaStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return materias + " --> " + status;
	}
	
	
}
