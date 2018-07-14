public class Animal {
    private String nome;
    private String raca;
    private double preco;
    private double expectativaDeVida;
    private String sexo;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return "Nome: " + nome +
                "\nRaça: " + raca +
                "\nPreço: R$ " + preco +
                "\nExpectativa de Vida: " + expectativaDeVida + " anos" +
                "\nSexo: " + sexo +
                "\nComer: " + comer() +
                "\nDormir: " + dormir();
    }


//AÇÕES
    public String comer(){
        return "Comeu";
    }
    public String dormir(){
        return "Dormiu";
    }


//GETTERS AND SETTER
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getExpectativaDeVida() {
        return expectativaDeVida;
    }
    public void setExpectativaDeVida(double expectativaDeVida) {
        this.expectativaDeVida = expectativaDeVida;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
