package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.senai.sp.jandira.model.Tabuada;



public class TelaTabuada {
	
	
	
	public void criarTela() {
		
		Font titulo = new Font("Arial", Font.BOLD, 40);
		Font label = new Font("Arial", Font.PLAIN, 20);
		Font botoes = new Font("Arial", Font.BOLD, 16);
		
		JFrame telaTabuada = new JFrame();
		telaTabuada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaTabuada.setSize(600, 600);
		telaTabuada.setTitle("Tabuada Legal");
		telaTabuada.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBounds(0, 0, 600, 100);
		header.setBackground(Color.WHITE);
		header.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Tabuada");
		lblTitulo.setBounds(10, 30, 300, 30);
		lblTitulo.setFont(titulo);
		lblTitulo.setForeground(Color.BLUE);
		
				
		header.add(lblTitulo);
		
		JPanel panelFormulario = new JPanel();
		panelFormulario.setBounds(10, 50, 340, 400);
		panelFormulario.setLayout(null);
		
		JLabel lblMultiplicando = new JLabel("Multiplicando:");
		lblMultiplicando.setBounds(20, 110, 200, 30);
		lblMultiplicando.setFont(label);
		lblMultiplicando.setHorizontalAlignment(SwingConstants.RIGHT);
		panelFormulario.add(lblMultiplicando);
		
		JLabel lblMultiplicador = new JLabel("Maximo multiplicador:");
		lblMultiplicador.setBounds(20, 170, 200, 30);
		lblMultiplicador.setFont(label);
		lblMultiplicador.setHorizontalAlignment(SwingConstants.RIGHT);
		panelFormulario.add(lblMultiplicador);
		
		JTextField txtmultiplicando = new JTextField();
		txtmultiplicando.setBounds(225, 110, 100, 30);
		panelFormulario.add(txtmultiplicando);
		
		JTextField txtMultiplicador = new JTextField();
		txtMultiplicador.setBounds(225, 170, 100, 30);
		panelFormulario.add(txtMultiplicador);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(20, 230, 305, 40);
		btnCalcular.setBackground(Color.GREEN);
		btnCalcular.setForeground(Color.WHITE);
		btnCalcular.setFont(botoes);
		panelFormulario.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(20, 290, 305, 40);
		btnLimpar.setBackground(Color.RED);
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setFont(botoes);
		panelFormulario.add(btnLimpar);
		
		
		JLabel lblresultado = new JLabel("Resultado:");
		lblresultado.setBounds(360, 120, 150, 30);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(360, 155, 200, 300);
		
		JList<String> listTabuada = new JList<String>();
		scroll.getViewport().add(listTabuada);
		
		DefaultListModel<String> tabuadaModel = new DefaultListModel<String>();
		listTabuada.setModel(tabuadaModel);
		
		telaTabuada.getContentPane().add(lblresultado);		
		telaTabuada.getContentPane().add(header);
		telaTabuada.getContentPane().add(panelFormulario);
		telaTabuada.getContentPane().add(scroll);
						
		
		telaTabuada.setVisible(true);
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				int multiplicado = Integer.parseInt(txtmultiplicando.getText());
				int multiplicador = Integer.parseInt(txtMultiplicador.getText());
				
								
				Tabuada novaTabuada = new Tabuada();
				
				novaTabuada.setMultiplicado(multiplicado);
				novaTabuada.setMultiplicadorMaximo(multiplicador);
				
				String[] resultadoTabuada = novaTabuada.calcular();
				
				
				for(int i = 0; i < resultadoTabuada.length; i++) {
					tabuadaModel.addElement(resultadoTabuada[i]);
				}
				
				listTabuada.setModel(tabuadaModel);
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtmultiplicando.setText(null);
				txtMultiplicador.setText(null);
				txtmultiplicando.requestFocus();
				
				tabuadaModel.clear();
				
			}
		});
	}
	
}
