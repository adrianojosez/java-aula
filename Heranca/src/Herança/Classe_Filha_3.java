package Herança;

public class Classe_Filha_3 extends Classe_Filha_1{
    private String atributo_3;
    Classe_Filha_3(){
        super();
        System.out.println("acesso a classe filha 3");
    }

    public void set_atributo_3 (String atributo_3){
        this.atributo_3 = atributo_3;
    }

    public String get_atributo_3 (){
        return atributo_3;
    }
}
