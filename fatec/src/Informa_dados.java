import javax.swing.JOptionPane;

public class Informa_dados {
    public static void main(String[] args) {

        Dados_Contribuinte a = new Dados_Contribuinte();

        String nome = JOptionPane.showInputDialog("Digite o nome do contribuinte:");
        String cpf = JOptionPane.showInputDialog("Digite o CPF do contribuinte:");
        String cnpj = JOptionPane.showInputDialog("Digite o CNPJ do contribuinte:");
        String cartao = JOptionPane.showInputDialog("Digite o cartão do contribuinte:");

        a.setNome(nome);
        a.setCPF(cpf);
        a.setCNPJ(cnpj);
        a.setCartao(cartao);

        System.out.println("Nome do contribuinte: " + a.getNome());
        System.out.println("CPF do contribuinte: " + a.getCPF());
        System.out.println("CNPJ do contribuinte: " + a.getCNPJ());
        System.out.println("Cartão do contribuinte: " + a.getCartao());
    }
}