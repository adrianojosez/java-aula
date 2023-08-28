import javax.swing.JOptionPane;

public class Verifica_Construtor {
    public static void main(String[] args) {

        Hotel a = new Hotel();
        Hotel b = new Hotel("Nova Cidade", 220.88);
        
        System.out.println("Nome do Hotel: " + a.getnome());
        System.out.println("Preço da diária: " + a.getpreco());
        System.out.println("Nome do Hotel: " + b.getnome());
        System.out.println("Preço da diária R$: " + b.getpreco());


        

        // String nome = JOptionPane.showInputDialog("Digite o nome do contribuinte:");
        // String cpf = JOptionPane.showInputDialog("Digite o CPF do contribuinte:");
        // String cnpj = JOptionPane.showInputDialog("Digite o CNPJ do contribuinte:");
        // String cartao = JOptionPane.showInputDialog("Digite o cartão do contribuinte:");

        // a.setNome(nome);
        // a.setCPF(cpf);
        // a.setCNPJ(cnpj);
        // a.setCartao(cartao);

        // System.out.println("Nome do contribuinte: " + a.getNome());
        // System.out.println("CPF do contribuinte: " + a.getCPF());
        // System.out.println("CNPJ do contribuinte: " + a.getCNPJ());
        // System.out.println("Cartão do contribuinte: " + a.getCartao());
    }
}