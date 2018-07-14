public class Cliente extends Pessoa {
    private String razaoSocial;
    private String nomeFantasia;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nRazão Social: " + razaoSocial +
                "\nNome Fantasia: " + nomeFantasia;
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
}
