package calculos;

public class Matematica {

	public int a;
	public int b;
	public int resultado;
	
	public void somar() {
		resultado = a + b;
		System.out.println(resultado);
		
		subtrair();
	}
	
	public void dividir() {
		resultado = a / b;
		System.out.println(resultado);
	}
	
	public void multiplicar() {
		resultado = a * b;
		System.out.println(resultado);
	}
	
	public void subtrair() {
		resultado = a - b;
		System.out.println(resultado);
	}
	
	
}
