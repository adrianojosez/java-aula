package bob_construtor;

public class Automovel {

    private int ano;
    public String marca;
    private String modelo;
    protected static String cor;
    private double preco;
    
    Automovel () {}

    Automovel (int ano, String modelo, String marca, double preco) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    static {
        cor = "verde";
    }



public void mostracarro () {
	System.out.println("\n" + "carro marca: " + "\t" + marca + "\n" +
	"modelo: " + "\t" + modelo + "\n" + "ano:" + "\t" + ano + "\n" + "cor:" +
	"\t" + cor + "\n" + "preco:" + "\t"+ preco);
	}

}