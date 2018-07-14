public class DVDFilmeSerie extends Produtos{
    private double duracao;
    private String classificacao;
    private int anoLacamento;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nDuração: " + duracao + " minutos" +
                "\nClassificação: " + classificacao +
                "\nAno de lançamento: " + anoLacamento;
    }


//GETTERS AND SETTERS
    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    public String getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    public int getAnoLacamento() {
        return anoLacamento;
    }
    public void setAnoLacamento(int anoLacamento) {
        this.anoLacamento = anoLacamento;
    }
}
