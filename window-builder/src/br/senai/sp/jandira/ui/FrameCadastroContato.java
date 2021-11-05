package br.senai.sp.jandira.ui;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class FrameCadastroContato extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtNascimento;
	private final ButtonGroup Sexo = new ButtonGroup();


	/**
	 * Create the frame.
	 */
	public FrameCadastroContato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			System.out.println("Cliquei no botão!!");
				
			}
		});
		btnSalvar.setBounds(10, 261, 284, 41);
		contentPane.add(btnSalvar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(new Color(139, 0, 0));
		lblNome.setBounds(10, 63, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 78, 217, 17);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(139, 0, 0));
		lblEmail.setBounds(10, 103, 46, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(10, 121, 217, 17);
		contentPane.add(txtEmail);
		
		JLabel lblTelefone = new JLabel("telefone: ");
		lblTelefone.setForeground(new Color(139, 0, 0));
		lblTelefone.setBounds(10, 146, 67, 14);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(10, 164, 113, 17);
		contentPane.add(txtTelefone);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setForeground(new Color(139, 0, 0));
		lblCidade.setBounds(181, 149, 46, 14);
		contentPane.add(lblCidade);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 139));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Barueri", "Carapicuiba", "Itapevi", "Jandira", "Osasco"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(181, 162, 113, 23);
		contentPane.add(comboBox);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setForeground(new Color(139, 0, 0));
		lblSexo.setBounds(10, 201, 46, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rdbtnMan = new JRadioButton("Man");
		rdbtnMan.setForeground(new Color(0, 0, 139));
		Sexo.add(rdbtnMan);
		rdbtnMan.setBounds(10, 222, 54, 23);
		contentPane.add(rdbtnMan);
		
		JRadioButton rdbtnFem = new JRadioButton("Fem");
		rdbtnFem.setForeground(new Color(0, 0, 139));
		Sexo.add(rdbtnFem);
		rdbtnFem.setBounds(59, 222, 54, 23);
		contentPane.add(rdbtnFem);
		
		JLabel lblNascimento = new JLabel("Data de nascimento:");
		lblNascimento.setForeground(new Color(139, 0, 0));
		lblNascimento.setBounds(181, 196, 103, 14);
		contentPane.add(lblNascimento);
		
		txtNascimento = new JTextField();
		txtNascimento.setBounds(183, 211, 111, 20);
		contentPane.add(txtNascimento);
		txtNascimento.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 304, 52);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contatos:");
		lblNewLabel.setForeground(new Color(255, 51, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(10, 11, 140, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(FrameCadastroContato.class.getResource("/imagem/contato.png")));
		lblNewLabel_1.setBounds(260, 0, 44, 52);
		panel.add(lblNewLabel_1);
	}
}
