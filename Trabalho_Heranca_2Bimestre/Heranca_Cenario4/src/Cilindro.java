public class Cilindro extends SolidoGeometrico{
    private double raio;
    private double altura;
    private double areaBase;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nRaio: " + raio +
                "\nAltura: " + altura +
                "\nVolume: " + ((double) Math.round(calcularVolume() * 100) / 100) + " unidades cúbicas";
    }


//GETTERS AND SETTERS
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAreaBase() {
        return areaBase;
    }
    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }


//CALCULAR VOLUME COM VARIAVEIS PREVIAMENTE DEFINIDAS
    public double calcularVolume(){
        return (this.areaBase * this.altura);
    }


//CALCULAR VOLUME COM VARIAVEIS PASSADOS POR PARAMETRO
    public double calcularVolume(double areaBase, double altura){
        return (areaBase * altura);
    }


//CALCULAR VOLUME POR RAIO COM VARIAVEIS PREVIAMENTE DEFINIDAS
    public double calcularVolumeRaio(){
        return (3.141592 * (Math.pow(this.raio,2)) * this.altura);
    }


//CALCULAR VOLUME POR RAIO OM VARIAVEIS PASSADOS POR PARAMETRO
    public double calcularVolumeRaio(double raio, double altura){
        return (3.141592 * (Math.pow(raio,2)) * altura);
    }
}
