public class Fornecedor extends Pessoa {
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nRazão Social: " + razaoSocial +
                "\nNome Fantasia: " + nomeFantasia +
                "\nCNPJ: " + cnpj;
    }


//GETTERS AND SETTERS
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
