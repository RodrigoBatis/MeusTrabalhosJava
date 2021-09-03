package multiplosDe4;

public class MultiplosDe4 {

	public static void main(String[] args) {
		
		int repeticao = 100;
		int contador = 0;
		
		while (contador <= repeticao) {
			if (contador % 4 == 0) {	
				System.out.println(contador);
			}
			contador++;
		}
		
	}

}
