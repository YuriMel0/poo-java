package com.yuri.poojava.aula02.labs;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Aluno yuri = new Aluno();
		
		yuri.disciplinas = new String[3];
		yuri.notas = new double[3];
		
		yuri.nome = "Yuri";
		yuri.curso = "Matemática";
		yuri.matricula = 12345678;
		
		for(int i = 0; i < yuri.disciplinas.length; i++) {
			System.out.println("Informe a "+ (i+1) + "° " +"disciplina: ");
			yuri.disciplinas[i] = teclado.next();
			
			System.out.println("Informa a nota em " + yuri.disciplinas[i] + ":");
			yuri.notas[i] = teclado.nextDouble();
		}
		
		yuri.verificaAP();
	}
}
