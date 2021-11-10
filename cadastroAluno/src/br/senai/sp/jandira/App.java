package br.senai.sp.jandira;


import br.senai.sp.jandira.ui.FrameCadastroAlunos;

public class App {

	public static void main(String[] args) {
		
		
		FrameCadastroAlunos frame = new FrameCadastroAlunos();
		frame.setVisible(true);
		
		/*AlunoRepository turma = new AlunoRepository(6);
		
		Aluno a = new Aluno();
		a.setNome("Pedro");
		turma.gravar(a, 0);
		
		Aluno b = new Aluno();
		b.setNome("Ana");
		turma.gravar(b, 1);
		
		Aluno c = new Aluno();
		c.setNome("Luiza");
		turma.gravar(c, 2);
		
		Aluno d = new Aluno();
		d.setNome("João");
		turma.gravar(d, 3);
		
		Aluno e = new Aluno();
		e.setNome("Maria");
		turma.gravar(e, 4);
		
		Aluno f = new Aluno();
		f.setNome("Rodrigo");
		turma.gravar(f, 5);
		
		for (Aluno alunoAtual : turma.listarTodos()) {
			System.out.println(alunoAtual.getNome());
		}*/
	}

}
