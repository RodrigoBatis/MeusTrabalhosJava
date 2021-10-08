
public class TesteArray {

	public static void main(String[] args) {
		
		int notas[] = new int[4]; 
		
		notas[0] = 8;
		notas[1] = 7;
		notas[2] = 10;
		notas[3] = 6;
				
		System.out.println(notas[2] + notas[0]);
		System.out.println(notas[3]);
		notas[3] = 9;
		System.out.println(notas[3]);
		
		System.out.println("-------------------------");
		
		String linguagens[] = new String[10];
		
		linguagens[0] = "Java";
		linguagens[1] = "C#";
		linguagens[2] = "PHP";
		linguagens[3] = "Ruby";
		linguagens[4] = "Kotlin";
		linguagens[5] = "Pascal";
		linguagens[6] = "Cobol";
		linguagens[7] = "Fortran";
		linguagens[8] = "JavaScript";
		linguagens[9] = "Objective-c";
		
		System.out.println(linguagens.length);
		
		int i = 0;
		
		while (i < linguagens.length) {
			System.out.println(linguagens[i]);
			i++;
		}
		
		System.out.println("--------------------------");
		
		for (int contador = 0; contador < linguagens.length; contador++) {
			System.out.println(linguagens[contador]);
		}
	}

}
