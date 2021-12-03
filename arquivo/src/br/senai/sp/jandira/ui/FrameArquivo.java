package br.senai.sp.jandira.ui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senai.sp.jandira.arquivo.Arquivo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

public class FrameArquivo extends JFrame {

	private JPanel contentPane;
	private Arquivo arquivo = null;
	private String caminho = "";
	

	public FrameArquivo() {
		
		this.arquivo = new Arquivo();
		this.caminho = "Z:\\\\ArquivoCristiano\\\\NovoArquivo.txt";
		
		setTitle("Arquivo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArquivo = new JLabel("Manipulação de Arquivo");
		lblArquivo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblArquivo.setBounds(10, 0, 190, 25);
		contentPane.add(lblArquivo);
		
		JLabel lblTexto = new JLabel("Texto");
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTexto.setBounds(10, 31, 70, 14);
		contentPane.add(lblTexto);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 56, 414, 144);
		contentPane.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		textPane.setBackground(Color.WHITE);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(new Color(204, 255, 255));
		btnGuardar.setBounds(10, 211, 89, 39);
		contentPane.add(btnGuardar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(new Color(204, 255, 255));
		btnLimpar.setBounds(140, 211, 89, 39);
		contentPane.add(btnLimpar);
		
		btnGuardar.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String conteudoArquivo = arquivo.ler(caminho);
				String texto = conteudoArquivo + "\n" + textPane.getText();
				
				if(arquivo.escrever(caminho, texto)) {
					// mensagem sucesso
					JOptionPane.showMessageDialog(null, "DADO GRAVADO COM SUCESSO!!", "Gravado com sucesso" , JOptionPane.INFORMATION_MESSAGE);
					textPane.setText("");
				}else {
					// mensagem erro
					JOptionPane.showMessageDialog(null, "ERRO A GRAVAR", "Erro não gravado" , JOptionPane.INFORMATION_MESSAGE);
					textPane.setText("");
				}
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textPane.setText(null);
				
			}
		});
	}
}
