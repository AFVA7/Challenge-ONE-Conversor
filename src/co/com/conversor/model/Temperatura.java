package co.com.conversor.model;

import javax.swing.JOptionPane;

public class Temperatura {

	private String msg = "Elija una opción para convertir";
	private String titulo = "Temperatura";

	private final String op1 = "Grados Celcius a Grados Fahrenheit";
	private final String op2 = "Grados Celcius a Kelvin";
	private final String op3 = "Grados Fahrenheit a Grados Celcius";
	private final String op4 = "Grados Fahrenheit a Kelvin";
	private final String op5 = "Kelvin a Grados Celcius";
	private final String op6 = "Kelvin a Grados Fahrenheit";
	
	private String[] opciones = {op1, op2, op3, op4, op5, op6};

	private String opcion;
	double resul;

	public void convertirTemperatura(double valor) {
		opcion = (JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE, null, opciones, op1))
				.toString();
		switch (opcion) {
		case op1:
			resul = (valor * 9/5) + 32;
			Util.imprimirTemperatura(valor, resul, "Grados Celcius", "Grados Fahrenheit");
			break;
		case op2:
			resul = valor + 273.15;
			Util.imprimirTemperatura(valor, resul, "Grados Celcius", "Grados Kelvin");
			break;
		case op3:
			resul = (valor-32) * 5/9;
			Util.imprimirTemperatura(valor, resul, "Grados Fahrenheit", "Grados Celcius");
			break;
		case op4:
			resul=(valor - 32) * 5/9 + 273.15;
			Util.imprimirTemperatura(valor, resul, "Grados Fahrenheit", "Grados Kelvin");
			break;
		case op5:
			resul = valor - 273.15;
			Util.imprimirTemperatura(valor, resul, "Grados Kelvin", "Grados Celcius");
			break;
		case op6:
			resul = (valor-273.15) * 9/5 + 32;
			Util.imprimirTemperatura(valor, resul, "Grados Kelvin", "Grados Fahrenheit");
			break;

		default:
			break;
		}
	}

	public void toPeso(double valor) {
		Util.imprimir(valor, "Pesos");
	}
}
