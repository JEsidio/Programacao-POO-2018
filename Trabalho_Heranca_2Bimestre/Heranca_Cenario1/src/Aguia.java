public class Aguia extends Ave {
    private double alcanceDaVisao;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nAlcance da Visão: " + alcanceDaVisao + " unidades de medida" +
                "\nProcurar presa: " + procurarPresa() +
                "\nCapturar presa: " + capturarPresa();
    }


//AÇÕES
    public String procurarPresa(){
        return "Procurou presa";
    }
    public String capturarPresa(){
        return "Capturou presa";
    }


//GETTERS AND SETTERS
    public double getAlcanceDaVisao() {
        return alcanceDaVisao;
    }
    public void setAlcanceDaVisao(double alcanceDaVisao) {
        this.alcanceDaVisao = alcanceDaVisao;
    }
}
