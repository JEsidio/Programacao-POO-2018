public class Pessoa {
    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private int rg;
    private String cpf;
    private String endereco;
    private String sexo;
    private String email;
    private String telefone;
    private boolean pessoaFisica;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return "Nome: " + nome +
                "\nSobrenome: " + sobrenome +
                "\nData de Nascimento: " + dataNascimento +
                "\nRG: " + rg +
                "\nCPF: " + cpf +
                "\nEndereço: " + endereco +
                "\nSexo: " + sexo +
                "\nE-mail: " + email +
                "\nTelefone: " + telefone +
                "\nPessoa Física?: " + pessoaFisica;
    }


//GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public int getRg() {
        return rg;
    }
    public void setRg(int rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public boolean isPessoaFisica() {
        return pessoaFisica;
    }
    public void setPessoaFisica(boolean pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }
}
