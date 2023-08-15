package automovel:

import javax.swing.JOptionPane;

public class concessionaria {

public static void main(String args[]) {

automovel e = new automovel ();

String mr, md, pr, cr;
double pc;

mr=JOptionPane.showInputDialog("digite a marca: ");

md=JOptionPane.showInputDialog("digite o modelo ");

cr=JOptionPane.showInputDialog("digite o cor ");

pr = JOptionPane.showInputDialog("digite o preço: ");

pc = Double.parseDouble(pr);

e.marca = mr;
e.modelo = md;
e.cor = cr;
e.preco= pc;
e.Informa_Automovel ();
}
}