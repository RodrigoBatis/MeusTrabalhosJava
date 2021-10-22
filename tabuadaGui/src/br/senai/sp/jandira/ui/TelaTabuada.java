package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

public class TelaTabuada {
	
	Tabuada Novatabuada = new Tabuada();
	
	public void criarTela() {
		
		JFrame telaTabuada = new JFrame();
		telaTabuada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaTabuada.setSize(600, 600);
		telaTabuada.setTitle("Tabuada");
		telaTabuada.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Tabuada");
		lblTitulo.setFont(new Font("Serif", Font.BOLD, 30));
		lblTitulo.setForeground(Color.BLUE);
		lblTitulo.setBounds(40, 20, 200, 30);
		
		JLabel lblMultiplicando = new JLabel("Multiplicando"); 
		lblMultiplicando.setBounds(70, 70, 100, 30);
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(175, 65, 75, 40);
		
		JLabel lblMultiplicador = new JLabel(" Máximo multiplicador ");
		lblMultiplicador.setBounds(40, 150 , 130, 30);
		
		JTextField txtMultiplicador = new JTextField();
		txtMultiplicador.setBounds(175, 145, 75, 40);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Serif", Font.BOLD, 20));
		lblResultado.setForeground(Color.BLUE);
		lblResultado.setBounds(270, 65, 100, 30);
		
		JTextField txtResultado = new JTextField();
		txtResultado.setBounds(270, 100, 300, 270);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Serif", Font.BOLD, 30));
		btnCalcular.setBackground(Color.GREEN);
		btnCalcular.setForeground(Color.WHITE);
		btnCalcular.setBounds(40, 250, 210, 50);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Serif", Font.BOLD, 30));
		btnLimpar.setBackground(Color.RED);
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setBounds(40, 320, 210, 50);
		
		telaTabuada.getContentPane().add(lblTitulo);
		telaTabuada.getContentPane().add(lblMultiplicando);
		telaTabuada.getContentPane().add(txtMultiplicando);
		telaTabuada.getContentPane().add(lblMultiplicador);
		telaTabuada.getContentPane().add(txtMultiplicador);
		telaTabuada.getContentPane().add(lblResultado);
		telaTabuada.getContentPane().add(txtResultado);
		telaTabuada.getContentPane().add(btnCalcular);
		telaTabuada.getContentPane().add(btnLimpar);
		
		telaTabuada.setVisible(true);
	}
	
}
