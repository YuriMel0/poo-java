package com.yuri.poojava.aula02.labs;

public class Aluno {
	
	String nome;
	int matricula;
	String curso;
	String[] disciplinas;
	double[] notas;
	
	void verificaAP() {
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] >= 7) {
				System.out.println("Situação em " + disciplinas[i] + ": APROVADO" + " Nota: " + notas[i]);
			} else {
				System.out.println("Situação em " + disciplinas[i] + ": REPROVADO" + " Nota: " + notas[i]);
			}
		}
	}

}
