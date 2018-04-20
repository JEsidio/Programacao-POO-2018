import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int horas = leitor.nextInt();
        int velocidade = leitor.nextInt();
        int distancia = horas * velocidade;
        double litros = (double)distancia / (double)12;
        System.out.printf("%.3f\n", litros);
    }
}