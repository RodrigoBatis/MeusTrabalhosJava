package parOuImpar;


public class ParOuImpar {

	public static void main(String[] args) {
		
		int numeroRepeticao = 100;
		int contacao = 0;
		
		while (contacao <= numeroRepeticao) {
			
		if (contacao % 2 == 0) {
			System.out.println(contacao + " é par ");
		}else {
			System.out.println(contacao + " é impar ");
		}
		contacao = contacao + 1;
		
		}
		

	}

}
