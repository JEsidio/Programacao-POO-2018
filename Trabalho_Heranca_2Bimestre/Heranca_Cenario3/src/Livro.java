public class Livro extends Produtos{
    private int numeroPaginas;
    private String idioma;
    private String acabamento;
    private int edicao;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nNúmero de páginas: " + numeroPaginas +
                "\nIdioma: " + idioma +
                "\nAcabamento: " + acabamento +
                "\nEdição: " + edicao + "ª";
    }


//GETTERS AND SETTERS
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public String getIdioma() {
        return idioma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public String getAcabamento() {
        return acabamento;
    }
    public void setAcabamento(String acabamento) {
        this.acabamento = acabamento;
    }
    public int getEdicao() {
        return edicao;
    }
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
}
