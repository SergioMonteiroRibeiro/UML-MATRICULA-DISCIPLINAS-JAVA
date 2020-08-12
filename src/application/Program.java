package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Aluno;
import entities.Matricula;
import entities.enums.MatriculaStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Data de matrícula: ");
		Date momento = sdf.parse(sc.next());
		
		System.out.print("Status da matrícula: ");
		MatriculaStatus status = MatriculaStatus.valueOf(sc.next());
		
		Aluno aluno = new Aluno(momento, status);
		
		System.out.println();
		
		System.out.print("Em quantas matérias deseja se matricular? ");
		int N = sc.nextInt();
		
		System.out.println();
		sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			System.out.print("Nome da disciplina desejada: ");
			String materia = sc.nextLine();
			
			Matricula disciplina = new Matricula(materia);
			
			aluno.addDisciplina(disciplina);
		}
		
		System.out.println();
		System.out.println(aluno);
		
		sc.close();

	}

}
