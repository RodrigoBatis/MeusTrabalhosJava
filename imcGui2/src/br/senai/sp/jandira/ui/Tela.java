package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {
	
	public void criarTela() {
		
		JFrame telaImc = new JFrame();
		telaImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaImc.setSize(600, 800);		
		telaImc.setTitle("Calculadora IMC");
		telaImc.setLayout(null);
		
		
		JLabel lblTitulo = new JLabel();
		lblTitulo.setText("Cálculo de IMC");
		lblTitulo.setFont(new Font("Serif", Font.BOLD, 40));
		lblTitulo.setForeground(Color.BLUE);
		lblTitulo.setBounds(30, 10, 300, 30);
		
		
		JLabel lblPeso = new JLabel();
		lblPeso.setText("Seu peso: ");
		lblPeso.setFont(new Font("Serif", Font.BOLD, 15));
		lblPeso.setBounds(30, 70, 110, 30);
		
		JTextField txtPeso = new JTextField();
		txtPeso.setBounds(120, 60, 110, 50);
		
		JLabel lblAltura = new JLabel();
		lblAltura.setText("Sua altura: ");
		lblAltura.setFont(new Font("Serif", Font.BOLD, 15));
		lblAltura.setBounds(30, 150, 100, 30);
		
		JTextField txtAltura = new JTextField();
		txtAltura.setBounds(120, 140, 110, 50);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setFont(new Font("Serif", Font.BOLD, 20));
		btnCalcular.setBackground(Color.LIGHT_GRAY);
		btnCalcular.setForeground(Color.BLACK);
		btnCalcular.setBounds(150, 260, 250, 70);
		
		JLabel lblResultado = new JLabel("Resultados: ");
		lblResultado.setFont(new Font("Serif", Font.BOLD, 25));
		lblResultado.setBounds(30, 360, 150, 30);
		
		JLabel lblValorImc = new JLabel("Valor IMC: ");
		lblValorImc.setFont(new Font("Serif", Font.BOLD, 15));
		lblValorImc.setBounds(30, 420, 110, 30);
		
		JTextField txtValorImc = new JTextField();
		txtValorImc.setBounds(150, 420, 200, 30);
		
		JLabel lblEstadoImc = new JLabel("Estado IMC: ");
		lblEstadoImc.setBounds(30, 460, 110, 30);
		
		JTextField txtEstadoImc = new JTextField();
		txtEstadoImc.setBounds(150, 460, 200, 30);
		
		telaImc.getContentPane().add(lblTitulo);
		telaImc.getContentPane().add(lblPeso);
		telaImc.getContentPane().add(txtPeso);
		telaImc.getContentPane().add(lblAltura);
		telaImc.getContentPane().add(txtAltura);
		telaImc.getContentPane().add(btnCalcular);
		telaImc.getContentPane().add(lblResultado);
		telaImc.getContentPane().add(lblValorImc);
		telaImc.getContentPane().add(txtValorImc);
		telaImc.getContentPane().add(lblEstadoImc);
		telaImc.getContentPane().add(txtEstadoImc);
		
		telaImc.setVisible(true);
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String peso = txtPeso.getText();
				String altura = txtAltura.getText();
				
				double valorPeso = Double.parseDouble(peso);
				double valorAltura = Double.parseDouble(altura);
				double resultado = valorPeso / (valorAltura * valorAltura);
											
				
				txtValorImc.setText(String.valueOf(resultado));
				
				
				if(resultado <= 18.5) {
					txtEstadoImc.setText("Abaixo do peso");
				}else if(resultado > 18.5 && resultado <=24.9) {
					txtEstadoImc.setText("Peso ideal (parabéns)");
				}else if(resultado > 25.0 && resultado <= 29.9) {
					txtEstadoImc.setText("Levemente acima do peso");
				}else if(resultado > 30.0 && resultado <= 34.9) {
					txtEstadoImc.setText("Obesidade grau 1");
				}else if(resultado > 35.0 && resultado <= 39.9) {
					txtEstadoImc.setText("Obesidade grau 2 (severa)");
				}else{
					txtEstadoImc.setText("Obesidade grau 3 (mórbida)");
				}
				
			}
		});
	}
}
