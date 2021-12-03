package br.senai.sp.jandira.arquivo;

import br.senai.sp.jandira.ui.FrameArquivo;

public class App {

	public static void main(String[] args) {
		
		FrameArquivo tela = new FrameArquivo();
		tela.setVisible(true);
		
		String caminho = "C:\\Users\\21276392\\Desktop\\testeFelas\\aula.txt";
		String conteudo = "FPPO - SENAI - DS1T ";
		String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ullamcorper dolor enim, sit amet eleifend sapien suscipit eget. Nullam in bibendum arcu. In non leo non risus dapibus mollis et vitae tortor. Aliquam fermentum lacus maximus dui auctor ultrices. Sed sed ipsum mauris. Proin nisi enim, pretium vitae ipsum at, imperdiet vestibulum magna. Praesent in massa mauris. Phasellus mattis ex ut diam semper iaculis. Quisque tortor nunc, fermentum quis mattis et, feugiat eu sapien. Nam eu cursus elit. Aenean porta ex turpis, eget porttitor justo interdum at. Vivamus purus odio, ultricies non purus luctus, suscipit dapibus nisl. Nullam lacinia, ex nec elementum ultrices, est risus pretium orci, at scelerisque ex augue vel sapien. Donec nibh lorem, vehicula lacinia imperdiet ut, ullamcorper hendrerit augue. Donec vulputate eleifend dapibus. Proin aliquam nisl sed leo pharetra, sed aliquet sem dapibus.\r\n"
				+ "\r\n"
				+ "Sed lobortis eu turpis egestas blandit. Aenean at arcu ac sapien blandit cursus. In molestie nisl id lacus dapibus, a semper lectus vestibulum. Praesent facilisis, leo eget fermentum dapibus, mauris sem interdum quam, et maximus magna lacus eu ex. Pellentesque elementum euismod augue. Ut tincidunt nibh vel mi porttitor, eget rhoncus lacus ultrices. Duis eros erat, suscipit in commodo ac, efficitur id felis. Integer sodales turpis libero, vel feugiat libero interdum posuere. Cras ut tellus id turpis semper faucibus. Nullam sit amet accumsan erat. Maecenas lorem orci, gravida vitae ex nec, consectetur euismod turpis. Mauris tempor sed nulla at posuere. Pellentesque velit sapien, hendrerit ac placerat eget, lobortis ac lacus.\r\n"
				+ "\r\n"
				+ "Sed fermentum eleifend est, sit amet tincidunt orci hendrerit nec. Curabitur egestas arcu quis condimentum congue. Aenean diam dolor, tristique sit amet eros sit amet, vulputate condimentum nisl. Curabitur ullamcorper at urna sit amet malesuada. Sed semper mattis ligula, eget semper magna semper sit amet. Suspendisse sagittis libero velit, ac gravida tortor efficitur in. Suspendisse et lacus eget augue tincidunt dapibus at quis elit.";
		
		Arquivo objArquivo = new Arquivo();
		
		String conteudoArquivo = objArquivo.ler(caminho);
		conteudoArquivo += "\n" + lorem;
		
		objArquivo.escrever(caminho, conteudoArquivo);
		
		System.out.println(conteudoArquivo);
		
	}

}
