package calculoDeImc;

public class Imc {

	public static void main(String[] args) {
		
		double alt = 1.90;
		double pes = 89;
		double calc = pes / (alt * alt);
		
		System.out.print("O seu I.M.C �: " + calc);


	}

}
