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
		
		Date momentoMatricula = new Date();
		System.out.print("Data de matr�cula gerada automaticamente: " + sdf.format(momentoMatricula));
		
		String disciplinas2sem = "\n|SISTEMAS DE INFORMA��O  |"
						       + "\n|LINGUAGEM DE PROGRAMA��O|"
						       + "\n|C�LCULO                 |"
						       + "\n|ENGENHARIA DE SOFTWARE I|";
		
		String disciplinas3sem = "\n|SISTEMAS OPERACIONAIS    |"
			       			   + "\n|ESTRUTURA DE DADOS       |"
			                   + "\n|ESTAT�STICA              |"
			                   + "\n|ENGENHARIA DE SOFTWARE II|";
		
		System.out.print("\n\nInsira seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Insira seu curso: ");
		String curso = sc.nextLine();
		
		Aluno aluno = new Aluno(momentoMatricula, nome, curso);
		
		System.out.println();
		System.out.print("Mat�rias requisitos para o 3� semestre : " + disciplinas2sem);
		System.out.println();
		System.out.println();
		System.out.print("Mat�rias do 3� semestre : " + disciplinas3sem);
		
		System.out.println();
		System.out.println();
		System.out.print("Em quantas mat�rias deseja se inscrever? ");
		int N = sc.nextInt();
		
		System.out.println();
		sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			System.out.print("Nome da disciplina desejada: ");
			String materia = sc.nextLine();
			String status = "PENDENTE";
			
			Matricula disciplina = new Matricula(materia, MatriculaStatus.valueOf(status));
			
			aluno.addDisciplina(disciplina);
		}
		
		System.out.println();
		System.out.println(aluno);

	}

}
