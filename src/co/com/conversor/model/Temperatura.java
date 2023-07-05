package co.com.conversor.model;

import javax.swing.JOptionPane;

public class Temperatura {

	private String msg = "Elija una opción para convertir";
	private String titulo = "Temperatura";

	private final String op1 = "Grados Celcius a Grados Farenheit";
	private final String op2 = "Grados Celcius a Kelvin";
	private final String op3 = "Grados Farenheit a Grados Celcius";
	private final String op4 = "Grados Farenheit a Kelvin";
	private final String op5 = "Kelvin a Grados Celcius";
	private final String op6 = "Kelvin a Grados Farenheit";
	
	private String[] opciones = {op1, op2, op3, op4, op5, op6};

	private String opcion;
	double resul;

	public void convertirTemperatura(double valor) {
		opcion = (JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE, null, opciones, op1))
				.toString();
		switch (opcion) {
		case op1:
			//operacion
			
			Util.imprimirTemperatura(valor, resul, "Grados Celcius", "Grados Farenheit");
			break;
		case op2:
			//operacion
			resul=0.0;
			Util.imprimirTemperatura(valor, resul, "Grados Celcius", "Grados Kelvin");
			break;
		case op3:
			//operacion
			resul=0.0;
			Util.imprimirTemperatura(valor, resul, "Grados Farenheit", "Grados Celcius");
			break;
		case op4:
			//operacion
			resul=0.0;
			Util.imprimirTemperatura(valor, resul, "Grados Farenheit", "Grados Kelvin");
			break;
		case op5:
			//operacion
			resul=0.0;
			Util.imprimirTemperatura(valor, resul, "Grados Kelvin", "Grados Celcius");
			break;
		case op6:
			//operacion
			double resul=0.0;
			Util.imprimirTemperatura(valor, resul, "Grados Kelvin", "Grados Farenheit");
			break;

		default:
			break;
		}
	}

	public void toPeso(double valor) {
		Util.imprimir(valor, "Pesos");
	}
}
