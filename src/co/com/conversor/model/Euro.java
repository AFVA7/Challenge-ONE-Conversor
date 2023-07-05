package co.com.conversor.model;

public class Euro {
	public void toEuro(double valor) {
		// TODO Auto-generated method stub
		double euroRespectoAlPeso = 4500;
		double cambio = valor / euroRespectoAlPeso;
		Util.imprimir(cambio, "Euros");

	}

}
