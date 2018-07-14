public class SolidoGeometrico {
    private String nome;
    private String cor;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return "Nome: " + nome +
                "\nCor: " + cor;
    }


//GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }


//CALCULAR VOLUME
    public double calcularVolume(){
        return -1;
    }
}
