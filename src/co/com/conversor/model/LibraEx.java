package co.com.conversor.model;

public class LibraEx {
	
	public void toLibra(double valor) {
		// TODO Auto-generated method stub
		double libraRespectoAlPeso = 5000;
		double cambio = valor / libraRespectoAlPeso;
		Util.imprimir(cambio, "Libras Esterlinas");

	}

}
