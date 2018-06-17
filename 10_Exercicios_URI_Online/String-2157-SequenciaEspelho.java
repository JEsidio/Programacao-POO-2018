import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner (System.in);
    int c = leitor.nextInt();
    
    for (int i= 0; i<c; i++){
      int b = leitor.nextInt();
      int e = leitor.nextInt();
      String modelo = "";
      
      for (int j = b; j <= e; j++){
        modelo += j;
      }
      
      String[] espelho = modelo.split("");
      
      for (int j = 0; j < espelho.length; j++){
        System.out.print(espelho[j]);
      }
      
      for (int j = espelho.length-1; j >= 0 ; j--){
        System.out.print(espelho[j]);
      }
      System.out.print("\n");
    }
  }
}