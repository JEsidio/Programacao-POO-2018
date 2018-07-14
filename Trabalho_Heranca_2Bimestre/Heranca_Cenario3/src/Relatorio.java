public class Relatorio {
    public void relatorio(Produtos[] produtos){
        System.out.println(" ----- Relatório de Produtos ----- ");
        System.out.println("");
        for(Produtos p : produtos){
        //IMPRESSÃO DO ARRAY COM PRODUTOS
            System.out.println(p.imprimir());
            System.out.println("");
        }
    }
}
