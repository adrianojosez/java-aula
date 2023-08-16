import javax.swing.JOptionPane;
public class Atendimento_Livraria {
	public static void main (String [] args) {
		//variavel de instancia
		Livraria cultura = new Livraria();
		
		//atributos
		String a, b, c, d, e, i, j;
		int f, g, k;
		double h;

		JOptionPane.showMessageDialog(null, "Categoria: digite 1 para romance \n 2 para Espírita \n 3 para Informática");

		a = JOptionPane.showInputDialog("Código:");
		b = JOptionPane.showInputDialog("Editora:");
		c = JOptionPane.showInputDialog("Autor:");
		d = JOptionPane.showInputDialog("Livro:");
		e = JOptionPane.showInputDialog("Quantidade:");
		i = JOptionPane.showInputDialog("Preço:");
		j = JOptionPane.showInputDialog("N° da edição:");

		f = Integer.parseInt(a);
		g = Integer.parseInt(e);
		h = Double.parseDouble(i);
		k = Integer.parseInt(j);
		
			cultura.editora = b;
			cultura.autor = c;
			cultura.livro = d;
			cultura.quantidade = g;
			cultura.preco = h;
			cultura.num_edicao = k;
		
			cultura.Informa_Livros(f);
	}
}