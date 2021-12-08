package br.senai.sp.jandira;

import java.util.ArrayList;
import java.util.Scanner;

public class Media {
	
	Scanner sc;
	ArrayList<Double> arrNotas = new ArrayList<Double>();
	
	double soma;
	double media;
	int contNota;
	
	public Media() {
		
		sc = new Scanner(System.in);
		
		/*arrNotas.add(10.0);
		arrNotas.add(5.5);
		arrNotas.add(8.9);
		arrNotas.add(2.5);*/
	}
	
	public void receberNotas() {
		
		System.out.print("DIGITE UMA NOTA 0U -1 PARA ENCERRAR " );
		
		while (sc.nextDouble() >= 0) {
			
			arrNotas.add(sc.nextDouble());
			System.out.print("DIGITE A " + contNota + " NOTA: " );
			contNota++;
			
		}
		
	} 
	
	public void exibirNotas() {
		
		for (int i = 0; i < arrNotas.size(); i++) {
			
			System.out.println("NOTA: " + (i + 1) + " - " + arrNotas.get(i));
		}
		
	}
	
	public double calcularMedia() {
	
		
		
		arrNotas.forEach(nota->{
			
			soma += nota;
			
		});
		
		media = soma / contNota;
		
		return media;
	}
	
}
