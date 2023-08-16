import javax.swing.JOptionPane;

// objeto
public class Livraria {
	
	String editora;
	String autor;
	String livro;
	int quantidade;
	double preco;
	int num_edicao;

	// metodo
	public void Informa_Livros (int codigo) {

		switch(codigo){

			case 1: JOptionPane.showMessageDialog(null, "CATEGORIA ROMANCE \n" +
			"\n LIVRO: " + livro +
			"\n EDITORA: " + editora +
			"\n AUTOR:" + autor +
			"\n QUANTIDADE: " + quantidade +
			"\n PREÇO: R$ " + preco +
			"\n N° DA EDIÇÃO: " + num_edicao, "", JOptionPane.PLAIN_MESSAGE); break;

			case 2: JOptionPane.showMessageDialog(null, "CATEGORIA ESPÍRITA \n" +
			"\n LIVRO: " + livro +
			"\n EDITORA: " + editora +
			"\n AUTOR:" + autor +
			"\n QUANTIDADE: " + quantidade +
			"\n PREÇO: R$ " + preco +
			"\n N° DA EDIÇÃO: " + num_edicao, "", JOptionPane.PLAIN_MESSAGE); break;

			case 3: JOptionPane.showMessageDialog(null, "CATEGORIA INFORMÁTICA \n" +
			"\n LIVRO: " + livro +
			"\n EDITORA: " + editora +
			"\n AUTOR:" + autor +
			"\n QUANTIDADE: " + quantidade +
			"\n PREÇO: R$ " + preco +
			"\n N° DA EDIÇÃO: " + num_edicao, "", JOptionPane.PLAIN_MESSAGE); break;

			default: System.out.println("código não corresponde a nenhuma categoria de livro");
		}
	}
}
