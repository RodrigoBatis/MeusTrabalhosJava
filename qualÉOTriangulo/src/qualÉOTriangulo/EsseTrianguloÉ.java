package qual…OTriangulo;

import java.util.Scanner;

public class EsseTriangulo… {

	public static void main(String[] args) {
		
		double l1, l2, l3;
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Qual o primeiro lado: ");
		l1 = ler.nextDouble();
		
		System.out.print("Qual o segundo lado: ");
		l2 = ler.nextDouble();

		System.out.print("Qual o terceiro lado: ");
		l3 = ler.nextDouble();
		
		ler.close();
		
		// determine qual È o triangulo ou se n„o È um triangulo
		
		if (l1 + l2 < l3 && l1 + l3 < l2 && l2 + l3 < l1 ){
			System.out.println("Isso n„o È um tri‚ngulo");
		}else if (l1 == l2 && l1 == l3 && l2 == l3) {
			System.out.println("… um tri‚ngulo Equilatero");
		}else if (l1 != l2 && l1 != l3 && l2 != l3) {
			System.out.println("… um tri‚ngolo Escaleno");
		}else {
			System.out.println("… um tri‚ngulo IsÛsceles");
		}
		
		
		}
	}


