package co.com.conversor.model;

import javax.swing.JOptionPane;

public class Test2 {
	public static void main(String[] args) {

		String input = "";

		while (true) {
			input = JOptionPane.showInputDialog(null, "Ingresa un número:");

			// Verificar si el usuario ha ingresado un valor
			if (input == null) {
				// El usuario ha presionado Cancelar o Cerrar
				System.exit(0);
			}

			// Validar si el valor ingresado es numérico
			try {
				double numero = Double.parseDouble(input);
				// El valor ingresado es válido, se puede salir del bucle
				break;
			} catch (NumberFormatException e) {
				// El valor ingresado no es numérico, mostrar mensaje de error
				JOptionPane.showMessageDialog(null, "Ingresa un valor numérico válido.");
			}
		}

		// Aquí puedes continuar con el código después de validar la entrada numérica
		// ...
	}
}
 