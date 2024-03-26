package com.josenei;

public class Exercicio02 {

	public static void main(String[] args) {
		System.out.println("******* Conversão Implícita:********");
		Integer inteiroWrapper = 10; // Conversão implícita de int para Integer
		System.out.println ( inteiroWrapper);
		Double decimalWrapper = 20.5; // Conversão implícita de double para Double
		System.out.println(decimalWrapper);
		
		System.out.println("******* Conversão Explícita:********");
		
		double decimalWrapper02 = 10.9;
		System.out.println( decimalWrapper02);
		int inteiroWrapper02 = (int)decimalWrapper02;
		System.out.println(inteiroWrapper02);
	}

}
