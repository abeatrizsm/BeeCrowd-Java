import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
      Scanner prompt = new Scanner(System.in);
      int a = prompt.nextInt();
      int b = prompt.nextInt();
      int c = prompt.nextInt();
      int d = prompt.nextInt();

      int diferenca = (a*b)-(c*d);

      System.out.println("DIFERENCA = " + diferenca );
      prompt.close();

    }
}