import java.io.IOException;
import java.util.Scanner;

public class Main{
  
  public static void main(String[] args) throws IOException {
      
    Scanner leitor = new Scanner (System.in);
    
    do{
      String valor = leitor.nextLine();
      valor = valor.replace(".","");
      valor = valor.replace("-","");
      String[] c = valor.split("");
      int [] cpf = new int[c.length];
      int aux1 = 0;
      int aux2 = 0;
      
      for (int i = 0; i < c.length; i++){
        cpf[i] = Integer.parseInt(String.valueOf(c[i]));
      }
      
      for (int i = 1; i <= 9; i++){
        aux1 += cpf[i-1]*i;
        aux2 += cpf[9-i]*i;
      }
      
      aux1 = aux1 % 11;
      aux2 = aux2 % 11;
      
      if (aux1 == 10){
        aux1 = 0;
      }
      
      if (aux2 == 10){
        aux2 = 0;
      }
      
      if ((aux1 == cpf[9]) && (aux2 == cpf[10])){
        System.out.println("CPF valido");
      } else {
        System.out.println("CPF invalido");
      }
    } while (leitor.hasNextLine());
  }
}