package heranca;
public class UsaFuncionario {
    public static void main(String args[]){
        Funcionario funcionario=new Funcionario();
        funcionario.setNome("Juliana Matheus");
        funcionario.setRG("25.444.778-x");
        funcionario.setCartao("MGH329");
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getRG());
        System.out.println(funcionario.getCartao());
    }
}