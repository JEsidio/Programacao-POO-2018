import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);
    String frase = "";

    do{
      frase = leitor.next();
      int inicio = 0;
      int aux = 0;
      int fim = frase.length();
      String[] array = frase.split(""); 
      
      while (inicio < fim){
          for (int i=0; i < fim; i++){
            
            for (int s=0; s < aux; s++){
              System.out.print(" ");
            }
            
            for (int j=0; j < fim; j++){
              if (j==fim-1){
                System.out.print(array[j] + "\n");
              }
              else{
                System.out.print(array[j] + " ");
              }
            }
          fim -= 1;
          aux += 1;
        }
      }
      System.out.print("\n");
    }while (leitor.hasNextLine());
  }
}