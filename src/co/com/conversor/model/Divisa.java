package co.com.conversor.model;

import javax.swing.JOptionPane;

public class Divisa {
	
	private String msg = "Elija la moneda a la que deseas convertir tu dinero";
	private String titulo = "Moneda";
	
	private final String op1 = "De pesos a Dólar";
	private final String op2 = "De pesos a Euros";
	private final String op3 = "De pesos a Libras Esterlinas";
	private final String op4 = "De pesos a Yen Japonés";
	private final String op5 = "De pesos a Won sul-coreano";
	private final String op6 = "De Dólar a pesos";
	private final String op7 = "De Euros a pesos";
	private final String op8 = "De Libras Esterlinas a pesos";
	private final String op9 = "De Yen Japonés a pesos";
	private final String op10 = "De Won sul-coreanoa a pesos ";
	private String[] opciones = { op1, op2, op3, op4, op5, op6, op7, op8, op9, op10};
	
	private String opcion;

	public void convertir(double valor) {
		opcion = (JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE, null, opciones, op1))
				.toString();
		switch (opcion) {
		case op1:
			Dolar dolar = new Dolar();
			dolar.toDolar(valor);
			break;
		case op2:
			Euro euro = new Euro();
			euro.toEuro(valor);
			break;
		case op3:
			LibraEx libraEx= new LibraEx();
			libraEx.toLibra(valor);
			break;
		case op4:
			Yen yen= new Yen();
			yen.toYen(valor);
			break;
		case op5:
			Won won= new Won();
			won.toWon(valor);
			break;
		case op6:
			dolar = new Dolar();
			dolar.toPeso(valor);
			break;

		default:
			break;
		}
	}
	
	public void toPeso(double valor) {
		Util.imprimir(valor, "Pesos");
	}
}
