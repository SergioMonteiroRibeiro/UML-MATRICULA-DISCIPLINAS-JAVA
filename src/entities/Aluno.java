package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.MatriculaStatus;

public class Aluno {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date momento;
	private MatriculaStatus status;
	
	List<Matricula> Aluno = new ArrayList<>();
	
	public Aluno() {
	}

	public Aluno(Date momento, MatriculaStatus status) {
		this.momento = momento;
		this.status = status;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public MatriculaStatus getStatus() {
		return status;
	}

	public void setStatus(MatriculaStatus status) {
		this.status = status;
	}
	
	public void addDisciplina(Matricula materias) {
		Aluno.add(materias);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Aluno matriculado em: ");
		sb.append(sdf.format(momento));
		sb.append("\nStatus da matrícula: ");
		sb.append(status);
		
		sb.append("\nDisciplinas matriculadas: \n");
		for (Matricula item : Aluno) {
			sb.append("-- " + item + "\n");
		}
		return sb.toString();
	}
}
