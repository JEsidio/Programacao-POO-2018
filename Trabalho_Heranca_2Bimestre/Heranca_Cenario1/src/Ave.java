public class Ave extends Animal {
    private double tamanhoDoBico;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nTamanho do Bico: " + tamanhoDoBico + " unidades de medida" +
                "\nVoar: " + voar() +
                "\nPiar: " + piar();
    }


//AÇÕES
    public String voar(){
        return "Voou";
    }
    public String piar(){
        return "Piou";
    }


//GETTERS AND SETTER
    public double getTamanhoDoBico() {
        return tamanhoDoBico;
    }
    public void setTamanhoDoBico(double tamanhoDoBico) {
        this.tamanhoDoBico = tamanhoDoBico;
    }
}
