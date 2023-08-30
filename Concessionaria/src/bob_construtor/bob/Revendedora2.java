package bob_construtor.bob;

public class Revendedora2 {
    public static void main (String args[])

    {
        Automovel_II C = new Automovel_II(2000, "ford", 5000.00);

        C.mostracarro();

        C = null;
        System.gc();
        C.mostracarro();

    }
}
