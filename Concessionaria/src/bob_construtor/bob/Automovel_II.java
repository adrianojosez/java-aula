package bob_construtor.bob;
import java.text.*;

public class Automovel_II {
    
    private static int ano;
    String marca;
    String modelo;
    String cor;
    private static double preco;

    NumberFormat nf = NumberFormat.getNumberInstance();

    Automovel_II(int ano, String marca, double preco)

    {
        this.ano = ano;
        this.marca = marca;
        modelo = "Scort";
        cor = "preto";
        this.preco = preco;
    }

    public static double atualizaPreco(double valor) {
        return preco = ( valor * ano / 1988);
    }
    
    public void mostracarro () {
	System.out.println("\n" + "carro marca: " + "\t" + marca + "\n" +
	"modelo: " + "\t" + modelo + "\n" + "ano:" + "\t" + ano + "\n" + "cor:" +
	"\t" + cor + "\n" + "preco:" + "\t"+ nf.format (atualizaPreco(7654.77)));
	}

}
