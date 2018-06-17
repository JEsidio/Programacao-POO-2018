import java.io.IOException;
import java.util.Scanner;

public class Main{
  
  public static void main(String[] args) throws IOException {
      
    Scanner leitor = new Scanner (System.in);
    String l;
    int H1, M1, H2, M2, minutos;
    String[] P;
    
    while (!(l = leitor.nextLine()).equals("0 0 0 0")) {
      minutos = 0;
      P = l.split(" ");
      H1 = Integer.parseInt(P[0]);
      M1 = Integer.parseInt(P[1]);
      H2 = Integer.parseInt(P[2]);
      M2 = Integer.parseInt(P[3]);
      
      if (M1 > M2) {
        minutos = 60 - M1 + M2;
        H1++;
      } else {
        minutos = M2 - M1;
      }
      
      minutos += (((H2 - H1) % 24 + 24) % 24) * 60;
      System.out.println(minutos);
    }
    System.out.close();
  }
}