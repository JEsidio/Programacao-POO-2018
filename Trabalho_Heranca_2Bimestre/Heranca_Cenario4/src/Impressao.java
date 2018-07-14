public class Impressao{
    public void imprimir(SolidoGeometrico[] solidos){
        System.out.println(" ----- Sólidos Geométricos ----- ");
        System.out.println("");
        for(SolidoGeometrico s : solidos) {
            System.out.println(s.imprimir());
            System.out.println("");
        }
    }
}