package co.com.conversor.model;

public class Yen {
	
	public void toYen(double valor) {
		// TODO Auto-generated method stub
		double yenRespectoAlPeso = 28.79;
		double cambio = valor / yenRespectoAlPeso;
		Util.imprimir(cambio, "Yenes");

	}

}
