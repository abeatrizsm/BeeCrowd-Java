import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
     Scanner prompt = new Scanner(System.in);
     int cod1 = prompt.nextInt();
     int num1 = prompt.nextInt();
     double val1 = prompt.nextDouble();
     
     int cod2 = prompt.nextInt();
     int num2 = prompt.nextInt();
     double val2 = prompt.nextDouble();

     double preco = (num1 * val1) + (num2 *val2);

     System.out.printf("VALOR A PAGAR: R$ %.2f\n", preco);
     prompt.close();
     
    }
}