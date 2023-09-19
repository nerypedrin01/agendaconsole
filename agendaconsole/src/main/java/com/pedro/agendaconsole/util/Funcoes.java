package com.pedro.agendaconsole.util;

public class Funcoes {

	public static String formataCelular(String celular) {

	 String ddd = "(" +celular.substring(0,2) +")";
	 String cell = celular.substring(2,(celular.length()/2) +1);
	 String fimCell = celular.substring((celular.length()/2)+1, celular.length());
	 
	 return ddd + cell +"-" + fimCell;
	}
}
