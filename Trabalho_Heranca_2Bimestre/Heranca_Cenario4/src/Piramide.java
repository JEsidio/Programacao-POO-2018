public class Piramide extends SolidoGeometrico{
    private double areaBase;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;
    private double comprimento;
    private double largura;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nÁrea da Base: " + areaBase +
                "\nAltura: " + altura +
                "\nVolume: " + ((double) Math.round(calcularVolume() * 100) / 100) + " unidades cúbicas";
    }


//GETTERS AND SETTERS
    public double getAreaBase() {
        return areaBase;
    }
    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public double getLado3() {
        return lado3;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }


//BOOLEANS FORMATO DA BASE COM VARIÁVEIS DEFINIDAS PREVIAMENTE
    public boolean isBaseEquilatero(){
        if ((this.lado1 == this.lado2) && (this.lado2 == this.lado3)){
            return true;
        }else {
            return false;
        }
    }
    public boolean isBaseEscaleno(){
        if ((this.lado1 != this.lado2) && (this.lado2 != this.lado3) && (this.lado3 != this.lado1)) {
            return true;
        }else{
            return false;
        }
    }
    public boolean isBaseIsosceles(){
        if ((this.lado1 == this.lado2) && (this.lado2 != this.lado3)){
            return true;
        }else if ((this.lado1 != this.lado2) && (this.lado2 == this.lado3)){
            return true;
        }else if ((this.lado1 == this.lado3) && (this.lado3 != this.lado2)){
            return true;
        }else {
            return false;
        }
    }


//BOOLEANS FORMATO DA BASE COM VARIÁVEIS PASSADAS POR PARAMETRO
    public boolean isBaseEquilatero(double lado1, double lado2, double lado3){
        if ((lado1 == lado2) && (lado2 == lado3)){
            return true;
        }else {
            return false;
        }
    }
    public boolean isBaseEscaleno(double lado1, double lado2, double lado3){
        if ((lado1 != lado2) && (lado2 != lado3) && (lado3 != lado1)) {
            return true;
        }else{
            return false;
        }
    }
    public boolean isBaseIsosceles(double lado1, double lado2, double lado3){
        if ((lado1 == lado2) && (lado2 != lado3)){
            return true;
        }else if ((lado1 != lado2) && (lado2 == lado3)){
            return true;
        }else if ((lado1 == lado3) && (lado3 != lado2)){
            return true;
        }else {
            return false;
        }
    }


//CALCULO DO VOLUME SIMPLES COM DUAS VARIAVEIS PREVIAMENTE DEFINIDAS
    public double calcularVolume(){
        return (this.areaBase * this.altura) / 3;
    }


//CALCULO DO VOLUME SIMPLES COM DUAS VARIAVEIS POR PARAMETRO
    public double calcularVolume(double altura, double areaBase){
        return (areaBase * altura) / 3;
    }


//CALCULO DO VOLUME COM BASE TRIANGULAR USANDO OS LADOS PREVIAMENTE DEFINIDOS
    public double calcularVolumeBaseTriangular(){
        double perimetro = this.lado1 + this.lado2 + this.lado3;
        double semiPerimetro = perimetro/2;
        double areaBase = Math.sqrt(semiPerimetro*(semiPerimetro-this.lado1)*(semiPerimetro-this.lado2)*(semiPerimetro-this.lado3));

        return (areaBase * this.altura) / 3;
    }


//CALCULO DO VOLUME COM BASE TRIANGULAR USANDO OS LADOS PASSADOS POR PARAMETRO
    public double calcularVolumeBaseTriangular(double lado1, double lado2, double lado3, double altura){
        double perimetro = lado1 + lado2 + lado3;
        double semiPerimetro = perimetro/2;
        double areaBase = Math.sqrt(semiPerimetro*(semiPerimetro-lado1)*(semiPerimetro-lado2)*(semiPerimetro-lado3));

        return (areaBase * altura) / 3;
    }


//CALCULO DO VOLUME COM BASE QUADRANGULAR USANDO OS LADOS PREVIAMENTE DEFINIDOS
    public double calcularVolumeBaseQuadrangular(){
        double areaBase = (this.comprimento * this.largura);

        return (areaBase * this.altura) / 3;
    }


//CALCULO DO VOLUME COM BASE QUADRANGULAR USANDO OS LADOS PASSADOS POR PARAMETRO
    public double calcularVolumeBaseQuadrangular(double comprimento, double largura, double altura){
        double areaBase = (comprimento * largura);

        return (areaBase * altura) / 3;
    }
}
