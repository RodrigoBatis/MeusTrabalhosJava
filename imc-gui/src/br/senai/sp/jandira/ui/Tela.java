package br.senai.sp.jandira.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
		
		// Criar um label
		JLabel lblIdade = new JLabel();
		lblIdade.setText("Qual a sua idade?");
		lblIdade.setBounds(20, 10, 110, 30);
		
		// criar um botão
		JButton btnVerificar = new JButton();
		btnVerificar.setText("Verificar idade");
		btnVerificar.setBounds(140, 45, 140, 30);
		
		// criar um TextField 
		JTextField txtIdade = new JTextField();
		txtIdade.setBounds(20, 45, 110, 30);
		
		JLabel lblResultado = new JLabel("Resultado aparecera aqui 8888888888888888888888888888888");
		lblResultado.setBounds(20, 60, 260, 70); 
		
		// colocar o label na tela
		telaImc.getContentPane().add(lblIdade);
		telaImc.getContentPane().add(btnVerificar);
		telaImc.getContentPane().add(txtIdade);
		telaImc.getContentPane().add(lblResultado);
		
		telaImc.setVisible(true);
		
		// Definir ouvinte (listener) de click de mouse
		txtIdade.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Soltou!!");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Apertou!!");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("Saiu!!");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Entrou!!");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		txtIdade.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("Tecla digitada!");
				System.out.println(e.getKeyChar());
				System.out.println(e.getKeyCode());
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Tecla solta!");
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("Tecla segurada!");
				
			}
		});
		
		
	}
	
}
