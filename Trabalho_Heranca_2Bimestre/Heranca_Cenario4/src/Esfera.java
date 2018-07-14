public class Esfera extends SolidoGeometrico{
    private double raio;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nRaio: " + raio +
                "\nVolume: " + ((double) Math.round(calcularVolume() * 100) / 100) + " unidades cúbicas";
    }


//GETTERS AND SETTERS
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }


//CALCULAR VOLUME COM VARIAVEL PREVIAMENTE DEFINIDA
    public double calcularVolume(){
        return (4 * 3.141592 * (Math.pow(this.raio,3)) / 3);
    }


//CALCULAR VOLUME COM VARIAVEL PASSADO POR PARAMETRO
    public double calcularVolume(double raio){
        return (4 * 3.141592 * (Math.pow(raio,3)) / 3);
    }
}
