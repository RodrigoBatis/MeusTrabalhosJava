import java.util.Scanner;

public class EscolhaCores {

	public static void main(String[] args) {
		
		String cores[] = new String[10];
		
		cores[0] = "Azul";
		cores[1] = "Amarelo";
		cores[2] = "Vermelho";
		cores[3] = "Roxo";
		cores[4] = "Preto";
		cores[5] = "Verde";
		cores[6] = "Cinza";
		cores[7] = "Branco";
		cores[8] = "Laranja";
		cores[9] = "Lilás";
		
		Scanner ler = new Scanner(System.in);
		
		String escolhaUsuario = "";
		boolean encontrei = false;
		
		System.out.print("Escolha uma Cor: ");
		escolhaUsuario = ler.next();
		
		ler.close();
		
		for (int i = 0; i < cores.length; i++) {
			if ( escolhaUsuario.equalsIgnoreCase(cores[i])) {
				System.out.println("A cor está na lista!!!");
				encontrei = true;
				break;
			}
		}
		
		if (encontrei == false) {
			System.out.println("A cor NÂO está na lista");
		}
	}

}
