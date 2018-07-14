public class PenDrive extends Produtos{
    private int capacidade;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nCapacidade: " + capacidade + " GB";
    }


//GETTERS AND SETTERS
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
