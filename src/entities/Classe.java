package entities;

public class Classe {

	private Integer numSala;
	private String periodo;
	
	public Classe() {
		
	}

	public Classe(Integer numSala, String periodo) {
		this.numSala = numSala;
		this.periodo = periodo;
	}

	public Integer getNumSala() {
		return numSala;
	}

	public void setNumSala(Integer numSala) {
		this.numSala = numSala;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	@Override
	public String toString() {
		return "\nClasse: número da sala " + numSala 
			 + ", período " + periodo;
	}
	
	
}
