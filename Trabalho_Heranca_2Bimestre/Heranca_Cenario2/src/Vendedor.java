public class Vendedor extends Funcionario {
    private int numeroVendas;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nNúmero de Vendas: " + numeroVendas +
                "\nNovo Salário: " + novoSalario() +
                "\nCadastrar Cliente: " + cadastrarClientes();
    }


//AÇÕES
    public String cadastrarClientes(){
        return "Cliente cadastrado";
    }
    public double comissao(){
        double comissao = (numeroVendas * 5.50);
        return comissao;
    }
    public double novoSalario(){
        double novoSalario =  (getSalario() + comissao());
        return novoSalario;
    }


//GETTERS AND SETTERS
    public int getNumeroVendas() {
        return numeroVendas;
    }
    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }
}
