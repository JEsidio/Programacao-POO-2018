import java.io.IOException;
import java.util.Scanner;

public class Main{
  
  public static void main(String[] args) throws IOException {
      
    Scanner leitor = new Scanner (System.in);
    
    int N = leitor.nextInt();
    int i;
    
    for (i=0; i < N; i++){
      int dias = 0;
      double C = leitor.nextDouble();
        
        while(C>1){
          C =  C / (double)2;
          dias = dias + 1;
        }
      
      System.out.printf("%d dias\n", dias);
    }
  }
}