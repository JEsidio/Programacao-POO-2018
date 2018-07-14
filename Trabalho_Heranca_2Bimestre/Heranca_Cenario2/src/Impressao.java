public class Impressao{
    public void imprimir(Pessoa[] pessoas){
        System.out.println(" ----- Empresa ----- ");
        System.out.println("");
        for(Pessoa p : pessoas) {
            System.out.println(p.imprimir());
            System.out.println("");
        }
    }
}