package Herança;

public class Classe_Filha_1 extends Superclasse {

    private String atributo_2;

    Classe_Filha_1(){
        super();
        System.out.println("acesso ao método construtor da Classe Filha_1");
    }

    public void set_atributo_2(String atributo_2) {
        this.atributo_2 = atributo_2;
    }

    public String get_atributo_2() {
        return atributo_2;
    }
}