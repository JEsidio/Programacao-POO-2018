public class Gato extends Animal {
    private double alturaDoPulo;
    private boolean peloLongo;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nAltura do Pulo: " + alturaDoPulo + " unidades de medida" +
                "\nPelo Longo?: " + peloLongo +
                "\nMiar: " + miar() +
                "\nPular: " + pular() +
                "\nBeber Leite: " + beberLeite() +
                "\nDesaparecer: " + desaparecer() +
                "\nCair de pé: " + cairDePe() +
                "\nCaçar Rato: " + cacarRato();
    }


//AÇÕES
    public String miar(){
        return "Miou";
    }
    public String pular(){
        return "Pulou";
    }
    public String beberLeite(){
        return "Bebeu leite";
    }
    public String desaparecer(){
        return "Desapareceu";
    }
    public String cairDePe(){
        return "Caiu de pé";
    }
    public String cacarRato(){
        return "Caçou rato";
    }


//GETTERS AND SETTER
    public double getAlturaDoPulo() {
        return alturaDoPulo;
    }
    public void setAlturaDoPulo(double alturaDoPulo) {
        this.alturaDoPulo = alturaDoPulo;
    }
    public boolean isPeloLongo() {
        return peloLongo;
    }
    public void setPeloLongo(boolean peloLongo) {
        this.peloLongo = peloLongo;
    }
}
