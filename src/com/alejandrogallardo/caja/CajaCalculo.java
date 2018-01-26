package com.alejandrogallardo.caja;

import java.util.Scanner;

public class CajaCalculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el Alto:");
		int d;
		Scanner entradaAlto = new Scanner(System.in); 
		d = entradaAlto.nextInt();
		System.out.println("Ingrese el Ancho:");
		int e;
		Scanner entradaAncho = new Scanner(System.in); 
		e = entradaAncho.nextInt();
		System.out.println("Ingrese la Profundidad:");
		int f;
		Scanner entradaProf = new Scanner(System.in); 
		f = entradaProf.nextInt();
				
		Caja cajita = new Caja(d, e, f);
		// Resultado
		System.out.println("El resultado del calculo es: " + cajita.calculo());
	}
}
