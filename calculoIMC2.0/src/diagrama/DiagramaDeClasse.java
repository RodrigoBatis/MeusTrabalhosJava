package diagrama;

public class DiagramaDeClasse {

	public int peso;
	public double altura;
	public String status;
	public double resultado = peso / (altura * altura);
	
	public void calculoImc() {
		System.out.println("Seu IMC é: " + resultado);
	}
	
	public void status() {
		
	}
}
