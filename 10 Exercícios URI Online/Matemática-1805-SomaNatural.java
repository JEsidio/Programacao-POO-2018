import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        long A = leitor.nextLong();
        long B = leitor.nextLong();
        long soma = 0;
        
        for(long i=A; i<=B; i++){
          soma = soma + i;
        }
        
        System.out.printf("%d\n", soma);
    }
}