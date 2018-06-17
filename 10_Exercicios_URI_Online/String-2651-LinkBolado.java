import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        String frase = leitor.next().toLowerCase();
        
        String zelda = "zelda";

        if (frase.contains(zelda)){
          System.out.printf("Link Bolado\n");
        
        }else{
          System.out.printf("Link Tranquilo\n");
        }
        
    }
}