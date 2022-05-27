package com.yuri.poojava.aula02.labs;

public class Lampada {
	String marca;
	String cor;
	String tecnologiaIluminacao;
	String forma;
	double potencia;
	double preco;
	boolean ligada;
	
	void ligarLampada() {
		ligada = true;
		System.out.println("Lampada ligada!");
	}
	
	void desligarLampada() {
		ligada = false;
		System.out.println("Lampada Desligada!");
	}
}
