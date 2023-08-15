import javax.swing.JOptionPane;
public class Resultado {
	public static void main (String [] args) {
		//variavel de instancia
		TransporteAula mt = new TransporteAula ();
		
		//atributos
		String t, tp;
		t = JOptionPane.showInputDialog("Digite o meio de transporte: ");
		tp = JOptionPane.showInputDialog("Digite o tempo gasto no meio de transporte: ");
		
		//mt.transporte = t;
		//mt.tempo = tp;
		
		mt.Retorna_transporte(t);
		mt.Retorns_tempo(tp);
		
	}
}