import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int distancia = leitor.nextInt();
        int tempo = distancia * 2;
        System.out.printf("%d minutos\n", tempo);
    }
}