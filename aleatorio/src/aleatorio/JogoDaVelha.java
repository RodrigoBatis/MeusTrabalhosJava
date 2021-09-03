package aleatorio;

import java.util.Random;

public class JogoDaVelha {

	public static void main(String[] args) {
		
		Random sorteio = new Random();
		
		int valorSorteado = sorteio.nextInt(3) + 1;
		
		System.out.println(valorSorteado);
		
		

	}

}
