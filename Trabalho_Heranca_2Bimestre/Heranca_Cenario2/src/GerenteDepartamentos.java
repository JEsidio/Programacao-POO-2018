public class GerenteDepartamentos extends Funcionario {
//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nDemitir Funcionário: " + demitirFuncionario() +
                "\nContratar Funcionário: " + contratarFuncionario();
    }


//AÇÕES
    public String demitirFuncionario(){
        return "Funcionário Demitido";
    }
    public String contratarFuncionario(){
        return "Funcionário Contratado";
    }
}
