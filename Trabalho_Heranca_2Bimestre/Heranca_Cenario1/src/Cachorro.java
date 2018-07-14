public class Cachorro extends Animal {
    private double intensidadeDoLatido;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nIntesidade do Latido: " + intensidadeDoLatido + " decibéis" +
                "\nLatir: " + latir() +
                "\nCorrer atrás do rabo: " + correrAtrasDoRabo() +
                "\nFingir de morto: " + fingirDeMorto();
    }


//AÇÕES
    public String latir(){
        return "Latiu";
    }
    public String correrAtrasDoRabo(){
        return "Correu atrás do rabo";
    }
    public String fingirDeMorto(){
        return "Fingiu de morto";
    }


//GETTERS AND SETTER
    public double getIntensidadeDoLatido() {
        return intensidadeDoLatido;
    }
    public void setIntensidadeDoLatido(double intensidadeDoLatido) {
        this.intensidadeDoLatido = intensidadeDoLatido;
    }
}
