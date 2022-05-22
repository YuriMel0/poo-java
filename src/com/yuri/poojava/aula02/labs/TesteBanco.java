package com.yuri.poojava.aula02.labs;

public class TesteBanco {

	public static void main(String[] args) {
		
		Banco santander = new Banco();
		
		santander.numero = 1234;
		santander.saldo = 1200;
		santander.especial = false;
		santander.limite = 100000;
		
		santander.consultarSaldo();
		santander.depositarDinheiro(100);
		santander.consultarSaldo();
		
		santander.sacarDinheiro(50);
		santander.consultarSaldo();
		
		santander.consultaEspecial();
	}

}
