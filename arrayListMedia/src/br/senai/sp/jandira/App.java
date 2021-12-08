package br.senai.sp.jandira;

public class App {

	public static void main(String[] args) {
		
		Media objMedia = new Media();
		objMedia.receberNotas();
		objMedia.exibirNotas();
		System.out.println("MÉDIA FINAL: " + objMedia.calcularMedia());
	}

}
