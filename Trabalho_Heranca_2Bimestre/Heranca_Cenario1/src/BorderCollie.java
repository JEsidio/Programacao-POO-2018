public class BorderCollie extends Cachorro {
//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nPastorear: " + pastorear();
    }

//AÇÕES
    public String pastorear(){
        return "Pastoreou";
    }
}
