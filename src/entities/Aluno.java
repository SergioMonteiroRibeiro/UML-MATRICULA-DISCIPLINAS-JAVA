package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.MatriculaStatus;

public class Aluno {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date momento;
	private String nome;
	private String curso;
	
	List<Matricula> Aluno = new ArrayList<>();
	
	public Aluno() {
	}

	public Aluno(Date momento, String nome, String curso) {
		
		this.momento = momento;
		this.nome = nome;
		this.curso = curso;
	}

	
	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void addDisciplina(Matricula materias) {
		Aluno.add(materias);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Aluno matriculado em: ");
		sb.append(sdf.format(momento));
		
		sb.append("\nDisciplinas matriculadas e status: \n");
		for (Matricula item : Aluno) {
			sb.append("-- " + item + "\n");
		}
		return sb.toString();
	}
}
