package aplicativo;

import calculos.Matematica;

public class Calculadora {

	public static void main(String[] args) {
		
		Matematica calculo = new Matematica();
		Matematica calculo2 = new Matematica();
		
		calculo.a = 5;
		calculo.b = 8;
		
		calculo.somar();
		calculo.subtrair();
		
		
		/*calculo2.a = 25;
		calculo2.b = 10;
		calculo2.somar();*/
		
		System.out.println("Voltei !!");
		
		
	}

}
