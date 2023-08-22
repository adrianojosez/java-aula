package encapsulamento_1;

public class Verifica_Encapsulamento_1 {

    public static void main(String args []){

        Acesso_Numeros chave = new Acesso_Numeros();

        chave.a = 10;
        chave.b = 20;
        // chave.c = 30; NÃO É POSSÍVEL ACESSAR VARIÁVEL PRIVATE DIRETAMENTE
        chave.setNumero("c", 30);
        chave.d = 40;
        chave.mostra_numero();
    }

}