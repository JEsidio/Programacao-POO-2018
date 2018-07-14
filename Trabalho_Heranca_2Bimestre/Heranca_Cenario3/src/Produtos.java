public class Produtos {
    private long codigoProduto;
    private String tipoProduto;
    private String nomeProduto;
    private double valorProduto;
    private String marca;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return "Código do produto: " + codigoProduto +
                "\nTipo: " + tipoProduto +
                "\nNome: " + nomeProduto +
                "\nValor: R$ " + valorProduto +
                "\nMarca: " + marca;
    }


//GETTERS AND SETTERS
    public long getCodigoProduto() {
        return codigoProduto;
    }
    public void setCodigoProduto(long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
    public String getTipoProduto() {
        return tipoProduto;
    }
    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public double getValorProduto() {
        return valorProduto;
    }
    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
