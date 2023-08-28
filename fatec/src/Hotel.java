public class Hotel{
    private String nome;
    private double preco;

    Hotel(){
        System.out.println("O método construtor inicializa os atributos com o valor default.");

    }

    Hotel (String nome, double preco){
    this.nome = nome;
    this.preco = preco;
}

public String getnome(){
    return  nome;
}

public double getpreco(){
    return   preco ;
}
}
