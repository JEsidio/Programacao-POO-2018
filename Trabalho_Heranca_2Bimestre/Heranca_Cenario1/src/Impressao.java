public class Impressao{
    public void imprimir(Animal[] animais){
        System.out.println(" ----- Animais ----- ");
        System.out.println("");
        for(Animal a : animais) {
            System.out.println(a.imprimir());
            System.out.println("");
        }
    }
}