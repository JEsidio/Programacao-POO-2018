public class Bigua extends Ave {
//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nMergulhar: " + mergulhar();
    }


//AÇÕES
    public String mergulhar(){
        return "Mergulhou";
    }
}
