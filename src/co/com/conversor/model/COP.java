package co.com.conversor.model;


public class COP extends Divisa {

	public void toPeso(double valor) {
		// TODO Auto-generated method stub
		double dolarRespectoAlPeso = Dolar.dolarRespectoAlPeso;
		double cambio = valor*dolarRespectoAlPeso;
		Util.imprimir(cambio, "Pesos");

	}

}
