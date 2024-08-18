import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
      Scanner prompt = new Scanner(System.in);
      int numero = prompt.nextInt();
      int horas = prompt.nextInt();
      float valor = prompt.nextFloat();

      float salario = valor * horas;

      System.out.println("NUMBER = " + numero);
      System.out.printf("SALARY = U$ %.2f\n", salario);
      prompt.close();

    }
}