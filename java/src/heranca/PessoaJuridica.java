package heranca;
public class PessoaJuridica extends Contribuinte {
    private String cnpj;
    private void setCNPJ(String cnpj) {
        this.cnpj = cnpj; 
    }

    public String getCnpj(){
        return (cnpj);
    }
}
