package Herança;

public class Conceito_Herança {
    public static void main (String args []){
        Classe_Filha_2 a = new Classe_Filha_2();
        Classe_Filha_3 b = new Classe_Filha_3();

        a.set_atributo_1("valor atributo 1");
        System.out.println(a.get_atributo_1());
        a.set_atributo_2("valor atributo 2");
        System.out.println(a.get_atributo_2());
        b.set_atributo_3("valor atributo 3");
        System.out.println(b.get_atributo_3());
        b.set_atributo_1("novo valor atributo 1");
        System.out.println(b.get_atributo_1());
        b.set_atributo_2("novo valor do atributo 2");
        System.out.println(b.get_atributo_2());

    }
}