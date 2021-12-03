package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JButton;

public class FrameArquivo extends JFrame {

	private JPanel contentPane;


	public FrameArquivo() {
		setTitle("Arquivo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArquivo = new JLabel("Arquivo");
		lblArquivo.setBounds(10, 11, 46, 14);
		contentPane.add(lblArquivo);
		
		JLabel lblTexto = new JLabel("Texto");
		lblTexto.setBounds(10, 31, 46, 14);
		contentPane.add(lblTexto);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 56, 414, 144);
		contentPane.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		textPane.setBackground(Color.WHITE);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(Color.CYAN);
		btnGuardar.setBounds(10, 211, 89, 39);
		contentPane.add(btnGuardar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(Color.CYAN);
		btnLimpar.setBounds(140, 211, 89, 39);
		contentPane.add(btnLimpar);
		
		btnGuardar.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
