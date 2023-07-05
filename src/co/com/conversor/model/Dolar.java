package co.com.conversor.model;


public class Dolar extends Divisa{
	public static double dolarRespectoAlPeso = 4000;

	public void toDolar(double valor) {
		// TODO Auto-generated method stub
		
		double cambio = valor/dolarRespectoAlPeso;
		Util.imprimir(cambio, "Dólares");

	}
	
	@Override
	public void toPeso(double valor) {
		double cambio = valor*dolarRespectoAlPeso;
		super.toPeso(cambio);
	}

}
