public class BeijaFlor extends Ave {
//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nVoar parado: " + voarParado();
    }


//AÇÕES
    public String voarParado(){
        return "Voou parado";
    }
}
