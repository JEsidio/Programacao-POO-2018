public class OperadorCompras extends Funcionario {
//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nCadastrar Fornecedor: " + cadastrarFornecedor();
    }


//AÇÕES
    public String cadastrarFornecedor(){
        return "Fornecedor cadastrado";
    }
}
