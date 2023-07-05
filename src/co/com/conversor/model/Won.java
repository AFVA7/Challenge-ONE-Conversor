package co.com.conversor.model;

public class Won {
	
	public void toWon(double valor) {
		// TODO Auto-generated method stub
		double wonRespectoAlPeso = 3.21;
		double cambio = valor / wonRespectoAlPeso;
		Util.imprimir(cambio, "Wones Surcoreanos");

	}

}
