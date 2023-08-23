package fusca;

import javax.swing.JOptionPane;

public class Concessionaria {

public static void main(String args[]) {
    //variavel de instancia
    Automovel e = new Automovel ();

String mr, md, pr, cr;
double pc;

mr=JOptionPane.showInputDialog("digite a marca: ");
e.setMarca(mr);
md=JOptionPane.showInputDialog("digite o modelo ");
e.setModelo(md);
cr=JOptionPane.showInputDialog("digite o cor ");
e.setCor(cr);
pr = JOptionPane.showInputDialog("digite o preço: ");
pc = Double.parseDouble(pr);
e.setPreco(pc);


System.out.println("Marca: " + e.getMarca());
System.out.println("Modelo: " + e.getModelo());
System.out.println("Cor: " + e.getCor());
System.out.println("Preco: " + e.getPreco());
}
}