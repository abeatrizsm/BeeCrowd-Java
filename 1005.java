import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
      Scanner prompt = new Scanner(System.in);
      float a = prompt.nextFloat();
      float b = prompt.nextFloat();

      double media = ((a*3.5)+(b*7.5))/11;

      System.out.printf("MEDIA = %.5f\n", media);
      prompt.close();
    }
}