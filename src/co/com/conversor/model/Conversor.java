package co.com.conversor.model;

import javax.swing.JOptionPane;

public class Conversor {

	String op1 = "Conversor de Moneda";
	String op2 = "Conversor de Temperatura";
	String msg = "Seleccione una opción de conversión";
	String titulo = "Menú";
	String[] opciones = { op1, op2 };
	Divisa divisa = new Divisa();
	private String opcion;
	Temperatura temperatura = new Temperatura();
	int numero;

	public void empezar(){
		try {
			opcion = (JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE, null, opciones, op1))
					.toString();
			if (opcion.equals(op1)) {
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad que deseas convertir"));
				divisa.convertir(valor);
			} else {
				JOptionPane.showInputDialog("Ingresa el valor de la temperatura que desea convertir");
				temperatura.convertirTemperatura();
			}
		} catch (Exception e) {
			
		}
		
		
	}
}
