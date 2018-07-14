public class CDMusica extends Produtos{
    private int quantidadeMusicas;
    private double duracao;
    private int anoLacamento;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nQuantidade de músicas: " + quantidadeMusicas +
                "\nDuração: " + duracao + " minutos" +
                "\nAno de lançamento: " + anoLacamento;
    }


//GETTERS AND SETTERS
    public int getQuantidadeMusicas() {
        return quantidadeMusicas;
    }
    public void setQuantidadeMusicas(int quantidadeMusicas) {
        this.quantidadeMusicas = quantidadeMusicas;
    }
    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    public int getAnoLacamento() {
        return anoLacamento;
    }
    public void setAnoLacamento(int anoLacamento) {
        this.anoLacamento = anoLacamento;
    }
}
