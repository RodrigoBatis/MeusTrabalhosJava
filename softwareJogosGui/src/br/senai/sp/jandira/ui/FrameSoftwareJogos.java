package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import br.senai.sp.jandira.model.Console;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Rectangle;

public class FrameSoftwareJogos extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtValor;
	private JTextField txtObservacao;
	private JTextField textField;

	public FrameSoftwareJogos() {
		setBackground(new Color(0, 0, 204));
		setTitle("Software para gest\u00E3o de Jogos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloJogo = new JLabel("T\u00EDtulo do Jogo:");
		lblTituloJogo.setBounds(27, 41, 71, 14);
		contentPane.add(lblTituloJogo);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(120, 38, 150, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setBounds(43, 90, 55, 14);
		contentPane.add(lblFabricante);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Zera");
		chckbxNewCheckBox.setBounds(120, 114, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setBounds(52, 148, 46, 14);
		contentPane.add(lblConsole);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Console.values()));
		comboBox.setBounds(120, 144, 150, 22);
		contentPane.add(comboBox);
		
		JLabel lblValor = new JLabel("Valor Estimado:");
		lblValor.setBounds(27, 187, 83, 14);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setBounds(120, 184, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblObservacao = new JLabel("Observa\u00E7\u00F5es:");
		lblObservacao.setBounds(27, 228, 71, 14);
		contentPane.add(lblObservacao);
		
		txtObservacao = new JTextField();
		txtObservacao.setBackground(new Color(255, 255, 255));
		txtObservacao.setBounds(120, 225, 150, 64);
		contentPane.add(txtObservacao);
		txtObservacao.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(0, 0, 0));
		btnSalvar.setForeground(new Color(0, 0, 0));
		btnSalvar.setBounds(55, 327, 89, 23);
		contentPane.add(btnSalvar);
		
		JLabel lblMeusJogos = new JLabel("Meus Jogos:");
		lblMeusJogos.setBounds(301, 11, 76, 14);
		contentPane.add(lblMeusJogos);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(301, 38, 223, 251);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setBounds(120, 86, 150, 22);
		contentPane.add(comboBox_1);
		
		JButton btnVoltar = new JButton("<");
		btnVoltar.setBackground(new Color(0, 0, 0));
		btnVoltar.setBounds(317, 327, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnProximo = new JButton(">");
		btnProximo.setBounds(413, 327, 89, 23);
		contentPane.add(btnProximo);
	}
}
