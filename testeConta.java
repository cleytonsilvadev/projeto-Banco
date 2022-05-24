package atividade;

import java.util.Scanner;

public class testeConta {

	public static void main(String[] args) {

		Conta c1 = new Conta("cleyton", 01);
		Conta c2 = new Conta("waldeck", 02);
		
		c1.depositar(1000);
		c2.depositar(2000);

//      c1.numero = 9182739;
//		c1.saldo= 1000;
//		c1.titular= "cleyton";

//		c2.numero = 1234567;
//		c2.saldo= 2000;
//		c2.titular= "waldeck";
		System.out.println("--------------------------------");
		System.out.println("TITULAR: " + c1.getTitular());
		System.out.println("CONTA: " + c1.getNumero());
		System.out.println("SALDO: " + c1.getSaldo());
		System.out.println("--------------------------------");
		c1.depositar(100);
		System.out.println("--------------------------------");
		System.out.println("SEU SALDO É:" + c1.getSaldo());
		System.out.println("--------------------------------");
		c1.sacar(300);
		System.out.println("CHECANDO SALDO...");
		System.out.println("SEU NOVO SALDO É DE R$  " + c1.getSaldo());
		System.out.println("--------------------------------");
		
		System.out.println("segunda conta");
		
		System.out.println("--------------------------------");
		c1.transferir(500, c2);
		System.out.println("CHECANDO SALDO..." + c1.getSaldo());
		System.out.println("--------------------------------");
		System.out.println("TITULAR: " + c2.getTitular());
		System.out.println("CONTA: " + c2.getNumero());
		System.out.println("SALDO: " + c2.getSaldo());
		System.out.println("--------------------------------");
		c2.depositar(400);
		System.out.println("SEU SALDO É:" + c2.getSaldo());
		System.out.println("--------------------------------");
		c2.sacar(800);
		System.out.println("CHECANDO SALDO...");
		System.out.println("SEU NOVO SALDO É DE R$  " + c2.getSaldo());
		System.out.println("--------------------------------");
		c2.transferir(100, c1);
		System.out.println("CHECANDO SALDO..." + c2.getSaldo());
		System.out.println("--------------------------------");
	}

}
