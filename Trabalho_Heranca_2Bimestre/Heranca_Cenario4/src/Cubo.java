public class Cubo extends SolidoGeometrico{
    private double aresta;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nAresta: " + aresta +
                "\nVolume: " + ((double) Math.round(calcularVolume() * 100) / 100) + " unidades cúbicas";
    }


//GETTERS AND SETTERS
    public double getAresta() {
        return aresta;
    }
    public void setAresta(double aresta) {
        this.aresta = aresta;
    }


//CALCULAR VOLUME COM VARIAVEL PREVIAMENTE DEFINIDA
    public double calcularVolume(){
        return Math.pow(this.aresta,3) ;
    }


//CALCULAR VOLUME COM VARIAVEL PASSADO POR PARAMETRO
    public double calcularVolume(double aresta){
        return Math.pow(aresta,3) ;
    }
}
