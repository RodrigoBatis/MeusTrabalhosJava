package br.senai.sp.jandira.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {

	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setSize(600, 800);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Nome do App");
		tela.setLayout(null);
		
		// Criar um label
		JLabel lblNome = new JLabel("Como você se chama?");
		lblNome.setBounds(10, 10, 150, 30);
		
		
		// criar um TextField 
		JTextField txtNome = new JTextField();
		txtNome.setBounds(10 , 45, 100, 30);
		
		// criar um botão
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(115, 45, 80, 30);
		
		// criar um label
		JLabel lblCumprimento = new JLabel("");
		lblCumprimento.setBounds(10, 80, 150, 30);
		
		// colocar o label na tela
		tela.getContentPane().add(lblCumprimento);
		tela.getContentPane().add(lblNome);
		tela.getContentPane().add(btnOk);
		tela.getContentPane().add(txtNome);
		
		tela.setVisible(true);
		
		// Eventos de button
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				
				//lblCumprimento.setText("Olá, " + nome + " !!");
				
				int valor = Integer.parseInt(nome);
				int resultado = valor * 15;
				
				lblCumprimento.setText(String.valueOf(resultado));
			}
		});
		
		
	}
}
