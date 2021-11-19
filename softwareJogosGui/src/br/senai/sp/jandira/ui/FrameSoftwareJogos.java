package br.senai.sp.jandira.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Jogo;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JScrollPane;


public class FrameSoftwareJogos extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtValor;
	private JTextField txtObservacao;

	public FrameSoftwareJogos() {
		setBackground(new Color(0, 0, 204));
		setTitle("Software para gestão de Jogos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloJogo = new JLabel("Titulo do Jogo:");
		lblTituloJogo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblTituloJogo.setBounds(10, 91, 100, 14);
		contentPane.add(lblTituloJogo);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(120, 88, 150, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblFabricante.setBounds(43, 140, 67, 14);
		contentPane.add(lblFabricante);
		
		JCheckBox chckbxZerado = new JCheckBox("Zerado");
		chckbxZerado.setBackground(new Color(255, 255, 255));
		chckbxZerado.setFont(new Font("Arial Black", Font.PLAIN, 11));
		chckbxZerado.setBounds(120, 164, 97, 23);
		contentPane.add(chckbxZerado);
		
		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblConsole.setBounds(52, 198, 58, 14);
		contentPane.add(lblConsole);
		
		JComboBox comboConsole = new JComboBox();
		
		DefaultComboBoxModel<String> ComboModelConsole =
				new DefaultComboBoxModel<String>();
		
		for (Console descricao : Console.values()) {
			ComboModelConsole.addElement(descricao.getDescricao());
		}
		
		
		comboConsole.setModel(ComboModelConsole);
		comboConsole.setBounds(120, 194, 150, 22);
		contentPane.add(comboConsole);
		
		JLabel lblValor = new JLabel("Valor Estimado:");
		lblValor.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblValor.setBounds(10, 237, 100, 14);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setBounds(120, 234, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblObservacao = new JLabel("Observações:");
		lblObservacao.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblObservacao.setBounds(27, 278, 83, 14);
		contentPane.add(lblObservacao);
		
		txtObservacao = new JTextField();
		txtObservacao.setBackground(new Color(255, 255, 255));
		txtObservacao.setBounds(120, 275, 150, 64);
		contentPane.add(txtObservacao);
		txtObservacao.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalvar.setBackground(new Color(51, 51, 255));
		btnSalvar.setForeground(new Color(255, 255, 255));
		btnSalvar.setBounds(55, 350, 89, 50);
		contentPane.add(btnSalvar);
		
		JLabel lblMeusJogos = new JLabel("Meus Jogos:");
		lblMeusJogos.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblMeusJogos.setBounds(301, 61, 108, 18);
		contentPane.add(lblMeusJogos);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setBounds(120, 136, 150, 22);
		contentPane.add(comboBox_1);
		
		JButton btnVoltar = new JButton("<");
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBackground(new Color(0, 51, 255));
		btnVoltar.setBounds(317, 350, 89, 50);
		contentPane.add(btnVoltar);
		
		JButton btnProximo = new JButton(">");
		btnProximo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnProximo.setForeground(new Color(255, 255, 255));
		btnProximo.setBackground(new Color(0, 51, 255));
		btnProximo.setBounds(413, 350, 89, 50);
		contentPane.add(btnProximo);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 255));
		panel.setBounds(0, 0, 534, 56);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FrameSoftwareJogos.class.getResource("/br/senai/sp/jandira/ui/img/controle-de-jogo.png")));
		lblNewLabel.setBounds(102, 0, 39, 56);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(FrameSoftwareJogos.class.getResource("/br/senai/sp/jandira/ui/img/controle-de-jogo.png")));
		lblNewLabel_1.setBounds(396, 0, 33, 56);
		panel.add(lblNewLabel_1);
		
		JTextPane txtColeçãoJogos = new JTextPane();
		txtColeçãoJogos.setEditable(false);
		txtColeçãoJogos.setForeground(Color.RED);
		txtColeçãoJogos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtColeçãoJogos.setBackground(new Color(51, 102, 255));
		txtColeçãoJogos.setText("Coleção de jogos");
		txtColeçãoJogos.setBounds(151, 0, 237, 56);
		panel.add(txtColeçãoJogos);
		
		JList list = new JList();
		list.setBounds(301, 90, 223, 249);
		contentPane.add(list);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(301, 91, 223, 249);
		contentPane.add(scrollPane);
		
		JLabel lblFundo = new JLabel("New label");
		lblFundo.setIcon(new ImageIcon(FrameSoftwareJogos.class.getResource("/br/senai/sp/jandira/ui/img/imagem-fundo.jpg")));
		lblFundo.setBounds(0, 0, 534, 427);
		contentPane.add(lblFundo);
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Jogo jogo = new Jogo();
				jogo.setTitulo(txtTitulo.getText());
				jogo.setObservacao(txtObservacao.getText());
				
				
			}
		});
	}
}
