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
	String input;
	double valor;

	public static void terminar() {
		JOptionPane.showMessageDialog(null, "Programa terminado");
	}

	public void empezar() {

		opcion = (JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE, null, opciones, op1))
				.toString();

		if (opcion.equals(op1)) {
			valor = capturarCantidad("Ingresa la cantidad que deseas convertir");
			divisa.convertir(valor);
		} else {
			valor = capturarCantidad("Ingresa el valor de la temperatura que desea convertir");
			temperatura.convertirTemperatura(valor);
		}
	}

	private double capturarCantidad(String msg) {
		while (true) {
			input = JOptionPane.showInputDialog(msg);
			if(input==null) {
				empezar();
			}
			if (input.equals("")) {
				JOptionPane.showMessageDialog(null, "Ingresa un valor.");
				capturarCantidad(msg);
			}
			try {
				valor = Double.parseDouble(input);
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Ingresa un valor numérico válido.");
			}
		}
		return valor;
	}
}
