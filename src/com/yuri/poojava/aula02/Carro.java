package com.yuri.poojava.aula02;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km");
	}
	
	double obterAutonomia() {
		return capCombustivel * consumoCombustivel; 
	}
	
	double calcularCombustivel(double Km) {
		
		double qdtCombustivel = Km / consumoCombustivel;
		
		return qdtCombustivel;
	}
}
