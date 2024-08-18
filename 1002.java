import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        double raio = prompt.nextDouble();
        double area = raio * raio * 3.14159;

        System.out.printf("A=%.4f\n", area);
        prompt.close();
  
    }
 
}