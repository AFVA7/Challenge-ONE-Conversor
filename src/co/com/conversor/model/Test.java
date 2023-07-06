package co.com.conversor.model;

import javax.swing.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		Conversor conversor = new Conversor();

		do {
			try {
				conversor.empezar();
			} catch (Exception e) {
				break;
			}
			numero = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		} while (numero == 0);

		Conversor.terminar();
		

	}
}
