package br.senai.sp.jandira.ui;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Aluno;
import br.senai.sp.jandira.model.Periodo;
import br.senai.sp.jandira.repository.AlunoRepository;

public class FrameCadastroAlunos extends JFrame {

	private JPanel contentPane;
	private JTextField txtMatricula;
	private JTextField txtNome;
	
	private int posicao;


	public FrameCadastroAlunos() {
		setTitle("Cadastro de alunos"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Matricula:");
		lblNewLabel.setBounds(10, 30, 61, 14);
		contentPane.add(lblNewLabel);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(84, 27, 86, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 71, 61, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(84, 68, 120, 20);
		contentPane.add(txtNome);
		
		JLabel lblPeriodo = new JLabel("Periodo:");
		lblPeriodo.setBounds(10, 107, 61, 14);
		contentPane.add(lblPeriodo);
		
		JComboBox comboPeriodo = new JComboBox();
		
		DefaultComboBoxModel<String> comboModelPeriodo = 
				new DefaultComboBoxModel<String>();
		
		for (Periodo descricao : Periodo.values()) {
			comboModelPeriodo.addElement(descricao.getDescricao());
		}
		
		//comboPeriodo.setModel(new DefaultComboBoxModel(Periodo.values()));
		
		comboPeriodo.setModel(comboModelPeriodo);
		comboPeriodo.setBounds(84, 103, 86, 18);
		contentPane.add(comboPeriodo);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(84, 154, 120, 48);
		contentPane.add(btnSalvar);
		
		JButton btnMostrarAlunos = new JButton("Exibir Alunos");
		btnMostrarAlunos.setBounds(84, 216, 120, 23);
		contentPane.add(btnMostrarAlunos);
		
		JLabel lblListaDeAluno = new JLabel("Lista dos alunos:");
		lblListaDeAluno.setBounds(223, 30, 96, 14);
		contentPane.add(lblListaDeAluno);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(223, 55, 188, 184);
		contentPane.add(scrollPane);
		
		JList listAlunos = new JList();
		scrollPane.setViewportView(listAlunos);
		
		
		// criar o model qua vai exibir os alunos na Jlist
		DefaultListModel<String> modelAlunos =
				new DefaultListModel<String>();
		
		//Definir o modelAlunos como o model do nosso Jlist
		listAlunos.setModel(modelAlunos);
		
		
		//Criar uma turma que é um repositorio de alunos
		AlunoRepository turma = new AlunoRepository(3);
		
		//Vamos colocar um listener no botão
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Aluno aluno = new Aluno();
				aluno.setNome(txtNome.getText());
				aluno.setMatricula(txtMatricula.getText());
				
				// definir horario que o aluno estuda 
				
				aluno.setPeriodo(determinarPeriodo(comboPeriodo.getSelectedIndex()));
				
				turma.gravar(aluno, posicao);
				
				posicao++;
				
				// adicionar 
				modelAlunos.addElement(aluno.getNome());
			 
				if(posicao == turma.getTamanho()) {
					btnSalvar.setEnabled(false);
					JOptionPane.showMessageDialog(null, "Essa turma criada já está cheia", "Cheio", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		
		btnMostrarAlunos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				for (Aluno aluno : turma.listarTodos()) {
					System.out.println(aluno.getMatricula());
					System.out.println(aluno.getNome());
					System.out.println(aluno.getPeriodo().getDescricao());
					System.out.println("------------------------");
				}
				
			}
		});
		
		listAlunos.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				Aluno aluno = turma.listarAluno(listAlunos.getSelectedIndex());
				txtMatricula.setText(aluno.getMatricula());
				txtNome.setText(aluno.getNome());
				comboPeriodo.setSelectedIndex(aluno.getPeriodo().ordinal());
				
			}
		});
	}
	
	
	private Periodo determinarPeriodo(int periodoSelecionado) {
		
		if(periodoSelecionado == 0) {
			return Periodo.MANHA;
		} else if(periodoSelecionado == 1) {
			return Periodo.TARDE;
		}else if(periodoSelecionado == 2) {
			return Periodo.NOITE;
		}else if(periodoSelecionado == 3) {
			return Periodo.SABADO;
		}else {
			return Periodo.ONLINE;
		}
	}
	
}
