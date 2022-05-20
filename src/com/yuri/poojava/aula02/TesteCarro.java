package com.yuri.poojava.aula02;

import com.yuri.poojava.aula02.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		
		System.out.println("A autonomia é: " + autonomia + " Km");

		double qdtCombustivel = van.calcularCombustivel(10);
		
		System.out.println("quantidade de combustivel para 10km: " + qdtCombustivel);
	}
}
