public class JogoEletronico extends Produtos{
    private String plataforma;
    private String classificacao;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nPlataforma: " + plataforma +
                "\nClassificação: " + classificacao;
    }


//GETTERS AND SETTERS
    public String getPlataforma() {
        return plataforma;
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public String getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
