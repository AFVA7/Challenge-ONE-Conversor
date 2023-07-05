package co.com.conversor.model;

import javax.swing.JOptionPane;

public class Util {
	public static void imprimir(double valor, String divisa) {
		// TODO Auto-generated method stub
		System.out.println(valor);
		double valorRedondeado = Math.round(valor*100);
		valorRedondeado/=100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + valorRedondeado + " " + divisa);

	}
}
