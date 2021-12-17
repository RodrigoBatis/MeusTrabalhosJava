package br.senai.sp.jandira.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senai.sp.jandira.model.Arquivo;
import br.senai.sp.jandira.model.Contato;
import br.senai.sp.jandira.model.DadosContatos;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaContato extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextField txtCidade;

	//Atributos de instancia de objetos
	private Arquivo objArquivo;
	private Contato objContato;
	private DadosContatos objDadosContato;
	private String caminho;
	
	public TelaContato() {
		
		// Criação dos objetos das classes
		
		objContato = new Contato();
		objArquivo = new Arquivo();
		objDadosContato = new DadosContatos();
		
		// Configura o caminho do arquivo
		caminho = "Z:\\Contato\\Contatos.txt";
		
		
		
		// Exibe o total de contatos cadastrados
		objDadosContato.listarContatos();
		System.out.println("TOTAL DE CONTATOS: " + objDadosContato.totalContatos());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Contatos:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(185, 11, 198, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBounds(25, 85, 70, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(25, 143, 70, 14);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelefone.setBounds(25, 192, 70, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setVerticalAlignment(SwingConstants.TOP);
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCidade.setBounds(25, 247, 70, 14);
		contentPane.add(lblCidade);
		
		txtNome = new JTextField();
		txtNome.setBounds(100, 83, 150, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(100, 190, 150, 20);
		contentPane.add(txtTelefone);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(100, 141, 150, 20);
		contentPane.add(txtEmail);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(100, 245, 150, 20);
		contentPane.add(txtCidade);
		
		JButton btnCadastar = new JButton("Cadastrar");
		btnCadastar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastar.setBounds(67, 316, 120, 40);
		contentPane.add(btnCadastar);
		
		JLabel lblNewLabel_1 = new JLabel("Total de Contatos:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(280, 85, 120, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblTotal = new JLabel("0000");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotal.setBounds(400, 85, 46, 14);
		contentPane.add(lblTotal);
		
		btnCadastar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				
				// Receber os dados digitados:
				objContato.setNome(txtNome.getText());
				objContato.setEmail(txtEmail.getText());
				objContato.setTelefone(txtTelefone.getText());
				objContato.setCidade(txtCidade.getText());
				
				ArrayList<Contato> contatos = new ArrayList<Contato>();
				objDadosContato = objArquivo.ler(caminho);
				contatos = objDadosContato.listarContatos();
				
				contatos.forEach(contato->{
					
					System.out.println("NOME: " + contato.getNome() + " E-MAIL: " + contato.getEmail() + " TELEFONE: " + contato.getTelefone() + " CIDADE: " + contato.getCidade());
					
				});
				
				
				objDadosContato.cadastrarContato(objContato);
				
				
				
				/*Tratando os dados para um arquivo de texto
				String texto = "";
				texto = objContato.getNome() + ";" +objContato.getEmail() + ";" + objContato.getTelefone() + ";" + objContato.getCidade();
				
				System.out.println(texto);*/
				
				//objArquivo.escrever(caminho, texto);
			}
		});
	}
}
