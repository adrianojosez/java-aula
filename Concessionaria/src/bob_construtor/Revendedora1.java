package bob_construtor;

public class Revendedora1 {

    public static void main(String args []){

        Automovel A = new Automovel ();
        A.mostracarro();

        Automovel B = new Automovel (1977, "fiat", "argo", 3888.0);
        B.mostracarro();
    }

}