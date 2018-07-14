public class Funcionario extends Pessoa {
    private long numeroRegistro;
    private long numeroCarteiraTrabalho;
    private String serieCarteiraTrabalho;
    private String departamento;
    private String cargo;
    private double salario;
    private String turno;

//IMPRESSÃO DOS ATRIBUTOS
    public String imprimir(){
        return super.imprimir() +
                "\nNúmero do Registro: " + numeroRegistro +
                "\nNúmero da Carteira de Trabalho: " + numeroCarteiraTrabalho +
                "\nSérie da Carteira de Trabalho: " + serieCarteiraTrabalho +
                "\nDepartamento: " + departamento +
                "\nCargo: " + cargo +
                "\nSalário: " + salario +
                "\nTurno: " + turno;
    }


//GETTERS AND SETTERS
    public long getNumeroRegistro() {
        return numeroRegistro;
    }
    public void setNumeroRegistro(long numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    public long getNumeroCarteiraTrabalho() {
        return numeroCarteiraTrabalho;
    }
    public void setNumeroCarteiraTrabalho(long numeroCarteiraTrabalho) {
        this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
    }
    public String getSerieCarteiraTrabalho() {
        return serieCarteiraTrabalho;
    }
    public void setSerieCarteiraTrabalho(String serieCarteiraTrabalho) {
        this.serieCarteiraTrabalho = serieCarteiraTrabalho;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
}
