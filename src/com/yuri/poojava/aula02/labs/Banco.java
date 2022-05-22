package com.yuri.poojava.aula02.labs;

public class Banco {
	
	int numero;
	double saldo;
	boolean especial;
	double limite;
	
	void sacarDinheiro(double valorSaque) {
		if(valorSaque <= saldo) {
			System.out.println("Você sacou : R$" + valorSaque);
			saldo -= valorSaque; 
		} else {
			System.out.println("O saldo disponivel e insuficiente");
		}	
	}
	
	void depositarDinheiro(double valorDeposito) {
		if((valorDeposito + saldo) > limite) {
			System.out.println("Não é possivel realizar o deposito, pois o valor excede o limite da conta");
		} else {
			saldo += valorDeposito;;
			System.out.println("Deposito realizado com sucesso, saldo atual: R$" + saldo);
		}
	}
	
	void consultarSaldo() {
		System.out.println("O saldo disponivel é: R$" + saldo);
	}
	
	void consultaEspecial() {
		if(especial) {
			System.out.println("O cheque especial está sendo utilizado");
		} else {
			System.out.println("O cheque especial não está sendo utilizado");
		}
	}
}
