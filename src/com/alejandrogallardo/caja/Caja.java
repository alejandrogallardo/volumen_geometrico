package com.alejandrogallardo.caja;

public class Caja {
	// atributos de la clase
	int alto;
	int ancho;
	int profundo;
	
	Caja (){
}
	Caja (int a, int b, int c){
		this.alto = a;
		this.ancho = b;
		this.profundo = c;
	}
	 // Calculo
	int calculo() {
		return alto * ancho * profundo;
	}
}
